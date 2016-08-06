//-- MODEL  ----------------------------------------------------------------------------------
var draggedId = null;

var MODELLING_TYPE = {
    OBJECT: "object",
    COLLABORATION: "collaboration"
}

var DRAGGABLE_ITEM_TYPE = {
    OBJECT: "ObjectDraggableCaseItem",
    CLASS: "ClassDraggableCaseItem",
    SLOT: "SlotDraggableCaseItem",
    OPERATION: "OperationDraggableCaseItem"
}

var Entity = function () {
    this.id = CreateId();
    this.name;
    this.text;
    this.description;
    this.value;

    this.type;
    this.className;
    this.group;
    this.category;
    this.accessModifier;

    this.x;
    this.y;
    this.width;
    this.height;
}

var Story = function (game) {
    Entity.call(this);
    this.game = game;
    this.substories = new Array();
    this.game.stories.push(this);
}
Story.prototype = new Entity();

var SubStory = function (game, story) {
    Entity.call(this);
    this.story = story;
    this.game = game;
    this.levels = new Array();
    this.story.substories.push(this);
}
SubStory.prototype = new Entity();
SubStory.constructor = SubStory;

var Property = function (text) {
    Entity.call(this);
    this.text = text;
}
SubStory.prototype = new Entity();
SubStory.constructor = SubStory;

var Operation = function (text) {
    Entity.call(this);
    this.text = text;
}
SubStory.prototype = new Entity();
SubStory.constructor = SubStory;

var Node = function (name, id) {
    Entity.call(this);
    this.id = id;
    this.name = name;
    this.properties = new Array();
    this.operations = new Array();
}
SubStory.prototype = new Entity();
SubStory.constructor = SubStory;

var Edge = function (id) {
    Entity.call(this);
    this.id = id;
    this.sourceId = null;
    this.targetId = null;
}
SubStory.prototype = new Entity();
SubStory.constructor = SubStory;

var Objective = function (game, level, name, description) {
    Entity.call(this);
    this.name = name;
    this.level = level;
    this.game = game;
    this.description = description;
}
SubStory.prototype = new Entity();
SubStory.constructor = SubStory;

var DraggableItem = function (levelCase, identity, text) {
    Entity.call(this);
    this.id = identity;
    this.levelCase = levelCase;
    this.text = text;
    this.type = DRAGGABLE_ITEM_TYPE.OBJECT;
    this.valueType = "";
}
DraggableItem.prototype = new Entity();
DraggableItem.constructor = DraggableItem;

var LevelCase = function (game, level, name, description) {
    Entity.call(this);
    this.level = level;
    this.game = game;
    this.description = description;
    this.draggableItems = new Array();

    this.addDraggableItem = function (text) {
        var identity = "DraggableCaseItem_" + new Number(this.draggableItems.length + 1);
        var draggableItem = new DraggableItem(this, identity, text);
        this.draggableItems.push(draggableItem);
        return draggableItem;
    };
}
LevelCase.prototype = new Entity();
LevelCase.constructor = LevelCase;

var Level = function (game, id, name) {
    Entity.call(this);
    this.id = id;
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

    this.addNode = function (nodeName, identity) {
        var node = new Node(nodeName, identity);
        this.nodes.push(node);
        return node;
    }

    this.addEdge = function (identity) {
        var modelEdge = new Edge(identity);
        this.edges.push(modelEdge);
        return modelEdge;
    }

    this.addObjective = function (objective) {
        this.objectives.push(objective);
    }

    this.evaluateObjectives = function () {
        var data = game.util.convertModelsToJson(game.mode,
            game.levels[game.currentLevel].id,
            game.levels[game.currentLevel].nodes,
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
                    document.getElementById("ObjectiveValue").innerHTML =
                        game.levels[game.currentLevel].completedObjectives;

                    // display the dialog to move to next level
                    if (json["isLevelCompleted"] == true) {
                        stopTime();
                        game.stage.showDialog();
                    } else {
                    }
                });
    }

    this.initialize = function () {
        document.getElementById("Title").innerHTML = this.name;
        document.getElementById("Instruction").innerHTML = this.levelCase.description;
        this.currentPoints = new Number(this.startPoints);
        document.getElementById("PointValue").innerHTML = this.currentPoints;
        document.getElementById("Title").innerHTML
        
        game.stage.setDraggableItems(this);
        game.stage.setObjectives(this);
        game.stage.loadCSS();
        game.stage.loadPalette();
        game.stage.loadNodeTemplates();
        game.stage.loadDrawingViewportEvent();
        //game.stage.loadCustomEvents();
        
        resetTime();
        startTime("TimeValue");
    }

}
Level.prototype = new Entity();
Level.constructor = Level;

var Game = function () {
    Entity.call(this);

    this.util = new Util(this);
    this.stage = new Stage(this);
    this.stories = new Array();

    // SET THE DEFAULT LEVEL 0 = level 1, 1 = level 2
    this.currentLevel = 0;

    this.mode = "DEVELOPMENT"

    this.levels = new Array();

    this.run = function () {
        // Setup Screens
        this.stage.setUpScreens();

        // First Level
        // this.levels[this.currentLevel].initialize();
    }

    this.play = function (level) {
        this.currentLevel = level;
        this.stage.graph.clear();
        this.levels[game.currentLevel].initialize();
        this.levels[game.currentLevel].nodes.length = 0;
        this.levels[game.currentLevel].edges.length = 0;
        this.stage.closeDialog();
        return true;
    }.bind(this);

    this.replay = function () {
        this.stage.graph.clear();
        this.levels[game.currentLevel].initialize();
        this.stage.closeDialog();
    }.bind(this);
    document.getElementById("button-replay").onclick = this.replay;

    this.nextLevel = function () {
        this.currentLevel += 1;
        if (this.levels[game.currentLevel].isSequel == false) {
            this.levels[game.currentLevel].nodes.length = 0;
            this.levels[game.currentLevel].edges.length = 0;
            this.stage.graph.clear();

        } else {
            this.levels[game.currentLevel].nodes = this.levels[game.currentLevel - 1].nodes;
            this.levels[game.currentLevel].edges = this.levels[game.currentLevel - 1].edges;
        }
        this.levels[game.currentLevel].initialize();
        this.stage.closeDialog();
    }.bind(this);
    document.getElementById("button-next").onclick = this.nextLevel;
}
Game.prototype = new Entity();
Game.constructor = Game;