/**
 */
package robmod.robmod.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robmod.robmod.Handler;
import robmod.robmod.InputPort;
import robmod.robmod.OutputPort;
import robmod.robmod.RobmodPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robmod.robmod.impl.HandlerImpl#getName <em>Name</em>}</li>
 *   <li>{@link robmod.robmod.impl.HandlerImpl#getTrigeredBy <em>Trigered By</em>}</li>
 *   <li>{@link robmod.robmod.impl.HandlerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link robmod.robmod.impl.HandlerImpl#getGenerates <em>Generates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HandlerImpl extends EObjectImpl implements Handler {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrigeredBy() <em>Trigered By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigeredBy()
	 * @generated
	 * @ordered
	 */
	protected EList trigeredBy;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenerates() <em>Generates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerates()
	 * @generated
	 * @ordered
	 */
	protected EList generates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RobmodPackage.Literals.HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobmodPackage.HANDLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTrigeredBy() {
		if (trigeredBy == null) {
			trigeredBy = new EObjectWithInverseResolvingEList.ManyInverse(InputPort.class, this, RobmodPackage.HANDLER__TRIGERED_BY, RobmodPackage.INPUT_PORT__TRIGGER);
		}
		return trigeredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobmodPackage.HANDLER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGenerates() {
		if (generates == null) {
			generates = new EObjectResolvingEList(OutputPort.class, this, RobmodPackage.HANDLER__GENERATES);
		}
		return generates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RobmodPackage.HANDLER__TRIGERED_BY:
				return ((InternalEList)getTrigeredBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RobmodPackage.HANDLER__TRIGERED_BY:
				return ((InternalEList)getTrigeredBy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RobmodPackage.HANDLER__NAME:
				return getName();
			case RobmodPackage.HANDLER__TRIGERED_BY:
				return getTrigeredBy();
			case RobmodPackage.HANDLER__DESCRIPTION:
				return getDescription();
			case RobmodPackage.HANDLER__GENERATES:
				return getGenerates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RobmodPackage.HANDLER__NAME:
				setName((String)newValue);
				return;
			case RobmodPackage.HANDLER__TRIGERED_BY:
				getTrigeredBy().clear();
				getTrigeredBy().addAll((Collection)newValue);
				return;
			case RobmodPackage.HANDLER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RobmodPackage.HANDLER__GENERATES:
				getGenerates().clear();
				getGenerates().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case RobmodPackage.HANDLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RobmodPackage.HANDLER__TRIGERED_BY:
				getTrigeredBy().clear();
				return;
			case RobmodPackage.HANDLER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RobmodPackage.HANDLER__GENERATES:
				getGenerates().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RobmodPackage.HANDLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RobmodPackage.HANDLER__TRIGERED_BY:
				return trigeredBy != null && !trigeredBy.isEmpty();
			case RobmodPackage.HANDLER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RobmodPackage.HANDLER__GENERATES:
				return generates != null && !generates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //HandlerImpl
