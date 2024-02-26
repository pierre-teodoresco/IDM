package simplepdl.validation;

import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import simplepdl.Guidance;
import simplepdl.ProcessElement;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.Ressource;
import simplepdl.WDNeed;
import simplepdl.util.SimplepdlSwitch;

/**
 * Réalise la validation d'un EObject issu de SimplePDL (en théorie, d'un process).
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
 * @version 1.0
 */
public class SimplePDLValidator extends SimplepdlSwitch<Boolean> {
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
	public SimplePDLValidator() {}
	
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
	 * Méthode appelée lorsque l'objet visité est un Process.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseProcess(simplepdl.Process object) {
		// Contraintes sur process
		
		// Contraintes de nommage
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom du process ne respecte pas les conventions Java");
		
		// Visite
		for (ProcessElement pe : object.getProcessElements()) {
			this.doSwitch(pe);
		}
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est un ProcessElement (ou un sous type).
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseProcessElement(ProcessElement object) {
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une WorkDefinition.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseWorkDefinition(WorkDefinition object) {
		// Contraintes sur WD
		
		// Contraintes de nommage
		this.result.recordIfFailed(
				object.getName() != null || object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom de l'activité ne respecte pas les conventions Java");
		
		// Unicité du nom
		this.result.recordIfFailed(
				object.getProcess().getProcessElements().stream()
					.filter(p -> p.eClass().getClassifierID() == SimplepdlPackage.WORK_DEFINITION)
					.allMatch(pe -> (pe.equals(object) || !((WorkDefinition) pe).getName().contains(object.getName()))),
				object, 
				"Le nom de l'activité (" + object.getName() + ") n'est pas unique");
		
		// Unicité de la demande en ressource
		// fortement inspiré de : https://www.baeldung.com/java-streams-distinct-by
		this.result.recordIfFailed(
				object.getNeed().size() < 2 || object.getNeed().stream()
					.filter(Utils.distinctByKey(need -> need.getRessource()))
					.collect(Collectors.toList())
					.size() == object.getNeed().size(),					
				object, 
				"L'activité " + object.getName() + " demande plus d'une fois la même ressource");
		
		// WD n'est successeur ou predecesseur d'aucun WS
		this.result.recordIfFailed(
				object.getLinksToPredecessors().size() > 0 ||
					object.getLinksToSuccessors().size() > 0,
				object,
				"L'activité " + object.getName() + " n'a ni predecesseur ni successeur");

		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une WorkSequence.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseWorkSequence(WorkSequence object) {
		// Contraintes sur WS		
		
		// WS reflexive
		this.result.recordIfFailed(
				!object.getPredecessor().equals(object.getSuccessor()), 
				object,
				"La dépendance relie l'activité " + object.getPredecessor().getName() + " à elle-même");
		
		// WS n'a pas de successeur ou pas de predecesseur
		this.result.recordIfFailed(
				object.getPredecessor() != null && object.getSuccessor() != null,
				object,
				"La dépendance n'a pas predecesseur ou pas de successeur");
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une Guidance.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseGuidance(Guidance object) {
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une Ressource.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseRessource(Ressource object) {
		// Contraintes sur Ressource
		
		// Contraintes de nommage
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom de la ressource ne respecte pas les conventions Java");
		
		// Quantité négative de ressource
		this.result.recordIfFailed(
				object.getQuantity() > 0, 
				object, 
				"La ressource " + object.getName() + " a une quantité négative");
		
		// Unicité du nom
		this.result.recordIfFailed(
				object.getProcess().getProcessElements().stream()
					.filter(p -> p.eClass().getClassifierID() == SimplepdlPackage.RESSOURCE)
					.allMatch(pe -> (pe.equals(object) || !((Ressource) pe).getName().contains(object.getName()))),
				object, 
				"Le nom de ressource (" + object.getName() + ") n'est pas unique");
		
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un WDNeed.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseWDNeed(WDNeed object) {
		// Contraintes sur WDNeed
		
		// Contraintes de nommage
		this.result.recordIfFailed(
				// Un besoin peut ne pas avoir de nom
				object.getName() == null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom du besoin en ressource ne respecte pas les conventions Java");
		
		// Demande une quantité négative de ressource
		this.result.recordIfFailed(
				object.getQuantity() > 0, 
				object, 
				"La quantité de ressouce demandée est négative");
		
		// Demande plus de ressource que la quantité maximum disponible
		this.result.recordIfFailed(
				object.getQuantity() <= object.getRessource().getQuantity(), 
				object,
				"La quantité de ressource demandée est strictement supérieur à la quantité totale de la ressouce");
		
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
