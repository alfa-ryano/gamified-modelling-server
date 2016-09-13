//-- MODEL  ----------------------------------------------------------------------------------
var draggedId = null;

var MODELLING_TYPE = {
	OBJECT : "object",
	COLLABORATION : "collaboration"
}

var DRAGGABLE_ITEM_TYPE = {
	OBJECT : "ObjectDraggableCaseItem",
	CLASS : "ClassDraggableCaseItem",
	SLOT : "SlotDraggableCaseItem",
	OPERATION : "OperationDraggableCaseItem"
}

var Story = function(game) {
	Entity.call(this);
	this.game = game;
	this.substories = new Array();
	this.game.stories.push(this);
}
Story.prototype = new Entity();
Story.constructor = Story;

var SubStory = function(game, story) {
	Entity.call(this);
	this.story = story;
	this.game = game;
	this.levels = new Array();
	this.story.substories.push(this);
}
SubStory.prototype = new Entity();
SubStory.constructor = SubStory;

var Objective = function(game, level, name, description) {
	Entity.call(this);
	this.name = name;
	this.level = level;
	this.game = game;
	this.description = description;
}
Objective.prototype = new Entity();
Objective.constructor = Objective;

var DraggableItem = function(levelCase, identity, text) {
	Entity.call(this);
	this.ID = identity;
	this.levelCase = levelCase;
	this.text = text;
	this.type = DRAGGABLE_ITEM_TYPE.OBJECT;
	this.valueType = "";
}
DraggableItem.prototype = new Entity();
DraggableItem.constructor = DraggableItem;

var LevelCase = function(game, level, name, description) {
	Entity.call(this);
	this.level = level;
	this.game = game;
	this.description = description;
	this.draggableItems = new Array();

	this.addDraggableItem = function(text) {
		var identity = "DraggableCaseItem_" + new Number(this.draggableItems.length + 1);
		var draggableItem = new DraggableItem(this, identity, text);
		this.draggableItems.push(draggableItem);
		return draggableItem;
	};
}
LevelCase.prototype = new Entity();
LevelCase.constructor = LevelCase;

var Level = function(game, ID, name) {
	Entity.call(this);

	this.ID = ID;
	this.name = name;
	this.game = game;
	this.objectives = new Array();
	this.nodes = new Array();
	this.edges = new Array();
	this.levelCase = null;
	this.isSequel = false;
	this.startPoints = 500;
	this.currentPoints = 0;
	this.completedObjectives = 0;
	this.modellingType = MODELLING_TYPE.OBJECT;
	this.selectedSourceId = null;
	this.selectedTargetId = null;
	this.timeElapsed = "00:00:00";
	this.levelMode = "core";
	
	this.addNode = function(node) {
		this.nodes.push(node);
		return node;
	}

	this.addEdge = function(edge) {
		this.edges.push(edge);
		return edge;
	}

	this.addObjective = function(objective) {
		this.objectives.push(objective);
	}

	this.compactingModel = function(mode, level, inputGraph) {

		var graph = JSON.parse(JSON.stringify(inputGraph));
		var edges = graph.edges;
		var nodes = graph.nodes;
		
		for (var i = 0; i < edges.length; i++){
			for (var j = 0; j < nodes.length; j++){
				if (edges[i].source != null && edges[i].source.ID == nodes[j].ID){
					edges[i].source = {};
					edges[i].source["$ref"] = "//@nodes." + j;
				}
				if (edges[i].target != null && edges[i].target.ID == nodes[j].ID){
					edges[i].target = {};
					edges[i].target["$ref"] = "//@nodes." + j;
				}
			}
		}
		
		var model = new Object();
		model["mode"] = mode;
		model["level"] = level;
		model["graph"] = graph;
		
		return model;
	}
	
	this.evaluateObjectives = function() {
		if (game.levels[game.currentLevel].graph == null){
			return;
		}
		
		var data = this.compactingModel(game.levels[game.currentLevel].levelMode,
			game.levels[game.currentLevel].ID,
			game.levels[game.currentLevel].graph);
		game.util
			.jsonSubmit(
				"POST",
				"Validation2",
				//"Validation",
				data,
				// function to respond to the feedback response provided
				// by the server
				function(jsonString) {
					var json = JSON.parse(jsonString);

					// manage the color of the objectives on the screen
					var objectives = game.levels[game.currentLevel].objectives;
					game.levels[game.currentLevel].completedObjectives = 0;
					for (var i = 0; i < objectives.length; i++) {
						document.getElementById(objectives[i].name).style.color = "#007826";
						document.getElementById(objectives[i].name).style.fontWeight = "bolder";
						game.levels[game.currentLevel].completedObjectives += 1;
						for (var j = 0; j < json["objectives"].length; j++) {
							if (objectives[i].name == json["objectives"][j].name) {
								document
									.getElementById(objectives[i].name).style.color = "#000000";
								document
									.getElementById(objectives[i].name).style.fontWeight = "normal";
								game.levels[game.currentLevel].completedObjectives -= 1;
							}
						}
					}
					document.getElementById("ObjectiveValue").innerHTML = game.levels[game.currentLevel].completedObjectives;

					// display the dialog to move to next level
					if (json["isLevelCompleted"] == true) {
						stopTime();
						game.stage.showDialog();
					} else {
					}
				});
	}

	this.loadModels = function() {
		var modellingType = this.modellingType;
		var path = "common/template/" + modellingType + "/generator/generated.js";
		$.getScript(path, function(){
			game.levels[game.currentLevel].graph = new window[window["ModellingType"]];
			game.levels[game.currentLevel].graph.nodes = game.levels[game.currentLevel].nodes;
			game.levels[game.currentLevel].graph.edges = game.levels[game.currentLevel].edges;
		});
	}

	this.initialize = function() {
		document.getElementById("Title").innerHTML = this.name;
		document.getElementById("Instruction").innerHTML = this.levelCase.description;
		this.currentPoints = new Number(this.startPoints);
		document.getElementById("PointValue").innerHTML = this.currentPoints;
		document.getElementById("Title").innerHTML

		this.loadModels();
		game.stage.setDraggableItems(this);
		game.stage.setObjectives(this);
		game.stage.loadCSS();
		game.stage.loadPalette();
		game.stage.loadNodeTemplates();
		game.stage.loadDrawingViewportEvent();

		resetTime();
		startTime("TimeValue");
	}

}
Level.prototype = new Entity();
Level.constructor = Level;

var Game = function() {
	Entity.call(this);

	this.util = new Util(this);
	this.stage = new Stage(this);
	this.stories = new Array();

	// SET THE DEFAULT LEVEL 0 = level 1, 1 = level 2
	this.currentLevel = 0;

	this.mode = "CORE"

	this.levels = new Array();

	this.run = function() {
		// Setup Screens
		this.stage.setUpScreens();

	// First Level
	// this.levels[this.currentLevel].initialize();
	}

	this.play = function(level) {
		this.currentLevel = level;
		this.stage.graph.clear();
		this.levels[game.currentLevel].initialize();
		this.levels[game.currentLevel].nodes.length = 0;
		this.levels[game.currentLevel].edges.length = 0;
		return true;
	}.bind(this);

	this.replay = function(level) {
		this.stage.graph.clear();
		this.levels[game.currentLevel].initialize();
		return true;
	}.bind(this);


	this.nextLevel = function(level) {
		//this.currentLevel += 1;
		this.currentLevel = level;
		if (this.levels[game.currentLevel].isSequel == false) {
			this.levels[game.currentLevel].nodes.length = 0;
			this.levels[game.currentLevel].edges.length = 0;
			this.stage.graph.clear();

		} else {
			this.levels[game.currentLevel].nodes = this.levels[game.currentLevel - 1].nodes;
			this.levels[game.currentLevel].edges = this.levels[game.currentLevel - 1].edges;
		}
		this.levels[game.currentLevel].initialize();
		return true;
	}.bind(this);

}
Game.prototype = new Entity();
Game.constructor = Game;

