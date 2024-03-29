/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.open.oasis.docs.wsbpel._2._0.process.executable.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.open.oasis.docs.wsbpel._2._0.process.executable.Condition;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SourceImpl#getTransitionCondition <em>Transition Condition</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.SourceImpl#getLinkName <em>Link Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceImpl extends ExtensibleElementsImpl implements Source {
	/**
	 * The cached value of the '{@link #getTransitionCondition() <em>Transition Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition transitionCondition;

	/**
	 * The default value of the '{@link #getLinkName() <em>Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkName()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkName() <em>Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkName()
	 * @generated
	 * @ordered
	 */
	protected String linkName = LINK_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getTransitionCondition() {
		return transitionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitionCondition(Condition newTransitionCondition, NotificationChain msgs) {
		Condition oldTransitionCondition = transitionCondition;
		transitionCondition = newTransitionCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.SOURCE__TRANSITION_CONDITION, oldTransitionCondition, newTransitionCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionCondition(Condition newTransitionCondition) {
		if (newTransitionCondition != transitionCondition) {
			NotificationChain msgs = null;
			if (transitionCondition != null)
				msgs = ((InternalEObject)transitionCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SOURCE__TRANSITION_CONDITION, null, msgs);
			if (newTransitionCondition != null)
				msgs = ((InternalEObject)newTransitionCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.SOURCE__TRANSITION_CONDITION, null, msgs);
			msgs = basicSetTransitionCondition(newTransitionCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SOURCE__TRANSITION_CONDITION, newTransitionCondition, newTransitionCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkName() {
		return linkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkName(String newLinkName) {
		String oldLinkName = linkName;
		linkName = newLinkName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.SOURCE__LINK_NAME, oldLinkName, linkName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutablePackage.SOURCE__TRANSITION_CONDITION:
				return basicSetTransitionCondition(null, msgs);
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
			case ExecutablePackage.SOURCE__TRANSITION_CONDITION:
				return getTransitionCondition();
			case ExecutablePackage.SOURCE__LINK_NAME:
				return getLinkName();
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
			case ExecutablePackage.SOURCE__TRANSITION_CONDITION:
				setTransitionCondition((Condition)newValue);
				return;
			case ExecutablePackage.SOURCE__LINK_NAME:
				setLinkName((String)newValue);
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
			case ExecutablePackage.SOURCE__TRANSITION_CONDITION:
				setTransitionCondition((Condition)null);
				return;
			case ExecutablePackage.SOURCE__LINK_NAME:
				setLinkName(LINK_NAME_EDEFAULT);
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
			case ExecutablePackage.SOURCE__TRANSITION_CONDITION:
				return transitionCondition != null;
			case ExecutablePackage.SOURCE__LINK_NAME:
				return LINK_NAME_EDEFAULT == null ? linkName != null : !LINK_NAME_EDEFAULT.equals(linkName);
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
		result.append(" (linkName: ");
		result.append(linkName);
		result.append(')');
		return result.toString();
	}

} //SourceImpl
