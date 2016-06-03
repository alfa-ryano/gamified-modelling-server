var Util = function(game) {

	this.convertModelsToJson = function(level, nodes, edges) {
		var model = new Object();
		model["level"] = level;
		model["nodes"] = nodes;
		model["edges"] = edges;
		return model;
	}

	this.jsonSubmit = function(method, address, data, response) {
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
					if (response != null){
						jsonString = xmlhttp.responseText;
						response(jsonString);
					}
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