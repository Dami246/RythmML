/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note Replacement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.NoteReplacement#getNoteSrc <em>Note Src</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.NoteReplacement#getNewNote <em>New Note</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getNoteReplacement()
 * @model
 * @generated
 */
public interface NoteReplacement extends Operation {

	/**
	 * Returns the value of the '<em><b>Note Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Src</em>' reference.
	 * @see #setNoteSrc(Note)
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getNoteReplacement_NoteSrc()
	 * @model required="true"
	 * @generated
	 */
	Note getNoteSrc();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.NoteReplacement#getNoteSrc <em>Note Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Src</em>' reference.
	 * @see #getNoteSrc()
	 * @generated
	 */
	void setNoteSrc(Note value);

	/**
	 * Returns the value of the '<em><b>New Note</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Note</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Note</em>' reference.
	 * @see #setNewNote(Note)
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getNoteReplacement_NewNote()
	 * @model required="true"
	 * @generated
	 */
	Note getNewNote();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.NoteReplacement#getNewNote <em>New Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Note</em>' reference.
	 * @see #getNewNote()
	 * @generated
	 */
	void setNewNote(Note value);
} // NoteReplacement
