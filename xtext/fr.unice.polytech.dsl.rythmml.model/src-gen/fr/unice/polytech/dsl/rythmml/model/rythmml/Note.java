/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Note#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getNote()
 * @model
 * @generated
 */
public interface Note extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.unice.polytech.dsl.rythmml.model.rythmml.DrumNoteValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.DrumNoteValue
	 * @see #setValue(DrumNoteValue)
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getNote_Value()
	 * @model unique="false"
	 * @generated
	 */
	DrumNoteValue getValue();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Note#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.DrumNoteValue
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DrumNoteValue value);

} // Note
