package com.openDJ.view.json.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.openDJ.view.json.DatabaseTableJson;
import com.openDJ.view.json.FaultJson;

@JsonInclude(Include.NON_NULL)
public class DataTableListResponse {
	
	@JsonProperty("fault")
	private FaultJson faultJson;
	
	@JsonProperty("data_base_table")
	private List<DatabaseTableJson> databaseTableJsons;

	public FaultJson getFaultJson()
	{
		return faultJson;
	}

	public void setFaultJson(FaultJson faultJson)
	{
		this.faultJson = faultJson;
	}

	public List<DatabaseTableJson> getDatabaseTableJsons()
	{
		return databaseTableJsons;
	}

	public void setDatabaseTableJsons(List<DatabaseTableJson> databaseTableJsons)
	{
		this.databaseTableJsons = databaseTableJsons;
	}
}
