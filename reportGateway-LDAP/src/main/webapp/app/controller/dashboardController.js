//openDJ.controller('dashboardController', [ '$scope', 'Notification', 'NgTableParams', '$filter', '$rootScope','$stateParams', 'dashboardService', function($scope, Notification, NgTableParams, $filter, $rootScope,$stateParams, dashboardService) {
openDJ.controller('dashboardController', [ '$scope', 'Notification', '$filter', '$rootScope','$stateParams', 'dashboardService', '$timeout','Server', function($scope, Notification,  $filter, $rootScope,$stateParams, dashboardService, $timeout,Server) {
	
	$scope.init = function() {
		$scope.getDashboardDetails();
	};
	
	$scope.getDashboardDetails = function() {

	};
	
	/*Added by vikash*/
	$scope.datasource = "database";
	$scope.submit = function () {
		var optionSelect = false;
		var attrSelected = false;
		if($scope.datasource==null || $scope.datasource==undefined)
			alert("Please select datasource");
		else
			optionSelect = true;
		
		if($scope.datasourceAttr==null || $scope.datasourceAttr==undefined)
			alert("Please select datasource attribute/s");	
		else
			attrSelected = true;
		
		if(optionSelect && attrSelected){
			dashboardService.getDataHub({option:$scope.datasource,attrs:$scope.datasourceAttr}).then(function(response) {
				$scope.ldapUserList = response.data.data;
				$scope.data = [];
				for ( var key in $scope.ldapUserList[0]) {
					$scope.data.push({
						data : key
					})
				}
				$scope.mdata = $scope.ldapUserList.map(function(x) {
					var a = [];
					for ( var k in x) {
						a.push(x[k]);
					}
					return a;
				});
			});
		}
    };
	
	$scope.getLDAPUserList = function() {
		dashboardService.getLDAPUserList({}).then(function(response) {
			
			$scope.ldapUserList = response.data.data;
			$scope.data = [];
			for(var key in $scope.ldapUserList[0]){
				$scope.data.push({data: key})
			}
			$scope.mdata = $scope.ldapUserList.map(function(x){
				var a = [];
				for(var k in x) {
					a.push(x[k]);
				}
				return a;
			});
		});
	};
	
	$scope.initLDAPUserTbl=function(){
		 		 
		 $timeout(function(){
			 var table = $('#example').DataTable({
					"data" : $scope.mdata,
					"scrollX" : true,
					buttons : [ {
						extend : 'excelHtml5',
						exportOptions : {
							columns : ':visible'
						}
					}, 'colvis' ]
				});
			 	table.buttons().container().appendTo( '#example_wrapper .col-sm-6:eq(0)' );
		 
			 	// Apply the search
			    table.columns().every( function () {
			        var that = this;	 
			        $( 'input', this.footer() ).on( 'keyup change', function () {
			            if ( that.search() !== this.value ) {
			                that.search( this.value ).draw();
			            }
			        });
			    });
		 });			
	}

	$scope.getDataTableList = function() {
		dashboardService.getDataTableList({}).then(function(response) {
				$scope.dataBaseTableList = response.data.data_base_table;		
		});
	};
	
	$scope.initDataTbl=function(){
 		$('#example tfoot th').each( function () {
	        var title = $(this).text();
	        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
	    } ); 
		 
		$timeout(function(){
			 var table = $('#example').DataTable( {
		     buttons: [{
	             extend: 'excelHtml5',
	             exportOptions: {columns: ':visible'}
	         	 },'colvis' ]
			 } ,$scope.dataBaseTableList.length);			 
			 table.buttons().container().appendTo( '#example_wrapper .col-sm-6:eq(0)' );
		 
			 // Apply the search
			 table.columns().every( function () {
		         var that = this;
		 
		         $( 'input', this.footer() ).on( 'keyup change', function () {
		            if ( that.search() !== this.value ) {
		                that.search( this.value ).draw();
		            }
		        } );
		     });
		 });		
	}

	$scope.getTableDataList = function() {
		dashboardService.getTableDataList({name : $stateParams.name}).then(function(response) {
			$scope.tableDataList = response.data.data;
		});
	};

	$scope.initTableDataTbl=function(){
 		$('#example tfoot th').each(
		function() {
			var title = $(this).text();
			$(this).html('<input type="text" placeholder="Search '+ title + '" />');
		}); 
		 
		$timeout(function(){
			 var table = $('#example').DataTable( {
		     buttons: [  {
	             extend: 'excelHtml5',
	             exportOptions: {
	                 columns: ':visible'
	             }
	         },
	         'colvis' ]
			 } ,$scope.tableDataList.length);
			 table.buttons().container().appendTo( '#example_wrapper .col-sm-6:eq(0)' );
		 
			 // Apply the search
			 table.columns().every( function () {
				 var that = this;
	 
				 $( 'input', this.footer() ).on( 'keyup change', function () {
					 if ( that.search() !== this.value ) {
						 that.search( this.value ).draw();
					 }
				 });
			 });
		});
	}
		
	$scope.init();
}]);

function showDBAttr(){
	$(".data-source-db-div").show();
	$(".data-source-ldap-div").hide();
}
function showLDAPAttr(){
	alert("Not Available");
	//$(".data-source-db-div").hide();
	//$(".data-source-ldap-div").show();
}