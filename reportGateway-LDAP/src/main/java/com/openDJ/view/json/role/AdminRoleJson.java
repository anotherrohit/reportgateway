/**
 * Created by Bhavesh Patel
 */
package com.openDJ.view.json.role;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Bhavesh Patel
 *
 */
@JsonInclude(Include.NON_NULL)
public class AdminRoleJson {
	
	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("name")
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
