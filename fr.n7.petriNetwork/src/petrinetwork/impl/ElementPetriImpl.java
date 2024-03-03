/**
 */
package petrinetwork.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import petrinetwork.ElementPetri;
import petrinetwork.PetrinetworkPackage;
import petrinetwork.ReseauPetri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Petri</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetwork.impl.ElementPetriImpl#getReseaupetri <em>Reseaupetri</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementPetriImpl extends MinimalEObjectImpl.Container implements ElementPetri {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementPetriImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetworkPackage.Literals.ELEMENT_PETRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReseauPetri getReseaupetri() {
		if (eContainerFeatureID() != PetrinetworkPackage.ELEMENT_PETRI__RESEAUPETRI) return null;
		return (ReseauPetri)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReseaupetri(ReseauPetri newReseaupetri, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReseaupetri, PetrinetworkPackage.ELEMENT_PETRI__RESEAUPETRI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReseaupetri(ReseauPetri newReseaupetri) {
		if (newReseaupetri != eInternalContainer() || (eContainerFeatureID() != PetrinetworkPackage.ELEMENT_PETRI__RESEAUPETRI && newReseaupetri != null)) {
			if (EcoreUtil.isAncestor(this, newReseaupetri))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReseaupetri != null)
				msgs = ((InternalEObject)newReseaupetri).eInverseAdd(this, PetrinetworkPackage.RESEAU_PETRI__ELEMENTS, ReseauPetri.class, msgs);
			msgs = basicSetReseaupetri(newReseaupetri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetworkPackage.ELEMENT_PETRI__RESEAUPETRI, newReseaupetri, newReseaupetri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetworkPackage.ELEMENT_PETRI__RESEAUPETRI:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReseaupetri((ReseauPetri)otherEnd, msgs);
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
			case PetrinetworkPackage.ELEMENT_PETRI__RESEAUPETRI:
				return basicSetReseaupetri(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PetrinetworkPackage.ELEMENT_PETRI__RESEAUPETRI:
				return eInternalContainer().eInverseRemove(this, PetrinetworkPackage.RESEAU_PETRI__ELEMENTS, ReseauPetri.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetworkPackage.ELEMENT_PETRI__RESEAUPETRI:
				return getReseaupetri();
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
			case PetrinetworkPackage.ELEMENT_PETRI__RESEAUPETRI:
				setReseaupetri((ReseauPetri)newValue);
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
			case PetrinetworkPackage.ELEMENT_PETRI__RESEAUPETRI:
				setReseaupetri((ReseauPetri)null);
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
			case PetrinetworkPackage.ELEMENT_PETRI__RESEAUPETRI:
				return getReseaupetri() != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementPetriImpl
