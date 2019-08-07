//var openDJ = angular.module('openDJ', [ 'ui.router', 'ncy-angular-breadcrumb', 'ngTable', 'ui-notification',  'angular-loading-bar', 'ds.objectDiff', 'ui.bootstrap', 'ngIdle' ]);
var openDJ = angular.module('openDJ', [ 'ui.router', 'ncy-angular-breadcrumb', 'ui-notification',  'angular-loading-bar', 'ui.bootstrap', 'ngIdle']);
function urlHelper(url) {
	return '/openDJ/' + url;
}
openDJ.config([ 'cfpLoadingBarProvider', function(cfpLoadingBarProvider) {
	// cfpLoadingBarProvider.includeSpinner = true;
	cfpLoadingBarProvider.spinnerTemplate = '<div id="loading-bar"><div class="spinner"><img src="/openDJ/assets/img/processing.gif" class="spinner-img"/><div><p style="margin-top:-10px">Loading...</p></div></div></div>';
} ]);
openDJ.constant('Server', {
	"loginUrl" : 'http://' + location.host + '/openDJ/',
	"url" : 'http://' + location.host + '/openDJ/services/',
	"host" : location.host
});
openDJ.constant('Var', {
	"token" : "UgCgBQABSpFcPwPJVgWvNDOgVFGhSyCbQaLQSjHhAlGiYRFqDRJs",
	"isSuperAdmin" : "GbSxLXNBHgNhIoMXKfVkBGToHAXkObSaLiEXSiDcSyEcMUJhXQGb",
	"q" : "HnApODAMYdPlNgADRnBxUEDgSTTeQsXbDpGPTfApIiBmRKJyHWKv",

	"s" : "IhXbLKPAEfTlUiJYIbKkNMBpUAKqBdVyWfCNEuLxDhWdQKCrADWi",
	"f" : "XwYyYJDUEoPgTcUPPaVhTKLqXOWeIkQkCnDEVcIhAhOgBWSqJVMy"
});

openDJ.directive('exportToCsv',function(){
  	return {
    	restrict: 'A',
    	link: function (scope, element, attrs) {
    		var el = element[0];
	        element.bind('click', function(e){
	        	var table = e.target.nextElementSibling;
	        	var csvString = '';
	        	for(var i=0; i<table.rows.length;i++){
	        		var rowData = table.rows[i].cells;
	        		for(var j=0; j<rowData.length;j++){
	        			csvString = csvString + rowData[j].innerHTML + ",";
	        		}
	        		csvString = csvString.substring(0,csvString.length - 1);
	        		csvString = csvString + "\n";
			    }
	         	csvString = csvString.substring(0, csvString.length - 1);
	         	var a = $('<a/>', {
		            style:'display:none',
		            href:'data:application/octet-stream;base64,'+btoa(csvString),
		            download:'report.csv'
		        }).appendTo('body')
		        a[0].click()
		        a.remove();
	        });
    	}
  	}
	});

openDJ.factory('_localStorage', function(Var) {
	return {
		getItem : function(key) {
			return localStorage.getItem(Var[key]);
		},
		setItem : function(key, value) {
			localStorage.setItem(Var[key], value);
		},
		removeItem : function(key) {
			localStorage.removeItem(Var[key]);
		}
	};
});

