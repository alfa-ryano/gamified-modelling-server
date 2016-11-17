try{
    // ModellingType --------------------------------------------------
    var ModellingType = "ClassModel";
 
    // ClassModel --------------------------------------------------
    var ClassModel = function() {
        Graph.call(this);
        this.eClass = "classmodel#//ClassModel"
    } 
    ClassModel.prototype = new Graph();
    ClassModel.constructor = ClassModel;
 
    // ClassElement --------------------------------------------------
    var ClassElement = function() {
        Node.call(this);
        this.eClass = "classmodel#//ClassElement"
    } 
    ClassElement.prototype = new Node();
    ClassElement.constructor = ClassElement;
 
    // LinkElement --------------------------------------------------
    var LinkElement = function() {
        Edge.call(this);
        this.eClass = "classmodel#//LinkElement"
    } 
    LinkElement.prototype = new Edge();
    LinkElement.constructor = LinkElement;
 
} catch (err) {
    alert("classmodel: generated.js: " + err.message);
}