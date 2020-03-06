/*
 * generated by Xtext 2.14.0
 */
grammar InternalRyml;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.unice.polytech.dsl.rythmml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.unice.polytech.dsl.rythmml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.unice.polytech.dsl.rythmml.services.RymlGrammarAccess;

}

@parser::members {

 	private RymlGrammarAccess grammarAccess;

    public InternalRymlParser(TokenStream input, RymlGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Music";
   	}

   	@Override
   	protected RymlGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMusic
entryRuleMusic returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMusicRule()); }
	iv_ruleMusic=ruleMusic
	{ $current=$iv_ruleMusic.current; }
	EOF;

// Rule Music
ruleMusic returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{ 
			  getUnorderedGroupHelper().enter(grammarAccess.getMusicAccess().getUnorderedGroup());
			}
			(
				(
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 0);
				}
							({true}?=>(otherlv_1='Music'
							{
								newLeafNode(otherlv_1, grammarAccess.getMusicAccess().getMusicKeyword_0_0());
							}
							(
								(
									{
										newCompositeNode(grammarAccess.getMusicAccess().getNameEStringParserRuleCall_0_1_0());
									}
									lv_name_2_0=ruleEString
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getMusicRule());
										}
										set(
											$current,
											"name",
											lv_name_2_0,
											"fr.unice.polytech.dsl.rythmml.Ryml.EString");
										afterParserOrEnumRuleCall();
									}
								)
							)
							otherlv_3=':'
							{
								newLeafNode(otherlv_3, grammarAccess.getMusicAccess().getColonKeyword_0_2());
							}
							(
								otherlv_4='title :'
								{
									newLeafNode(otherlv_4, grammarAccess.getMusicAccess().getTitleKeyword_0_3_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getMusicAccess().getTitleEStringParserRuleCall_0_3_1_0());
										}
										lv_title_5_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getMusicRule());
											}
											set(
												$current,
												"title",
												lv_title_5_0,
												"fr.unice.polytech.dsl.rythmml.Ryml.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
							)?
							(
								otherlv_6='author :'
								{
									newLeafNode(otherlv_6, grammarAccess.getMusicAccess().getAuthorKeyword_0_4_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getMusicAccess().getAuthorEStringParserRuleCall_0_4_1_0());
										}
										lv_author_7_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getMusicRule());
											}
											set(
												$current,
												"author",
												lv_author_7_0,
												"fr.unice.polytech.dsl.rythmml.Ryml.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
							)?
							(
								otherlv_8='bpm :'
								{
									newLeafNode(otherlv_8, grammarAccess.getMusicAccess().getBpmKeyword_0_5_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getMusicAccess().getBpmEIntParserRuleCall_0_5_1_0());
										}
										lv_bpm_9_0=ruleEInt
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getMusicRule());
											}
											set(
												$current,
												"bpm",
												lv_bpm_9_0,
												"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
											afterParserOrEnumRuleCall();
										}
									)
								)
							)?
							(
								otherlv_10='resolution per beats : '
								{
									newLeafNode(otherlv_10, grammarAccess.getMusicAccess().getResolutionPerBeatsKeyword_0_6_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getMusicAccess().getResolutionPerSlideEIntParserRuleCall_0_6_1_0());
										}
										lv_resolutionPerSlide_11_0=ruleEInt
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getMusicRule());
											}
											set(
												$current,
												"resolutionPerSlide",
												lv_resolutionPerSlide_11_0,
												"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
											afterParserOrEnumRuleCall();
										}
									)
								)
							)?
							(
								(
									(
										{
											newCompositeNode(grammarAccess.getMusicAccess().getOwnedNotesNoteParserRuleCall_0_7_0_0());
										}
										lv_ownedNotes_12_0=ruleNote
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getMusicRule());
											}
											add(
												$current,
												"ownedNotes",
												lv_ownedNotes_12_0,
												"fr.unice.polytech.dsl.rythmml.Ryml.Note");
											afterParserOrEnumRuleCall();
										}
									)
								)
								(
									(
										{
											newCompositeNode(grammarAccess.getMusicAccess().getOwnedNotesNoteParserRuleCall_0_7_1_0());
										}
										lv_ownedNotes_13_0=ruleNote
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getMusicRule());
											}
											add(
												$current,
												"ownedNotes",
												lv_ownedNotes_13_0,
												"fr.unice.polytech.dsl.rythmml.Ryml.Note");
											afterParserOrEnumRuleCall();
										}
									)
								)*
							)?
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMusicAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 1);
				}
							({true}?=>((
								(
									{
										newCompositeNode(grammarAccess.getMusicAccess().getOwnedBeatsBeatParserRuleCall_1_0_0());
									}
									lv_ownedBeats_14_0=ruleBeat
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getMusicRule());
										}
										add(
											$current,
											"ownedBeats",
											lv_ownedBeats_14_0,
											"fr.unice.polytech.dsl.rythmml.Ryml.Beat");
										afterParserOrEnumRuleCall();
									}
								)
							)
							(
								(
									{
										newCompositeNode(grammarAccess.getMusicAccess().getOwnedBeatsBeatParserRuleCall_1_1_0());
									}
									lv_ownedBeats_15_0=ruleBeat
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getMusicRule());
										}
										add(
											$current,
											"ownedBeats",
											lv_ownedBeats_15_0,
											"fr.unice.polytech.dsl.rythmml.Ryml.Beat");
										afterParserOrEnumRuleCall();
									}
								)
							)*
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMusicAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 2);
				}
							({true}?=>((
								(
									{
										newCompositeNode(grammarAccess.getMusicAccess().getOwnedBarsBarParserRuleCall_2_0_0());
									}
									lv_ownedBars_16_0=ruleBar
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getMusicRule());
										}
										add(
											$current,
											"ownedBars",
											lv_ownedBars_16_0,
											"fr.unice.polytech.dsl.rythmml.Ryml.Bar");
										afterParserOrEnumRuleCall();
									}
								)
							)
							(
								(
									{
										newCompositeNode(grammarAccess.getMusicAccess().getOwnedBarsBarParserRuleCall_2_1_0());
									}
									lv_ownedBars_17_0=ruleBar
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getMusicRule());
										}
										add(
											$current,
											"ownedBars",
											lv_ownedBars_17_0,
											"fr.unice.polytech.dsl.rythmml.Ryml.Bar");
										afterParserOrEnumRuleCall();
									}
								)
							)*
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMusicAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 3);
				}
							({true}?=>((
								(
									{
										newCompositeNode(grammarAccess.getMusicAccess().getOwnedPatternsPatternParserRuleCall_3_0_0());
									}
									lv_ownedPatterns_18_0=rulePattern
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getMusicRule());
										}
										add(
											$current,
											"ownedPatterns",
											lv_ownedPatterns_18_0,
											"fr.unice.polytech.dsl.rythmml.Ryml.Pattern");
										afterParserOrEnumRuleCall();
									}
								)
							)
							(
								(
									{
										newCompositeNode(grammarAccess.getMusicAccess().getOwnedPatternsPatternParserRuleCall_3_1_0());
									}
									lv_ownedPatterns_19_0=rulePattern
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getMusicRule());
										}
										add(
											$current,
											"ownedPatterns",
											lv_ownedPatterns_19_0,
											"fr.unice.polytech.dsl.rythmml.Ryml.Pattern");
										afterParserOrEnumRuleCall();
									}
								)
							)*
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMusicAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 4)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 4);
				}
							({true}?=>((
								(
									{
										newCompositeNode(grammarAccess.getMusicAccess().getOwnedSectionsSectionParserRuleCall_4_0_0());
									}
									lv_ownedSections_20_0=ruleSection
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getMusicRule());
										}
										add(
											$current,
											"ownedSections",
											lv_ownedSections_20_0,
											"fr.unice.polytech.dsl.rythmml.Ryml.Section");
										afterParserOrEnumRuleCall();
									}
								)
							)
							(
								(
									{
										newCompositeNode(grammarAccess.getMusicAccess().getOwnedSectionsSectionParserRuleCall_4_1_0());
									}
									lv_ownedSections_21_0=ruleSection
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getMusicRule());
										}
										add(
											$current,
											"ownedSections",
											lv_ownedSections_21_0,
											"fr.unice.polytech.dsl.rythmml.Ryml.Section");
										afterParserOrEnumRuleCall();
									}
								)
							)*
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMusicAccess().getUnorderedGroup());
				}
			)
		)
				)+
				{getUnorderedGroupHelper().canLeave(grammarAccess.getMusicAccess().getUnorderedGroup())}?
			)
		)
			{ 
			  getUnorderedGroupHelper().leave(grammarAccess.getMusicAccess().getUnorderedGroup());
			}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleSection
entryRuleSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSectionRule()); }
	iv_ruleSection=ruleSection
	{ $current=$iv_ruleSection.current; }
	EOF;

// Rule Section
ruleSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Section'
		{
			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSectionRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.unice.polytech.dsl.rythmml.Ryml.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSectionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getSectionAccess().getPatternsPatternCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='|'
			{
				newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getVerticalLineKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSectionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getSectionAccess().getPatternsPatternCrossReference_4_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRulePattern
entryRulePattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPatternRule()); }
	iv_rulePattern=rulePattern
	{ $current=$iv_rulePattern.current; }
	EOF;

// Rule Pattern
rulePattern returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Pattern'
		{
			newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getPatternKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPatternRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.unice.polytech.dsl.rythmml.Ryml.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPatternAccess().getBarsBarMultiplierParserRuleCall_3_0());
				}
				lv_bars_3_0=ruleBarMultiplier
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPatternRule());
					}
					add(
						$current,
						"bars",
						lv_bars_3_0,
						"fr.unice.polytech.dsl.rythmml.Ryml.BarMultiplier");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='|'
			{
				newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getVerticalLineKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPatternAccess().getBarsBarMultiplierParserRuleCall_4_1_0());
					}
					lv_bars_5_0=ruleBarMultiplier
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPatternRule());
						}
						add(
							$current,
							"bars",
							lv_bars_5_0,
							"fr.unice.polytech.dsl.rythmml.Ryml.BarMultiplier");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleBarMultiplier
