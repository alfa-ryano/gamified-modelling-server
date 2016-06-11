/**
 */
package gamifiedmodellingobjectmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelPackage
 * @generated
 */
public interface GamifiedmodellingobjectmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GamifiedmodellingobjectmodelFactory eINSTANCE = gamifiedmodellingobjectmodel.impl.GamifiedmodellingobjectmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Object Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Model</em>'.
	 * @generated
	 */
	ObjectModel createObjectModel();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	Object createObject();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GamifiedmodellingobjectmodelPackage getGamifiedmodellingobjectmodelPackage();

} //GamifiedmodellingobjectmodelFactory
