rule CompareModels
  match source : source!ObjectModelling
  with target : target!ObjectModelling {
  
  compare {
    return true;  
  }
}