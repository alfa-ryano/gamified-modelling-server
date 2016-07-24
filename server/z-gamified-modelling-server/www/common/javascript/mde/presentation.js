//-- PRESENTATION ----------------------------------------------------------------------------------
var Stage = function (game) {
    this.ICON_WIDTH = 100;
    this.ICON_HEIGHT = 90;
    this.counter = 0;

    this.graph = new joint.dia.Graph;

    this.paper = new joint.dia.Paper({
        el: $('#DrawingViewport'),
        width: "100%",
        height: "100%",
        origin: {x: 0, y: 0},
        model: this.graph,
        gridSize: 1
    });

    //initialize global node templates
    var nodeTemplates = new Object();
   
    //initialize global custom object
    joint.shapes.custom = {};

    this.setCells = function(elementId, loadXML) {
        var xmlString = loadXML.responseText;

        nodeTemplates[elementId] = xmlString;

        joint.shapes.custom[elementId] = joint.shapes.basic.Rect.extend({
            defaults: joint.util.deepSupplement({
                type: "custom." + elementId,
                attrs: {
                    rect: {stroke: 'none', 'fill-opacity': 0}
                }
            }, joint.shapes.basic.Rect.prototype.defaults)
        });

        joint.shapes.custom[elementId + "View"] = joint.dia.ElementView.extend({

            template: nodeTemplates[elementId],

            initialize: function () {
                _.bindAll(this, 'updateBox');
                joint.dia.ElementView.prototype.initialize.apply(this, arguments);
                this.$box = $(_.template(this.template)());

                // Prevent paper from handling pointerdown.
                this.$box.find('div input').on('dblclick', function (evt) {
                });

                this.$box.find('input').on('change', _.bind(function (evt) {
                    this.model.set('input', $(evt.target).val());
                }, this));

                this.$box.find('.delete').on('click', _.bind(this.model.remove, this.model));
                // Update the box position whenever the underlying model changes.
                this.model.on('change', this.updateBox, this);
                // Remove the box when the model gets removed from the graph.
                this.model.on('remove', this.removeBox, this);

                this.updateBox();
            },
            render: function () {
                joint.dia.ElementView.prototype.render.apply(this, arguments);
                this.paper.$el.prepend(this.$box);
                this.updateBox();
                return this;
            },
            updateBox: function () {
                // Set the position and dimension of the box so that it covers the JointJS element.
                var bbox = this.model.getBBox();
                // Example of updating the HTML with a data stored in the cell model.

                //add identity to HTML Icon/the first div inside the box
                this.$box[0].id = this.model.get('identity');

                //set the object name and the class name
                var className = "";
                if (this.model.get('model').className != null &&
                    this.model.get('model').className != "") {
                    className = ": " + this.model.get('model').className;
                }

                this.$box.find('.HtmlObjectNameText')[0].innerHTML =
                    this.model.get('model').name + className;

                //set the attributes/slots
                if (this.model.get('model').properties.length > 0) {
                    var properties = this.model.get('model').properties;
                    var text = "";
                    for (var i = 0; i < properties.length; i++) {
                        if (i == 0) {
                            text += properties[i].text;
                        } else {
                            text += ("<br/>" + properties[i].text);
                        }
                    }
                    this.$box.find('.HtmlObjectSlotText')[0].innerHTML = text;
                }

                //set the operations/actions
                if (this.model.get('model').operations.length > 0) {
                    var operations = this.model.get('model').operations;
                    var text = "";
                    for (var i = 0; i < operations.length; i++) {
                        if (i == 0) {
                            text += operations[i].text;
                        } else {
                            text += ("<br/>" + operations[i].text);
                        }
                    }
                    this.$box.find('.HtmlObjectOperationText')[0].innerHTML = text;
                }
                this.$box.css({
                    width: bbox.width,
                    height: bbox.height,
                    left: bbox.x - 1,
                    top: bbox.y - 1
                });


                var identifier = this.$box[0].id;
                var htmlIcon = document.getElementById(identifier);
                if (htmlIcon != null) {
                    this.model.resize(htmlIcon.offsetWidth - 2, htmlIcon.offsetHeight - 2);
                }
            },

            removeBox: function (evt) {
                this.$box.remove();
            }
        });
    }
    //end node

    // JointJS functions
    this.paper.on('blank:pointerup', function (evt, x, y) {
        if (document.activeElement instanceof HTMLInputElement) {
            document.activeElement.parentNode.parentNode.style.pointerEvents = 'none';
            document.activeElement.blur();
        }
    });

    this.paper.on('cell:pointerdown', function (cellView, evt) {
        var element = game.stage.graph.get('cells').find(function (cell) {
            if (cell instanceof joint.dia.Link) return false;
            if (cell.id === cellView.model.id) {
                return true;
            }
            return false;
        })
    });

    this.graph.on("remove", function (cell) {
        if (cell instanceof joint.dia.Element) {
            var index = game.levels[game.currentLevel].nodes.indexOf(cell.attributes.model);
            if (index != null) {
                game.levels[game.currentLevel].nodes.splice(index, 1);
            }
        } else if (cell instanceof joint.dia.Link) {
            var index = game.levels[game.currentLevel].edges.indexOf(cell.attributes.model);
            if (index != null) {
                game.levels[game.currentLevel].edges.splice(index, 1);
            }
        }

        game.levels[game.currentLevel].evaluateObjectives();
        game.stage.updateProgress();
    });

    // other functions
    this.showDialog = function () {
        document.getElementById("DialogScreen").style.visibility = "visible";
    }

    this.closeDialog = function () {
        document.getElementById("DialogScreen").style.visibility = "collapse";
    }
    document.getElementById("button-continue").onclick = this.closeDialog;

    this.updateProgress = function () {
        var nodeValue = game.stage.graph.getElements().length;
        document.getElementById("NodeValue").innerHTML = nodeValue;
        var edgeValue = game.stage.graph.getLinks().length;
        document.getElementById("EdgeValue").innerHTML = edgeValue;

        if (game.levels[game.currentLevel].currentPoints > 0) {
            game.levels[game.currentLevel].currentPoints -= 10;
            var currentPoints = game.levels[game.currentLevel].currentPoints;
            document.getElementById("PointValue").innerHTML = currentPoints;
        }

        var countSlot = 0;
        var countOperation = 0;
        for (var i = 0; i < game.levels[game.currentLevel].nodes.length; i++) {
            var node = game.levels[game.currentLevel].nodes[i];
            countSlot += node.properties.length;
            countOperation += node.operations.length;
        }
        document.getElementById("SlotValue").innerHTML = countSlot.toString();
        document.getElementById("OperationValue").innerHTML = countOperation.toString();


    }


    this.setDraggableItems = function (level) {

        var div = document.getElementById("DraggableItems");
        while (div.hasChildNodes()) {
            div.removeChild(div.lastChild);
        }
        for (var i = 0; i < level.levelCase.draggableItems.length; i++) {
            var draggableItem = level.levelCase.draggableItems[i];
            var newSpan = document.createElement("span");

            newSpan.className = "DraggableCaseItem";
            newSpan.id = draggableItem.id;
            newSpan.innerHTML = "";
            newSpan.innerHTML = draggableItem.text;
            newSpan.setAttribute("type", draggableItem.type);
            newSpan.setAttribute("name", draggableItem.name);
            newSpan.setAttribute("value", draggableItem.value);
            newSpan.setAttribute("valueType", draggableItem.valueType);
            //newSpan.style.zIndex = 99;
            newSpan.ondragstart = function () {
                //document.getElementsByTagName("body")[0].appendChild(newSpan);
                document.getElementById("DraggableItems").style.overflow = "visible";
            };
            newSpan.ondragstop = function () {
                //document.getElementById("DraggableItems").appendChild(newSpan);
                document.getElementById("DraggableItems").style.overflow = "auto";
            };

            div.appendChild(newSpan);

            if (draggableItem.type == DRAGGABLE_ITEM_TYPE.OBJECT) {
                newSpan.className += " " + DRAGGABLE_ITEM_TYPE.OBJECT;
            } else if (draggableItem.type == DRAGGABLE_ITEM_TYPE.CLASS) {
                newSpan.className += " " + DRAGGABLE_ITEM_TYPE.CLASS;
            }
            else if (draggableItem.type == DRAGGABLE_ITEM_TYPE.SLOT) {
                newSpan.className += " " + DRAGGABLE_ITEM_TYPE.SLOT;
            } else if (draggableItem.type == DRAGGABLE_ITEM_TYPE.OPERATION) {
                newSpan.className += " " + DRAGGABLE_ITEM_TYPE.OPERATION;
            }
        }

        $('.DraggableCaseItem').draggable({
            opacity: 0.8,
            helper: "clone",
            start: function (event, ui) {
                draggedId = $(event.target).attr('id');
            }
        });
    }

    this.setObjectives = function (level) {
        var ol = document.getElementById("Objective");
        ol.style.color = "#000000";
        while (ol.hasChildNodes()) {
            ol.removeChild(ol.lastChild);
        }
        for (var i = 0; i < level.objectives.length; i++) {
            var li = document.createElement("li");
            li.style.color = "#000000";
            li.id = level.objectives[i].name;
            var text = document
                .createTextNode(level.objectives[i].description);
            li.appendChild(text);
            ol.appendChild(li);
        }
    }

    this.setUpScreens = function () {


        document.getElementById("ButtonPlay").onclick = function () {
            document.getElementById("PlayScreen").style.visibility = "collapse";
            document.getElementById("LevelSelectionScreen").style.visibility = "visible";
        }
        document.getElementById("LevelSelectionBack").onclick = function () {
            document.getElementById("PlayScreen").style.visibility = "visible";
            document.getElementById("LevelSelectionScreen").style.visibility = "collapse";
        }
        document.getElementById("LevelScreenBack").onclick = function () {
            document.getElementById("LevelSelectionScreen").style.visibility = "visible";
            document.getElementById("LevelScreen").style.visibility = "collapse";
        }

        var stories = document.getElementById("Stories");
        while (stories.hasChildNodes()) {
            stories.removeChild(stories.lastChild);
        }

        for (var i = 0; i < game.stories.length; i++) {
            var story = game.stories[i];
            var storyHeader = document.createElement("div");
            storyHeader.className = "StoryHeader";
            storyHeader.innerHTML = story.name;
            stories.appendChild(storyHeader);

            for (var j = 0; j < story.substories.length; j++) {
                var subStory = story.substories[j];
                var storySubHeader = document.createElement("div");
                storySubHeader.className = "StorySubHeader";
                storySubHeader.innerHTML = subStory.name;
                stories.appendChild(storySubHeader);

                var storyLevels = document.createElement("div");
                storyLevels.className = "StoryLevels";
                stories.appendChild(storyLevels);

                for (var k = 0; k < subStory.levels.length; k++) {
                    var child = document.createElement("div");
                    child.className = "StoryLevel";
                    child.innerHTML = k + 1;
                    child.addEventListener("click", function () {
                        game.play(this.innerHTML - 1);
                        document.getElementById("LevelScreen").style.visibility = "visible";
                        document.getElementById("LevelSelectionScreen").style.visibility = "collapse";
                    });
                    storyLevels.appendChild(child);
                }
            }


        }
    }


    this.loadNodeTemplates = function () {
    	var modellingType = game.levels[game.currentLevel].modellingType;
		var request = new XMLHttpRequest;
		request.onloadend =  function() {listFiles(modellingType)};
		request.open("GET", "ListFiles?ModellingType=" + modellingType + "&Type=cell", false);
		request.send();
		function listFiles(modellingType) {
			var files = JSON.parse(request.responseText);
			for(var i = 0; i < files.length; i++){

				var path = "common/template/"+ modellingType + "/cell/";;
    			var elementId = files[i].split(".")[1];
    			var xmlFile = path + files[i];

    			var loadXML = new XMLHttpRequest;
    			loadXML.onloadend = function() {loadCells(elementId, loadXML)};
    			loadXML.open("GET", xmlFile, false);
    			loadXML.send();

                function loadCells(elementId, loadXML){
                    game.stage.setCells(elementId, loadXML);
                }
			}
		}
    }

    this.loadPalette = function () {
        var icons = document.getElementById("Icons");
        var modellingType = game.levels[game.currentLevel].modellingType;
        while (icons.hasChildNodes()) {
            icons.removeChild(icons.lastChild);
        }

		var request = new XMLHttpRequest;
		request.onloadend =  function() {listFiles(modellingType)};
		request.open("GET", "ListFiles?ModellingType=" + modellingType + "&Type=palette", false);
		request.send();

		function listFiles(modellingType) {
			var files = JSON.parse(request.responseText);
			for(var i = 0; i < files.length; i++){

				var path = "common/template/"+ modellingType + "/palette/";
    			var elementId = files[i].split(".")[1];
    			var xmlFile = path + files[i];

    			var loadXML = new XMLHttpRequest;
    			loadXML.onloadend = function() {setSVG(elementId)};
    			loadXML.open("GET", xmlFile, false);
    			loadXML.send();

    			function setSVG(elementId) {
    				var xmlString = loadXML.responseText;
    				document.getElementById("Icons").innerHTML += xmlString;
    			}
			}
			for(var i = 0; i < files.length; i++){
				var elementId = files[i].split(".")[1];
				$("#" + elementId).draggable({
			        opacity: 0.7, helper: "clone",
			        start: function (event) {
			        }
			    });
			}

		}
    }
    
    this.loadCustomEvent = function(elementId){
    	
    	var modellingType = game.levels[game.currentLevel].modellingType;
		var path = "common/template/"+ modellingType + "/event/" + elementId + "Event.js";
    	
		$.getScript(path);
    	
    	$(".HtmlIcon").droppable({
            drop: function (event, ui) {
            	window[elementId + "Event"](event, ui); 
            }
        });

    }

//    this.loadCustomEvents = function(){
//    	
//    	var modellingType = game.levels[game.currentLevel].modellingType;
//    	var request = new XMLHttpRequest;
//		request.onloadend =  function() {listFiles(modellingType)};
//		request.open("GET", "ListFiles?ModellingType=" + modellingType + "&Type=event", false);
//		request.send();
//
//		function listFiles(modellingType) {
//			var files = JSON.parse(request.responseText);
//			for(var i = 0; i < files.length; i++){
//				var path = "common/template/"+ modellingType + "/event/" + files[i];
//				var elementId = files[i].split(".")[1];
//				
//		    	$.getScript(path);
//		    	$(".HtmlIcon").droppable({
//                    drop: function (event, ui) {
//                    	alert("A");
//                    	//window[elementId](event, ui); 
//                    }
//                });
//			}
//		}
//    }
    
    this.loadDrawingViewportEvent = function(){
	    $("#DrawingViewport").droppable({
	        drop: function (event, ui) {
	        	
	        	var paperPoint = game.stage.paper.clientToLocalPoint({x: event.clientX, y: event.clientY});
	
	            var elementId = ui.draggable.attr("id");
	            var type = ui.draggable.attr("type");
	            var nodeName = document.getElementById(elementId).innerHTML;
	
	            //--------------------------------------------------------------------------------
	            if (type == "Node") {
	
	                var nodeName = "";
	                var nodeId = CreateId();
	                var node = game.levels[game.currentLevel].addNode("", nodeId);
	
	                var width = $(event.originalEvent.target)[0].clientWidth;
	                var height = $(event.originalEvent.target)[0].clientHeight;
	
	                var element = new joint.shapes.custom[elementId]({
	                    position: {
	                        x: paperPoint.x - width / 2,
	                        y: paperPoint.y - height / 2
	                    },
	                    size: {width: width, height: height},
	                    name: nodeName,
	                    identity: nodeId,
	                    model: node
	                });
	                element.toFront(true);
	
	                game.stage.graph.addCell(element);
	                var view = element.findView(game.stage.paper);
	                view.$box[0].id = nodeId;
	                
	                game.stage.loadCustomEvent(elementId);
	                
	                game.stage.updateProgress();
	            }
	            //-----------------------------------------------------
	            //else
	            if (type == "Edge") {
	
	                var edgeId = CreateId();
	                var edgeModel = game.levels[game.currentLevel].addEdge(edgeId);
	
	                var width = $(event.originalEvent.target)[0].clientWidth;
	                var height = $(event.originalEvent.target)[0].clientHeight;
	
	                var link = new joint.dia.Link({
	                    source: {x: paperPoint.x + width / 2, y: paperPoint.y - height / 2},
	                    target: {x: paperPoint.x - width / 2, y: paperPoint.y + height / 2},
	                    identity: edgeId,
	                    model: edgeModel
	                });
	
	                link.on('change:source', function () {
	                    var sourceElement = link.getSourceElement();
	                    var targetElement = link.getTargetElement();
	                    if (sourceElement != null) {
	                        this.attributes.model.sourceId = sourceElement.attributes.identity;
	                    } else {
	                        this.attributes.model.sourceId = null;
	                    }
	
	                    if (targetElement != null && targetElement != null) {
	                        game.levels[game.currentLevel].evaluateObjectives();
	                    }
	                });
	
	                link.on('change:target', function () {
	                    var sourceElement = link.getSourceElement();
	                    var targetElement = link.getTargetElement();
	                    if (targetElement != null) {
	                        this.attributes.model.targetId = targetElement.attributes.identity;
	
	                    } else {
	                        this.attributes.model.targetId = null;
	                    }
	
	                    if (targetElement != null && targetElement != null) {
	                        game.levels[game.currentLevel].evaluateObjectives();
	                    }
	                });
	                game.stage.graph.addCell(link);
	                game.stage.updateProgress();
	            }
	        }
	    });
    }
}  