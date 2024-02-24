/**
 */
package petrinetwork;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetwork.Arc#getSuccesseurPlace <em>Successeur Place</em>}</li>
 *   <li>{@link petrinetwork.Arc#getPredecesseurPlace <em>Predecesseur Place</em>}</li>
 *   <li>{@link petrinetwork.Arc#getPredecesseurTransition <em>Predecesseur Transition</em>}</li>
 *   <li>{@link petrinetwork.Arc#getSuccesseurTransition <em>Successeur Transition</em>}</li>
 *   <li>{@link petrinetwork.Arc#getPoids <em>Poids</em>}</li>
 * </ul>
 *
 * @see petrinetwork.PetrinetworkPackage#getArc()
 * @model abstract="true"
 * @generated
 */
public interface Arc extends ElementPetri {
	/**
	 * Returns the value of the '<em><b>Successeur Place</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinetwork.Place#getLienAvecPredecesseur <em>Lien Avec Predecesseur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successeur Place</em>' reference.
	 * @see #setSuccesseurPlace(Place)
	 * @see petrinetwork.PetrinetworkPackage#getArc_SuccesseurPlace()
	 * @see petrinetwork.Place#getLienAvecPredecesseur
	 * @model opposite="lienAvecPredecesseur"
	 * @generated
	 */
	Place getSuccesseurPlace();

	/**
	 * Sets the value of the '{@link petrinetwork.Arc#getSuccesseurPlace <em>Successeur Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successeur Place</em>' reference.
	 * @see #getSuccesseurPlace()
	 * @generated
	 */
	void setSuccesseurPlace(Place value);

	/**
	 * Returns the value of the '<em><b>Predecesseur Place</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinetwork.Place#getLienAvecSuccesseur <em>Lien Avec Successeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecesseur Place</em>' reference.
	 * @see #setPredecesseurPlace(Place)
	 * @see petrinetwork.PetrinetworkPackage#getArc_PredecesseurPlace()
	 * @see petrinetwork.Place#getLienAvecSuccesseur
	 * @model opposite="lienAvecSuccesseur"
	 * @generated
	 */
	Place getPredecesseurPlace();

	/**
	 * Sets the value of the '{@link petrinetwork.Arc#getPredecesseurPlace <em>Predecesseur Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecesseur Place</em>' reference.
	 * @see #getPredecesseurPlace()
	 * @generated
	 */
	void setPredecesseurPlace(Place value);

	/**
	 * Returns the value of the '<em><b>Predecesseur Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinetwork.Transition#getLienAvecSuccesseur <em>Lien Avec Successeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecesseur Transition</em>' reference.
	 * @see #setPredecesseurTransition(Transition)
	 * @see petrinetwork.PetrinetworkPackage#getArc_PredecesseurTransition()
	 * @see petrinetwork.Transition#getLienAvecSuccesseur
	 * @model opposite="lienAvecSuccesseur"
	 * @generated
	 */
	Transition getPredecesseurTransition();

	/**
	 * Sets the value of the '{@link petrinetwork.Arc#getPredecesseurTransition <em>Predecesseur Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecesseur Transition</em>' reference.
	 * @see #getPredecesseurTransition()
	 * @generated
	 */
	void setPredecesseurTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Successeur Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinetwork.Transition#getLienAvecPredecesseur <em>Lien Avec Predecesseur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successeur Transition</em>' reference.
	 * @see #setSuccesseurTransition(Transition)
	 * @see petrinetwork.PetrinetworkPackage#getArc_SuccesseurTransition()
	 * @see petrinetwork.Transition#getLienAvecPredecesseur
	 * @model opposite="lienAvecPredecesseur"
	 * @generated
	 */
	Transition getSuccesseurTransition();

	/**
	 * Sets the value of the '{@link petrinetwork.Arc#getSuccesseurTransition <em>Successeur Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successeur Transition</em>' reference.
	 * @see #getSuccesseurTransition()
	 * @generated
	 */
	void setSuccesseurTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Poids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poids</em>' attribute.
	 * @see #setPoids(int)
	 * @see petrinetwork.PetrinetworkPackage#getArc_Poids()
	 * @model required="true"
	 * @generated
	 */
	int getPoids();

	/**
	 * Sets the value of the '{@link petrinetwork.Arc#getPoids <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poids</em>' attribute.
	 * @see #getPoids()
	 * @generated
	 */
	void setPoids(int value);

} // Arc
