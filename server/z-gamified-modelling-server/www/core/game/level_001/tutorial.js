function executeTutorial(event) {
	//initialization
	if (typeof document.stopTutorial === 'undefined') {
		document.stopTutorial = false;
	}
	if (typeof document.tutorialCounter === 'undefined') {
		document.tutorialCounter = 0;
	}

	if (document.stopTutorial == true) {
		event.preventDefault();
		event.stopPropagation(); 
		document.stopTutorial = null;
		document.tutorialCounter = null;
		document.onclick = null;
		return;
	}

	document.tutorialCounter += 1;
	
	//Type your tutorial here
	if (document.tutorialCounter == 1){
		div = document.createElement("div");
		div.id = "explanation";
		div.innerHTML = "This left panel is bla bla bla bla ...!!!";
		div.style.left = "30%";
		div.style.top = "10%";
		div.style.width = "200px";
		div.style.height = "150px";
		div.style.zIndex = 100;
		div.style.position = "absolute";
		div.style.border = "thin solid black";
		document.getElementsByTagName('body')[0].appendChild(div);
	}
	else if (document.tutorialCounter == 2){
		document.getElementById("explanation").remove();
		div = document.createElement("div");
		div.id = "explanation";
		div.innerHTML = "This right panel is something something something ...!!!";
		div.style.left = "60%";
		div.style.top = "10%";
		div.style.width = "200px";
		div.style.height = "150px";
		div.style.zIndex = 101;
		div.style.position = "absolute";
		div.style.border = "thin solid black";
		document.getElementsByTagName('body')[0].appendChild(div);
	}
	else if (document.tutorialCounter == 3){
		document.getElementById("explanation").remove();
		div = document.createElement("div");
		div.id = "explanation";
		div.innerHTML = "This center panel is ...!!!";
		div.style.left = "40%";
		div.style.top = "40%";
		div.style.width = "200px";
		div.style.height = "150px";
		div.style.zIndex = 101;
		div.style.position = "absolute";
		div.style.border = "thin solid black";
		document.getElementsByTagName('body')[0].appendChild(div);
	}
	else if (document.tutorialCounter == 4){
		document.getElementById("explanation").remove();
		document.stopTutorial = true;
	}

}
