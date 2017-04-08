var getFieldName = function(jsonStr , fieldname) {
	
	var json= JSON.parse(jsonStr);
	
	return json[fieldname];
	
};