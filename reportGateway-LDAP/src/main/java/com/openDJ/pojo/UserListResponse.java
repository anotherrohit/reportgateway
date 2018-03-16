package com.openDJ.pojo;

import java.util.List;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.openDJ.view.json.FaultJson;

@JsonInclude(Include.NON_NULL)
public class UserListResponse {
	
	@JsonProperty("fault")
	private FaultJson faultJson;
	
	@JsonProperty("data")
	private List<Object> user;
	
	@JsonProperty("draw")
	private String draw;
	
	@JsonProperty("recordsTotal")
	private long recordsTotal;
	
	@JsonProperty("recordsFiltered")
	private long recordsFiltered;

	public FaultJson getFaultJson()
	{
		return faultJson;
	}

	public void setFaultJson(FaultJson faultJson)
	{
		this.faultJson = faultJson;
	}

	public List<Object> getUser()
	{
		return user;
	}

	public void setUser(List<Object> user)
	{
		this.user = user;
	}

	public String getDraw()
	{
		return "1";
	}

	public void setDraw(String draw)
	{
		this.draw = draw;
	}

	public long getRecordsTotal()
	{
		return user.isEmpty()?0:user.size();
	}

	public void setRecordsTotal(long recordsTotal)
	{
		this.recordsTotal = recordsTotal;
	}

	public long getRecordsFiltered()
	{
		return user.isEmpty()?0:user.size();
	}

	public void setRecordsFiltered(long recordsFiltered)
	{
		this.recordsFiltered = recordsFiltered;
	}
	
	
}
