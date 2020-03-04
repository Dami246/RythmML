/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml.impl;

import fr.unice.polytech.dsl.rythmml.model.rythmml.Bar;
import fr.unice.polytech.dsl.rythmml.model.rythmml.ModifiedBar;
import fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modified Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.ModifiedBarImpl#getBar <em>Bar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifiedBarImpl extends BarImpl implements ModifiedBar {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifiedBarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RythmmlPackage.Literals.MODIFIED_BAR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RythmmlPackage.MODIFIED_BAR__BAR, oldBar,
							bar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RythmmlPackage.MODIFIED_BAR__BAR, oldBar, bar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RythmmlPackage.MODIFIED_BAR__BAR:
			if (resolve)
				return getBar();
			return basicGetBar();
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
		case RythmmlPackage.MODIFIED_BAR__BAR:
			setBar((Bar) newValue);
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
		case RythmmlPackage.MODIFIED_BAR__BAR:
			setBar((Bar) null);
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
		case RythmmlPackage.MODIFIED_BAR__BAR:
			return bar != null;
		}
		return super.eIsSet(featureID);
	}

} //ModifiedBarImpl
