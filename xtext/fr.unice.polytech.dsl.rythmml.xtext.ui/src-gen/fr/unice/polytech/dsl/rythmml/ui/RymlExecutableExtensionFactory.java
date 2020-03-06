/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.dsl.rythmml.ui;

import com.google.inject.Injector;
import fr.unice.polytech.dsl.rythmml.xtext.ui.internal.XtextActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RymlExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(XtextActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		XtextActivator activator = XtextActivator.getInstance();
		return activator != null ? activator.getInjector(XtextActivator.FR_UNICE_POLYTECH_DSL_RYTHMML_RYML) : null;
	}

}
