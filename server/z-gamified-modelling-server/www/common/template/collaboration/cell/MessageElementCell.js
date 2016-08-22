function MessageElementCell(elementName, responseText) {
	joint.shapes.custom[elementName] = joint.dia.Link.extend({
		defaults : joint.util.deepSupplement({
			type : "custom." + elementName,
			attrs : {
				".connection": { stroke: "black" },
				".marker-source": { fill: "black", d: "M 0 0 L 0 0 L 0 0 z" },
				".marker-target": { fill: "black", d: "M 10 0 L 0 5 L 10 10 z" }
			},
			labels: [
			         { position: 0.5, 
			        	 attrs: { 
				        	 text: {text:'',fill: 'black', y:"40"}, 
				        	 rect: { stroke: 'black', 'stroke-width': 0, fill: 'white', 'fill-opacity': 0},
				        	 width:50, height:30 
			        	 }
			         }
			     ]
		}, joint.dia.Link.prototype.defaults)
	});
	
	joint.shapes.custom[elementName + "View"] = joint.dia.LinkView.extend({
		pointerdown: function(evt, x, y){
			var selectedSource = document
			.getElementById(game.levels[game.currentLevel].selectedSourceId);
			if (selectedSource != null && 
					selectedSource.getAttribute("class").split(" ")[0] == "DraggableCaseItem"){
				var elementName = this.model.attributes.type.split(".")[1];
				window[elementName + "Event"](selectedSource, this);
			}else{
				joint.dia.LinkView.prototype.pointerdown.apply(this, arguments);
			}
		}
	});
}
