/**
 */
package objectmodel.impl;

import graphmodel.impl.GraphImpl;

import objectmodel.ObjectModel;
import objectmodel.ObjectmodelPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ObjectModelImpl extends GraphImpl implements ObjectModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectmodelPackage.Literals.OBJECT_MODEL;
	}

} //ObjectModelImpl
