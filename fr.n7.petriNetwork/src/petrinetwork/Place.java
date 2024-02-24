/**
 */
package petrinetwork;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetwork.Place#getLienAvecPredecesseur <em>Lien Avec Predecesseur</em>}</li>
 *   <li>{@link petrinetwork.Place#getLienAvecSuccesseur <em>Lien Avec Successeur</em>}</li>
 *   <li>{@link petrinetwork.Place#getNbJetons <em>Nb Jetons</em>}</li>
 *   <li>{@link petrinetwork.Place#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see petrinetwork.PetrinetworkPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends ElementPetri {
	/**
	 * Returns the value of the '<em><b>Lien Avec Predecesseur</b></em>' reference list.
	 * The list contents are of type {@link petrinetwork.Arc}.
	 * It is bidirectional and its opposite is '{@link petrinetwork.Arc#getSuccesseurPlace <em>Successeur Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien Avec Predecesseur</em>' reference list.
	 * @see petrinetwork.PetrinetworkPackage#getPlace_LienAvecPredecesseur()
	 * @see petrinetwork.Arc#getSuccesseurPlace
	 * @model opposite="successeurPlace"
	 * @generated
	 */
	EList<Arc> getLienAvecPredecesseur();

	/**
	 * Returns the value of the '<em><b>Lien Avec Successeur</b></em>' reference list.
	 * The list contents are of type {@link petrinetwork.Arc}.
	 * It is bidirectional and its opposite is '{@link petrinetwork.Arc#getPredecesseurPlace <em>Predecesseur Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien Avec Successeur</em>' reference list.
	 * @see petrinetwork.PetrinetworkPackage#getPlace_LienAvecSuccesseur()
	 * @see petrinetwork.Arc#getPredecesseurPlace
	 * @model opposite="predecesseurPlace"
	 * @generated
	 */
	EList<Arc> getLienAvecSuccesseur();

	/**
	 * Returns the value of the '<em><b>Nb Jetons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Jetons</em>' attribute.
	 * @see #setNbJetons(int)
	 * @see petrinetwork.PetrinetworkPackage#getPlace_NbJetons()
	 * @model required="true"
	 * @generated
	 */
	int getNbJetons();

	/**
	 * Sets the value of the '{@link petrinetwork.Place#getNbJetons <em>Nb Jetons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Jetons</em>' attribute.
	 * @see #getNbJetons()
	 * @generated
	 */
	void setNbJetons(int value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see petrinetwork.PetrinetworkPackage#getPlace_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link petrinetwork.Place#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Place
