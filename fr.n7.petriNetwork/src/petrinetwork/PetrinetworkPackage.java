/**
 */
package petrinetwork;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see petrinetwork.PetrinetworkFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetworkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinetwork";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://petrinetwork";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinetwork";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetworkPackage eINSTANCE = petrinetwork.impl.PetrinetworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetwork.impl.ReseauPetriImpl <em>Reseau Petri</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetwork.impl.ReseauPetriImpl
	 * @see petrinetwork.impl.PetrinetworkPackageImpl#getReseauPetri()
	 * @generated
	 */
	int RESEAU_PETRI = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEAU_PETRI__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEAU_PETRI__NOM = 1;

	/**
	 * The number of structural features of the '<em>Reseau Petri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEAU_PETRI_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reseau Petri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEAU_PETRI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetwork.impl.ElementPetriImpl <em>Element Petri</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetwork.impl.ElementPetriImpl
	 * @see petrinetwork.impl.PetrinetworkPackageImpl#getElementPetri()
	 * @generated
	 */
	int ELEMENT_PETRI = 6;

	/**
	 * The feature id for the '<em><b>Reseaupetri</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PETRI__RESEAUPETRI = 0;

	/**
	 * The number of structural features of the '<em>Element Petri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PETRI_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element Petri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PETRI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetwork.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetwork.impl.TransitionImpl
	 * @see petrinetwork.impl.PetrinetworkPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Reseaupetri</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RESEAUPETRI = ELEMENT_PETRI__RESEAUPETRI;

	/**
	 * The feature id for the '<em><b>Temps Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TEMPS_MIN = ELEMENT_PETRI_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Temps Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TEMPS_MAX = ELEMENT_PETRI_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lien Avec Successeur</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LIEN_AVEC_SUCCESSEUR = ELEMENT_PETRI_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lien Avec Predecesseur</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LIEN_AVEC_PREDECESSEUR = ELEMENT_PETRI_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NOM = ELEMENT_PETRI_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = ELEMENT_PETRI_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = ELEMENT_PETRI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetwork.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetwork.impl.PlaceImpl
	 * @see petrinetwork.impl.PetrinetworkPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 2;

	/**
	 * The feature id for the '<em><b>Reseaupetri</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__RESEAUPETRI = ELEMENT_PETRI__RESEAUPETRI;

	/**
	 * The feature id for the '<em><b>Lien Avec Predecesseur</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__LIEN_AVEC_PREDECESSEUR = ELEMENT_PETRI_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lien Avec Successeur</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__LIEN_AVEC_SUCCESSEUR = ELEMENT_PETRI_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nb Jetons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NB_JETONS = ELEMENT_PETRI_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NOM = ELEMENT_PETRI_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = ELEMENT_PETRI_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = ELEMENT_PETRI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetwork.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetwork.impl.ArcImpl
	 * @see petrinetwork.impl.PetrinetworkPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 3;

	/**
	 * The feature id for the '<em><b>Reseaupetri</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__RESEAUPETRI = ELEMENT_PETRI__RESEAUPETRI;

	/**
	 * The feature id for the '<em><b>Successeur Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SUCCESSEUR_PLACE = ELEMENT_PETRI_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predecesseur Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__PREDECESSEUR_PLACE = ELEMENT_PETRI_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Predecesseur Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__PREDECESSEUR_TRANSITION = ELEMENT_PETRI_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Successeur Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SUCCESSEUR_TRANSITION = ELEMENT_PETRI_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Poids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__POIDS = ELEMENT_PETRI_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = ELEMENT_PETRI_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = ELEMENT_PETRI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetwork.impl.ArcPondereImpl <em>Arc Pondere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetwork.impl.ArcPondereImpl
	 * @see petrinetwork.impl.PetrinetworkPackageImpl#getArcPondere()
	 * @generated
	 */
	int ARC_PONDERE = 4;

	/**
	 * The feature id for the '<em><b>Reseaupetri</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE__RESEAUPETRI = ARC__RESEAUPETRI;

	/**
	 * The feature id for the '<em><b>Successeur Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE__SUCCESSEUR_PLACE = ARC__SUCCESSEUR_PLACE;

	/**
	 * The feature id for the '<em><b>Predecesseur Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE__PREDECESSEUR_PLACE = ARC__PREDECESSEUR_PLACE;

	/**
	 * The feature id for the '<em><b>Predecesseur Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE__PREDECESSEUR_TRANSITION = ARC__PREDECESSEUR_TRANSITION;

	/**
	 * The feature id for the '<em><b>Successeur Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE__SUCCESSEUR_TRANSITION = ARC__SUCCESSEUR_TRANSITION;

	/**
	 * The feature id for the '<em><b>Poids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE__POIDS = ARC__POIDS;

	/**
	 * The number of structural features of the '<em>Arc Pondere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arc Pondere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_PONDERE_OPERATION_COUNT = ARC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinetwork.impl.ArcLectureSeuleImpl <em>Arc Lecture Seule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetwork.impl.ArcLectureSeuleImpl
	 * @see petrinetwork.impl.PetrinetworkPackageImpl#getArcLectureSeule()
	 * @generated
	 */
	int ARC_LECTURE_SEULE = 5;

	/**
	 * The feature id for the '<em><b>Reseaupetri</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_LECTURE_SEULE__RESEAUPETRI = ARC__RESEAUPETRI;

	/**
	 * The feature id for the '<em><b>Successeur Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_LECTURE_SEULE__SUCCESSEUR_PLACE = ARC__SUCCESSEUR_PLACE;

	/**
	 * The feature id for the '<em><b>Predecesseur Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_LECTURE_SEULE__PREDECESSEUR_PLACE = ARC__PREDECESSEUR_PLACE;

	/**
	 * The feature id for the '<em><b>Predecesseur Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_LECTURE_SEULE__PREDECESSEUR_TRANSITION = ARC__PREDECESSEUR_TRANSITION;

	/**
	 * The feature id for the '<em><b>Successeur Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_LECTURE_SEULE__SUCCESSEUR_TRANSITION = ARC__SUCCESSEUR_TRANSITION;

	/**
	 * The feature id for the '<em><b>Poids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_LECTURE_SEULE__POIDS = ARC__POIDS;

	/**
	 * The number of structural features of the '<em>Arc Lecture Seule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_LECTURE_SEULE_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arc Lecture Seule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_LECTURE_SEULE_OPERATION_COUNT = ARC_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link petrinetwork.ReseauPetri <em>Reseau Petri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reseau Petri</em>'.
	 * @see petrinetwork.ReseauPetri
	 * @generated
	 */
	EClass getReseauPetri();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetwork.ReseauPetri#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see petrinetwork.ReseauPetri#getElements()
	 * @see #getReseauPetri()
	 * @generated
	 */
	EReference getReseauPetri_Elements();

	/**
	 * Returns the meta object for the attribute '{@link petrinetwork.ReseauPetri#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see petrinetwork.ReseauPetri#getNom()
	 * @see #getReseauPetri()
	 * @generated
	 */
	EAttribute getReseauPetri_Nom();

	/**
	 * Returns the meta object for class '{@link petrinetwork.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see petrinetwork.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link petrinetwork.Transition#getTempsMin <em>Temps Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temps Min</em>'.
	 * @see petrinetwork.Transition#getTempsMin()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_TempsMin();

	/**
	 * Returns the meta object for the attribute '{@link petrinetwork.Transition#getTempsMax <em>Temps Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temps Max</em>'.
	 * @see petrinetwork.Transition#getTempsMax()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_TempsMax();

	/**
	 * Returns the meta object for the reference list '{@link petrinetwork.Transition#getLienAvecSuccesseur <em>Lien Avec Successeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lien Avec Successeur</em>'.
	 * @see petrinetwork.Transition#getLienAvecSuccesseur()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_LienAvecSuccesseur();

	/**
	 * Returns the meta object for the reference list '{@link petrinetwork.Transition#getLienAvecPredecesseur <em>Lien Avec Predecesseur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lien Avec Predecesseur</em>'.
	 * @see petrinetwork.Transition#getLienAvecPredecesseur()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_LienAvecPredecesseur();

	/**
	 * Returns the meta object for the attribute '{@link petrinetwork.Transition#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see petrinetwork.Transition#getNom()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Nom();

	/**
	 * Returns the meta object for class '{@link petrinetwork.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see petrinetwork.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the reference list '{@link petrinetwork.Place#getLienAvecPredecesseur <em>Lien Avec Predecesseur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lien Avec Predecesseur</em>'.
	 * @see petrinetwork.Place#getLienAvecPredecesseur()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_LienAvecPredecesseur();

	/**
	 * Returns the meta object for the reference list '{@link petrinetwork.Place#getLienAvecSuccesseur <em>Lien Avec Successeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lien Avec Successeur</em>'.
	 * @see petrinetwork.Place#getLienAvecSuccesseur()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_LienAvecSuccesseur();

	/**
	 * Returns the meta object for the attribute '{@link petrinetwork.Place#getNbJetons <em>Nb Jetons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Jetons</em>'.
	 * @see petrinetwork.Place#getNbJetons()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_NbJetons();

	/**
	 * Returns the meta object for the attribute '{@link petrinetwork.Place#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see petrinetwork.Place#getNom()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Nom();

	/**
	 * Returns the meta object for class '{@link petrinetwork.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see petrinetwork.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the reference '{@link petrinetwork.Arc#getSuccesseurPlace <em>Successeur Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Successeur Place</em>'.
	 * @see petrinetwork.Arc#getSuccesseurPlace()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_SuccesseurPlace();

	/**
	 * Returns the meta object for the reference '{@link petrinetwork.Arc#getPredecesseurPlace <em>Predecesseur Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecesseur Place</em>'.
	 * @see petrinetwork.Arc#getPredecesseurPlace()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_PredecesseurPlace();

	/**
	 * Returns the meta object for the reference '{@link petrinetwork.Arc#getPredecesseurTransition <em>Predecesseur Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecesseur Transition</em>'.
	 * @see petrinetwork.Arc#getPredecesseurTransition()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_PredecesseurTransition();

	/**
	 * Returns the meta object for the reference '{@link petrinetwork.Arc#getSuccesseurTransition <em>Successeur Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Successeur Transition</em>'.
	 * @see petrinetwork.Arc#getSuccesseurTransition()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_SuccesseurTransition();

	/**
	 * Returns the meta object for the attribute '{@link petrinetwork.Arc#getPoids <em>Poids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Poids</em>'.
	 * @see petrinetwork.Arc#getPoids()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Poids();

	/**
	 * Returns the meta object for class '{@link petrinetwork.ArcPondere <em>Arc Pondere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Pondere</em>'.
	 * @see petrinetwork.ArcPondere
	 * @generated
	 */
	EClass getArcPondere();

	/**
	 * Returns the meta object for class '{@link petrinetwork.ArcLectureSeule <em>Arc Lecture Seule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Lecture Seule</em>'.
	 * @see petrinetwork.ArcLectureSeule
	 * @generated
	 */
	EClass getArcLectureSeule();

	/**
	 * Returns the meta object for class '{@link petrinetwork.ElementPetri <em>Element Petri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Petri</em>'.
	 * @see petrinetwork.ElementPetri
	 * @generated
	 */
	EClass getElementPetri();

	/**
	 * Returns the meta object for the container reference '{@link petrinetwork.ElementPetri#getReseaupetri <em>Reseaupetri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reseaupetri</em>'.
	 * @see petrinetwork.ElementPetri#getReseaupetri()
	 * @see #getElementPetri()
	 * @generated
	 */
	EReference getElementPetri_Reseaupetri();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetrinetworkFactory getPetrinetworkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link petrinetwork.impl.ReseauPetriImpl <em>Reseau Petri</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetwork.impl.ReseauPetriImpl
		 * @see petrinetwork.impl.PetrinetworkPackageImpl#getReseauPetri()
		 * @generated
		 */
		EClass RESEAU_PETRI = eINSTANCE.getReseauPetri();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESEAU_PETRI__ELEMENTS = eINSTANCE.getReseauPetri_Elements();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESEAU_PETRI__NOM = eINSTANCE.getReseauPetri_Nom();

		/**
		 * The meta object literal for the '{@link petrinetwork.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetwork.impl.TransitionImpl
		 * @see petrinetwork.impl.PetrinetworkPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Temps Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TEMPS_MIN = eINSTANCE.getTransition_TempsMin();

		/**
		 * The meta object literal for the '<em><b>Temps Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TEMPS_MAX = eINSTANCE.getTransition_TempsMax();

		/**
		 * The meta object literal for the '<em><b>Lien Avec Successeur</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__LIEN_AVEC_SUCCESSEUR = eINSTANCE.getTransition_LienAvecSuccesseur();

		/**
		 * The meta object literal for the '<em><b>Lien Avec Predecesseur</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__LIEN_AVEC_PREDECESSEUR = eINSTANCE.getTransition_LienAvecPredecesseur();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NOM = eINSTANCE.getTransition_Nom();

		/**
		 * The meta object literal for the '{@link petrinetwork.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetwork.impl.PlaceImpl
		 * @see petrinetwork.impl.PetrinetworkPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Lien Avec Predecesseur</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__LIEN_AVEC_PREDECESSEUR = eINSTANCE.getPlace_LienAvecPredecesseur();

		/**
		 * The meta object literal for the '<em><b>Lien Avec Successeur</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__LIEN_AVEC_SUCCESSEUR = eINSTANCE.getPlace_LienAvecSuccesseur();

		/**
		 * The meta object literal for the '<em><b>Nb Jetons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__NB_JETONS = eINSTANCE.getPlace_NbJetons();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__NOM = eINSTANCE.getPlace_Nom();

		/**
		 * The meta object literal for the '{@link petrinetwork.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetwork.impl.ArcImpl
		 * @see petrinetwork.impl.PetrinetworkPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Successeur Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__SUCCESSEUR_PLACE = eINSTANCE.getArc_SuccesseurPlace();

		/**
		 * The meta object literal for the '<em><b>Predecesseur Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__PREDECESSEUR_PLACE = eINSTANCE.getArc_PredecesseurPlace();

		/**
		 * The meta object literal for the '<em><b>Predecesseur Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__PREDECESSEUR_TRANSITION = eINSTANCE.getArc_PredecesseurTransition();

		/**
		 * The meta object literal for the '<em><b>Successeur Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__SUCCESSEUR_TRANSITION = eINSTANCE.getArc_SuccesseurTransition();

		/**
		 * The meta object literal for the '<em><b>Poids</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__POIDS = eINSTANCE.getArc_Poids();

		/**
		 * The meta object literal for the '{@link petrinetwork.impl.ArcPondereImpl <em>Arc Pondere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetwork.impl.ArcPondereImpl
		 * @see petrinetwork.impl.PetrinetworkPackageImpl#getArcPondere()
		 * @generated
		 */
		EClass ARC_PONDERE = eINSTANCE.getArcPondere();

		/**
		 * The meta object literal for the '{@link petrinetwork.impl.ArcLectureSeuleImpl <em>Arc Lecture Seule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetwork.impl.ArcLectureSeuleImpl
		 * @see petrinetwork.impl.PetrinetworkPackageImpl#getArcLectureSeule()
		 * @generated
		 */
		EClass ARC_LECTURE_SEULE = eINSTANCE.getArcLectureSeule();

		/**
		 * The meta object literal for the '{@link petrinetwork.impl.ElementPetriImpl <em>Element Petri</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetwork.impl.ElementPetriImpl
		 * @see petrinetwork.impl.PetrinetworkPackageImpl#getElementPetri()
		 * @generated
		 */
		EClass ELEMENT_PETRI = eINSTANCE.getElementPetri();

		/**
		 * The meta object literal for the '<em><b>Reseaupetri</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_PETRI__RESEAUPETRI = eINSTANCE.getElementPetri_Reseaupetri();

	}

} //PetrinetworkPackage
