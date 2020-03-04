/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bar Multiplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.BarMultiplier#getBar <em>Bar</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.BarMultiplier#getMultiplier <em>Multiplier</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getBarMultiplier()
 * @model
 * @generated
 */
public interface BarMultiplier extends EObject {
	/**
	 * Returns the value of the '<em><b>Bar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar</em>' reference.
	 * @see #setBar(Bar)
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getBarMultiplier_Bar()
	 * @model required="true"
	 * @generated
	 */
	Bar getBar();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.BarMultiplier#getBar <em>Bar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bar</em>' reference.
	 * @see #getBar()
	 * @generated
	 */
	void setBar(Bar value);

	/**
	 * Returns the value of the '<em><b>Multiplier</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplier</em>' attribute.
	 * @see #setMultiplier(int)
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getBarMultiplier_Multiplier()
	 * @model default="1" unique="false" required="true"
	 * @generated
	 */
	int getMultiplier();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.BarMultiplier#getMultiplier <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplier</em>' attribute.
	 * @see #getMultiplier()
	 * @generated
	 */
	void setMultiplier(int value);

} // BarMultiplier
