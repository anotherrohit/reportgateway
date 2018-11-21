package com.openDJ.web.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.core.NestedRuntimeException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.openDJ.exception.ApplicationException;
import com.openDJ.pojo.FilterInfo;
import com.openDJ.pojo.FindInfo;
import com.openDJ.pojo.FilterInfo.Type;
import com.openDJ.pojo.FindInfo.SortOrder;

@Controller
public abstract class BaseController {

	private static final String COMPARISON = "comparison";
	private static final String TYPE = "type";
	private final Log logger = LogFactory.getLog(getClass());

	@Autowired
	protected ObjectMapper mapper;
	
	protected Validator formValidator = null;
	
	@InitBinder
	protected void bindValidator(WebDataBinder binder) {
		if (formValidator != null) {
			binder.setValidator(formValidator);
		}
	}

	public FindInfo getFindInfo(HttpServletRequest request) throws ServletRequestBindingException {
		FindInfo findInfo = initializeFindInfo(request);
    	String filter = ServletRequestUtils.getStringParameter(request, "filter");
    	findInfo.getFilterInfoList().addAll(getFilterInfoList(filter));
    	return findInfo;
	}
	
	// overloaded method for filtering data that doesn't have the property you are filtering on
	public FindInfo getFindInfo(HttpServletRequest request, List<FilterInfo> filterInfoList) throws ServletRequestBindingException {
    	FindInfo findInfo = initializeFindInfo(request);
    	findInfo.getFilterInfoList().addAll(filterInfoList);
    	return findInfo;
	}
	
	private FindInfo initializeFindInfo(HttpServletRequest request) throws ServletRequestBindingException {
		
		FindInfo findInfo = new FindInfo();
		
    	findInfo.setStart(ServletRequestUtils.getIntParameter(request, "start", 0));
    	findInfo.setLimit(ServletRequestUtils.getIntParameter(request, "limit", 20));
    	String sort = ServletRequestUtils.getStringParameter(request, "sort");
    	if(StringUtils.isEmpty(sort)){
    		findInfo.setOrderBy("id");	
    	} else {
    		/*convert data to domainobject*/
    		sort = sort.replaceAll("Data", "");
    		findInfo.setOrderBy(sort);
    	}
    	findInfo.setSortOrder(SortOrder.ASC);
    	
    	String dir = ServletRequestUtils.getStringParameter(request, "dir");
    	if(StringUtils.isNotEmpty(dir) &&
    			"DESC".equals(dir)){
    		findInfo.setSortOrder(SortOrder.DESC);
    	}
    	
    	return findInfo;
	}
	
	List<FilterInfo> getFilterInfoList(String fJson) {
		List<FilterInfo> list = new ArrayList<FilterInfo>();
		if (fJson == null) {
			return list;
		}
		try {
			JsonNode listNode = mapper.readTree(fJson);
			for (JsonNode itemNode : listNode) {
				JsonNode it = convertForEnums(itemNode);
				FilterInfo info = mapper.treeToValue(it, FilterInfo.class);
				if (info != null) {
					if (info.getType().equals(Type.LONG)) {
						info.setValue(new Long(info.getValue() + ""));
						System.out.println("In The Long..");
					}
					System.out.println("Type iS :- "+info.getType());
					list.add(info);
				}
			}
		} catch (Exception e) {
			logger.error("Error while reading FilterInfoList" + fJson,e);
		}
	return list;
	}

	private JsonNode convertForEnums(JsonNode j) {
		if (j.has(TYPE)) {
			((ObjectNode)j).put(TYPE, StringUtils.upperCase(j.get(TYPE).getTextValue()));
		}
		if (j.has(COMPARISON)) {
			((ObjectNode)j).put(COMPARISON, StringUtils.upperCase(j.get(COMPARISON).getTextValue()));
		}
		return j;
	}
	
	@Autowired
	@Qualifier("messageSource")
	protected MessageSource messageSource;
	
	//Returns an empty jsonMap if no errors, or a map with keys "success" and "errors" if errors present.
	protected Map<String, Object> getErrorMessages(Errors e) {
		HashMap<String, Object> jsonMap = new HashMap<String, Object>();
		HashMap<String, String> errorMap = new HashMap<String, String>();
		for (FieldError error : e.getFieldErrors()) {
			errorMap.put(error.getField(),
					messageSource.getMessage(error.getCode(), error.getArguments(), Locale.ENGLISH));
		}	
		for (ObjectError error : e.getGlobalErrors()) {
			errorMap.put("global", messageSource.getMessage(error.getCode(), error.getArguments(), Locale.ENGLISH));
		}
		if(!errorMap.isEmpty()) {
			jsonMap.put("success", false);
			jsonMap.put("errors", errorMap);
		}
		return jsonMap;
	}

	protected Map<String, Object> handleUIErrorsAndInvokeService(Errors e, FormSubmitHandler callback){
		if (e.hasErrors()) {
			return getErrorMessages(e);
		}
		try {
			callback.invokeService();
		} catch (ApplicationException applicationException) {
			return errors(applicationException);
		} catch (NestedRuntimeException nestedRuntimeException) {
			ApplicationException applicationException = new ApplicationException(nestedRuntimeException
					.getMostSpecificCause().getMessage(), nestedRuntimeException);
			return errors(applicationException);
		} catch (Exception generic) {
			ApplicationException applicationException = new ApplicationException(generic.getMessage(), generic);
			return errors(applicationException);
		}
		return success("Data Saved!");
	}
	
	protected interface FormSubmitHandler {
		public void invokeService() throws Exception;
	}

	protected Map<String, Object> errors(ApplicationException appException) {
		HashMap<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("success", false);
		String message;
		if (appException.getMessageKey() != null) {
			message = messageSource.getMessage(appException.getMessageKey(), appException.getMessageArgs(),Locale.ENGLISH);
		} else{
			message = appException.getMessage();
		}
		jsonMap.put("msg", message);
		return jsonMap;
	}
	
	protected Map<String, Object> success(String message) {
		HashMap<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("success", true);
		jsonMap.put("msg", message);
		return jsonMap;
	}
	
	
	// takes in associated businessUnits with particular giveaway
	// puts all businessunit ids and names into a list to use on edit gg page
	/*
	public static <T> ComboListItemData generateSingleComboListItemDataForGiveaway(List<BusinessUnit> businessUnits, Giveaway giveaway) throws Exception {
		List<String> businessUnitInfo = new ArrayList<String>();
		businessUnitInfo.add("code");
		for(BusinessUnit businessUnit : businessUnits) {
			businessUnitInfo.add(businessUnit.getId().toString());
			businessUnitInfo.add(businessUnit.getName());
		}
		return generateSingleComboListItemData(giveaway, "id", "name", businessUnitInfo);
	}
	*/

}
