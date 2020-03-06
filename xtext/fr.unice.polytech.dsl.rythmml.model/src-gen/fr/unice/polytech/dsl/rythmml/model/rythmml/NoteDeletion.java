/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note Deletion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.NoteDeletion#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getNoteDeletion()
 * @model
 * @generated
 */
public interface NoteDeletion extends Operation {

	/**
	 * Returns the value of the '<em><b>Note</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' reference.
	 * @see #setNote(Note)
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getNoteDeletion_Note()
	 * @model required="true"
	 * @generated
	 */
	Note getNote();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.NoteDeletion#getNote <em>Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(Note value);
} // NoteDeletion
