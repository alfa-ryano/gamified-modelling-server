/**
 */
package classmodel.impl;

import classmodel.ClassElement;
import classmodel.ClassModel;
import classmodel.ClassmodelFactory;
import classmodel.ClassmodelPackage;
import classmodel.ModellingType;
import classmodel.RelationshipElement;

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
public class ClassmodelPackageImpl extends EPackageImpl implements ClassmodelPackage {
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
	private EClass classModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipElementEClass = null;

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
	 * @see classmodel.ClassmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClassmodelPackageImpl() {
		super(eNS_URI, ClassmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ClassmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClassmodelPackage init() {
		if (isInited) return (ClassmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ClassmodelPackage.eNS_URI);

		// Obtain or create and register package
		ClassmodelPackageImpl theClassmodelPackage = (ClassmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClassmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClassmodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GraphmodelPackageImpl theGraphmodelPackage = (GraphmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GraphmodelPackage.eNS_URI) instanceof GraphmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GraphmodelPackage.eNS_URI) : GraphmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theClassmodelPackage.createPackageContents();
		theGraphmodelPackage.createPackageContents();

		// Initialize created meta-data
		theClassmodelPackage.initializePackageContents();
		theGraphmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theClassmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClassmodelPackage.eNS_URI, theClassmodelPackage);
		return theClassmodelPackage;
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
	public EClass getClassModel() {
		return classModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassElement() {
		return classElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipElement() {
		return relationshipElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassmodelFactory getClassmodelFactory() {
		return (ClassmodelFactory)getEFactoryInstance();
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

		classModelEClass = createEClass(CLASS_MODEL);

		classElementEClass = createEClass(CLASS_ELEMENT);

		relationshipElementEClass = createEClass(RELATIONSHIP_ELEMENT);
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
		classModelEClass.getESuperTypes().add(theGraphmodelPackage.getGraph());
		classElementEClass.getESuperTypes().add(theGraphmodelPackage.getNode());
		relationshipElementEClass.getESuperTypes().add(theGraphmodelPackage.getEdge());

		// Initialize classes and features; add operations and parameters
		initEClass(modellingTypeEClass, ModellingType.class, "ModellingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModellingType_Name(), ecorePackage.getEString(), "name", "ClassModel", 0, 1, ModellingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classModelEClass, ClassModel.class, "ClassModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classElementEClass, ClassElement.class, "ClassElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipElementEClass, RelationshipElement.class, "RelationshipElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ClassmodelPackageImpl
