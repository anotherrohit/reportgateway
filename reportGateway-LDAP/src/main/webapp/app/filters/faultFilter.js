
openDJ.filter('faults', function() {
	return function(data) {
	    console.log("data-->",data);
		return data.fault.fault_message ; 
	};
});