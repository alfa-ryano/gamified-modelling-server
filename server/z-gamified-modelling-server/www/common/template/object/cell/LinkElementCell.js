function LinkElementCell(elementName, responseText) {
	joint.shapes.custom[elementName] = joint.dia.Link.extend();
	joint.shapes.custom[elementName + "View"] = joint.dia.LinkView.extend();
}
