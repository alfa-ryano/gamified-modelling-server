//-- PRESENTATION ----------------------------------------------------------------------------------
var Stage = function(game) {
	this.ICON_WIDTH = 100;
	this.ICON_HEIGHT = 90;
	this.counter = 0;

	this.graph = new joint.dia.Graph;

	this.paper = new joint.dia.Paper({
		el : $('#DrawingViewport'),
		width : "100%",
		height : "100%",
		origin : {
			x : 0,
			y : 0
		},
		model : this.graph,
		gridSize : 1
	});

	// initialize global custom object
	joint.shapes.custom = {};

	// JointJS functions
	this.paper
			.on(
					'blank:pointerup',
					function(evt, x, y) {
						if (document.activeElement instanceof HTMLInputElement) {
							document.activeElement.parentNode.parentNode.style.pointerEvents = 'none';
							document.activeElement.blur();
						}
					});

	this.paper.on('cell:pointerdown', function(cellView, evt) {
		var element = game.stage.graph.get('cells').find(function(cell) {
			if (cell instanceof joint.dia.Link)
				return false;
			if (cell.id === cellView.model.id) {
				return true;
			}
			return false;
		})
	});

	this.graph.on("remove", function(cell) {
		if (cell instanceof joint.dia.Element) {
			var index = game.levels[game.currentLevel].nodes
					.indexOf(cell.attributes.model);
			if (index != null) {
				game.levels[game.currentLevel].nodes.splice(index, 1);
			}
		} else if (cell instanceof joint.dia.Link) {
			var index = game.levels[game.currentLevel].edges
					.indexOf(cell.attributes.model);
			if (index != null) {
				game.levels[game.currentLevel].edges.splice(index, 1);
			}
		}

		game.levels[game.currentLevel].evaluateObjectives();
		game.stage.updateProgress();
	});

	// other functions
	this.showDialog = function() {
		document.getElementById("DialogScreen").style.visibility = "visible";
	}

	this.closeDialog = function() {
		document.getElementById("DialogScreen").style.visibility = "collapse";
	}
	document.getElementById("button-continue").onclick = this.closeDialog;

	this.updateProgress = function() {
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
		document.getElementById("OperationValue").innerHTML = countOperation
				.toString();

	}

	this.setDraggableItems = function(level) {

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
			// newSpan.style.zIndex = 99;
			newSpan.ondragstart = function() {
				// document.getElementsByTagName("body")[0].appendChild(newSpan);
				document.getElementById("DraggableItems").style.overflow = "visible";
			};
			newSpan.ondragstop = function() {
				// document.getElementById("DraggableItems").appendChild(newSpan);
				document.getElementById("DraggableItems").style.overflow = "auto";
			};

			div.appendChild(newSpan);

			if (draggableItem.type == DRAGGABLE_ITEM_TYPE.OBJECT) {
				newSpan.className += " " + DRAGGABLE_ITEM_TYPE.OBJECT;
			} else if (draggableItem.type == DRAGGABLE_ITEM_TYPE.CLASS) {
				newSpan.className += " " + DRAGGABLE_ITEM_TYPE.CLASS;
			} else if (draggableItem.type == DRAGGABLE_ITEM_TYPE.SLOT) {
				newSpan.className += " " + DRAGGABLE_ITEM_TYPE.SLOT;
			} else if (draggableItem.type == DRAGGABLE_ITEM_TYPE.OPERATION) {
				newSpan.className += " " + DRAGGABLE_ITEM_TYPE.OPERATION;
			}
		}

		$('.DraggableCaseItem').draggable({
			opacity : 0.8,
			helper : "clone",
			start : function(event, ui) {
				draggedId = $(event.target).attr('id');
			}
		});
	}

	this.setObjectives = function(level) {
		var ol = document.getElementById("Objective");
		ol.style.color = "#000000";
		while (ol.hasChildNodes()) {
			ol.removeChild(ol.lastChild);
		}
		for (var i = 0; i < level.objectives.length; i++) {
			var li = document.createElement("li");
			li.style.color = "#000000";
			li.id = level.objectives[i].name;
			var text = document.createTextNode(level.objectives[i].description);
			li.appendChild(text);
			ol.appendChild(li);
		}
	}

	this.setUpScreens = function() {

		document.getElementById("ButtonPlay").onclick = function() {
			document.getElementById("PlayScreen").style.visibility = "collapse";
			document.getElementById("LevelSelectionScreen").style.visibility = "visible";
		}
		document.getElementById("LevelSelectionBack").onclick = function() {
			document.getElementById("PlayScreen").style.visibility = "visible";
			document.getElementById("LevelSelectionScreen").style.visibility = "collapse";
		}
		document.getElementById("LevelScreenBack").onclick = function() {
			document.getElementById("LevelSelectionScreen").style.visibility = "visible";
			document.getElementById("LevelScreen").style.visibility = "collapse";
		}

		var stories = document.getElementById("Stories");
		while (stories.hasChildNodes()) {
			stories.removeChild(stories.lastChild);
		}

		var level = 0;
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
					level = level + 1;
					child.innerHTML = level;
					child
							.addEventListener(
									"click",
									function() {
										game.play(this.innerHTML - 1);
										document.getElementById("LevelScreen").style.visibility = "visible";
										document
												.getElementById("LevelSelectionScreen").style.visibility = "collapse";
									});
					storyLevels.appendChild(child);
				}
			}

		}
	}

	this.loadNodeTemplates = function() {
		var modellingType = game.levels[game.currentLevel].modellingType;
		var request = new XMLHttpRequest;
		request.onloadend = function() {
			listFiles(modellingType)
		};
		request.open("GET", "ListFiles?ModellingType=" + modellingType
				+ "&Type=view", false);
		request.send();
		function listFiles(modellingType) {
			var files = JSON.parse(request.responseText);
			for (var i = 0; i < files.length; i++) {

			    var path = "common/template/" + modellingType + "/view/" + files[i];

				var loadXML = new XMLHttpRequest;
				loadXML.onloadend = function() {
					loadCells(modellingType, loadXML)
				};
				loadXML.open("GET", path, false);
				loadXML.send();

				function loadCells(modellingType, loadXML) {
					var xmlString = loadXML.responseText;
					var parser = new DOMParser();
				    xmlDoc = parser.parseFromString(xmlString, "text/xml");
				    var elementName = xmlDoc.firstChild.getAttribute("name"); 
				    var elementType = xmlDoc.firstChild.getAttribute("type");
					
				    // load internal cell function
					var cellPath = "common/template/" + modellingType
							+ "/cell/" + elementName + "Cell.js";
					
					$.getScript(cellPath, function(data, textStatus, jqxhr) {
						// execute internal cell function
						if (elementType == "node"){ 
							window[elementName + "Cell"](elementName, xmlString);
						}else if (elementType == "edge"){
							window[elementName + "Cell"]();
						}
					});
				}
			}
		}
	}

	this.loadPalette = function() {
		var icons = document.getElementById("Icons");
		var modellingType = game.levels[game.currentLevel].modellingType;
		while (icons.hasChildNodes()) {
			icons.removeChild(icons.lastChild);
		}

		var request = new XMLHttpRequest;
		request.onloadend = function() {
			listFiles(modellingType)
		};
		request.open("GET", "ListFiles?ModellingType=" + modellingType
				+ "&Type=palette", false);
		request.send();

		function listFiles(modellingType) {
			var files = JSON.parse(request.responseText);
			var xmlString = "";
			for (var i = 0; i < files.length; i++) {

				var path = "common/template/" + modellingType + "/palette/";
				var elementId = files[i].split(".")[1];
				var xmlFile = path + files[i];

				var loadXML = new XMLHttpRequest;
				loadXML.onloadend = function() {
					setSVG(elementId)
				};
				loadXML.open("GET", xmlFile, false);
				loadXML.send();

				function setSVG(elementId) {
					xmlString += loadXML.responseText;
				}
			}
			xmlString = "<div>" + xmlString + "</div>";
			document.getElementById("Icons").innerHTML =  xmlString;
			
			var parser = new DOMParser();
		    xmlDoc = parser.parseFromString(xmlString, "text/xml");
		    
			for (var i = 0; i < xmlDoc.firstChild.children.length; i++) {
				var elementId = xmlDoc.firstChild.children[i].getAttribute("id");
				$("#" + elementId).draggable({
					opacity : 0.7,
					helper : "clone",
					start : function(event) {
					}
				});
			}

		}
	}

	this.loadCustomEvent = function(elementName) {
		var modellingType = game.levels[game.currentLevel].modellingType;
		var path = "common/template/" + modellingType + "/event/" + elementName
				+ "Event.js";
 
		$.getScript(path, function() {
			$("."+elementName + "View").droppable({
				drop : function(event, ui) {
					window[elementName + "Event"](event, ui, elementName);
				}
			});
		});
	}

	this.loadDrawingViewportEvent = function() {
		$("#DrawingViewport")
				.droppable(
						{
							drop : function(event, ui) {

								var paperPoint = game.stage.paper
										.clientToLocalPoint({
											x : event.clientX,
											y : event.clientY
										});

								var elementName = ui.draggable.attr("name");
								var type = ui.draggable.attr("type");

								// --------------------------------------------------------------------------------
								if (type == "Node") {

									var nodeName = "";
									var nodeId = CreateId();
									var node = game.levels[game.currentLevel]
											.addNode("", nodeId);

									var width = $(event.originalEvent.target)[0].clientWidth;
									var height = $(event.originalEvent.target)[0].clientHeight;

									var element = new joint.shapes.custom[elementName](
											{
												position : {
													x : paperPoint.x - width
															/ 2,
													y : paperPoint.y - height
															/ 2
												},
												size : {
													width : width,
													height : height
												},
												name : nodeName,
												identity : nodeId,
												model : node
											});
									element.toFront(true);

									game.stage.graph.addCell(element);
									var view = element
											.findView(game.stage.paper);
									view.$box[0].id = nodeId;

									game.stage.loadCustomEvent(elementName);

									game.stage.updateProgress();
								}
								// -----------------------------------------------------
								// else
								if (type == "Edge") {

									var edgeId = CreateId();
									var edgeModel = game.levels[game.currentLevel]
											.addEdge(edgeId);

									var width = $(event.originalEvent.target)[0].clientWidth;
									var height = $(event.originalEvent.target)[0].clientHeight;

									//var link = new joint.shapes.custom[elementName]({
									var link = new joint.dia.Link({
										target : {
											x : paperPoint.x + width / 2,
											y : paperPoint.y - height / 2
										},
										source : {
											x : paperPoint.x - width / 2,
											y : paperPoint.y + height / 2
										},
										identity : edgeId,
										model : edgeModel
									});

									link
											.on(
													'change:source',
													function() {
														var sourceElement = link
																.getSourceElement();
														var targetElement = link
																.getTargetElement();
														if (sourceElement != null) {
															this.attributes.model.sourceId = sourceElement.attributes.identity;
														} else {
															this.attributes.model.sourceId = null;
														}

														if (targetElement != null
																&& targetElement != null) {
															game.levels[game.currentLevel]
																	.evaluateObjectives();
														}
													});

									link
											.on(
													'change:target',
													function() {
														var sourceElement = link
																.getSourceElement();
														var targetElement = link
																.getTargetElement();
														if (targetElement != null) {
															this.attributes.model.targetId = targetElement.attributes.identity;

														} else {
															this.attributes.model.targetId = null;
														}

														if (targetElement != null
																&& targetElement != null) {
															game.levels[game.currentLevel]
																	.evaluateObjectives();
														}
													});
									
//									link.attr({
//									    '.connection': { stroke: 'black' },
//									    '.marker-source': { fill: 'black', d: 'M 0 0 L 0 0 L 0 0 z' },
//									    '.marker-target': { fill: 'black', d: 'M 10 0 L 0 5 L 10 10 z' }
//									});
									var attributes = window[elementName + "Cell"]();
									link.attr(attributes);
									
									game.stage.graph.addCell(link);
									game.stage.loadCustomEvent(elementName);
									game.stage.updateProgress();
								}
							}
						});
	}

	this.loadCSS = function() {
		var modellingType = game.levels[game.currentLevel].modellingType;
		
		var request = new XMLHttpRequest;
		request.onloadend = function() {
			listFiles(modellingType)
		};
		request.open("GET", "ListFiles?ModellingType=" + modellingType
				+ "&Type=css", false);
		request.send();

		function listFiles(modellingType) {
			var files = JSON.parse(request.responseText);
			
			for (var i = 0; i < files.length; i++) {
				
				var path = "common/template/" + modellingType + "/css/"
						+ files[i];
				var elementId = files[i].split(".")[1];
				
				//remove first
				var child = document.getElementById(path);
				if (child != null){
					var parent = document.getElementsByTagName('head')[0];
					parent.removeChild(child);
				}
				
				//add then				
				var link = document.createElement('link');
				link.setAttribute('id', path);
				link.setAttribute('rel', 'stylesheet');
				link.setAttribute('type', 'text/css');
				link.setAttribute('href', path);
				document.getElementsByTagName('head')[0].appendChild(link);
			}
		}
	}
}