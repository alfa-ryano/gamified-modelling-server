// GENERATED BY EPSILON ----------------------------------------------------
try {
	var game = new Game();
	
	game.mode = "PRODUCTION"

    
   
    
    game.levels[0] = new Level(game, "level_1",
            "Level 1: Create Two Objects");
    game.levels[0].levelCase = new LevelCase(game, game.levels[0], "[case_01",
            "Create two objects with name 'A' and 'B' respectively"); 
       
	       game.levels[0].levelCase.addDraggableItem("A");
	       game.levels[0].levelCase.addDraggableItem("B");
	       game.levels[0].levelCase.addDraggableItem("C");
	    
	    var objectiveLevel1 = new Objective(game, game.levels[0], "objective_02",
            "Create an object with name 'B'");
       game.levels[0].addObjective(objectiveLevel1);
	    var objectiveLevel2 = new Objective(game, game.levels[0], "objective_01",
            "Create an object with name 'A'");
       game.levels[0].addObjective(objectiveLevel2);
	      
	game.levels[0].initialize = function() {

        this.nodes.length = 0;
        document.getElementById("Title").innerHTML = this.name;
        document.getElementById("Instruction").innerHTML = this.levelCase.description;

        var div = document.getElementById("DraggableItems");
        while (div.hasChildNodes()) {
            div.removeChild(div.lastChild);
        }
        for (var i = 0; i < this.levelCase.draggableItems.length; i++) {
            var draggableItem = this.levelCase.draggableItems[i];
            var newSpan = document.createElement("span");

            newSpan.className = "DraggableCaseItem";
            newSpan.id = draggableItem.id;
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
            li.id = game.levels[game.currentLevel].objectives[i].name;
            var text = document
                    .createTextNode(game.levels[game.currentLevel].objectives[i].description);
            li.appendChild(text);
            ol.appendChild(li);
        }
        resetTime();
        startTime("TimeValue");

    }.bind(game.levels[0]);    
	    
    
   
    
    game.levels[1] = new Level(game, "level_2",
            "Level 2: Create one Link");
    game.levels[1].levelCase = new LevelCase(game, game.levels[1], "[case_01",
            "Create a link connecting object 'A' to object 'B'"); 
       
	       game.levels[1].levelCase.addDraggableItem("A");
	       game.levels[1].levelCase.addDraggableItem("B");
	       game.levels[1].levelCase.addDraggableItem("C");
	    
	    var objectiveLevel1 = new Objective(game, game.levels[1], "objective_01",
            "A Link Connecting object 'A' to object 'B'");
       game.levels[1].addObjective(objectiveLevel1);
	      
	game.levels[1].initialize = function() {

        this.nodes.length = 0;
        document.getElementById("Title").innerHTML = this.name;
        document.getElementById("Instruction").innerHTML = this.levelCase.description;

        var div = document.getElementById("DraggableItems");
        while (div.hasChildNodes()) {
            div.removeChild(div.lastChild);
        }
        for (var i = 0; i < this.levelCase.draggableItems.length; i++) {
            var draggableItem = this.levelCase.draggableItems[i];
            var newSpan = document.createElement("span");

            newSpan.className = "DraggableCaseItem";
            newSpan.id = draggableItem.id;
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
            li.id = game.levels[game.currentLevel].objectives[i].name;
            var text = document
                    .createTextNode(game.levels[game.currentLevel].objectives[i].description);
            li.appendChild(text);
            ol.appendChild(li);
        }
        resetTime();
        startTime("TimeValue");

    }.bind(game.levels[1]);    
	    
   
	// ---Excute Game---------------------------------------------------------
	game.run();
} catch (error) {
	alert(error.message);
}
