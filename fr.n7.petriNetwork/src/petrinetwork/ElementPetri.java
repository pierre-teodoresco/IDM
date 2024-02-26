/**
 */
package petrinetwork;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Petri</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetwork.ElementPetri#getReseaupetri <em>Reseaupetri</em>}</li>
 * </ul>
 *
 * @see petrinetwork.PetrinetworkPackage#getElementPetri()
 * @model abstract="true"
 * @generated
 */
public interface ElementPetri extends EObject {

	/**
	 * Returns the value of the '<em><b>Reseaupetri</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petrinetwork.ReseauPetri#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reseaupetri</em>' container reference.
	 * @see #setReseaupetri(ReseauPetri)
	 * @see petrinetwork.PetrinetworkPackage#getElementPetri_Reseaupetri()
	 * @see petrinetwork.ReseauPetri#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	ReseauPetri getReseaupetri();

	/**
	 * Sets the value of the '{@link petrinetwork.ElementPetri#getReseaupetri <em>Reseaupetri</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reseaupetri</em>' container reference.
	 * @see #getReseaupetri()
	 * @generated
	 */
	void setReseaupetri(ReseauPetri value);
} // ElementPetri
