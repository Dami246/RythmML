/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlFactory
 * @model kind="package"
 * @generated
 */
public interface RythmmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rythmml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/rythmml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rythmml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RythmmlPackage eINSTANCE = fr.unice.polytech.dsl.rythmml.model.rythmml.impl.RythmmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.NamedElement <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.NamedElement
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.RythmmlPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl <em>Music</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.RythmmlPackageImpl#getMusic()
	 * @generated
	 */
	int MUSIC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC__TITLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC__AUTHOR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC__SECTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bpm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC__BPM = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resolution Per Slide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC__RESOLUTION_PER_SLIDE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC__PATTERN = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC__BAR = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Beat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC__BEAT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC__NOTE = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Music</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Music</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.SectionImpl
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.RythmmlPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__PATTERN = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.PatternImpl
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.RythmmlPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Bar</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__BAR = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.BarImpl <em>Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.BarImpl
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.RythmmlPackageImpl#getBar()
	 * @generated
	 */
	int BAR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Beat</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__BEAT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.BeatImpl <em>Beat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.BeatImpl
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.RythmmlPackageImpl#getBeat()
	 * @generated
	 */
	int BEAT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Total Div Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAT__TOTAL_DIV_NUMBER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Note</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAT__NOTE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Note Positions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAT__NOTE_POSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Beat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Beat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.NoteImpl
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.RythmmlPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.DrumNoteValue <em>Drum Note Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.DrumNoteValue
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.RythmmlPackageImpl#getDrumNoteValue()
	 * @generated
	 */
	int DRUM_NOTE_VALUE = 7;

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music <em>Music</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Music</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Music
	 * @generated
	 */
	EClass getMusic();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getTitle()
	 * @see #getMusic()
	 * @generated
	 */
	EAttribute getMusic_Title();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getAuthor()
	 * @see #getMusic()
	 * @generated
	 */
	EAttribute getMusic_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Section</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getSection()
	 * @see #getMusic()
	 * @generated
	 */
	EReference getMusic_Section();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getBpm <em>Bpm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bpm</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getBpm()
	 * @see #getMusic()
	 * @generated
	 */
	EAttribute getMusic_Bpm();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getResolutionPerSlide <em>Resolution Per Slide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Per Slide</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getResolutionPerSlide()
	 * @see #getMusic()
	 * @generated
	 */
	EAttribute getMusic_ResolutionPerSlide();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pattern</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getPattern()
	 * @see #getMusic()
	 * @generated
	 */
	EReference getMusic_Pattern();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getBar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bar</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getBar()
	 * @see #getMusic()
	 * @generated
	 */
	EReference getMusic_Bar();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getBeat <em>Beat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beat</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getBeat()
	 * @see #getMusic()
	 * @generated
	 */
	EReference getMusic_Beat();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Note</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Music#getNote()
	 * @see #getMusic()
	 * @generated
	 */
	EReference getMusic_Note();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the reference list '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Section#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pattern</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Section#getPattern()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Pattern();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the reference list '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Pattern#getBar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bar</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Pattern#getBar()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Bar();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Bar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Bar
	 * @generated
	 */
	EClass getBar();

	/**
	 * Returns the meta object for the reference list '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Bar#getBeat <em>Beat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Beat</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Bar#getBeat()
	 * @see #getBar()
	 * @generated
	 */
	EReference getBar_Beat();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Beat <em>Beat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beat</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Beat
	 * @generated
	 */
	EClass getBeat();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Beat#getTotalDivNumber <em>Total Div Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Div Number</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Beat#getTotalDivNumber()
	 * @see #getBeat()
	 * @generated
	 */
	EAttribute getBeat_TotalDivNumber();

	/**
	 * Returns the meta object for the reference list '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Beat#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Note</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Beat#getNote()
	 * @see #getBeat()
	 * @generated
	 */
	EReference getBeat_Note();

	/**
	 * Returns the meta object for the attribute list '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Beat#getNotePositions <em>Note Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Note Positions</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Beat#getNotePositions()
	 * @see #getBeat()
	 * @generated
	 */
	EAttribute getBeat_NotePositions();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.Note#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.Note#getValue()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Value();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for enum '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.DrumNoteValue <em>Drum Note Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Drum Note Value</em>'.
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.DrumNoteValue
	 * @generated
	 */
	EEnum getDrumNoteValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RythmmlFactory getRythmmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl <em>Music</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl
		 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.RythmmlPackageImpl#getMusic()
		 * @generated
		 */
		EClass MUSIC = eINSTANCE.getMusic();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUSIC__TITLE = eINSTANCE.getMusic_Title();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUSIC__AUTHOR = eINSTANCE.getMusic_Author();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUSIC__SECTION = eINSTANCE.getMusic_Section();

		/**
		 * The meta object literal for the '<em><b>Bpm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUSIC__BPM = eINSTANCE.getMusic_Bpm();

		/**
		 * The meta object literal for the '<em><b>Resolution Per Slide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUSIC__RESOLUTION_PER_SLIDE = eINSTANCE.getMusic_ResolutionPerSlide();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUSIC__PATTERN = eINSTANCE.getMusic_Pattern();

		/**
		 * The meta object literal for the '<em><b>Bar</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUSIC__BAR = eINSTANCE.getMusic_Bar();

		/**
		 * The meta object literal for the '<em><b>Beat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUSIC__BEAT = eINSTANCE.getMusic_Beat();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUSIC__NOTE = eINSTANCE.getMusic_Note();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.SectionImpl
		 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.RythmmlPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__PATTERN = eINSTANCE.getSection_Pattern();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.PatternImpl
		 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.RythmmlPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Bar</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__BAR = eINSTANCE.getPattern_Bar();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.BarImpl <em>Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.BarImpl
		 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.RythmmlPackageImpl#getBar()
		 * @generated
		 */
		EClass BAR = eINSTANCE.getBar();

		/**
		 * The meta object literal for the '<em><b>Beat</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAR__BEAT = eINSTANCE.getBar_Beat();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.BeatImpl <em>Beat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.BeatImpl
		 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.RythmmlPackageImpl#getBeat()
		 * @generated
		 */
		EClass BEAT = eINSTANCE.getBeat();

		/**
		 * The meta object literal for the '<em><b>Total Div Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAT__TOTAL_DIV_NUMBER = eINSTANCE.getBeat_TotalDivNumber();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEAT__NOTE = eINSTANCE.getBeat_Note();

		/**
		 * The meta object literal for the '<em><b>Note Positions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAT__NOTE_POSITIONS = eINSTANCE.getBeat_NotePositions();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.NoteImpl
		 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.RythmmlPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__VALUE = eINSTANCE.getNote_Value();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.NamedElement <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.NamedElement
		 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.RythmmlPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.rythmml.model.rythmml.DrumNoteValue <em>Drum Note Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.DrumNoteValue
		 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.impl.RythmmlPackageImpl#getDrumNoteValue()
		 * @generated
		 */
		EEnum DRUM_NOTE_VALUE = eINSTANCE.getDrumNoteValue();

	}

} //RythmmlPackage
