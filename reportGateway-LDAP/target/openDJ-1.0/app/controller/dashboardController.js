//openDJ.controller('dashboardController', [ '$scope', 'Notification', 'NgTableParams', '$filter', '$rootScope','$stateParams', 'dashboardService', function($scope, Notification, NgTableParams, $filter, $rootScope,$stateParams, dashboardService) {
openDJ.controller('dashboardController', [ '$scope', 'Notification', '$filter', '$rootScope','$stateParams', 'dashboardService', '$timeout','Server', function($scope, Notification,  $filter, $rootScope,$stateParams, dashboardService, $timeout,Server) {
	
	
	
	$scope.init = function() {
		$scope.getDashboardDetails();
	};
	$scope.getDashboardDetails = function() {

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
					 var table = $('#example').DataTable( {
						
						"data": $scope.mdata,
						 "scrollX": true,
				     buttons: [  {
			             extend: 'excelHtml5',
			             exportOptions: {
			                 columns: ':visible'
			             }
			         },
			         'colvis' ]
			     } );
				table.buttons().container()
			         .appendTo( '#example_wrapper .col-sm-6:eq(0)' );
				 
				 // Apply the search
				    table.columns().every( function () {
				        var that = this;
				 
				        $( 'input', this.footer() ).on( 'keyup change', function () {
				            if ( that.search() !== this.value ) {
				                that
				                    .search( this.value )
				                    .draw();
				            }
				        } );
				    } );
				 });
					 
				
}
//	$scope.ldapUserList = [];
//	$scope.userListTable = new NgTableParams({
//		page : 1,
//		count : 10,
//	}, {
//		counts : [],
//		getData : function($defer, params) {
//
//			if (params.orderBy() && params.orderBy().length) {
//				var x = params.orderBy()[0]
//				$scope.ldapUserList=$filter("orderBy")($scope.ldapUserList,x)
//			}
//			data = params.filter() ? $filter('filter')($scope.ldapUserList, params.filter()) : $scope.ldapUserList;
//			params.total($scope.ldapUserList.length);
//			var c = params.page() * params.count();
//			$defer.resolve(data.slice(c-params.count(),c));
//		}
//	});
//	
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
		     buttons: [  {
	             extend: 'excelHtml5',
	             exportOptions: {
	                 columns: ':visible'
	             }
	         },
	         'colvis' ]
	     } ,$scope.dataBaseTableList.length);
		table.buttons().container()
	         .appendTo( '#example_wrapper .col-sm-6:eq(0)' );
		 
		 // Apply the search
		    table.columns().every( function () {
		        var that = this;
		 
		        $( 'input', this.footer() ).on( 'keyup change', function () {
		            if ( that.search() !== this.value ) {
		                that
		                    .search( this.value )
		                    .draw();
		            }
		        } );
		    } );
		 });
			 
		
}
	
//	$scope.dataBaseTableList=[];
//	$scope.dataBaseListTable = new NgTableParams({
//		page : 1,
//		count : 10,
//	}, {
//		counts : [],
//		getData : function($defer, params) {
//
//			if (params.orderBy() && params.orderBy().length) {
//				var x = params.orderBy()[0]
//				$scope.dataBaseTableList=$filter("orderBy")($scope.dataBaseTableList,x)
//			}
//			params.total($scope.dataBaseTableList.length);
//			var c = params.page() * params.count();
//			$defer.resolve($scope.dataBaseTableList.slice(c-params.count(),c));
//		}
//	});
//	
	$scope.getTableDataList = function() {
		dashboardService.getTableDataList({name : $stateParams.name}).then(function(response) {
			
				$scope.tableDataList = response.data.data;
		});
	};

	$scope.initTableDataTbl=function(){
 		$('#example tfoot th').each( function () {
		        var title = $(this).text();
		        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
		    } ); 
		 
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
		table.buttons().container()
	         .appendTo( '#example_wrapper .col-sm-6:eq(0)' );
		 
		 // Apply the search
		    table.columns().every( function () {
		        var that = this;
		 
		        $( 'input', this.footer() ).on( 'keyup change', function () {
		            if ( that.search() !== this.value ) {
		                that
		                    .search( this.value )
		                    .draw();
		            }
		        } );
		    } );
		 });
			 
		
}
	
	//	$scope.tableDataList=[];
//	$scope.tableDataListTable = new NgTableParams({
//		page : 1,
//		count : 10,
//	}, {
//		counts : [],
//		getData : function($defer, params) {
//
//			if (params.orderBy() && params.orderBy().length) {
//				var x = params.orderBy()[0]
//				$scope.tableDataList=$filter("orderBy")($scope.tableDataList,x)
//			}
//			params.total($scope.tableDataList.length);
//			var c = params.page() * params.count();
//			$defer.resolve($scope.tableDataList.slice(c-params.count(),c));
//		}
//	});
	
	$scope.init();
} ]);