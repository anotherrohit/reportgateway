package com.openDJ.validation.service;

import static com.openDJ.util.FaultEnum.PROVIDE_PASSWORD;
import static com.openDJ.util.FaultEnum.PROVIDE_USERNAME;
import static com.openDJ.util.FaultEnum.REQUEST_ERROR;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openDJ.service.UtilService;
import com.openDJ.view.json.FaultJson;
import com.openDJ.view.json.user.UserLoginRequest;
import com.openDJ.view.json.user.UserLoginResponse;

@Service
public class LoginValidationService
{
	@Autowired
	private UtilService utilService;

	@Autowired
	private ValidationService validationService;

	/**
	 * This service is use for validating login request
	 * 
	 * @param userLoginRequest
	 * @return
	 */
	public UserLoginResponse validateLoginRequest(UserLoginRequest userLoginRequest)
	{

		UserLoginResponse userLoginResponse = new UserLoginResponse();

		if (userLoginRequest == null)
		{
			FaultJson fault = utilService.getFaultsObject(REQUEST_ERROR);
			userLoginResponse.setFault(fault);
			return userLoginResponse;
		}
		if (!validationService.validateEmptyString(userLoginRequest.getUsername()))
		{
			FaultJson fault = utilService.getFaultsObject(PROVIDE_USERNAME);
			userLoginResponse.setFault(fault);
			return userLoginResponse;
		}
		else if (!validationService.validateEmptyString(userLoginRequest.getPassword()))
		{
			FaultJson fault = utilService.getFaultsObject(PROVIDE_PASSWORD);
			userLoginResponse.setFault(fault);
			return userLoginResponse;
		}
		return null;
	}
}
