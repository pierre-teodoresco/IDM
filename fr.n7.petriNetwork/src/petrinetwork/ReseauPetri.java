/**
 */
package petrinetwork;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reseau Petri</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetwork.ReseauPetri#getElements <em>Elements</em>}</li>
 *   <li>{@link petrinetwork.ReseauPetri#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see petrinetwork.PetrinetworkPackage#getReseauPetri()
 * @model
 * @generated
 */
public interface ReseauPetri extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetwork.ElementPetri}.
	 * It is bidirectional and its opposite is '{@link petrinetwork.ElementPetri#getReseaupetri <em>Reseaupetri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see petrinetwork.PetrinetworkPackage#getReseauPetri_Elements()
	 * @see petrinetwork.ElementPetri#getReseaupetri
	 * @model opposite="reseaupetri" containment="true"
	 * @generated
	 */
	EList<ElementPetri> getElements();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see petrinetwork.PetrinetworkPackage#getReseauPetri_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link petrinetwork.ReseauPetri#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // ReseauPetri
