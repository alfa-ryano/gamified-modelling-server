//package org.york.gamified.modelling.server;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.eclipse.epsilon.eol.EolModule;
//import org.eclipse.epsilon.eol.IEolExecutableModule;
//import org.eclipse.epsilon.eol.models.IModel;
//
//public class Eol extends Epsilon {
//  
//  public static void main(String[] args) throws Exception {
//    //new Eol().execute();
//  }
//  
//  @Override
//  public IEolExecutableModule createModule() {
//    return new EolModule();
//  }
//
//  @Override
//  public List<IModel> getModels() throws Exception {
//    List<IModel> models = new ArrayList<IModel>();
//    models.add(createEmfModel("Model", "epsilon/models/Tree.xmi", 
//        "epsilon/models/Tree.ecore", true, true));
//    return models;
//  }
//
//  @Override
//  public String getSource() throws Exception {
//    return "epsilon/eol/Demo.eol";
//  }
//
//  @Override
//  public void postProcess() {
//    
//  }
//  
//}
