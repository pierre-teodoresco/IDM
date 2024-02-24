/**
 */
package petrinetwork.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petrinetwork.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetworkFactoryImpl extends EFactoryImpl implements PetrinetworkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PetrinetworkFactory init() {
		try {
			PetrinetworkFactory thePetrinetworkFactory = (PetrinetworkFactory)EPackage.Registry.INSTANCE.getEFactory(PetrinetworkPackage.eNS_URI);
			if (thePetrinetworkFactory != null) {
				return thePetrinetworkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PetrinetworkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetworkFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PetrinetworkPackage.RESEAU_PETRI: return createReseauPetri();
			case PetrinetworkPackage.TRANSITION: return createTransition();
			case PetrinetworkPackage.PLACE: return createPlace();
			case PetrinetworkPackage.ARC_PONDERE: return createArcPondere();
			case PetrinetworkPackage.ARC_LECTURE_SEULE: return createArcLectureSeule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReseauPetri createReseauPetri() {
		ReseauPetriImpl reseauPetri = new ReseauPetriImpl();
		return reseauPetri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcPondere createArcPondere() {
		ArcPondereImpl arcPondere = new ArcPondereImpl();
		return arcPondere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcLectureSeule createArcLectureSeule() {
		ArcLectureSeuleImpl arcLectureSeule = new ArcLectureSeuleImpl();
		return arcLectureSeule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PetrinetworkPackage getPetrinetworkPackage() {
		return (PetrinetworkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PetrinetworkPackage getPackage() {
		return PetrinetworkPackage.eINSTANCE;
	}

} //PetrinetworkFactoryImpl
