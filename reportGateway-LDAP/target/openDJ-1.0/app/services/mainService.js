openDJ.service('mainService', function($http, Server) {
	this.checkAuthentication = function(data) {
		return $http.post(Server.loginUrl + "/user/login", data);
	};
	
});