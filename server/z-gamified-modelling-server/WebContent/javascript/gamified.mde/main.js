// MAIN ------------------------------------
try {
	var game = new Game();
	game.mode = "DEVELOPMENT"

	// ----Set Up Level 1----------------------------------------------------
	game.levels[0] = new Level(game, "level_001",
			"Level 01 - Object Modelling: Create a Single Object");
	game.levels[0].levelCase = new Case(game, game.levels[0], "Case_01",
			"Create a button!!!");
	game.levels[0].levelCase.addDraggableItem("button");

	var objectiveLevel01 = new Objective(game, game.levels[0], "objective_01",
			"Create an object with name 'button'");

	game.levels[0].addObjective(objectiveLevel01);

	game.levels[0].initialize = function() {

		this.objects.length = 0;
		document.getElementById("Title").innerHTML = this.levelName;
		document.getElementById("Instruction").innerHTML = this.levelCase.description;

		var div = document.getElementById("DraggableItems");
		while (div.hasChildNodes()) {
			div.removeChild(div.lastChild);
		}
		for (var i = 0; i < this.levelCase.draggableItems.length; i++) {
			var draggableItem = this.levelCase.draggableItems[i];
			var newSpan = document.createElement("span");

			newSpan.className = "DraggableCaseItem";
			newSpan.id = draggableItem.identity;
			newSpan.innerHTML = draggableItem.text;
			newSpan.style.color = "#0066cc";
			// newSpan.style.backgroundColor= "#f5f5f5";
			newSpan.style.borderWidth = "thin";
			newSpan.style.borderStyle = "solid";
			newSpan.style.borderColor = "black";
			newSpan.style.paddingLeft = "1%";
			newSpan.style.paddingRight = "1%";
			newSpan.draggable = "true";
			newSpan.cursor = "grab";
			newSpan.style.zIndex = "9";
			newSpan.style.marginRight = "1%";
			newSpan.style.textAlign = "center";
			div.appendChild(newSpan);
		}

		$('.DraggableCaseItem').draggable({
			opacity : 0.7,
			helper : "clone",
			start : function(event, ui) {
				draggedId = $(event.target).attr('id');
			}
		});

		var ol = document.getElementById("Objective");
		ol.style.color = "#000000";
		while (ol.hasChildNodes()) {
			ol.removeChild(ol.lastChild);
		}
		for (var i = 0; i < game.levels[game.currentLevel].objectives.length; i++) {
			var li = document.createElement("li");
			li.style.color = "#000000";
			li.id = game.levels[game.currentLevel].objectives[i].objectiveName;
			var text = document
					.createTextNode(game.levels[game.currentLevel].objectives[i].description);
			li.appendChild(text);
			ol.appendChild(li);
		}
		resetTime();
		startTime("TimeValue");

	}.bind(game.levels[0]);

	// ----Set Up Level 2----------------------------------------------------
	game.levels[1] = new Level(game, "level_002",
			"Level 02 - Object Modelling: Create Two Objects");

	game.levels[1].levelCase = new Case(game, game.levels[0], "Case_01",
			"Create two buttons: <br/> button 1 and button 2 !!!");

	game.levels[1].levelCase.addDraggableItem("button 1");
	game.levels[1].levelCase.addDraggableItem("button 2");

	var objectiveLevel02_1 = new Objective(game, game.levels[1],
			"objective_01", "Create an object named 'button 1'!");
	
	game.levels[1].addObjective(objectiveLevel02_1);

	var objectiveLevel02_2 = new Objective(game, game.levels[1],
			"objective_02", "Create an object named 'button 2'!");
	
	game.levels[1].addObjective(objectiveLevel02_2);

	game.levels[1].initialize = function() {

		this.objects.length = 0;
		document.getElementById("Title").innerHTML = this.levelName;
		document.getElementById("Instruction").innerHTML = this.levelCase.description;

		var div = document.getElementById("DraggableItems");
		while (div.hasChildNodes()) {
			div.removeChild(div.lastChild);
		}
		for (var i = 0; i < this.levelCase.draggableItems.length; i++) {
			var draggableItem = this.levelCase.draggableItems[i];
			var newSpan = document.createElement("span");

			newSpan.className = "DraggableCaseItem";
			newSpan.id = draggableItem.identity;
			newSpan.innerHTML = draggableItem.text;
			newSpan.style.color = "#0066cc";
			// newSpan.style.backgroundColor= "#f5f5f5";
			newSpan.style.borderWidth = "thin";
			newSpan.style.borderStyle = "solid";
			newSpan.style.borderColor = "black";
			newSpan.style.paddingLeft = "1%";
			newSpan.style.paddingRight = "1%";
			newSpan.draggable = "true";
			newSpan.cursor = "grab";
			newSpan.style.zIndex = "9";
			newSpan.style.marginRight = "1%";
			newSpan.style.textAlign = "center";
			div.appendChild(newSpan);
		}

		$('.DraggableCaseItem').draggable({
			opacity : 0.7,
			helper : "clone",
			start : function(event, ui) {
				draggedId = $(event.target).attr('id');
			}
		});

		var ol = document.getElementById("Objective");
		ol.style.color = "#000000";
		while (ol.hasChildNodes()) {
			ol.removeChild(ol.lastChild);
		}
		for (var i = 0; i < game.levels[game.currentLevel].objectives.length; i++) {
			var li = document.createElement("li");
			li.style.color = "#000000";
			li.id = game.levels[game.currentLevel].objectives[i].objectiveName;
			var text = document
					.createTextNode(game.levels[game.currentLevel].objectives[i].description);
			li.appendChild(text);
			ol.appendChild(li);
		}
		resetTime();
		startTime("TimeValue");

	}.bind(game.levels[1]);

	// ----Set Up Level 3----------------------------------------------------
	game.levels[2] = new Level(game, "level_003",
			"Level 03 - Object Modelling: Create multiple objects");
	game.levels[2].levelCase = new Case(game, game.levels[2], "Case_03",
			"Create two buttons:<br/>" + "greet button and clear button!<br/>"
					+ "Create two labels as well:<br/>"
					+ "name label and greet label!<br/>" + "Add name textbox!");

	game.levels[2].levelCase.addDraggableItem("greet button");
	game.levels[2].levelCase.addDraggableItem("clear button");
	game.levels[2].levelCase.addDraggableItem("name label");
	game.levels[2].levelCase.addDraggableItem("greet label");
	game.levels[2].levelCase.addDraggableItem("name textbox");

	var objectiveLevel03_1 = new Objective(game, game.levels[2],
			"objective_01", "Create two button objects");
	var objectiveLevel03_2 = new Objective(game, game.levels[2],
			"objective_02", "Create two label objects");
	var objectiveLevel03_3 = new Objective(game, game.levels[2],
			"objective_03", "Create one textbox object");

	game.levels[2].addObjective(objectiveLevel03_1);
	game.levels[2].addObjective(objectiveLevel03_2);
	game.levels[2].addObjective(objectiveLevel03_3);

	game.levels[2].initialize = function() {

		this.objects.length = 0;
		document.getElementById("Title").innerHTML = this.levelName;
		document.getElementById("Instruction").innerHTML = this.levelCase.description;

		var div = document.getElementById("DraggableItems");
		while (div.hasChildNodes()) {
			div.removeChild(div.lastChild);
		}
		for (var i = 0; i < this.levelCase.draggableItems.length; i++) {
			var draggableItem = this.levelCase.draggableItems[i];
			var newSpan = document.createElement("span");

			newSpan.className = "DraggableCaseItem";
			newSpan.id = draggableItem.identity;
			newSpan.innerHTML = draggableItem.text;
			newSpan.style.color = "#0066cc";
			// newSpan.style.backgroundColor= "#f5f5f5";
			newSpan.style.borderWidth = "thin";
			newSpan.style.borderStyle = "solid";
			newSpan.style.borderColor = "black";
			newSpan.style.paddingLeft = "1%";
			newSpan.style.paddingRight = "1%";
			newSpan.draggable = "true";
			newSpan.cursor = "grab";
			newSpan.style.zIndex = "9";
			newSpan.style.marginRight = "1%";
			newSpan.style.textAlign = "center";
			div.appendChild(newSpan);
		}

		$('.DraggableCaseItem').draggable({
			opacity : 0.7,
			helper : "clone",
			start : function(event, ui) {
				draggedId = $(event.target).attr('id');
			}
		});

		var ol = document.getElementById("Objective");
		ol.style.color = "#000000";
		while (ol.hasChildNodes()) {
			ol.removeChild(ol.lastChild);
		}
		for (var i = 0; i < game.levels[game.currentLevel].objectives.length; i++) {
			var li = document.createElement("li");
			li.style.color = "#000000";
			li.id = game.levels[game.currentLevel].objectives[i].objectiveName;
			var text = document
					.createTextNode(game.levels[game.currentLevel].objectives[i].description);
			li.appendChild(text);
			ol.appendChild(li);
		}
		resetTime();
		startTime("TimeValue");

	}.bind(game.levels[2]);

	
	// ----Set Up Level 4----------------------------------------------------
	game.levels[3] = new Level(game, "level_004",
			"Level 04 - Object Modelling: Create multiple objects");
	game.levels[3].levelCase = new Case(game, game.levels[3], "Case_04",
			"If greet button is pressed then greet label will display 'Hello!'<br/>" + 
			"Create a link between objects that probably have a relationship!");

	game.levels[3].levelCase.addDraggableItem("greet button");
	game.levels[3].levelCase.addDraggableItem("clear button");
	game.levels[3].levelCase.addDraggableItem("name label");
	game.levels[3].levelCase.addDraggableItem("greet label");
	game.levels[3].levelCase.addDraggableItem("name textbox");

	var objectiveLevel04_1 = new Objective(game, game.levels[3],
			"objective_01", "Create a link between the intended objects");

	game.levels[3].addObjective(objectiveLevel04_1);

	game.levels[3].initialize = function() {

		this.objects.length = 0;
		document.getElementById("Title").innerHTML = this.levelName;
		document.getElementById("Instruction").innerHTML = this.levelCase.description;

		var div = document.getElementById("DraggableItems");
		while (div.hasChildNodes()) {
			div.removeChild(div.lastChild);
		}
		for (var i = 0; i < this.levelCase.draggableItems.length; i++) {
			var draggableItem = this.levelCase.draggableItems[i];
			var newSpan = document.createElement("span");

			newSpan.className = "DraggableCaseItem";
			newSpan.id = draggableItem.identity;
			newSpan.innerHTML = draggableItem.text;
			newSpan.style.color = "#0066cc";
			// newSpan.style.backgroundColor= "#f5f5f5";
			newSpan.style.borderWidth = "thin";
			newSpan.style.borderStyle = "solid";
			newSpan.style.borderColor = "black";
			newSpan.style.paddingLeft = "1%";
			newSpan.style.paddingRight = "1%";
			newSpan.draggable = "true";
			newSpan.cursor = "grab";
			newSpan.style.zIndex = "9";
			newSpan.style.marginRight = "1%";
			newSpan.style.textAlign = "center";
			div.appendChild(newSpan);
		}

		$('.DraggableCaseItem').draggable({
			opacity : 0.7,
			helper : "clone",
			start : function(event, ui) {
				draggedId = $(event.target).attr('id');
			}
		});

		var ol = document.getElementById("Objective");
		ol.style.color = "#000000";
		while (ol.hasChildNodes()) {
			ol.removeChild(ol.lastChild);
		}
		for (var i = 0; i < game.levels[game.currentLevel].objectives.length; i++) {
			var li = document.createElement("li");
			li.style.color = "#000000";
			li.id = game.levels[game.currentLevel].objectives[i].objectiveName;
			var text = document
					.createTextNode(game.levels[game.currentLevel].objectives[i].description);
			li.appendChild(text);
			ol.appendChild(li);
		}
		resetTime();
		startTime("TimeValue");

	}.bind(game.levels[3]);
	
	// ---Excute Game---------------------------------------------------------
	game.run();
} catch (error) {
	alert(error.message);
}
