package fr.unice.polytech.dsl.rythmml.rymlToJava;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import fr.unice.polytech.dsl.rythmml.RymlStandaloneSetup;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Music;
import fr.unice.polytech.dsl.rythmml.model.rythmml.RythmmlPackage;
import fr.unice.polytech.dsl.rythmml.model.RymlSwitchPrinter;

public class Main {
	public static void main(String[] args) {
		String defaultRessource = "resources/billieJean.ryml";
		String modelPath = (args.length != 0 ? args[0] : defaultRessource);
		String destinationPath = (args.length != 0 ? args[0].replace(".ryml", ".xmi") : "resources/billieJean.xmi");
		String code = "";
		try {
			ArduinoML2xmi(modelPath, destinationPath);
			code = xmi2NativeArduino(destinationPath);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(code);

	}

	private static void ArduinoML2xmi(String modelPath, String destinationPath) throws IOException {
		// register ArduinoML
		ResourceSet resources = new ResourceSetImpl();
		Map<String, Object> packageRegistry = resources.getPackageRegistry();
		packageRegistry.put(RythmmlPackage.eNS_URI, RythmmlPackage.eINSTANCE);

		// load ArduinoML dependencies
		Injector injector = new RymlStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

		// load the dsl file and parse it
		URI uri = URI.createURI(modelPath);
		Resource xtextResource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(xtextResource);
		Resource xmiResource = resourceSet.createResource(URI.createURI(destinationPath));
		// add the root (often forgotten)
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		
		xmiResource.save(null);
	}

	private static String xmi2NativeArduino(String xmiPath) throws IOException {
		// register ArduinoML
		ResourceSet resourceSet = new ResourceSetImpl();
		Map<String, Object> packageRegistry = resourceSet.getPackageRegistry();
		packageRegistry.put(RythmmlPackage.eNS_URI, RythmmlPackage.eINSTANCE);

		// load the xmi file
		XMIResource resource = new XMIResourceImpl(URI.createURI("file:" + xmiPath));
		resource.load(null);

		// get the root of the model
		Music music = (Music) resource.getContents().get(0);

		// Launch the visitor on the root
		RymlSwitchPrinter visitor = new RymlSwitchPrinter();
		return visitor.doSwitch(music);
	}
}
