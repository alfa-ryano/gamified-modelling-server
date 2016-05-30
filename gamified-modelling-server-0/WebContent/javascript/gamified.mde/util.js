var Util = function(game) {

	this.convertModelsToJson(objects){
		
		
		return objects;
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
		xmlhttp.open(method, address, true); // xmlhttp.open(GET, index.aspx,
		var jsonString = JSON.stringify(data); // true);
		xmlhttp.send(jsonString); // xhr.send(JSON.stringify(data));
	}
}