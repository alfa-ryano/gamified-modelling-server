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
            '<input class="HtmlObjectNameText" type="text" value="" />',
            '</div>',
            '<div id="HtmlSlotObject" class="HtmlContainerIcon">',
            '<input class="HtmlObjectSlotText" type="text" value="" />',
            '</div>',
            '<div id="HtmlOperationObject" class="HtmlContainerIcon">',
            '<input class="HtmlObjectOperationText" type="text" value="" />',
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

            //this.$box.find('input').text(this.model.get('input'));
            //this.$box.find('input').text(this.model.get('name'));
            this.$box.find('.HtmlObjectNameText')[0].value = this.model.get('name');
            this.$box.find('.HtmlObjectNameText')[0].id = this.model.get('identity');
            //this.$box.find('HtmlObjectNameText').text(this.model.get('name'));
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
                        var name;
                        var source = $(event.originalEvent.target)[0];
                        name = source.innerHTML;
                        var target = $(event.target).find(".HtmlObjectNameText")[0];
                        target.value = name;

                        //Perubahan data di layar dan di model
                        var element = game.stage.graph.get('cells').find(function (cell) {
                            if (cell instanceof joint.dia.Link) return false;
                            if (cell instanceof joint.shapes.html.Element) {
                                if (target.id == cell.attributes.identity) {
                                    cell.attributes.name = name;
                                    cell.attributes.model.objectName = name;
                                    return true;
                                }
                            }
                            return false;
                        });
                        
                        game.levels[game.currentLevel].evaluateObjectives();
                    }
                });
                

            } else if (elementId == "LinkIcon") {

                var link = new joint.dia.Link({
                    source: {x: paperPoint.x + game.stage.ICON_WIDTH / 2, y: paperPoint.y - game.stage.ICON_HEIGHT / 2},
                    target: {x: paperPoint.x - game.stage.ICON_WIDTH / 2, y: paperPoint.y + game.stage.ICON_HEIGHT / 2}
                });
                game.stage.graph.addCell(link);
            }
            //else if (elementId == "DraggableCaseItem1") {
            //    var object = new joint.shapes.html.Element({
            //        position: {x: paperPoint.x - game.stage.ICON_WIDTH / 2, y: paperPoint.y - game.stage.ICON_HEIGHT / 2},
            //        size: {width: game.stage.ICON_WIDTH, height: game.stage.ICON_HEIGHT},
            //        span: "object",
            //        name: objectName
            //    });
            //    this.graph.addCell(object);
            //
            //}


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
    	} 
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
    
}


