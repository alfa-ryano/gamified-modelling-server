/**
 */
package collaborationmodelling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see collaborationmodelling.CollaborationmodellingPackage
 * @generated
 */
public interface CollaborationmodellingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollaborationmodellingFactory eINSTANCE = collaborationmodelling.impl.CollaborationmodellingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Modelling Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelling Type</em>'.
	 * @generated
	 */
	ModellingType createModellingType();

	/**
	 * Returns a new object of class '<em>Collaboration Modelling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collaboration Modelling</em>'.
	 * @generated
	 */
	CollaborationModelling createCollaborationModelling();

	/**
	 * Returns a new object of class '<em>Actor Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Element</em>'.
	 * @generated
	 */
	ActorElement createActorElement();

	/**
	 * Returns a new object of class '<em>Object Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Element</em>'.
	 * @generated
	 */
	ObjectElement createObjectElement();

	/**
	 * Returns a new object of class '<em>Message Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Element</em>'.
	 * @generated
	 */
	MessageElement createMessageElement();

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
	CollaborationmodellingPackage getCollaborationmodellingPackage();

} //CollaborationmodellingFactory
