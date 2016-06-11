/**
 */
package objectmodel;

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
 * @see objectmodel.ObjectmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ObjectmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "objectmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.york.gamified.modelling.objectmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.york.gamified.modelling.objectmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjectmodelPackage eINSTANCE = objectmodel.impl.ObjectmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link objectmodel.impl.ObjectModelImpl <em>Object Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmodel.impl.ObjectModelImpl
	 * @see objectmodel.impl.ObjectmodelPackageImpl#getObjectModel()
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
	 * The meta object id for the '{@link objectmodel.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmodel.impl.ObjectImpl
	 * @see objectmodel.impl.ObjectmodelPackageImpl#getObject()
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
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link objectmodel.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objectmodel.impl.LinkImpl
	 * @see objectmodel.impl.ObjectmodelPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 2;

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
	 * Returns the meta object for class '{@link objectmodel.ObjectModel <em>Object Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Model</em>'.
	 * @see objectmodel.ObjectModel
	 * @generated
	 */
	EClass getObjectModel();

	/**
	 * Returns the meta object for the containment reference list '{@link objectmodel.ObjectModel#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see objectmodel.ObjectModel#getObjects()
	 * @see #getObjectModel()
	 * @generated
	 */
	EReference getObjectModel_Objects();

	/**
	 * Returns the meta object for the containment reference list '{@link objectmodel.ObjectModel#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see objectmodel.ObjectModel#getLinks()
	 * @see #getObjectModel()
	 * @generated
	 */
	EReference getObjectModel_Links();

	/**
	 * Returns the meta object for class '{@link objectmodel.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see objectmodel.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link objectmodel.Object#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see objectmodel.Object#getName()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link objectmodel.Object#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity</em>'.
	 * @see objectmodel.Object#getIdentity()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Identity();

	/**
	 * Returns the meta object for class '{@link objectmodel.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see objectmodel.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link objectmodel.Link#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity</em>'.
	 * @see objectmodel.Link#getIdentity()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Identity();

	/**
	 * Returns the meta object for the reference '{@link objectmodel.Link#getFromObject <em>From Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Object</em>'.
	 * @see objectmodel.Link#getFromObject()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_FromObject();

	/**
	 * Returns the meta object for the reference '{@link objectmodel.Link#getToObject <em>To Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Object</em>'.
	 * @see objectmodel.Link#getToObject()
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
	ObjectmodelFactory getObjectmodelFactory();

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
		 * The meta object literal for the '{@link objectmodel.impl.ObjectModelImpl <em>Object Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmodel.impl.ObjectModelImpl
		 * @see objectmodel.impl.ObjectmodelPackageImpl#getObjectModel()
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
		 * The meta object literal for the '{@link objectmodel.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmodel.impl.ObjectImpl
		 * @see objectmodel.impl.ObjectmodelPackageImpl#getObject()
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
		 * The meta object literal for the '{@link objectmodel.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objectmodel.impl.LinkImpl
		 * @see objectmodel.impl.ObjectmodelPackageImpl#getLink()
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

} //ObjectmodelPackage
