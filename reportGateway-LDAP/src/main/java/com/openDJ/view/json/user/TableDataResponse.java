package com.openDJ.view.json.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.openDJ.view.json.FaultJson;

@JsonInclude(Include.NON_NULL)
public class TableDataResponse {
	
	@JsonProperty("fault")
	private FaultJson faultJson;
	
	@JsonProperty("data")
	private List<Object> object;

	public FaultJson getFaultJson()
	{
		return faultJson;
	}

	public void setFaultJson(FaultJson faultJson)
	{
		this.faultJson = faultJson;
	}

	public List<Object> getObject()
	{
		return object;
	}

	public void setObject(List<Object> object)
	{
		this.object = object;
	}
}
