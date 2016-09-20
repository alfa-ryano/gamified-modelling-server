try{
    // ModellingType --------------------------------------------------
    var ModellingType = "CollaborationModel";
 
    // CollaborationModel --------------------------------------------------
    var CollaborationModel = function() {
        Graph.call(this);
        this.eClass = "collaborationmodel#//CollaborationModel"
    } 
    CollaborationModel.prototype = new Graph();
    CollaborationModel.constructor = CollaborationModel;
 
    // ActorElement --------------------------------------------------
    var ActorElement = function() {
        Node.call(this);
        this.eClass = "collaborationmodel#//ActorElement"
    } 
    ActorElement.prototype = new Node();
    ActorElement.constructor = ActorElement;
 
    // ObjectElement --------------------------------------------------
    var ObjectElement = function() {
        Node.call(this);
        this.eClass = "collaborationmodel#//ObjectElement"
    } 
    ObjectElement.prototype = new Node();
    ObjectElement.constructor = ObjectElement;
 
    // MessageElement --------------------------------------------------
    var MessageElement = function() {
        Edge.call(this);
        this.eClass = "collaborationmodel#//MessageElement"
    } 
    MessageElement.prototype = new Edge();
    MessageElement.constructor = MessageElement;
 
    // LinkElement --------------------------------------------------
    var LinkElement = function() {
        Edge.call(this);
        this.eClass = "collaborationmodel#//LinkElement"
    } 
    LinkElement.prototype = new Edge();
    LinkElement.constructor = LinkElement;
 
} catch (err) {
    alert("collaborationmodel: generated.js: " + err.message);
}