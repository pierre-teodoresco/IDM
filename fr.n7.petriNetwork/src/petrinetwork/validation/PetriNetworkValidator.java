package petrinetwork.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import petrinetwork.util.PetrinetworkSwitch;
import petrinetwork.ReseauPetri;
import petrinetwork.ElementPetri;
import petrinetwork.Place;
import petrinetwork.Arc;
import petrinetwork.ArcPondere;
import petrinetwork.ArcLectureSeule;
import petrinetwork.Transition;

/**
 * Réalise la validation d'un EObject issu de PetriNetwork (en théorie, d'un ReseauPetri).
 * Cet classe visite le modèle et utilise les caseXXX pour rediriger l'algo vers la
 * bonne méthode.
 * Attention, lorsqu'une classe est un parent il faut aller faire la visite des enfants
 * manuellement (cf. caseProcess typiquement).
 * 
 * La classe Switch exige un paramètre de généricité (et gère une partie de la visite à
 * base de comparaison à null). Ici le paramètre est un booléen mais en réalité on ne
 * s'en sert pas...
 * 
 * @authors Guillaume Dupont, Eliot Colomb, Pierre Teodoresco
 * @version 0.1
 */
public class PetriNetworkValidator extends PetrinetworkSwitch<Boolean> {
	/**
	 * Expression régulière qui correspond à un identifiant bien formé.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";
	
	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public PetriNetworkValidator() {}
	
	/**
	 * Lancer la validation et compiler les résultats dans un ValidationResult.
	 * Cette méthode se charge de créer un résultat de validation vide puis de
	 *  visiter les process présents dans la ressource.
	 * @param resource resource à valider
	 * @return résultat de validation
	 */
	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		
		for (EObject object : resource.getContents()) {
			this.doSwitch(object);
		}
		
		return this.result;
	}


	/**
	 * Méthode appelée lorsque l'objet visité est un ReseauPetri.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseReseauPetri(ReseauPetri object) {
		// Contraintes sur process
		
		// Contraintes de nommage
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom du process ne respecte pas les conventions Java");
		
		// Visite
		for (ElementPetri pe : object.getElements()) {
			this.doSwitch(pe);
		}
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est un ElementPetri (ou un sous type).
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseElementPetri(ElementPetri object) {
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une Place.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean casePlace(Place object) {
		// Contraintes sur Place
		
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une Transition.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseTransition(Transition object) {
		// Contraintes sur Transition
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est un Arc (ou un sous-type).
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseArc(Arc object) {
		//Contraintes sur Arc
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un ArcPondere.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseArcPondere(ArcPondere object) {
		// Contraintes sur ArcPondere
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un ArcLectureSeule.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseArcLectureSeule(ArcLectureSeule object) {
		// Contraintes sur ArcLectureSeule
		return null;
	}

	/**
	 * Cas par défaut, lorsque l'objet visité ne correspond pas à un des autres cas.
	 * Cette méthode est aussi appelée lorsqu'une méthode renvoie null (comme une sorte de
	 * fallback).
	 * On pourrait implémenter le switch différemment, en ne renvoyant null dans les autres
	 * méthodes que si la contrainte ne sert à rien, et se servir de cette méthode pour
	 * identifier les éléments étrangers (qui de toute façon ne doivent pas exister).
	 * C'est aussi la méthode appelée si on ne redéfini pas un des caseXXX.
	 * @param object objet visité
	 * @return résultat, null ici
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}
	
	
}
