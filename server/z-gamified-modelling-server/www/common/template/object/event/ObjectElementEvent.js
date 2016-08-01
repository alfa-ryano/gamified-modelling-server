function ObjectElementEvent(source, cellView) {

	var elementName = cellView.model.attributes.type.split(".")[1];
	var cell = cellView.model;

	var text = source.innerHTML;
	var name = source.getAttribute("name");
	var type = source.getAttribute("type");
	var value = source.getAttribute("value");
	var valueType = source.getAttribute("valueType");

	var target = null;
	var identity = cellView.model.attributes.identity;
	
	if (type == DRAGGABLE_ITEM_TYPE.OBJECT) {
		cell.attributes.text = text;
		cell.attributes.model.name = text;
	}
	if (type == DRAGGABLE_ITEM_TYPE.CLASS) {
		cell.attributes.model.className = text;
	} else if (type == DRAGGABLE_ITEM_TYPE.SLOT) {
		var properties = cell.attributes.model.properties;
		var alreadyExist = false;
		for (var i = 0; i < properties.length; i++) {
			if (properties[i].name == name) {
				properties[i].text = text;
				properties[i].value = value;
				properties[i].type = valueType;
				alreadyExist = true;
			}
		}
		if (alreadyExist == false) {
			var property = new Property(text);
			property.name = name;
			property.value = value;
			property.type = valueType;
			properties.push(property);
		}
	} else if (type == DRAGGABLE_ITEM_TYPE.OPERATION) {
		var operations = cell.attributes.model.operations;
		var alreadyExist = false;
		for (var i = 0; i < operations.length; i++) {
			if (operations[i].name == name) {
				operations[i].text = text;
				alreadyExist = true;
			}
		}
		if (alreadyExist == false) {
			var operation = new Operation(text);
			operation.name = name;
			operations.push(operation);
		}
	}

	// Update bounding box size
	var view = cell.findView(game.stage.paper);
	if (view != null) {
		view.updateBox();
	}

	// do evaluation if objectives are met
	game.levels[game.currentLevel].evaluateObjectives();
	game.stage.updateProgress();
}