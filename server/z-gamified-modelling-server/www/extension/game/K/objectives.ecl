rule CompareModels
  match source : source!ObjectModel
  with target : target!ObjectModel {
  
  compare {
    return true;  
  }
}