openDJ.factory('httpRequestInterceptor', function(_localStorage) {
	return {
		request : function(config) {
			config.headers['access_token'] = _localStorage.getItem("token");
			config.headers['Accept'] = 'application/json;';
			return config;
		}
	};
});
openDJ.config(function($httpProvider) {
	$httpProvider.interceptors.push('httpRequestInterceptor');

	$httpProvider.interceptors.push(function($q, Server, $injector, _localStorage) {
		return {
			'request' : function(config) {
				return config;
			},
			'response' : function(response) {
				if (response.data.fault && (response.data.fault.fault_code === 1006 || response.data.fault.fault_code === 1007)) {
					var Notification = $injector.get('Notification');
					Notification.error(response.data.fault.fault_message);
					_localStorage.removeItem("token");
					$injector.get('$state').go('root');
					$injector.get('Idle').unwatch();
					response.data = {};
				}
				return response;
			},
			'responseError' : function(rejection) {
				$injector.get('Notification').error('A System error occurred, retry or contact tech support');
				return $q.reject(rejection);
			}
		};
	});

});
openDJ.config([ "$breadcrumbProvider", function($breadcrumbProvider) {
	$breadcrumbProvider.setOptions({
		prefixStateName : 'dashboard.main',
		template : 'bootstrap3'
	});
} ]);
openDJ.config([ 'KeepaliveProvider', 'IdleProvider', function(KeepaliveProvider, IdleProvider) {
	IdleProvider.idle(60 * 10);
	IdleProvider.timeout(15);
} ]);
openDJ.run(function($rootScope, $filter, mainService, $uibModal, $state, $injector, _localStorage, Notification) {

	function closeModals() {
		if ($rootScope.warning) {
			$rootScope.warning.close();
			$rootScope.warning = null;
		}
	}

	$rootScope.$on('IdleStart', function() {
		closeModals();
		$rootScope.warning = $uibModal.open({
			templateUrl : 'warning-dialog.html',
			windowClass : 'modal-warning'
		});
	});

	$rootScope.$on('IdleTimeout', function() {
		closeModals();
		localStorage.clear();
		$state.go('root');
		$rootScope.user.username = $rootScope.user.userName;
		$rootScope.timedout = $uibModal.open({
			templateUrl : 'timedout-dialog.html',
			windowClass : 'modal-info'
		}).closed.then(function() {
			document.title = "Freshfeed";
		});
		;
	});

	$rootScope.viewImage = function(imageUrl, size, title) {
		$uibModal.open({
			animation : !0,
			template : '<div class="col-sm-12 text-center"> <div class="thumbnail"> <div class="caption text-right" style="border-bottom: 1px solid #96a1ab;"> <span class="pull-left" ng-bind="::title"></span> <button class="btn btn-xs" ng-click="close()" type="button"><span class="glyphicon glyphicon-remove"></span></button> </div> <img style="width:100%" ng-src="{{imageUrl}}" alt="{{imageUrl}}"> </div> </div>',
			size : size || 'lg',
			resolve : {
				imageUrl : function() {
					return imageUrl;
				},
				title : function() {
					return size == 'md' && !title ? 'Icon' : title;
				}
			},
			controller : [ '$scope', '$uibModalInstance', 'imageUrl', 'title', function($scope, $uibModalInstance, imageUrl, title) {
				$scope.imageUrl = imageUrl;
				$scope.title = title || 'Image';

				$scope.close = function() {
					$uibModalInstance.dismiss(false);
				};
			} ]
		});
	};

	$rootScope.getFaultMessage = function(data) {
		return $filter('faults')(data);
	};
	$rootScope.isFault = function(data) {
		return data.fault && Notification.warning(data.fault.fault_message);
	};
	$rootScope.hasError = function(form, attribute) {
		return form && attribute && form.$submitted && attribute.$invalid;
	};
	$rootScope.dateFormat = "mediumDate";
	$rootScope.dateTimeFormat = "medium";
	$rootScope.searchDelay = 800;
	$rootScope.state = $state;
	$rootScope.isSuperAdmin = _localStorage.getItem('isSuperAdmin') == 'true';
	

});
openDJ.config(function($stateProvider, $urlRouterProvider) {

	$urlRouterProvider.otherwise('/');

	$stateProvider.state('root', {
		url : '/',
		templateUrl : urlHelper('/app/pages/login.html'),
		controller : 'loginController'
	}).state('dashboard', {
		abstract : true,
		templateUrl : urlHelper('/app/pages/header.html'),
		controller : function($scope, $state, Idle, _localStorage) {
			if (!_localStorage.getItem('token')) {
				$state.go('root');
			}
			$scope.logout = function() {
				_localStorage.removeItem('token');
				_localStorage.removeItem('isSuperAdmin');
				$state.go('root');
				Idle.unwatch();
			}
		}
	}).state('dashboard.main', {
		url : '/dashboard',
		templateUrl : urlHelper('/app/pages/dashboard.html'),
		controller : 'dashboardController',
		ncyBreadcrumb : {
			label : 'Dashboard'
		}
	}).state('dashboard.ldapUser', {
		url : '/ldapUser',
		templateUrl : urlHelper('/app/pages/ldapUser.html'),
		controller : 'dashboardController',
		ncyBreadcrumb : {
			label : 'LDAP User',
			parent : 'dashboard.main'
		}
	}).state('dashboard.dataTable', {
		url : '/dataBaseTable',
		templateUrl : urlHelper('/app/pages/dataBaseTable.html'),
		controller : 'dashboardController',
		ncyBreadcrumb : {
			label : 'DataBase Table',
			parent : 'dashboard.main'
		}
	}).state('dashboard.dataHub', {
		url : '/dataHub',
		templateUrl : urlHelper('/app/pages/dataHub.html'),
		controller : 'dashboardController',
		ncyBreadcrumb : {
			label : 'Data Hub',
			parent : 'dashboard.main'
		}
	}).state('dashboard.tableData', {
		url : '/tableData/:name',
		templateUrl : urlHelper('/app/pages/tableData.html'),
		controller : 'dashboardController',
		ncyBreadcrumb : {
			label : 'Table Data',
			parent : 'dashboard.dataTable'
		}
	});
});
