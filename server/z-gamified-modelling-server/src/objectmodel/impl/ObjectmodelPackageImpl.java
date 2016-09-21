/**
 */
package objectmodel.impl;

import graphmodel.GraphmodelPackage;

import graphmodel.impl.GraphmodelPackageImpl;

import objectmodel.LinkElement;
import objectmodel.ModellingType;
import objectmodel.ObjectElement;
import objectmodel.ObjectModel;
import objectmodel.ObjectmodelFactory;
import objectmodel.ObjectmodelPackage;

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
public class ObjectmodelPackageImpl extends EPackageImpl implements ObjectmodelPackage {
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
	private EClass objectModelEClass = null;

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
	 * @see objectmodel.ObjectmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ObjectmodelPackageImpl() {
		super(eNS_URI, ObjectmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ObjectmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ObjectmodelPackage init() {
		if (isInited) return (ObjectmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ObjectmodelPackage.eNS_URI);

		// Obtain or create and register package
		ObjectmodelPackageImpl theObjectmodelPackage = (ObjectmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ObjectmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ObjectmodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GraphmodelPackageImpl theGraphmodelPackage = (GraphmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GraphmodelPackage.eNS_URI) instanceof GraphmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GraphmodelPackage.eNS_URI) : GraphmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theObjectmodelPackage.createPackageContents();
		theGraphmodelPackage.createPackageContents();

		// Initialize created meta-data
		theObjectmodelPackage.initializePackageContents();
		theGraphmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theObjectmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ObjectmodelPackage.eNS_URI, theObjectmodelPackage);
		return theObjectmodelPackage;
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
	public EClass getObjectModel() {
		return objectModelEClass;
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
	public EClass getLinkElement() {
		return linkElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectmodelFactory getObjectmodelFactory() {
		return (ObjectmodelFactory)getEFactoryInstance();
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

		objectModelEClass = createEClass(OBJECT_MODEL);

		objectElementEClass = createEClass(OBJECT_ELEMENT);

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
		objectModelEClass.getESuperTypes().add(theGraphmodelPackage.getGraph());
		objectElementEClass.getESuperTypes().add(theGraphmodelPackage.getNode());
		linkElementEClass.getESuperTypes().add(theGraphmodelPackage.getEdge());

		// Initialize classes and features; add operations and parameters
		initEClass(modellingTypeEClass, ModellingType.class, "ModellingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModellingType_Name(), ecorePackage.getEString(), "name", "ObjectModel", 0, 1, ModellingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectModelEClass, ObjectModel.class, "ObjectModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectElementEClass, ObjectElement.class, "ObjectElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkElementEClass, LinkElement.class, "LinkElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ObjectmodelPackageImpl
