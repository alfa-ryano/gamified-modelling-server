function ActorElementEvent(source, cellView) {
	var elementName = cellView.model.attributes.type.split(".")[1];
	alert(elementName);
}