/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml.impl;

import fr.unice.polytech.dsl.rythmml.model.rythmml.Bar;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Pattern;
import fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.PatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.PatternImpl#getBars <em>Bars</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.rythmml.model.rythmml.impl.PatternImpl#getMultipliers <em>Multipliers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternImpl extends MinimalEObjectImpl.Container implements Pattern {
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
	 * The cached value of the '{@link #getBars() <em>Bars</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBars()
	 * @generated
	 * @ordered
	 */
	protected EList<Bar> bars;

	/**
	 * The cached value of the '{@link #getMultipliers() <em>Multipliers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipliers()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> multipliers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RythmmlPackage.Literals.PATTERN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RythmmlPackage.PATTERN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bar> getBars() {
		if (bars == null) {
			bars = new EObjectResolvingEList<Bar>(Bar.class, this, RythmmlPackage.PATTERN__BARS);
		}
		return bars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getMultipliers() {
		if (multipliers == null) {
			multipliers = new EDataTypeUniqueEList<Integer>(Integer.class, this, RythmmlPackage.PATTERN__MULTIPLIERS);
		}
		return multipliers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RythmmlPackage.PATTERN__NAME:
			return getName();
		case RythmmlPackage.PATTERN__BARS:
			return getBars();
		case RythmmlPackage.PATTERN__MULTIPLIERS:
			return getMultipliers();
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
		case RythmmlPackage.PATTERN__NAME:
			setName((String) newValue);
			return;
		case RythmmlPackage.PATTERN__BARS:
			getBars().clear();
			getBars().addAll((Collection<? extends Bar>) newValue);
			return;
		case RythmmlPackage.PATTERN__MULTIPLIERS:
			getMultipliers().clear();
			getMultipliers().addAll((Collection<? extends Integer>) newValue);
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
		case RythmmlPackage.PATTERN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RythmmlPackage.PATTERN__BARS:
			getBars().clear();
			return;
		case RythmmlPackage.PATTERN__MULTIPLIERS:
			getMultipliers().clear();
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
		case RythmmlPackage.PATTERN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RythmmlPackage.PATTERN__BARS:
			return bars != null && !bars.isEmpty();
		case RythmmlPackage.PATTERN__MULTIPLIERS:
			return multipliers != null && !multipliers.isEmpty();
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
		result.append(", multipliers: ");
		result.append(multipliers);
		result.append(')');
		return result.toString();
	}

} //PatternImpl
