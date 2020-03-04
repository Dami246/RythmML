/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml.impl;

import fr.unice.polytech.dsl.rythmml.model.rythmml.Bar;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Beat;
import fr.unice.polytech.dsl.rythmml.model.rythmml.DrumNoteValue;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Music;
import fr.unice.polytech.dsl.rythmml.model.rythmml.NamedElement;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Note;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Pattern;
import fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlFactory;
import fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Section;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RythmmlPackageImpl extends EPackageImpl implements RythmmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass musicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum drumNoteValueEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RythmmlPackageImpl() {
		super(eNS_URI, RythmmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RythmmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RythmmlPackage init() {
		if (isInited)
			return (RythmmlPackage) EPackage.Registry.INSTANCE.getEPackage(RythmmlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRythmmlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RythmmlPackageImpl theRythmmlPackage = registeredRythmmlPackage instanceof RythmmlPackageImpl
				? (RythmmlPackageImpl) registeredRythmmlPackage
				: new RythmmlPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRythmmlPackage.createPackageContents();

		// Initialize created meta-data
		theRythmmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRythmmlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RythmmlPackage.eNS_URI, theRythmmlPackage);
		return theRythmmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMusic() {
		return musicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMusic_Title() {
		return (EAttribute) musicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMusic_Author() {
		return (EAttribute) musicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMusic_OwnedSections() {
		return (EReference) musicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMusic_Bpm() {
		return (EAttribute) musicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMusic_ResolutionPerSlide() {
		return (EAttribute) musicEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMusic_OwnedPatterns() {
		return (EReference) musicEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMusic_OwnedBars() {
		return (EReference) musicEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMusic_OwnedBeats() {
		return (EReference) musicEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMusic_OwnedNotes() {
		return (EReference) musicEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_Patterns() {
		return (EReference) sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Bars() {
		return (EReference) patternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Multipliers() {
		return (EAttribute) patternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBar() {
		return barEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBar_Beats() {
		return (EReference) barEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeat() {
		return beatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeat_TotalDivNumber() {
		return (EAttribute) beatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeat_Notes() {
		return (EReference) beatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeat_NotePositions() {
		return (EAttribute) beatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Value() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDrumNoteValue() {
		return drumNoteValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RythmmlFactory getRythmmlFactory() {
		return (RythmmlFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		musicEClass = createEClass(MUSIC);
		createEAttribute(musicEClass, MUSIC__TITLE);
		createEAttribute(musicEClass, MUSIC__AUTHOR);
		createEReference(musicEClass, MUSIC__OWNED_SECTIONS);
		createEAttribute(musicEClass, MUSIC__BPM);
		createEAttribute(musicEClass, MUSIC__RESOLUTION_PER_SLIDE);
		createEReference(musicEClass, MUSIC__OWNED_PATTERNS);
		createEReference(musicEClass, MUSIC__OWNED_BARS);
		createEReference(musicEClass, MUSIC__OWNED_BEATS);
		createEReference(musicEClass, MUSIC__OWNED_NOTES);

		sectionEClass = createEClass(SECTION);
		createEReference(sectionEClass, SECTION__PATTERNS);

		patternEClass = createEClass(PATTERN);
		createEReference(patternEClass, PATTERN__BARS);
		createEAttribute(patternEClass, PATTERN__MULTIPLIERS);

		barEClass = createEClass(BAR);
		createEReference(barEClass, BAR__BEATS);

		beatEClass = createEClass(BEAT);
		createEAttribute(beatEClass, BEAT__TOTAL_DIV_NUMBER);
		createEReference(beatEClass, BEAT__NOTES);
		createEAttribute(beatEClass, BEAT__NOTE_POSITIONS);

		noteEClass = createEClass(NOTE);
		createEAttribute(noteEClass, NOTE__VALUE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		// Create enums
		drumNoteValueEEnum = createEEnum(DRUM_NOTE_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		musicEClass.getESuperTypes().add(this.getNamedElement());
		sectionEClass.getESuperTypes().add(this.getNamedElement());
		patternEClass.getESuperTypes().add(this.getNamedElement());
		barEClass.getESuperTypes().add(this.getNamedElement());
		beatEClass.getESuperTypes().add(this.getNamedElement());
		noteEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(musicEClass, Music.class, "Music", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMusic_Title(), ecorePackage.getEString(), "title", null, 0, 1, Music.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMusic_Author(), ecorePackage.getEString(), "author", null, 0, 1, Music.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMusic_OwnedSections(), this.getSection(), null, "ownedSections", null, 1, -1, Music.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMusic_Bpm(), ecorePackage.getEInt(), "bpm", null, 0, 1, Music.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMusic_ResolutionPerSlide(), ecorePackage.getEInt(), "resolutionPerSlide", null, 0, 1,
				Music.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMusic_OwnedPatterns(), this.getPattern(), null, "ownedPatterns", null, 0, -1, Music.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMusic_OwnedBars(), this.getBar(), null, "ownedBars", null, 0, -1, Music.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMusic_OwnedBeats(), this.getBeat(), null, "ownedBeats", null, 0, -1, Music.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMusic_OwnedNotes(), this.getNote(), null, "ownedNotes", null, 0, -1, Music.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSection_Patterns(), this.getPattern(), null, "patterns", null, 1, -1, Section.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPattern_Bars(), this.getBar(), null, "bars", null, 1, -1, Pattern.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPattern_Multipliers(), ecorePackage.getEInt(), "multipliers", null, 0, -1, Pattern.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(barEClass, Bar.class, "Bar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBar_Beats(), this.getBeat(), null, "beats", null, 1, -1, Bar.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(beatEClass, Beat.class, "Beat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBeat_TotalDivNumber(), ecorePackage.getEInt(), "totalDivNumber", null, 0, 1, Beat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getBeat_Notes(), this.getNote(), null, "notes", null, 1, -1, Beat.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getBeat_NotePositions(), ecorePackage.getEInt(), "notePositions", null, 0, -1, Beat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNote_Value(), this.getDrumNoteValue(), "value", null, 0, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(drumNoteValueEEnum, DrumNoteValue.class, "DrumNoteValue");
		addEEnumLiteral(drumNoteValueEEnum, DrumNoteValue.SD);
		addEEnumLiteral(drumNoteValueEEnum, DrumNoteValue.BD);
		addEEnumLiteral(drumNoteValueEEnum, DrumNoteValue.CH);
		addEEnumLiteral(drumNoteValueEEnum, DrumNoteValue.OH);
		addEEnumLiteral(drumNoteValueEEnum, DrumNoteValue.CC);
		addEEnumLiteral(drumNoteValueEEnum, DrumNoteValue.RC);
		addEEnumLiteral(drumNoteValueEEnum, DrumNoteValue.TM);
		addEEnumLiteral(drumNoteValueEEnum, DrumNoteValue.TO);
		addEEnumLiteral(drumNoteValueEEnum, DrumNoteValue.S);
		addEEnumLiteral(drumNoteValueEEnum, DrumNoteValue.WS);
		addEEnumLiteral(drumNoteValueEEnum, DrumNoteValue.L);

		// Create resource
		createResource(eNS_URI);
	}

} //RythmmlPackageImpl
