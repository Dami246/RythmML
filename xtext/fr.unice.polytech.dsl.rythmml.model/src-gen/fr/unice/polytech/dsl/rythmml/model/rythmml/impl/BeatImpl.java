/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml.impl;

import fr.unice.polytech.dsl.rythmml.model.rythmml.Beat;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Note;
import fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Beat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.BeatImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.BeatImpl#getTotalDivNumber <em>Total Div Number</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.BeatImpl#getNote <em>Note</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.BeatImpl#getNotePositions <em>Note Positions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeatImpl extends MinimalEObjectImpl.Container implements Beat {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalDivNumber() <em>Total Div Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDivNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_DIV_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalDivNumber() <em>Total Div Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDivNumber()
	 * @generated
	 * @ordered
	 */
	protected int totalDivNumber = TOTAL_DIV_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Note> note;

	/**
	 * The cached value of the '{@link #getNotePositions() <em>Note Positions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotePositions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> notePositions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RythmmlPackage.Literals.BEAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RythmmlPackage.BEAT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalDivNumber() {
		return totalDivNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalDivNumber(int newTotalDivNumber) {
		int oldTotalDivNumber = totalDivNumber;
		totalDivNumber = newTotalDivNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RythmmlPackage.BEAT__TOTAL_DIV_NUMBER,
					oldTotalDivNumber, totalDivNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Note> getNote() {
		if (note == null) {
			note = new EObjectResolvingEList<Note>(Note.class, this, RythmmlPackage.BEAT__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getNotePositions() {
		if (notePositions == null) {
			notePositions = new EDataTypeEList<Integer>(Integer.class, this, RythmmlPackage.BEAT__NOTE_POSITIONS);
		}
		return notePositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RythmmlPackage.BEAT__NAME:
			return getName();
		case RythmmlPackage.BEAT__TOTAL_DIV_NUMBER:
			return getTotalDivNumber();
		case RythmmlPackage.BEAT__NOTE:
			return getNote();
		case RythmmlPackage.BEAT__NOTE_POSITIONS:
			return getNotePositions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RythmmlPackage.BEAT__NAME:
			setName((String) newValue);
			return;
		case RythmmlPackage.BEAT__TOTAL_DIV_NUMBER:
			setTotalDivNumber((Integer) newValue);
			return;
		case RythmmlPackage.BEAT__NOTE:
			getNote().clear();
			getNote().addAll((Collection<? extends Note>) newValue);
			return;
		case RythmmlPackage.BEAT__NOTE_POSITIONS:
			getNotePositions().clear();
			getNotePositions().addAll((Collection<? extends Integer>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RythmmlPackage.BEAT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RythmmlPackage.BEAT__TOTAL_DIV_NUMBER:
			setTotalDivNumber(TOTAL_DIV_NUMBER_EDEFAULT);
			return;
		case RythmmlPackage.BEAT__NOTE:
			getNote().clear();
			return;
		case RythmmlPackage.BEAT__NOTE_POSITIONS:
			getNotePositions().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RythmmlPackage.BEAT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RythmmlPackage.BEAT__TOTAL_DIV_NUMBER:
			return totalDivNumber != TOTAL_DIV_NUMBER_EDEFAULT;
		case RythmmlPackage.BEAT__NOTE:
			return note != null && !note.isEmpty();
		case RythmmlPackage.BEAT__NOTE_POSITIONS:
			return notePositions != null && !notePositions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", totalDivNumber: ");
		result.append(totalDivNumber);
		result.append(", notePositions: ");
		result.append(notePositions);
		result.append(')');
		return result.toString();
	}

} //BeatImpl
