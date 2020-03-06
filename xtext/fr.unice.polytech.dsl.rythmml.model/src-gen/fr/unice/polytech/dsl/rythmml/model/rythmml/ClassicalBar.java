/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classical Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.ClassicalBar#getBeats <em>Beats</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getClassicalBar()
 * @model
 * @generated
 */
public interface ClassicalBar extends Bar {

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
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getClassicalBar_Beats()
	 * @model required="true"
	 * @generated
	 */
	EList<Beat> getBeats();
} // ClassicalBar
