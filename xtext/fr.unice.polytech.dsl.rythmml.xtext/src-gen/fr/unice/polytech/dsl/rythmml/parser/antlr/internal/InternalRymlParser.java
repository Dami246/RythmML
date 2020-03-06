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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Music'", "':'", "'title :'", "'author :'", "'bpm :'", "'resolution per beats : '", "'Section'", "'|'", "'-'", "'Pattern'", "'x'", "'Bar'", "' based on :'", "'Beat'", "'Nb of ticks : '", "'Notes :'", "','", "'Note'", "'SD'", "'BD'", "'CH'", "'OH'", "'CC'", "'RC'", "'TM'", "'TO'", "'S'", "'WS'", "'L'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    // InternalRyml.g:72:1: ruleMusic returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )* ) ) ) ) )+ {...}?) ) ) ;
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

        EObject lv_ownedNotes_12_0 = null;

        EObject lv_ownedNotes_13_0 = null;

        EObject lv_ownedBeats_14_0 = null;

        EObject lv_ownedBeats_15_0 = null;

        EObject lv_ownedBars_16_0 = null;

        EObject lv_ownedBars_17_0 = null;

        EObject lv_ownedPatterns_18_0 = null;

        EObject lv_ownedPatterns_19_0 = null;

        EObject lv_ownedSections_20_0 = null;

        EObject lv_ownedSections_21_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )* ) ) ) ) )+ {...}?) ) ) )
            // InternalRyml.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )* ) ) ) ) )+ {...}?) ) )
            {
            // InternalRyml.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )* ) ) ) ) )+ {...}?) ) )
            // InternalRyml.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalRyml.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )* ) ) ) ) )+ {...}?) )
            // InternalRyml.g:81:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )* ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getMusicAccess().getUnorderedGroup());
            			
            // InternalRyml.g:84:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )* ) ) ) ) )+ {...}?)
            // InternalRyml.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )* ) ) ) ) )+ {...}?
            {
            // InternalRyml.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )? ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )* ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=6;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3) ) {
                    alt11=4;
                }
                else if ( LA11_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 4) ) {
                    alt11=5;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRyml.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )? ) ) ) )
            	    {
            	    // InternalRyml.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )? ) ) ) )
            	    // InternalRyml.g:87:4: {...}? => ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMusic", "getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRyml.g:87:99: ( ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )? ) ) )
            	    // InternalRyml.g:88:5: ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRyml.g:91:8: ({...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )? ) )
            	    // InternalRyml.g:91:9: {...}? => (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMusic", "true");
            	    }
            	    // InternalRyml.g:91:18: (otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )? )
            	    // InternalRyml.g:91:19: otherlv_1= 'Music' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'title :' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'author :' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'bpm :' ( (lv_bpm_9_0= ruleEInt ) ) )? (otherlv_10= 'resolution per beats : ' ( (lv_resolutionPerSlide_11_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )?
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

            	    // InternalRyml.g:218:8: ( ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )* )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==28) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalRyml.g:219:9: ( (lv_ownedNotes_12_0= ruleNote ) ) ( (lv_ownedNotes_13_0= ruleNote ) )*
            	            {
            	            // InternalRyml.g:219:9: ( (lv_ownedNotes_12_0= ruleNote ) )
            	            // InternalRyml.g:220:10: (lv_ownedNotes_12_0= ruleNote )
            	            {
            	            // InternalRyml.g:220:10: (lv_ownedNotes_12_0= ruleNote )
            	            // InternalRyml.g:221:11: lv_ownedNotes_12_0= ruleNote
            	            {

            	            											newCompositeNode(grammarAccess.getMusicAccess().getOwnedNotesNoteParserRuleCall_0_7_0_0());
            	            										
            	            pushFollow(FOLLOW_5);
            	            lv_ownedNotes_12_0=ruleNote();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getMusicRule());
            	            											}
            	            											add(
            	            												current,
            	            												"ownedNotes",
            	            												lv_ownedNotes_12_0,
            	            												"fr.unice.polytech.dsl.rythmml.Ryml.Note");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }

            	            // InternalRyml.g:238:9: ( (lv_ownedNotes_13_0= ruleNote ) )*
            	            loop5:
            	            do {
            	                int alt5=2;
            	                int LA5_0 = input.LA(1);

            	                if ( (LA5_0==28) ) {
            	                    alt5=1;
            	                }


            	                switch (alt5) {
            	            	case 1 :
            	            	    // InternalRyml.g:239:10: (lv_ownedNotes_13_0= ruleNote )
            	            	    {
            	            	    // InternalRyml.g:239:10: (lv_ownedNotes_13_0= ruleNote )
            	            	    // InternalRyml.g:240:11: lv_ownedNotes_13_0= ruleNote
            	            	    {

            	            	    											newCompositeNode(grammarAccess.getMusicAccess().getOwnedNotesNoteParserRuleCall_0_7_1_0());
            	            	    										
            	            	    pushFollow(FOLLOW_5);
            	            	    lv_ownedNotes_13_0=ruleNote();

            	            	    state._fsp--;


            	            	    											if (current==null) {
            	            	    												current = createModelElementForParent(grammarAccess.getMusicRule());
            	            	    											}
            	            	    											add(
            	            	    												current,
            	            	    												"ownedNotes",
            	            	    												lv_ownedNotes_13_0,
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
            	    // InternalRyml.g:264:3: ({...}? => ( ({...}? => ( ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )* ) ) ) )
            	    {
            	    // InternalRyml.g:264:3: ({...}? => ( ({...}? => ( ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )* ) ) ) )
            	    // InternalRyml.g:265:4: {...}? => ( ({...}? => ( ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMusic", "getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRyml.g:265:99: ( ({...}? => ( ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )* ) ) )
            	    // InternalRyml.g:266:5: ({...}? => ( ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRyml.g:269:8: ({...}? => ( ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )* ) )
            	    // InternalRyml.g:269:9: {...}? => ( ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMusic", "true");
            	    }
            	    // InternalRyml.g:269:18: ( ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )* )
            	    // InternalRyml.g:269:19: ( (lv_ownedBeats_14_0= ruleBeat ) ) ( (lv_ownedBeats_15_0= ruleBeat ) )*
            	    {
            	    // InternalRyml.g:269:19: ( (lv_ownedBeats_14_0= ruleBeat ) )
            	    // InternalRyml.g:270:9: (lv_ownedBeats_14_0= ruleBeat )
            	    {
            	    // InternalRyml.g:270:9: (lv_ownedBeats_14_0= ruleBeat )
            	    // InternalRyml.g:271:10: lv_ownedBeats_14_0= ruleBeat
            	    {

            	    										newCompositeNode(grammarAccess.getMusicAccess().getOwnedBeatsBeatParserRuleCall_1_0_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_ownedBeats_14_0=ruleBeat();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMusicRule());
            	    										}
            	    										add(
            	    											current,
            	    											"ownedBeats",
            	    											lv_ownedBeats_14_0,
            	    											"fr.unice.polytech.dsl.rythmml.Ryml.Beat");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalRyml.g:288:8: ( (lv_ownedBeats_15_0= ruleBeat ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        alt7 = dfa7.predict(input);
            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalRyml.g:289:9: (lv_ownedBeats_15_0= ruleBeat )
            	    	    {
            	    	    // InternalRyml.g:289:9: (lv_ownedBeats_15_0= ruleBeat )
            	    	    // InternalRyml.g:290:10: lv_ownedBeats_15_0= ruleBeat
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getMusicAccess().getOwnedBeatsBeatParserRuleCall_1_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_ownedBeats_15_0=ruleBeat();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getMusicRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"ownedBeats",
            	    	    											lv_ownedBeats_15_0,
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
            	    // InternalRyml.g:313:3: ({...}? => ( ({...}? => ( ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )* ) ) ) )
            	    {
            	    // InternalRyml.g:313:3: ({...}? => ( ({...}? => ( ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )* ) ) ) )
            	    // InternalRyml.g:314:4: {...}? => ( ({...}? => ( ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMusic", "getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRyml.g:314:99: ( ({...}? => ( ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )* ) ) )
            	    // InternalRyml.g:315:5: ({...}? => ( ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRyml.g:318:8: ({...}? => ( ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )* ) )
            	    // InternalRyml.g:318:9: {...}? => ( ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMusic", "true");
            	    }
            	    // InternalRyml.g:318:18: ( ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )* )
            	    // InternalRyml.g:318:19: ( (lv_ownedBars_16_0= ruleBar ) ) ( (lv_ownedBars_17_0= ruleBar ) )*
            	    {
            	    // InternalRyml.g:318:19: ( (lv_ownedBars_16_0= ruleBar ) )
            	    // InternalRyml.g:319:9: (lv_ownedBars_16_0= ruleBar )
            	    {
            	    // InternalRyml.g:319:9: (lv_ownedBars_16_0= ruleBar )
            	    // InternalRyml.g:320:10: lv_ownedBars_16_0= ruleBar
            	    {

            	    										newCompositeNode(grammarAccess.getMusicAccess().getOwnedBarsBarParserRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_ownedBars_16_0=ruleBar();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMusicRule());
            	    										}
            	    										add(
            	    											current,
            	    											"ownedBars",
            	    											lv_ownedBars_16_0,
            	    											"fr.unice.polytech.dsl.rythmml.Ryml.Bar");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalRyml.g:337:8: ( (lv_ownedBars_17_0= ruleBar ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        alt8 = dfa8.predict(input);
            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalRyml.g:338:9: (lv_ownedBars_17_0= ruleBar )
            	    	    {
            	    	    // InternalRyml.g:338:9: (lv_ownedBars_17_0= ruleBar )
            	    	    // InternalRyml.g:339:10: lv_ownedBars_17_0= ruleBar
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getMusicAccess().getOwnedBarsBarParserRuleCall_2_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_ownedBars_17_0=ruleBar();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getMusicRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"ownedBars",
            	    	    											lv_ownedBars_17_0,
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
            	    // InternalRyml.g:362:3: ({...}? => ( ({...}? => ( ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )* ) ) ) )
            	    {
            	    // InternalRyml.g:362:3: ({...}? => ( ({...}? => ( ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )* ) ) ) )
            	    // InternalRyml.g:363:4: {...}? => ( ({...}? => ( ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMusic", "getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRyml.g:363:99: ( ({...}? => ( ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )* ) ) )
            	    // InternalRyml.g:364:5: ({...}? => ( ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRyml.g:367:8: ({...}? => ( ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )* ) )
            	    // InternalRyml.g:367:9: {...}? => ( ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMusic", "true");
            	    }
            	    // InternalRyml.g:367:18: ( ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )* )
            	    // InternalRyml.g:367:19: ( (lv_ownedPatterns_18_0= rulePattern ) ) ( (lv_ownedPatterns_19_0= rulePattern ) )*
            	    {
            	    // InternalRyml.g:367:19: ( (lv_ownedPatterns_18_0= rulePattern ) )
            	    // InternalRyml.g:368:9: (lv_ownedPatterns_18_0= rulePattern )
            	    {
            	    // InternalRyml.g:368:9: (lv_ownedPatterns_18_0= rulePattern )
            	    // InternalRyml.g:369:10: lv_ownedPatterns_18_0= rulePattern
            	    {

            	    										newCompositeNode(grammarAccess.getMusicAccess().getOwnedPatternsPatternParserRuleCall_3_0_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_ownedPatterns_18_0=rulePattern();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMusicRule());
            	    										}
            	    										add(
            	    											current,
            	    											"ownedPatterns",
            	    											lv_ownedPatterns_18_0,
            	    											"fr.unice.polytech.dsl.rythmml.Ryml.Pattern");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalRyml.g:386:8: ( (lv_ownedPatterns_19_0= rulePattern ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==20) ) {
            	            int LA9_2 = input.LA(2);

            	            if ( (LA9_2==RULE_STRING) ) {
            	                int LA9_3 = input.LA(3);

            	                if ( (LA9_3==12) ) {
            	                    int LA9_5 = input.LA(4);

            	                    if ( (LA9_5==RULE_STRING) ) {
            	                        alt9=1;
            	                    }
            	                    else if ( (LA9_5==RULE_ID) ) {
            	                        alt9=1;
            	                    }


            	                }


            	            }
            	            else if ( (LA9_2==RULE_ID) ) {
            	                int LA9_4 = input.LA(3);

            	                if ( (LA9_4==12) ) {
            	                    int LA9_5 = input.LA(4);

            	                    if ( (LA9_5==RULE_STRING) ) {
            	                        alt9=1;
            	                    }
            	                    else if ( (LA9_5==RULE_ID) ) {
            	                        alt9=1;
            	                    }


            	                }


            	            }


            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalRyml.g:387:9: (lv_ownedPatterns_19_0= rulePattern )
            	    	    {
            	    	    // InternalRyml.g:387:9: (lv_ownedPatterns_19_0= rulePattern )
            	    	    // InternalRyml.g:388:10: lv_ownedPatterns_19_0= rulePattern
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getMusicAccess().getOwnedPatternsPatternParserRuleCall_3_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_ownedPatterns_19_0=rulePattern();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getMusicRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"ownedPatterns",
            	    	    											lv_ownedPatterns_19_0,
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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMusicAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRyml.g:411:3: ({...}? => ( ({...}? => ( ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )* ) ) ) )
            	    {
            	    // InternalRyml.g:411:3: ({...}? => ( ({...}? => ( ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )* ) ) ) )
            	    // InternalRyml.g:412:4: {...}? => ( ({...}? => ( ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMusic", "getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRyml.g:412:99: ( ({...}? => ( ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )* ) ) )
            	    // InternalRyml.g:413:5: ({...}? => ( ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRyml.g:416:8: ({...}? => ( ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )* ) )
            	    // InternalRyml.g:416:9: {...}? => ( ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMusic", "true");
            	    }
            	    // InternalRyml.g:416:18: ( ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )* )
            	    // InternalRyml.g:416:19: ( (lv_ownedSections_20_0= ruleSection ) ) ( (lv_ownedSections_21_0= ruleSection ) )*
            	    {
            	    // InternalRyml.g:416:19: ( (lv_ownedSections_20_0= ruleSection ) )
            	    // InternalRyml.g:417:9: (lv_ownedSections_20_0= ruleSection )
            	    {
            	    // InternalRyml.g:417:9: (lv_ownedSections_20_0= ruleSection )
            	    // InternalRyml.g:418:10: lv_ownedSections_20_0= ruleSection
            	    {

            	    										newCompositeNode(grammarAccess.getMusicAccess().getOwnedSectionsSectionParserRuleCall_4_0_0());
            	    									
            	    pushFollow(FOLLOW_7);
            	    lv_ownedSections_20_0=ruleSection();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMusicRule());
            	    										}
            	    										add(
            	    											current,
            	    											"ownedSections",
            	    											lv_ownedSections_20_0,
            	    											"fr.unice.polytech.dsl.rythmml.Ryml.Section");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalRyml.g:435:8: ( (lv_ownedSections_21_0= ruleSection ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==17) ) {
            	            int LA10_2 = input.LA(2);

            	            if ( (LA10_2==RULE_STRING) ) {
            	                int LA10_3 = input.LA(3);

            	                if ( (LA10_3==12) ) {
            	                    int LA10_5 = input.LA(4);

            	                    if ( (LA10_5==RULE_STRING) ) {
            	                        alt10=1;
            	                    }
            	                    else if ( (LA10_5==RULE_ID) ) {
            	                        alt10=1;
            	                    }


            	                }


            	            }
            	            else if ( (LA10_2==RULE_ID) ) {
            	                int LA10_4 = input.LA(3);

            	                if ( (LA10_4==12) ) {
            	                    int LA10_5 = input.LA(4);

            	                    if ( (LA10_5==RULE_STRING) ) {
            	                        alt10=1;
            	                    }
            	                    else if ( (LA10_5==RULE_ID) ) {
            	                        alt10=1;
            	                    }


            	                }


            	            }


            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalRyml.g:436:9: (lv_ownedSections_21_0= ruleSection )
            	    	    {
            	    	    // InternalRyml.g:436:9: (lv_ownedSections_21_0= ruleSection )
            	    	    // InternalRyml.g:437:10: lv_ownedSections_21_0= ruleSection
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getMusicAccess().getOwnedSectionsSectionParserRuleCall_4_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_ownedSections_21_0=ruleSection();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getMusicRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"ownedSections",
            	    	    											lv_ownedSections_21_0,
            	    	    											"fr.unice.polytech.dsl.rythmml.Ryml.Section");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // InternalRyml.g:471:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRyml.g:471:47: (iv_ruleEString= ruleEString EOF )
            // InternalRyml.g:472:2: iv_ruleEString= ruleEString EOF
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
    // InternalRyml.g:478:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRyml.g:484:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRyml.g:485:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRyml.g:485:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRyml.g:486:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRyml.g:494:3: this_ID_1= RULE_ID
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
    // InternalRyml.g:505:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalRyml.g:505:48: (iv_ruleSection= ruleSection EOF )
            // InternalRyml.g:506:2: iv_ruleSection= ruleSection EOF
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
    // InternalRyml.g:512:1: ruleSection returns [EObject current=null] : (otherlv_0= 'Section' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:518:2: ( (otherlv_0= 'Section' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* ) )
            // InternalRyml.g:519:2: (otherlv_0= 'Section' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* )
            {
            // InternalRyml.g:519:2: (otherlv_0= 'Section' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* )
            // InternalRyml.g:520:3: otherlv_0= 'Section' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
            		
            // InternalRyml.g:524:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRyml.g:525:4: (lv_name_1_0= ruleEString )
            {
            // InternalRyml.g:525:4: (lv_name_1_0= ruleEString )
            // InternalRyml.g:526:5: lv_name_1_0= ruleEString
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
            		
            // InternalRyml.g:547:3: ( ( ruleEString ) )
            // InternalRyml.g:548:4: ( ruleEString )
            {
            // InternalRyml.g:548:4: ( ruleEString )
            // InternalRyml.g:549:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSectionAccess().getPatternsPatternCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRyml.g:563:3: (otherlv_4= '|' ( ( ruleEString ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRyml.g:564:4: otherlv_4= '|' ( ( ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getVerticalLineKeyword_4_0());
            	    			
            	    // InternalRyml.g:568:4: ( ( ruleEString ) )
            	    // InternalRyml.g:569:5: ( ruleEString )
            	    {
            	    // InternalRyml.g:569:5: ( ruleEString )
            	    // InternalRyml.g:570:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSectionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSectionAccess().getPatternsPatternCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalRyml.g:589:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRyml.g:589:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRyml.g:590:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalRyml.g:596:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRyml.g:602:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRyml.g:603:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRyml.g:603:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRyml.g:604:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRyml.g:604:3: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRyml.g:605:4: kw= '-'
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
    // InternalRyml.g:622:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalRyml.g:622:48: (iv_rulePattern= rulePattern EOF )
            // InternalRyml.g:623:2: iv_rulePattern= rulePattern EOF
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
    // InternalRyml.g:629:1: rulePattern returns [EObject current=null] : (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_bars_3_0= ruleBarMultiplier ) ) (otherlv_4= '|' ( (lv_bars_5_0= ruleBarMultiplier ) ) )* ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_bars_3_0 = null;

        EObject lv_bars_5_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:635:2: ( (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_bars_3_0= ruleBarMultiplier ) ) (otherlv_4= '|' ( (lv_bars_5_0= ruleBarMultiplier ) ) )* ) )
            // InternalRyml.g:636:2: (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_bars_3_0= ruleBarMultiplier ) ) (otherlv_4= '|' ( (lv_bars_5_0= ruleBarMultiplier ) ) )* )
            {
            // InternalRyml.g:636:2: (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_bars_3_0= ruleBarMultiplier ) ) (otherlv_4= '|' ( (lv_bars_5_0= ruleBarMultiplier ) ) )* )
            // InternalRyml.g:637:3: otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_bars_3_0= ruleBarMultiplier ) ) (otherlv_4= '|' ( (lv_bars_5_0= ruleBarMultiplier ) ) )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getPatternKeyword_0());
            		
            // InternalRyml.g:641:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRyml.g:642:4: (lv_name_1_0= ruleEString )
            {
            // InternalRyml.g:642:4: (lv_name_1_0= ruleEString )
            // InternalRyml.g:643:5: lv_name_1_0= ruleEString
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
            		
            // InternalRyml.g:664:3: ( (lv_bars_3_0= ruleBarMultiplier ) )
            // InternalRyml.g:665:4: (lv_bars_3_0= ruleBarMultiplier )
            {
            // InternalRyml.g:665:4: (lv_bars_3_0= ruleBarMultiplier )
            // InternalRyml.g:666:5: lv_bars_3_0= ruleBarMultiplier
            {

            					newCompositeNode(grammarAccess.getPatternAccess().getBarsBarMultiplierParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_bars_3_0=ruleBarMultiplier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternRule());
            					}
            					add(
            						current,
            						"bars",
            						lv_bars_3_0,
            						"fr.unice.polytech.dsl.rythmml.Ryml.BarMultiplier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRyml.g:683:3: (otherlv_4= '|' ( (lv_bars_5_0= ruleBarMultiplier ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRyml.g:684:4: otherlv_4= '|' ( (lv_bars_5_0= ruleBarMultiplier ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getVerticalLineKeyword_4_0());
            	    			
            	    // InternalRyml.g:688:4: ( (lv_bars_5_0= ruleBarMultiplier ) )
            	    // InternalRyml.g:689:5: (lv_bars_5_0= ruleBarMultiplier )
            	    {
            	    // InternalRyml.g:689:5: (lv_bars_5_0= ruleBarMultiplier )
            	    // InternalRyml.g:690:6: lv_bars_5_0= ruleBarMultiplier
            	    {

            	    						newCompositeNode(grammarAccess.getPatternAccess().getBarsBarMultiplierParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_bars_5_0=ruleBarMultiplier();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPatternRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bars",
            	    							lv_bars_5_0,
            	    							"fr.unice.polytech.dsl.rythmml.Ryml.BarMultiplier");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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


    // $ANTLR start "entryRuleBarMultiplier"
    // InternalRyml.g:712:1: entryRuleBarMultiplier returns [EObject current=null] : iv_ruleBarMultiplier= ruleBarMultiplier EOF ;
    public final EObject entryRuleBarMultiplier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarMultiplier = null;


        try {
            // InternalRyml.g:712:54: (iv_ruleBarMultiplier= ruleBarMultiplier EOF )
            // InternalRyml.g:713:2: iv_ruleBarMultiplier= ruleBarMultiplier EOF
            {
             newCompositeNode(grammarAccess.getBarMultiplierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBarMultiplier=ruleBarMultiplier();

            state._fsp--;

             current =iv_ruleBarMultiplier; 
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
    // $ANTLR end "entryRuleBarMultiplier"


    // $ANTLR start "ruleBarMultiplier"
    // InternalRyml.g:719:1: ruleBarMultiplier returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= 'x' ( (lv_multiplier_2_0= ruleEInt ) ) )? ) ;
    public final EObject ruleBarMultiplier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_multiplier_2_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:725:2: ( ( ( ( ruleEString ) ) (otherlv_1= 'x' ( (lv_multiplier_2_0= ruleEInt ) ) )? ) )
            // InternalRyml.g:726:2: ( ( ( ruleEString ) ) (otherlv_1= 'x' ( (lv_multiplier_2_0= ruleEInt ) ) )? )
            {
            // InternalRyml.g:726:2: ( ( ( ruleEString ) ) (otherlv_1= 'x' ( (lv_multiplier_2_0= ruleEInt ) ) )? )
            // InternalRyml.g:727:3: ( ( ruleEString ) ) (otherlv_1= 'x' ( (lv_multiplier_2_0= ruleEInt ) ) )?
            {
            // InternalRyml.g:727:3: ( ( ruleEString ) )
            // InternalRyml.g:728:4: ( ruleEString )
            {
            // InternalRyml.g:728:4: ( ruleEString )
            // InternalRyml.g:729:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBarMultiplierRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBarMultiplierAccess().getBarBarCrossReference_0_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRyml.g:743:3: (otherlv_1= 'x' ( (lv_multiplier_2_0= ruleEInt ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRyml.g:744:4: otherlv_1= 'x' ( (lv_multiplier_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getBarMultiplierAccess().getXKeyword_1_0());
                    			
                    // InternalRyml.g:748:4: ( (lv_multiplier_2_0= ruleEInt ) )
                    // InternalRyml.g:749:5: (lv_multiplier_2_0= ruleEInt )
                    {
                    // InternalRyml.g:749:5: (lv_multiplier_2_0= ruleEInt )
                    // InternalRyml.g:750:6: lv_multiplier_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBarMultiplierAccess().getMultiplierEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_multiplier_2_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarMultiplierRule());
                    						}
                    						set(
                    							current,
                    							"multiplier",
                    							lv_multiplier_2_0,
                    							"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleBarMultiplier"


    // $ANTLR start "entryRuleBar"
    // InternalRyml.g:772:1: entryRuleBar returns [EObject current=null] : iv_ruleBar= ruleBar EOF ;
    public final EObject entryRuleBar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBar = null;


        try {
            // InternalRyml.g:772:44: (iv_ruleBar= ruleBar EOF )
            // InternalRyml.g:773:2: iv_ruleBar= ruleBar EOF
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
    // InternalRyml.g:779:1: ruleBar returns [EObject current=null] : (this_ClassicalBar_0= ruleClassicalBar | this_ModifiedBar_1= ruleModifiedBar ) ;
    public final EObject ruleBar() throws RecognitionException {
        EObject current = null;

        EObject this_ClassicalBar_0 = null;

        EObject this_ModifiedBar_1 = null;



        	enterRule();

        try {
            // InternalRyml.g:785:2: ( (this_ClassicalBar_0= ruleClassicalBar | this_ModifiedBar_1= ruleModifiedBar ) )
            // InternalRyml.g:786:2: (this_ClassicalBar_0= ruleClassicalBar | this_ModifiedBar_1= ruleModifiedBar )
            {
            // InternalRyml.g:786:2: (this_ClassicalBar_0= ruleClassicalBar | this_ModifiedBar_1= ruleModifiedBar )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_STRING) ) {
                    int LA17_2 = input.LA(3);

                    if ( (LA17_2==12) ) {
                        alt17=1;
                    }
                    else if ( (LA17_2==23) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA17_1==RULE_ID) ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3==12) ) {
                        alt17=1;
                    }
                    else if ( (LA17_3==23) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRyml.g:787:3: this_ClassicalBar_0= ruleClassicalBar
                    {

                    			newCompositeNode(grammarAccess.getBarAccess().getClassicalBarParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassicalBar_0=ruleClassicalBar();

                    state._fsp--;


                    			current = this_ClassicalBar_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRyml.g:796:3: this_ModifiedBar_1= ruleModifiedBar
                    {

                    			newCompositeNode(grammarAccess.getBarAccess().getModifiedBarParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModifiedBar_1=ruleModifiedBar();

                    state._fsp--;


                    			current = this_ModifiedBar_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleBar"


    // $ANTLR start "entryRuleClassicalBar"
    // InternalRyml.g:808:1: entryRuleClassicalBar returns [EObject current=null] : iv_ruleClassicalBar= ruleClassicalBar EOF ;
    public final EObject entryRuleClassicalBar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassicalBar = null;


        try {
            // InternalRyml.g:808:53: (iv_ruleClassicalBar= ruleClassicalBar EOF )
            // InternalRyml.g:809:2: iv_ruleClassicalBar= ruleClassicalBar EOF
            {
             newCompositeNode(grammarAccess.getClassicalBarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassicalBar=ruleClassicalBar();

            state._fsp--;

             current =iv_ruleClassicalBar; 
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
    // $ANTLR end "entryRuleClassicalBar"


    // $ANTLR start "ruleClassicalBar"
    // InternalRyml.g:815:1: ruleClassicalBar returns [EObject current=null] : (otherlv_0= 'Bar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleClassicalBar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:821:2: ( (otherlv_0= 'Bar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* ) )
            // InternalRyml.g:822:2: (otherlv_0= 'Bar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* )
            {
            // InternalRyml.g:822:2: (otherlv_0= 'Bar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* )
            // InternalRyml.g:823:3: otherlv_0= 'Bar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClassicalBarAccess().getBarKeyword_0());
            		
            // InternalRyml.g:827:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRyml.g:828:4: (lv_name_1_0= ruleEString )
            {
            // InternalRyml.g:828:4: (lv_name_1_0= ruleEString )
            // InternalRyml.g:829:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassicalBarAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassicalBarRule());
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

            			newLeafNode(otherlv_2, grammarAccess.getClassicalBarAccess().getColonKeyword_2());
            		
            // InternalRyml.g:850:3: ( ( ruleEString ) )
            // InternalRyml.g:851:4: ( ruleEString )
            {
            // InternalRyml.g:851:4: ( ruleEString )
            // InternalRyml.g:852:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassicalBarRule());
            					}
            				

            					newCompositeNode(grammarAccess.getClassicalBarAccess().getBeatsBeatCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRyml.g:866:3: (otherlv_4= '|' ( ( ruleEString ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==18) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRyml.g:867:4: otherlv_4= '|' ( ( ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getClassicalBarAccess().getVerticalLineKeyword_4_0());
            	    			
            	    // InternalRyml.g:871:4: ( ( ruleEString ) )
            	    // InternalRyml.g:872:5: ( ruleEString )
            	    {
            	    // InternalRyml.g:872:5: ( ruleEString )
            	    // InternalRyml.g:873:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getClassicalBarRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getClassicalBarAccess().getBeatsBeatCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleClassicalBar"


    // $ANTLR start "entryRuleModifiedBar"
    // InternalRyml.g:892:1: entryRuleModifiedBar returns [EObject current=null] : iv_ruleModifiedBar= ruleModifiedBar EOF ;
    public final EObject entryRuleModifiedBar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifiedBar = null;


        try {
            // InternalRyml.g:892:52: (iv_ruleModifiedBar= ruleModifiedBar EOF )
            // InternalRyml.g:893:2: iv_ruleModifiedBar= ruleModifiedBar EOF
            {
             newCompositeNode(grammarAccess.getModifiedBarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModifiedBar=ruleModifiedBar();

            state._fsp--;

             current =iv_ruleModifiedBar; 
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
    // $ANTLR end "entryRuleModifiedBar"


    // $ANTLR start "ruleModifiedBar"
    // InternalRyml.g:899:1: ruleModifiedBar returns [EObject current=null] : (otherlv_0= 'Bar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ' based on :' ( ( ruleEString ) ) ) ;
    public final EObject ruleModifiedBar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:905:2: ( (otherlv_0= 'Bar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ' based on :' ( ( ruleEString ) ) ) )
            // InternalRyml.g:906:2: (otherlv_0= 'Bar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ' based on :' ( ( ruleEString ) ) )
            {
            // InternalRyml.g:906:2: (otherlv_0= 'Bar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ' based on :' ( ( ruleEString ) ) )
            // InternalRyml.g:907:3: otherlv_0= 'Bar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ' based on :' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModifiedBarAccess().getBarKeyword_0());
            		
            // InternalRyml.g:911:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRyml.g:912:4: (lv_name_1_0= ruleEString )
            {
            // InternalRyml.g:912:4: (lv_name_1_0= ruleEString )
            // InternalRyml.g:913:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModifiedBarAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifiedBarRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.dsl.rythmml.Ryml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getModifiedBarAccess().getBasedOnKeyword_2());
            		
            // InternalRyml.g:934:3: ( ( ruleEString ) )
            // InternalRyml.g:935:4: ( ruleEString )
            {
            // InternalRyml.g:935:4: ( ruleEString )
            // InternalRyml.g:936:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModifiedBarRule());
            					}
            				

            					newCompositeNode(grammarAccess.getModifiedBarAccess().getBarBarCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleModifiedBar"


    // $ANTLR start "entryRuleBeat"
    // InternalRyml.g:954:1: entryRuleBeat returns [EObject current=null] : iv_ruleBeat= ruleBeat EOF ;
    public final EObject entryRuleBeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeat = null;


        try {
            // InternalRyml.g:954:45: (iv_ruleBeat= ruleBeat EOF )
            // InternalRyml.g:955:2: iv_ruleBeat= ruleBeat EOF
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
    // InternalRyml.g:961:1: ruleBeat returns [EObject current=null] : (otherlv_0= 'Beat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'Nb of ticks : ' ( (lv_totalDivNumber_4_0= ruleEInt ) ) )? otherlv_5= 'Notes :' ( ( ruleEString ) ) otherlv_7= ',' ( (lv_notePositions_8_0= ruleEInt ) ) (otherlv_9= '|' ( ( ruleEString ) ) otherlv_11= ',' ( (lv_notePositions_12_0= ruleEInt ) ) )* ) ;
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
            // InternalRyml.g:967:2: ( (otherlv_0= 'Beat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'Nb of ticks : ' ( (lv_totalDivNumber_4_0= ruleEInt ) ) )? otherlv_5= 'Notes :' ( ( ruleEString ) ) otherlv_7= ',' ( (lv_notePositions_8_0= ruleEInt ) ) (otherlv_9= '|' ( ( ruleEString ) ) otherlv_11= ',' ( (lv_notePositions_12_0= ruleEInt ) ) )* ) )
            // InternalRyml.g:968:2: (otherlv_0= 'Beat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'Nb of ticks : ' ( (lv_totalDivNumber_4_0= ruleEInt ) ) )? otherlv_5= 'Notes :' ( ( ruleEString ) ) otherlv_7= ',' ( (lv_notePositions_8_0= ruleEInt ) ) (otherlv_9= '|' ( ( ruleEString ) ) otherlv_11= ',' ( (lv_notePositions_12_0= ruleEInt ) ) )* )
            {
            // InternalRyml.g:968:2: (otherlv_0= 'Beat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'Nb of ticks : ' ( (lv_totalDivNumber_4_0= ruleEInt ) ) )? otherlv_5= 'Notes :' ( ( ruleEString ) ) otherlv_7= ',' ( (lv_notePositions_8_0= ruleEInt ) ) (otherlv_9= '|' ( ( ruleEString ) ) otherlv_11= ',' ( (lv_notePositions_12_0= ruleEInt ) ) )* )
            // InternalRyml.g:969:3: otherlv_0= 'Beat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'Nb of ticks : ' ( (lv_totalDivNumber_4_0= ruleEInt ) ) )? otherlv_5= 'Notes :' ( ( ruleEString ) ) otherlv_7= ',' ( (lv_notePositions_8_0= ruleEInt ) ) (otherlv_9= '|' ( ( ruleEString ) ) otherlv_11= ',' ( (lv_notePositions_12_0= ruleEInt ) ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBeatAccess().getBeatKeyword_0());
            		
            // InternalRyml.g:973:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRyml.g:974:4: (lv_name_1_0= ruleEString )
            {
            // InternalRyml.g:974:4: (lv_name_1_0= ruleEString )
            // InternalRyml.g:975:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getBeatAccess().getColonKeyword_2());
            		
            // InternalRyml.g:996:3: (otherlv_3= 'Nb of ticks : ' ( (lv_totalDivNumber_4_0= ruleEInt ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRyml.g:997:4: otherlv_3= 'Nb of ticks : ' ( (lv_totalDivNumber_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getBeatAccess().getNbOfTicksKeyword_3_0());
                    			
                    // InternalRyml.g:1001:4: ( (lv_totalDivNumber_4_0= ruleEInt ) )
                    // InternalRyml.g:1002:5: (lv_totalDivNumber_4_0= ruleEInt )
                    {
                    // InternalRyml.g:1002:5: (lv_totalDivNumber_4_0= ruleEInt )
                    // InternalRyml.g:1003:6: lv_totalDivNumber_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBeatAccess().getTotalDivNumberEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
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

            otherlv_5=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getBeatAccess().getNotesKeyword_4());
            		
            // InternalRyml.g:1025:3: ( ( ruleEString ) )
            // InternalRyml.g:1026:4: ( ruleEString )
            {
            // InternalRyml.g:1026:4: ( ruleEString )
            // InternalRyml.g:1027:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBeatRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBeatAccess().getNotesNoteCrossReference_5_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getBeatAccess().getCommaKeyword_6());
            		
            // InternalRyml.g:1045:3: ( (lv_notePositions_8_0= ruleEInt ) )
            // InternalRyml.g:1046:4: (lv_notePositions_8_0= ruleEInt )
            {
            // InternalRyml.g:1046:4: (lv_notePositions_8_0= ruleEInt )
            // InternalRyml.g:1047:5: lv_notePositions_8_0= ruleEInt
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

            // InternalRyml.g:1064:3: (otherlv_9= '|' ( ( ruleEString ) ) otherlv_11= ',' ( (lv_notePositions_12_0= ruleEInt ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRyml.g:1065:4: otherlv_9= '|' ( ( ruleEString ) ) otherlv_11= ',' ( (lv_notePositions_12_0= ruleEInt ) )
            	    {
            	    otherlv_9=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_9, grammarAccess.getBeatAccess().getVerticalLineKeyword_8_0());
            	    			
            	    // InternalRyml.g:1069:4: ( ( ruleEString ) )
            	    // InternalRyml.g:1070:5: ( ruleEString )
            	    {
            	    // InternalRyml.g:1070:5: ( ruleEString )
            	    // InternalRyml.g:1071:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBeatRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getBeatAccess().getNotesNoteCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_11=(Token)match(input,27,FOLLOW_6); 

            	    				newLeafNode(otherlv_11, grammarAccess.getBeatAccess().getCommaKeyword_8_2());
            	    			
            	    // InternalRyml.g:1089:4: ( (lv_notePositions_12_0= ruleEInt ) )
            	    // InternalRyml.g:1090:5: (lv_notePositions_12_0= ruleEInt )
            	    {
            	    // InternalRyml.g:1090:5: (lv_notePositions_12_0= ruleEInt )
            	    // InternalRyml.g:1091:6: lv_notePositions_12_0= ruleEInt
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
            	    break loop20;
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
    // InternalRyml.g:1113:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // InternalRyml.g:1113:45: (iv_ruleNote= ruleNote EOF )
            // InternalRyml.g:1114:2: iv_ruleNote= ruleNote EOF
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
    // InternalRyml.g:1120:1: ruleNote returns [EObject current=null] : (otherlv_0= 'Note' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleDrumNoteValue ) )? ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:1126:2: ( (otherlv_0= 'Note' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleDrumNoteValue ) )? ) )
            // InternalRyml.g:1127:2: (otherlv_0= 'Note' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleDrumNoteValue ) )? )
            {
            // InternalRyml.g:1127:2: (otherlv_0= 'Note' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleDrumNoteValue ) )? )
            // InternalRyml.g:1128:3: otherlv_0= 'Note' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleDrumNoteValue ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNoteAccess().getNoteKeyword_0());
            		
            // InternalRyml.g:1132:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRyml.g:1133:4: (lv_name_1_0= ruleEString )
            {
            // InternalRyml.g:1133:4: (lv_name_1_0= ruleEString )
            // InternalRyml.g:1134:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getNoteAccess().getColonKeyword_2());
            		
            // InternalRyml.g:1155:3: ( (lv_value_3_0= ruleDrumNoteValue ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=29 && LA21_0<=39)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRyml.g:1156:4: (lv_value_3_0= ruleDrumNoteValue )
                    {
                    // InternalRyml.g:1156:4: (lv_value_3_0= ruleDrumNoteValue )
                    // InternalRyml.g:1157:5: lv_value_3_0= ruleDrumNoteValue
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
    // InternalRyml.g:1178:1: ruleDrumNoteValue returns [Enumerator current=null] : ( (enumLiteral_0= 'SD' ) | (enumLiteral_1= 'BD' ) | (enumLiteral_2= 'CH' ) | (enumLiteral_3= 'OH' ) | (enumLiteral_4= 'CC' ) | (enumLiteral_5= 'RC' ) | (enumLiteral_6= 'TM' ) | (enumLiteral_7= 'TO' ) | (enumLiteral_8= 'S' ) | (enumLiteral_9= 'WS' ) | (enumLiteral_10= 'L' ) ) ;
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
            // InternalRyml.g:1184:2: ( ( (enumLiteral_0= 'SD' ) | (enumLiteral_1= 'BD' ) | (enumLiteral_2= 'CH' ) | (enumLiteral_3= 'OH' ) | (enumLiteral_4= 'CC' ) | (enumLiteral_5= 'RC' ) | (enumLiteral_6= 'TM' ) | (enumLiteral_7= 'TO' ) | (enumLiteral_8= 'S' ) | (enumLiteral_9= 'WS' ) | (enumLiteral_10= 'L' ) ) )
            // InternalRyml.g:1185:2: ( (enumLiteral_0= 'SD' ) | (enumLiteral_1= 'BD' ) | (enumLiteral_2= 'CH' ) | (enumLiteral_3= 'OH' ) | (enumLiteral_4= 'CC' ) | (enumLiteral_5= 'RC' ) | (enumLiteral_6= 'TM' ) | (enumLiteral_7= 'TO' ) | (enumLiteral_8= 'S' ) | (enumLiteral_9= 'WS' ) | (enumLiteral_10= 'L' ) )
            {
            // InternalRyml.g:1185:2: ( (enumLiteral_0= 'SD' ) | (enumLiteral_1= 'BD' ) | (enumLiteral_2= 'CH' ) | (enumLiteral_3= 'OH' ) | (enumLiteral_4= 'CC' ) | (enumLiteral_5= 'RC' ) | (enumLiteral_6= 'TM' ) | (enumLiteral_7= 'TO' ) | (enumLiteral_8= 'S' ) | (enumLiteral_9= 'WS' ) | (enumLiteral_10= 'L' ) )
            int alt22=11;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt22=1;
                }
                break;
            case 30:
                {
                alt22=2;
                }
                break;
            case 31:
                {
                alt22=3;
                }
                break;
            case 32:
                {
                alt22=4;
                }
                break;
            case 33:
                {
                alt22=5;
                }
                break;
            case 34:
                {
                alt22=6;
                }
                break;
            case 35:
                {
                alt22=7;
                }
                break;
            case 36:
                {
                alt22=8;
                }
                break;
            case 37:
                {
                alt22=9;
                }
                break;
            case 38:
                {
                alt22=10;
                }
                break;
            case 39:
                {
                alt22=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalRyml.g:1186:3: (enumLiteral_0= 'SD' )
                    {
                    // InternalRyml.g:1186:3: (enumLiteral_0= 'SD' )
                    // InternalRyml.g:1187:4: enumLiteral_0= 'SD'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getSDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDrumNoteValueAccess().getSDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRyml.g:1194:3: (enumLiteral_1= 'BD' )
                    {
                    // InternalRyml.g:1194:3: (enumLiteral_1= 'BD' )
                    // InternalRyml.g:1195:4: enumLiteral_1= 'BD'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getBDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDrumNoteValueAccess().getBDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRyml.g:1202:3: (enumLiteral_2= 'CH' )
                    {
                    // InternalRyml.g:1202:3: (enumLiteral_2= 'CH' )
                    // InternalRyml.g:1203:4: enumLiteral_2= 'CH'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getCHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDrumNoteValueAccess().getCHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRyml.g:1210:3: (enumLiteral_3= 'OH' )
                    {
                    // InternalRyml.g:1210:3: (enumLiteral_3= 'OH' )
                    // InternalRyml.g:1211:4: enumLiteral_3= 'OH'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getOHEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDrumNoteValueAccess().getOHEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRyml.g:1218:3: (enumLiteral_4= 'CC' )
                    {
                    // InternalRyml.g:1218:3: (enumLiteral_4= 'CC' )
                    // InternalRyml.g:1219:4: enumLiteral_4= 'CC'
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getCCEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDrumNoteValueAccess().getCCEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRyml.g:1226:3: (enumLiteral_5= 'RC' )
                    {
                    // InternalRyml.g:1226:3: (enumLiteral_5= 'RC' )
                    // InternalRyml.g:1227:4: enumLiteral_5= 'RC'
                    {
                    enumLiteral_5=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getRCEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDrumNoteValueAccess().getRCEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRyml.g:1234:3: (enumLiteral_6= 'TM' )
                    {
                    // InternalRyml.g:1234:3: (enumLiteral_6= 'TM' )
                    // InternalRyml.g:1235:4: enumLiteral_6= 'TM'
                    {
                    enumLiteral_6=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getTMEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDrumNoteValueAccess().getTMEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRyml.g:1242:3: (enumLiteral_7= 'TO' )
                    {
                    // InternalRyml.g:1242:3: (enumLiteral_7= 'TO' )
                    // InternalRyml.g:1243:4: enumLiteral_7= 'TO'
                    {
                    enumLiteral_7=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getTOEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDrumNoteValueAccess().getTOEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRyml.g:1250:3: (enumLiteral_8= 'S' )
                    {
                    // InternalRyml.g:1250:3: (enumLiteral_8= 'S' )
                    // InternalRyml.g:1251:4: enumLiteral_8= 'S'
                    {
                    enumLiteral_8=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getSEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDrumNoteValueAccess().getSEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalRyml.g:1258:3: (enumLiteral_9= 'WS' )
                    {
                    // InternalRyml.g:1258:3: (enumLiteral_9= 'WS' )
                    // InternalRyml.g:1259:4: enumLiteral_9= 'WS'
                    {
                    enumLiteral_9=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getWSEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getDrumNoteValueAccess().getWSEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalRyml.g:1266:3: (enumLiteral_10= 'L' )
                    {
                    // InternalRyml.g:1266:3: (enumLiteral_10= 'L' )
                    // InternalRyml.g:1267:4: enumLiteral_10= 'L'
                    {
                    enumLiteral_10=(Token)match(input,39,FOLLOW_2); 

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
    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\1\16\uffff";
    static final String dfa_3s = "\1\13\1\uffff\1\4\2\14\1\31\1\6\1\4\1\6\1\32\2\33\2\6\1\uffff";
    static final String dfa_4s = "\1\30\1\uffff\1\5\2\14\1\32\1\23\1\5\1\6\1\32\2\33\1\23\1\6\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\14\uffff\1\1";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\5\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1\uffff\1\2",
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
            return "()* loopback of 288:8: ( (lv_ownedBeats_15_0= ruleBeat ) )*";
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\1\12\uffff";
    static final String dfa_10s = "\1\13\1\uffff\1\4\2\14\2\4\4\uffff";
    static final String dfa_11s = "\1\30\1\uffff\1\5\2\27\2\5\4\uffff";
    static final String dfa_12s = "\1\uffff\1\2\5\uffff\4\1";
    static final String dfa_13s = "\13\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\5\uffff\1\1\2\uffff\1\1\1\uffff\1\2\1\uffff\1\1",
            "",
            "\1\3\1\4",
            "\1\5\12\uffff\1\6",
            "\1\5\12\uffff\1\6",
            "\1\7\1\10",
            "\1\11\1\12",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 337:8: ( (lv_ownedBars_17_0= ruleBar ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000001153E802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001153E800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000FFE0000002L});

}
