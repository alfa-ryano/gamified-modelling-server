try{
    // ModellingType --------------------------------------------------
    var ModellingType = "ObjectModelling";
 
    // ObjectModelling --------------------------------------------------
    var ObjectModelling = function() {
        Graph.call(this);
        this.eClass = "objectmodelling#//ObjectModelling"
    } 
    ObjectModelling.prototype = new Graph();
    ObjectModelling.constructor = ObjectModelling;
 
    // ObjectElement --------------------------------------------------
    var ObjectElement = function() {
        Node.call(this);
        this.eClass = "objectmodelling#//ObjectElement"
    } 
    ObjectElement.prototype = new Node();
    ObjectElement.constructor = ObjectElement;
 
    // LinkElement --------------------------------------------------
    var LinkElement = function() {
        Edge.call(this);
        this.eClass = "objectmodelling#//LinkElement"
    } 
    LinkElement.prototype = new Edge();
    LinkElement.constructor = LinkElement;
 
} catch (err) {
    alert("objectmodelling: generated.js: " + err.message);
}