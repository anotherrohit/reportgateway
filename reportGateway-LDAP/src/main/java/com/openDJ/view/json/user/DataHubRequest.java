package com.openDJ.view.json.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
/*
 * AUTHOR::VIKASH
 */
@JsonInclude(Include.NON_NULL)
public class DataHubRequest {
	
	@JsonProperty("option")
	private String option;
	
	@JsonProperty("attrs")
	private String[] attrs;
	

	public String getOption()
	{
		return option;
	}

	public void setOption(String option)
	{
		this.option = option;
	}

	public String[] getAttrs() {
		return attrs;
	}

	public void setAttrs(String[] attrs) {
		this.attrs = attrs;
	}
}