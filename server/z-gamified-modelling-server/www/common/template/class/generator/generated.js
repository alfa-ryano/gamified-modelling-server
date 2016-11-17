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
 
    // RelationshipElement --------------------------------------------------
    var RelationshipElement = function() {
        Edge.call(this);
        this.eClass = "classmodel#//RelationshipElement"
    } 
    RelationshipElement.prototype = new Edge();
    RelationshipElement.constructor = RelationshipElement;
 
} catch (err) {
    alert("classmodel: generated.js: " + err.message);
}