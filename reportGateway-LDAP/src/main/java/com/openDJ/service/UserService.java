package com.openDJ.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openDJ.pojo.UserListResponse;

@Service
public class UserService {
	private final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private UserRepositoryImpl userRepositoryImpl;
	
	@Autowired
	private UtilService utilService;
	
	public UserListResponse getUserList() throws Exception 
	{
		logger.info("/services/admin/user/getUserList json request :: ");
		UserListResponse userListResponse = new UserListResponse();
		
		
		List<Object> object= userRepositoryImpl.getAllUsers();
		
		userListResponse.setUser(object);
		//logger.info("/services/admin/user/getUserList json response :: " + new JSONObject(userListResponse).toString());
		
		return userListResponse;
	}
	
}
