/**
 */
package classmodel.impl;

import classmodel.ClassModel;
import classmodel.ClassmodelPackage;

import graphmodel.impl.GraphImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ClassModelImpl extends GraphImpl implements ClassModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassmodelPackage.Literals.CLASS_MODEL;
	}

} //ClassModelImpl
