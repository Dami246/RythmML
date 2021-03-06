/**
 */
package fr.unice.polytech.dsl.rythmml.model.rythmml.provider;

import fr.unice.polytech.dsl.rythmml.model.rythmml.Music;
import fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlFactory;
import fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.unice.polytech.dsl.rythmml.model.rythmml.Music} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MusicItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addAuthorPropertyDescriptor(object);
			addOwnedSectionsPropertyDescriptor(object);
			addBpmPropertyDescriptor(object);
			addResolutionPerSlidePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NamedElement_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature",
								"_UI_NamedElement_type"),
						RythmmlPackage.Literals.NAMED_ELEMENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Music_title_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Music_title_feature", "_UI_Music_type"),
						RythmmlPackage.Literals.MUSIC__TITLE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Music_author_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Music_author_feature", "_UI_Music_type"),
						RythmmlPackage.Literals.MUSIC__AUTHOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Owned Sections feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedSectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Music_ownedSections_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Music_ownedSections_feature",
								"_UI_Music_type"),
						RythmmlPackage.Literals.MUSIC__OWNED_SECTIONS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Bpm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBpmPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Music_bpm_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Music_bpm_feature", "_UI_Music_type"),
						RythmmlPackage.Literals.MUSIC__BPM, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Resolution Per Slide feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolutionPerSlidePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Music_resolutionPerSlide_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Music_resolutionPerSlide_feature",
								"_UI_Music_type"),
						RythmmlPackage.Literals.MUSIC__RESOLUTION_PER_SLIDE, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RythmmlPackage.Literals.MUSIC__OWNED_SECTIONS);
			childrenFeatures.add(RythmmlPackage.Literals.MUSIC__OWNED_PATTERNS);
			childrenFeatures.add(RythmmlPackage.Literals.MUSIC__OWNED_BARS);
			childrenFeatures.add(RythmmlPackage.Literals.MUSIC__OWNED_BEATS);
			childrenFeatures.add(RythmmlPackage.Literals.MUSIC__OWNED_NOTES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Music.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Music"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Music) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Music_type")
				: getString("_UI_Music_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Music.class)) {
		case RythmmlPackage.MUSIC__NAME:
		case RythmmlPackage.MUSIC__TITLE:
		case RythmmlPackage.MUSIC__AUTHOR:
		case RythmmlPackage.MUSIC__BPM:
		case RythmmlPackage.MUSIC__RESOLUTION_PER_SLIDE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case RythmmlPackage.MUSIC__OWNED_SECTIONS:
		case RythmmlPackage.MUSIC__OWNED_PATTERNS:
		case RythmmlPackage.MUSIC__OWNED_BARS:
		case RythmmlPackage.MUSIC__OWNED_BEATS:
		case RythmmlPackage.MUSIC__OWNED_NOTES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(RythmmlPackage.Literals.MUSIC__OWNED_SECTIONS,
				RythmmlFactory.eINSTANCE.createSection()));

		newChildDescriptors.add(createChildParameter(RythmmlPackage.Literals.MUSIC__OWNED_PATTERNS,
				RythmmlFactory.eINSTANCE.createPattern()));

		newChildDescriptors.add(createChildParameter(RythmmlPackage.Literals.MUSIC__OWNED_BARS,
				RythmmlFactory.eINSTANCE.createClassicalBar()));

		newChildDescriptors.add(createChildParameter(RythmmlPackage.Literals.MUSIC__OWNED_BARS,
				RythmmlFactory.eINSTANCE.createModifiedBar()));

		newChildDescriptors.add(createChildParameter(RythmmlPackage.Literals.MUSIC__OWNED_BEATS,
				RythmmlFactory.eINSTANCE.createBeat()));

		newChildDescriptors.add(createChildParameter(RythmmlPackage.Literals.MUSIC__OWNED_NOTES,
				RythmmlFactory.eINSTANCE.createNote()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RythmmlEditPlugin.INSTANCE;
	}

}
