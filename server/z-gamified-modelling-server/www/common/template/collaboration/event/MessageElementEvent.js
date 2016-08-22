function MessageElementEvent(source, cellView) {
	
	var cell = cellView.model;
	var methodText = source.innerHTML;
	
	cell.label(0, { position: 0.5, attrs: {
		text: {text: methodText}
	}});
	cell.attributes.model.name = source.innerHTML;
	console.log(cell.attributes.model.ID + ", " + cell.attributes.model.name);
	game.levels[game.currentLevel].evaluateObjectives();
	
}