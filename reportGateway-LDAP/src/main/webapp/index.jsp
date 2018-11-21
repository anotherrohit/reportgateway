<!DOCTYPE html>
<html ng-app="openDJ">
<head>
<title>openDJ</title>

<!-- plugins  -->

<link href="/openDJ/assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script src="/openDJ/assets/angular/angular.min.js" type="text/javascript"></script>
<script src="/openDJ/assets/angular/angular-idle.min.js" type="text/javascript"></script>
<script src="/openDJ/assets/angular/angular-ui-router.min.js" type="text/javascript"></script>
<script src="/openDJ/assets/angular/angular-breadcrumb.min.js" type="text/javascript"></script>
<!-- <link href="/openDJ/assets/angular/ng-table.min.css" rel="stylesheet" type="text/css" /> -->
<!-- <script src="/openDJ/assets/angular/ng-table.min.js" type="text/javascript"></script> -->
<link href="/openDJ/assets/angular/ui-notification.css" rel="stylesheet" type="text/css" />
<script src="/openDJ/assets/angular/angular-ui-notifications.js" type="text/javascript"></script>
<link href="/openDJ/assets/angular/loading-bar.min.css" rel="stylesheet" type="text/css" />
<script src="/openDJ/assets/angular/loading-bar.min.js" type="text/javascript"></script>
<!-- <script src="/openDJ/assets/angular/checklist-model.js" type="text/javascript"></script> -->
<!-- <link href="/openDJ/assets/angular/chosen.min.css" rel="stylesheet" type="text/css" /> -->
<!-- <script src="/openDJ/assets/angular/chosen.jquery.min.js" type="text/javascript"></script> -->
<!-- <script src="/openDJ/assets/angular/chosen.js" type="text/javascript"></script> -->
<!-- <link href="/openDJ/assets/angular/angular-Object-diff.css" rel="stylesheet" type="text/css" /> -->
<!-- <script type="text/javascript" src="/openDJ/assets/angular/angular-Object-diff.min.js"></script> -->
<script type="text/javascript" src="/openDJ/assets/angular/ui-bootstrap-tpls-2.5.0.min.js"></script>
<script type="text/javascript" src="/openDJ/assets/angular/angular-idle.min.js"></script>
<!-- <script type="text/javascript" src="/openDJ/assets/angular/ngWeekdaySelector.js"></script> -->
<!-- <link href="/openDJ/assets/angular/ngWeekdaySelector.css" rel="stylesheet" type="text/css" /> -->
<!-- datetime picker  -->
<!-- <script src="/openDJ/assets/js/datetime-picker.js" type="text/javascript"></script> -->
<!-- <script src="/openDJ/assets/js/highcharts.js" type="text/javascript"></script> -->
<!-- <script src="/openDJ/assets/js/highcharts-3d.js" type="text/javascript"></script> -->
<!-- template files  -->
<link href="/openDJ/assets/css/AdminLTE.min.css" rel="stylesheet" type="text/css" /> 
<link href="/openDJ/assets/css/skin-blue.min.css" rel="stylesheet" type="text/css" />
<link href="/openDJ/assets/iCheck/flat/blue.css" rel="stylesheet" type="text/css" />
<!-- DATA TABLES -->
    <link href="/openDJ/assets/datatables/dataTables.bootstrap.css" rel="stylesheet" type="text/css" />
<link href="/openDJ/assets/css/customCSS.css" rel="stylesheet" type="text/css" />


<!-- application's script files  -->

<script src="/openDJ/app/app.js" type="text/javascript"></script>

<!-- services -->
<script type="text/javascript" src="/openDJ/app/services/mainService.js"></script>
<script src="/openDJ/app/services/dashboardService.js" type="text/javascript">
	
</script>
<!-- filters -->
<script src="/openDJ/app/filters/faultFilter.js" type="text/javascript"></script>


<!-- controller  -->
<script type="text/javascript" src="/openDJ/app/controller/loginController.js"></script>
<script src="/openDJ/app/controller/dashboardController.js" type="text/javascript"></script>
</head>
<body style="background-color: #d2d6de;">
	<div class="skin-blue">
		<div ui-view></div>
	</div>
</body>


<script type="text/ng-template" id="warning-dialog.html">
  <div class="modal-header">
   <h3>You're Idle. Do Something!</h3>
  </div>
  <div idle-countdown="countdown" class="modal-body">
   <uib-progressbar max="::countdown" value="countdown" animate="true" class="progress-striped active">You'll be logged out in {{countdown}} second(s).</uib-progressbar>
  </div>

</script>
<script type="text/ng-template" id="timedout-dialog.html">
  <div class="modal-header">
   <h3>You were idle too long</h3>
  </div>
  <div class="modal-body">
   <p>
      Please login again.
   </p>
 </div>
</script>

 <!-- jQuery 2.1.3 -->
    <script src="/openDJ/assets/jQuery/jQuery-2.1.3.min.js" type="text/javascript"></script>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script> -->
    <!-- jQuery UI 1.11.2 -->
     <script src="/openDJ/assets/jQuery/jquery-ui.min.js" type="text/javascript"></script>
    
   <!-- Rohit <script src="http://code.jquery.com/ui/1.11.2/jquery-ui.min.js" type="text/javascript"></script> -->
    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
    <!-- Bootstrap 3.3.2 JS -->
    <script src="/openDJ/assets/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>    
    <!-- Morris.js charts -->
     <script src="/openDJ/assets/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
    
    <!--Rohit <script src="http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script> -->
    <!-- iCheck -->
    <script src="/openDJ/assets/iCheck/icheck.min.js" type="text/javascript"></script>

<!-- DATA TABES SCRIPT -->
    <script src="/openDJ/assets/jQuery/jquery-1.12.4.js" type="text/javascript"></script>
    
   <!--Rohit <script src="//code.jquery.com/jquery-1.12.4.js" type="text/javascript"></script> -->
<script src="/openDJ/assets/datatables/jquery.dataTables.min.js" type="text/javascript"></script> 

!--Rohit <script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js" type="text/javascript"></script> -->
<script src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap.min.js" type="text/javascript"></script>
<script src="https://cdn.datatables.net/buttons/1.4.2/js/dataTables.buttons.min.js" type="text/javascript"></script>
<script src="https://cdn.datatables.net/buttons/1.4.2/js/buttons.bootstrap.min.js" type="text/javascript"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js" type="text/javascript"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.32/pdfmake.min.js" type="text/javascript"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.32/vfs_fonts.js" type="text/javascript"></script>
<script src="//cdn.datatables.net/buttons/1.4.2/js/buttons.html5.min.js" type="text/javascript"></script>
<script src="//cdn.datatables.net/buttons/1.4.2/js/buttons.print.min.js" type="text/javascript"></script>
<script src="//cdn.datatables.net/buttons/1.4.2/js/buttons.colVis.min.js" type="text/javascript"></script>
    
</html>
