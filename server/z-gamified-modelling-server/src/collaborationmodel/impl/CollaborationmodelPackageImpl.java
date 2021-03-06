/**
 */
package collaborationmodel.impl;

import collaborationmodel.ActorElement;
import collaborationmodel.CollaborationModel;
import collaborationmodel.CollaborationmodelFactory;
import collaborationmodel.CollaborationmodelPackage;
import collaborationmodel.LinkElement;
import collaborationmodel.MessageElement;
import collaborationmodel.ModellingType;
import collaborationmodel.ObjectElement;

import graphmodel.GraphmodelPackage;

import graphmodel.impl.GraphmodelPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollaborationmodelPackageImpl extends EPackageImpl implements CollaborationmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modellingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see collaborationmodel.CollaborationmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CollaborationmodelPackageImpl() {
		super(eNS_URI, CollaborationmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CollaborationmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CollaborationmodelPackage init() {
		if (isInited) return (CollaborationmodelPackage)EPackage.Registry.INSTANCE.getEPackage(CollaborationmodelPackage.eNS_URI);

		// Obtain or create and register package
		CollaborationmodelPackageImpl theCollaborationmodelPackage = (CollaborationmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CollaborationmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CollaborationmodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GraphmodelPackageImpl theGraphmodelPackage = (GraphmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GraphmodelPackage.eNS_URI) instanceof GraphmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GraphmodelPackage.eNS_URI) : GraphmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theCollaborationmodelPackage.createPackageContents();
		theGraphmodelPackage.createPackageContents();

		// Initialize created meta-data
		theCollaborationmodelPackage.initializePackageContents();
		theGraphmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCollaborationmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CollaborationmodelPackage.eNS_URI, theCollaborationmodelPackage);
		return theCollaborationmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModellingType() {
		return modellingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModellingType_Name() {
		return (EAttribute)modellingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaborationModel() {
		return collaborationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorElement() {
		return actorElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectElement() {
		return objectElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageElement() {
		return messageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkElement() {
		return linkElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationmodelFactory getCollaborationmodelFactory() {
		return (CollaborationmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modellingTypeEClass = createEClass(MODELLING_TYPE);
		createEAttribute(modellingTypeEClass, MODELLING_TYPE__NAME);

		collaborationModelEClass = createEClass(COLLABORATION_MODEL);

		actorElementEClass = createEClass(ACTOR_ELEMENT);

		objectElementEClass = createEClass(OBJECT_ELEMENT);

		messageElementEClass = createEClass(MESSAGE_ELEMENT);

		linkElementEClass = createEClass(LINK_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GraphmodelPackage theGraphmodelPackage = (GraphmodelPackage)EPackage.Registry.INSTANCE.getEPackage(GraphmodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		collaborationModelEClass.getESuperTypes().add(theGraphmodelPackage.getGraph());
		actorElementEClass.getESuperTypes().add(theGraphmodelPackage.getNode());
		objectElementEClass.getESuperTypes().add(theGraphmodelPackage.getNode());
		messageElementEClass.getESuperTypes().add(theGraphmodelPackage.getEdge());
		linkElementEClass.getESuperTypes().add(theGraphmodelPackage.getEdge());

		// Initialize classes and features; add operations and parameters
		initEClass(modellingTypeEClass, ModellingType.class, "ModellingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModellingType_Name(), ecorePackage.getEString(), "name", "CollaborationModel", 0, 1, ModellingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collaborationModelEClass, CollaborationModel.class, "CollaborationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actorElementEClass, ActorElement.class, "ActorElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectElementEClass, ObjectElement.class, "ObjectElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageElementEClass, MessageElement.class, "MessageElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkElementEClass, LinkElement.class, "LinkElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CollaborationmodelPackageImpl
