/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml.impl;

import fr.unice.polytech.dsl.rythmml.model.rythmml.Bar;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Beat;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Music;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Note;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Pattern;
import fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Section;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Music</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl#getOwnedSections <em>Owned Sections</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl#getBpm <em>Bpm</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl#getResolutionPerSlide <em>Resolution Per Slide</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl#getOwnedPatterns <em>Owned Patterns</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl#getOwnedBars <em>Owned Bars</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl#getOwnedBeats <em>Owned Beats</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl#getOwnedNotes <em>Owned Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MusicImpl extends MinimalEObjectImpl.Container implements Music {
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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedSections() <em>Owned Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> ownedSections;

	/**
	 * The default value of the '{@link #getBpm() <em>Bpm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpm()
	 * @generated
	 * @ordered
	 */
	protected static final int BPM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBpm() <em>Bpm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpm()
	 * @generated
	 * @ordered
	 */
	protected int bpm = BPM_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolutionPerSlide() <em>Resolution Per Slide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionPerSlide()
	 * @generated
	 * @ordered
	 */
	protected static final int RESOLUTION_PER_SLIDE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResolutionPerSlide() <em>Resolution Per Slide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionPerSlide()
	 * @generated
	 * @ordered
	 */
	protected int resolutionPerSlide = RESOLUTION_PER_SLIDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedPatterns() <em>Owned Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern> ownedPatterns;

	/**
	 * The cached value of the '{@link #getOwnedBars() <em>Owned Bars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBars()
	 * @generated
	 * @ordered
	 */
	protected EList<Bar> ownedBars;

	/**
	 * The cached value of the '{@link #getOwnedBeats() <em>Owned Beats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBeats()
	 * @generated
	 * @ordered
	 */
	protected EList<Beat> ownedBeats;

	/**
	 * The cached value of the '{@link #getOwnedNotes() <em>Owned Notes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Note> ownedNotes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MusicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RythmmlPackage.Literals.MUSIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RythmmlPackage.MUSIC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RythmmlPackage.MUSIC__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RythmmlPackage.MUSIC__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getOwnedSections() {
		if (ownedSections == null) {
			ownedSections = new EObjectContainmentEList<Section>(Section.class, this,
					RythmmlPackage.MUSIC__OWNED_SECTIONS);
		}
		return ownedSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBpm() {
		return bpm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpm(int newBpm) {
		int oldBpm = bpm;
		bpm = newBpm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RythmmlPackage.MUSIC__BPM, oldBpm, bpm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResolutionPerSlide() {
		return resolutionPerSlide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolutionPerSlide(int newResolutionPerSlide) {
		int oldResolutionPerSlide = resolutionPerSlide;
		resolutionPerSlide = newResolutionPerSlide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RythmmlPackage.MUSIC__RESOLUTION_PER_SLIDE,
					oldResolutionPerSlide, resolutionPerSlide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern> getOwnedPatterns() {
		if (ownedPatterns == null) {
			ownedPatterns = new EObjectContainmentEList<Pattern>(Pattern.class, this,
					RythmmlPackage.MUSIC__OWNED_PATTERNS);
		}
		return ownedPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bar> getOwnedBars() {
		if (ownedBars == null) {
			ownedBars = new EObjectContainmentEList<Bar>(Bar.class, this, RythmmlPackage.MUSIC__OWNED_BARS);
		}
		return ownedBars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Beat> getOwnedBeats() {
		if (ownedBeats == null) {
			ownedBeats = new EObjectContainmentEList<Beat>(Beat.class, this, RythmmlPackage.MUSIC__OWNED_BEATS);
		}
		return ownedBeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Note> getOwnedNotes() {
		if (ownedNotes == null) {
			ownedNotes = new EObjectContainmentEList<Note>(Note.class, this, RythmmlPackage.MUSIC__OWNED_NOTES);
		}
		return ownedNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RythmmlPackage.MUSIC__OWNED_SECTIONS:
			return ((InternalEList<?>) getOwnedSections()).basicRemove(otherEnd, msgs);
		case RythmmlPackage.MUSIC__OWNED_PATTERNS:
			return ((InternalEList<?>) getOwnedPatterns()).basicRemove(otherEnd, msgs);
		case RythmmlPackage.MUSIC__OWNED_BARS:
			return ((InternalEList<?>) getOwnedBars()).basicRemove(otherEnd, msgs);
		case RythmmlPackage.MUSIC__OWNED_BEATS:
			return ((InternalEList<?>) getOwnedBeats()).basicRemove(otherEnd, msgs);
		case RythmmlPackage.MUSIC__OWNED_NOTES:
			return ((InternalEList<?>) getOwnedNotes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RythmmlPackage.MUSIC__NAME:
			return getName();
		case RythmmlPackage.MUSIC__TITLE:
			return getTitle();
		case RythmmlPackage.MUSIC__AUTHOR:
			return getAuthor();
		case RythmmlPackage.MUSIC__OWNED_SECTIONS:
			return getOwnedSections();
		case RythmmlPackage.MUSIC__BPM:
			return getBpm();
		case RythmmlPackage.MUSIC__RESOLUTION_PER_SLIDE:
			return getResolutionPerSlide();
		case RythmmlPackage.MUSIC__OWNED_PATTERNS:
			return getOwnedPatterns();
		case RythmmlPackage.MUSIC__OWNED_BARS:
			return getOwnedBars();
		case RythmmlPackage.MUSIC__OWNED_BEATS:
			return getOwnedBeats();
		case RythmmlPackage.MUSIC__OWNED_NOTES:
			return getOwnedNotes();
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
		case RythmmlPackage.MUSIC__NAME:
			setName((String) newValue);
			return;
		case RythmmlPackage.MUSIC__TITLE:
			setTitle((String) newValue);
			return;
		case RythmmlPackage.MUSIC__AUTHOR:
			setAuthor((String) newValue);
			return;
		case RythmmlPackage.MUSIC__OWNED_SECTIONS:
			getOwnedSections().clear();
			getOwnedSections().addAll((Collection<? extends Section>) newValue);
			return;
		case RythmmlPackage.MUSIC__BPM:
			setBpm((Integer) newValue);
			return;
		case RythmmlPackage.MUSIC__RESOLUTION_PER_SLIDE:
			setResolutionPerSlide((Integer) newValue);
			return;
		case RythmmlPackage.MUSIC__OWNED_PATTERNS:
			getOwnedPatterns().clear();
			getOwnedPatterns().addAll((Collection<? extends Pattern>) newValue);
			return;
		case RythmmlPackage.MUSIC__OWNED_BARS:
			getOwnedBars().clear();
			getOwnedBars().addAll((Collection<? extends Bar>) newValue);
			return;
		case RythmmlPackage.MUSIC__OWNED_BEATS:
			getOwnedBeats().clear();
			getOwnedBeats().addAll((Collection<? extends Beat>) newValue);
			return;
		case RythmmlPackage.MUSIC__OWNED_NOTES:
			getOwnedNotes().clear();
			getOwnedNotes().addAll((Collection<? extends Note>) newValue);
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
		case RythmmlPackage.MUSIC__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RythmmlPackage.MUSIC__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case RythmmlPackage.MUSIC__AUTHOR:
			setAuthor(AUTHOR_EDEFAULT);
			return;
		case RythmmlPackage.MUSIC__OWNED_SECTIONS:
			getOwnedSections().clear();
			return;
		case RythmmlPackage.MUSIC__BPM:
			setBpm(BPM_EDEFAULT);
			return;
		case RythmmlPackage.MUSIC__RESOLUTION_PER_SLIDE:
			setResolutionPerSlide(RESOLUTION_PER_SLIDE_EDEFAULT);
			return;
		case RythmmlPackage.MUSIC__OWNED_PATTERNS:
			getOwnedPatterns().clear();
			return;
		case RythmmlPackage.MUSIC__OWNED_BARS:
			getOwnedBars().clear();
			return;
		case RythmmlPackage.MUSIC__OWNED_BEATS:
			getOwnedBeats().clear();
			return;
		case RythmmlPackage.MUSIC__OWNED_NOTES:
			getOwnedNotes().clear();
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
		case RythmmlPackage.MUSIC__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RythmmlPackage.MUSIC__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case RythmmlPackage.MUSIC__AUTHOR:
			return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
		case RythmmlPackage.MUSIC__OWNED_SECTIONS:
			return ownedSections != null && !ownedSections.isEmpty();
		case RythmmlPackage.MUSIC__BPM:
			return bpm != BPM_EDEFAULT;
		case RythmmlPackage.MUSIC__RESOLUTION_PER_SLIDE:
			return resolutionPerSlide != RESOLUTION_PER_SLIDE_EDEFAULT;
		case RythmmlPackage.MUSIC__OWNED_PATTERNS:
			return ownedPatterns != null && !ownedPatterns.isEmpty();
		case RythmmlPackage.MUSIC__OWNED_BARS:
			return ownedBars != null && !ownedBars.isEmpty();
		case RythmmlPackage.MUSIC__OWNED_BEATS:
			return ownedBeats != null && !ownedBeats.isEmpty();
		case RythmmlPackage.MUSIC__OWNED_NOTES:
			return ownedNotes != null && !ownedNotes.isEmpty();
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
		result.append(", title: ");
		result.append(title);
		result.append(", author: ");
		result.append(author);
		result.append(", bpm: ");
		result.append(bpm);
		result.append(", resolutionPerSlide: ");
		result.append(resolutionPerSlide);
		result.append(')');
		return result.toString();
	}

} //MusicImpl
