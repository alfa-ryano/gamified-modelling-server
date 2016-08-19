try{    
    // ModellingType --------------------------------------------------
    var ModellingType = "Graph";
	
    // Entity --------------------------------------------------
	var Entity = function() {
	   this.eClass = "graphmodelling#//Entity"
	   this.ID = CreateId();   
	   this.name;
	   this.text;
	   this.description;
	   this.value;
	   this.type;
	   this.className;
	   this.group;
	   this.category;
	   this.accessModifier;
	   this.x;
	   this.y;
	   this.width;
	   this.height;
	} 
	
    // Graph --------------------------------------------------
    var Graph = function() {
        Entity.call(this);
        this.eClass = "graphmodelling#//Graph"
	    this.nodes = new Array();
	    this.edges = new Array();
    } 
    Graph.prototype = new Entity();
    Graph.constructor = Graph;
	
    // Node --------------------------------------------------
    var Node = function() {
        Entity.call(this);
        this.eClass = "graphmodelling#//Node"
	    this.parentNode;
	    this.subNodes = new Array();
	    this.properties = new Array();
	    this.operations = new Array();
    } 
    Node.prototype = new Entity();
    Node.constructor = Node;
	
    // Property --------------------------------------------------
    var Property = function() {
        Entity.call(this);
        this.eClass = "graphmodelling#//Property"
    } 
    Property.prototype = new Entity();
    Property.constructor = Property;
	
    // Operation --------------------------------------------------
    var Operation = function() {
        Entity.call(this);
        this.eClass = "graphmodelling#//Operation"
    } 
    Operation.prototype = new Entity();
    Operation.constructor = Operation;
	
    // Edge --------------------------------------------------
    var Edge = function() {
        Entity.call(this);
        this.eClass = "graphmodelling#//Edge"
	    this.source;
	    this.target;
    } 
    Edge.prototype = new Entity();
    Edge.constructor = Edge;
	
} catch (err) {
    alert("entity.model.js: " + err.message);
}