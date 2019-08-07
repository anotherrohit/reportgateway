//openDJ.controller('dashboardController', [ '$scope', 'Notification', 'NgTableParams', '$filter', '$rootScope','$stateParams', 'dashboardService', function($scope, Notification, NgTableParams, $filter, $rootScope,$stateParams, dashboardService) {
openDJ.controller('dashboardController', [ '$scope', 'Notification', '$filter', '$rootScope','$stateParams', 'dashboardService', '$timeout','Server', function($scope, Notification,  $filter, $rootScope,$stateParams, dashboardService, $timeout,Server) {
	
	//Added by vikash
	var index = 1;
	var pageLength = 10;
	
	$scope.from = index;
	$scope.to = index+9;
	
	$scope.init = function() {
		$scope.getDashboardDetails();
		
		//Added by vikash
		if(index ==1)
			$("#prev").hide();
		else
			$("#prev").show();
	};
	
	$scope.getDashboardDetails = function() {

	};
		
	//Added by vikash	
	$scope.getPagedData = function(id){
		if(id === "prev"){
			if(index >=1)
				index = index-pageLength;
			
			if(index ==1)
				$("#prev").hide();
			else
				$("#prev").show();
			
			$scope.from = index;
			$scope.to = index+9;
		}else{
			$("#prev").show();
			index = index+pageLength;
			
			$scope.from = index;
			$scope.to = index+9;
		}
		
		dashboardService.getPagedLdapData("admin/user/getlist/"+index+"/"+pageLength).then(function(response) {
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
			$scope.initDatatable();
		});
	}
	
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
	
	$scope.new_initLDAPUserTbl=function(){
		 		 
		 $timeout(function(){
			$scope.initDatatable()
		 });			
	}
	
	$scope.initLDAPUserTbl=function(){
		 		 
		$timeout(function(){
			var table = $('#example').DataTable( {				
				"data": $scope.mdata,
				"scrollX": true,
				dom: 'Bfrtip',
				deferRender:true,
				scrollX:true,
				scrollY:450,
				scrollCollapse:true,
				scroller:true,
				buttons: [  {extend: 'excelHtml5',exportOptions: {columns: ':visible'}},'colvis' ],
				columnDefs: [{ "visible": false,  "targets": [ -1 ,-2 ,-3 ,-4 ,-5 ,-6 ,-7 ,-8 ,-9 ,-10 ,-11 ,-12 ,-13 ,-14 ,-15 ,-16 ,-17 ,-18 ,-19 ,-20 ,-21 ,-22 ,-23 ,-24 ,-25 ,-26 ,-27 ,-28 ,-29 ,-30 ,-31 ,-32 ,-33 ,-34 ,-35 ,-36 ,-37 ,-38 ,-39 ,-40 ,-41 ,-42 ,-43 ,-44 ,-45 ,-46 ,-47 ,-48 ,-49 ,-50]}]
			} );
			table.buttons().container().appendTo( '#example_wrapper .col-sm-6:eq(0)' );
		 
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

	$scope.initDatatable = function(){
		var table = $('#example').DataTable({
			bPaginate: false,
			scrollX : true,
			serverSide: true,
			ordering: true,
			searching: true,
			buttons: [  {extend: 'excelHtml5',exportOptions: {columns: ':visible'}},'colvis' ],
			ajax: function ( data, callback, settings ) {            
				setTimeout( function () {
					callback( {
						draw: data.draw,
						data: $scope.mdata,
						recordsTotal: $scope.mdata.length,
						recordsFiltered: $scope.mdata.length
						} );
					}, 50 );
				},
				scrollY: 500,
				scroller: {
				loadingIndicator: true
			},
			stateSave: true,
		})	
			
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