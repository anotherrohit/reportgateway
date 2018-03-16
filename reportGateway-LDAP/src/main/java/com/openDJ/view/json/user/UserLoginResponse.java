package com.openDJ.view.json.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.openDJ.view.json.FaultJson;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class UserLoginResponse {
	
	@JsonProperty("fault")
	private FaultJson fault;
	
	@JsonProperty("access_token")
	private String accessToken;

	public FaultJson getFault()
	{
		return fault;
	}

	public void setFault(FaultJson fault)
	{
		this.fault = fault;
	}

	public String getAccessToken()
	{
		return accessToken;
	}

	public void setAccessToken(String accessToken)
	{
		this.accessToken = accessToken;
	}

}
