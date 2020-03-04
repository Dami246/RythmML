/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Beat#getTotalDivNumber <em>Total Div Number</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Beat#getNote <em>Note</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Beat#getNotePositions <em>Note Positions</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getBeat()
 * @model
 * @generated
 */
public interface Beat extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Total Div Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Div Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Div Number</em>' attribute.
	 * @see #setTotalDivNumber(int)
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getBeat_TotalDivNumber()
	 * @model unique="false"
	 * @generated
	 */
	int getTotalDivNumber();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Beat#getTotalDivNumber <em>Total Div Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Div Number</em>' attribute.
	 * @see #getTotalDivNumber()
	 * @generated
	 */
	void setTotalDivNumber(int value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' reference list.
	 * The list contents are of type {@link fr.unice.polytech.dsl.rythmml.model.rythmml.Note}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' reference list.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getBeat_Note()
	 * @model required="true"
	 * @generated
	 */
	EList<Note> getNote();

	/**
	 * Returns the value of the '<em><b>Note Positions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Positions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Positions</em>' attribute list.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getBeat_NotePositions()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getNotePositions();

} // Beat
