package com.openDJ.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mysql.fabric.xmlrpc.base.Fault;
import com.openDJ.pojo.DBLDAPConstant;
import com.openDJ.pojo.UserListResponse;
import com.openDJ.service.UserService;
import com.openDJ.service.UtilService;
import com.openDJ.util.Constant;
import com.openDJ.util.FaultEnum;
import com.openDJ.view.json.FaultJson;
import com.openDJ.view.json.user.DataHubRequest;
import com.openDJ.view.json.user.TableDataRequest;

@RestController
@RequestMapping("/admin/user")
public class AdminUserController {
	
	@Autowired
	private UtilService utilService;
	
	@Autowired
	private UserService userService;
	
	private final Log logger = LogFactory.getLog(getClass());
	
	/**
	 * Get Particular User Aadhaar Detail List on Admin Side
	 * @param userAadhaarDetailsRequest
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.POST, produces = Constant.JSON_CONTENT_TYPE)
	public @ResponseBody UserListResponse getUserDetailList(HttpServletRequest request)
	   
	{
		UserListResponse userListResponse;
		try 
		{
			userListResponse = userService.getUserList();
			
			/*List<Object> list = userListResponse.getUser();			
			List<Object> tempList = new ArrayList<Object>();
			
			for (int i = 0; i < 10; i++) {
				tempList.add(list.get(i));
			}
			userListResponse.setDraw("1");
			userListResponse.setFaultJson(null);
			userListResponse.setRecordsFiltered(10);
			userListResponse.setRecordsTotal(10);	
			userListResponse.setUser(tempList);*/
			return userListResponse;
		} 
		catch (Exception e) 
		{
			userListResponse = new UserListResponse();
			FaultJson faults = utilService.getFaultsObject(FaultEnum.SYSTEM_ERROR);
			userListResponse.setFaultJson(faults);
			logger.error("Error in getAuthenticated user Details() ", e);
			e.printStackTrace();
			return userListResponse;
		}
	}	
	
	@RequestMapping(value = "/getlist/{index}/{pageLength}",produces = Constant.JSON_CONTENT_TYPE)
	public @ResponseBody UserListResponse getUserDetailListForPagination(HttpServletRequest request,
			@PathVariable("index") int index,
			@PathVariable("pageLength")  int pageLength) 
	{
		
		
		UserListResponse userListResponse = new UserListResponse();
		try 
		{
			List<Object> list = UserService.getAllUserList();
			List<Object> tempList = new ArrayList<Object>();
			logger.info("list size :"+list.size());
			
			for (int i = index-1; i < index+pageLength-1 && i < list.size(); i++) {
				tempList.add(list.get(i));
			}
			logger.info("tempList size :"+tempList.size());
			userListResponse.setDraw("1");
			userListResponse.setFaultJson(null);
			userListResponse.setRecordsFiltered(pageLength);
			userListResponse.setRecordsTotal(pageLength);			
			userListResponse.setUser(tempList);
			
			return userListResponse;
		} 
		catch (Exception e) 
		{
			userListResponse = new UserListResponse();
			FaultJson faults = utilService.getFaultsObject(FaultEnum.SYSTEM_ERROR);
			userListResponse.setFaultJson(faults);
			logger.error("Error in getAuthenticated user Details() ", e);
			e.printStackTrace();
			return userListResponse;
		}
	}	
	
	@RequestMapping(value = "/datahub", method = RequestMethod.POST, produces = Constant.JSON_CONTENT_TYPE)	
	public @ResponseBody UserListResponse getUserDataHub(@RequestBody DataHubRequest dataHubRequest){
		logger.info("=== datahub START ===");
		UserListResponse userListResponse =  new UserListResponse();;
		String arrayAttributes[] = dataHubRequest.getAttrs();
		String userAttributes = "";
		for (String attr : arrayAttributes) {
			userAttributes = userAttributes+","+attr;
		}
		userAttributes = userAttributes.replaceFirst(",", "");
		logger.info("selected user attributes "+userAttributes);
		
		List<Map> userDetailsListFromDB = null;
		List<Object> allRecord = new LinkedList<Object>();
		try {
			userDetailsListFromDB = userService.getUserFromDB(userAttributes, arrayAttributes);
			for (int i = 0; i < userDetailsListFromDB.size(); i++) {
				Map<String,String> mapUserRecords = (Map<String, String>) userDetailsListFromDB.get(i);
				String MIIS_ID = mapUserRecords.get("MIIS_ID");
				logger.info("MIIS_ID ::"+MIIS_ID);
				List<Object> list = userService.getUserListFor(MIIS_ID,mapUserRecords,arrayAttributes);
				allRecord.addAll(list);
			}
			
			userListResponse.setUser(allRecord);
			logger.info("=== datahub END ===");
			return userListResponse;			
		} catch (Exception e) {
			userListResponse = new UserListResponse();
			FaultJson faults = utilService.getFaultsObject(FaultEnum.SYSTEM_ERROR);
			userListResponse.setFaultJson(faults);
			logger.error("Error in getAuthenticated user Details() ", e);
			e.printStackTrace();
			return userListResponse;
		}		
	}
}
