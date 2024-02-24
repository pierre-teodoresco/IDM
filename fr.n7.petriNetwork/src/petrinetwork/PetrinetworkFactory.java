/**
 */
package petrinetwork;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see petrinetwork.PetrinetworkPackage
 * @generated
 */
public interface PetrinetworkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetworkFactory eINSTANCE = petrinetwork.impl.PetrinetworkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reseau Petri</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reseau Petri</em>'.
	 * @generated
	 */
	ReseauPetri createReseauPetri();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Arc Pondere</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arc Pondere</em>'.
	 * @generated
	 */
	ArcPondere createArcPondere();

	/**
	 * Returns a new object of class '<em>Arc Lecture Seule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arc Lecture Seule</em>'.
	 * @generated
	 */
	ArcLectureSeule createArcLectureSeule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PetrinetworkPackage getPetrinetworkPackage();

} //PetrinetworkFactory
