package com.openDJ.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.openDJ.pojo.UserListResponse;
import com.openDJ.service.UserService;
import com.openDJ.service.UtilService;
import com.openDJ.util.Constant;
import com.openDJ.util.FaultEnum;
import com.openDJ.view.json.FaultJson;

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
	public @ResponseBody UserListResponse getUserDetailList() 
	{
		UserListResponse userListResponse;
		try 
		{
			userListResponse = userService.getUserList();
			
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
	
}
