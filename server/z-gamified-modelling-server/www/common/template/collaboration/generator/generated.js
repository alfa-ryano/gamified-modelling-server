try{
	var CollaborationModelling = function() {
	    Graph.call(this);
	} 
	CollaborationModelling.prototype = new Graph();
	CollaborationModelling.constructor = CollaborationModelling;
	
	var ActorElement = function() {
	    Node.call(this);
	} 
	ActorElement.prototype = new Node();
	ActorElement.constructor = ActorElement;
	
	var ObjectElement = function() {
	    Node.call(this);
	} 
	ObjectElement.prototype = new Node();
	ObjectElement.constructor = ObjectElement;
	
	var MessageElement = function() {
	    Edge.call(this);
	} 
	MessageElement.prototype = new Edge();
	MessageElement.constructor = MessageElement;
	
	var LinkElement = function() {
	    Edge.call(this);
	} 
	LinkElement.prototype = new Edge();
	LinkElement.constructor = LinkElement;
	
} catch (err) {
    alert(err.message);
}