entryRuleBarMultiplier returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBarMultiplierRule()); }
	iv_ruleBarMultiplier=ruleBarMultiplier
	{ $current=$iv_ruleBarMultiplier.current; }
	EOF;

// Rule BarMultiplier
ruleBarMultiplier returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBarMultiplierRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getBarMultiplierAccess().getBarBarCrossReference_0_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1='x'
			{
				newLeafNode(otherlv_1, grammarAccess.getBarMultiplierAccess().getXKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBarMultiplierAccess().getMultiplierEIntParserRuleCall_1_1_0());
					}
					lv_multiplier_2_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBarMultiplierRule());
						}
						set(
							$current,
							"multiplier",
							lv_multiplier_2_0,
							"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleBar
entryRuleBar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBarRule()); }
	iv_ruleBar=ruleBar
	{ $current=$iv_ruleBar.current; }
	EOF;

// Rule Bar
ruleBar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getBarAccess().getClassicalBarParserRuleCall_0());
		}
		this_ClassicalBar_0=ruleClassicalBar
		{
			$current = $this_ClassicalBar_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getBarAccess().getModifiedBarParserRuleCall_1());
		}
		this_ModifiedBar_1=ruleModifiedBar
		{
			$current = $this_ModifiedBar_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleClassicalBar
entryRuleClassicalBar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassicalBarRule()); }
	iv_ruleClassicalBar=ruleClassicalBar
	{ $current=$iv_ruleClassicalBar.current; }
	EOF;

