/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Pattern#getBars <em>Bars</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Pattern#getMultipliers <em>Multipliers</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Bars</b></em>' reference list.
	 * The list contents are of type {@link fr.unice.polytech.dsl.rythmml.model.rythmml.Bar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bars</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bars</em>' reference list.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getPattern_Bars()
	 * @model required="true"
	 * @generated
	 */
	EList<Bar> getBars();

	/**
	 * Returns the value of the '<em><b>Multipliers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multipliers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multipliers</em>' attribute list.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getPattern_Multipliers()
	 * @model
	 * @generated
	 */
	EList<Integer> getMultipliers();

} // Pattern
