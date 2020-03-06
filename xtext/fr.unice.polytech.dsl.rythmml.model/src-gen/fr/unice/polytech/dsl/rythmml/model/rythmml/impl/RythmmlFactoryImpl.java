/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml.impl;

import fr.unice.polytech.dsl.rythmml.model.rythmml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RythmmlFactoryImpl extends EFactoryImpl implements RythmmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RythmmlFactory init() {
		try {
			RythmmlFactory theRythmmlFactory = (RythmmlFactory) EPackage.Registry.INSTANCE
					.getEFactory(RythmmlPackage.eNS_URI);
			if (theRythmmlFactory != null) {
				return theRythmmlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RythmmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RythmmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RythmmlPackage.MUSIC:
			return createMusic();
		case RythmmlPackage.SECTION:
			return createSection();
		case RythmmlPackage.PATTERN:
			return createPattern();
		case RythmmlPackage.BEAT:
			return createBeat();
		case RythmmlPackage.NOTE:
			return createNote();
		case RythmmlPackage.CLASSICAL_BAR:
			return createClassicalBar();
		case RythmmlPackage.MODIFIED_BAR:
			return createModifiedBar();
		case RythmmlPackage.BAR_MULTIPLIER:
			return createBarMultiplier();
		case RythmmlPackage.NOTE_ADDITION:
			return createNoteAddition();
		case RythmmlPackage.NOTE_DELETION:
			return createNoteDeletion();
		case RythmmlPackage.NOTE_REPLACEMENT:
			return createNoteReplacement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RythmmlPackage.DRUM_NOTE_VALUE:
			return createDrumNoteValueFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RythmmlPackage.DRUM_NOTE_VALUE:
			return convertDrumNoteValueToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Music createMusic() {
		MusicImpl music = new MusicImpl();
		return music;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createPattern() {
		PatternImpl pattern = new PatternImpl();
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Beat createBeat() {
		BeatImpl beat = new BeatImpl();
		return beat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicalBar createClassicalBar() {
		ClassicalBarImpl classicalBar = new ClassicalBarImpl();
		return classicalBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiedBar createModifiedBar() {
		ModifiedBarImpl modifiedBar = new ModifiedBarImpl();
		return modifiedBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarMultiplier createBarMultiplier() {
		BarMultiplierImpl barMultiplier = new BarMultiplierImpl();
		return barMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteAddition createNoteAddition() {
		NoteAdditionImpl noteAddition = new NoteAdditionImpl();
		return noteAddition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteDeletion createNoteDeletion() {
		NoteDeletionImpl noteDeletion = new NoteDeletionImpl();
		return noteDeletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteReplacement createNoteReplacement() {
		NoteReplacementImpl noteReplacement = new NoteReplacementImpl();
		return noteReplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrumNoteValue createDrumNoteValueFromString(EDataType eDataType, String initialValue) {
		DrumNoteValue result = DrumNoteValue.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDrumNoteValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RythmmlPackage getRythmmlPackage() {
		return (RythmmlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RythmmlPackage getPackage() {
		return RythmmlPackage.eINSTANCE;
	}

} //RythmmlFactoryImpl
