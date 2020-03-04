package fr.unice.polytech.dsl.rythmml.model;

import java.text.MessageFormat;

import org.eclipse.emf.ecore.EObject;

import fr.unice.polytech.dsl.rythmml.model.rythmml.Bar;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Beat;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Music;
import fr.unice.polytech.dsl.rythmml.model.rythmml.NamedElement;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Note;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Pattern;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Section;
import fr.unice.polytech.dsl.rythmml.model.rythmml.util.RythmmlSwitch;

public class RymlSwitchPrinter extends RythmmlSwitch<String>{

	@Override
	protected String doSwitch(int classifierID, EObject theEObject) {
		// TODO Auto-generated method stub
		return super.doSwitch(classifierID, theEObject);
	}

	@Override
	public String caseMusic(Music music) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(String.format("Music %s = new MusicBuilder()", music.getName()));
		stringBuilder.append(String.format(".setAuthor(%s).setTitle(%s)", music.getAuthor(), music.getTitle()));
		//stringBuilder.append(String.format(".addSection(section1)");
		
		stringBuilder.append(".prepare().build(); \n");
		return "";
	}

	@Override
	public String caseSection(Section object) {
		// TODO Auto-generated method stub
		return super.caseSection(object);
	}

	@Override
	public String casePattern(Pattern object) {
		// TODO Auto-generated method stub
		return super.casePattern(object);
	}

	@Override
	public String caseBar(Bar object) {
		// TODO Auto-generated method stub
		return super.caseBar(object);
	}

	@Override
	public String caseBeat(Beat object) {
		// TODO Auto-generated method stub
		return super.caseBeat(object);
	}

	@Override
	public String caseNote(Note object) {
		// TODO Auto-generated method stub
		return super.caseNote(object);
	}

	@Override
	public String defaultCase(EObject object) {
		System.out.println("DefaultCase");
		return "";
	}
	
	

}
