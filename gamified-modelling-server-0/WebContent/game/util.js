//JSON.stringify(obj, function(key, value) {
//	if (typeof value === 'object') {
//		if (!seen.indexOf(value)) {
//			return '__cycle__' + (typeof value) + '[' + key + ']';
//		}
//		seen.push(value);
//	}
//	return value;
//}, 4);
//
//var json = JSON.Stringify(obj, function(key, val) {
//	if (val != null && typeof val == "object") {
//		if (seen.indexOf(val) >= 0) {
//			return;
//		}
//		seen.push(val);
//	}
//	return val;
//});

var Util = function(game) {

	this.convertModelsToJson = function(nodes, edges) {
		var model = new Object();
		model["nodes"] = nodes;
		model["edges"] = edges;
		return model;
	}

	this.jsonSubmit = function(method, address, data) {
		var xmlhttp;
		if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera,
			// Safari
			xmlhttp = new XMLHttpRequest();
		} else {// code for IE6, IE5
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				try {
					jsonString = xmlhttp.responseText;
					jsonString = JSON.parse(jsonString);
					alert(jsonString);
					// put the operation of the event in here

				} catch (err) {
					alert(err.message);
				}
			}
		}
		
		var jsonString = JSON.stringify(data);
		xmlhttp.open(method, address, true); 
		xmlhttp.send(jsonString);
	}
}