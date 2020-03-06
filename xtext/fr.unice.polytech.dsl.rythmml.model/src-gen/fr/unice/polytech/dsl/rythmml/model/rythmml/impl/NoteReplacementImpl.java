/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml.impl;

import fr.unice.polytech.dsl.rythmml.model.rythmml.Note;
import fr.unice.polytech.dsl.rythmml.model.rythmml.NoteReplacement;
import fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note Replacement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.NoteReplacementImpl#getNoteSrc <em>Note Src</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.NoteReplacementImpl#getNewNote <em>New Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoteReplacementImpl extends OperationImpl implements NoteReplacement {
	/**
	 * The cached value of the '{@link #getNoteSrc() <em>Note Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteSrc()
	 * @generated
	 * @ordered
	 */
	protected Note noteSrc;
	/**
	 * The cached value of the '{@link #getNewNote() <em>New Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewNote()
	 * @generated
	 * @ordered
	 */
	protected Note newNote;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteReplacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RythmmlPackage.Literals.NOTE_REPLACEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note getNoteSrc() {
		if (noteSrc != null && noteSrc.eIsProxy()) {
			InternalEObject oldNoteSrc = (InternalEObject) noteSrc;
			noteSrc = (Note) eResolveProxy(oldNoteSrc);
			if (noteSrc != oldNoteSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RythmmlPackage.NOTE_REPLACEMENT__NOTE_SRC,
							oldNoteSrc, noteSrc));
			}
		}
		return noteSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note basicGetNoteSrc() {
		return noteSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteSrc(Note newNoteSrc) {
		Note oldNoteSrc = noteSrc;
		noteSrc = newNoteSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RythmmlPackage.NOTE_REPLACEMENT__NOTE_SRC, oldNoteSrc,
					noteSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note getNewNote() {
		if (newNote != null && newNote.eIsProxy()) {
			InternalEObject oldNewNote = (InternalEObject) newNote;
			newNote = (Note) eResolveProxy(oldNewNote);
			if (newNote != oldNewNote) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RythmmlPackage.NOTE_REPLACEMENT__NEW_NOTE,
							oldNewNote, newNote));
			}
		}
		return newNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note basicGetNewNote() {
		return newNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewNote(Note newNewNote) {
		Note oldNewNote = newNote;
		newNote = newNewNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RythmmlPackage.NOTE_REPLACEMENT__NEW_NOTE, oldNewNote,
					newNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RythmmlPackage.NOTE_REPLACEMENT__NOTE_SRC:
			if (resolve)
				return getNoteSrc();
			return basicGetNoteSrc();
		case RythmmlPackage.NOTE_REPLACEMENT__NEW_NOTE:
			if (resolve)
				return getNewNote();
			return basicGetNewNote();
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
		case RythmmlPackage.NOTE_REPLACEMENT__NOTE_SRC:
			setNoteSrc((Note) newValue);
			return;
		case RythmmlPackage.NOTE_REPLACEMENT__NEW_NOTE:
			setNewNote((Note) newValue);
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
		case RythmmlPackage.NOTE_REPLACEMENT__NOTE_SRC:
			setNoteSrc((Note) null);
			return;
		case RythmmlPackage.NOTE_REPLACEMENT__NEW_NOTE:
			setNewNote((Note) null);
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
		case RythmmlPackage.NOTE_REPLACEMENT__NOTE_SRC:
			return noteSrc != null;
		case RythmmlPackage.NOTE_REPLACEMENT__NEW_NOTE:
			return newNote != null;
		}
		return super.eIsSet(featureID);
	}

} //NoteReplacementImpl
