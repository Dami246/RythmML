/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.dsl.rythmml.formatting2

import com.google.inject.Inject
import fr.unice.polytech.dsl.rythmml.model.rythmml.Music
import fr.unice.polytech.dsl.rythmml.services.RymlGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class RymlFormatter extends AbstractFormatter2 {
	
	@Inject extension RymlGrammarAccess

	def dispatch void format(Music music, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (note : music.ownedNotes) {
			note.format
		}
		for (beat : music.ownedBeats) {
			beat.format
		}
		for (bar : music.ownedBars) {
			bar.format
		}
		for (pattern : music.ownedPatterns) {
			pattern.format
		}
		for (section : music.ownedSections) {
			section.format
		}
	}
	
	// TODO: implement for 
}
