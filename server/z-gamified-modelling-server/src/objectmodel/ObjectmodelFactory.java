/**
 */
package objectmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see objectmodel.ObjectmodelPackage
 * @generated
 */
public interface ObjectmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjectmodelFactory eINSTANCE = objectmodel.impl.ObjectmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Modelling Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelling Type</em>'.
	 * @generated
	 */
	ModellingType createModellingType();

	/**
	 * Returns a new object of class '<em>Object Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Model</em>'.
	 * @generated
	 */
	ObjectModel createObjectModel();

	/**
	 * Returns a new object of class '<em>Object Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Element</em>'.
	 * @generated
	 */
	ObjectElement createObjectElement();

	/**
	 * Returns a new object of class '<em>Link Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Element</em>'.
	 * @generated
	 */
	LinkElement createLinkElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ObjectmodelPackage getObjectmodelPackage();

} //ObjectmodelFactory
