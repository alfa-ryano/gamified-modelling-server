/**
 */
package objectmodelling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see objectmodelling.ObjectmodellingPackage
 * @generated
 */
public interface ObjectmodellingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjectmodellingFactory eINSTANCE = objectmodelling.impl.ObjectmodellingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Modelling Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelling Type</em>'.
	 * @generated
	 */
	ModellingType createModellingType();

	/**
	 * Returns a new object of class '<em>Object Modelling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Modelling</em>'.
	 * @generated
	 */
	ObjectModelling createObjectModelling();

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
	ObjectmodellingPackage getObjectmodellingPackage();

} //ObjectmodellingFactory
