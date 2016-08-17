//-- PRESENTATION ----------------------------------------------------------------------------------
var Stage = function(game) {
	this.ICON_WIDTH = 100;
	this.ICON_HEIGHT = 90;
	// this.counter = 0;

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
		gridSize : 1,
	// interactive: { labelMove: true, vertexAdd: false }
	});

	// initialize global custom object
	joint.shapes.custom = {};

	// JointJS functions
	this.paper.on('blank:pointerup', function(evt, x, y) {
		if (document.activeElement instanceof HTMLInputElement) {
			document.activeElement.parentNode.parentNode.style.pointerEvents = 'none';
			document.activeElement.blur();
		}
	});

	this.paper.on('cell:pointerdown', function(cellView, evt) {
		var element = game.stage.graph.get('cells').find(function(cell) {
			if (cell instanceof joint.dia.Element && cellView.model.id == cell.id) {
				var selectedSource = document
					.getElementById(game.levels[game.currentLevel].selectedSourceId);
				if (selectedSource != null && selectedSource.getAttribute("class").split(" ")[0] == "DraggableCaseItem") {
					var elementName = cellView.model.attributes.type.split(".")[1];
					window[elementName + "Event"](selectedSource, cellView);
				}
				return true;
			}
			return false;
		});
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
			newSpan.id = draggableItem.ID;
			newSpan.innerHTML = "";
			newSpan.innerHTML = draggableItem.text;
			newSpan.setAttribute("type", draggableItem.type);
			newSpan.setAttribute("name", draggableItem.name);
			newSpan.setAttribute("value", draggableItem.value);
			newSpan.setAttribute("valueType", draggableItem.valueType);

			game.stage.setSelectedItem(newSpan);

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

	this.setLoadingScreen = function(level, theFunction) {
		level = level.toString();
		document.getElementById("PlayBar").style.visibility = "collapse";
		document.getElementById("LevelSelectionScreen").style.visibility = "collapse";
		document.getElementById("LoadingScreen").style.visibility = "visible";
		document.getElementById("LoadingBar").style.visibility = "visible";

		// loading instruction content
		var path = "";
		var pathCSS = "";
		if (level.length == 1) {
			level = "00" + level;
		}
		if (level.length == 2) {
			level = "0" + level;
		}

		if (game.mode == "DEVELOPMENT") {
			path = "development/game/level_" + level + "/instructions.xml";
			pathCSS = "development/game/level_" + level + "/instructions.css";
		} else {
			path = "production/game/level_" + level + "/instructions.xml";
			pathCSS = "production/game/level_" + level + "/instructions.css";
		}




		var loadXML = new XMLHttpRequest;
		loadXML.onload = function() {

			if (loadXML.status !== 200) {
				document.getElementById("Instructions").innerHTML = "";
				return;
			}


			///begin css										
			// remove first
			var child = document.getElementById(path);
			if (child != null) {
				var parent = document.getElementsByTagName('head')[0];
				parent.removeChild(child);
			}

			// add then
			var link = document.createElement('link');
			link.setAttribute('id', pathCSS);
			link.setAttribute('rel', 'stylesheet');
			link.setAttribute('type', 'text/css');
			link.setAttribute('href', pathCSS);
			var head = document.getElementsByTagName('head')[0];
			head.appendChild(link);
			var text = head.innerHTML;
			///end css

			var xmlString = loadXML.responseText.replace(
				/(\r\n|\n|\r|\t)/gm, "");
			var instructions = document.getElementById("Instructions");
			instructions.innerHTML = xmlString;
			var instructionContent = instructions.firstElementChild;
			if (instructionContent.children.length > 0) {
				instructionContent.children[0].style.visibility = "visible";
			}
			if (instructionContent.children.length > 1) {
				for (var i = 1; i < instructionContent.children.length; i++) {
					instructionContent.children[i].style.visibility = "collapse";
				}
				var currentPage = 1;
				var totalPage = instructionContent.children.length;
				document.getElementById("NextButton").onclick = function() {
					currentPage += 1;
					if (currentPage > totalPage) {
						currentPage = totalPage;
					}
					for (var i = 0; i < instructionContent.children.length; i++) {
						instructionContent.children[i].style.visibility = "collapse";
					}
					instructionContent.children[currentPage - 1].style.visibility = "visible";
				}
				document.getElementById("BackButton").onclick = function() {
					currentPage -= 1;
					if (currentPage < 1) {
						currentPage = 1;
					}
					for (var i = 0; i < instructionContent.children.length; i++) {
						instructionContent.children[i].style.visibility = "collapse";
					}
					instructionContent.children[currentPage - 1].style.visibility = "visible";
				}
			}

		};
		loadXML.open("GET", path, false);
		loadXML.send();

		// loading stage
		setTimeout(function() {
			if (theFunction(level - 1)) {
				document.getElementById("LoadingBar").style.visibility = "collapse";
				document.getElementById("PlayBar").style.visibility = "visible";
				document.getElementById("PlayBar").onclick = function() {
					document.getElementById("Instructions").style.visibility = "collapse";
					if (document.getElementById("InstructionContent") != null) {
						document.getElementById("InstructionContent").style.visibility = "collapse";
						for (var x = 0; x < document.getElementById("InstructionContent").children.length; x++) {
							var element = document.getElementById("InstructionContent").children[x];
							element.style.visibility = "collapse";
						}
					}
					document.getElementById("PlayBar").style.visibility = "collapse";
					document.getElementById("LoadingScreen").style.visibility = "collapse";
					document.getElementById("LevelScreen").style.visibility = "visible";
				}
			}
		}, 500);
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
		document.getElementById("LoadingScreenBack").onclick = function() {
			document.getElementById("LevelSelectionScreen").style.visibility = "visible";
			document.getElementById("PlayBar").style.visibility = "collapse";
			document.getElementById("LoadingScreen").style.visibility = "collapse";
			document.getElementById("Instructions").style.visibility = "collapse";
			if (document.getElementById("InstructionContent") != null) {
				document.getElementById("InstructionContent").style.visibility = "collapse";
				for (var x = 0; x < document.getElementById("InstructionContent").children.length; x++) {
					var element = document.getElementById("InstructionContent").children[x];
					element.style.visibility = "collapse";
				}
			}
		}

		document.getElementById("button-replay").onclick = function() {
			game.stage.closeDialog();
			game.stage.setLoadingScreen(game.currentLevel + 1, game.replay);
		}
		document.getElementById("button-next").onclick = function() {
			game.currentLevel += 1;
			game.stage.closeDialog();
			game.stage.setLoadingScreen(game.currentLevel + 1, game.nextLevel);
		};


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
					child.onclick = function() {
						game.stage.closeDialog();
						game.stage.setLoadingScreen(this.innerHTML, game.play);
					}
					storyLevels.appendChild(child);
				}
			}

		}
	}

	this.loadNodeTemplates = function() {
		var modellingType = game.levels[game.currentLevel].modellingType;
		var request = new XMLHttpRequest;
		request.onload = function() {
			listFiles(modellingType)
		};
		request.open("GET", "ListFiles?ModellingType=" + modellingType
			+ "&Type=view", false);
		request.send();
		function listFiles(modellingType) {
			var files = JSON.parse(request.responseText);
			for (var i = 0; i < files.length; i++) {

				var path = "common/template/" + modellingType + "/view/"
				+ files[i];

				var loadXML = new XMLHttpRequest;
				loadXML.onload = function() {
					loadCells(modellingType, loadXML)
				};
				loadXML.open("GET", path, false);
				loadXML.send();

				function loadCells(modellingType, loadXML) {
					var xmlString = loadXML.responseText.replace(
						/(\r\n|\n|\r|\t)/gm, "");
					var parser = new DOMParser();
					var xmlDoc = parser.parseFromString(xmlString, "text/xml");
					var elementName = xmlDoc.firstChild.getAttribute("name");
					var elementType = xmlDoc.firstChild.getAttribute("type");

					// load internal cell function
					var cellPath = "common/template/" + modellingType
						+ "/cell/" + elementName + "Cell.js";

					$.getScript(cellPath,
						function(data, textStatus, jqxhr) {
							// execute internal cell function
							if (elementType == "node") {
								window[elementName + "Cell"](elementName,
									xmlString);
							} else if (elementType == "edge") {
								var parser2 = new DOMParser();
								var doc = parser2.parseFromString(xmlString,
									"text/xml");
								xmlString = doc.firstChild.innerHTML
									.replace(/(\r\n|\n|\r|\t)/gm, "");
								;
								window[elementName + "Cell"](elementName,
									xmlString);
							}
						});

					//load customEvent
					game.stage.loadCustomEvent(elementName);
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
		request.onload = function() {
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
				loadXML.onload = function() {
					setSVG(elementId)
				};
				loadXML.open("GET", xmlFile, false);
				loadXML.send();

				function setSVG(elementId) {
					xmlString += loadXML.responseText;
				}
			}
			xmlString = "<div>" + xmlString + "</div>";
			document.getElementById("Icons").innerHTML = xmlString;
			var div = document.getElementById("Icons").firstElementChild;
			for (var i = 0; i < div.children.length; i++) {
				var element = div.children[i];
				game.stage.setSelectedItem(element);
			}

		}
	}

	this.loadCustomEvent = function(elementName) {
		var modellingType = game.levels[game.currentLevel].modellingType;
		var path = "common/template/" + modellingType + "/event/" + elementName
			+ "Event.js";
		$.getScript(path);
	}

	this.loadDrawingViewportEvent = function() {
		document.getElementById("DrawingViewport").onclick = function(event) {
			// alert("x : " + event.clientX + ", y : " + event.clientY);

			var paperPoint = game.stage.paper.clientToLocalPoint({
				x : event.clientX,
				y : event.clientY
			});

			var selectedSource = document
				.getElementById(game.levels[game.currentLevel].selectedSourceId);

			if (selectedSource == null) {
				return;
			}
			// ///-----------------------------------------------------
			var elementName = selectedSource.getAttribute("name");
			var type = selectedSource.getAttribute("type");

			if (type == "Node") {
			
				var node = new window[elementName]();
				game.levels[game.currentLevel].addNode(node);
				node.name = "";
				var nodeId = node.ID;

				var width = selectedSource.clientWidth;
				var height = selectedSource.clientHeight;

				var element = new joint.shapes.custom[elementName]({
					position : {
						x : paperPoint.x - width / 2,
						y : paperPoint.y - height / 2
					},
					size : {
						width : width,
						height : height
					},
					identity : nodeId,
					model : node
				});
				element.toFront(true);

				game.stage.graph.addCell(element);
				var view = element.findView(game.stage.paper);
				view.$box[0].id = nodeId;

				game.stage.loadCustomEvent(elementName);

				game.stage.updateProgress();

			} else if (type == "Edge") {

				
				var edge = new window[elementName];
				game.levels[game.currentLevel].addEdge(edge);
				var edgeId = edge.ID;

				var width = selectedSource.clientWidth;
				var height = selectedSource.clientHeight;

				var link = new joint.shapes.custom[elementName]({
					// var link = new joint.dia.Link({
					target : {
						x : paperPoint.x + width / 2,
						y : paperPoint.y - height / 2
					},
					source : {
						x : paperPoint.x - width / 2,
						y : paperPoint.y + height / 2
					},
					identity : edgeId,
					model : edge
				});

				link
					.on(
						'change:source',
						function() {
							var sourceElement = link.getSourceElement();
							var targetElement = link.getTargetElement();
							if (sourceElement != null) {
								this.attributes.model.source = sourceElement.attributes.model;
							} else {
								this.attributes.model.source = null;
							}

							if (sourceElement != null
								&& targetElement != null) {
								game.levels[game.currentLevel]
									.evaluateObjectives();
							}
						});

				link
					.on(
						'change:target',
						function() {
							var sourceElement = link.getSourceElement();
							var targetElement = link.getTargetElement();
							if (targetElement != null) {
								this.attributes.model.target = targetElement.attributes.model;

							} else {
								this.attributes.model.target = null;
							}

							if (sourceElement != null
								&& targetElement != null) {
								game.levels[game.currentLevel]
									.evaluateObjectives();
							}
						});

				game.stage.graph.addCell(link);
				game.stage.loadCustomEvent(elementName);
				game.stage.updateProgress();

			}
			game.stage.clearSelectedItem();
		}
	}

	this.loadCSS = function() {
		var modellingType = game.levels[game.currentLevel].modellingType;

		var request = new XMLHttpRequest;
		request.onload = function() {
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

				// remove first
				var child = document.getElementById(path);
				if (child != null) {
					var parent = document.getElementsByTagName('head')[0];
					parent.removeChild(child);
				}

				// add then
				var link = document.createElement('link');
				link.setAttribute('id', path);
				link.setAttribute('rel', 'stylesheet');
				link.setAttribute('type', 'text/css');
				link.setAttribute('href', path);
				document.getElementsByTagName('head')[0].appendChild(link);
			}
		}
	}

	this.setSelectedItem = function(element) {
		element.onclick = function() {
			var selectedSourceId = game.levels[game.currentLevel].selectedSourceId;
			if (selectedSourceId == null) {
				this.style.backgroundColor = "#E0E0E0";
				game.levels[game.currentLevel].selectedSourceId = this.id;
			} else if (selectedSourceId != this.id) {
				document.getElementById(selectedSourceId).style.backgroundColor = "white";
				this.style.backgroundColor = "#E0E0E0";
				game.levels[game.currentLevel].selectedSourceId = this.id;
			} else if (selectedSourceId == this.id) {
				this.style.backgroundColor = "white";
				game.levels[game.currentLevel].selectedSourceId = null;
			}
		}
	}

	this.clearSelectedItem = function() {
		var selectedSourceId = game.levels[game.currentLevel].selectedSourceId;
		if (selectedSourceId != null) {
			document.getElementById(selectedSourceId).style.backgroundColor = "white";
		}
		game.levels[game.currentLevel].selectedSourceId = null;
	}
}