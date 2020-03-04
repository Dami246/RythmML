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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRymlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Music'", "':'", "'title :'", "'author :'", "'bpm :'", "'resolution per beats : '", "'Section'", "'|'", "'-'", "'Pattern'", "'Bar'", "'Beat'", "'Nb of ticks : '", "'Notes :'", "','", "'Note'", "'SD'", "'BD'", "'CH'", "'OH'", "'CC'", "'RC'", "'TM'", "'TO'", "'S'", "'WS'", "'L'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRymlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRymlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRymlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRyml.g"; }



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




    // $ANTLR start "entryRuleMusic"
    // InternalRyml.g:65:1: entryRuleMusic returns [EObject current=null] : iv_ruleMusic= ruleMusic EOF ;
    public final EObject entryRuleMusic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMusic = null;


        try {
            // InternalRyml.g:65:46: (iv_ruleMusic= ruleMusic EOF )
            // InternalRyml.g:66:2: iv_ruleMusic= ruleMusic EOF
            {
             newCompositeNode(grammarAccess.getMusicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMusic=ruleMusic();

            state._fsp--;

             current =iv_ruleMusic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMusic"


    // $ANTLR start "ruleMusic"
    // InternalRyml.g:72:1: ruleMusic returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )* ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleMusic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_title_5_0 = null;

        AntlrDatatypeRuleToken lv_author_7_0 = null;

        AntlrDatatypeRuleToken lv_bpm_9_0 = null;

        AntlrDatatypeRuleToken lv_resolutionPerSlide_11_0 = null;

        EObject lv_note_12_0 = null;

        EObject lv_note_13_0 = null;

        EObject lv_beat_14_0 = null;

        EObject lv_beat_15_0 = null;

        EObject lv_bar_16_0 = null;

        EObject lv_bar_17_0 = null;

        EObject lv_pattern_18_0 = null;

        EObject lv_pattern_19_0 = null;

        EObject lv_section_20_0 = null;

        EObject lv_section_21_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )* ) ) ) ) )+ {...}?) ) ) )
            // InternalRyml.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )* ) ) ) ) )+ {...}?) ) )
            {
            // InternalRyml.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )* ) ) ) ) )+ {...}?) ) )
            // InternalRyml.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalRyml.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )* ) ) ) ) )+ {...}?) )
            // InternalRyml.g:81:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )* ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getMusicAccess().getUnorderedGroup());
            			
            // InternalRyml.g:84:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )* ) ) ) ) )+ {...}?)
            // InternalRyml.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )* ) ) ) ) )+ {...}?
            {
            // InternalRyml.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )* ) ) ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=5;
                int LA12_0 = input.LA(1);

                if ( LA12_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2) ) {
                    alt12=3;
                }
                else if ( ( LA12_0 == 17 || LA12_0 == 20 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3) ) {
                    alt12=4;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRyml.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )? ) ) ) )
            	    {
            	    // InternalRyml.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )? ) ) ) )
            	    // InternalRyml.g:87:4: {...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMusic", "getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRyml.g:87:99: ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )? ) ) )
            	    // InternalRyml.g:88:5: ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRyml.g:91:8: ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )? ) )
            	    // InternalRyml.g:91:9: {...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMusic", "true");
            	    }
            	    // InternalRyml.g:91:18: (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )? )
            	    // InternalRyml.g:91:19: otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )?
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getMusicAccess().getMusicKeyword_0_0());
            	    							
            	    // InternalRyml.g:95:8: ( (lv_name_2_0= ruleEString ) )
            	    // InternalRyml.g:96:9: (lv_name_2_0= ruleEString )
            	    {
            	    // InternalRyml.g:96:9: (lv_name_2_0= ruleEString )
            	    // InternalRyml.g:97:10: lv_name_2_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getMusicAccess().getNameEStringParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_name_2_0=ruleEString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMusicRule());
            	    										}
            	    										set(
            	    											current,
            	    											"name",
            	    											lv_name_2_0,
            	    											"fr.unice.polytech.dsl.rythmml.Ryml.EString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,12,FOLLOW_5); 

            	    								newLeafNode(otherlv_3, grammarAccess.getMusicAccess().getColonKeyword_0_2());
            	    							
            	    // InternalRyml.g:118:8: (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==13) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalRyml.g:119:9: otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) )
            	            {
            	            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            	            									newLeafNode(otherlv_4, grammarAccess.getMusicAccess().getTitleKeyword_0_3_0());
            	            								
            	            // InternalRyml.g:123:9: ( (lv_title_5_0= ruleEString ) )
            	            // InternalRyml.g:124:10: (lv_title_5_0= ruleEString )
            	            {
            	            // InternalRyml.g:124:10: (lv_title_5_0= ruleEString )
            	            // InternalRyml.g:125:11: lv_title_5_0= ruleEString
            	            {

            	            											newCompositeNode(grammarAccess.getMusicAccess().getTitleEStringParserRuleCall_0_3_1_0());
            	            										
            	            pushFollow(FOLLOW_5);
            	            lv_title_5_0=ruleEString();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getMusicRule());
            	            											}
            	            											set(
            	            												current,
            	            												"title",
            	            												lv_title_5_0,
            	            												"fr.unice.polytech.dsl.rythmml.Ryml.EString");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRyml.g:143:8: (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==14) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalRyml.g:144:9: otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) )
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_3); 

            	            									newLeafNode(otherlv_6, grammarAccess.getMusicAccess().getAuthorKeyword_0_4_0());
            	            								
            	            // InternalRyml.g:148:9: ( (lv_author_7_0= ruleEString ) )
            	            // InternalRyml.g:149:10: (lv_author_7_0= ruleEString )
            	            {
            	            // InternalRyml.g:149:10: (lv_author_7_0= ruleEString )
            	            // InternalRyml.g:150:11: lv_author_7_0= ruleEString
            	            {

            	            											newCompositeNode(grammarAccess.getMusicAccess().getAuthorEStringParserRuleCall_0_4_1_0());
            	            										
            	            pushFollow(FOLLOW_5);
            	            lv_author_7_0=ruleEString();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getMusicRule());
            	            											}
            	            											set(
            	            												current,
            	            												"author",
            	            												lv_author_7_0,
            	            												"fr.unice.polytech.dsl.rythmml.Ryml.EString");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRyml.g:168:8: (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==15) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalRyml.g:169:9: otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) )
            	            {
            	            otherlv_8=(Token)match(input,15,FOLLOW_6); 

            	            									newLeafNode(otherlv_8, grammarAccess.getMusicAccess().getBpmKeyword_0_5_0());
            	            								
            	            // InternalRyml.g:173:9: ( (lv_bpm_9_0= ruleEInt ) )
            	            // InternalRyml.g:174:10: (lv_bpm_9_0= ruleEInt )
            	            {
            	            // InternalRyml.g:174:10: (lv_bpm_9_0= ruleEInt )
            	            // InternalRyml.g:175:11: lv_bpm_9_0= ruleEInt
            	            {

            	            											newCompositeNode(grammarAccess.getMusicAccess().getBpmEIntParserRuleCall_0_5_1_0());
            	            										
            	            pushFollow(FOLLOW_5);
            	            lv_bpm_9_0=ruleEInt();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getMusicRule());
            	            											}
            	            											set(
            	            												current,
            	            												"bpm",
            	            												lv_bpm_9_0,
            	            												"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRyml.g:193:8: (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==16) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalRyml.g:194:9: otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) )
            	            {
            	            otherlv_10=(Token)match(input,16,FOLLOW_6); 

            	            									newLeafNode(otherlv_10, grammarAccess.getMusicAccess().getResolutionPerBeatsKeyword_0_6_0());
            	            								
            	            // InternalRyml.g:198:9: ( (lv_resolutionPerSlide_11_0= ruleEInt ) )
            	            // InternalRyml.g:199:10: (lv_resolutionPerSlide_11_0= ruleEInt )
            	            {
            	            // InternalRyml.g:199:10: (lv_resolutionPerSlide_11_0= ruleEInt )
            	            // InternalRyml.g:200:11: lv_resolutionPerSlide_11_0= ruleEInt
            	            {

            	            											newCompositeNode(grammarAccess.getMusicAccess().getResolutionPerSlideEIntParserRuleCall_0_6_1_0());
            	            										
            	            pushFollow(FOLLOW_5);
            	            lv_resolutionPerSlide_11_0=ruleEInt();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getMusicRule());
            	            											}
            	            											set(
            	            												current,
            	            												"resolutionPerSlide",
            	            												lv_resolutionPerSlide_11_0,
            	            												"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRyml.g:218:8: ( ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )* )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==26) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalRyml.g:219:9: ( (lv_note_12_0= ruleNote ) ) ( (lv_note_13_0= ruleNote ) )*
            	            {
            	            // InternalRyml.g:219:9: ( (lv_note_12_0= ruleNote ) )
            	            // InternalRyml.g:220:10: (lv_note_12_0= ruleNote )
            	            {
            	            // InternalRyml.g:220:10: (lv_note_12_0= ruleNote )
            	            // InternalRyml.g:221:11: lv_note_12_0= ruleNote
            	            {

            	            											newCompositeNode(grammarAccess.getMusicAccess().getNoteNoteParserRuleCall_0_7_0_0());
            	            										
            	            pushFollow(FOLLOW_5);
            	            lv_note_12_0=ruleNote();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getMusicRule());
            	            											}
            	            											add(
            	            												current,
            	            												"note",
            	            												lv_note_12_0,
            	            												"fr.unice.polytech.dsl.rythmml.Ryml.Note");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }

            	            // InternalRyml.g:238:9: ( (lv_note_13_0= ruleNote ) )*
            	            loop5:
            	            do {
            	                int alt5=2;
            	                int LA5_0 = input.LA(1);

            	                if ( (LA5_0==26) ) {
            	                    alt5=1;
            	                }


            	                switch (alt5) {
            	            	case 1 :
            	            	    // InternalRyml.g:239:10: (lv_note_13_0= ruleNote )
            	            	    {
            	            	    // InternalRyml.g:239:10: (lv_note_13_0= ruleNote )
            	            	    // InternalRyml.g:240:11: lv_note_13_0= ruleNote
            	            	    {

            	            	    											newCompositeNode(grammarAccess.getMusicAccess().getNoteNoteParserRuleCall_0_7_1_0());
            	            	    										
            	            	    pushFollow(FOLLOW_5);
            	            	    lv_note_13_0=ruleNote();

            	            	    state._fsp--;


            	            	    											if (current==null) {
            	            	    												current = createModelElementForParent(grammarAccess.getMusicRule());
            	            	    											}
            	            	    											add(
            	            	    												current,
            	            	    												"note",
            	            	    												lv_note_13_0,
            	            	    												"fr.unice.polytech.dsl.rythmml.Ryml.Note");
            	            	    											afterParserOrEnumRuleCall();
            	            	    										

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop5;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMusicAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRyml.g:264:3: ({...}? => ( ({...}? => ( ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )* ) ) ) )
            	    {
            	    // InternalRyml.g:264:3: ({...}? => ( ({...}? => ( ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )* ) ) ) )
            	    // InternalRyml.g:265:4: {...}? => ( ({...}? => ( ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMusic", "getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRyml.g:265:99: ( ({...}? => ( ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )* ) ) )
            	    // InternalRyml.g:266:5: ({...}? => ( ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRyml.g:269:8: ({...}? => ( ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )* ) )
            	    // InternalRyml.g:269:9: {...}? => ( ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMusic", "true");
            	    }
            	    // InternalRyml.g:269:18: ( ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )* )
            	    // InternalRyml.g:269:19: ( (lv_beat_14_0= ruleBeat ) ) ( (lv_beat_15_0= ruleBeat ) )*
            	    {
            	    // InternalRyml.g:269:19: ( (lv_beat_14_0= ruleBeat ) )
            	    // InternalRyml.g:270:9: (lv_beat_14_0= ruleBeat )
            	    {
            	    // InternalRyml.g:270:9: (lv_beat_14_0= ruleBeat )
            	    // InternalRyml.g:271:10: lv_beat_14_0= ruleBeat
            	    {

            	    										newCompositeNode(grammarAccess.getMusicAccess().getBeatBeatParserRuleCall_1_0_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_beat_14_0=ruleBeat();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMusicRule());
            	    										}
            	    										add(
            	    											current,
            	    											"beat",
            	    											lv_beat_14_0,
            	    											"fr.unice.polytech.dsl.rythmml.Ryml.Beat");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalRyml.g:288:8: ( (lv_beat_15_0= ruleBeat ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        alt7 = dfa7.predict(input);
            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalRyml.g:289:9: (lv_beat_15_0= ruleBeat )
            	    	    {
            	    	    // InternalRyml.g:289:9: (lv_beat_15_0= ruleBeat )
            	    	    // InternalRyml.g:290:10: lv_beat_15_0= ruleBeat
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getMusicAccess().getBeatBeatParserRuleCall_1_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_beat_15_0=ruleBeat();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getMusicRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"beat",
            	    	    											lv_beat_15_0,
            	    	    											"fr.unice.polytech.dsl.rythmml.Ryml.Beat");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMusicAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRyml.g:313:3: ({...}? => ( ({...}? => ( ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )* ) ) ) )
            	    {
            	    // InternalRyml.g:313:3: ({...}? => ( ({...}? => ( ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )* ) ) ) )
            	    // InternalRyml.g:314:4: {...}? => ( ({...}? => ( ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMusic", "getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRyml.g:314:99: ( ({...}? => ( ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )* ) ) )
            	    // InternalRyml.g:315:5: ({...}? => ( ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRyml.g:318:8: ({...}? => ( ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )* ) )
            	    // InternalRyml.g:318:9: {...}? => ( ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMusic", "true");
            	    }
            	    // InternalRyml.g:318:18: ( ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )* )
            	    // InternalRyml.g:318:19: ( (lv_bar_16_0= ruleBar ) ) ( (lv_bar_17_0= ruleBar ) )*
            	    {
            	    // InternalRyml.g:318:19: ( (lv_bar_16_0= ruleBar ) )
            	    // InternalRyml.g:319:9: (lv_bar_16_0= ruleBar )
            	    {
            	    // InternalRyml.g:319:9: (lv_bar_16_0= ruleBar )
            	    // InternalRyml.g:320:10: lv_bar_16_0= ruleBar
            	    {

            	    										newCompositeNode(grammarAccess.getMusicAccess().getBarBarParserRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_bar_16_0=ruleBar();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMusicRule());
            	    										}
            	    										add(
            	    											current,
            	    											"bar",
            	    											lv_bar_16_0,
            	    											"fr.unice.polytech.dsl.rythmml.Ryml.Bar");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalRyml.g:337:8: ( (lv_bar_17_0= ruleBar ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==21) ) {
            	            int LA8_2 = input.LA(2);

            	            if ( (LA8_2==RULE_STRING) ) {
            	                int LA8_3 = input.LA(3);

            	                if ( (LA8_3==12) ) {
            	                    int LA8_5 = input.LA(4);

            	                    if ( (LA8_5==RULE_STRING) ) {
            	                        alt8=1;
            	                    }
            	                    else if ( (LA8_5==RULE_ID) ) {
            	                        alt8=1;
            	                    }


            	                }


            	            }
            	            else if ( (LA8_2==RULE_ID) ) {
            	                int LA8_4 = input.LA(3);

            	                if ( (LA8_4==12) ) {
            	                    int LA8_5 = input.LA(4);

            	                    if ( (LA8_5==RULE_STRING) ) {
            	                        alt8=1;
            	                    }
            	                    else if ( (LA8_5==RULE_ID) ) {
            	                        alt8=1;
            	                    }


            	                }


            	            }


            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalRyml.g:338:9: (lv_bar_17_0= ruleBar )
            	    	    {
            	    	    // InternalRyml.g:338:9: (lv_bar_17_0= ruleBar )
            	    	    // InternalRyml.g:339:10: lv_bar_17_0= ruleBar
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getMusicAccess().getBarBarParserRuleCall_2_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_bar_17_0=ruleBar();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getMusicRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"bar",
            	    	    											lv_bar_17_0,
            	    	    											"fr.unice.polytech.dsl.rythmml.Ryml.Bar");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMusicAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRyml.g:362:3: ({...}? => ( ({...}? => ( ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )* ) ) ) )
            	    {
            	    // InternalRyml.g:362:3: ({...}? => ( ({...}? => ( ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )* ) ) ) )
            	    // InternalRyml.g:363:4: {...}? => ( ({...}? => ( ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMusic", "getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRyml.g:363:99: ( ({...}? => ( ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )* ) ) )
            	    // InternalRyml.g:364:5: ({...}? => ( ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRyml.g:367:8: ({...}? => ( ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )* ) )
            	    // InternalRyml.g:367:9: {...}? => ( ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMusic", "true");
            	    }
            	    // InternalRyml.g:367:18: ( ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )* )
            	    // InternalRyml.g:367:19: ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )? ( (lv_section_20_0= ruleSection ) ) ( (lv_section_21_0= ruleSection ) )*
            	    {
            	    // InternalRyml.g:367:19: ( ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )* )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==20) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalRyml.g:368:9: ( (lv_pattern_18_0= rulePattern ) ) ( (lv_pattern_19_0= rulePattern ) )*
            	            {
            	            // InternalRyml.g:368:9: ( (lv_pattern_18_0= rulePattern ) )
            	            // InternalRyml.g:369:10: (lv_pattern_18_0= rulePattern )
            	            {
            	            // InternalRyml.g:369:10: (lv_pattern_18_0= rulePattern )
            	            // InternalRyml.g:370:11: lv_pattern_18_0= rulePattern
            	            {

            	            											newCompositeNode(grammarAccess.getMusicAccess().getPatternPatternParserRuleCall_3_0_0_0());
            	            										
            	            pushFollow(FOLLOW_7);
            	            lv_pattern_18_0=rulePattern();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getMusicRule());
            	            											}
            	            											add(
            	            												current,
            	            												"pattern",
            	            												lv_pattern_18_0,
            	            												"fr.unice.polytech.dsl.rythmml.Ryml.Pattern");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }

            	            // InternalRyml.g:387:9: ( (lv_pattern_19_0= rulePattern ) )*
            	            loop9:
            	            do {
            	                int alt9=2;
            	                int LA9_0 = input.LA(1);

            	                if ( (LA9_0==20) ) {
            	                    alt9=1;
            	                }


            	                switch (alt9) {
            	            	case 1 :
            	            	    // InternalRyml.g:388:10: (lv_pattern_19_0= rulePattern )
            	            	    {
            	            	    // InternalRyml.g:388:10: (lv_pattern_19_0= rulePattern )
            	            	    // InternalRyml.g:389:11: lv_pattern_19_0= rulePattern
            	            	    {

            	            	    											newCompositeNode(grammarAccess.getMusicAccess().getPatternPatternParserRuleCall_3_0_1_0());
            	            	    										
            	            	    pushFollow(FOLLOW_7);
            	            	    lv_pattern_19_0=rulePattern();

            	            	    state._fsp--;


            	            	    											if (current==null) {
            	            	    												current = createModelElementForParent(grammarAccess.getMusicRule());
            	            	    											}
            	            	    											add(
            	            	    												current,
            	            	    												"pattern",
            	            	    												lv_pattern_19_0,
            	            	    												"fr.unice.polytech.dsl.rythmml.Ryml.Pattern");
            	            	    											afterParserOrEnumRuleCall();
            	            	    										

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop9;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    // InternalRyml.g:407:8: ( (lv_section_20_0= ruleSection ) )
            	    // InternalRyml.g:408:9: (lv_section_20_0= ruleSection )
            	    {
            	    // InternalRyml.g:408:9: (lv_section_20_0= ruleSection )
            	    // InternalRyml.g:409:10: lv_section_20_0= ruleSection
            	    {

            	    										newCompositeNode(grammarAccess.getMusicAccess().getSectionSectionParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_7);
            	    lv_section_20_0=ruleSection();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMusicRule());
            	    										}
            	    										add(
            	    											current,
            	    											"section",
            	    											lv_section_20_0,
            	    											"fr.unice.polytech.dsl.rythmml.Ryml.Section");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalRyml.g:426:8: ( (lv_section_21_0= ruleSection ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==17) ) {
            	            int LA11_2 = input.LA(2);

            	            if ( (LA11_2==RULE_STRING) ) {
            	                int LA11_3 = input.LA(3);

            	                if ( (LA11_3==12) ) {
            	                    int LA11_5 = input.LA(4);

            	                    if ( (LA11_5==RULE_STRING) ) {
            	                        alt11=1;
            	                    }
            	                    else if ( (LA11_5==RULE_ID) ) {
            	                        alt11=1;
            	                    }


            	                }


            	            }
            	            else if ( (LA11_2==RULE_ID) ) {
            	                int LA11_4 = input.LA(3);

            	                if ( (LA11_4==12) ) {
            	                    int LA11_5 = input.LA(4);

            	                    if ( (LA11_5==RULE_STRING) ) {
            	                        alt11=1;
            	                    }
            	                    else if ( (LA11_5==RULE_ID) ) {
            	                        alt11=1;
            	                    }


            	                }


            	            }


            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalRyml.g:427:9: (lv_section_21_0= ruleSection )
            	    	    {
            	    	    // InternalRyml.g:427:9: (lv_section_21_0= ruleSection )
            	    	    // InternalRyml.g:428:10: lv_section_21_0= ruleSection
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getMusicAccess().getSectionSectionParserRuleCall_3_2_0());
            	    	    									
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_section_21_0=ruleSection();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getMusicRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"section",
            	    	    											lv_section_21_0,
            	    	    											"fr.unice.polytech.dsl.rythmml.Ryml.Section");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMusicAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMusicAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleMusic", "getUnorderedGroupHelper().canLeave(grammarAccess.getMusicAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getMusicAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMusic"


    // $ANTLR start "entryRuleEString"
    // InternalRyml.g:462:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRyml.g:462:47: (iv_ruleEString= ruleEString EOF )
            // InternalRyml.g:463:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRyml.g:469:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRyml.g:475:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRyml.g:476:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRyml.g:476:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRyml.g:477:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRyml.g:485:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSection"
    // InternalRyml.g:496:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalRyml.g:496:48: (iv_ruleSection= ruleSection EOF )
            // InternalRyml.g:497:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalRyml.g:503:1: ruleSection returns [EObject current=null] : (otherlv_0= 'Section' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:509:2: ( (otherlv_0= 'Section' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* ) )
            // InternalRyml.g:510:2: (otherlv_0= 'Section' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* )
            {
            // InternalRyml.g:510:2: (otherlv_0= 'Section' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* )
            // InternalRyml.g:511:3: otherlv_0= 'Section' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
            		
            // InternalRyml.g:515:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRyml.g:516:4: (lv_name_1_0= ruleEString )
            {
            // InternalRyml.g:516:4: (lv_name_1_0= ruleEString )
            // InternalRyml.g:517:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.dsl.rythmml.Ryml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getColonKeyword_2());
            		
            // InternalRyml.g:538:3: ( ( ruleEString ) )
            // InternalRyml.g:539:4: ( ruleEString )
            {
            // InternalRyml.g:539:4: ( ruleEString )
            // InternalRyml.g:540:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSectionAccess().getPatternPatternCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRyml.g:554:3: (otherlv_4= '|' ( ( ruleEString ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRyml.g:555:4: otherlv_4= '|' ( ( ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getVerticalLineKeyword_4_0());
            	    			
            	    // InternalRyml.g:559:4: ( ( ruleEString ) )
            	    // InternalRyml.g:560:5: ( ruleEString )
            	    {
            	    // InternalRyml.g:560:5: ( ruleEString )
            	    // InternalRyml.g:561:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSectionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSectionAccess().getPatternPatternCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleEInt"
    // InternalRyml.g:580:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRyml.g:580:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRyml.g:581:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalRyml.g:587:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRyml.g:593:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRyml.g:594:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRyml.g:594:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRyml.g:595:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRyml.g:595:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRyml.g:596:4: kw= '-'
                    {
                    kw=(Token)match(input,19,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRulePattern"
    // InternalRyml.g:613:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalRyml.g:613:48: (iv_rulePattern= rulePattern EOF )
            // InternalRyml.g:614:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalRyml.g:620:1: rulePattern returns [EObject current=null] : (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:626:2: ( (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* ) )
            // InternalRyml.g:627:2: (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* )
            {
            // InternalRyml.g:627:2: (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* )
            // InternalRyml.g:628:3: otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getPatternKeyword_0());
            		
            // InternalRyml.g:632:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRyml.g:633:4: (lv_name_1_0= ruleEString )
            {
            // InternalRyml.g:633:4: (lv_name_1_0= ruleEString )
            // InternalRyml.g:634:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.dsl.rythmml.Ryml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getColonKeyword_2());
            		
            // InternalRyml.g:655:3: ( ( ruleEString ) )
            // InternalRyml.g:656:4: ( ruleEString )
            {
            // InternalRyml.g:656:4: ( ruleEString )
            // InternalRyml.g:657:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPatternAccess().getBarBarCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRyml.g:671:3: (otherlv_4= '|' ( ( ruleEString ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRyml.g:672:4: otherlv_4= '|' ( ( ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getVerticalLineKeyword_4_0());
            	    			
            	    // InternalRyml.g:676:4: ( ( ruleEString ) )
            	    // InternalRyml.g:677:5: ( ruleEString )
            	    {
            	    // InternalRyml.g:677:5: ( ruleEString )
            	    // InternalRyml.g:678:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPatternRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getPatternAccess().getBarBarCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleBar"
    // InternalRyml.g:697:1: entryRuleBar returns [EObject current=null] : iv_ruleBar= ruleBar EOF ;
    public final EObject entryRuleBar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBar = null;


        try {
            // InternalRyml.g:697:44: (iv_ruleBar= ruleBar EOF )
            // InternalRyml.g:698:2: iv_ruleBar= ruleBar EOF
            {
             newCompositeNode(grammarAccess.getBarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBar=ruleBar();

            state._fsp--;

             current =iv_ruleBar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBar"


    // $ANTLR start "ruleBar"
    // InternalRyml.g:704:1: ruleBar returns [EObject current=null] : (otherlv_0= 'Bar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleBar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:710:2: ( (otherlv_0= 'Bar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* ) )
            // InternalRyml.g:711:2: (otherlv_0= 'Bar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* )
            {
            // InternalRyml.g:711:2: (otherlv_0= 'Bar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* )
            // InternalRyml.g:712:3: otherlv_0= 'Bar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBarAccess().getBarKeyword_0());
            		
            // InternalRyml.g:716:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRyml.g:717:4: (lv_name_1_0= ruleEString )
            {
            // InternalRyml.g:717:4: (lv_name_1_0= ruleEString )
            // InternalRyml.g:718:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBarAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBarRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.dsl.rythmml.Ryml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getBarAccess().getColonKeyword_2());
            		
            // InternalRyml.g:739:3: ( ( ruleEString ) )
            // InternalRyml.g:740:4: ( ruleEString )
            {
            // InternalRyml.g:740:4: ( ruleEString )
            // InternalRyml.g:741:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBarRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBarAccess().getBeatBeatCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRyml.g:755:3: (otherlv_4= '|' ( ( ruleEString ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRyml.g:756:4: otherlv_4= '|' ( ( ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getBarAccess().getVerticalLineKeyword_4_0());
            	    			
            	    // InternalRyml.g:760:4: ( ( ruleEString ) )
            	    // InternalRyml.g:761:5: ( ruleEString )
            	    {
            	    // InternalRyml.g:761:5: ( ruleEString )
            	    // InternalRyml.g:762:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBarRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getBarAccess().getBeatBeatCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBar"


    // $ANTLR start "entryRuleBeat"
    // InternalRyml.g:781:1: entryRuleBeat returns [EObject current=null] : iv_ruleBeat= ruleBeat EOF ;
    public final EObject entryRuleBeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeat = null;


        try {
            // InternalRyml.g:781:45: (iv_ruleBeat= ruleBeat EOF )
            // InternalRyml.g:782:2: iv_ruleBeat= ruleBeat EOF
            {
             newCompositeNode(grammarAccess.getBeatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBeat=ruleBeat();

            state._fsp--;

             current =iv_ruleBeat; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBeat"


    // $ANTLR start "ruleBeat"
    // InternalRyml.g:788:1: ruleBeat returns [EObject current=null] : (otherlv_0= 'Beat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'Nb of ticks : ' ( (lv_totalDivNumber_4_0= ruleEInt ) ) )? otherlv_5= 'Notes :' ( ( ruleEString ) ) otherlv_7= ',' ( (lv_notePositions_8_0= ruleEInt ) ) (otherlv_9= '|' ( ( ruleEString ) ) otherlv_11= ',' ( (lv_notePositions_12_0= ruleEInt ) ) )* ) ;
    public final EObject ruleBeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_totalDivNumber_4_0 = null;

        AntlrDatatypeRuleToken lv_notePositions_8_0 = null;

        AntlrDatatypeRuleToken lv_notePositions_12_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:794:2: ( (otherlv_0= 'Beat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'Nb of ticks : ' ( (lv_totalDivNumber_4_0= ruleEInt ) ) )? otherlv_5= 'Notes :' ( ( ruleEString ) ) otherlv_7= ',' ( (lv_notePositions_8_0= ruleEInt ) ) (otherlv_9= '|' ( ( ruleEString ) ) otherlv_11= ',' ( (lv_notePositions_12_0= ruleEInt ) ) )* ) )
            // InternalRyml.g:795:2: (otherlv_0= 'Beat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'Nb of ticks : ' ( (lv_totalDivNumber_4_0= ruleEInt ) ) )? otherlv_5= 'Notes :' ( ( ruleEString ) ) otherlv_7= ',' ( (lv_notePositions_8_0= ruleEInt ) ) (otherlv_9= '|' ( ( ruleEString ) ) otherlv_11= ',' ( (lv_notePositions_12_0= ruleEInt ) ) )* )
            {
            // InternalRyml.g:795:2: (otherlv_0= 'Beat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'Nb of ticks : ' ( (lv_totalDivNumber_4_0= ruleEInt ) ) )? otherlv_5= 'Notes :' ( ( ruleEString ) ) otherlv_7= ',' ( (lv_notePositions_8_0= ruleEInt ) ) (otherlv_9= '|' ( ( ruleEString ) ) otherlv_11= ',' ( (lv_notePositions_12_0= ruleEInt ) ) )* )
            // InternalRyml.g:796:3: otherlv_0= 'Beat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'Nb of ticks : ' ( (lv_totalDivNumber_4_0= ruleEInt ) ) )? otherlv_5= 'Notes :' ( ( ruleEString ) ) otherlv_7= ',' ( (lv_notePositions_8_0= ruleEInt ) ) (otherlv_9= '|' ( ( ruleEString ) ) otherlv_11= ',' ( (lv_notePositions_12_0= ruleEInt ) ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBeatAccess().getBeatKeyword_0());
            		
            // InternalRyml.g:800:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRyml.g:801:4: (lv_name_1_0= ruleEString )
            {
            // InternalRyml.g:801:4: (lv_name_1_0= ruleEString )
            // InternalRyml.g:802:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBeatAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBeatRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.dsl.rythmml.Ryml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getBeatAccess().getColonKeyword_2());
            		
            // InternalRyml.g:823:3: (otherlv_3= 'Nb of ticks : ' ( (lv_totalDivNumber_4_0= ruleEInt ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRyml.g:824:4: otherlv_3= 'Nb of ticks : ' ( (lv_totalDivNumber_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getBeatAccess().getNbOfTicksKeyword_3_0());
                    			
                    // InternalRyml.g:828:4: ( (lv_totalDivNumber_4_0= ruleEInt ) )
                    // InternalRyml.g:829:5: (lv_totalDivNumber_4_0= ruleEInt )
                    {
                    // InternalRyml.g:829:5: (lv_totalDivNumber_4_0= ruleEInt )
                    // InternalRyml.g:830:6: lv_totalDivNumber_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBeatAccess().getTotalDivNumberEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_totalDivNumber_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBeatRule());
                    						}
                    						set(
                    							current,
                    							"totalDivNumber",
                    							lv_totalDivNumber_4_0,
                    							"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getBeatAccess().getNotesKeyword_4());
            		
            // InternalRyml.g:852:3: ( ( ruleEString ) )
            // InternalRyml.g:853:4: ( ruleEString )
            {
            // InternalRyml.g:853:4: ( ruleEString )
            // InternalRyml.g:854:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBeatRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBeatAccess().getNoteNoteCrossReference_5_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getBeatAccess().getCommaKeyword_6());
            		
            // InternalRyml.g:872:3: ( (lv_notePositions_8_0= ruleEInt ) )
            // InternalRyml.g:873:4: (lv_notePositions_8_0= ruleEInt )
            {
            // InternalRyml.g:873:4: (lv_notePositions_8_0= ruleEInt )
            // InternalRyml.g:874:5: lv_notePositions_8_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBeatAccess().getNotePositionsEIntParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_notePositions_8_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBeatRule());
            					}
            					add(
            						current,
            						"notePositions",
            						lv_notePositions_8_0,
            						"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRyml.g:891:3: (otherlv_9= '|' ( ( ruleEString ) ) otherlv_11= ',' ( (lv_notePositions_12_0= ruleEInt ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRyml.g:892:4: otherlv_9= '|' ( ( ruleEString ) ) otherlv_11= ',' ( (lv_notePositions_12_0= ruleEInt ) )
            	    {
            	    otherlv_9=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_9, grammarAccess.getBeatAccess().getVerticalLineKeyword_8_0());
            	    			
            	    // InternalRyml.g:896:4: ( ( ruleEString ) )
            	    // InternalRyml.g:897:5: ( ruleEString )
            	    {
            	    // InternalRyml.g:897:5: ( ruleEString )
            	    // InternalRyml.g:898:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBeatRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getBeatAccess().getNoteNoteCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_11=(Token)match(input,25,FOLLOW_6); 

            	    				newLeafNode(otherlv_11, grammarAccess.getBeatAccess().getCommaKeyword_8_2());
            	    			
            	    // InternalRyml.g:916:4: ( (lv_notePositions_12_0= ruleEInt ) )
            	    // InternalRyml.g:917:5: (lv_notePositions_12_0= ruleEInt )
            	    {
            	    // InternalRyml.g:917:5: (lv_notePositions_12_0= ruleEInt )
            	    // InternalRyml.g:918:6: lv_notePositions_12_0= ruleEInt
            	    {

            	    						newCompositeNode(grammarAccess.getBeatAccess().getNotePositionsEIntParserRuleCall_8_3_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_notePositions_12_0=ruleEInt();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBeatRule());
            	    						}
            	    						add(
            	    							current,
            	    							"notePositions",
            	    							lv_notePositions_12_0,
            	    							"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBeat"


    // $ANTLR start "entryRuleNote"
    // InternalRyml.g:940:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // InternalRyml.g:940:45: (iv_ruleNote= ruleNote EOF )
            // InternalRyml.g:941:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // InternalRyml.g:947:1: ruleNote returns [EObject current=null] : (otherlv_0= 'Note' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleDrumNoteValue ) )? ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:953:2: ( (otherlv_0= 'Note' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleDrumNoteValue ) )? ) )
            // InternalRyml.g:954:2: (otherlv_0= 'Note' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleDrumNoteValue ) )? )
            {
            // InternalRyml.g:954:2: (otherlv_0= 'Note' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleDrumNoteValue ) )? )
            // InternalRyml.g:955:3: otherlv_0= 'Note' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleDrumNoteValue ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNoteAccess().getNoteKeyword_0());
            		
            // InternalRyml.g:959:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRyml.g:960:4: (lv_name_1_0= ruleEString )
            {
            // InternalRyml.g:960:4: (lv_name_1_0= ruleEString )
            // InternalRyml.g:961:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNoteAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNoteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.dsl.rythmml.Ryml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getNoteAccess().getColonKeyword_2());
            		
            // InternalRyml.g:982:3: ( (lv_value_3_0= ruleDrumNoteValue ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=27 && LA20_0<=37)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRyml.g:983:4: (lv_value_3_0= ruleDrumNoteValue )
                    {
                    // InternalRyml.g:983:4: (lv_value_3_0= ruleDrumNoteValue )
                    // InternalRyml.g:984:5: lv_value_3_0= ruleDrumNoteValue
                    {

                    					newCompositeNode(grammarAccess.getNoteAccess().getValueDrumNoteValueEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleDrumNoteValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNoteRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_3_0,
                    						"fr.unice.polytech.dsl.rythmml.Ryml.DrumNoteValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNote"


    // $ANTLR start "ruleDrumNoteValue"
    // InternalRyml.g:1005:1: ruleDrumNoteValue returns [Enumerator current=null] : ( (enumLiteral_0= 'SD' ) | (enumLiteral_1= 'BD' ) | (enumLiteral_2= 'CH' ) | (enumLiteral_3= 'OH' ) | (enumLiteral_4= 'CC' ) | (enumLiteral_5= 'RC' ) | (enumLiteral_6= 'TM' ) | (enumLiteral_7= 'TO' ) | (enumLiteral_8= 'S' ) | (enumLiteral_9= 'WS' ) | (enumLiteral_10= 'L' ) ) ;
    public final Enumerator ruleDrumNoteValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;


        	enterRule();

        try {
            // InternalRyml.g:1011:2: ( ( (enumLiteral_0= 'SD' ) | (enumLiteral_1= 'BD' ) | (enumLiteral_2= 'CH' ) | (enumLiteral_3= 'OH' ) | (enumLiteral_4= 'CC' ) | (enumLiteral_5= 'RC' ) | (enumLiteral_6= 'TM' ) | (enumLiteral_7= 'TO' ) | (enumLiteral_8= 'S' ) | (enumLiteral_9= 'WS' ) | (enumLiteral_10= 'L' ) ) )
            // InternalRyml.g:1012:2: ( (enumLiteral_0= 'SD' ) | (enumLiteral_1= 'BD' ) | (enumLiteral_2= 'CH' ) | (enumLiteral_3= 'OH' ) | (enumLiteral_4= 'CC' ) | (enumLiteral_5= 'RC' ) | (enumLiteral_6= 'TM' ) | (enumLiteral_7= 'TO' ) | (enumLiteral_8= 'S' ) | (enumLiteral_9= 'WS' ) | (enumLiteral_10= 'L' ) )
            {
            // InternalRyml.g:1012:2: ( (enumLiteral_0= 'SD' ) | (enumLiteral_1= 'BD' ) | (enumLiteral_2= 'CH' ) | (enumLiteral_3= 'OH' ) | (enumLiteral_4= 'CC' ) | (enumLiteral_5= 'RC' ) | (enumLiteral_6= 'TM' ) | (enumLiteral_7= 'TO' ) | (enumLiteral_8= 'S' ) | (enumLiteral_9= 'WS' ) | (enumLiteral_10= 'L' ) )
            int alt21=11;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt21=1;
                }
                break;
            case 28:
                {
                alt21=2;
                }
                break;
            case 29:
                {
                alt21=3;
                }
                break;
            case 30:
                {
                alt21=4;
                }
                break;
            case 31:
                {
                alt21=5;
                }
                break;
            case 32:
                {
                alt21=6;
                }
                break;
            case 33:
                {
                alt21=7;
                }
                break;
            case 34:
                {
                alt21=8;
                }
                break;
            case 35:
                {
                alt21=9;
                }
                break;
            case 36:
                {
                alt21=10;
                }
                break;
            case 37:
                {
                alt21=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalRyml.g:1013:3: (enumLiteral_0= 'SD' )
                    {
                    // InternalRyml.g:1013:3: (enumLiteral_0= 'SD' )
                    // InternalRyml.g:1014:4: enumLiteral_0= 'SD'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getSDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDrumNoteValueAccess().getSDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRyml.g:1021:3: (enumLiteral_1= 'BD' )
                    {
                    // InternalRyml.g:1021:3: (enumLiteral_1= 'BD' )
                    // InternalRyml.g:1022:4: enumLiteral_1= 'BD'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getBDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDrumNoteValueAccess().getBDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRyml.g:1029:3: (enumLiteral_2= 'CH' )
                    {
                    // InternalRyml.g:1029:3: (enumLiteral_2= 'CH' )
                    // InternalRyml.g:1030:4: enumLiteral_2= 'CH'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getCHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDrumNoteValueAccess().getCHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRyml.g:1037:3: (enumLiteral_3= 'OH' )
                    {
                    // InternalRyml.g:1037:3: (enumLiteral_3= 'OH' )
                    // InternalRyml.g:1038:4: enumLiteral_3= 'OH'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getOHEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDrumNoteValueAccess().getOHEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRyml.g:1045:3: (enumLiteral_4= 'CC' )
                    {
                    // InternalRyml.g:1045:3: (enumLiteral_4= 'CC' )
                    // InternalRyml.g:1046:4: enumLiteral_4= 'CC'
                    {
                    enumLiteral_4=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getCCEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDrumNoteValueAccess().getCCEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRyml.g:1053:3: (enumLiteral_5= 'RC' )
                    {
                    // InternalRyml.g:1053:3: (enumLiteral_5= 'RC' )
                    // InternalRyml.g:1054:4: enumLiteral_5= 'RC'
                    {
                    enumLiteral_5=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getRCEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDrumNoteValueAccess().getRCEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRyml.g:1061:3: (enumLiteral_6= 'TM' )
                    {
                    // InternalRyml.g:1061:3: (enumLiteral_6= 'TM' )
                    // InternalRyml.g:1062:4: enumLiteral_6= 'TM'
                    {
                    enumLiteral_6=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getTMEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDrumNoteValueAccess().getTMEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRyml.g:1069:3: (enumLiteral_7= 'TO' )
                    {
                    // InternalRyml.g:1069:3: (enumLiteral_7= 'TO' )
                    // InternalRyml.g:1070:4: enumLiteral_7= 'TO'
                    {
                    enumLiteral_7=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getTOEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDrumNoteValueAccess().getTOEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRyml.g:1077:3: (enumLiteral_8= 'S' )
                    {
                    // InternalRyml.g:1077:3: (enumLiteral_8= 'S' )
                    // InternalRyml.g:1078:4: enumLiteral_8= 'S'
                    {
                    enumLiteral_8=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getSEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDrumNoteValueAccess().getSEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalRyml.g:1085:3: (enumLiteral_9= 'WS' )
                    {
                    // InternalRyml.g:1085:3: (enumLiteral_9= 'WS' )
                    // InternalRyml.g:1086:4: enumLiteral_9= 'WS'
                    {
                    enumLiteral_9=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getWSEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getDrumNoteValueAccess().getWSEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalRyml.g:1093:3: (enumLiteral_10= 'L' )
                    {
                    // InternalRyml.g:1093:3: (enumLiteral_10= 'L' )
                    // InternalRyml.g:1094:4: enumLiteral_10= 'L'
                    {
                    enumLiteral_10=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getLEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getDrumNoteValueAccess().getLEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDrumNoteValue"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\1\16\uffff";
    static final String dfa_3s = "\1\13\1\uffff\1\4\2\14\1\27\1\6\1\4\1\6\1\30\2\31\2\6\1\uffff";
    static final String dfa_4s = "\1\26\1\uffff\1\5\2\14\1\30\1\23\1\5\1\6\1\30\2\31\1\23\1\6\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\14\uffff\1\1";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\5\uffff\1\1\2\uffff\2\1\1\2",
            "",
            "\1\3\1\4",
            "\1\5",
            "\1\5",
            "\1\6\1\7",
            "\1\11\14\uffff\1\10",
            "\1\12\1\13",
            "\1\11",
            "\1\7",
            "\1\14",
            "\1\14",
            "\1\16\14\uffff\1\15",
            "\1\16",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 288:8: ( (lv_beat_15_0= ruleBeat ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000473E802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000473E800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000003FF8000002L});

}
