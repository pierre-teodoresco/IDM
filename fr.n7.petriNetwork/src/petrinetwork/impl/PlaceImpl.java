/**
 */
package petrinetwork.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinetwork.Arc;
import petrinetwork.PetrinetworkPackage;
import petrinetwork.Place;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetwork.impl.PlaceImpl#getLienAvecPredecesseur <em>Lien Avec Predecesseur</em>}</li>
 *   <li>{@link petrinetwork.impl.PlaceImpl#getLienAvecSuccesseur <em>Lien Avec Successeur</em>}</li>
 *   <li>{@link petrinetwork.impl.PlaceImpl#getNbJetons <em>Nb Jetons</em>}</li>
 *   <li>{@link petrinetwork.impl.PlaceImpl#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends ElementPetriImpl implements Place {
	/**
	 * The cached value of the '{@link #getLienAvecPredecesseur() <em>Lien Avec Predecesseur</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienAvecPredecesseur()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> lienAvecPredecesseur;

	/**
	 * The cached value of the '{@link #getLienAvecSuccesseur() <em>Lien Avec Successeur</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienAvecSuccesseur()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> lienAvecSuccesseur;

	/**
	 * The default value of the '{@link #getNbJetons() <em>Nb Jetons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbJetons()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_JETONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbJetons() <em>Nb Jetons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbJetons()
	 * @generated
	 * @ordered
	 */
	protected int nbJetons = NB_JETONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetworkPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Arc> getLienAvecPredecesseur() {
		if (lienAvecPredecesseur == null) {
			lienAvecPredecesseur = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetrinetworkPackage.PLACE__LIEN_AVEC_PREDECESSEUR, PetrinetworkPackage.ARC__SUCCESSEUR_PLACE);
		}
		return lienAvecPredecesseur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Arc> getLienAvecSuccesseur() {
		if (lienAvecSuccesseur == null) {
			lienAvecSuccesseur = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetrinetworkPackage.PLACE__LIEN_AVEC_SUCCESSEUR, PetrinetworkPackage.ARC__PREDECESSEUR_PLACE);
		}
		return lienAvecSuccesseur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNbJetons() {
		return nbJetons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNbJetons(int newNbJetons) {
		int oldNbJetons = nbJetons;
		nbJetons = newNbJetons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetworkPackage.PLACE__NB_JETONS, oldNbJetons, nbJetons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetworkPackage.PLACE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetworkPackage.PLACE__LIEN_AVEC_PREDECESSEUR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLienAvecPredecesseur()).basicAdd(otherEnd, msgs);
			case PetrinetworkPackage.PLACE__LIEN_AVEC_SUCCESSEUR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLienAvecSuccesseur()).basicAdd(otherEnd, msgs);
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
			case PetrinetworkPackage.PLACE__LIEN_AVEC_PREDECESSEUR:
				return ((InternalEList<?>)getLienAvecPredecesseur()).basicRemove(otherEnd, msgs);
			case PetrinetworkPackage.PLACE__LIEN_AVEC_SUCCESSEUR:
				return ((InternalEList<?>)getLienAvecSuccesseur()).basicRemove(otherEnd, msgs);
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
			case PetrinetworkPackage.PLACE__LIEN_AVEC_PREDECESSEUR:
				return getLienAvecPredecesseur();
			case PetrinetworkPackage.PLACE__LIEN_AVEC_SUCCESSEUR:
				return getLienAvecSuccesseur();
			case PetrinetworkPackage.PLACE__NB_JETONS:
				return getNbJetons();
			case PetrinetworkPackage.PLACE__NOM:
				return getNom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetrinetworkPackage.PLACE__LIEN_AVEC_PREDECESSEUR:
				getLienAvecPredecesseur().clear();
				getLienAvecPredecesseur().addAll((Collection<? extends Arc>)newValue);
				return;
			case PetrinetworkPackage.PLACE__LIEN_AVEC_SUCCESSEUR:
				getLienAvecSuccesseur().clear();
				getLienAvecSuccesseur().addAll((Collection<? extends Arc>)newValue);
				return;
			case PetrinetworkPackage.PLACE__NB_JETONS:
				setNbJetons((Integer)newValue);
				return;
			case PetrinetworkPackage.PLACE__NOM:
				setNom((String)newValue);
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
			case PetrinetworkPackage.PLACE__LIEN_AVEC_PREDECESSEUR:
				getLienAvecPredecesseur().clear();
				return;
			case PetrinetworkPackage.PLACE__LIEN_AVEC_SUCCESSEUR:
				getLienAvecSuccesseur().clear();
				return;
			case PetrinetworkPackage.PLACE__NB_JETONS:
				setNbJetons(NB_JETONS_EDEFAULT);
				return;
			case PetrinetworkPackage.PLACE__NOM:
				setNom(NOM_EDEFAULT);
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
			case PetrinetworkPackage.PLACE__LIEN_AVEC_PREDECESSEUR:
				return lienAvecPredecesseur != null && !lienAvecPredecesseur.isEmpty();
			case PetrinetworkPackage.PLACE__LIEN_AVEC_SUCCESSEUR:
				return lienAvecSuccesseur != null && !lienAvecSuccesseur.isEmpty();
			case PetrinetworkPackage.PLACE__NB_JETONS:
				return nbJetons != NB_JETONS_EDEFAULT;
			case PetrinetworkPackage.PLACE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
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
		result.append(" (nbJetons: ");
		result.append(nbJetons);
		result.append(", nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //PlaceImpl
