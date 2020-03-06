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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Music'", "':'", "'title :'", "'author :'", "'bpm :'", "'resolution per beats : '", "'Section'", "'|'", "'-'", "'Pattern'", "'x'", "'beat'", "'add'", "'delete'", "'replace'", "'by'", "'Bar'", "'based on'", "'Modifications:'", "'Beat'", "'Nb of ticks :'", "','", "'Note'", "'SD'", "'BD'", "'CH'", "'OH'", "'CC'", "'RC'", "'TM'", "'TO'", "'S'", "'WS'", "'L'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalRyml.g:72:1: ruleMusic returns [EObject current=null] : (otherlv_0= 'Music' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'title :' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'author :' ( (lv_author_6_0= ruleEString ) ) )? (otherlv_7= 'bpm :' ( (lv_bpm_8_0= ruleEInt ) ) )? (otherlv_9= 'resolution per beats : ' ( (lv_resolutionPerSlide_10_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_11_0= ruleNote ) ) ( (lv_ownedNotes_12_0= ruleNote ) )* )? ( ( (lv_ownedBeats_13_0= ruleBeat ) ) ( (lv_ownedBeats_14_0= ruleBeat ) )* )? ( ( (lv_ownedBars_15_0= ruleBar ) ) ( (lv_ownedBars_16_0= ruleBar ) )* )? ( ( (lv_ownedPatterns_17_0= rulePattern ) ) ( (lv_ownedPatterns_18_0= rulePattern ) )* )? ( ( (lv_ownedSections_19_0= ruleSection ) ) ( (lv_ownedSections_20_0= ruleSection ) )* )? ) ;
    public final EObject ruleMusic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_author_6_0 = null;

        AntlrDatatypeRuleToken lv_bpm_8_0 = null;

        AntlrDatatypeRuleToken lv_resolutionPerSlide_10_0 = null;

        EObject lv_ownedNotes_11_0 = null;

        EObject lv_ownedNotes_12_0 = null;

        EObject lv_ownedBeats_13_0 = null;

        EObject lv_ownedBeats_14_0 = null;

        EObject lv_ownedBars_15_0 = null;

        EObject lv_ownedBars_16_0 = null;

        EObject lv_ownedPatterns_17_0 = null;

        EObject lv_ownedPatterns_18_0 = null;

        EObject lv_ownedSections_19_0 = null;

        EObject lv_ownedSections_20_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:78:2: ( (otherlv_0= 'Music' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'title :' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'author :' ( (lv_author_6_0= ruleEString ) ) )? (otherlv_7= 'bpm :' ( (lv_bpm_8_0= ruleEInt ) ) )? (otherlv_9= 'resolution per beats : ' ( (lv_resolutionPerSlide_10_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_11_0= ruleNote ) ) ( (lv_ownedNotes_12_0= ruleNote ) )* )? ( ( (lv_ownedBeats_13_0= ruleBeat ) ) ( (lv_ownedBeats_14_0= ruleBeat ) )* )? ( ( (lv_ownedBars_15_0= ruleBar ) ) ( (lv_ownedBars_16_0= ruleBar ) )* )? ( ( (lv_ownedPatterns_17_0= rulePattern ) ) ( (lv_ownedPatterns_18_0= rulePattern ) )* )? ( ( (lv_ownedSections_19_0= ruleSection ) ) ( (lv_ownedSections_20_0= ruleSection ) )* )? ) )
            // InternalRyml.g:79:2: (otherlv_0= 'Music' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'title :' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'author :' ( (lv_author_6_0= ruleEString ) ) )? (otherlv_7= 'bpm :' ( (lv_bpm_8_0= ruleEInt ) ) )? (otherlv_9= 'resolution per beats : ' ( (lv_resolutionPerSlide_10_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_11_0= ruleNote ) ) ( (lv_ownedNotes_12_0= ruleNote ) )* )? ( ( (lv_ownedBeats_13_0= ruleBeat ) ) ( (lv_ownedBeats_14_0= ruleBeat ) )* )? ( ( (lv_ownedBars_15_0= ruleBar ) ) ( (lv_ownedBars_16_0= ruleBar ) )* )? ( ( (lv_ownedPatterns_17_0= rulePattern ) ) ( (lv_ownedPatterns_18_0= rulePattern ) )* )? ( ( (lv_ownedSections_19_0= ruleSection ) ) ( (lv_ownedSections_20_0= ruleSection ) )* )? )
            {
            // InternalRyml.g:79:2: (otherlv_0= 'Music' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'title :' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'author :' ( (lv_author_6_0= ruleEString ) ) )? (otherlv_7= 'bpm :' ( (lv_bpm_8_0= ruleEInt ) ) )? (otherlv_9= 'resolution per beats : ' ( (lv_resolutionPerSlide_10_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_11_0= ruleNote ) ) ( (lv_ownedNotes_12_0= ruleNote ) )* )? ( ( (lv_ownedBeats_13_0= ruleBeat ) ) ( (lv_ownedBeats_14_0= ruleBeat ) )* )? ( ( (lv_ownedBars_15_0= ruleBar ) ) ( (lv_ownedBars_16_0= ruleBar ) )* )? ( ( (lv_ownedPatterns_17_0= rulePattern ) ) ( (lv_ownedPatterns_18_0= rulePattern ) )* )? ( ( (lv_ownedSections_19_0= ruleSection ) ) ( (lv_ownedSections_20_0= ruleSection ) )* )? )
            // InternalRyml.g:80:3: otherlv_0= 'Music' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'title :' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'author :' ( (lv_author_6_0= ruleEString ) ) )? (otherlv_7= 'bpm :' ( (lv_bpm_8_0= ruleEInt ) ) )? (otherlv_9= 'resolution per beats : ' ( (lv_resolutionPerSlide_10_0= ruleEInt ) ) )? ( ( (lv_ownedNotes_11_0= ruleNote ) ) ( (lv_ownedNotes_12_0= ruleNote ) )* )? ( ( (lv_ownedBeats_13_0= ruleBeat ) ) ( (lv_ownedBeats_14_0= ruleBeat ) )* )? ( ( (lv_ownedBars_15_0= ruleBar ) ) ( (lv_ownedBars_16_0= ruleBar ) )* )? ( ( (lv_ownedPatterns_17_0= rulePattern ) ) ( (lv_ownedPatterns_18_0= rulePattern ) )* )? ( ( (lv_ownedSections_19_0= ruleSection ) ) ( (lv_ownedSections_20_0= ruleSection ) )* )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMusicAccess().getMusicKeyword_0());
            		
            // InternalRyml.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRyml.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalRyml.g:85:4: (lv_name_1_0= ruleEString )
            // InternalRyml.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMusicAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMusicRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.dsl.rythmml.Ryml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMusicAccess().getColonKeyword_2());
            		
            // InternalRyml.g:107:3: (otherlv_3= 'title :' ( (lv_title_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRyml.g:108:4: otherlv_3= 'title :' ( (lv_title_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMusicAccess().getTitleKeyword_3_0());
                    			
                    // InternalRyml.g:112:4: ( (lv_title_4_0= ruleEString ) )
                    // InternalRyml.g:113:5: (lv_title_4_0= ruleEString )
                    {
                    // InternalRyml.g:113:5: (lv_title_4_0= ruleEString )
                    // InternalRyml.g:114:6: lv_title_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMusicAccess().getTitleEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_title_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMusicRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_4_0,
                    							"fr.unice.polytech.dsl.rythmml.Ryml.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRyml.g:132:3: (otherlv_5= 'author :' ( (lv_author_6_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRyml.g:133:4: otherlv_5= 'author :' ( (lv_author_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMusicAccess().getAuthorKeyword_4_0());
                    			
                    // InternalRyml.g:137:4: ( (lv_author_6_0= ruleEString ) )
                    // InternalRyml.g:138:5: (lv_author_6_0= ruleEString )
                    {
                    // InternalRyml.g:138:5: (lv_author_6_0= ruleEString )
                    // InternalRyml.g:139:6: lv_author_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMusicAccess().getAuthorEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_author_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMusicRule());
                    						}
                    						set(
                    							current,
                    							"author",
                    							lv_author_6_0,
                    							"fr.unice.polytech.dsl.rythmml.Ryml.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRyml.g:157:3: (otherlv_7= 'bpm :' ( (lv_bpm_8_0= ruleEInt ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRyml.g:158:4: otherlv_7= 'bpm :' ( (lv_bpm_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getMusicAccess().getBpmKeyword_5_0());
                    			
                    // InternalRyml.g:162:4: ( (lv_bpm_8_0= ruleEInt ) )
                    // InternalRyml.g:163:5: (lv_bpm_8_0= ruleEInt )
                    {
                    // InternalRyml.g:163:5: (lv_bpm_8_0= ruleEInt )
                    // InternalRyml.g:164:6: lv_bpm_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMusicAccess().getBpmEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_bpm_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMusicRule());
                    						}
                    						set(
                    							current,
                    							"bpm",
                    							lv_bpm_8_0,
                    							"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRyml.g:182:3: (otherlv_9= 'resolution per beats : ' ( (lv_resolutionPerSlide_10_0= ruleEInt ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRyml.g:183:4: otherlv_9= 'resolution per beats : ' ( (lv_resolutionPerSlide_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getMusicAccess().getResolutionPerBeatsKeyword_6_0());
                    			
                    // InternalRyml.g:187:4: ( (lv_resolutionPerSlide_10_0= ruleEInt ) )
                    // InternalRyml.g:188:5: (lv_resolutionPerSlide_10_0= ruleEInt )
                    {
                    // InternalRyml.g:188:5: (lv_resolutionPerSlide_10_0= ruleEInt )
                    // InternalRyml.g:189:6: lv_resolutionPerSlide_10_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMusicAccess().getResolutionPerSlideEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_resolutionPerSlide_10_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMusicRule());
                    						}
                    						set(
                    							current,
                    							"resolutionPerSlide",
                    							lv_resolutionPerSlide_10_0,
                    							"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRyml.g:207:3: ( ( (lv_ownedNotes_11_0= ruleNote ) ) ( (lv_ownedNotes_12_0= ruleNote ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRyml.g:208:4: ( (lv_ownedNotes_11_0= ruleNote ) ) ( (lv_ownedNotes_12_0= ruleNote ) )*
                    {
                    // InternalRyml.g:208:4: ( (lv_ownedNotes_11_0= ruleNote ) )
                    // InternalRyml.g:209:5: (lv_ownedNotes_11_0= ruleNote )
                    {
                    // InternalRyml.g:209:5: (lv_ownedNotes_11_0= ruleNote )
                    // InternalRyml.g:210:6: lv_ownedNotes_11_0= ruleNote
                    {

                    						newCompositeNode(grammarAccess.getMusicAccess().getOwnedNotesNoteParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_ownedNotes_11_0=ruleNote();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMusicRule());
                    						}
                    						add(
                    							current,
                    							"ownedNotes",
                    							lv_ownedNotes_11_0,
                    							"fr.unice.polytech.dsl.rythmml.Ryml.Note");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRyml.g:227:4: ( (lv_ownedNotes_12_0= ruleNote ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==33) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRyml.g:228:5: (lv_ownedNotes_12_0= ruleNote )
                    	    {
                    	    // InternalRyml.g:228:5: (lv_ownedNotes_12_0= ruleNote )
                    	    // InternalRyml.g:229:6: lv_ownedNotes_12_0= ruleNote
                    	    {

                    	    						newCompositeNode(grammarAccess.getMusicAccess().getOwnedNotesNoteParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
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
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRyml.g:247:3: ( ( (lv_ownedBeats_13_0= ruleBeat ) ) ( (lv_ownedBeats_14_0= ruleBeat ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRyml.g:248:4: ( (lv_ownedBeats_13_0= ruleBeat ) ) ( (lv_ownedBeats_14_0= ruleBeat ) )*
                    {
                    // InternalRyml.g:248:4: ( (lv_ownedBeats_13_0= ruleBeat ) )
                    // InternalRyml.g:249:5: (lv_ownedBeats_13_0= ruleBeat )
                    {
                    // InternalRyml.g:249:5: (lv_ownedBeats_13_0= ruleBeat )
                    // InternalRyml.g:250:6: lv_ownedBeats_13_0= ruleBeat
                    {

                    						newCompositeNode(grammarAccess.getMusicAccess().getOwnedBeatsBeatParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_ownedBeats_13_0=ruleBeat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMusicRule());
                    						}
                    						add(
                    							current,
                    							"ownedBeats",
                    							lv_ownedBeats_13_0,
                    							"fr.unice.polytech.dsl.rythmml.Ryml.Beat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRyml.g:267:4: ( (lv_ownedBeats_14_0= ruleBeat ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==30) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRyml.g:268:5: (lv_ownedBeats_14_0= ruleBeat )
                    	    {
                    	    // InternalRyml.g:268:5: (lv_ownedBeats_14_0= ruleBeat )
                    	    // InternalRyml.g:269:6: lv_ownedBeats_14_0= ruleBeat
                    	    {

                    	    						newCompositeNode(grammarAccess.getMusicAccess().getOwnedBeatsBeatParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
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
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRyml.g:287:3: ( ( (lv_ownedBars_15_0= ruleBar ) ) ( (lv_ownedBars_16_0= ruleBar ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRyml.g:288:4: ( (lv_ownedBars_15_0= ruleBar ) ) ( (lv_ownedBars_16_0= ruleBar ) )*
                    {
                    // InternalRyml.g:288:4: ( (lv_ownedBars_15_0= ruleBar ) )
                    // InternalRyml.g:289:5: (lv_ownedBars_15_0= ruleBar )
                    {
                    // InternalRyml.g:289:5: (lv_ownedBars_15_0= ruleBar )
                    // InternalRyml.g:290:6: lv_ownedBars_15_0= ruleBar
                    {

                    						newCompositeNode(grammarAccess.getMusicAccess().getOwnedBarsBarParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_ownedBars_15_0=ruleBar();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMusicRule());
                    						}
                    						add(
                    							current,
                    							"ownedBars",
                    							lv_ownedBars_15_0,
                    							"fr.unice.polytech.dsl.rythmml.Ryml.Bar");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRyml.g:307:4: ( (lv_ownedBars_16_0= ruleBar ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==27) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRyml.g:308:5: (lv_ownedBars_16_0= ruleBar )
                    	    {
                    	    // InternalRyml.g:308:5: (lv_ownedBars_16_0= ruleBar )
                    	    // InternalRyml.g:309:6: lv_ownedBars_16_0= ruleBar
                    	    {

                    	    						newCompositeNode(grammarAccess.getMusicAccess().getOwnedBarsBarParserRuleCall_9_1_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
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
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRyml.g:327:3: ( ( (lv_ownedPatterns_17_0= rulePattern ) ) ( (lv_ownedPatterns_18_0= rulePattern ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRyml.g:328:4: ( (lv_ownedPatterns_17_0= rulePattern ) ) ( (lv_ownedPatterns_18_0= rulePattern ) )*
                    {
                    // InternalRyml.g:328:4: ( (lv_ownedPatterns_17_0= rulePattern ) )
                    // InternalRyml.g:329:5: (lv_ownedPatterns_17_0= rulePattern )
                    {
                    // InternalRyml.g:329:5: (lv_ownedPatterns_17_0= rulePattern )
                    // InternalRyml.g:330:6: lv_ownedPatterns_17_0= rulePattern
                    {

                    						newCompositeNode(grammarAccess.getMusicAccess().getOwnedPatternsPatternParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_ownedPatterns_17_0=rulePattern();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMusicRule());
                    						}
                    						add(
                    							current,
                    							"ownedPatterns",
                    							lv_ownedPatterns_17_0,
                    							"fr.unice.polytech.dsl.rythmml.Ryml.Pattern");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRyml.g:347:4: ( (lv_ownedPatterns_18_0= rulePattern ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==20) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRyml.g:348:5: (lv_ownedPatterns_18_0= rulePattern )
                    	    {
                    	    // InternalRyml.g:348:5: (lv_ownedPatterns_18_0= rulePattern )
                    	    // InternalRyml.g:349:6: lv_ownedPatterns_18_0= rulePattern
                    	    {

                    	    						newCompositeNode(grammarAccess.getMusicAccess().getOwnedPatternsPatternParserRuleCall_10_1_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
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
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRyml.g:367:3: ( ( (lv_ownedSections_19_0= ruleSection ) ) ( (lv_ownedSections_20_0= ruleSection ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRyml.g:368:4: ( (lv_ownedSections_19_0= ruleSection ) ) ( (lv_ownedSections_20_0= ruleSection ) )*
                    {
                    // InternalRyml.g:368:4: ( (lv_ownedSections_19_0= ruleSection ) )
                    // InternalRyml.g:369:5: (lv_ownedSections_19_0= ruleSection )
                    {
                    // InternalRyml.g:369:5: (lv_ownedSections_19_0= ruleSection )
                    // InternalRyml.g:370:6: lv_ownedSections_19_0= ruleSection
                    {

                    						newCompositeNode(grammarAccess.getMusicAccess().getOwnedSectionsSectionParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_ownedSections_19_0=ruleSection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMusicRule());
                    						}
                    						add(
                    							current,
                    							"ownedSections",
                    							lv_ownedSections_19_0,
                    							"fr.unice.polytech.dsl.rythmml.Ryml.Section");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRyml.g:387:4: ( (lv_ownedSections_20_0= ruleSection ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==17) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalRyml.g:388:5: (lv_ownedSections_20_0= ruleSection )
                    	    {
                    	    // InternalRyml.g:388:5: (lv_ownedSections_20_0= ruleSection )
                    	    // InternalRyml.g:389:6: lv_ownedSections_20_0= ruleSection
                    	    {

                    	    						newCompositeNode(grammarAccess.getMusicAccess().getOwnedSectionsSectionParserRuleCall_11_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
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
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


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
    // $ANTLR end "ruleMusic"


    // $ANTLR start "entryRuleEString"
    // InternalRyml.g:411:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRyml.g:411:47: (iv_ruleEString= ruleEString EOF )
            // InternalRyml.g:412:2: iv_ruleEString= ruleEString EOF
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
    // InternalRyml.g:418:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRyml.g:424:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRyml.g:425:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRyml.g:425:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRyml.g:426:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRyml.g:434:3: this_ID_1= RULE_ID
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
    // InternalRyml.g:445:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalRyml.g:445:48: (iv_ruleSection= ruleSection EOF )
            // InternalRyml.g:446:2: iv_ruleSection= ruleSection EOF
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
    // InternalRyml.g:452:1: ruleSection returns [EObject current=null] : (otherlv_0= 'Section' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:458:2: ( (otherlv_0= 'Section' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* ) )
            // InternalRyml.g:459:2: (otherlv_0= 'Section' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* )
            {
            // InternalRyml.g:459:2: (otherlv_0= 'Section' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )* )
            // InternalRyml.g:460:3: otherlv_0= 'Section' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '|' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
            		
            // InternalRyml.g:464:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRyml.g:465:4: (lv_name_1_0= ruleEString )
            {
            // InternalRyml.g:465:4: (lv_name_1_0= ruleEString )
            // InternalRyml.g:466:5: lv_name_1_0= ruleEString
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
            		
            // InternalRyml.g:487:3: ( ( ruleEString ) )
            // InternalRyml.g:488:4: ( ruleEString )
            {
            // InternalRyml.g:488:4: ( ruleEString )
            // InternalRyml.g:489:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSectionAccess().getPatternsPatternCrossReference_3_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRyml.g:503:3: (otherlv_4= '|' ( ( ruleEString ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRyml.g:504:4: otherlv_4= '|' ( ( ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getVerticalLineKeyword_4_0());
            	    			
            	    // InternalRyml.g:508:4: ( ( ruleEString ) )
            	    // InternalRyml.g:509:5: ( ruleEString )
            	    {
            	    // InternalRyml.g:509:5: ( ruleEString )
            	    // InternalRyml.g:510:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSectionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSectionAccess().getPatternsPatternCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleEInt"
    // InternalRyml.g:529:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRyml.g:529:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRyml.g:530:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalRyml.g:536:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRyml.g:542:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRyml.g:543:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRyml.g:543:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRyml.g:544:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRyml.g:544:3: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRyml.g:545:4: kw= '-'
                    {
                    kw=(Token)match(input,19,FOLLOW_16); 

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
    // InternalRyml.g:562:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalRyml.g:562:48: (iv_rulePattern= rulePattern EOF )
            // InternalRyml.g:563:2: iv_rulePattern= rulePattern EOF
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
    // InternalRyml.g:569:1: rulePattern returns [EObject current=null] : (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_bars_3_0= ruleBarMultiplier ) ) (otherlv_4= '|' ( (lv_bars_5_0= ruleBarMultiplier ) ) )* ) ;
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
            // InternalRyml.g:575:2: ( (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_bars_3_0= ruleBarMultiplier ) ) (otherlv_4= '|' ( (lv_bars_5_0= ruleBarMultiplier ) ) )* ) )
            // InternalRyml.g:576:2: (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_bars_3_0= ruleBarMultiplier ) ) (otherlv_4= '|' ( (lv_bars_5_0= ruleBarMultiplier ) ) )* )
            {
            // InternalRyml.g:576:2: (otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_bars_3_0= ruleBarMultiplier ) ) (otherlv_4= '|' ( (lv_bars_5_0= ruleBarMultiplier ) ) )* )
            // InternalRyml.g:577:3: otherlv_0= 'Pattern' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_bars_3_0= ruleBarMultiplier ) ) (otherlv_4= '|' ( (lv_bars_5_0= ruleBarMultiplier ) ) )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getPatternKeyword_0());
            		
            // InternalRyml.g:581:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRyml.g:582:4: (lv_name_1_0= ruleEString )
            {
            // InternalRyml.g:582:4: (lv_name_1_0= ruleEString )
            // InternalRyml.g:583:5: lv_name_1_0= ruleEString
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
            		
            // InternalRyml.g:604:3: ( (lv_bars_3_0= ruleBarMultiplier ) )
            // InternalRyml.g:605:4: (lv_bars_3_0= ruleBarMultiplier )
            {
            // InternalRyml.g:605:4: (lv_bars_3_0= ruleBarMultiplier )
            // InternalRyml.g:606:5: lv_bars_3_0= ruleBarMultiplier
            {

            					newCompositeNode(grammarAccess.getPatternAccess().getBarsBarMultiplierParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalRyml.g:623:3: (otherlv_4= '|' ( (lv_bars_5_0= ruleBarMultiplier ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==18) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRyml.g:624:4: otherlv_4= '|' ( (lv_bars_5_0= ruleBarMultiplier ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getVerticalLineKeyword_4_0());
            	    			
            	    // InternalRyml.g:628:4: ( (lv_bars_5_0= ruleBarMultiplier ) )
            	    // InternalRyml.g:629:5: (lv_bars_5_0= ruleBarMultiplier )
            	    {
            	    // InternalRyml.g:629:5: (lv_bars_5_0= ruleBarMultiplier )
            	    // InternalRyml.g:630:6: lv_bars_5_0= ruleBarMultiplier
            	    {

            	    						newCompositeNode(grammarAccess.getPatternAccess().getBarsBarMultiplierParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleBarMultiplier"
    // InternalRyml.g:652:1: entryRuleBarMultiplier returns [EObject current=null] : iv_ruleBarMultiplier= ruleBarMultiplier EOF ;
    public final EObject entryRuleBarMultiplier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarMultiplier = null;


        try {
            // InternalRyml.g:652:54: (iv_ruleBarMultiplier= ruleBarMultiplier EOF )
            // InternalRyml.g:653:2: iv_ruleBarMultiplier= ruleBarMultiplier EOF
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
    // InternalRyml.g:659:1: ruleBarMultiplier returns [EObject current=null] : ( () ( ( ruleEString ) ) (otherlv_2= 'x' ( (lv_multiplier_3_0= ruleEInt ) ) )? ) ;
    public final EObject ruleBarMultiplier() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_multiplier_3_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:665:2: ( ( () ( ( ruleEString ) ) (otherlv_2= 'x' ( (lv_multiplier_3_0= ruleEInt ) ) )? ) )
            // InternalRyml.g:666:2: ( () ( ( ruleEString ) ) (otherlv_2= 'x' ( (lv_multiplier_3_0= ruleEInt ) ) )? )
            {
            // InternalRyml.g:666:2: ( () ( ( ruleEString ) ) (otherlv_2= 'x' ( (lv_multiplier_3_0= ruleEInt ) ) )? )
            // InternalRyml.g:667:3: () ( ( ruleEString ) ) (otherlv_2= 'x' ( (lv_multiplier_3_0= ruleEInt ) ) )?
            {
            // InternalRyml.g:667:3: ()
            // InternalRyml.g:668:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBarMultiplierAccess().getBarMultiplierAction_0(),
            					current);
            			

            }

            // InternalRyml.g:674:3: ( ( ruleEString ) )
            // InternalRyml.g:675:4: ( ruleEString )
            {
            // InternalRyml.g:675:4: ( ruleEString )
            // InternalRyml.g:676:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBarMultiplierRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBarMultiplierAccess().getBarBarCrossReference_1_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRyml.g:690:3: (otherlv_2= 'x' ( (lv_multiplier_3_0= ruleEInt ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRyml.g:691:4: otherlv_2= 'x' ( (lv_multiplier_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getBarMultiplierAccess().getXKeyword_2_0());
                    			
                    // InternalRyml.g:695:4: ( (lv_multiplier_3_0= ruleEInt ) )
                    // InternalRyml.g:696:5: (lv_multiplier_3_0= ruleEInt )
                    {
                    // InternalRyml.g:696:5: (lv_multiplier_3_0= ruleEInt )
                    // InternalRyml.g:697:6: lv_multiplier_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBarMultiplierAccess().getMultiplierEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_multiplier_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarMultiplierRule());
                    						}
                    						set(
                    							current,
                    							"multiplier",
                    							lv_multiplier_3_0,
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


    // $ANTLR start "entryRuleOperation"
    // InternalRyml.g:719:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalRyml.g:719:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalRyml.g:720:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalRyml.g:726:1: ruleOperation returns [EObject current=null] : (this_NoteAddition_0= ruleNoteAddition | this_NoteDeletion_1= ruleNoteDeletion | this_NoteReplacement_2= ruleNoteReplacement ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NoteAddition_0 = null;

        EObject this_NoteDeletion_1 = null;

        EObject this_NoteReplacement_2 = null;



        	enterRule();

        try {
            // InternalRyml.g:732:2: ( (this_NoteAddition_0= ruleNoteAddition | this_NoteDeletion_1= ruleNoteDeletion | this_NoteReplacement_2= ruleNoteReplacement ) )
            // InternalRyml.g:733:2: (this_NoteAddition_0= ruleNoteAddition | this_NoteDeletion_1= ruleNoteDeletion | this_NoteReplacement_2= ruleNoteReplacement )
            {
            // InternalRyml.g:733:2: (this_NoteAddition_0= ruleNoteAddition | this_NoteDeletion_1= ruleNoteDeletion | this_NoteReplacement_2= ruleNoteReplacement )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==19) ) {
                    int LA20_2 = input.LA(3);

                    if ( (LA20_2==RULE_INT) ) {
                        switch ( input.LA(4) ) {
                        case 25:
                            {
                            alt20=3;
                            }
                            break;
                        case 24:
                            {
                            alt20=2;
                            }
                            break;
                        case 23:
                            {
                            alt20=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 3, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA20_1==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 25:
                        {
                        alt20=3;
                        }
                        break;
                    case 24:
                        {
                        alt20=2;
                        }
                        break;
                    case 23:
                        {
                        alt20=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalRyml.g:734:3: this_NoteAddition_0= ruleNoteAddition
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getNoteAdditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NoteAddition_0=ruleNoteAddition();

                    state._fsp--;


                    			current = this_NoteAddition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRyml.g:743:3: this_NoteDeletion_1= ruleNoteDeletion
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getNoteDeletionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NoteDeletion_1=ruleNoteDeletion();

                    state._fsp--;


                    			current = this_NoteDeletion_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRyml.g:752:3: this_NoteReplacement_2= ruleNoteReplacement
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getNoteReplacementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NoteReplacement_2=ruleNoteReplacement();

                    state._fsp--;


                    			current = this_NoteReplacement_2;
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleNoteAddition"
    // InternalRyml.g:764:1: entryRuleNoteAddition returns [EObject current=null] : iv_ruleNoteAddition= ruleNoteAddition EOF ;
    public final EObject entryRuleNoteAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoteAddition = null;


        try {
            // InternalRyml.g:764:53: (iv_ruleNoteAddition= ruleNoteAddition EOF )
            // InternalRyml.g:765:2: iv_ruleNoteAddition= ruleNoteAddition EOF
            {
             newCompositeNode(grammarAccess.getNoteAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoteAddition=ruleNoteAddition();

            state._fsp--;

             current =iv_ruleNoteAddition; 
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
    // $ANTLR end "entryRuleNoteAddition"


    // $ANTLR start "ruleNoteAddition"
    // InternalRyml.g:771:1: ruleNoteAddition returns [EObject current=null] : (otherlv_0= 'beat' ( (lv_beatNumber_1_0= ruleEInt ) ) otherlv_2= 'add' ( ( ruleEString ) ) ) ;
    public final EObject ruleNoteAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_beatNumber_1_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:777:2: ( (otherlv_0= 'beat' ( (lv_beatNumber_1_0= ruleEInt ) ) otherlv_2= 'add' ( ( ruleEString ) ) ) )
            // InternalRyml.g:778:2: (otherlv_0= 'beat' ( (lv_beatNumber_1_0= ruleEInt ) ) otherlv_2= 'add' ( ( ruleEString ) ) )
            {
            // InternalRyml.g:778:2: (otherlv_0= 'beat' ( (lv_beatNumber_1_0= ruleEInt ) ) otherlv_2= 'add' ( ( ruleEString ) ) )
            // InternalRyml.g:779:3: otherlv_0= 'beat' ( (lv_beatNumber_1_0= ruleEInt ) ) otherlv_2= 'add' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNoteAdditionAccess().getBeatKeyword_0());
            		
            // InternalRyml.g:783:3: ( (lv_beatNumber_1_0= ruleEInt ) )
            // InternalRyml.g:784:4: (lv_beatNumber_1_0= ruleEInt )
            {
            // InternalRyml.g:784:4: (lv_beatNumber_1_0= ruleEInt )
            // InternalRyml.g:785:5: lv_beatNumber_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNoteAdditionAccess().getBeatNumberEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_beatNumber_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNoteAdditionRule());
            					}
            					set(
            						current,
            						"beatNumber",
            						lv_beatNumber_1_0,
            						"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getNoteAdditionAccess().getAddKeyword_2());
            		
            // InternalRyml.g:806:3: ( ( ruleEString ) )
            // InternalRyml.g:807:4: ( ruleEString )
            {
            // InternalRyml.g:807:4: ( ruleEString )
            // InternalRyml.g:808:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNoteAdditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNoteAdditionAccess().getNoteNoteCrossReference_3_0());
            				
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
    // $ANTLR end "ruleNoteAddition"


    // $ANTLR start "entryRuleNoteDeletion"
    // InternalRyml.g:826:1: entryRuleNoteDeletion returns [EObject current=null] : iv_ruleNoteDeletion= ruleNoteDeletion EOF ;
    public final EObject entryRuleNoteDeletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoteDeletion = null;


        try {
            // InternalRyml.g:826:53: (iv_ruleNoteDeletion= ruleNoteDeletion EOF )
            // InternalRyml.g:827:2: iv_ruleNoteDeletion= ruleNoteDeletion EOF
            {
             newCompositeNode(grammarAccess.getNoteDeletionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoteDeletion=ruleNoteDeletion();

            state._fsp--;

             current =iv_ruleNoteDeletion; 
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
    // $ANTLR end "entryRuleNoteDeletion"


    // $ANTLR start "ruleNoteDeletion"
    // InternalRyml.g:833:1: ruleNoteDeletion returns [EObject current=null] : (otherlv_0= 'beat' ( (lv_beatNumber_1_0= ruleEInt ) ) otherlv_2= 'delete' ( ( ruleEString ) ) ) ;
    public final EObject ruleNoteDeletion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_beatNumber_1_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:839:2: ( (otherlv_0= 'beat' ( (lv_beatNumber_1_0= ruleEInt ) ) otherlv_2= 'delete' ( ( ruleEString ) ) ) )
            // InternalRyml.g:840:2: (otherlv_0= 'beat' ( (lv_beatNumber_1_0= ruleEInt ) ) otherlv_2= 'delete' ( ( ruleEString ) ) )
            {
            // InternalRyml.g:840:2: (otherlv_0= 'beat' ( (lv_beatNumber_1_0= ruleEInt ) ) otherlv_2= 'delete' ( ( ruleEString ) ) )
            // InternalRyml.g:841:3: otherlv_0= 'beat' ( (lv_beatNumber_1_0= ruleEInt ) ) otherlv_2= 'delete' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNoteDeletionAccess().getBeatKeyword_0());
            		
            // InternalRyml.g:845:3: ( (lv_beatNumber_1_0= ruleEInt ) )
            // InternalRyml.g:846:4: (lv_beatNumber_1_0= ruleEInt )
            {
            // InternalRyml.g:846:4: (lv_beatNumber_1_0= ruleEInt )
            // InternalRyml.g:847:5: lv_beatNumber_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNoteDeletionAccess().getBeatNumberEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_beatNumber_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNoteDeletionRule());
            					}
            					set(
            						current,
            						"beatNumber",
            						lv_beatNumber_1_0,
            						"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getNoteDeletionAccess().getDeleteKeyword_2());
            		
            // InternalRyml.g:868:3: ( ( ruleEString ) )
            // InternalRyml.g:869:4: ( ruleEString )
            {
            // InternalRyml.g:869:4: ( ruleEString )
            // InternalRyml.g:870:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNoteDeletionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNoteDeletionAccess().getNoteNoteCrossReference_3_0());
            				
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
    // $ANTLR end "ruleNoteDeletion"


    // $ANTLR start "entryRuleNoteReplacement"
    // InternalRyml.g:888:1: entryRuleNoteReplacement returns [EObject current=null] : iv_ruleNoteReplacement= ruleNoteReplacement EOF ;
    public final EObject entryRuleNoteReplacement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoteReplacement = null;


        try {
            // InternalRyml.g:888:56: (iv_ruleNoteReplacement= ruleNoteReplacement EOF )
            // InternalRyml.g:889:2: iv_ruleNoteReplacement= ruleNoteReplacement EOF
            {
             newCompositeNode(grammarAccess.getNoteReplacementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoteReplacement=ruleNoteReplacement();

            state._fsp--;

             current =iv_ruleNoteReplacement; 
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
    // $ANTLR end "entryRuleNoteReplacement"


    // $ANTLR start "ruleNoteReplacement"
    // InternalRyml.g:895:1: ruleNoteReplacement returns [EObject current=null] : (otherlv_0= 'beat' ( (lv_beatNumber_1_0= ruleEInt ) ) otherlv_2= 'replace' ( ( ruleEString ) ) otherlv_4= 'by' ( ( ruleEString ) ) ) ;
    public final EObject ruleNoteReplacement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_beatNumber_1_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:901:2: ( (otherlv_0= 'beat' ( (lv_beatNumber_1_0= ruleEInt ) ) otherlv_2= 'replace' ( ( ruleEString ) ) otherlv_4= 'by' ( ( ruleEString ) ) ) )
            // InternalRyml.g:902:2: (otherlv_0= 'beat' ( (lv_beatNumber_1_0= ruleEInt ) ) otherlv_2= 'replace' ( ( ruleEString ) ) otherlv_4= 'by' ( ( ruleEString ) ) )
            {
            // InternalRyml.g:902:2: (otherlv_0= 'beat' ( (lv_beatNumber_1_0= ruleEInt ) ) otherlv_2= 'replace' ( ( ruleEString ) ) otherlv_4= 'by' ( ( ruleEString ) ) )
            // InternalRyml.g:903:3: otherlv_0= 'beat' ( (lv_beatNumber_1_0= ruleEInt ) ) otherlv_2= 'replace' ( ( ruleEString ) ) otherlv_4= 'by' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNoteReplacementAccess().getBeatKeyword_0());
            		
            // InternalRyml.g:907:3: ( (lv_beatNumber_1_0= ruleEInt ) )
            // InternalRyml.g:908:4: (lv_beatNumber_1_0= ruleEInt )
            {
            // InternalRyml.g:908:4: (lv_beatNumber_1_0= ruleEInt )
            // InternalRyml.g:909:5: lv_beatNumber_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNoteReplacementAccess().getBeatNumberEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_beatNumber_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNoteReplacementRule());
            					}
            					set(
            						current,
            						"beatNumber",
            						lv_beatNumber_1_0,
            						"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getNoteReplacementAccess().getReplaceKeyword_2());
            		
            // InternalRyml.g:930:3: ( ( ruleEString ) )
            // InternalRyml.g:931:4: ( ruleEString )
            {
            // InternalRyml.g:931:4: ( ruleEString )
            // InternalRyml.g:932:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNoteReplacementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNoteReplacementAccess().getNoteSrcNoteCrossReference_3_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getNoteReplacementAccess().getByKeyword_4());
            		
            // InternalRyml.g:950:3: ( ( ruleEString ) )
            // InternalRyml.g:951:4: ( ruleEString )
            {
            // InternalRyml.g:951:4: ( ruleEString )
            // InternalRyml.g:952:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNoteReplacementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNoteReplacementAccess().getNewNoteNoteCrossReference_5_0());
            				
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
    // $ANTLR end "ruleNoteReplacement"


    // $ANTLR start "entryRuleBar"
    // InternalRyml.g:970:1: entryRuleBar returns [EObject current=null] : iv_ruleBar= ruleBar EOF ;
    public final EObject entryRuleBar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBar = null;


        try {
            // InternalRyml.g:970:44: (iv_ruleBar= ruleBar EOF )
            // InternalRyml.g:971:2: iv_ruleBar= ruleBar EOF
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
    // InternalRyml.g:977:1: ruleBar returns [EObject current=null] : (this_ClassicalBar_0= ruleClassicalBar | this_ModifiedBar_1= ruleModifiedBar ) ;
    public final EObject ruleBar() throws RecognitionException {
        EObject current = null;

        EObject this_ClassicalBar_0 = null;

        EObject this_ModifiedBar_1 = null;



        	enterRule();

        try {
            // InternalRyml.g:983:2: ( (this_ClassicalBar_0= ruleClassicalBar | this_ModifiedBar_1= ruleModifiedBar ) )
            // InternalRyml.g:984:2: (this_ClassicalBar_0= ruleClassicalBar | this_ModifiedBar_1= ruleModifiedBar )
            {
            // InternalRyml.g:984:2: (this_ClassicalBar_0= ruleClassicalBar | this_ModifiedBar_1= ruleModifiedBar )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RULE_STRING) ) {
                    int LA21_2 = input.LA(3);

                    if ( (LA21_2==28) ) {
                        alt21=2;
                    }
                    else if ( (LA21_2==12) ) {
                        alt21=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA21_1==RULE_ID) ) {
                    int LA21_3 = input.LA(3);

                    if ( (LA21_3==12) ) {
                        alt21=1;
                    }
                    else if ( (LA21_3==28) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalRyml.g:985:3: this_ClassicalBar_0= ruleClassicalBar
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
                    // InternalRyml.g:994:3: this_ModifiedBar_1= ruleModifiedBar
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
    // InternalRyml.g:1006:1: entryRuleClassicalBar returns [EObject current=null] : iv_ruleClassicalBar= ruleClassicalBar EOF ;
    public final EObject entryRuleClassicalBar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassicalBar = null;


        try {
            // InternalRyml.g:1006:53: (iv_ruleClassicalBar= ruleClassicalBar EOF )
            // InternalRyml.g:1007:2: iv_ruleClassicalBar= ruleClassicalBar EOF
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
    // InternalRyml.g:1013:1: ruleClassicalBar returns [EObject current=null] : ( () otherlv_1= 'Bar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) (otherlv_5= '|' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleClassicalBar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:1019:2: ( ( () otherlv_1= 'Bar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) (otherlv_5= '|' ( ( ruleEString ) ) )* ) )
            // InternalRyml.g:1020:2: ( () otherlv_1= 'Bar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) (otherlv_5= '|' ( ( ruleEString ) ) )* )
            {
            // InternalRyml.g:1020:2: ( () otherlv_1= 'Bar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) (otherlv_5= '|' ( ( ruleEString ) ) )* )
            // InternalRyml.g:1021:3: () otherlv_1= 'Bar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) (otherlv_5= '|' ( ( ruleEString ) ) )*
            {
            // InternalRyml.g:1021:3: ()
            // InternalRyml.g:1022:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassicalBarAccess().getClassicalBarAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassicalBarAccess().getBarKeyword_1());
            		
            // InternalRyml.g:1032:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRyml.g:1033:4: (lv_name_2_0= ruleEString )
            {
            // InternalRyml.g:1033:4: (lv_name_2_0= ruleEString )
            // InternalRyml.g:1034:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassicalBarAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassicalBarRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.dsl.rythmml.Ryml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getClassicalBarAccess().getColonKeyword_3());
            		
            // InternalRyml.g:1055:3: ( ( ruleEString ) )
            // InternalRyml.g:1056:4: ( ruleEString )
            {
            // InternalRyml.g:1056:4: ( ruleEString )
            // InternalRyml.g:1057:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassicalBarRule());
            					}
            				

            					newCompositeNode(grammarAccess.getClassicalBarAccess().getBeatsBeatCrossReference_4_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRyml.g:1071:3: (otherlv_5= '|' ( ( ruleEString ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==18) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRyml.g:1072:4: otherlv_5= '|' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getClassicalBarAccess().getVerticalLineKeyword_5_0());
            	    			
            	    // InternalRyml.g:1076:4: ( ( ruleEString ) )
            	    // InternalRyml.g:1077:5: ( ruleEString )
            	    {
            	    // InternalRyml.g:1077:5: ( ruleEString )
            	    // InternalRyml.g:1078:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getClassicalBarRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getClassicalBarAccess().getBeatsBeatCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalRyml.g:1097:1: entryRuleModifiedBar returns [EObject current=null] : iv_ruleModifiedBar= ruleModifiedBar EOF ;
    public final EObject entryRuleModifiedBar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifiedBar = null;


        try {
            // InternalRyml.g:1097:52: (iv_ruleModifiedBar= ruleModifiedBar EOF )
            // InternalRyml.g:1098:2: iv_ruleModifiedBar= ruleModifiedBar EOF
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
    // InternalRyml.g:1104:1: ruleModifiedBar returns [EObject current=null] : ( () otherlv_1= 'Bar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'based on' ( ( ruleEString ) ) otherlv_5= 'Modifications:' otherlv_6= '-' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= '-' ( (lv_operations_9_0= ruleOperation ) ) )* ) ;
    public final EObject ruleModifiedBar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_operations_7_0 = null;

        EObject lv_operations_9_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:1110:2: ( ( () otherlv_1= 'Bar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'based on' ( ( ruleEString ) ) otherlv_5= 'Modifications:' otherlv_6= '-' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= '-' ( (lv_operations_9_0= ruleOperation ) ) )* ) )
            // InternalRyml.g:1111:2: ( () otherlv_1= 'Bar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'based on' ( ( ruleEString ) ) otherlv_5= 'Modifications:' otherlv_6= '-' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= '-' ( (lv_operations_9_0= ruleOperation ) ) )* )
            {
            // InternalRyml.g:1111:2: ( () otherlv_1= 'Bar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'based on' ( ( ruleEString ) ) otherlv_5= 'Modifications:' otherlv_6= '-' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= '-' ( (lv_operations_9_0= ruleOperation ) ) )* )
            // InternalRyml.g:1112:3: () otherlv_1= 'Bar' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'based on' ( ( ruleEString ) ) otherlv_5= 'Modifications:' otherlv_6= '-' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= '-' ( (lv_operations_9_0= ruleOperation ) ) )*
            {
            // InternalRyml.g:1112:3: ()
            // InternalRyml.g:1113:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModifiedBarAccess().getModifiedBarAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModifiedBarAccess().getBarKeyword_1());
            		
            // InternalRyml.g:1123:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRyml.g:1124:4: (lv_name_2_0= ruleEString )
            {
            // InternalRyml.g:1124:4: (lv_name_2_0= ruleEString )
            // InternalRyml.g:1125:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModifiedBarAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifiedBarRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.dsl.rythmml.Ryml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getModifiedBarAccess().getBasedOnKeyword_3());
            		
            // InternalRyml.g:1146:3: ( ( ruleEString ) )
            // InternalRyml.g:1147:4: ( ruleEString )
            {
            // InternalRyml.g:1147:4: ( ruleEString )
            // InternalRyml.g:1148:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModifiedBarRule());
            					}
            				

            					newCompositeNode(grammarAccess.getModifiedBarAccess().getBarBarCrossReference_4_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getModifiedBarAccess().getModificationsKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getModifiedBarAccess().getHyphenMinusKeyword_6());
            		
            // InternalRyml.g:1170:3: ( (lv_operations_7_0= ruleOperation ) )
            // InternalRyml.g:1171:4: (lv_operations_7_0= ruleOperation )
            {
            // InternalRyml.g:1171:4: (lv_operations_7_0= ruleOperation )
            // InternalRyml.g:1172:5: lv_operations_7_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getModifiedBarAccess().getOperationsOperationParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_26);
            lv_operations_7_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifiedBarRule());
            					}
            					add(
            						current,
            						"operations",
            						lv_operations_7_0,
            						"fr.unice.polytech.dsl.rythmml.Ryml.Operation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRyml.g:1189:3: (otherlv_8= '-' ( (lv_operations_9_0= ruleOperation ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==19) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRyml.g:1190:4: otherlv_8= '-' ( (lv_operations_9_0= ruleOperation ) )
            	    {
            	    otherlv_8=(Token)match(input,19,FOLLOW_25); 

            	    				newLeafNode(otherlv_8, grammarAccess.getModifiedBarAccess().getHyphenMinusKeyword_8_0());
            	    			
            	    // InternalRyml.g:1194:4: ( (lv_operations_9_0= ruleOperation ) )
            	    // InternalRyml.g:1195:5: (lv_operations_9_0= ruleOperation )
            	    {
            	    // InternalRyml.g:1195:5: (lv_operations_9_0= ruleOperation )
            	    // InternalRyml.g:1196:6: lv_operations_9_0= ruleOperation
            	    {

            	    						newCompositeNode(grammarAccess.getModifiedBarAccess().getOperationsOperationParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_operations_9_0=ruleOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModifiedBarRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operations",
            	    							lv_operations_9_0,
            	    							"fr.unice.polytech.dsl.rythmml.Ryml.Operation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleModifiedBar"


    // $ANTLR start "entryRuleBeat"
    // InternalRyml.g:1218:1: entryRuleBeat returns [EObject current=null] : iv_ruleBeat= ruleBeat EOF ;
    public final EObject entryRuleBeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeat = null;


        try {
            // InternalRyml.g:1218:45: (iv_ruleBeat= ruleBeat EOF )
            // InternalRyml.g:1219:2: iv_ruleBeat= ruleBeat EOF
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
    // InternalRyml.g:1225:1: ruleBeat returns [EObject current=null] : (otherlv_0= 'Beat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'Nb of ticks :' ( (lv_totalDivNumber_4_0= ruleEInt ) ) )? ( ( ruleEString ) ) otherlv_6= ',' ( (lv_notePositions_7_0= ruleEInt ) ) (otherlv_8= '|' ( ( ruleEString ) ) otherlv_10= ',' ( (lv_notePositions_11_0= ruleEInt ) ) )* ) ;
    public final EObject ruleBeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_totalDivNumber_4_0 = null;

        AntlrDatatypeRuleToken lv_notePositions_7_0 = null;

        AntlrDatatypeRuleToken lv_notePositions_11_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:1231:2: ( (otherlv_0= 'Beat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'Nb of ticks :' ( (lv_totalDivNumber_4_0= ruleEInt ) ) )? ( ( ruleEString ) ) otherlv_6= ',' ( (lv_notePositions_7_0= ruleEInt ) ) (otherlv_8= '|' ( ( ruleEString ) ) otherlv_10= ',' ( (lv_notePositions_11_0= ruleEInt ) ) )* ) )
            // InternalRyml.g:1232:2: (otherlv_0= 'Beat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'Nb of ticks :' ( (lv_totalDivNumber_4_0= ruleEInt ) ) )? ( ( ruleEString ) ) otherlv_6= ',' ( (lv_notePositions_7_0= ruleEInt ) ) (otherlv_8= '|' ( ( ruleEString ) ) otherlv_10= ',' ( (lv_notePositions_11_0= ruleEInt ) ) )* )
            {
            // InternalRyml.g:1232:2: (otherlv_0= 'Beat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'Nb of ticks :' ( (lv_totalDivNumber_4_0= ruleEInt ) ) )? ( ( ruleEString ) ) otherlv_6= ',' ( (lv_notePositions_7_0= ruleEInt ) ) (otherlv_8= '|' ( ( ruleEString ) ) otherlv_10= ',' ( (lv_notePositions_11_0= ruleEInt ) ) )* )
            // InternalRyml.g:1233:3: otherlv_0= 'Beat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' (otherlv_3= 'Nb of ticks :' ( (lv_totalDivNumber_4_0= ruleEInt ) ) )? ( ( ruleEString ) ) otherlv_6= ',' ( (lv_notePositions_7_0= ruleEInt ) ) (otherlv_8= '|' ( ( ruleEString ) ) otherlv_10= ',' ( (lv_notePositions_11_0= ruleEInt ) ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBeatAccess().getBeatKeyword_0());
            		
            // InternalRyml.g:1237:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRyml.g:1238:4: (lv_name_1_0= ruleEString )
            {
            // InternalRyml.g:1238:4: (lv_name_1_0= ruleEString )
            // InternalRyml.g:1239:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getBeatAccess().getColonKeyword_2());
            		
            // InternalRyml.g:1260:3: (otherlv_3= 'Nb of ticks :' ( (lv_totalDivNumber_4_0= ruleEInt ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRyml.g:1261:4: otherlv_3= 'Nb of ticks :' ( (lv_totalDivNumber_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getBeatAccess().getNbOfTicksKeyword_3_0());
                    			
                    // InternalRyml.g:1265:4: ( (lv_totalDivNumber_4_0= ruleEInt ) )
                    // InternalRyml.g:1266:5: (lv_totalDivNumber_4_0= ruleEInt )
                    {
                    // InternalRyml.g:1266:5: (lv_totalDivNumber_4_0= ruleEInt )
                    // InternalRyml.g:1267:6: lv_totalDivNumber_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBeatAccess().getTotalDivNumberEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_3);
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

            // InternalRyml.g:1285:3: ( ( ruleEString ) )
            // InternalRyml.g:1286:4: ( ruleEString )
            {
            // InternalRyml.g:1286:4: ( ruleEString )
            // InternalRyml.g:1287:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBeatRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBeatAccess().getNotesNoteCrossReference_4_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getBeatAccess().getCommaKeyword_5());
            		
            // InternalRyml.g:1305:3: ( (lv_notePositions_7_0= ruleEInt ) )
            // InternalRyml.g:1306:4: (lv_notePositions_7_0= ruleEInt )
            {
            // InternalRyml.g:1306:4: (lv_notePositions_7_0= ruleEInt )
            // InternalRyml.g:1307:5: lv_notePositions_7_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBeatAccess().getNotePositionsEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
            lv_notePositions_7_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBeatRule());
            					}
            					add(
            						current,
            						"notePositions",
            						lv_notePositions_7_0,
            						"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRyml.g:1324:3: (otherlv_8= '|' ( ( ruleEString ) ) otherlv_10= ',' ( (lv_notePositions_11_0= ruleEInt ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==18) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRyml.g:1325:4: otherlv_8= '|' ( ( ruleEString ) ) otherlv_10= ',' ( (lv_notePositions_11_0= ruleEInt ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getBeatAccess().getVerticalLineKeyword_7_0());
            	    			
            	    // InternalRyml.g:1329:4: ( ( ruleEString ) )
            	    // InternalRyml.g:1330:5: ( ruleEString )
            	    {
            	    // InternalRyml.g:1330:5: ( ruleEString )
            	    // InternalRyml.g:1331:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBeatRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getBeatAccess().getNotesNoteCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_10=(Token)match(input,32,FOLLOW_8); 

            	    				newLeafNode(otherlv_10, grammarAccess.getBeatAccess().getCommaKeyword_7_2());
            	    			
            	    // InternalRyml.g:1349:4: ( (lv_notePositions_11_0= ruleEInt ) )
            	    // InternalRyml.g:1350:5: (lv_notePositions_11_0= ruleEInt )
            	    {
            	    // InternalRyml.g:1350:5: (lv_notePositions_11_0= ruleEInt )
            	    // InternalRyml.g:1351:6: lv_notePositions_11_0= ruleEInt
            	    {

            	    						newCompositeNode(grammarAccess.getBeatAccess().getNotePositionsEIntParserRuleCall_7_3_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_notePositions_11_0=ruleEInt();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBeatRule());
            	    						}
            	    						add(
            	    							current,
            	    							"notePositions",
            	    							lv_notePositions_11_0,
            	    							"fr.unice.polytech.dsl.rythmml.Ryml.EInt");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalRyml.g:1373:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // InternalRyml.g:1373:45: (iv_ruleNote= ruleNote EOF )
            // InternalRyml.g:1374:2: iv_ruleNote= ruleNote EOF
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
    // InternalRyml.g:1380:1: ruleNote returns [EObject current=null] : ( () otherlv_1= 'Note' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_value_4_0= ruleDrumNoteValue ) )? ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRyml.g:1386:2: ( ( () otherlv_1= 'Note' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_value_4_0= ruleDrumNoteValue ) )? ) )
            // InternalRyml.g:1387:2: ( () otherlv_1= 'Note' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_value_4_0= ruleDrumNoteValue ) )? )
            {
            // InternalRyml.g:1387:2: ( () otherlv_1= 'Note' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_value_4_0= ruleDrumNoteValue ) )? )
            // InternalRyml.g:1388:3: () otherlv_1= 'Note' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_value_4_0= ruleDrumNoteValue ) )?
            {
            // InternalRyml.g:1388:3: ()
            // InternalRyml.g:1389:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNoteAccess().getNoteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNoteAccess().getNoteKeyword_1());
            		
            // InternalRyml.g:1399:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRyml.g:1400:4: (lv_name_2_0= ruleEString )
            {
            // InternalRyml.g:1400:4: (lv_name_2_0= ruleEString )
            // InternalRyml.g:1401:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNoteAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNoteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.dsl.rythmml.Ryml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getNoteAccess().getColonKeyword_3());
            		
            // InternalRyml.g:1422:3: ( (lv_value_4_0= ruleDrumNoteValue ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=34 && LA26_0<=44)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRyml.g:1423:4: (lv_value_4_0= ruleDrumNoteValue )
                    {
                    // InternalRyml.g:1423:4: (lv_value_4_0= ruleDrumNoteValue )
                    // InternalRyml.g:1424:5: lv_value_4_0= ruleDrumNoteValue
                    {

                    					newCompositeNode(grammarAccess.getNoteAccess().getValueDrumNoteValueEnumRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleDrumNoteValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNoteRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_4_0,
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
    // InternalRyml.g:1445:1: ruleDrumNoteValue returns [Enumerator current=null] : ( (enumLiteral_0= 'SD' ) | (enumLiteral_1= 'BD' ) | (enumLiteral_2= 'CH' ) | (enumLiteral_3= 'OH' ) | (enumLiteral_4= 'CC' ) | (enumLiteral_5= 'RC' ) | (enumLiteral_6= 'TM' ) | (enumLiteral_7= 'TO' ) | (enumLiteral_8= 'S' ) | (enumLiteral_9= 'WS' ) | (enumLiteral_10= 'L' ) ) ;
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
            // InternalRyml.g:1451:2: ( ( (enumLiteral_0= 'SD' ) | (enumLiteral_1= 'BD' ) | (enumLiteral_2= 'CH' ) | (enumLiteral_3= 'OH' ) | (enumLiteral_4= 'CC' ) | (enumLiteral_5= 'RC' ) | (enumLiteral_6= 'TM' ) | (enumLiteral_7= 'TO' ) | (enumLiteral_8= 'S' ) | (enumLiteral_9= 'WS' ) | (enumLiteral_10= 'L' ) ) )
            // InternalRyml.g:1452:2: ( (enumLiteral_0= 'SD' ) | (enumLiteral_1= 'BD' ) | (enumLiteral_2= 'CH' ) | (enumLiteral_3= 'OH' ) | (enumLiteral_4= 'CC' ) | (enumLiteral_5= 'RC' ) | (enumLiteral_6= 'TM' ) | (enumLiteral_7= 'TO' ) | (enumLiteral_8= 'S' ) | (enumLiteral_9= 'WS' ) | (enumLiteral_10= 'L' ) )
            {
            // InternalRyml.g:1452:2: ( (enumLiteral_0= 'SD' ) | (enumLiteral_1= 'BD' ) | (enumLiteral_2= 'CH' ) | (enumLiteral_3= 'OH' ) | (enumLiteral_4= 'CC' ) | (enumLiteral_5= 'RC' ) | (enumLiteral_6= 'TM' ) | (enumLiteral_7= 'TO' ) | (enumLiteral_8= 'S' ) | (enumLiteral_9= 'WS' ) | (enumLiteral_10= 'L' ) )
            int alt27=11;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt27=1;
                }
                break;
            case 35:
                {
                alt27=2;
                }
                break;
            case 36:
                {
                alt27=3;
                }
                break;
            case 37:
                {
                alt27=4;
                }
                break;
            case 38:
                {
                alt27=5;
                }
                break;
            case 39:
                {
                alt27=6;
                }
                break;
            case 40:
                {
                alt27=7;
                }
                break;
            case 41:
                {
                alt27=8;
                }
                break;
            case 42:
                {
                alt27=9;
                }
                break;
            case 43:
                {
                alt27=10;
                }
                break;
            case 44:
                {
                alt27=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalRyml.g:1453:3: (enumLiteral_0= 'SD' )
                    {
                    // InternalRyml.g:1453:3: (enumLiteral_0= 'SD' )
                    // InternalRyml.g:1454:4: enumLiteral_0= 'SD'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getSDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDrumNoteValueAccess().getSDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRyml.g:1461:3: (enumLiteral_1= 'BD' )
                    {
                    // InternalRyml.g:1461:3: (enumLiteral_1= 'BD' )
                    // InternalRyml.g:1462:4: enumLiteral_1= 'BD'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getBDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDrumNoteValueAccess().getBDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRyml.g:1469:3: (enumLiteral_2= 'CH' )
                    {
                    // InternalRyml.g:1469:3: (enumLiteral_2= 'CH' )
                    // InternalRyml.g:1470:4: enumLiteral_2= 'CH'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getCHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDrumNoteValueAccess().getCHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRyml.g:1477:3: (enumLiteral_3= 'OH' )
                    {
                    // InternalRyml.g:1477:3: (enumLiteral_3= 'OH' )
                    // InternalRyml.g:1478:4: enumLiteral_3= 'OH'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getOHEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDrumNoteValueAccess().getOHEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRyml.g:1485:3: (enumLiteral_4= 'CC' )
                    {
                    // InternalRyml.g:1485:3: (enumLiteral_4= 'CC' )
                    // InternalRyml.g:1486:4: enumLiteral_4= 'CC'
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getCCEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDrumNoteValueAccess().getCCEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRyml.g:1493:3: (enumLiteral_5= 'RC' )
                    {
                    // InternalRyml.g:1493:3: (enumLiteral_5= 'RC' )
                    // InternalRyml.g:1494:4: enumLiteral_5= 'RC'
                    {
                    enumLiteral_5=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getRCEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDrumNoteValueAccess().getRCEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRyml.g:1501:3: (enumLiteral_6= 'TM' )
                    {
                    // InternalRyml.g:1501:3: (enumLiteral_6= 'TM' )
                    // InternalRyml.g:1502:4: enumLiteral_6= 'TM'
                    {
                    enumLiteral_6=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getTMEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDrumNoteValueAccess().getTMEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRyml.g:1509:3: (enumLiteral_7= 'TO' )
                    {
                    // InternalRyml.g:1509:3: (enumLiteral_7= 'TO' )
                    // InternalRyml.g:1510:4: enumLiteral_7= 'TO'
                    {
                    enumLiteral_7=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getTOEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDrumNoteValueAccess().getTOEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRyml.g:1517:3: (enumLiteral_8= 'S' )
                    {
                    // InternalRyml.g:1517:3: (enumLiteral_8= 'S' )
                    // InternalRyml.g:1518:4: enumLiteral_8= 'S'
                    {
                    enumLiteral_8=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getSEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDrumNoteValueAccess().getSEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalRyml.g:1525:3: (enumLiteral_9= 'WS' )
                    {
                    // InternalRyml.g:1525:3: (enumLiteral_9= 'WS' )
                    // InternalRyml.g:1526:4: enumLiteral_9= 'WS'
                    {
                    enumLiteral_9=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDrumNoteValueAccess().getWSEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getDrumNoteValueAccess().getWSEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalRyml.g:1533:3: (enumLiteral_10= 'L' )
                    {
                    // InternalRyml.g:1533:3: (enumLiteral_10= 'L' )
                    // InternalRyml.g:1534:4: enumLiteral_10= 'L'
                    {
                    enumLiteral_10=(Token)match(input,44,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000024813E002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000024813C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000248138002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000248130002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000248120002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000048120002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008120002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000120002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00001FFC00000002L});

}