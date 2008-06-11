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

import org.open.oasis.docs.wsbpel._2._0.process.executable.Assign;
import org.open.oasis.docs.wsbpel._2._0.process.executable.BooleanExpr;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Compensate;
import org.open.oasis.docs.wsbpel._2._0.process.executable.CompensateScope;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Elseif;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Empty;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExecutablePackage;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Exit;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ExtensionActivity;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Flow;
import org.open.oasis.docs.wsbpel._2._0.process.executable.ForEach;
import org.open.oasis.docs.wsbpel._2._0.process.executable.If;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Invoke;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Pick;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Receive;
import org.open.oasis.docs.wsbpel._2._0.process.executable.RepeatUntil;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Reply;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Rethrow;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Scope;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Sequence;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Throw;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Validate;
import org.open.oasis.docs.wsbpel._2._0.process.executable.Wait;
import org.open.oasis.docs.wsbpel._2._0.process.executable.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elseif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getCompensate <em>Compensate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getCompensateScope <em>Compensate Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getExtensionActivity <em>Extension Activity</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getInvoke <em>Invoke</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getPick <em>Pick</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getRepeatUntil <em>Repeat Until</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getReply <em>Reply</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getRethrow <em>Rethrow</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getThrow <em>Throw</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getWait <em>Wait</em>}</li>
 *   <li>{@link org.open.oasis.docs.wsbpel._2._0.process.executable.impl.ElseifImpl#getWhile <em>While</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElseifImpl extends ExtensibleElementsImpl implements Elseif {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpr condition;

	/**
	 * The cached value of the '{@link #getAssign() <em>Assign</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssign()
	 * @generated
	 * @ordered
	 */
	protected Assign assign;

	/**
	 * The cached value of the '{@link #getCompensate() <em>Compensate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensate()
	 * @generated
	 * @ordered
	 */
	protected Compensate compensate;

	/**
	 * The cached value of the '{@link #getCompensateScope() <em>Compensate Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensateScope()
	 * @generated
	 * @ordered
	 */
	protected CompensateScope compensateScope;

	/**
	 * The cached value of the '{@link #getEmpty() <em>Empty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpty()
	 * @generated
	 * @ordered
	 */
	protected Empty empty;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected Exit exit;

	/**
	 * The cached value of the '{@link #getExtensionActivity() <em>Extension Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionActivity()
	 * @generated
	 * @ordered
	 */
	protected ExtensionActivity extensionActivity;

	/**
	 * The cached value of the '{@link #getFlow() <em>Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected Flow flow;

	/**
	 * The cached value of the '{@link #getForEach() <em>For Each</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForEach()
	 * @generated
	 * @ordered
	 */
	protected ForEach forEach;

	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected If if_;

	/**
	 * The cached value of the '{@link #getInvoke() <em>Invoke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoke()
	 * @generated
	 * @ordered
	 */
	protected Invoke invoke;

	/**
	 * The cached value of the '{@link #getPick() <em>Pick</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPick()
	 * @generated
	 * @ordered
	 */
	protected Pick pick;

	/**
	 * The cached value of the '{@link #getReceive() <em>Receive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceive()
	 * @generated
	 * @ordered
	 */
	protected Receive receive;

	/**
	 * The cached value of the '{@link #getRepeatUntil() <em>Repeat Until</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatUntil()
	 * @generated
	 * @ordered
	 */
	protected RepeatUntil repeatUntil;

	/**
	 * The cached value of the '{@link #getReply() <em>Reply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReply()
	 * @generated
	 * @ordered
	 */
	protected Reply reply;

	/**
	 * The cached value of the '{@link #getRethrow() <em>Rethrow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRethrow()
	 * @generated
	 * @ordered
	 */
	protected Rethrow rethrow;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected Scope scope;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected Sequence sequence;

	/**
	 * The cached value of the '{@link #getThrow() <em>Throw</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrow()
	 * @generated
	 * @ordered
	 */
	protected Throw throw_;

	/**
	 * The cached value of the '{@link #getValidate() <em>Validate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidate()
	 * @generated
	 * @ordered
	 */
	protected Validate validate;

	/**
	 * The cached value of the '{@link #getWait() <em>Wait</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWait()
	 * @generated
	 * @ordered
	 */
	protected Wait wait;

	/**
	 * The cached value of the '{@link #getWhile() <em>While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhile()
	 * @generated
	 * @ordered
	 */
	protected While while_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElseifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutablePackage.Literals.ELSEIF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpr getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(BooleanExpr newCondition, NotificationChain msgs) {
		BooleanExpr oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(BooleanExpr newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assign getAssign() {
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssign(Assign newAssign, NotificationChain msgs) {
		Assign oldAssign = assign;
		assign = newAssign;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__ASSIGN, oldAssign, newAssign);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssign(Assign newAssign) {
		if (newAssign != assign) {
			NotificationChain msgs = null;
			if (assign != null)
				msgs = ((InternalEObject)assign).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__ASSIGN, null, msgs);
			if (newAssign != null)
				msgs = ((InternalEObject)newAssign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__ASSIGN, null, msgs);
			msgs = basicSetAssign(newAssign, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__ASSIGN, newAssign, newAssign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compensate getCompensate() {
		return compensate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompensate(Compensate newCompensate, NotificationChain msgs) {
		Compensate oldCompensate = compensate;
		compensate = newCompensate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__COMPENSATE, oldCompensate, newCompensate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensate(Compensate newCompensate) {
		if (newCompensate != compensate) {
			NotificationChain msgs = null;
			if (compensate != null)
				msgs = ((InternalEObject)compensate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__COMPENSATE, null, msgs);
			if (newCompensate != null)
				msgs = ((InternalEObject)newCompensate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__COMPENSATE, null, msgs);
			msgs = basicSetCompensate(newCompensate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__COMPENSATE, newCompensate, newCompensate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompensateScope getCompensateScope() {
		return compensateScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompensateScope(CompensateScope newCompensateScope, NotificationChain msgs) {
		CompensateScope oldCompensateScope = compensateScope;
		compensateScope = newCompensateScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__COMPENSATE_SCOPE, oldCompensateScope, newCompensateScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensateScope(CompensateScope newCompensateScope) {
		if (newCompensateScope != compensateScope) {
			NotificationChain msgs = null;
			if (compensateScope != null)
				msgs = ((InternalEObject)compensateScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__COMPENSATE_SCOPE, null, msgs);
			if (newCompensateScope != null)
				msgs = ((InternalEObject)newCompensateScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__COMPENSATE_SCOPE, null, msgs);
			msgs = basicSetCompensateScope(newCompensateScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__COMPENSATE_SCOPE, newCompensateScope, newCompensateScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empty getEmpty() {
		return empty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpty(Empty newEmpty, NotificationChain msgs) {
		Empty oldEmpty = empty;
		empty = newEmpty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__EMPTY, oldEmpty, newEmpty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpty(Empty newEmpty) {
		if (newEmpty != empty) {
			NotificationChain msgs = null;
			if (empty != null)
				msgs = ((InternalEObject)empty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__EMPTY, null, msgs);
			if (newEmpty != null)
				msgs = ((InternalEObject)newEmpty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__EMPTY, null, msgs);
			msgs = basicSetEmpty(newEmpty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__EMPTY, newEmpty, newEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exit getExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExit(Exit newExit, NotificationChain msgs) {
		Exit oldExit = exit;
		exit = newExit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__EXIT, oldExit, newExit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExit(Exit newExit) {
		if (newExit != exit) {
			NotificationChain msgs = null;
			if (exit != null)
				msgs = ((InternalEObject)exit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__EXIT, null, msgs);
			if (newExit != null)
				msgs = ((InternalEObject)newExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__EXIT, null, msgs);
			msgs = basicSetExit(newExit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__EXIT, newExit, newExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionActivity getExtensionActivity() {
		return extensionActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionActivity(ExtensionActivity newExtensionActivity, NotificationChain msgs) {
		ExtensionActivity oldExtensionActivity = extensionActivity;
		extensionActivity = newExtensionActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__EXTENSION_ACTIVITY, oldExtensionActivity, newExtensionActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionActivity(ExtensionActivity newExtensionActivity) {
		if (newExtensionActivity != extensionActivity) {
			NotificationChain msgs = null;
			if (extensionActivity != null)
				msgs = ((InternalEObject)extensionActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__EXTENSION_ACTIVITY, null, msgs);
			if (newExtensionActivity != null)
				msgs = ((InternalEObject)newExtensionActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__EXTENSION_ACTIVITY, null, msgs);
			msgs = basicSetExtensionActivity(newExtensionActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__EXTENSION_ACTIVITY, newExtensionActivity, newExtensionActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow getFlow() {
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlow(Flow newFlow, NotificationChain msgs) {
		Flow oldFlow = flow;
		flow = newFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__FLOW, oldFlow, newFlow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlow(Flow newFlow) {
		if (newFlow != flow) {
			NotificationChain msgs = null;
			if (flow != null)
				msgs = ((InternalEObject)flow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__FLOW, null, msgs);
			if (newFlow != null)
				msgs = ((InternalEObject)newFlow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__FLOW, null, msgs);
			msgs = basicSetFlow(newFlow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__FLOW, newFlow, newFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEach getForEach() {
		return forEach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForEach(ForEach newForEach, NotificationChain msgs) {
		ForEach oldForEach = forEach;
		forEach = newForEach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__FOR_EACH, oldForEach, newForEach);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForEach(ForEach newForEach) {
		if (newForEach != forEach) {
			NotificationChain msgs = null;
			if (forEach != null)
				msgs = ((InternalEObject)forEach).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__FOR_EACH, null, msgs);
			if (newForEach != null)
				msgs = ((InternalEObject)newForEach).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__FOR_EACH, null, msgs);
			msgs = basicSetForEach(newForEach, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__FOR_EACH, newForEach, newForEach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If getIf() {
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIf(If newIf, NotificationChain msgs) {
		If oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__IF, oldIf, newIf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf(If newIf) {
		if (newIf != if_) {
			NotificationChain msgs = null;
			if (if_ != null)
				msgs = ((InternalEObject)if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject)newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__IF, null, msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__IF, newIf, newIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoke getInvoke() {
		return invoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvoke(Invoke newInvoke, NotificationChain msgs) {
		Invoke oldInvoke = invoke;
		invoke = newInvoke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__INVOKE, oldInvoke, newInvoke);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoke(Invoke newInvoke) {
		if (newInvoke != invoke) {
			NotificationChain msgs = null;
			if (invoke != null)
				msgs = ((InternalEObject)invoke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__INVOKE, null, msgs);
			if (newInvoke != null)
				msgs = ((InternalEObject)newInvoke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__INVOKE, null, msgs);
			msgs = basicSetInvoke(newInvoke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__INVOKE, newInvoke, newInvoke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pick getPick() {
		return pick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPick(Pick newPick, NotificationChain msgs) {
		Pick oldPick = pick;
		pick = newPick;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__PICK, oldPick, newPick);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPick(Pick newPick) {
		if (newPick != pick) {
			NotificationChain msgs = null;
			if (pick != null)
				msgs = ((InternalEObject)pick).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__PICK, null, msgs);
			if (newPick != null)
				msgs = ((InternalEObject)newPick).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__PICK, null, msgs);
			msgs = basicSetPick(newPick, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__PICK, newPick, newPick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receive getReceive() {
		return receive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceive(Receive newReceive, NotificationChain msgs) {
		Receive oldReceive = receive;
		receive = newReceive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__RECEIVE, oldReceive, newReceive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceive(Receive newReceive) {
		if (newReceive != receive) {
			NotificationChain msgs = null;
			if (receive != null)
				msgs = ((InternalEObject)receive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__RECEIVE, null, msgs);
			if (newReceive != null)
				msgs = ((InternalEObject)newReceive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__RECEIVE, null, msgs);
			msgs = basicSetReceive(newReceive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__RECEIVE, newReceive, newReceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatUntil getRepeatUntil() {
		return repeatUntil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeatUntil(RepeatUntil newRepeatUntil, NotificationChain msgs) {
		RepeatUntil oldRepeatUntil = repeatUntil;
		repeatUntil = newRepeatUntil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__REPEAT_UNTIL, oldRepeatUntil, newRepeatUntil);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatUntil(RepeatUntil newRepeatUntil) {
		if (newRepeatUntil != repeatUntil) {
			NotificationChain msgs = null;
			if (repeatUntil != null)
				msgs = ((InternalEObject)repeatUntil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__REPEAT_UNTIL, null, msgs);
			if (newRepeatUntil != null)
				msgs = ((InternalEObject)newRepeatUntil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__REPEAT_UNTIL, null, msgs);
			msgs = basicSetRepeatUntil(newRepeatUntil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__REPEAT_UNTIL, newRepeatUntil, newRepeatUntil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reply getReply() {
		return reply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReply(Reply newReply, NotificationChain msgs) {
		Reply oldReply = reply;
		reply = newReply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__REPLY, oldReply, newReply);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReply(Reply newReply) {
		if (newReply != reply) {
			NotificationChain msgs = null;
			if (reply != null)
				msgs = ((InternalEObject)reply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__REPLY, null, msgs);
			if (newReply != null)
				msgs = ((InternalEObject)newReply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__REPLY, null, msgs);
			msgs = basicSetReply(newReply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__REPLY, newReply, newReply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rethrow getRethrow() {
		return rethrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRethrow(Rethrow newRethrow, NotificationChain msgs) {
		Rethrow oldRethrow = rethrow;
		rethrow = newRethrow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__RETHROW, oldRethrow, newRethrow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRethrow(Rethrow newRethrow) {
		if (newRethrow != rethrow) {
			NotificationChain msgs = null;
			if (rethrow != null)
				msgs = ((InternalEObject)rethrow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__RETHROW, null, msgs);
			if (newRethrow != null)
				msgs = ((InternalEObject)newRethrow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__RETHROW, null, msgs);
			msgs = basicSetRethrow(newRethrow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__RETHROW, newRethrow, newRethrow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(Scope newScope, NotificationChain msgs) {
		Scope oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__SCOPE, oldScope, newScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(Scope newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(Sequence newSequence, NotificationChain msgs) {
		Sequence oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(Sequence newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throw getThrow() {
		return throw_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrow(Throw newThrow, NotificationChain msgs) {
		Throw oldThrow = throw_;
		throw_ = newThrow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__THROW, oldThrow, newThrow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrow(Throw newThrow) {
		if (newThrow != throw_) {
			NotificationChain msgs = null;
			if (throw_ != null)
				msgs = ((InternalEObject)throw_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__THROW, null, msgs);
			if (newThrow != null)
				msgs = ((InternalEObject)newThrow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__THROW, null, msgs);
			msgs = basicSetThrow(newThrow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__THROW, newThrow, newThrow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validate getValidate() {
		return validate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidate(Validate newValidate, NotificationChain msgs) {
		Validate oldValidate = validate;
		validate = newValidate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__VALIDATE, oldValidate, newValidate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidate(Validate newValidate) {
		if (newValidate != validate) {
			NotificationChain msgs = null;
			if (validate != null)
				msgs = ((InternalEObject)validate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__VALIDATE, null, msgs);
			if (newValidate != null)
				msgs = ((InternalEObject)newValidate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__VALIDATE, null, msgs);
			msgs = basicSetValidate(newValidate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__VALIDATE, newValidate, newValidate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wait getWait() {
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWait(Wait newWait, NotificationChain msgs) {
		Wait oldWait = wait;
		wait = newWait;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__WAIT, oldWait, newWait);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWait(Wait newWait) {
		if (newWait != wait) {
			NotificationChain msgs = null;
			if (wait != null)
				msgs = ((InternalEObject)wait).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__WAIT, null, msgs);
			if (newWait != null)
				msgs = ((InternalEObject)newWait).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__WAIT, null, msgs);
			msgs = basicSetWait(newWait, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__WAIT, newWait, newWait));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While getWhile() {
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhile(While newWhile, NotificationChain msgs) {
		While oldWhile = while_;
		while_ = newWhile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__WHILE, oldWhile, newWhile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhile(While newWhile) {
		if (newWhile != while_) {
			NotificationChain msgs = null;
			if (while_ != null)
				msgs = ((InternalEObject)while_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__WHILE, null, msgs);
			if (newWhile != null)
				msgs = ((InternalEObject)newWhile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutablePackage.ELSEIF__WHILE, null, msgs);
			msgs = basicSetWhile(newWhile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutablePackage.ELSEIF__WHILE, newWhile, newWhile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutablePackage.ELSEIF__CONDITION:
				return basicSetCondition(null, msgs);
			case ExecutablePackage.ELSEIF__ASSIGN:
				return basicSetAssign(null, msgs);
			case ExecutablePackage.ELSEIF__COMPENSATE:
				return basicSetCompensate(null, msgs);
			case ExecutablePackage.ELSEIF__COMPENSATE_SCOPE:
				return basicSetCompensateScope(null, msgs);
			case ExecutablePackage.ELSEIF__EMPTY:
				return basicSetEmpty(null, msgs);
			case ExecutablePackage.ELSEIF__EXIT:
				return basicSetExit(null, msgs);
			case ExecutablePackage.ELSEIF__EXTENSION_ACTIVITY:
				return basicSetExtensionActivity(null, msgs);
			case ExecutablePackage.ELSEIF__FLOW:
				return basicSetFlow(null, msgs);
			case ExecutablePackage.ELSEIF__FOR_EACH:
				return basicSetForEach(null, msgs);
			case ExecutablePackage.ELSEIF__IF:
				return basicSetIf(null, msgs);
			case ExecutablePackage.ELSEIF__INVOKE:
				return basicSetInvoke(null, msgs);
			case ExecutablePackage.ELSEIF__PICK:
				return basicSetPick(null, msgs);
			case ExecutablePackage.ELSEIF__RECEIVE:
				return basicSetReceive(null, msgs);
			case ExecutablePackage.ELSEIF__REPEAT_UNTIL:
				return basicSetRepeatUntil(null, msgs);
			case ExecutablePackage.ELSEIF__REPLY:
				return basicSetReply(null, msgs);
			case ExecutablePackage.ELSEIF__RETHROW:
				return basicSetRethrow(null, msgs);
			case ExecutablePackage.ELSEIF__SCOPE:
				return basicSetScope(null, msgs);
			case ExecutablePackage.ELSEIF__SEQUENCE:
				return basicSetSequence(null, msgs);
			case ExecutablePackage.ELSEIF__THROW:
				return basicSetThrow(null, msgs);
			case ExecutablePackage.ELSEIF__VALIDATE:
				return basicSetValidate(null, msgs);
			case ExecutablePackage.ELSEIF__WAIT:
				return basicSetWait(null, msgs);
			case ExecutablePackage.ELSEIF__WHILE:
				return basicSetWhile(null, msgs);
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
			case ExecutablePackage.ELSEIF__CONDITION:
				return getCondition();
			case ExecutablePackage.ELSEIF__ASSIGN:
				return getAssign();
			case ExecutablePackage.ELSEIF__COMPENSATE:
				return getCompensate();
			case ExecutablePackage.ELSEIF__COMPENSATE_SCOPE:
				return getCompensateScope();
			case ExecutablePackage.ELSEIF__EMPTY:
				return getEmpty();
			case ExecutablePackage.ELSEIF__EXIT:
				return getExit();
			case ExecutablePackage.ELSEIF__EXTENSION_ACTIVITY:
				return getExtensionActivity();
			case ExecutablePackage.ELSEIF__FLOW:
				return getFlow();
			case ExecutablePackage.ELSEIF__FOR_EACH:
				return getForEach();
			case ExecutablePackage.ELSEIF__IF:
				return getIf();
			case ExecutablePackage.ELSEIF__INVOKE:
				return getInvoke();
			case ExecutablePackage.ELSEIF__PICK:
				return getPick();
			case ExecutablePackage.ELSEIF__RECEIVE:
				return getReceive();
			case ExecutablePackage.ELSEIF__REPEAT_UNTIL:
				return getRepeatUntil();
			case ExecutablePackage.ELSEIF__REPLY:
				return getReply();
			case ExecutablePackage.ELSEIF__RETHROW:
				return getRethrow();
			case ExecutablePackage.ELSEIF__SCOPE:
				return getScope();
			case ExecutablePackage.ELSEIF__SEQUENCE:
				return getSequence();
			case ExecutablePackage.ELSEIF__THROW:
				return getThrow();
			case ExecutablePackage.ELSEIF__VALIDATE:
				return getValidate();
			case ExecutablePackage.ELSEIF__WAIT:
				return getWait();
			case ExecutablePackage.ELSEIF__WHILE:
				return getWhile();
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
			case ExecutablePackage.ELSEIF__CONDITION:
				setCondition((BooleanExpr)newValue);
				return;
			case ExecutablePackage.ELSEIF__ASSIGN:
				setAssign((Assign)newValue);
				return;
			case ExecutablePackage.ELSEIF__COMPENSATE:
				setCompensate((Compensate)newValue);
				return;
			case ExecutablePackage.ELSEIF__COMPENSATE_SCOPE:
				setCompensateScope((CompensateScope)newValue);
				return;
			case ExecutablePackage.ELSEIF__EMPTY:
				setEmpty((Empty)newValue);
				return;
			case ExecutablePackage.ELSEIF__EXIT:
				setExit((Exit)newValue);
				return;
			case ExecutablePackage.ELSEIF__EXTENSION_ACTIVITY:
				setExtensionActivity((ExtensionActivity)newValue);
				return;
			case ExecutablePackage.ELSEIF__FLOW:
				setFlow((Flow)newValue);
				return;
			case ExecutablePackage.ELSEIF__FOR_EACH:
				setForEach((ForEach)newValue);
				return;
			case ExecutablePackage.ELSEIF__IF:
				setIf((If)newValue);
				return;
			case ExecutablePackage.ELSEIF__INVOKE:
				setInvoke((Invoke)newValue);
				return;
			case ExecutablePackage.ELSEIF__PICK:
				setPick((Pick)newValue);
				return;
			case ExecutablePackage.ELSEIF__RECEIVE:
				setReceive((Receive)newValue);
				return;
			case ExecutablePackage.ELSEIF__REPEAT_UNTIL:
				setRepeatUntil((RepeatUntil)newValue);
				return;
			case ExecutablePackage.ELSEIF__REPLY:
				setReply((Reply)newValue);
				return;
			case ExecutablePackage.ELSEIF__RETHROW:
				setRethrow((Rethrow)newValue);
				return;
			case ExecutablePackage.ELSEIF__SCOPE:
				setScope((Scope)newValue);
				return;
			case ExecutablePackage.ELSEIF__SEQUENCE:
				setSequence((Sequence)newValue);
				return;
			case ExecutablePackage.ELSEIF__THROW:
				setThrow((Throw)newValue);
				return;
			case ExecutablePackage.ELSEIF__VALIDATE:
				setValidate((Validate)newValue);
				return;
			case ExecutablePackage.ELSEIF__WAIT:
				setWait((Wait)newValue);
				return;
			case ExecutablePackage.ELSEIF__WHILE:
				setWhile((While)newValue);
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
			case ExecutablePackage.ELSEIF__CONDITION:
				setCondition((BooleanExpr)null);
				return;
			case ExecutablePackage.ELSEIF__ASSIGN:
				setAssign((Assign)null);
				return;
			case ExecutablePackage.ELSEIF__COMPENSATE:
				setCompensate((Compensate)null);
				return;
			case ExecutablePackage.ELSEIF__COMPENSATE_SCOPE:
				setCompensateScope((CompensateScope)null);
				return;
			case ExecutablePackage.ELSEIF__EMPTY:
				setEmpty((Empty)null);
				return;
			case ExecutablePackage.ELSEIF__EXIT:
				setExit((Exit)null);
				return;
			case ExecutablePackage.ELSEIF__EXTENSION_ACTIVITY:
				setExtensionActivity((ExtensionActivity)null);
				return;
			case ExecutablePackage.ELSEIF__FLOW:
				setFlow((Flow)null);
				return;
			case ExecutablePackage.ELSEIF__FOR_EACH:
				setForEach((ForEach)null);
				return;
			case ExecutablePackage.ELSEIF__IF:
				setIf((If)null);
				return;
			case ExecutablePackage.ELSEIF__INVOKE:
				setInvoke((Invoke)null);
				return;
			case ExecutablePackage.ELSEIF__PICK:
				setPick((Pick)null);
				return;
			case ExecutablePackage.ELSEIF__RECEIVE:
				setReceive((Receive)null);
				return;
			case ExecutablePackage.ELSEIF__REPEAT_UNTIL:
				setRepeatUntil((RepeatUntil)null);
				return;
			case ExecutablePackage.ELSEIF__REPLY:
				setReply((Reply)null);
				return;
			case ExecutablePackage.ELSEIF__RETHROW:
				setRethrow((Rethrow)null);
				return;
			case ExecutablePackage.ELSEIF__SCOPE:
				setScope((Scope)null);
				return;
			case ExecutablePackage.ELSEIF__SEQUENCE:
				setSequence((Sequence)null);
				return;
			case ExecutablePackage.ELSEIF__THROW:
				setThrow((Throw)null);
				return;
			case ExecutablePackage.ELSEIF__VALIDATE:
				setValidate((Validate)null);
				return;
			case ExecutablePackage.ELSEIF__WAIT:
				setWait((Wait)null);
				return;
			case ExecutablePackage.ELSEIF__WHILE:
				setWhile((While)null);
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
			case ExecutablePackage.ELSEIF__CONDITION:
				return condition != null;
			case ExecutablePackage.ELSEIF__ASSIGN:
				return assign != null;
			case ExecutablePackage.ELSEIF__COMPENSATE:
				return compensate != null;
			case ExecutablePackage.ELSEIF__COMPENSATE_SCOPE:
				return compensateScope != null;
			case ExecutablePackage.ELSEIF__EMPTY:
				return empty != null;
			case ExecutablePackage.ELSEIF__EXIT:
				return exit != null;
			case ExecutablePackage.ELSEIF__EXTENSION_ACTIVITY:
				return extensionActivity != null;
			case ExecutablePackage.ELSEIF__FLOW:
				return flow != null;
			case ExecutablePackage.ELSEIF__FOR_EACH:
				return forEach != null;
			case ExecutablePackage.ELSEIF__IF:
				return if_ != null;
			case ExecutablePackage.ELSEIF__INVOKE:
				return invoke != null;
			case ExecutablePackage.ELSEIF__PICK:
				return pick != null;
			case ExecutablePackage.ELSEIF__RECEIVE:
				return receive != null;
			case ExecutablePackage.ELSEIF__REPEAT_UNTIL:
				return repeatUntil != null;
			case ExecutablePackage.ELSEIF__REPLY:
				return reply != null;
			case ExecutablePackage.ELSEIF__RETHROW:
				return rethrow != null;
			case ExecutablePackage.ELSEIF__SCOPE:
				return scope != null;
			case ExecutablePackage.ELSEIF__SEQUENCE:
				return sequence != null;
			case ExecutablePackage.ELSEIF__THROW:
				return throw_ != null;
			case ExecutablePackage.ELSEIF__VALIDATE:
				return validate != null;
			case ExecutablePackage.ELSEIF__WAIT:
				return wait != null;
			case ExecutablePackage.ELSEIF__WHILE:
				return while_ != null;
		}
		return super.eIsSet(featureID);
	}

} //ElseifImpl
