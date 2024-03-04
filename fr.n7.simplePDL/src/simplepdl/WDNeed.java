/**
 */
package simplepdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WD Need</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.WDNeed#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link simplepdl.WDNeed#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.WDNeed#getRessource <em>Ressource</em>}</li>
 *   <li>{@link simplepdl.WDNeed#getWd <em>Wd</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getWDNeed()
 * @model
 * @generated
 */
public interface WDNeed extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see simplepdl.SimplepdlPackage#getWDNeed_Quantity()
	 * @model required="true"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link simplepdl.WDNeed#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.Ressource#getWdneed <em>Wdneed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' reference.
	 * @see #setRessource(Ressource)
	 * @see simplepdl.SimplepdlPackage#getWDNeed_Ressource()
	 * @see simplepdl.Ressource#getWdneed
	 * @model opposite="wdneed" required="true"
	 * @generated
	 */
	Ressource getRessource();

	/**
	 * Sets the value of the '{@link simplepdl.WDNeed#getRessource <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource</em>' reference.
	 * @see #getRessource()
	 * @generated
	 */
	void setRessource(Ressource value);

	/**
	 * Returns the value of the '<em><b>Wd</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkDefinition#getNeed <em>Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wd</em>' container reference.
	 * @see #setWd(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getWDNeed_Wd()
	 * @see simplepdl.WorkDefinition#getNeed
	 * @model opposite="need" required="true" transient="false"
	 * @generated
	 */
	WorkDefinition getWd();

	/**
	 * Sets the value of the '{@link simplepdl.WDNeed#getWd <em>Wd</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wd</em>' container reference.
	 * @see #getWd()
	 * @generated
	 */
	void setWd(WorkDefinition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simplepdl.SimplepdlPackage#getWDNeed_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplepdl.WDNeed#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // WDNeed
