/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml.impl;

import fr.unice.polytech.dsl.rythmml.model.rythmml.Note;
import fr.unice.polytech.dsl.rythmml.model.rythmml.NoteAddition;
import fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note Addition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.NoteAdditionImpl#getNote <em>Note</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.NoteAdditionImpl#getDivision <em>Division</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoteAdditionImpl extends OperationImpl implements NoteAddition {
	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected Note note;

	/**
	 * The default value of the '{@link #getDivision() <em>Division</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivision()
	 * @generated
	 * @ordered
	 */
	protected static final int DIVISION_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getDivision() <em>Division</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivision()
	 * @generated
	 * @ordered
	 */
	protected int division = DIVISION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteAdditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RythmmlPackage.Literals.NOTE_ADDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note getNote() {
		if (note != null && note.eIsProxy()) {
			InternalEObject oldNote = (InternalEObject) note;
			note = (Note) eResolveProxy(oldNote);
			if (note != oldNote) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RythmmlPackage.NOTE_ADDITION__NOTE,
							oldNote, note));
			}
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note basicGetNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(Note newNote) {
		Note oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RythmmlPackage.NOTE_ADDITION__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDivision() {
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDivision(int newDivision) {
		int oldDivision = division;
		division = newDivision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RythmmlPackage.NOTE_ADDITION__DIVISION, oldDivision,
					division));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RythmmlPackage.NOTE_ADDITION__NOTE:
			if (resolve)
				return getNote();
			return basicGetNote();
		case RythmmlPackage.NOTE_ADDITION__DIVISION:
			return getDivision();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RythmmlPackage.NOTE_ADDITION__NOTE:
			setNote((Note) newValue);
			return;
		case RythmmlPackage.NOTE_ADDITION__DIVISION:
			setDivision((Integer) newValue);
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
		case RythmmlPackage.NOTE_ADDITION__NOTE:
			setNote((Note) null);
			return;
		case RythmmlPackage.NOTE_ADDITION__DIVISION:
			setDivision(DIVISION_EDEFAULT);
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
		case RythmmlPackage.NOTE_ADDITION__NOTE:
			return note != null;
		case RythmmlPackage.NOTE_ADDITION__DIVISION:
			return division != DIVISION_EDEFAULT;
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
		result.append(" (division: ");
		result.append(division);
		result.append(')');
		return result.toString();
	}

} //NoteAdditionImpl
