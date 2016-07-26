function ObjectIcon(elementId, responseText) {
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

			// Prevent paper from handling pointerdown.
			this.$box.find('div input').on('dblclick', function(evt) {
			});

			this.$box.find('input').on('change', _.bind(function(evt) {
				this.model.set('input', $(evt.target).val());
			}, this));

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
			// Set the position and dimension of the box so that it covers the
			// JointJS element.
			var bbox = this.model.getBBox();
			// Example of updating the HTML with a data stored in the cell
			// model.

			// add identity to HTML Icon/the first div inside the box
			this.$box[0].id = this.model.get('identity');

			// set the object name and the class name
			var className = "";
			if (this.model.get('model').className != null
					&& this.model.get('model').className != "") {
				className = ": " + this.model.get('model').className;
			}

			this.$box.find('.HtmlObjectNameText')[0].innerHTML = this.model
					.get('model').name
					+ className;

			// set the attributes/slots
			if (this.model.get('model').properties.length > 0) {
				var properties = this.model.get('model').properties;
				var text = "";
				for (var i = 0; i < properties.length; i++) {
					if (i == 0) {
						text += properties[i].text;
					} else {
						text += ("<br/>" + properties[i].text);
					}
				}
				this.$box.find('.HtmlObjectSlotText')[0].innerHTML = text;
			}

			// set the operations/actions
			if (this.model.get('model').operations.length > 0) {
				var operations = this.model.get('model').operations;
				var text = "";
				for (var i = 0; i < operations.length; i++) {
					if (i == 0) {
						text += operations[i].text;
					} else {
						text += ("<br/>" + operations[i].text);
					}
				}
				this.$box.find('.HtmlObjectOperationText')[0].innerHTML = text;
			}
			this.$box.css({
				width : bbox.width,
				height : bbox.height,
				left : bbox.x - 1,
				top : bbox.y - 1
			});

			var identifier = this.$box[0].id;
			var objectIcon = document.getElementById(identifier);
			if (objectIcon != null) {
				this.model.resize(objectIcon.offsetWidth - 2,
						objectIcon.offsetHeight - 2);
			}
		},

		removeBox : function(evt) {
			this.$box.remove();
		}
	});
}
// end node
