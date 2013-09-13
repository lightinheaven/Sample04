function validate_required(field, alertMsg) {  
    with (field) {
        if (value==null || value=="") { 
        	alert("Please fill in the '" + alertMsg + "' box."); 
            return false; 
        }
        return true;
    }
}
function validate_int(field, alertMsg) { 
	with (field) {
		var num = parseInt(value);
	   	if (isNaN(num) || num<0) {
			alert(alertMsg);
			return false;
	   	}
	   	return true;
	}
}
function validate_Form(thisForm) {  
	with (thisForm) {
		if (!validate_required(name, "Name")) {
			name.focus();
			return false;
		}
		if (!validate_required(age, "Age")) {
			age.focus();
			return false;
		}
		if (!validate_int(age, "Invalid Age")) {
			age.focus();
			return false;
		}
	}
	return true;
}