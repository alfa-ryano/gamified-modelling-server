try{
    // ModellingType --------------------------------------------------
    var ModellingType = "CollaborationModelling";
 
    // CollaborationModelling --------------------------------------------------
    var CollaborationModelling = function() {
        Graph.call(this);
        this.eClass = "collaborationmodelling#//CollaborationModelling"
    } 
    CollaborationModelling.prototype = new Graph();
    CollaborationModelling.constructor = CollaborationModelling;
 
    // ActorElement --------------------------------------------------
    var ActorElement = function() {
        Node.call(this);
        this.eClass = "collaborationmodelling#//ActorElement"
    } 
    ActorElement.prototype = new Node();
    ActorElement.constructor = ActorElement;
 
    // ObjectElement --------------------------------------------------
    var ObjectElement = function() {
        Node.call(this);
        this.eClass = "collaborationmodelling#//ObjectElement"
    } 
    ObjectElement.prototype = new Node();
    ObjectElement.constructor = ObjectElement;
 
    // MessageElement --------------------------------------------------
    var MessageElement = function() {
        Edge.call(this);
        this.eClass = "collaborationmodelling#//MessageElement"
    } 
    MessageElement.prototype = new Edge();
    MessageElement.constructor = MessageElement;
 
    // LinkElement --------------------------------------------------
    var LinkElement = function() {
        Edge.call(this);
        this.eClass = "collaborationmodelling#//LinkElement"
    } 
    LinkElement.prototype = new Edge();
    LinkElement.constructor = LinkElement;
 
} catch (err) {
    alert("collaborationmodelling: generated.js: " + err.message);
}