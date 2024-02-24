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
import petrinetwork.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetwork.impl.TransitionImpl#getTempsMin <em>Temps Min</em>}</li>
 *   <li>{@link petrinetwork.impl.TransitionImpl#getTempsMax <em>Temps Max</em>}</li>
 *   <li>{@link petrinetwork.impl.TransitionImpl#getLienAvecSuccesseur <em>Lien Avec Successeur</em>}</li>
 *   <li>{@link petrinetwork.impl.TransitionImpl#getLienAvecPredecesseur <em>Lien Avec Predecesseur</em>}</li>
 *   <li>{@link petrinetwork.impl.TransitionImpl#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends ElementPetriImpl implements Transition {
	/**
	 * The default value of the '{@link #getTempsMin() <em>Temps Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsMin()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMPS_MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTempsMin() <em>Temps Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsMin()
	 * @generated
	 * @ordered
	 */
	protected int tempsMin = TEMPS_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTempsMax() <em>Temps Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsMax()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMPS_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTempsMax() <em>Temps Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsMax()
	 * @generated
	 * @ordered
	 */
	protected int tempsMax = TEMPS_MAX_EDEFAULT;

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
	 * The cached value of the '{@link #getLienAvecPredecesseur() <em>Lien Avec Predecesseur</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienAvecPredecesseur()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> lienAvecPredecesseur;

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
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetworkPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTempsMin() {
		return tempsMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempsMin(int newTempsMin) {
		int oldTempsMin = tempsMin;
		tempsMin = newTempsMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetworkPackage.TRANSITION__TEMPS_MIN, oldTempsMin, tempsMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTempsMax() {
		return tempsMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempsMax(int newTempsMax) {
		int oldTempsMax = tempsMax;
		tempsMax = newTempsMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetworkPackage.TRANSITION__TEMPS_MAX, oldTempsMax, tempsMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Arc> getLienAvecSuccesseur() {
		if (lienAvecSuccesseur == null) {
			lienAvecSuccesseur = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetrinetworkPackage.TRANSITION__LIEN_AVEC_SUCCESSEUR, PetrinetworkPackage.ARC__PREDECESSEUR_TRANSITION);
		}
		return lienAvecSuccesseur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Arc> getLienAvecPredecesseur() {
		if (lienAvecPredecesseur == null) {
			lienAvecPredecesseur = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetrinetworkPackage.TRANSITION__LIEN_AVEC_PREDECESSEUR, PetrinetworkPackage.ARC__SUCCESSEUR_TRANSITION);
		}
		return lienAvecPredecesseur;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetworkPackage.TRANSITION__NOM, oldNom, nom));
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
			case PetrinetworkPackage.TRANSITION__LIEN_AVEC_SUCCESSEUR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLienAvecSuccesseur()).basicAdd(otherEnd, msgs);
			case PetrinetworkPackage.TRANSITION__LIEN_AVEC_PREDECESSEUR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLienAvecPredecesseur()).basicAdd(otherEnd, msgs);
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
			case PetrinetworkPackage.TRANSITION__LIEN_AVEC_SUCCESSEUR:
				return ((InternalEList<?>)getLienAvecSuccesseur()).basicRemove(otherEnd, msgs);
			case PetrinetworkPackage.TRANSITION__LIEN_AVEC_PREDECESSEUR:
				return ((InternalEList<?>)getLienAvecPredecesseur()).basicRemove(otherEnd, msgs);
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
			case PetrinetworkPackage.TRANSITION__TEMPS_MIN:
				return getTempsMin();
			case PetrinetworkPackage.TRANSITION__TEMPS_MAX:
				return getTempsMax();
			case PetrinetworkPackage.TRANSITION__LIEN_AVEC_SUCCESSEUR:
				return getLienAvecSuccesseur();
			case PetrinetworkPackage.TRANSITION__LIEN_AVEC_PREDECESSEUR:
				return getLienAvecPredecesseur();
			case PetrinetworkPackage.TRANSITION__NOM:
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
			case PetrinetworkPackage.TRANSITION__TEMPS_MIN:
				setTempsMin((Integer)newValue);
				return;
			case PetrinetworkPackage.TRANSITION__TEMPS_MAX:
				setTempsMax((Integer)newValue);
				return;
			case PetrinetworkPackage.TRANSITION__LIEN_AVEC_SUCCESSEUR:
				getLienAvecSuccesseur().clear();
				getLienAvecSuccesseur().addAll((Collection<? extends Arc>)newValue);
				return;
			case PetrinetworkPackage.TRANSITION__LIEN_AVEC_PREDECESSEUR:
				getLienAvecPredecesseur().clear();
				getLienAvecPredecesseur().addAll((Collection<? extends Arc>)newValue);
				return;
			case PetrinetworkPackage.TRANSITION__NOM:
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
			case PetrinetworkPackage.TRANSITION__TEMPS_MIN:
				setTempsMin(TEMPS_MIN_EDEFAULT);
				return;
			case PetrinetworkPackage.TRANSITION__TEMPS_MAX:
				setTempsMax(TEMPS_MAX_EDEFAULT);
				return;
			case PetrinetworkPackage.TRANSITION__LIEN_AVEC_SUCCESSEUR:
				getLienAvecSuccesseur().clear();
				return;
			case PetrinetworkPackage.TRANSITION__LIEN_AVEC_PREDECESSEUR:
				getLienAvecPredecesseur().clear();
				return;
			case PetrinetworkPackage.TRANSITION__NOM:
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
			case PetrinetworkPackage.TRANSITION__TEMPS_MIN:
				return tempsMin != TEMPS_MIN_EDEFAULT;
			case PetrinetworkPackage.TRANSITION__TEMPS_MAX:
				return tempsMax != TEMPS_MAX_EDEFAULT;
			case PetrinetworkPackage.TRANSITION__LIEN_AVEC_SUCCESSEUR:
				return lienAvecSuccesseur != null && !lienAvecSuccesseur.isEmpty();
			case PetrinetworkPackage.TRANSITION__LIEN_AVEC_PREDECESSEUR:
				return lienAvecPredecesseur != null && !lienAvecPredecesseur.isEmpty();
			case PetrinetworkPackage.TRANSITION__NOM:
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
		result.append(" (tempsMin: ");
		result.append(tempsMin);
		result.append(", tempsMax: ");
		result.append(tempsMax);
		result.append(", nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
