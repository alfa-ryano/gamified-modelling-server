//-- PRESENTATION ----------------------------------------------------------------------------------
var Stage = function(game) {
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

    joint.shapes.html = {};
    joint.shapes.html.Element = joint.shapes.basic.Rect.extend({
        defaults: joint.util.deepSupplement({
            type: 'html.Element',
            attrs: {
                rect: {stroke: 'none', 'fill-opacity': 0}
            }
        }, joint.shapes.basic.Rect.prototype.defaults)
    });

    joint.shapes.html.ElementView = joint.dia.ElementView.extend({

        template: [
            '<div class="HtmlIcon">',
            '<button class="delete">x</button>',
            '<div id="HtmlNameObject" class="HtmlContainerIcon">',
            '<div class="HtmlObjectNameText"></div>',
            '</div>',
            '<div id="HtmlSlotObject" class="HtmlContainerIcon">',
            '<div class="HtmlObjectSlotText"></div>',
            '</div>',
            '<div id="HtmlOperationObject" class="HtmlContainerIcon">',
            '<div class="HtmlObjectOperationText"></div>',
            '</div>',
            '</div>'
        ].join(''),

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
            this.$box.find('.HtmlObjectNameText')[0].id = this.model.get('identity');
            this.$box.find('.HtmlObjectSlotText')[0].id = this.model.get('identity');
            this.$box.find('.HtmlObjectOperationText')[0].id = this.model.get('identity');
            
            this.$box.find('.HtmlObjectNameText')[0].innerHTML = this.model.get('model').objectName;
            if (this.model.get('model').properties.length > 0){
            	var properties = this.model.get('model').properties;
            	var text = "";
            	for(var i = 0; i < properties.length;i++){
            		if (i == 0){
            			text += properties[i].text;
            		}else{
            			text += ("<br/>" + properties[i].text);
            		}
            	}
            	this.$box.find('.HtmlObjectSlotText')[0].innerHTML = text;
            }
            if (this.model.get('model').operations.length > 0){
            	var operations = this.model.get('model').operations;
            	var text = "";
            	for(var i = 0; i < properties.length;i++){
            		if (i == 0){
            			text += operations[i].text;
            		}else{
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
        },

        removeBox: function (evt) {
            this.$box.remove();
        }
    });

    //JQuety Functions
    $('#ObjectIcon').draggable({
        opacity: 0.7, helper: "clone",
        start: function (event) {
        }
    });

    $('#LinkIcon').draggable({
        opacity: 0.7, helper: "clone",
        start: function (event) {
        }
    });

    $("#DrawingViewport").droppable({
        drop: function (event, ui) {
            var paperPoint = game.stage.paper.clientToLocalPoint({x: event.clientX, y: event.clientY});

            var elementId = ui.draggable.attr("id");
            var objectName = document.getElementById(elementId).innerHTML;

            if (elementId == "ObjectIcon") {

                var objectName = "";
                var objectId = "element-" + (++game.stage.counter);
                var objectModel = game.levels[game.currentLevel].addObject("", objectId);

                var object = new joint.shapes.html.Element({
                    position: {x: paperPoint.x - game.stage.ICON_WIDTH / 2, y: paperPoint.y - game.stage.ICON_HEIGHT / 2},
                    size: {width: game.stage.ICON_WIDTH, height: game.stage.ICON_HEIGHT},
                    span: "object",
                    name: objectName,
                    identity: objectId,
                    model: objectModel
                });
                game.stage.graph.addCell(object);

                $(".HtmlIcon").droppable({
                    drop: function (event, ui) {
                        //var elementId = $(event.target).attr('id');
                        var source = $(event.originalEvent.target)[0];
                        var name = source.innerHTML;
                        var type =  null;
                        
                        for (var property in DRAGGABLE_ITEM_TYPE) {
                            if (DRAGGABLE_ITEM_TYPE.hasOwnProperty(property)) {
                            	if (source.className.indexOf(DRAGGABLE_ITEM_TYPE[property]) > -1){
                            		type = DRAGGABLE_ITEM_TYPE[property];
                            	}
                            }
                        }
                        
                        // change name only first time/once on screen
                        var target = null;
                        if (type == DRAGGABLE_ITEM_TYPE.OBJECT){
                        	target = $(event.target).find(".HtmlObjectNameText")[0];
                        }else if (type == DRAGGABLE_ITEM_TYPE.SLOT){
                        	target = $(event.target).find(".HtmlObjectSlotText")[0];
                    	}
                        else if (type == DRAGGABLE_ITEM_TYPE.OPERATION){
                        	target = $(event.target).find(".HtmlObjectOperationText")[0];
                    	}
                        
                        if (target.innerHTML.indexOf(name) < 0){
                        	if (target.innerHTML==""){
                        		target.innerHTML += name;
                        	}else{
                        		target.innerHTML += ("<br/>" + name);
                            }
                        }

                        //Persist name change on screen and in model
                        var element = game.stage.graph.get('cells').find(function (cell) {
                            if (cell instanceof joint.dia.Link) return false;
                            if (cell instanceof joint.shapes.html.Element) {
                                if (target.id == cell.attributes.identity) {
                                	if (type == DRAGGABLE_ITEM_TYPE.OBJECT){
	                                	cell.attributes.name = name;
	                                    cell.attributes.model.objectName = name;
	                                    return true;
                                	}else if (type == DRAGGABLE_ITEM_TYPE.SLOT){
                                		var properties = cell.attributes.model.properties;
                                		var alreadyExist = false;
                                		for(var i = 0; i < properties.length; i++){
                                			if (properties[i].text == name){
                                				alreadyExist = true;
                                				console.log("Property already exists");
                                				break;
                                			}
                                		}
                                		if (alreadyExist == false){
                                			console.log("New property");
                                			properties.push(new Property(name));
                                		}
                                	}
                                	else if (type == DRAGGABLE_ITEM_TYPE.OPERATION){
                                		var operations = cell.attributes.model.operations;
                                		var alreadyExist = false;
                                		for(var i = 0; i < operations.length; i++){
                                			if (operations[i].text == name){
                                				alreadyExist = true;
                                				console.log("Operation already exists");
                                				break;
                                			}
                                		}
                                		if (alreadyExist == false){
                                			console.log("New operation");
                                			operations.push(new Operation(name));
                                		}
                                	}
                                }
                            }
                            return false;
                        });
                        
                        game.levels[game.currentLevel].evaluateObjectives();
                    }
                });
                game.stage.updateProgress();
            } else if (elementId == "LinkIcon") {

            	var edgeId = "element-" + (++game.stage.counter);
	            var edgeModel = game.levels[game.currentLevel].addEdge(edgeId);
	             
	            var link = new joint.dia.Link({
	                source: {x: paperPoint.x + game.stage.ICON_WIDTH / 2, y: paperPoint.y - game.stage.ICON_HEIGHT / 2},
	                target: {x: paperPoint.x - game.stage.ICON_WIDTH / 2, y: paperPoint.y + game.stage.ICON_HEIGHT / 2},
	                identity: edgeId,
	                model: edgeModel
	            });
	            
	            link.on('change:source', function() { 
	            	var sourceElement = link.getSourceElement();
	            	var targetElement = link.getTargetElement();
	            	if (sourceElement != null ){
	            		this.attributes.model.sourceIdentity = sourceElement.attributes.identity;
	            	}else{
	            		this.attributes.model.sourceIdentity = null;
	            	}
	            	
	            	if (targetElement != null && targetElement != null){
	            		game.levels[game.currentLevel].evaluateObjectives();
	            	}
	            });
	            
	            link.on('change:target', function() { 
	            	var sourceElement = link.getSourceElement();
	            	var targetElement = link.getTargetElement();
	            	if (targetElement != null ){
	            		this.attributes.model.targetIdentity = targetElement.attributes.identity;
	            		
	            	}else{
	            		this.attributes.model.targetIdentity = null;
	            	}
	            	
	            	if (targetElement != null && targetElement != null){
	            		game.levels[game.currentLevel].evaluateObjectives();
	            	}
	            });
	            game.stage.graph.addCell(link);
            }

        }
    });

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

    this.paper.on('cell:pointerdblclick', function (cellView, evt, x, y) {
        //var element = game.stage.get('cells').find(function (cell) {
        //        if (cell instanceof joint.dia.Link) return false;
        //        if (cell.id === cellView.model.id) {
        //            cellView.$box.css({
        //                    'pointer-events': function () {
        //                        if (cellView.$box.css("pointer-events") == 'none') {
        //                            return 'auto'
        //                        }
        //                    }
        //                }
        //            );
        //            //var input = prompt("Object name: ", "object");
        //            //cellView.$box.find('input')[0].value = input;
        //            return true;
        //        }
        //        return false;
        //    })
        //    ;
    });
    
    this.graph.on("remove", function(cell) { 
    	if (cell instanceof joint.dia.Element){
    		var index = game.levels[game.currentLevel].objects.indexOf(cell.attributes.model);
    		if (index != null){
    			game.levels[game.currentLevel].objects.splice(index, 1);
    		}
    	} else if (cell instanceof joint.dia.Link){
    		var index = game.levels[game.currentLevel].edges.indexOf(cell.attributes.model);
    		if (index != null){
    			game.levels[game.currentLevel].edges.splice(index, 1);
    		}
    	}
    	
    	game.stage.updateProgress();
    	game.levels[game.currentLevel].evaluateObjectives();
    });
    
    


//$("#ObjectIcon").on('doubletap', function(event) {
    $(".HtmlIcon").on('doubletap', function (event) {
        try {
            alert("B");
            //var input = prompt("Object name: ", "object");
            //var name = $(event.target).parent("#HtmlObjectIcon").find("HtmlObjectNameText")[0];
            //name.value(input);
        } catch (err) {
            alert(err.message);
        }
    });


    // other functions
    this.showDialog =function() {
        document.getElementById("dialog-background").style.visibility = "visible";
        document.getElementById("dialog-next").style.visibility = "visible";
    }
    
    this.closeDialog = function() {
        document.getElementById("dialog-background").style.visibility = "collapse";
        document.getElementById("dialog-next").style.visibility = "collapse";
    }
    document.getElementById("button-continue").onclick = this.closeDialog;
    
    this.updateProgress = function(){
    	//var objectValue = game.levels[game.currentLevel].objects.length;
    	var nodeValue = game.stage.graph.getElements().length;
    	document.getElementById("NodeValue").innerHTML = nodeValue;
    	var edgeValue = game.stage.graph.getLinks().length;
    	document.getElementById("EdgeValue").innerHTML = edgeValue;
    }
    
    
    this.setDraggableItems = function(level){
    	
    	var div = document.getElementById("DraggableItems");
		while (div.hasChildNodes()) {
			div.removeChild(div.lastChild);
		}
		for (var i = 0; i < level.levelCase.draggableItems.length; i++) {
			var draggableItem = level.levelCase.draggableItems[i];
			var newSpan = document.createElement("span");

				newSpan.className = "DraggableCaseItem";
				newSpan.id = draggableItem.identity;
				newSpan.innerHTML = "";
				newSpan.innerHTML = draggableItem.text;
				div.appendChild(newSpan);
			
				if (draggableItem.type == DRAGGABLE_ITEM_TYPE.OBJECT){
					newSpan.className += " " + DRAGGABLE_ITEM_TYPE.OBJECT;
				}else if (draggableItem.type == DRAGGABLE_ITEM_TYPE.SLOT){
					newSpan.className += " " + DRAGGABLE_ITEM_TYPE.SLOT;
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
    
    this.setObjectives = function(level){
    	var ol = document.getElementById("Objective");
		ol.style.color = "#000000";
		while (ol.hasChildNodes()) {
			ol.removeChild(ol.lastChild);
		}
		for (var i = 0; i < level.objectives.length; i++) {
			var li = document.createElement("li");
			li.style.color = "#000000";
			li.id = level.objectives[i].objectiveName;
			var text = document
					.createTextNode(level.objectives[i].description);
			li.appendChild(text);
			ol.appendChild(li);
		}
    }
    
}  