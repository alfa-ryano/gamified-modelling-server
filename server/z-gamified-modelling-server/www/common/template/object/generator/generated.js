try{
	var ObjectModelling = function() {
	    Graph.call(this);
	} 
	ObjectModelling.prototype = new Graph();
	ObjectModelling.constructor = ObjectModelling;
	
	var ObjectElement = function() {
	    Node.call(this);
	} 
	ObjectElement.prototype = new Node();
	ObjectElement.constructor = ObjectElement;
	
	var LinkElement = function() {
	    Edge.call(this);
	} 
	LinkElement.prototype = new Edge();
	LinkElement.constructor = LinkElement;
	
} catch (err) {
    alert(err.message);
}