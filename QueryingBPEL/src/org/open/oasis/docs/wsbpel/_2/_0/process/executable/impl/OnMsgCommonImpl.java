/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.open.oasis.docs.wsbpel._2._0.process.executable.Correlations;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.FromParts;
import org.open.oasis.docs.wsbpel._2._0.process.executable.OnMsgCommon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On Msg Common</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnMsgCommonImpl#getCorrelations <em>Correlations</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnMsgCommonImpl#getFromParts <em>From Parts</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnMsgCommonImpl#getMessageExchange <em>Message Exchange</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnMsgCommonImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnMsgCommonImpl#getPartnerLink <em>Partner Link</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnMsgCommonImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.OnMsgCommonImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OnMsgCommonImpl extends ExtensibleElementsImpl implements OnMsgCommon {
	/**
	 * The cached value of the '{@link #getCorrelations() <em>Correlations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelations()
	 * @generated
	 * @ordered
	 */
	protected Correlations correlations;

	/**
	 * The cached value of the '{@link #getFromParts() <em>From Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromParts()
	 * @generated
	 * @ordered
	 */
	protected FromParts fromParts;

	/**
	 * The default value of the '{@link #getMessageExchange() <em>Message Exchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageExchange()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EXCHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageExchange() <em>Message Exchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageExchange()
	 * @generated
	 * @ordered
	 */
	protected String messageExchange = MESSAGE_EXCHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected String operation = OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartnerLink() <em>Partner Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerLink()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTNER_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartnerLink() <em>Partner Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerLink()
	 * @generated
	 * @ordered
	 */
	protected String partnerLink = PARTNER_LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortType() <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected static final QName PORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortType() <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected QName portType = PORT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected String variable = VARIABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnMsgCommonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.ON_MSG_COMMON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correlations getCorrelations() {
		return correlations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelations(Correlations newCorrelations, NotificationChain msgs) {
		Correlations oldCorrelations = correlations;
		correlations = newCorrelations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_MSG_COMMON__CORRELATIONS, oldCorrelations, newCorrelations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelations(Correlations newCorrelations) {
		if (newCorrelations != correlations) {
			NotificationChain msgs = null;
			if (correlations != null)
				msgs = ((InternalEObject)correlations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ON_MSG_COMMON__CORRELATIONS, null, msgs);
			if (newCorrelations != null)
				msgs = ((InternalEObject)newCorrelations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ON_MSG_COMMON__CORRELATIONS, null, msgs);
			msgs = basicSetCorrelations(newCorrelations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_MSG_COMMON__CORRELATIONS, newCorrelations, newCorrelations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromParts getFromParts() {
		return fromParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromParts(FromParts newFromParts, NotificationChain msgs) {
		FromParts oldFromParts = fromParts;
		fromParts = newFromParts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_MSG_COMMON__FROM_PARTS, oldFromParts, newFromParts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromParts(FromParts newFromParts) {
		if (newFromParts != fromParts) {
			NotificationChain msgs = null;
			if (fromParts != null)
				msgs = ((InternalEObject)fromParts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ON_MSG_COMMON__FROM_PARTS, null, msgs);
			if (newFromParts != null)
				msgs = ((InternalEObject)newFromParts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ON_MSG_COMMON__FROM_PARTS, null, msgs);
			msgs = basicSetFromParts(newFromParts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_MSG_COMMON__FROM_PARTS, newFromParts, newFromParts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageExchange() {
		return messageExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageExchange(String newMessageExchange) {
		String oldMessageExchange = messageExchange;
		messageExchange = newMessageExchange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_MSG_COMMON__MESSAGE_EXCHANGE, oldMessageExchange, messageExchange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(String newOperation) {
		String oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_MSG_COMMON__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartnerLink() {
		return partnerLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerLink(String newPartnerLink) {
		String oldPartnerLink = partnerLink;
		partnerLink = newPartnerLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_MSG_COMMON__PARTNER_LINK, oldPartnerLink, partnerLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getPortType() {
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortType(QName newPortType) {
		QName oldPortType = portType;
		portType = newPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_MSG_COMMON__PORT_TYPE, oldPortType, portType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		String oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ON_MSG_COMMON__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutablePackage.ON_MSG_COMMON__CORRELATIONS:
				return basicSetCorrelations(null, msgs);
			case ExecutablePackage.ON_MSG_COMMON__FROM_PARTS:
				return basicSetFromParts(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutablePackage.ON_MSG_COMMON__CORRELATIONS:
				return getCorrelations();
			case ExecutablePackage.ON_MSG_COMMON__FROM_PARTS:
				return getFromParts();
			case ExecutablePackage.ON_MSG_COMMON__MESSAGE_EXCHANGE:
				return getMessageExchange();
			case ExecutablePackage.ON_MSG_COMMON__OPERATION:
				return getOperation();
			case ExecutablePackage.ON_MSG_COMMON__PARTNER_LINK:
				return getPartnerLink();
			case ExecutablePackage.ON_MSG_COMMON__PORT_TYPE:
				return getPortType();
			case ExecutablePackage.ON_MSG_COMMON__VARIABLE:
				return getVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExecutablePackage.ON_MSG_COMMON__CORRELATIONS:
				setCorrelations((Correlations)newValue);
				return;
			case ExecutablePackage.ON_MSG_COMMON__FROM_PARTS:
				setFromParts((FromParts)newValue);
				return;
			case ExecutablePackage.ON_MSG_COMMON__MESSAGE_EXCHANGE:
				setMessageExchange((String)newValue);
				return;
			case ExecutablePackage.ON_MSG_COMMON__OPERATION:
				setOperation((String)newValue);
				return;
			case ExecutablePackage.ON_MSG_COMMON__PARTNER_LINK:
				setPartnerLink((String)newValue);
				return;
			case ExecutablePackage.ON_MSG_COMMON__PORT_TYPE:
				setPortType((QName)newValue);
				return;
			case ExecutablePackage.ON_MSG_COMMON__VARIABLE:
				setVariable((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExecutablePackage.ON_MSG_COMMON__CORRELATIONS:
				setCorrelations((Correlations)null);
				return;
			case ExecutablePackage.ON_MSG_COMMON__FROM_PARTS:
				setFromParts((FromParts)null);
				return;
			case ExecutablePackage.ON_MSG_COMMON__MESSAGE_EXCHANGE:
				setMessageExchange(MESSAGE_EXCHANGE_EDEFAULT);
				return;
			case ExecutablePackage.ON_MSG_COMMON__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case ExecutablePackage.ON_MSG_COMMON__PARTNER_LINK:
				setPartnerLink(PARTNER_LINK_EDEFAULT);
				return;
			case ExecutablePackage.ON_MSG_COMMON__PORT_TYPE:
				setPortType(PORT_TYPE_EDEFAULT);
				return;
			case ExecutablePackage.ON_MSG_COMMON__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExecutablePackage.ON_MSG_COMMON__CORRELATIONS:
				return correlations != null;
			case ExecutablePackage.ON_MSG_COMMON__FROM_PARTS:
				return fromParts != null;
			case ExecutablePackage.ON_MSG_COMMON__MESSAGE_EXCHANGE:
				return MESSAGE_EXCHANGE_EDEFAULT == null ? messageExchange != null : !MESSAGE_EXCHANGE_EDEFAULT.equals(messageExchange);
			case ExecutablePackage.ON_MSG_COMMON__OPERATION:
				return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
			case ExecutablePackage.ON_MSG_COMMON__PARTNER_LINK:
				return PARTNER_LINK_EDEFAULT == null ? partnerLink != null : !PARTNER_LINK_EDEFAULT.equals(partnerLink);
			case ExecutablePackage.ON_MSG_COMMON__PORT_TYPE:
				return PORT_TYPE_EDEFAULT == null ? portType != null : !PORT_TYPE_EDEFAULT.equals(portType);
			case ExecutablePackage.ON_MSG_COMMON__VARIABLE:
				return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (messageExchange: ");
		result.append(messageExchange);
		result.append(", operation: ");
		result.append(operation);
		result.append(", partnerLink: ");
		result.append(partnerLink);
		result.append(", portType: ");
		result.append(portType);
		result.append(", variable: ");
		result.append(variable);
		result.append(')');
		return result.toString();
	}

} //OnMsgCommonImpl
