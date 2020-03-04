/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Bar#getBeats <em>Beats</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getBar()
 * @model
 * @generated
 */
public interface Bar extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Beats</b></em>' reference list.
	 * The list contents are of type {@link fr.unice.polytech.dsl.rythmml.model.rythmml.Beat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beats</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beats</em>' reference list.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getBar_Beats()
	 * @model required="true"
	 * @generated
	 */
	EList<Beat> getBeats();

} // Bar
