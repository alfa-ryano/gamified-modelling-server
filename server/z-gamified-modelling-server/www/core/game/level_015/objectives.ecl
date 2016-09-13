rule CompareModels
  match source : source!ObjectModelling
  with target : target!CollaborationModelling {
  
  compare {
    for (edge in target.edges){
        if (edge.type().name = "MessageElement"){
            for (node in source.nodes){
                if (node <> null and edge.source <> null ){
	                if (node.name = edge.source.name){
	                    for (iOperation in node.operations){
	                        if(edge.name = iOperation.name){
	                        "Success".println();
	                        return true;
	                        }
	                    }
	                }
	            }
            }
        }
    }
    "Fail".println();
    return false;
  }
}