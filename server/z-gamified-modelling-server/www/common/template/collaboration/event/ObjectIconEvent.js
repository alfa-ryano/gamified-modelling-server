function ObjectIconEvent(event, ui) {

	// var elementId = $(event.target).attr('id');
	var source = $(event.originalEvent.target)[0];

	if (source.className.indexOf("DraggableCaseItem") <= -1) {
		return false;
	}

	var text = source.innerHTML;
	var name = source.getAttribute("name");
	var type = source.getAttribute("type");
	var value = source.getAttribute("value");
	var valueType = source.getAttribute("valueType");

	// change text only first time/once on screen
	var target = null;
	var htmlIcon = $(event.target).find(".HtmlIcon");

	// Persist text change on screen and in model
	var element = game.stage.graph.get('cells').find(function(cell) {
		if (cell instanceof joint.dia.Link)
			return false;
		if (cell instanceof joint.shapes.custom["ObjectIcon"]) {
			if (htmlIcon.context.id == cell.attributes.identity) {
				if (type == DRAGGABLE_ITEM_TYPE.OBJECT) {
					cell.attributes.text = text;
					cell.attributes.model.name = text;
					return true;
				}
				if (type == DRAGGABLE_ITEM_TYPE.CLASS) {
					cell.attributes.model.className = text;
					return true;
				} else if (type == DRAGGABLE_ITEM_TYPE.SLOT) {
					var properties = cell.attributes.model.properties;
					var alreadyExist = false;
					for (var i = 0; i < properties.length; i++) {
						if (properties[i].name == name) {
							properties[i].text = text;
							properties[i].value = value;
							properties[i].type = valueType;
							alreadyExist = true;
							break;
						}
					}
					if (alreadyExist == false) {
						var property = new Property(text);
						property.name = name;
						property.value = value;
						property.type = valueType;
						properties.push(property);
					}
					return true;
				} else if (type == DRAGGABLE_ITEM_TYPE.OPERATION) {
					var operations = cell.attributes.model.operations;
					var alreadyExist = false;
					for (var i = 0; i < operations.length; i++) {
						if (operations[i].name == name) {
							operations[i].text = text;
							alreadyExist = true;
							console.log("Operation already exists");
							break;
						}
					}
					if (alreadyExist == false) {
						console.log("New operation");
						var operation = new Operation(text);
						operation.name = name;
						operations.push(operation);
					}
					return true;
				}
			}
		}
		return false;
	});

	// Update bounding box size
	var view = element.findView(game.stage.paper);
	if (view != null) {
		view.updateBox();
	}

	// do evaluation if objectives are met
	game.levels[game.currentLevel].evaluateObjectives();
	game.stage.updateProgress();
}