/**
 */
package gamifiedmodellingobjectmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gamifiedmodellingobjectmodel.GamifiedmodellingobjectmodelFactory
 * @model kind="package"
 * @generated
 */
public interface GamifiedmodellingobjectmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gamifiedmodellingobjectmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gamefulgrowth.blogspot.co.uk/gamified-modelling/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gamifiedmodellingobjectmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GamifiedmodellingobjectmodelPackage eINSTANCE = gamifiedmodellingobjectmodel.impl.GamifiedmodellingobjectmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link gamifiedmodellingobjectmodel.impl.ObjectModelImpl <em>Object Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamifiedmodellingobjectmodel.impl.ObjectModelImpl
	 * @see gamifiedmodellingobjectmodel.impl.GamifiedmodellingobjectmodelPackageImpl#getObjectModel()
	 * @generated
	 */
	int OBJECT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODEL__OBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODEL__LINKS = 1;

	/**
	 * The number of structural features of the '<em>Object Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link gamifiedmodellingobjectmodel.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamifiedmodellingobjectmodel.impl.ObjectImpl
	 * @see gamifiedmodellingobjectmodel.impl.GamifiedmodellingobjectmodelPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IDENTITY = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OPERATIONS = 3;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link gamifiedmodellingobjectmodel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamifiedmodellingobjectmodel.impl.AttributeImpl
	 * @see gamifiedmodellingobjectmodel.impl.GamifiedmodellingobjectmodelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link gamifiedmodellingobjectmodel.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamifiedmodellingobjectmodel.impl.OperationImpl
	 * @see gamifiedmodellingobjectmodel.impl.GamifiedmodellingobjectmodelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link gamifiedmodellingobjectmodel.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamifiedmodellingobjectmodel.impl.LinkImpl
	 * @see gamifiedmodellingobjectmodel.impl.GamifiedmodellingobjectmodelPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 4;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__IDENTITY = 0;

	/**
	 * The feature id for the '<em><b>From Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__FROM_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>To Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TO_OBJECT = 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link gamifiedmodellingobjectmodel.ObjectModel <em>Object Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Model</em>'.
	 * @see gamifiedmodellingobjectmodel.ObjectModel
	 * @generated
	 */
	EClass getObjectModel();

	/**
	 * Returns the meta object for the containment reference list '{@link gamifiedmodellingobjectmodel.ObjectModel#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see gamifiedmodellingobjectmodel.ObjectModel#getObjects()
	 * @see #getObjectModel()
	 * @generated
	 */
	EReference getObjectModel_Objects();

	/**
	 * Returns the meta object for the containment reference list '{@link gamifiedmodellingobjectmodel.ObjectModel#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see gamifiedmodellingobjectmodel.ObjectModel#getLinks()
	 * @see #getObjectModel()
	 * @generated
	 */
	EReference getObjectModel_Links();

	/**
	 * Returns the meta object for class '{@link gamifiedmodellingobjectmodel.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see gamifiedmodellingobjectmodel.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link gamifiedmodellingobjectmodel.Object#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gamifiedmodellingobjectmodel.Object#getName()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link gamifiedmodellingobjectmodel.Object#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity</em>'.
	 * @see gamifiedmodellingobjectmodel.Object#getIdentity()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Identity();

	/**
	 * Returns the meta object for the containment reference list '{@link gamifiedmodellingobjectmodel.Object#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see gamifiedmodellingobjectmodel.Object#getAttributes()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link gamifiedmodellingobjectmodel.Object#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see gamifiedmodellingobjectmodel.Object#getOperations()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Operations();

	/**
	 * Returns the meta object for class '{@link gamifiedmodellingobjectmodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see gamifiedmodellingobjectmodel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link gamifiedmodellingobjectmodel.Attribute#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see gamifiedmodellingobjectmodel.Attribute#getText()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Text();

	/**
	 * Returns the meta object for class '{@link gamifiedmodellingobjectmodel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see gamifiedmodellingobjectmodel.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link gamifiedmodellingobjectmodel.Operation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see gamifiedmodellingobjectmodel.Operation#getText()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Text();

	/**
	 * Returns the meta object for class '{@link gamifiedmodellingobjectmodel.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see gamifiedmodellingobjectmodel.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link gamifiedmodellingobjectmodel.Link#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity</em>'.
	 * @see gamifiedmodellingobjectmodel.Link#getIdentity()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Identity();

	/**
	 * Returns the meta object for the reference '{@link gamifiedmodellingobjectmodel.Link#getFromObject <em>From Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Object</em>'.
	 * @see gamifiedmodellingobjectmodel.Link#getFromObject()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_FromObject();

	/**
	 * Returns the meta object for the reference '{@link gamifiedmodellingobjectmodel.Link#getToObject <em>To Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Object</em>'.
	 * @see gamifiedmodellingobjectmodel.Link#getToObject()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_ToObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GamifiedmodellingobjectmodelFactory getGamifiedmodellingobjectmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gamifiedmodellingobjectmodel.impl.ObjectModelImpl <em>Object Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamifiedmodellingobjectmodel.impl.ObjectModelImpl
		 * @see gamifiedmodellingobjectmodel.impl.GamifiedmodellingobjectmodelPackageImpl#getObjectModel()
		 * @generated
		 */
		EClass OBJECT_MODEL = eINSTANCE.getObjectModel();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MODEL__OBJECTS = eINSTANCE.getObjectModel_Objects();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MODEL__LINKS = eINSTANCE.getObjectModel_Links();

		/**
		 * The meta object literal for the '{@link gamifiedmodellingobjectmodel.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamifiedmodellingobjectmodel.impl.ObjectImpl
		 * @see gamifiedmodellingobjectmodel.impl.GamifiedmodellingobjectmodelPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__NAME = eINSTANCE.getObject_Name();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__IDENTITY = eINSTANCE.getObject_Identity();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__ATTRIBUTES = eINSTANCE.getObject_Attributes();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__OPERATIONS = eINSTANCE.getObject_Operations();

		/**
		 * The meta object literal for the '{@link gamifiedmodellingobjectmodel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamifiedmodellingobjectmodel.impl.AttributeImpl
		 * @see gamifiedmodellingobjectmodel.impl.GamifiedmodellingobjectmodelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TEXT = eINSTANCE.getAttribute_Text();

		/**
		 * The meta object literal for the '{@link gamifiedmodellingobjectmodel.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamifiedmodellingobjectmodel.impl.OperationImpl
		 * @see gamifiedmodellingobjectmodel.impl.GamifiedmodellingobjectmodelPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__TEXT = eINSTANCE.getOperation_Text();

		/**
		 * The meta object literal for the '{@link gamifiedmodellingobjectmodel.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamifiedmodellingobjectmodel.impl.LinkImpl
		 * @see gamifiedmodellingobjectmodel.impl.GamifiedmodellingobjectmodelPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__IDENTITY = eINSTANCE.getLink_Identity();

		/**
		 * The meta object literal for the '<em><b>From Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__FROM_OBJECT = eINSTANCE.getLink_FromObject();

		/**
		 * The meta object literal for the '<em><b>To Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TO_OBJECT = eINSTANCE.getLink_ToObject();

	}

} //GamifiedmodellingobjectmodelPackage
