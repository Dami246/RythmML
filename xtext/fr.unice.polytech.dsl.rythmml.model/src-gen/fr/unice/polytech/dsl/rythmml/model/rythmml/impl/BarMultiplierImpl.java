/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml.impl;

import fr.unice.polytech.dsl.rythmml.model.rythmml.Bar;
import fr.unice.polytech.dsl.rythmml.model.rythmml.BarMultiplier;
import fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bar Multiplier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.BarMultiplierImpl#getBar <em>Bar</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.BarMultiplierImpl#getMultiplier <em>Multiplier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BarMultiplierImpl extends MinimalEObjectImpl.Container implements BarMultiplier {
	/**
	 * The cached value of the '{@link #getBar() <em>Bar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBar()
	 * @generated
	 * @ordered
	 */
	protected Bar bar;

	/**
	 * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIPLIER_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected int multiplier = MULTIPLIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarMultiplierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RythmmlPackage.Literals.BAR_MULTIPLIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bar getBar() {
		if (bar != null && bar.eIsProxy()) {
			InternalEObject oldBar = (InternalEObject) bar;
			bar = (Bar) eResolveProxy(oldBar);
			if (bar != oldBar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RythmmlPackage.BAR_MULTIPLIER__BAR,
							oldBar, bar));
			}
		}
		return bar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bar basicGetBar() {
		return bar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBar(Bar newBar) {
		Bar oldBar = bar;
		bar = newBar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RythmmlPackage.BAR_MULTIPLIER__BAR, oldBar, bar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMultiplier() {
		return multiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplier(int newMultiplier) {
		int oldMultiplier = multiplier;
		multiplier = newMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RythmmlPackage.BAR_MULTIPLIER__MULTIPLIER,
					oldMultiplier, multiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RythmmlPackage.BAR_MULTIPLIER__BAR:
			if (resolve)
				return getBar();
			return basicGetBar();
		case RythmmlPackage.BAR_MULTIPLIER__MULTIPLIER:
			return getMultiplier();
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
		case RythmmlPackage.BAR_MULTIPLIER__BAR:
			setBar((Bar) newValue);
			return;
		case RythmmlPackage.BAR_MULTIPLIER__MULTIPLIER:
			setMultiplier((Integer) newValue);
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
		case RythmmlPackage.BAR_MULTIPLIER__BAR:
			setBar((Bar) null);
			return;
		case RythmmlPackage.BAR_MULTIPLIER__MULTIPLIER:
			setMultiplier(MULTIPLIER_EDEFAULT);
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
		case RythmmlPackage.BAR_MULTIPLIER__BAR:
			return bar != null;
		case RythmmlPackage.BAR_MULTIPLIER__MULTIPLIER:
			return multiplier != MULTIPLIER_EDEFAULT;
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
		result.append(" (multiplier: ");
		result.append(multiplier);
		result.append(')');
		return result.toString();
	}

} //BarMultiplierImpl
