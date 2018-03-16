package com.openDJ.view.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value=Include.NON_NULL)
public class FaultsJson 
{	
	private List<FaultJson> fault;

	public List<FaultJson> getFault() {
		return fault;
	}

	public void setFault(List<FaultJson> fault) {
		this.fault = fault;
	}
	
}
