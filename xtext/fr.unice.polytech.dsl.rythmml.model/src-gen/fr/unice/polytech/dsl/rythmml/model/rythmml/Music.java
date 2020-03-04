/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Music</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getAuthor <em>Author</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getOwnedSections <em>Owned Sections</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getBpm <em>Bpm</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getResolutionPerSlide <em>Resolution Per Slide</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getOwnedPatterns <em>Owned Patterns</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getOwnedBars <em>Owned Bars</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getOwnedBeats <em>Owned Beats</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getOwnedNotes <em>Owned Notes</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getMusic()
 * @model
 * @generated
 */
public interface Music extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getMusic_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getMusic_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Owned Sections</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.dsl.rythmml.model.rythmml.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Sections</em>' containment reference list.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getMusic_OwnedSections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Section> getOwnedSections();

	/**
	 * Returns the value of the '<em><b>Bpm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bpm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpm</em>' attribute.
	 * @see #setBpm(int)
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getMusic_Bpm()
	 * @model
	 * @generated
	 */
	int getBpm();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getBpm <em>Bpm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpm</em>' attribute.
	 * @see #getBpm()
	 * @generated
	 */
	void setBpm(int value);

	/**
	 * Returns the value of the '<em><b>Resolution Per Slide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution Per Slide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution Per Slide</em>' attribute.
	 * @see #setResolutionPerSlide(int)
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getMusic_ResolutionPerSlide()
	 * @model
	 * @generated
	 */
	int getResolutionPerSlide();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getResolutionPerSlide <em>Resolution Per Slide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Per Slide</em>' attribute.
	 * @see #getResolutionPerSlide()
	 * @generated
	 */
	void setResolutionPerSlide(int value);

	/**
	 * Returns the value of the '<em><b>Owned Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.dsl.rythmml.model.rythmml.Pattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Patterns</em>' containment reference list.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getMusic_OwnedPatterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern> getOwnedPatterns();

	/**
	 * Returns the value of the '<em><b>Owned Bars</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.dsl.rythmml.model.rythmml.Bar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Bars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Bars</em>' containment reference list.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getMusic_OwnedBars()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bar> getOwnedBars();

	/**
	 * Returns the value of the '<em><b>Owned Beats</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.dsl.rythmml.model.rythmml.Beat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Beats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Beats</em>' containment reference list.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getMusic_OwnedBeats()
	 * @model containment="true"
	 * @generated
	 */
	EList<Beat> getOwnedBeats();

	/**
	 * Returns the value of the '<em><b>Owned Notes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.dsl.rythmml.model.rythmml.Note}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Notes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Notes</em>' containment reference list.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#getMusic_OwnedNotes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Note> getOwnedNotes();

} // Music
