/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.dsl.rythmml.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.unice.polytech.dsl.rythmml.ide.contentassist.antlr.internal.InternalRymlParser;
import fr.unice.polytech.dsl.rythmml.services.RymlGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class RymlParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RymlGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RymlGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
			builder.put(grammarAccess.getBarAccess().getAlternatives(), "rule__Bar__Alternatives");
			builder.put(grammarAccess.getDrumNoteValueAccess().getAlternatives(), "rule__DrumNoteValue__Alternatives");
			builder.put(grammarAccess.getMusicAccess().getGroup(), "rule__Music__Group__0");
			builder.put(grammarAccess.getMusicAccess().getGroup_3(), "rule__Music__Group_3__0");
			builder.put(grammarAccess.getMusicAccess().getGroup_4(), "rule__Music__Group_4__0");
			builder.put(grammarAccess.getMusicAccess().getGroup_5(), "rule__Music__Group_5__0");
			builder.put(grammarAccess.getMusicAccess().getGroup_6(), "rule__Music__Group_6__0");
			builder.put(grammarAccess.getMusicAccess().getGroup_7(), "rule__Music__Group_7__0");
			builder.put(grammarAccess.getMusicAccess().getGroup_8(), "rule__Music__Group_8__0");
			builder.put(grammarAccess.getMusicAccess().getGroup_9(), "rule__Music__Group_9__0");
			builder.put(grammarAccess.getMusicAccess().getGroup_10(), "rule__Music__Group_10__0");
			builder.put(grammarAccess.getMusicAccess().getGroup_11(), "rule__Music__Group_11__0");
			builder.put(grammarAccess.getSectionAccess().getGroup(), "rule__Section__Group__0");
			builder.put(grammarAccess.getSectionAccess().getGroup_4(), "rule__Section__Group_4__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getPatternAccess().getGroup(), "rule__Pattern__Group__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_4(), "rule__Pattern__Group_4__0");
			builder.put(grammarAccess.getBarMultiplierAccess().getGroup(), "rule__BarMultiplier__Group__0");
			builder.put(grammarAccess.getBarMultiplierAccess().getGroup_2(), "rule__BarMultiplier__Group_2__0");
			builder.put(grammarAccess.getNoteAdditionAccess().getGroup(), "rule__NoteAddition__Group__0");
			builder.put(grammarAccess.getNoteAdditionAccess().getGroup_0(), "rule__NoteAddition__Group_0__0");
			builder.put(grammarAccess.getNoteDeletionAccess().getGroup(), "rule__NoteDeletion__Group__0");
			builder.put(grammarAccess.getNoteDeletionAccess().getGroup_0(), "rule__NoteDeletion__Group_0__0");
			builder.put(grammarAccess.getNoteReplacementAccess().getGroup(), "rule__NoteReplacement__Group__0");
			builder.put(grammarAccess.getNoteReplacementAccess().getGroup_0(), "rule__NoteReplacement__Group_0__0");
			builder.put(grammarAccess.getClassicalBarAccess().getGroup(), "rule__ClassicalBar__Group__0");
			builder.put(grammarAccess.getClassicalBarAccess().getGroup_5(), "rule__ClassicalBar__Group_5__0");
			builder.put(grammarAccess.getModifiedBarAccess().getGroup(), "rule__ModifiedBar__Group__0");
			builder.put(grammarAccess.getModifiedBarAccess().getGroup_8(), "rule__ModifiedBar__Group_8__0");
			builder.put(grammarAccess.getBeatAccess().getGroup(), "rule__Beat__Group__0");
			builder.put(grammarAccess.getBeatAccess().getGroup_3(), "rule__Beat__Group_3__0");
			builder.put(grammarAccess.getBeatAccess().getGroup_7(), "rule__Beat__Group_7__0");
			builder.put(grammarAccess.getNoteAccess().getGroup(), "rule__Note__Group__0");
			builder.put(grammarAccess.getMusicAccess().getNameAssignment_1(), "rule__Music__NameAssignment_1");
			builder.put(grammarAccess.getMusicAccess().getTitleAssignment_3_1(), "rule__Music__TitleAssignment_3_1");
			builder.put(grammarAccess.getMusicAccess().getAuthorAssignment_4_1(), "rule__Music__AuthorAssignment_4_1");
			builder.put(grammarAccess.getMusicAccess().getBpmAssignment_5_1(), "rule__Music__BpmAssignment_5_1");
			builder.put(grammarAccess.getMusicAccess().getResolutionPerSlideAssignment_6_1(), "rule__Music__ResolutionPerSlideAssignment_6_1");
			builder.put(grammarAccess.getMusicAccess().getOwnedNotesAssignment_7_0(), "rule__Music__OwnedNotesAssignment_7_0");
			builder.put(grammarAccess.getMusicAccess().getOwnedNotesAssignment_7_1(), "rule__Music__OwnedNotesAssignment_7_1");
			builder.put(grammarAccess.getMusicAccess().getOwnedBeatsAssignment_8_0(), "rule__Music__OwnedBeatsAssignment_8_0");
			builder.put(grammarAccess.getMusicAccess().getOwnedBeatsAssignment_8_1(), "rule__Music__OwnedBeatsAssignment_8_1");
			builder.put(grammarAccess.getMusicAccess().getOwnedBarsAssignment_9_0(), "rule__Music__OwnedBarsAssignment_9_0");
			builder.put(grammarAccess.getMusicAccess().getOwnedBarsAssignment_9_1(), "rule__Music__OwnedBarsAssignment_9_1");
			builder.put(grammarAccess.getMusicAccess().getOwnedPatternsAssignment_10_0(), "rule__Music__OwnedPatternsAssignment_10_0");
			builder.put(grammarAccess.getMusicAccess().getOwnedPatternsAssignment_10_1(), "rule__Music__OwnedPatternsAssignment_10_1");
			builder.put(grammarAccess.getMusicAccess().getOwnedSectionsAssignment_11_0(), "rule__Music__OwnedSectionsAssignment_11_0");
			builder.put(grammarAccess.getMusicAccess().getOwnedSectionsAssignment_11_1(), "rule__Music__OwnedSectionsAssignment_11_1");
			builder.put(grammarAccess.getSectionAccess().getNameAssignment_1(), "rule__Section__NameAssignment_1");
			builder.put(grammarAccess.getSectionAccess().getPatternsAssignment_3(), "rule__Section__PatternsAssignment_3");
			builder.put(grammarAccess.getSectionAccess().getPatternsAssignment_4_1(), "rule__Section__PatternsAssignment_4_1");
			builder.put(grammarAccess.getPatternAccess().getNameAssignment_1(), "rule__Pattern__NameAssignment_1");
			builder.put(grammarAccess.getPatternAccess().getBarsAssignment_3(), "rule__Pattern__BarsAssignment_3");
			builder.put(grammarAccess.getPatternAccess().getBarsAssignment_4_1(), "rule__Pattern__BarsAssignment_4_1");
			builder.put(grammarAccess.getBarMultiplierAccess().getBarAssignment_1(), "rule__BarMultiplier__BarAssignment_1");
			builder.put(grammarAccess.getBarMultiplierAccess().getMultiplierAssignment_2_1(), "rule__BarMultiplier__MultiplierAssignment_2_1");
			builder.put(grammarAccess.getNoteAdditionAccess().getBeatNumberAssignment_0_1(), "rule__NoteAddition__BeatNumberAssignment_0_1");
			builder.put(grammarAccess.getNoteAdditionAccess().getNoteAssignment_2(), "rule__NoteAddition__NoteAssignment_2");
			builder.put(grammarAccess.getNoteAdditionAccess().getDivisionAssignment_4(), "rule__NoteAddition__DivisionAssignment_4");
			builder.put(grammarAccess.getNoteDeletionAccess().getBeatNumberAssignment_0_1(), "rule__NoteDeletion__BeatNumberAssignment_0_1");
			builder.put(grammarAccess.getNoteDeletionAccess().getNoteAssignment_2(), "rule__NoteDeletion__NoteAssignment_2");
			builder.put(grammarAccess.getNoteReplacementAccess().getBeatNumberAssignment_0_1(), "rule__NoteReplacement__BeatNumberAssignment_0_1");
			builder.put(grammarAccess.getNoteReplacementAccess().getNoteSrcAssignment_2(), "rule__NoteReplacement__NoteSrcAssignment_2");
			builder.put(grammarAccess.getNoteReplacementAccess().getNewNoteAssignment_4(), "rule__NoteReplacement__NewNoteAssignment_4");
			builder.put(grammarAccess.getClassicalBarAccess().getNameAssignment_2(), "rule__ClassicalBar__NameAssignment_2");
			builder.put(grammarAccess.getClassicalBarAccess().getBeatsAssignment_4(), "rule__ClassicalBar__BeatsAssignment_4");
			builder.put(grammarAccess.getClassicalBarAccess().getBeatsAssignment_5_1(), "rule__ClassicalBar__BeatsAssignment_5_1");
			builder.put(grammarAccess.getModifiedBarAccess().getNameAssignment_2(), "rule__ModifiedBar__NameAssignment_2");
			builder.put(grammarAccess.getModifiedBarAccess().getBarAssignment_4(), "rule__ModifiedBar__BarAssignment_4");
			builder.put(grammarAccess.getModifiedBarAccess().getOperationsAssignment_7(), "rule__ModifiedBar__OperationsAssignment_7");
			builder.put(grammarAccess.getModifiedBarAccess().getOperationsAssignment_8_1(), "rule__ModifiedBar__OperationsAssignment_8_1");
			builder.put(grammarAccess.getBeatAccess().getNameAssignment_1(), "rule__Beat__NameAssignment_1");
			builder.put(grammarAccess.getBeatAccess().getTotalDivNumberAssignment_3_1(), "rule__Beat__TotalDivNumberAssignment_3_1");
			builder.put(grammarAccess.getBeatAccess().getNotesAssignment_4(), "rule__Beat__NotesAssignment_4");
			builder.put(grammarAccess.getBeatAccess().getNotePositionsAssignment_6(), "rule__Beat__NotePositionsAssignment_6");
			builder.put(grammarAccess.getBeatAccess().getNotesAssignment_7_1(), "rule__Beat__NotesAssignment_7_1");
			builder.put(grammarAccess.getBeatAccess().getNotePositionsAssignment_7_3(), "rule__Beat__NotePositionsAssignment_7_3");
			builder.put(grammarAccess.getNoteAccess().getNameAssignment_2(), "rule__Note__NameAssignment_2");
			builder.put(grammarAccess.getNoteAccess().getValueAssignment_4(), "rule__Note__ValueAssignment_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RymlGrammarAccess grammarAccess;

	@Override
	protected InternalRymlParser createParser() {
		InternalRymlParser result = new InternalRymlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RymlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RymlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
