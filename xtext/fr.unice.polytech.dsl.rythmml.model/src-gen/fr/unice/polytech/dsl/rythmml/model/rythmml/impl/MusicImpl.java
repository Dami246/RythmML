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
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl#getSection <em>Section</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl#getBpm <em>Bpm</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl#getResolutionPerSlide <em>Resolution Per Slide</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl#getBar <em>Bar</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl#getBeat <em>Beat</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.MusicImpl#getNote <em>Note</em>}</li>
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
	 * The cached value of the '{@link #getSection() <em>Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> section;

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
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern> pattern;

	/**
	 * The cached value of the '{@link #getBar() <em>Bar</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBar()
	 * @generated
	 * @ordered
	 */
	protected EList<Bar> bar;

	/**
	 * The cached value of the '{@link #getBeat() <em>Beat</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeat()
	 * @generated
	 * @ordered
	 */
	protected EList<Beat> beat;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Note> note;

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
	public EList<Section> getSection() {
		if (section == null) {
			section = new EObjectContainmentEList<Section>(Section.class, this, RythmmlPackage.MUSIC__SECTION);
		}
		return section;
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
	public EList<Pattern> getPattern() {
		if (pattern == null) {
			pattern = new EObjectContainmentEList<Pattern>(Pattern.class, this, RythmmlPackage.MUSIC__PATTERN);
		}
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bar> getBar() {
		if (bar == null) {
			bar = new EObjectContainmentEList<Bar>(Bar.class, this, RythmmlPackage.MUSIC__BAR);
		}
		return bar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Beat> getBeat() {
		if (beat == null) {
			beat = new EObjectContainmentEList<Beat>(Beat.class, this, RythmmlPackage.MUSIC__BEAT);
		}
		return beat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Note> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Note>(Note.class, this, RythmmlPackage.MUSIC__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RythmmlPackage.MUSIC__SECTION:
			return ((InternalEList<?>) getSection()).basicRemove(otherEnd, msgs);
		case RythmmlPackage.MUSIC__PATTERN:
			return ((InternalEList<?>) getPattern()).basicRemove(otherEnd, msgs);
		case RythmmlPackage.MUSIC__BAR:
			return ((InternalEList<?>) getBar()).basicRemove(otherEnd, msgs);
		case RythmmlPackage.MUSIC__BEAT:
			return ((InternalEList<?>) getBeat()).basicRemove(otherEnd, msgs);
		case RythmmlPackage.MUSIC__NOTE:
			return ((InternalEList<?>) getNote()).basicRemove(otherEnd, msgs);
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
		case RythmmlPackage.MUSIC__SECTION:
			return getSection();
		case RythmmlPackage.MUSIC__BPM:
			return getBpm();
		case RythmmlPackage.MUSIC__RESOLUTION_PER_SLIDE:
			return getResolutionPerSlide();
		case RythmmlPackage.MUSIC__PATTERN:
			return getPattern();
		case RythmmlPackage.MUSIC__BAR:
			return getBar();
		case RythmmlPackage.MUSIC__BEAT:
			return getBeat();
		case RythmmlPackage.MUSIC__NOTE:
			return getNote();
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
		case RythmmlPackage.MUSIC__SECTION:
			getSection().clear();
			getSection().addAll((Collection<? extends Section>) newValue);
			return;
		case RythmmlPackage.MUSIC__BPM:
			setBpm((Integer) newValue);
			return;
		case RythmmlPackage.MUSIC__RESOLUTION_PER_SLIDE:
			setResolutionPerSlide((Integer) newValue);
			return;
		case RythmmlPackage.MUSIC__PATTERN:
			getPattern().clear();
			getPattern().addAll((Collection<? extends Pattern>) newValue);
			return;
		case RythmmlPackage.MUSIC__BAR:
			getBar().clear();
			getBar().addAll((Collection<? extends Bar>) newValue);
			return;
		case RythmmlPackage.MUSIC__BEAT:
			getBeat().clear();
			getBeat().addAll((Collection<? extends Beat>) newValue);
			return;
		case RythmmlPackage.MUSIC__NOTE:
			getNote().clear();
			getNote().addAll((Collection<? extends Note>) newValue);
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
		case RythmmlPackage.MUSIC__SECTION:
			getSection().clear();
			return;
		case RythmmlPackage.MUSIC__BPM:
			setBpm(BPM_EDEFAULT);
			return;
		case RythmmlPackage.MUSIC__RESOLUTION_PER_SLIDE:
			setResolutionPerSlide(RESOLUTION_PER_SLIDE_EDEFAULT);
			return;
		case RythmmlPackage.MUSIC__PATTERN:
			getPattern().clear();
			return;
		case RythmmlPackage.MUSIC__BAR:
			getBar().clear();
			return;
		case RythmmlPackage.MUSIC__BEAT:
			getBeat().clear();
			return;
		case RythmmlPackage.MUSIC__NOTE:
			getNote().clear();
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
		case RythmmlPackage.MUSIC__SECTION:
			return section != null && !section.isEmpty();
		case RythmmlPackage.MUSIC__BPM:
			return bpm != BPM_EDEFAULT;
		case RythmmlPackage.MUSIC__RESOLUTION_PER_SLIDE:
			return resolutionPerSlide != RESOLUTION_PER_SLIDE_EDEFAULT;
		case RythmmlPackage.MUSIC__PATTERN:
			return pattern != null && !pattern.isEmpty();
		case RythmmlPackage.MUSIC__BAR:
			return bar != null && !bar.isEmpty();
		case RythmmlPackage.MUSIC__BEAT:
			return beat != null && !beat.isEmpty();
		case RythmmlPackage.MUSIC__NOTE:
			return note != null && !note.isEmpty();
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
