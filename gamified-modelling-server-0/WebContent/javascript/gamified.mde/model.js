//-- MODEL  ----------------------------------------------------------------------------------
var draggedId = null;

var inheritsFrom = function(child, parent) {
	child.prototype = Object.create(parent.prototype);
};

var ModelObject = function(objectName, identity) {
	this.identity = identity;
	this.objectName = objectName;
}

var Objective = function(game, level, objectiveName, description) {
	this.objectiveName = objectiveName;
	this.level = level;
	this.game = game;
	this.description = description;
}

var DraggableItem = function (levelCase, identity, text) {
	this.identity = identity;
    this.levelCase = levelCase;
    this.text = text;
}

var Case = function (game, level, name, description) {
    this.level = level;
    this.game = game;
    this. description = description;
    this.draggableItems = new Array();
    
    this.addDraggableItem = function(text){
    	var identity = "DraggableCaseItem_" + (this.draggableItems.length + 1);
    	var draggableItem = new DraggableItem(this, identity, text);
        this.draggableItems.push(draggableItem);
        return draggableItem;
    };
}

var Level = function(game, levelId, levelName) {
	this.levelId = levelId;
	this.levelName = levelName;
    this.game = game;
    this.objectives = new Array();
    this.objects = new Array();
    this.levelCase = null;

	this.points = 0;
	this.timeElapsed = "00:00:00";
	
	this.initialize = function() {
	}

	this.addObject = function(objectName, identity) {
		var modelObject = new ModelObject(objectName, identity);
		this.objects.push(modelObject);
		return modelObject;
	}

	this.addObjective = function(objective) {
		this.objectives.push(objective);
	}

	this.evaluateObjectives = function() {
		var data = game.util.convertModelsToJson(
    			game.levels[game.currentLevel].levelId,
    			game.levels[game.currentLevel].objects,
    			null);
    	game.util.jsonSubmit("POST", "Validation", data,
    		//function to respond to the feedback response provided by the server 
	    	function (jsonString){
	    		var json = JSON.parse(jsonString);
	    		
	    		//manage the color of the objectives on the screen
	    		var objectives = game.levels[game.currentLevel].objectives;
	    		for (var i = 0; i < objectives.length; i++) {
	    			document.getElementById(objectives[i].objectiveName).style.color = "#007826";
	    			for(var j = 0; j < json["objectives"].length;j++){
		    			if (objectives[i].objectiveName == json["objectives"][j].objectiveName) {
		    				document.getElementById(objectives[i].objectiveName).style.color = "#000000";
		    			}
	    			}
	    		}
	    		
	    		//display the dialog to move to next level
	    		if (json["isLevelCompleted"] == true) {
	    			stopTime();
	    			game.stage.showDialog();
	    		}else{
	    		}
	    	}		
    	);
	}
	
}

