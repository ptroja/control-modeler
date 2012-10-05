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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robmod.robmod.Component;
import robmod.robmod.Handler;
import robmod.robmod.InputPort;
import robmod.robmod.OutputPort;
import robmod.robmod.Property;
import robmod.robmod.RobmodPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robmod.robmod.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link robmod.robmod.impl.ComponentImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link robmod.robmod.impl.ComponentImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link robmod.robmod.impl.ComponentImpl#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link robmod.robmod.impl.ComponentImpl#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link robmod.robmod.impl.ComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link robmod.robmod.impl.ComponentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link robmod.robmod.impl.ComponentImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends EObjectImpl implements Component {
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
	 * The cached value of the '{@link #getComposition() <em>Composition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected EList composition;

	/**
	 * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList handlers;

	/**
	 * The cached value of the '{@link #getInputPorts() <em>Input Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList inputPorts;

	/**
	 * The cached value of the '{@link #getOutputPorts() <em>Output Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList outputPorts;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RobmodPackage.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RobmodPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getComposition() {
		if (composition == null) {
			composition = new EObjectContainmentEList.Resolving(Component.class, this, RobmodPackage.COMPONENT__COMPOSITION);
		}
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHandlers() {
		if (handlers == null) {
			handlers = new EObjectContainmentEList.Resolving(Handler.class, this, RobmodPackage.COMPONENT__HANDLERS);
		}
		return handlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputPorts() {
		if (inputPorts == null) {
			inputPorts = new EObjectContainmentEList.Resolving(InputPort.class, this, RobmodPackage.COMPONENT__INPUT_PORTS);
		}
		return inputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputPorts() {
		if (outputPorts == null) {
			outputPorts = new EObjectContainmentEList.Resolving(OutputPort.class, this, RobmodPackage.COMPONENT__OUTPUT_PORTS);
		}
		return outputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobmodPackage.COMPONENT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RobmodPackage.COMPONENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList.Resolving(Property.class, this, RobmodPackage.COMPONENT__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RobmodPackage.COMPONENT__COMPOSITION:
				return ((InternalEList)getComposition()).basicRemove(otherEnd, msgs);
			case RobmodPackage.COMPONENT__HANDLERS:
				return ((InternalEList)getHandlers()).basicRemove(otherEnd, msgs);
			case RobmodPackage.COMPONENT__INPUT_PORTS:
				return ((InternalEList)getInputPorts()).basicRemove(otherEnd, msgs);
			case RobmodPackage.COMPONENT__OUTPUT_PORTS:
				return ((InternalEList)getOutputPorts()).basicRemove(otherEnd, msgs);
			case RobmodPackage.COMPONENT__PROPERTIES:
				return ((InternalEList)getProperties()).basicRemove(otherEnd, msgs);
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
			case RobmodPackage.COMPONENT__NAME:
				return getName();
			case RobmodPackage.COMPONENT__COMPOSITION:
				return getComposition();
			case RobmodPackage.COMPONENT__HANDLERS:
				return getHandlers();
			case RobmodPackage.COMPONENT__INPUT_PORTS:
				return getInputPorts();
			case RobmodPackage.COMPONENT__OUTPUT_PORTS:
				return getOutputPorts();
			case RobmodPackage.COMPONENT__TYPE:
				return getType();
			case RobmodPackage.COMPONENT__DESCRIPTION:
				return getDescription();
			case RobmodPackage.COMPONENT__PROPERTIES:
				return getProperties();
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
			case RobmodPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case RobmodPackage.COMPONENT__COMPOSITION:
				getComposition().clear();
				getComposition().addAll((Collection)newValue);
				return;
			case RobmodPackage.COMPONENT__HANDLERS:
				getHandlers().clear();
				getHandlers().addAll((Collection)newValue);
				return;
			case RobmodPackage.COMPONENT__INPUT_PORTS:
				getInputPorts().clear();
				getInputPorts().addAll((Collection)newValue);
				return;
			case RobmodPackage.COMPONENT__OUTPUT_PORTS:
				getOutputPorts().clear();
				getOutputPorts().addAll((Collection)newValue);
				return;
			case RobmodPackage.COMPONENT__TYPE:
				setType((String)newValue);
				return;
			case RobmodPackage.COMPONENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RobmodPackage.COMPONENT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection)newValue);
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
			case RobmodPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RobmodPackage.COMPONENT__COMPOSITION:
				getComposition().clear();
				return;
			case RobmodPackage.COMPONENT__HANDLERS:
				getHandlers().clear();
				return;
			case RobmodPackage.COMPONENT__INPUT_PORTS:
				getInputPorts().clear();
				return;
			case RobmodPackage.COMPONENT__OUTPUT_PORTS:
				getOutputPorts().clear();
				return;
			case RobmodPackage.COMPONENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RobmodPackage.COMPONENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RobmodPackage.COMPONENT__PROPERTIES:
				getProperties().clear();
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
			case RobmodPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RobmodPackage.COMPONENT__COMPOSITION:
				return composition != null && !composition.isEmpty();
			case RobmodPackage.COMPONENT__HANDLERS:
				return handlers != null && !handlers.isEmpty();
			case RobmodPackage.COMPONENT__INPUT_PORTS:
				return inputPorts != null && !inputPorts.isEmpty();
			case RobmodPackage.COMPONENT__OUTPUT_PORTS:
				return outputPorts != null && !outputPorts.isEmpty();
			case RobmodPackage.COMPONENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case RobmodPackage.COMPONENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RobmodPackage.COMPONENT__PROPERTIES:
				return properties != null && !properties.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
