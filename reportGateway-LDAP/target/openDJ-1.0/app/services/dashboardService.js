
openDJ.service('dashboardService', function($http, Server) 
{
	this.getLDAPUserList = function(data)
	{
		return $http.post(Server.url + "admin/user/list",data);
	}
	
	this.getDataTableList = function(data)
	{
		return $http.post(Server.url + "admin/database/table/list",data);
	}
	
	this.getTableDataList = function(data)
	{
		return $http.post(Server.url + "admin/database/table/data",data);
	}
});