var Game = function() {

	this.util = new Util(this);
	this.stage = new Stage(this);

	// SET THE DEFAULT LEVEL 0 = level 1, 1 = level 2
	this.currentLevel = 0;

	this.levels = new Array();

	this.levels[0] = new Level(this, "level_001",
			"Level 01 - Object Modelling: Create a Single Object");
	this.levels[0].levelCase = new Case(this, this.levels[0], "Case_01", 
	"Create a button!!!");
	this.levels[0].levelCase.addDraggableItem("button");

	var objectiveLevel01 = new Objective(this, this.levels[0], "objective_01",
			"Create an object with name 'button'");
	
	objectiveLevel01.check = function() {
		// alert(this.level.name);
		if (this.level != null && this.level.objects.length >= 1) {
			for (var i = 0; i < this.level.objects.length; i++) {
				// alert(this.level.objects[i].name);
				if (this.level.objects[i].objectName == "button") {
					return true;
				}
			}
			return false;
		}
	}.bind(objectiveLevel01);

	this.levels[0].initialize = function() {

		this.objects.length = 0;
		document.getElementById("Title").innerHTML = this.levelName;
		document.getElementById("Instruction").innerHTML = this.levelCase.description;
        
        var div = document.getElementById("DraggableItems");
        while (div.hasChildNodes()) {
			div.removeChild(div.lastChild);
		}
        for (var i = 0; i < this.levelCase.draggableItems.length; i++){
        	var draggableItem = this.levelCase.draggableItems[i];
        	var newSpan = document.createElement("span");
        	
        	newSpan.className = "DraggableCaseItem";
        	newSpan.id = draggableItem.identity;
        	newSpan.innerHTML = draggableItem.text;
        	newSpan.style.color = "#0066cc";
//        	newSpan.style.backgroundColor= "#f5f5f5";
        	newSpan.style.borderWidth = "thin";
        	newSpan.style.borderStyle = "solid";
        	newSpan.style.borderColor = "black";
        	newSpan.style.paddingLeft = "1%";
        	newSpan.style.paddingRight = "1%";
        	newSpan.draggable = "true";
        	newSpan.cursor = "grab";
        	newSpan.style.zIndex="9";
        	newSpan.style.marginRight="1%";
        	newSpan.style.textAlign="center";
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
		
	}.bind(this.levels[0]);
	this.levels[0].addObjective(objectiveLevel01);

	this.levels[1] = new Level(this, "level_002",
			"Level 02 - Object Modelling: Create Two Objects");
	
	this.levels[1].levelCase = new Case(this, this.levels[0], "Case_01", 
	"Create two buttons: <br/> button 1 and button 2 !!!");

    this.levels[1].levelCase.addDraggableItem("button 1");
    this.levels[1].levelCase.addDraggableItem("button 2");
    
	var objectiveLevel02_1 = new Objective(this, this.levels[1], "objective_01",
			"Create an object named 'button 1'!");
	objectiveLevel02_1.check = function() {
		if (this.level != null && this.level.objects.length >= 1) {
			for (var i = 0; i < this.level.objects.length; i++) {
				if (this.level.objects[i].objectName == "button 1") {
					return true;
				}
			}
		}
		return false;
	}.bind(objectiveLevel02_1);
	this.levels[1].addObjective(objectiveLevel02_1);

	var objectiveLevel02_2 = new Objective(this, this.levels[1], "objective_02",
			"Create an object named 'button 2'!");
	objectiveLevel02_2.check = function() {
		if (this.level != null && this.level.objects.length >= 1) {
			for (var i = 0; i < this.level.objects.length; i++) {
				if (this.level.objects[i].objectName == "button 2") {
					return true;
				}
			}
		}
		return false;
	}.bind(objectiveLevel02_2);
	this.levels[1].addObjective(objectiveLevel02_2);

	this.levels[1].initialize = function() {

		this.objects.length = 0;
		document.getElementById("Title").innerHTML = this.levelName;
		document.getElementById("Instruction").innerHTML = this.levelCase.description;
        
        var div = document.getElementById("DraggableItems");
        while (div.hasChildNodes()) {
			div.removeChild(div.lastChild);
		}
        for (var i = 0; i < this.levelCase.draggableItems.length; i++){
        	var draggableItem = this.levelCase.draggableItems[i];
        	var newSpan = document.createElement("span");
        	
        	newSpan.className = "DraggableCaseItem";
        	newSpan.id = draggableItem.identity;
        	newSpan.innerHTML = draggableItem.text;
        	newSpan.style.color = "#0066cc";
//        	newSpan.style.backgroundColor= "#f5f5f5";
        	newSpan.style.borderWidth = "thin";
        	newSpan.style.borderStyle = "solid";
        	newSpan.style.borderColor = "black";
        	newSpan.style.paddingLeft = "1%";
        	newSpan.style.paddingRight = "1%";
        	newSpan.draggable = "true";
        	newSpan.cursor = "grab";
        	newSpan.style.zIndex="9";
        	newSpan.style.marginRight="1%";
        	newSpan.style.textAlign="center";
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

	}.bind(this.levels[1]);

	this.run = function() {
		// First Level
		this.levels[this.currentLevel].initialize();
	}

	this.replay = function() {
		this.levels[game.currentLevel].initialize();
		this.stage.graph.clear();
		this.stage.closeDialog();
	}.bind(this);
	document.getElementById("button-replay").onclick = this.replay;

	this.nextLevel = function() {
		this.currentLevel += 1;
		this.levels[game.currentLevel].initialize();
		this.stage.graph.clear();
		this.stage.closeDialog();
	}.bind(this);
	document.getElementById("button-next").onclick = this.nextLevel;
}