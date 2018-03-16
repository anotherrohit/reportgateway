/**
 * Created by Bhavesh Patel
 */
package com.openDJ.view.json.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.openDJ.view.json.FaultJson;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Bhavesh Patel
 *
 */
@JsonInclude(Include.NON_NULL)
public class GetAuthenticatedUserDetailResponse {
	
	@JsonProperty("fault")
	private FaultJson fault;
	
	@JsonProperty("admin_user")
	private AdminUserJson adminUserJson;

	public FaultJson getFault() {
		return fault;
	}

	public void setFault(FaultJson fault) {
		this.fault = fault;
	}

	public AdminUserJson getAdminUserJson() {
		return adminUserJson;
	}

	public void setAdminUserJson(AdminUserJson adminUserJson) {
		this.adminUserJson = adminUserJson;
	}
	
}
