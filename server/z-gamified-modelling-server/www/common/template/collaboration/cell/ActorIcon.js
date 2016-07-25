function ActorIcon(elementId, responseText) {
	var xmlString = responseText;

	joint.shapes.custom[elementId] = joint.shapes.basic.Rect.extend({
		defaults : joint.util.deepSupplement({
			type : "custom." + elementId,
			attrs : {
				rect : {
					stroke : 'none',
					'fill-opacity' : 0
				}
			}
		}, joint.shapes.basic.Rect.prototype.defaults)
	});

	joint.shapes.custom[elementId + "View"] = joint.dia.ElementView.extend({

		template : xmlString,

		initialize : function() {
			_.bindAll(this, 'updateBox');
			joint.dia.ElementView.prototype.initialize.apply(this, arguments);
			this.$box = $(_.template(this.template)());
			this.$box.find('.delete').on('click',
					_.bind(this.model.remove, this.model));
			// Update the box position whenever the underlying model changes.
			this.model.on('change', this.updateBox, this);
			// Remove the box when the model gets removed from the graph.
			this.model.on('remove', this.removeBox, this);
			this.updateBox();
		},
		
		render : function() {
			joint.dia.ElementView.prototype.render.apply(this, arguments);
			this.paper.$el.prepend(this.$box);
			this.updateBox();
			return this;
		},
		
		updateBox : function() {
			var bbox = this.model.getBBox();
			this.$box[0].id = this.model.get('identity');

			this.$box.css({
				width : bbox.width,
				height : bbox.height,
				left : bbox.x - 1,
				top : bbox.y - 1
			});

			var identifier = this.$box[0].id;
			var htmlIcon = document.getElementById(identifier);
			if (htmlIcon != null) {
				this.model.resize(htmlIcon.offsetWidth - 2,
						htmlIcon.offsetHeight - 2);
			}
		},

		removeBox : function(evt) {
			this.$box.remove();
		}
	});
}
// end node
