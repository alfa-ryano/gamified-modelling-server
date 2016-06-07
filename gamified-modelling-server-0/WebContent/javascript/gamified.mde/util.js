//TIMER
var timerElementId = "";
var hour = 0;
var minute = 0;
var second = -1;
var interval;

// add zero in front of numbers < 10
function formatLeadingZero(i) {
	var result = "";
	if (i < 10) {
		result = "0" + i
	} else {
		result = "" + i;
	}
	return result;
}

function calculateTime() {
	second += 1;
	if (second == 60) {
		second = 0;
		minute += 1;
	}
	if (minute == 60) {
		minute = 0;
		hour += 1;
	}
	document.getElementById(timerElementId).innerHTML = getTime();
}

function startTime(elementId) {
	timerElementId = elementId;
	calculateTime()
	interval = setInterval(calculateTime, 1000);
}

function resetTime() {
	hour = 0;
	minute = 0;
	second = -1;
}

function stopTime() {
	clearInterval(interval);
}

function getTime() {
	return formatLeadingZero(hour) + ":" + formatLeadingZero(minute) + ":"
			+ formatLeadingZero(second);
}

// UTIL
var Util = function(game) {

	this.convertModelsToJson = function(mode, level, nodes, edges) {
		var model = new Object();
		model["mode"] = mode;
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
					if (response != null) {
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