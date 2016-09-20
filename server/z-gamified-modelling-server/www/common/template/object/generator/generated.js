try{
    // ModellingType --------------------------------------------------
    var ModellingType = "ObjectModel";
 
    // ObjectModel --------------------------------------------------
    var ObjectModel = function() {
        Graph.call(this);
        this.eClass = "objectmodel#//ObjectModel"
    } 
    ObjectModel.prototype = new Graph();
    ObjectModel.constructor = ObjectModel;
 
    // ObjectElement --------------------------------------------------
    var ObjectElement = function() {
        Node.call(this);
        this.eClass = "objectmodel#//ObjectElement"
    } 
    ObjectElement.prototype = new Node();
    ObjectElement.constructor = ObjectElement;
 
    // LinkElement --------------------------------------------------
    var LinkElement = function() {
        Edge.call(this);
        this.eClass = "objectmodel#//LinkElement"
    } 
    LinkElement.prototype = new Edge();
    LinkElement.constructor = LinkElement;
 
} catch (err) {
    alert("objectmodel: generated.js: " + err.message);
}