/**
 */
package petrinetwork.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import petrinetwork.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see petrinetwork.PetrinetworkPackage
 * @generated
 */
public class PetrinetworkSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PetrinetworkPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetworkSwitch() {
		if (modelPackage == null) {
			modelPackage = PetrinetworkPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PetrinetworkPackage.RESEAU_PETRI: {
				ReseauPetri reseauPetri = (ReseauPetri)theEObject;
				T result = caseReseauPetri(reseauPetri);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetrinetworkPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseElementPetri(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetrinetworkPackage.PLACE: {
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseElementPetri(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetrinetworkPackage.ARC: {
				Arc arc = (Arc)theEObject;
				T result = caseArc(arc);
				if (result == null) result = caseElementPetri(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetrinetworkPackage.ARC_PONDERE: {
				ArcPondere arcPondere = (ArcPondere)theEObject;
				T result = caseArcPondere(arcPondere);
				if (result == null) result = caseArc(arcPondere);
				if (result == null) result = caseElementPetri(arcPondere);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetrinetworkPackage.ARC_LECTURE_SEULE: {
				ArcLectureSeule arcLectureSeule = (ArcLectureSeule)theEObject;
				T result = caseArcLectureSeule(arcLectureSeule);
				if (result == null) result = caseArc(arcLectureSeule);
				if (result == null) result = caseElementPetri(arcLectureSeule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetrinetworkPackage.ELEMENT_PETRI: {
				ElementPetri elementPetri = (ElementPetri)theEObject;
				T result = caseElementPetri(elementPetri);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reseau Petri</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reseau Petri</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReseauPetri(ReseauPetri object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc Pondere</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc Pondere</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcPondere(ArcPondere object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc Lecture Seule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc Lecture Seule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcLectureSeule(ArcLectureSeule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Petri</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Petri</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementPetri(ElementPetri object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PetrinetworkSwitch
