/**
 */
package petrinetwork;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetwork.Transition#getTempsMin <em>Temps Min</em>}</li>
 *   <li>{@link petrinetwork.Transition#getTempsMax <em>Temps Max</em>}</li>
 *   <li>{@link petrinetwork.Transition#getLienAvecSuccesseur <em>Lien Avec Successeur</em>}</li>
 *   <li>{@link petrinetwork.Transition#getLienAvecPredecesseur <em>Lien Avec Predecesseur</em>}</li>
 *   <li>{@link petrinetwork.Transition#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see petrinetwork.PetrinetworkPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends ElementPetri {
	/**
	 * Returns the value of the '<em><b>Temps Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temps Min</em>' attribute.
	 * @see #setTempsMin(int)
	 * @see petrinetwork.PetrinetworkPackage#getTransition_TempsMin()
	 * @model
	 * @generated
	 */
	int getTempsMin();

	/**
	 * Sets the value of the '{@link petrinetwork.Transition#getTempsMin <em>Temps Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temps Min</em>' attribute.
	 * @see #getTempsMin()
	 * @generated
	 */
	void setTempsMin(int value);

	/**
	 * Returns the value of the '<em><b>Temps Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temps Max</em>' attribute.
	 * @see #setTempsMax(int)
	 * @see petrinetwork.PetrinetworkPackage#getTransition_TempsMax()
	 * @model
	 * @generated
	 */
	int getTempsMax();

	/**
	 * Sets the value of the '{@link petrinetwork.Transition#getTempsMax <em>Temps Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temps Max</em>' attribute.
	 * @see #getTempsMax()
	 * @generated
	 */
	void setTempsMax(int value);

	/**
	 * Returns the value of the '<em><b>Lien Avec Successeur</b></em>' reference list.
	 * The list contents are of type {@link petrinetwork.Arc}.
	 * It is bidirectional and its opposite is '{@link petrinetwork.Arc#getPredecesseurTransition <em>Predecesseur Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien Avec Successeur</em>' reference list.
	 * @see petrinetwork.PetrinetworkPackage#getTransition_LienAvecSuccesseur()
	 * @see petrinetwork.Arc#getPredecesseurTransition
	 * @model opposite="predecesseurTransition"
	 * @generated
	 */
	EList<Arc> getLienAvecSuccesseur();

	/**
	 * Returns the value of the '<em><b>Lien Avec Predecesseur</b></em>' reference list.
	 * The list contents are of type {@link petrinetwork.Arc}.
	 * It is bidirectional and its opposite is '{@link petrinetwork.Arc#getSuccesseurTransition <em>Successeur Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien Avec Predecesseur</em>' reference list.
	 * @see petrinetwork.PetrinetworkPackage#getTransition_LienAvecPredecesseur()
	 * @see petrinetwork.Arc#getSuccesseurTransition
	 * @model opposite="successeurTransition"
	 * @generated
	 */
	EList<Arc> getLienAvecPredecesseur();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see petrinetwork.PetrinetworkPackage#getTransition_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link petrinetwork.Transition#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Transition
