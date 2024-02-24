/**
 */
package petrinetwork.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import petrinetwork.Arc;
import petrinetwork.PetrinetworkPackage;
import petrinetwork.Place;
import petrinetwork.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetwork.impl.ArcImpl#getSuccesseurPlace <em>Successeur Place</em>}</li>
 *   <li>{@link petrinetwork.impl.ArcImpl#getPredecesseurPlace <em>Predecesseur Place</em>}</li>
 *   <li>{@link petrinetwork.impl.ArcImpl#getPredecesseurTransition <em>Predecesseur Transition</em>}</li>
 *   <li>{@link petrinetwork.impl.ArcImpl#getSuccesseurTransition <em>Successeur Transition</em>}</li>
 *   <li>{@link petrinetwork.impl.ArcImpl#getPoids <em>Poids</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArcImpl extends ElementPetriImpl implements Arc {
	/**
	 * The cached value of the '{@link #getSuccesseurPlace() <em>Successeur Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccesseurPlace()
	 * @generated
	 * @ordered
	 */
	protected Place successeurPlace;

	/**
	 * The cached value of the '{@link #getPredecesseurPlace() <em>Predecesseur Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecesseurPlace()
	 * @generated
	 * @ordered
	 */
	protected Place predecesseurPlace;

	/**
	 * The cached value of the '{@link #getPredecesseurTransition() <em>Predecesseur Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecesseurTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition predecesseurTransition;

	/**
	 * The cached value of the '{@link #getSuccesseurTransition() <em>Successeur Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccesseurTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition successeurTransition;

	/**
	 * The default value of the '{@link #getPoids() <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoids()
	 * @generated
	 * @ordered
	 */
	protected static final int POIDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoids() <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoids()
	 * @generated
	 * @ordered
	 */
	protected int poids = POIDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetworkPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Place getSuccesseurPlace() {
		if (successeurPlace != null && successeurPlace.eIsProxy()) {
			InternalEObject oldSuccesseurPlace = (InternalEObject)successeurPlace;
			successeurPlace = (Place)eResolveProxy(oldSuccesseurPlace);
			if (successeurPlace != oldSuccesseurPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetworkPackage.ARC__SUCCESSEUR_PLACE, oldSuccesseurPlace, successeurPlace));
			}
		}
		return successeurPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetSuccesseurPlace() {
		return successeurPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccesseurPlace(Place newSuccesseurPlace, NotificationChain msgs) {
		Place oldSuccesseurPlace = successeurPlace;
		successeurPlace = newSuccesseurPlace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetworkPackage.ARC__SUCCESSEUR_PLACE, oldSuccesseurPlace, newSuccesseurPlace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuccesseurPlace(Place newSuccesseurPlace) {
		if (newSuccesseurPlace != successeurPlace) {
			NotificationChain msgs = null;
			if (successeurPlace != null)
				msgs = ((InternalEObject)successeurPlace).eInverseRemove(this, PetrinetworkPackage.PLACE__LIEN_AVEC_PREDECESSEUR, Place.class, msgs);
			if (newSuccesseurPlace != null)
				msgs = ((InternalEObject)newSuccesseurPlace).eInverseAdd(this, PetrinetworkPackage.PLACE__LIEN_AVEC_PREDECESSEUR, Place.class, msgs);
			msgs = basicSetSuccesseurPlace(newSuccesseurPlace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetworkPackage.ARC__SUCCESSEUR_PLACE, newSuccesseurPlace, newSuccesseurPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Place getPredecesseurPlace() {
		if (predecesseurPlace != null && predecesseurPlace.eIsProxy()) {
			InternalEObject oldPredecesseurPlace = (InternalEObject)predecesseurPlace;
			predecesseurPlace = (Place)eResolveProxy(oldPredecesseurPlace);
			if (predecesseurPlace != oldPredecesseurPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetworkPackage.ARC__PREDECESSEUR_PLACE, oldPredecesseurPlace, predecesseurPlace));
			}
		}
		return predecesseurPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetPredecesseurPlace() {
		return predecesseurPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredecesseurPlace(Place newPredecesseurPlace, NotificationChain msgs) {
		Place oldPredecesseurPlace = predecesseurPlace;
		predecesseurPlace = newPredecesseurPlace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetworkPackage.ARC__PREDECESSEUR_PLACE, oldPredecesseurPlace, newPredecesseurPlace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredecesseurPlace(Place newPredecesseurPlace) {
		if (newPredecesseurPlace != predecesseurPlace) {
			NotificationChain msgs = null;
			if (predecesseurPlace != null)
				msgs = ((InternalEObject)predecesseurPlace).eInverseRemove(this, PetrinetworkPackage.PLACE__LIEN_AVEC_SUCCESSEUR, Place.class, msgs);
			if (newPredecesseurPlace != null)
				msgs = ((InternalEObject)newPredecesseurPlace).eInverseAdd(this, PetrinetworkPackage.PLACE__LIEN_AVEC_SUCCESSEUR, Place.class, msgs);
			msgs = basicSetPredecesseurPlace(newPredecesseurPlace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetworkPackage.ARC__PREDECESSEUR_PLACE, newPredecesseurPlace, newPredecesseurPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition getPredecesseurTransition() {
		if (predecesseurTransition != null && predecesseurTransition.eIsProxy()) {
			InternalEObject oldPredecesseurTransition = (InternalEObject)predecesseurTransition;
			predecesseurTransition = (Transition)eResolveProxy(oldPredecesseurTransition);
			if (predecesseurTransition != oldPredecesseurTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetworkPackage.ARC__PREDECESSEUR_TRANSITION, oldPredecesseurTransition, predecesseurTransition));
			}
		}
		return predecesseurTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetPredecesseurTransition() {
		return predecesseurTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredecesseurTransition(Transition newPredecesseurTransition, NotificationChain msgs) {
		Transition oldPredecesseurTransition = predecesseurTransition;
		predecesseurTransition = newPredecesseurTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetworkPackage.ARC__PREDECESSEUR_TRANSITION, oldPredecesseurTransition, newPredecesseurTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredecesseurTransition(Transition newPredecesseurTransition) {
		if (newPredecesseurTransition != predecesseurTransition) {
			NotificationChain msgs = null;
			if (predecesseurTransition != null)
				msgs = ((InternalEObject)predecesseurTransition).eInverseRemove(this, PetrinetworkPackage.TRANSITION__LIEN_AVEC_SUCCESSEUR, Transition.class, msgs);
			if (newPredecesseurTransition != null)
				msgs = ((InternalEObject)newPredecesseurTransition).eInverseAdd(this, PetrinetworkPackage.TRANSITION__LIEN_AVEC_SUCCESSEUR, Transition.class, msgs);
			msgs = basicSetPredecesseurTransition(newPredecesseurTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetworkPackage.ARC__PREDECESSEUR_TRANSITION, newPredecesseurTransition, newPredecesseurTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition getSuccesseurTransition() {
		if (successeurTransition != null && successeurTransition.eIsProxy()) {
			InternalEObject oldSuccesseurTransition = (InternalEObject)successeurTransition;
			successeurTransition = (Transition)eResolveProxy(oldSuccesseurTransition);
			if (successeurTransition != oldSuccesseurTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetworkPackage.ARC__SUCCESSEUR_TRANSITION, oldSuccesseurTransition, successeurTransition));
			}
		}
		return successeurTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetSuccesseurTransition() {
		return successeurTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccesseurTransition(Transition newSuccesseurTransition, NotificationChain msgs) {
		Transition oldSuccesseurTransition = successeurTransition;
		successeurTransition = newSuccesseurTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetworkPackage.ARC__SUCCESSEUR_TRANSITION, oldSuccesseurTransition, newSuccesseurTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuccesseurTransition(Transition newSuccesseurTransition) {
		if (newSuccesseurTransition != successeurTransition) {
			NotificationChain msgs = null;
			if (successeurTransition != null)
				msgs = ((InternalEObject)successeurTransition).eInverseRemove(this, PetrinetworkPackage.TRANSITION__LIEN_AVEC_PREDECESSEUR, Transition.class, msgs);
			if (newSuccesseurTransition != null)
				msgs = ((InternalEObject)newSuccesseurTransition).eInverseAdd(this, PetrinetworkPackage.TRANSITION__LIEN_AVEC_PREDECESSEUR, Transition.class, msgs);
			msgs = basicSetSuccesseurTransition(newSuccesseurTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetworkPackage.ARC__SUCCESSEUR_TRANSITION, newSuccesseurTransition, newSuccesseurTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPoids() {
		return poids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoids(int newPoids) {
		int oldPoids = poids;
		poids = newPoids;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetworkPackage.ARC__POIDS, oldPoids, poids));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetworkPackage.ARC__SUCCESSEUR_PLACE:
				if (successeurPlace != null)
					msgs = ((InternalEObject)successeurPlace).eInverseRemove(this, PetrinetworkPackage.PLACE__LIEN_AVEC_PREDECESSEUR, Place.class, msgs);
				return basicSetSuccesseurPlace((Place)otherEnd, msgs);
			case PetrinetworkPackage.ARC__PREDECESSEUR_PLACE:
				if (predecesseurPlace != null)
					msgs = ((InternalEObject)predecesseurPlace).eInverseRemove(this, PetrinetworkPackage.PLACE__LIEN_AVEC_SUCCESSEUR, Place.class, msgs);
				return basicSetPredecesseurPlace((Place)otherEnd, msgs);
			case PetrinetworkPackage.ARC__PREDECESSEUR_TRANSITION:
				if (predecesseurTransition != null)
					msgs = ((InternalEObject)predecesseurTransition).eInverseRemove(this, PetrinetworkPackage.TRANSITION__LIEN_AVEC_SUCCESSEUR, Transition.class, msgs);
				return basicSetPredecesseurTransition((Transition)otherEnd, msgs);
			case PetrinetworkPackage.ARC__SUCCESSEUR_TRANSITION:
				if (successeurTransition != null)
					msgs = ((InternalEObject)successeurTransition).eInverseRemove(this, PetrinetworkPackage.TRANSITION__LIEN_AVEC_PREDECESSEUR, Transition.class, msgs);
				return basicSetSuccesseurTransition((Transition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetworkPackage.ARC__SUCCESSEUR_PLACE:
				return basicSetSuccesseurPlace(null, msgs);
			case PetrinetworkPackage.ARC__PREDECESSEUR_PLACE:
				return basicSetPredecesseurPlace(null, msgs);
			case PetrinetworkPackage.ARC__PREDECESSEUR_TRANSITION:
				return basicSetPredecesseurTransition(null, msgs);
			case PetrinetworkPackage.ARC__SUCCESSEUR_TRANSITION:
				return basicSetSuccesseurTransition(null, msgs);
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
			case PetrinetworkPackage.ARC__SUCCESSEUR_PLACE:
				if (resolve) return getSuccesseurPlace();
				return basicGetSuccesseurPlace();
			case PetrinetworkPackage.ARC__PREDECESSEUR_PLACE:
				if (resolve) return getPredecesseurPlace();
				return basicGetPredecesseurPlace();
			case PetrinetworkPackage.ARC__PREDECESSEUR_TRANSITION:
				if (resolve) return getPredecesseurTransition();
				return basicGetPredecesseurTransition();
			case PetrinetworkPackage.ARC__SUCCESSEUR_TRANSITION:
				if (resolve) return getSuccesseurTransition();
				return basicGetSuccesseurTransition();
			case PetrinetworkPackage.ARC__POIDS:
				return getPoids();
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
			case PetrinetworkPackage.ARC__SUCCESSEUR_PLACE:
				setSuccesseurPlace((Place)newValue);
				return;
			case PetrinetworkPackage.ARC__PREDECESSEUR_PLACE:
				setPredecesseurPlace((Place)newValue);
				return;
			case PetrinetworkPackage.ARC__PREDECESSEUR_TRANSITION:
				setPredecesseurTransition((Transition)newValue);
				return;
			case PetrinetworkPackage.ARC__SUCCESSEUR_TRANSITION:
				setSuccesseurTransition((Transition)newValue);
				return;
			case PetrinetworkPackage.ARC__POIDS:
				setPoids((Integer)newValue);
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
			case PetrinetworkPackage.ARC__SUCCESSEUR_PLACE:
				setSuccesseurPlace((Place)null);
				return;
			case PetrinetworkPackage.ARC__PREDECESSEUR_PLACE:
				setPredecesseurPlace((Place)null);
				return;
			case PetrinetworkPackage.ARC__PREDECESSEUR_TRANSITION:
				setPredecesseurTransition((Transition)null);
				return;
			case PetrinetworkPackage.ARC__SUCCESSEUR_TRANSITION:
				setSuccesseurTransition((Transition)null);
				return;
			case PetrinetworkPackage.ARC__POIDS:
				setPoids(POIDS_EDEFAULT);
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
			case PetrinetworkPackage.ARC__SUCCESSEUR_PLACE:
				return successeurPlace != null;
			case PetrinetworkPackage.ARC__PREDECESSEUR_PLACE:
				return predecesseurPlace != null;
			case PetrinetworkPackage.ARC__PREDECESSEUR_TRANSITION:
				return predecesseurTransition != null;
			case PetrinetworkPackage.ARC__SUCCESSEUR_TRANSITION:
				return successeurTransition != null;
			case PetrinetworkPackage.ARC__POIDS:
				return poids != POIDS_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (poids: ");
		result.append(poids);
		result.append(')');
		return result.toString();
	}

} //ArcImpl
