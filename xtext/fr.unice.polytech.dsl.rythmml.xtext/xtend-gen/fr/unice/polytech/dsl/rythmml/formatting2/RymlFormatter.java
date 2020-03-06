/**
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.dsl.rythmml.formatting2;

import com.google.inject.Inject;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Bar;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Beat;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Music;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Note;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Pattern;
import fr.unice.polytech.dsl.rythmml.model.rythmml.Section;
import fr.unice.polytech.dsl.rythmml.services.RymlGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class RymlFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private RymlGrammarAccess _rymlGrammarAccess;
  
  protected void _format(final Music music, @Extension final IFormattableDocument document) {
    EList<Note> _ownedNotes = music.getOwnedNotes();
    for (final Note note : _ownedNotes) {
      document.<Note>format(note);
    }
    EList<Beat> _ownedBeats = music.getOwnedBeats();
    for (final Beat beat : _ownedBeats) {
      document.<Beat>format(beat);
    }
    EList<Bar> _ownedBars = music.getOwnedBars();
    for (final Bar bar : _ownedBars) {
      document.<Bar>format(bar);
    }
    EList<Pattern> _ownedPatterns = music.getOwnedPatterns();
    for (final Pattern pattern : _ownedPatterns) {
      document.<Pattern>format(pattern);
    }
    EList<Section> _ownedSections = music.getOwnedSections();
    for (final Section section : _ownedSections) {
      document.<Section>format(section);
    }
  }
  
  public void format(final Object music, final IFormattableDocument document) {
    if (music instanceof XtextResource) {
      _format((XtextResource)music, document);
      return;
    } else if (music instanceof Music) {
      _format((Music)music, document);
      return;
    } else if (music instanceof EObject) {
      _format((EObject)music, document);
      return;
    } else if (music == null) {
      _format((Void)null, document);
      return;
    } else if (music != null) {
      _format(music, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(music, document).toString());
    }
  }
}