// Rule ClassicalBar
ruleClassicalBar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Bar'
		{
			newLeafNode(otherlv_0, grammarAccess.getClassicalBarAccess().getBarKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClassicalBarAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassicalBarRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.unice.polytech.dsl.rythmml.Ryml.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getClassicalBarAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassicalBarRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getClassicalBarAccess().getBeatsBeatCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='|'
			{
				newLeafNode(otherlv_4, grammarAccess.getClassicalBarAccess().getVerticalLineKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getClassicalBarRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getClassicalBarAccess().getBeatsBeatCrossReference_4_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleModifiedBar
entryRuleModifiedBar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModifiedBarRule()); }
	iv_ruleModifiedBar=ruleModifiedBar
	{ $current=$iv_ruleModifiedBar.current; }
	EOF;

// Rule ModifiedBar
ruleModifiedBar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Bar'
		{
			newLeafNode(otherlv_0, grammarAccess.getModifiedBarAccess().getBarKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModifiedBarAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModifiedBarRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.unice.polytech.dsl.rythmml.Ryml.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=' based on :'
		{
			newLeafNode(otherlv_2, grammarAccess.getModifiedBarAccess().getBasedOnKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModifiedBarRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getModifiedBarAccess().getBarBarCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBeat
entryRuleBeat returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBeatRule()); }
	iv_ruleBeat=ruleBeat
	{ $current=$iv_ruleBeat.current; }
	EOF;

// Rule Beat
ruleBeat returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Beat'
		{
			newLeafNode(otherlv_0, grammarAccess.getBeatAccess().getBeatKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBeatAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBeatRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.unice.polytech.dsl.rythmml.Ryml.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getBeatAccess().getColonKeyword_2());
		}
		(
			otherlv_3='Nb of ticks : '
			{
				newLeafNode(otherlv_3, grammarAccess.getBeatAccess().getNbOfTicksKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBeatAccess().getTotalDivNumberEIntParserRuleCall_3_1_0());
					}
					lv_totalDivNumber_4_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBeatRule());
						}
						set(
							$current,
							"totalDivNumber",
							lv_totalDivNumber_4_0,
							"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5='Notes :'
		{
			newLeafNode(otherlv_5, grammarAccess.getBeatAccess().getNotesKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBeatRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getBeatAccess().getNotesNoteCrossReference_5_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7=','
		{
			newLeafNode(otherlv_7, grammarAccess.getBeatAccess().getCommaKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBeatAccess().getNotePositionsEIntParserRuleCall_7_0());
				}
				lv_notePositions_8_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBeatRule());
					}
					add(
						$current,
						"notePositions",
						lv_notePositions_8_0,
						"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_9='|'
			{
				newLeafNode(otherlv_9, grammarAccess.getBeatAccess().getVerticalLineKeyword_8_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBeatRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getBeatAccess().getNotesNoteCrossReference_8_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_11=','
			{
				newLeafNode(otherlv_11, grammarAccess.getBeatAccess().getCommaKeyword_8_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBeatAccess().getNotePositionsEIntParserRuleCall_8_3_0());
					}
					lv_notePositions_12_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBeatRule());
						}
						add(
							$current,
							"notePositions",
							lv_notePositions_12_0,
							"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleNote
entryRuleNote returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNoteRule()); }
	iv_ruleNote=ruleNote
	{ $current=$iv_ruleNote.current; }
	EOF;

// Rule Note
ruleNote returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Note'
		{
			newLeafNode(otherlv_0, grammarAccess.getNoteAccess().getNoteKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNoteAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNoteRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.unice.polytech.dsl.rythmml.Ryml.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getNoteAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNoteAccess().getValueDrumNoteValueEnumRuleCall_3_0());
				}
				lv_value_3_0=ruleDrumNoteValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNoteRule());
					}
					set(
						$current,
						"value",
						lv_value_3_0,
						"fr.unice.polytech.dsl.rythmml.Ryml.DrumNoteValue");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Rule DrumNoteValue
ruleDrumNoteValue returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='SD'
			{
				$current = grammarAccess.getDrumNoteValueAccess().getSDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDrumNoteValueAccess().getSDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='BD'
			{
				$current = grammarAccess.getDrumNoteValueAccess().getBDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDrumNoteValueAccess().getBDEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='CH'
			{
				$current = grammarAccess.getDrumNoteValueAccess().getCHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDrumNoteValueAccess().getCHEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='OH'
			{
				$current = grammarAccess.getDrumNoteValueAccess().getOHEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getDrumNoteValueAccess().getOHEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='CC'
			{
				$current = grammarAccess.getDrumNoteValueAccess().getCCEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getDrumNoteValueAccess().getCCEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='RC'
			{
				$current = grammarAccess.getDrumNoteValueAccess().getRCEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getDrumNoteValueAccess().getRCEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='TM'
			{
				$current = grammarAccess.getDrumNoteValueAccess().getTMEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getDrumNoteValueAccess().getTMEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='TO'
			{
				$current = grammarAccess.getDrumNoteValueAccess().getTOEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getDrumNoteValueAccess().getTOEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='S'
			{
				$current = grammarAccess.getDrumNoteValueAccess().getSEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getDrumNoteValueAccess().getSEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='WS'
			{
				$current = grammarAccess.getDrumNoteValueAccess().getWSEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getDrumNoteValueAccess().getWSEnumLiteralDeclaration_9());
			}
		)
		    |
		(
			enumLiteral_10='L'
			{
				$current = grammarAccess.getDrumNoteValueAccess().getLEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_10, grammarAccess.getDrumNoteValueAccess().getLEnumLiteralDeclaration_10());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;