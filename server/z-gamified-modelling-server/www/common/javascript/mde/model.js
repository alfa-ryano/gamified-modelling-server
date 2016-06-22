//-- MODEL  ----------------------------------------------------------------------------------
var draggedId = null;

var inheritsFrom = function (child, parent) {
    child.prototype = Object.create(parent.prototype);
};

var Story = function(game){
    this.id = game.util.createId();
    this.name = "";
    this.description = "";
    this.game = game;
    this.substories = new Array();
    this.game.stories.push(this);
}

var SubStory = function(game, story){
    this.id = game.util.createId();
    this.name = "";
    this.description = "";
    this.story = story;
    this.game = game;
    this.levels = new Array();
    this.story.substories.push(this);
}


var Property = function (text) {
    this.text = text;
    this.name = null;
    this.value = null;
    this.valueType = null;
}

var Operation = function (text) {
    this.text = text;
}

var ModelObject = function (objectName, identity) {
    this.identity = identity;
    this.objectName = objectName;
    this.properties = new Array();
    this.operations = new Array();
    this.className = "";
}

var ModelEdge = function (identity) {
    this.identity = identity;
    this.sourceIdentity = null;
    this.targetIdentity = null;
}

var Objective = function (game, level, objectiveName, description) {
    this.objectiveName = objectiveName;
    this.level = level;
    this.game = game;
    this.description = description;
}

var DRAGGABLE_ITEM_TYPE = {
    OBJECT: "ObjectDraggableCaseItem",
    CLASS: "ClassDraggableCaseItem",
    SLOT: "SlotDraggableCaseItem",
    OPERATION: "OperationDraggableCaseItem"
}

var DraggableItem = function (levelCase, identity, text) {
    this.identity = identity;
    this.levelCase = levelCase;
    this.text = text;
    this.type = DRAGGABLE_ITEM_TYPE.OBJECT;
    this.name = null;
    this.value = null;
}

var Case = function (game, level, name, description) {
    this.level = level;
    this.game = game;
    this.description = description;
    this.draggableItems = new Array();

    this.addDraggableItem = function (text) {
        var identity = "DraggableCaseItem_" + (this.draggableItems.length + 1);
        var draggableItem = new DraggableItem(this, identity, text);
        this.draggableItems.push(draggableItem);
        return draggableItem;
    };
}

var Level = function (game, levelId, levelName) {
    this.levelId = levelId;
    this.levelName = levelName;
    this.game = game;
    this.objectives = new Array();
    this.objects = new Array();
    this.edges = new Array();
    this.levelCase = null;
    this.isSequel = false;

    this.points = 0;
    this.timeElapsed = "00:00:00";

    this.addObject = function (objectName, identity) {
        var modelObject = new ModelObject(objectName, identity);
        this.objects.push(modelObject);
        return modelObject;
    }

    this.addEdge = function (identity) {
        var modelEdge = new ModelEdge(identity);
        this.edges.push(modelEdge);
        return modelEdge;
    }

    this.addObjective = function (objective) {
        this.objectives.push(objective);
    }

    this.evaluateObjectives = function () {
        var data = game.util.convertModelsToJson(game.mode,
            game.levels[game.currentLevel].levelId,
            game.levels[game.currentLevel].objects,
            game.levels[game.currentLevel].edges);
        game.util
            .jsonSubmit(
                "POST",
                "Validation",
                data,
                // function to respond to the feedback response provided
                // by the server
                function (jsonString) {
                    var json = JSON.parse(jsonString);

                    // manage the color of the objectives on the screen
                    var objectives = game.levels[game.currentLevel].objectives;
                    for (var i = 0; i < objectives.length; i++) {
                        document
                            .getElementById(objectives[i].objectiveName).style.color = "#007826";
                        for (var j = 0; j < json["objectives"].length; j++) {
                            if (objectives[i].objectiveName == json["objectives"][j].objectiveName) {
                                document
                                    .getElementById(objectives[i].objectiveName).style.color = "#000000";
                            }
                        }
                    }
                    // display the dialog to move to next level
                    if (json["isLevelCompleted"] == true) {
                        stopTime();
                        game.stage.showDialog();
                    } else {
                    }
                });
    }

    this.initialize = function () {
        document.getElementById("Title").innerHTML = this.levelName;
        document.getElementById("Instruction").innerHTML = this.levelCase.description;

        game.stage.setDraggableItems(this);
        game.stage.setObjectives(this);

        resetTime();
        startTime("TimeValue");
    }

}

var Game = function () {

    this.util = new Util(this);
    this.stage = new Stage(this);
    this.stories = new Array();

    // SET THE DEFAULT LEVEL 0 = level 1, 1 = level 2
    this.currentLevel = 0;

    this.mode = "DEVELOPMENT"

    this.levels = new Array();

    this.run = function () {
        //Setup Screens
        this.stage.setUpScreens();

        // First Level
        // this.levels[this.currentLevel].initialize();
    }

    this.play = function (level) {
        game.currentLevel = level;
        this.levels[game.currentLevel].initialize();
        this.stage.graph.clear();
        this.stage.closeDialog();
    }.bind(this);

    this.replay = function () {
        this.levels[game.currentLevel].initialize();
        this.stage.graph.clear();
        this.stage.closeDialog();
    }.bind(this);
    document.getElementById("button-replay").onclick = this.replay;

    this.nextLevel = function () {
        this.currentLevel += 1;
        this.levels[game.currentLevel].initialize();
        if (this.levels[game.currentLevel].isSequel == false) {
            this.levels[game.currentLevel].objects.length = 0;
            this.levels[game.currentLevel].edges.length = 0;
            this.stage.graph.clear();
        } else {
            this.levels[game.currentLevel].objects = this.levels[game.currentLevel - 1].objects;
            this.levels[game.currentLevel].edges = this.levels[game.currentLevel - 1].edges;
        }
        this.stage.closeDialog();
    }.bind(this);
    document.getElementById("button-next").onclick = this.nextLevel;
}