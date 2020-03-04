package fr.unice.polytech.dsl.rythmml.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.unice.polytech.dsl.rythmml.services.RymlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRymlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SD'", "'BD'", "'CH'", "'OH'", "'CC'", "'RC'", "'TM'", "'TO'", "'S'", "'WS'", "'L'", "'Music'", "':'", "'title :'", "'author :'", "'bpm :'", "'resolution per beats : '", "'Section'", "'|'", "'-'", "'Pattern'", "'Bar'", "'Beat'", "'Notes :'", "','", "'Nb of ticks : '", "'Note'"
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

    	public void setGrammarAccess(RymlGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMusic"
    // InternalRyml.g:53:1: entryRuleMusic : ruleMusic EOF ;
    public final void entryRuleMusic() throws RecognitionException {
        try {
            // InternalRyml.g:54:1: ( ruleMusic EOF )
            // InternalRyml.g:55:1: ruleMusic EOF
            {
             before(grammarAccess.getMusicRule()); 
            pushFollow(FOLLOW_1);
            ruleMusic();

            state._fsp--;

             after(grammarAccess.getMusicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMusic"


    // $ANTLR start "ruleMusic"
    // InternalRyml.g:62:1: ruleMusic : ( ( rule__Music__UnorderedGroup ) ) ;
    public final void ruleMusic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:66:2: ( ( ( rule__Music__UnorderedGroup ) ) )
            // InternalRyml.g:67:2: ( ( rule__Music__UnorderedGroup ) )
            {
            // InternalRyml.g:67:2: ( ( rule__Music__UnorderedGroup ) )
            // InternalRyml.g:68:3: ( rule__Music__UnorderedGroup )
            {
             before(grammarAccess.getMusicAccess().getUnorderedGroup()); 
            // InternalRyml.g:69:3: ( rule__Music__UnorderedGroup )
            // InternalRyml.g:69:4: rule__Music__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Music__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMusic"


    // $ANTLR start "entryRuleEString"
    // InternalRyml.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRyml.g:79:1: ( ruleEString EOF )
            // InternalRyml.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRyml.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRyml.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRyml.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalRyml.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalRyml.g:94:3: ( rule__EString__Alternatives )
            // InternalRyml.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSection"
    // InternalRyml.g:103:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalRyml.g:104:1: ( ruleSection EOF )
            // InternalRyml.g:105:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalRyml.g:112:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:116:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalRyml.g:117:2: ( ( rule__Section__Group__0 ) )
            {
            // InternalRyml.g:117:2: ( ( rule__Section__Group__0 ) )
            // InternalRyml.g:118:3: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // InternalRyml.g:119:3: ( rule__Section__Group__0 )
            // InternalRyml.g:119:4: rule__Section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleEInt"
    // InternalRyml.g:128:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalRyml.g:129:1: ( ruleEInt EOF )
            // InternalRyml.g:130:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalRyml.g:137:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:141:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalRyml.g:142:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalRyml.g:142:2: ( ( rule__EInt__Group__0 ) )
            // InternalRyml.g:143:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalRyml.g:144:3: ( rule__EInt__Group__0 )
            // InternalRyml.g:144:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRulePattern"
    // InternalRyml.g:153:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalRyml.g:154:1: ( rulePattern EOF )
            // InternalRyml.g:155:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalRyml.g:162:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:166:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalRyml.g:167:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalRyml.g:167:2: ( ( rule__Pattern__Group__0 ) )
            // InternalRyml.g:168:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalRyml.g:169:3: ( rule__Pattern__Group__0 )
            // InternalRyml.g:169:4: rule__Pattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleBar"
    // InternalRyml.g:178:1: entryRuleBar : ruleBar EOF ;
    public final void entryRuleBar() throws RecognitionException {
        try {
            // InternalRyml.g:179:1: ( ruleBar EOF )
            // InternalRyml.g:180:1: ruleBar EOF
            {
             before(grammarAccess.getBarRule()); 
            pushFollow(FOLLOW_1);
            ruleBar();

            state._fsp--;

             after(grammarAccess.getBarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBar"


    // $ANTLR start "ruleBar"
    // InternalRyml.g:187:1: ruleBar : ( ( rule__Bar__Group__0 ) ) ;
    public final void ruleBar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:191:2: ( ( ( rule__Bar__Group__0 ) ) )
            // InternalRyml.g:192:2: ( ( rule__Bar__Group__0 ) )
            {
            // InternalRyml.g:192:2: ( ( rule__Bar__Group__0 ) )
            // InternalRyml.g:193:3: ( rule__Bar__Group__0 )
            {
             before(grammarAccess.getBarAccess().getGroup()); 
            // InternalRyml.g:194:3: ( rule__Bar__Group__0 )
            // InternalRyml.g:194:4: rule__Bar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBar"


    // $ANTLR start "entryRuleBeat"
    // InternalRyml.g:203:1: entryRuleBeat : ruleBeat EOF ;
    public final void entryRuleBeat() throws RecognitionException {
        try {
            // InternalRyml.g:204:1: ( ruleBeat EOF )
            // InternalRyml.g:205:1: ruleBeat EOF
            {
             before(grammarAccess.getBeatRule()); 
            pushFollow(FOLLOW_1);
            ruleBeat();

            state._fsp--;

             after(grammarAccess.getBeatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBeat"


    // $ANTLR start "ruleBeat"
    // InternalRyml.g:212:1: ruleBeat : ( ( rule__Beat__Group__0 ) ) ;
    public final void ruleBeat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:216:2: ( ( ( rule__Beat__Group__0 ) ) )
            // InternalRyml.g:217:2: ( ( rule__Beat__Group__0 ) )
            {
            // InternalRyml.g:217:2: ( ( rule__Beat__Group__0 ) )
            // InternalRyml.g:218:3: ( rule__Beat__Group__0 )
            {
             before(grammarAccess.getBeatAccess().getGroup()); 
            // InternalRyml.g:219:3: ( rule__Beat__Group__0 )
            // InternalRyml.g:219:4: rule__Beat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Beat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBeatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBeat"


    // $ANTLR start "entryRuleNote"
    // InternalRyml.g:228:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // InternalRyml.g:229:1: ( ruleNote EOF )
            // InternalRyml.g:230:1: ruleNote EOF
            {
             before(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_1);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getNoteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // InternalRyml.g:237:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:241:2: ( ( ( rule__Note__Group__0 ) ) )
            // InternalRyml.g:242:2: ( ( rule__Note__Group__0 ) )
            {
            // InternalRyml.g:242:2: ( ( rule__Note__Group__0 ) )
            // InternalRyml.g:243:3: ( rule__Note__Group__0 )
            {
             before(grammarAccess.getNoteAccess().getGroup()); 
            // InternalRyml.g:244:3: ( rule__Note__Group__0 )
            // InternalRyml.g:244:4: rule__Note__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNote"


    // $ANTLR start "ruleDrumNoteValue"
    // InternalRyml.g:253:1: ruleDrumNoteValue : ( ( rule__DrumNoteValue__Alternatives ) ) ;
    public final void ruleDrumNoteValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:257:1: ( ( ( rule__DrumNoteValue__Alternatives ) ) )
            // InternalRyml.g:258:2: ( ( rule__DrumNoteValue__Alternatives ) )
            {
            // InternalRyml.g:258:2: ( ( rule__DrumNoteValue__Alternatives ) )
            // InternalRyml.g:259:3: ( rule__DrumNoteValue__Alternatives )
            {
             before(grammarAccess.getDrumNoteValueAccess().getAlternatives()); 
            // InternalRyml.g:260:3: ( rule__DrumNoteValue__Alternatives )
            // InternalRyml.g:260:4: rule__DrumNoteValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DrumNoteValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDrumNoteValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDrumNoteValue"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalRyml.g:268:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:272:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRyml.g:273:2: ( RULE_STRING )
                    {
                    // InternalRyml.g:273:2: ( RULE_STRING )
                    // InternalRyml.g:274:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRyml.g:279:2: ( RULE_ID )
                    {
                    // InternalRyml.g:279:2: ( RULE_ID )
                    // InternalRyml.g:280:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__DrumNoteValue__Alternatives"
    // InternalRyml.g:289:1: rule__DrumNoteValue__Alternatives : ( ( ( 'SD' ) ) | ( ( 'BD' ) ) | ( ( 'CH' ) ) | ( ( 'OH' ) ) | ( ( 'CC' ) ) | ( ( 'RC' ) ) | ( ( 'TM' ) ) | ( ( 'TO' ) ) | ( ( 'S' ) ) | ( ( 'WS' ) ) | ( ( 'L' ) ) );
    public final void rule__DrumNoteValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:293:1: ( ( ( 'SD' ) ) | ( ( 'BD' ) ) | ( ( 'CH' ) ) | ( ( 'OH' ) ) | ( ( 'CC' ) ) | ( ( 'RC' ) ) | ( ( 'TM' ) ) | ( ( 'TO' ) ) | ( ( 'S' ) ) | ( ( 'WS' ) ) | ( ( 'L' ) ) )
            int alt2=11;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            case 19:
                {
                alt2=9;
                }
                break;
            case 20:
                {
                alt2=10;
                }
                break;
            case 21:
                {
                alt2=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRyml.g:294:2: ( ( 'SD' ) )
                    {
                    // InternalRyml.g:294:2: ( ( 'SD' ) )
                    // InternalRyml.g:295:3: ( 'SD' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getSDEnumLiteralDeclaration_0()); 
                    // InternalRyml.g:296:3: ( 'SD' )
                    // InternalRyml.g:296:4: 'SD'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getSDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRyml.g:300:2: ( ( 'BD' ) )
                    {
                    // InternalRyml.g:300:2: ( ( 'BD' ) )
                    // InternalRyml.g:301:3: ( 'BD' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getBDEnumLiteralDeclaration_1()); 
                    // InternalRyml.g:302:3: ( 'BD' )
                    // InternalRyml.g:302:4: 'BD'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getBDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRyml.g:306:2: ( ( 'CH' ) )
                    {
                    // InternalRyml.g:306:2: ( ( 'CH' ) )
                    // InternalRyml.g:307:3: ( 'CH' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getCHEnumLiteralDeclaration_2()); 
                    // InternalRyml.g:308:3: ( 'CH' )
                    // InternalRyml.g:308:4: 'CH'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getCHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRyml.g:312:2: ( ( 'OH' ) )
                    {
                    // InternalRyml.g:312:2: ( ( 'OH' ) )
                    // InternalRyml.g:313:3: ( 'OH' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getOHEnumLiteralDeclaration_3()); 
                    // InternalRyml.g:314:3: ( 'OH' )
                    // InternalRyml.g:314:4: 'OH'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getOHEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRyml.g:318:2: ( ( 'CC' ) )
                    {
                    // InternalRyml.g:318:2: ( ( 'CC' ) )
                    // InternalRyml.g:319:3: ( 'CC' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getCCEnumLiteralDeclaration_4()); 
                    // InternalRyml.g:320:3: ( 'CC' )
                    // InternalRyml.g:320:4: 'CC'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getCCEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRyml.g:324:2: ( ( 'RC' ) )
                    {
                    // InternalRyml.g:324:2: ( ( 'RC' ) )
                    // InternalRyml.g:325:3: ( 'RC' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getRCEnumLiteralDeclaration_5()); 
                    // InternalRyml.g:326:3: ( 'RC' )
                    // InternalRyml.g:326:4: 'RC'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getRCEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRyml.g:330:2: ( ( 'TM' ) )
                    {
                    // InternalRyml.g:330:2: ( ( 'TM' ) )
                    // InternalRyml.g:331:3: ( 'TM' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getTMEnumLiteralDeclaration_6()); 
                    // InternalRyml.g:332:3: ( 'TM' )
                    // InternalRyml.g:332:4: 'TM'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getTMEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRyml.g:336:2: ( ( 'TO' ) )
                    {
                    // InternalRyml.g:336:2: ( ( 'TO' ) )
                    // InternalRyml.g:337:3: ( 'TO' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getTOEnumLiteralDeclaration_7()); 
                    // InternalRyml.g:338:3: ( 'TO' )
                    // InternalRyml.g:338:4: 'TO'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getTOEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRyml.g:342:2: ( ( 'S' ) )
                    {
                    // InternalRyml.g:342:2: ( ( 'S' ) )
                    // InternalRyml.g:343:3: ( 'S' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getSEnumLiteralDeclaration_8()); 
                    // InternalRyml.g:344:3: ( 'S' )
                    // InternalRyml.g:344:4: 'S'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getSEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRyml.g:348:2: ( ( 'WS' ) )
                    {
                    // InternalRyml.g:348:2: ( ( 'WS' ) )
                    // InternalRyml.g:349:3: ( 'WS' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getWSEnumLiteralDeclaration_9()); 
                    // InternalRyml.g:350:3: ( 'WS' )
                    // InternalRyml.g:350:4: 'WS'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getWSEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalRyml.g:354:2: ( ( 'L' ) )
                    {
                    // InternalRyml.g:354:2: ( ( 'L' ) )
                    // InternalRyml.g:355:3: ( 'L' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getLEnumLiteralDeclaration_10()); 
                    // InternalRyml.g:356:3: ( 'L' )
                    // InternalRyml.g:356:4: 'L'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getLEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DrumNoteValue__Alternatives"


    // $ANTLR start "rule__Music__Group_0__0"
    // InternalRyml.g:364:1: rule__Music__Group_0__0 : rule__Music__Group_0__0__Impl rule__Music__Group_0__1 ;
    public final void rule__Music__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:368:1: ( rule__Music__Group_0__0__Impl rule__Music__Group_0__1 )
            // InternalRyml.g:369:2: rule__Music__Group_0__0__Impl rule__Music__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Music__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0__0"


    // $ANTLR start "rule__Music__Group_0__0__Impl"
    // InternalRyml.g:376:1: rule__Music__Group_0__0__Impl : ( 'Music' ) ;
    public final void rule__Music__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:380:1: ( ( 'Music' ) )
            // InternalRyml.g:381:1: ( 'Music' )
            {
            // InternalRyml.g:381:1: ( 'Music' )
            // InternalRyml.g:382:2: 'Music'
            {
             before(grammarAccess.getMusicAccess().getMusicKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getMusicKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0__0__Impl"


    // $ANTLR start "rule__Music__Group_0__1"
    // InternalRyml.g:391:1: rule__Music__Group_0__1 : rule__Music__Group_0__1__Impl rule__Music__Group_0__2 ;
    public final void rule__Music__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:395:1: ( rule__Music__Group_0__1__Impl rule__Music__Group_0__2 )
            // InternalRyml.g:396:2: rule__Music__Group_0__1__Impl rule__Music__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__Music__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0__1"


    // $ANTLR start "rule__Music__Group_0__1__Impl"
    // InternalRyml.g:403:1: rule__Music__Group_0__1__Impl : ( ( rule__Music__NameAssignment_0_1 ) ) ;
    public final void rule__Music__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:407:1: ( ( ( rule__Music__NameAssignment_0_1 ) ) )
            // InternalRyml.g:408:1: ( ( rule__Music__NameAssignment_0_1 ) )
            {
            // InternalRyml.g:408:1: ( ( rule__Music__NameAssignment_0_1 ) )
            // InternalRyml.g:409:2: ( rule__Music__NameAssignment_0_1 )
            {
             before(grammarAccess.getMusicAccess().getNameAssignment_0_1()); 
            // InternalRyml.g:410:2: ( rule__Music__NameAssignment_0_1 )
            // InternalRyml.g:410:3: rule__Music__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Music__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0__1__Impl"


    // $ANTLR start "rule__Music__Group_0__2"
    // InternalRyml.g:418:1: rule__Music__Group_0__2 : rule__Music__Group_0__2__Impl rule__Music__Group_0__3 ;
    public final void rule__Music__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:422:1: ( rule__Music__Group_0__2__Impl rule__Music__Group_0__3 )
            // InternalRyml.g:423:2: rule__Music__Group_0__2__Impl rule__Music__Group_0__3
            {
            pushFollow(FOLLOW_5);
            rule__Music__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0__2"


    // $ANTLR start "rule__Music__Group_0__2__Impl"
    // InternalRyml.g:430:1: rule__Music__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Music__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:434:1: ( ( ':' ) )
            // InternalRyml.g:435:1: ( ':' )
            {
            // InternalRyml.g:435:1: ( ':' )
            // InternalRyml.g:436:2: ':'
            {
             before(grammarAccess.getMusicAccess().getColonKeyword_0_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getColonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0__2__Impl"


    // $ANTLR start "rule__Music__Group_0__3"
    // InternalRyml.g:445:1: rule__Music__Group_0__3 : rule__Music__Group_0__3__Impl rule__Music__Group_0__4 ;
    public final void rule__Music__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:449:1: ( rule__Music__Group_0__3__Impl rule__Music__Group_0__4 )
            // InternalRyml.g:450:2: rule__Music__Group_0__3__Impl rule__Music__Group_0__4
            {
            pushFollow(FOLLOW_5);
            rule__Music__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0__3"


    // $ANTLR start "rule__Music__Group_0__3__Impl"
    // InternalRyml.g:457:1: rule__Music__Group_0__3__Impl : ( ( rule__Music__Group_0_3__0 )? ) ;
    public final void rule__Music__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:461:1: ( ( ( rule__Music__Group_0_3__0 )? ) )
            // InternalRyml.g:462:1: ( ( rule__Music__Group_0_3__0 )? )
            {
            // InternalRyml.g:462:1: ( ( rule__Music__Group_0_3__0 )? )
            // InternalRyml.g:463:2: ( rule__Music__Group_0_3__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_0_3()); 
            // InternalRyml.g:464:2: ( rule__Music__Group_0_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRyml.g:464:3: rule__Music__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMusicAccess().getGroup_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0__3__Impl"


    // $ANTLR start "rule__Music__Group_0__4"
    // InternalRyml.g:472:1: rule__Music__Group_0__4 : rule__Music__Group_0__4__Impl rule__Music__Group_0__5 ;
    public final void rule__Music__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:476:1: ( rule__Music__Group_0__4__Impl rule__Music__Group_0__5 )
            // InternalRyml.g:477:2: rule__Music__Group_0__4__Impl rule__Music__Group_0__5
            {
            pushFollow(FOLLOW_5);
            rule__Music__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0__4"


    // $ANTLR start "rule__Music__Group_0__4__Impl"
    // InternalRyml.g:484:1: rule__Music__Group_0__4__Impl : ( ( rule__Music__Group_0_4__0 )? ) ;
    public final void rule__Music__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:488:1: ( ( ( rule__Music__Group_0_4__0 )? ) )
            // InternalRyml.g:489:1: ( ( rule__Music__Group_0_4__0 )? )
            {
            // InternalRyml.g:489:1: ( ( rule__Music__Group_0_4__0 )? )
            // InternalRyml.g:490:2: ( rule__Music__Group_0_4__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_0_4()); 
            // InternalRyml.g:491:2: ( rule__Music__Group_0_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRyml.g:491:3: rule__Music__Group_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_0_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMusicAccess().getGroup_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0__4__Impl"


    // $ANTLR start "rule__Music__Group_0__5"
    // InternalRyml.g:499:1: rule__Music__Group_0__5 : rule__Music__Group_0__5__Impl rule__Music__Group_0__6 ;
    public final void rule__Music__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:503:1: ( rule__Music__Group_0__5__Impl rule__Music__Group_0__6 )
            // InternalRyml.g:504:2: rule__Music__Group_0__5__Impl rule__Music__Group_0__6
            {
            pushFollow(FOLLOW_5);
            rule__Music__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0__5"


    // $ANTLR start "rule__Music__Group_0__5__Impl"
    // InternalRyml.g:511:1: rule__Music__Group_0__5__Impl : ( ( rule__Music__Group_0_5__0 )? ) ;
    public final void rule__Music__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:515:1: ( ( ( rule__Music__Group_0_5__0 )? ) )
            // InternalRyml.g:516:1: ( ( rule__Music__Group_0_5__0 )? )
            {
            // InternalRyml.g:516:1: ( ( rule__Music__Group_0_5__0 )? )
            // InternalRyml.g:517:2: ( rule__Music__Group_0_5__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_0_5()); 
            // InternalRyml.g:518:2: ( rule__Music__Group_0_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRyml.g:518:3: rule__Music__Group_0_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_0_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMusicAccess().getGroup_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0__5__Impl"


    // $ANTLR start "rule__Music__Group_0__6"
    // InternalRyml.g:526:1: rule__Music__Group_0__6 : rule__Music__Group_0__6__Impl rule__Music__Group_0__7 ;
    public final void rule__Music__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:530:1: ( rule__Music__Group_0__6__Impl rule__Music__Group_0__7 )
            // InternalRyml.g:531:2: rule__Music__Group_0__6__Impl rule__Music__Group_0__7
            {
            pushFollow(FOLLOW_5);
            rule__Music__Group_0__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_0__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0__6"


    // $ANTLR start "rule__Music__Group_0__6__Impl"
    // InternalRyml.g:538:1: rule__Music__Group_0__6__Impl : ( ( rule__Music__Group_0_6__0 )? ) ;
    public final void rule__Music__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:542:1: ( ( ( rule__Music__Group_0_6__0 )? ) )
            // InternalRyml.g:543:1: ( ( rule__Music__Group_0_6__0 )? )
            {
            // InternalRyml.g:543:1: ( ( rule__Music__Group_0_6__0 )? )
            // InternalRyml.g:544:2: ( rule__Music__Group_0_6__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_0_6()); 
            // InternalRyml.g:545:2: ( rule__Music__Group_0_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRyml.g:545:3: rule__Music__Group_0_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_0_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMusicAccess().getGroup_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0__6__Impl"


    // $ANTLR start "rule__Music__Group_0__7"
    // InternalRyml.g:553:1: rule__Music__Group_0__7 : rule__Music__Group_0__7__Impl ;
    public final void rule__Music__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:557:1: ( rule__Music__Group_0__7__Impl )
            // InternalRyml.g:558:2: rule__Music__Group_0__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_0__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0__7"


    // $ANTLR start "rule__Music__Group_0__7__Impl"
    // InternalRyml.g:564:1: rule__Music__Group_0__7__Impl : ( ( rule__Music__Group_0_7__0 )? ) ;
    public final void rule__Music__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:568:1: ( ( ( rule__Music__Group_0_7__0 )? ) )
            // InternalRyml.g:569:1: ( ( rule__Music__Group_0_7__0 )? )
            {
            // InternalRyml.g:569:1: ( ( rule__Music__Group_0_7__0 )? )
            // InternalRyml.g:570:2: ( rule__Music__Group_0_7__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_0_7()); 
            // InternalRyml.g:571:2: ( rule__Music__Group_0_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==37) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRyml.g:571:3: rule__Music__Group_0_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_0_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMusicAccess().getGroup_0_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0__7__Impl"


    // $ANTLR start "rule__Music__Group_0_3__0"
    // InternalRyml.g:580:1: rule__Music__Group_0_3__0 : rule__Music__Group_0_3__0__Impl rule__Music__Group_0_3__1 ;
    public final void rule__Music__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:584:1: ( rule__Music__Group_0_3__0__Impl rule__Music__Group_0_3__1 )
            // InternalRyml.g:585:2: rule__Music__Group_0_3__0__Impl rule__Music__Group_0_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Music__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_3__0"


    // $ANTLR start "rule__Music__Group_0_3__0__Impl"
    // InternalRyml.g:592:1: rule__Music__Group_0_3__0__Impl : ( 'title :' ) ;
    public final void rule__Music__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:596:1: ( ( 'title :' ) )
            // InternalRyml.g:597:1: ( 'title :' )
            {
            // InternalRyml.g:597:1: ( 'title :' )
            // InternalRyml.g:598:2: 'title :'
            {
             before(grammarAccess.getMusicAccess().getTitleKeyword_0_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getTitleKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_3__0__Impl"


    // $ANTLR start "rule__Music__Group_0_3__1"
    // InternalRyml.g:607:1: rule__Music__Group_0_3__1 : rule__Music__Group_0_3__1__Impl ;
    public final void rule__Music__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:611:1: ( rule__Music__Group_0_3__1__Impl )
            // InternalRyml.g:612:2: rule__Music__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_3__1"


    // $ANTLR start "rule__Music__Group_0_3__1__Impl"
    // InternalRyml.g:618:1: rule__Music__Group_0_3__1__Impl : ( ( rule__Music__TitleAssignment_0_3_1 ) ) ;
    public final void rule__Music__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:622:1: ( ( ( rule__Music__TitleAssignment_0_3_1 ) ) )
            // InternalRyml.g:623:1: ( ( rule__Music__TitleAssignment_0_3_1 ) )
            {
            // InternalRyml.g:623:1: ( ( rule__Music__TitleAssignment_0_3_1 ) )
            // InternalRyml.g:624:2: ( rule__Music__TitleAssignment_0_3_1 )
            {
             before(grammarAccess.getMusicAccess().getTitleAssignment_0_3_1()); 
            // InternalRyml.g:625:2: ( rule__Music__TitleAssignment_0_3_1 )
            // InternalRyml.g:625:3: rule__Music__TitleAssignment_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Music__TitleAssignment_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getTitleAssignment_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_3__1__Impl"


    // $ANTLR start "rule__Music__Group_0_4__0"
    // InternalRyml.g:634:1: rule__Music__Group_0_4__0 : rule__Music__Group_0_4__0__Impl rule__Music__Group_0_4__1 ;
    public final void rule__Music__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:638:1: ( rule__Music__Group_0_4__0__Impl rule__Music__Group_0_4__1 )
            // InternalRyml.g:639:2: rule__Music__Group_0_4__0__Impl rule__Music__Group_0_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Music__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_4__0"


    // $ANTLR start "rule__Music__Group_0_4__0__Impl"
    // InternalRyml.g:646:1: rule__Music__Group_0_4__0__Impl : ( 'author :' ) ;
    public final void rule__Music__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:650:1: ( ( 'author :' ) )
            // InternalRyml.g:651:1: ( 'author :' )
            {
            // InternalRyml.g:651:1: ( 'author :' )
            // InternalRyml.g:652:2: 'author :'
            {
             before(grammarAccess.getMusicAccess().getAuthorKeyword_0_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getAuthorKeyword_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_4__0__Impl"


    // $ANTLR start "rule__Music__Group_0_4__1"
    // InternalRyml.g:661:1: rule__Music__Group_0_4__1 : rule__Music__Group_0_4__1__Impl ;
    public final void rule__Music__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:665:1: ( rule__Music__Group_0_4__1__Impl )
            // InternalRyml.g:666:2: rule__Music__Group_0_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_0_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_4__1"


    // $ANTLR start "rule__Music__Group_0_4__1__Impl"
    // InternalRyml.g:672:1: rule__Music__Group_0_4__1__Impl : ( ( rule__Music__AuthorAssignment_0_4_1 ) ) ;
    public final void rule__Music__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:676:1: ( ( ( rule__Music__AuthorAssignment_0_4_1 ) ) )
            // InternalRyml.g:677:1: ( ( rule__Music__AuthorAssignment_0_4_1 ) )
            {
            // InternalRyml.g:677:1: ( ( rule__Music__AuthorAssignment_0_4_1 ) )
            // InternalRyml.g:678:2: ( rule__Music__AuthorAssignment_0_4_1 )
            {
             before(grammarAccess.getMusicAccess().getAuthorAssignment_0_4_1()); 
            // InternalRyml.g:679:2: ( rule__Music__AuthorAssignment_0_4_1 )
            // InternalRyml.g:679:3: rule__Music__AuthorAssignment_0_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Music__AuthorAssignment_0_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getAuthorAssignment_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_4__1__Impl"


    // $ANTLR start "rule__Music__Group_0_5__0"
    // InternalRyml.g:688:1: rule__Music__Group_0_5__0 : rule__Music__Group_0_5__0__Impl rule__Music__Group_0_5__1 ;
    public final void rule__Music__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:692:1: ( rule__Music__Group_0_5__0__Impl rule__Music__Group_0_5__1 )
            // InternalRyml.g:693:2: rule__Music__Group_0_5__0__Impl rule__Music__Group_0_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Music__Group_0_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_0_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_5__0"


    // $ANTLR start "rule__Music__Group_0_5__0__Impl"
    // InternalRyml.g:700:1: rule__Music__Group_0_5__0__Impl : ( 'bpm :' ) ;
    public final void rule__Music__Group_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:704:1: ( ( 'bpm :' ) )
            // InternalRyml.g:705:1: ( 'bpm :' )
            {
            // InternalRyml.g:705:1: ( 'bpm :' )
            // InternalRyml.g:706:2: 'bpm :'
            {
             before(grammarAccess.getMusicAccess().getBpmKeyword_0_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getBpmKeyword_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_5__0__Impl"


    // $ANTLR start "rule__Music__Group_0_5__1"
    // InternalRyml.g:715:1: rule__Music__Group_0_5__1 : rule__Music__Group_0_5__1__Impl ;
    public final void rule__Music__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:719:1: ( rule__Music__Group_0_5__1__Impl )
            // InternalRyml.g:720:2: rule__Music__Group_0_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_0_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_5__1"


    // $ANTLR start "rule__Music__Group_0_5__1__Impl"
    // InternalRyml.g:726:1: rule__Music__Group_0_5__1__Impl : ( ( rule__Music__BpmAssignment_0_5_1 ) ) ;
    public final void rule__Music__Group_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:730:1: ( ( ( rule__Music__BpmAssignment_0_5_1 ) ) )
            // InternalRyml.g:731:1: ( ( rule__Music__BpmAssignment_0_5_1 ) )
            {
            // InternalRyml.g:731:1: ( ( rule__Music__BpmAssignment_0_5_1 ) )
            // InternalRyml.g:732:2: ( rule__Music__BpmAssignment_0_5_1 )
            {
             before(grammarAccess.getMusicAccess().getBpmAssignment_0_5_1()); 
            // InternalRyml.g:733:2: ( rule__Music__BpmAssignment_0_5_1 )
            // InternalRyml.g:733:3: rule__Music__BpmAssignment_0_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Music__BpmAssignment_0_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getBpmAssignment_0_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_5__1__Impl"


    // $ANTLR start "rule__Music__Group_0_6__0"
    // InternalRyml.g:742:1: rule__Music__Group_0_6__0 : rule__Music__Group_0_6__0__Impl rule__Music__Group_0_6__1 ;
    public final void rule__Music__Group_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:746:1: ( rule__Music__Group_0_6__0__Impl rule__Music__Group_0_6__1 )
            // InternalRyml.g:747:2: rule__Music__Group_0_6__0__Impl rule__Music__Group_0_6__1
            {
            pushFollow(FOLLOW_6);
            rule__Music__Group_0_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_0_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_6__0"


    // $ANTLR start "rule__Music__Group_0_6__0__Impl"
    // InternalRyml.g:754:1: rule__Music__Group_0_6__0__Impl : ( 'resolution per beats : ' ) ;
    public final void rule__Music__Group_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:758:1: ( ( 'resolution per beats : ' ) )
            // InternalRyml.g:759:1: ( 'resolution per beats : ' )
            {
            // InternalRyml.g:759:1: ( 'resolution per beats : ' )
            // InternalRyml.g:760:2: 'resolution per beats : '
            {
             before(grammarAccess.getMusicAccess().getResolutionPerBeatsKeyword_0_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getResolutionPerBeatsKeyword_0_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_6__0__Impl"


    // $ANTLR start "rule__Music__Group_0_6__1"
    // InternalRyml.g:769:1: rule__Music__Group_0_6__1 : rule__Music__Group_0_6__1__Impl ;
    public final void rule__Music__Group_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:773:1: ( rule__Music__Group_0_6__1__Impl )
            // InternalRyml.g:774:2: rule__Music__Group_0_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_0_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_6__1"


    // $ANTLR start "rule__Music__Group_0_6__1__Impl"
    // InternalRyml.g:780:1: rule__Music__Group_0_6__1__Impl : ( ( rule__Music__ResolutionPerSlideAssignment_0_6_1 ) ) ;
    public final void rule__Music__Group_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:784:1: ( ( ( rule__Music__ResolutionPerSlideAssignment_0_6_1 ) ) )
            // InternalRyml.g:785:1: ( ( rule__Music__ResolutionPerSlideAssignment_0_6_1 ) )
            {
            // InternalRyml.g:785:1: ( ( rule__Music__ResolutionPerSlideAssignment_0_6_1 ) )
            // InternalRyml.g:786:2: ( rule__Music__ResolutionPerSlideAssignment_0_6_1 )
            {
             before(grammarAccess.getMusicAccess().getResolutionPerSlideAssignment_0_6_1()); 
            // InternalRyml.g:787:2: ( rule__Music__ResolutionPerSlideAssignment_0_6_1 )
            // InternalRyml.g:787:3: rule__Music__ResolutionPerSlideAssignment_0_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Music__ResolutionPerSlideAssignment_0_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getResolutionPerSlideAssignment_0_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_6__1__Impl"


    // $ANTLR start "rule__Music__Group_0_7__0"
    // InternalRyml.g:796:1: rule__Music__Group_0_7__0 : rule__Music__Group_0_7__0__Impl rule__Music__Group_0_7__1 ;
    public final void rule__Music__Group_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:800:1: ( rule__Music__Group_0_7__0__Impl rule__Music__Group_0_7__1 )
            // InternalRyml.g:801:2: rule__Music__Group_0_7__0__Impl rule__Music__Group_0_7__1
            {
            pushFollow(FOLLOW_7);
            rule__Music__Group_0_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_0_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_7__0"


    // $ANTLR start "rule__Music__Group_0_7__0__Impl"
    // InternalRyml.g:808:1: rule__Music__Group_0_7__0__Impl : ( ( rule__Music__OwnedNotesAssignment_0_7_0 ) ) ;
    public final void rule__Music__Group_0_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:812:1: ( ( ( rule__Music__OwnedNotesAssignment_0_7_0 ) ) )
            // InternalRyml.g:813:1: ( ( rule__Music__OwnedNotesAssignment_0_7_0 ) )
            {
            // InternalRyml.g:813:1: ( ( rule__Music__OwnedNotesAssignment_0_7_0 ) )
            // InternalRyml.g:814:2: ( rule__Music__OwnedNotesAssignment_0_7_0 )
            {
             before(grammarAccess.getMusicAccess().getOwnedNotesAssignment_0_7_0()); 
            // InternalRyml.g:815:2: ( rule__Music__OwnedNotesAssignment_0_7_0 )
            // InternalRyml.g:815:3: rule__Music__OwnedNotesAssignment_0_7_0
            {
            pushFollow(FOLLOW_2);
            rule__Music__OwnedNotesAssignment_0_7_0();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getOwnedNotesAssignment_0_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_7__0__Impl"


    // $ANTLR start "rule__Music__Group_0_7__1"
    // InternalRyml.g:823:1: rule__Music__Group_0_7__1 : rule__Music__Group_0_7__1__Impl ;
    public final void rule__Music__Group_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:827:1: ( rule__Music__Group_0_7__1__Impl )
            // InternalRyml.g:828:2: rule__Music__Group_0_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_0_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_7__1"


    // $ANTLR start "rule__Music__Group_0_7__1__Impl"
    // InternalRyml.g:834:1: rule__Music__Group_0_7__1__Impl : ( ( rule__Music__OwnedNotesAssignment_0_7_1 )* ) ;
    public final void rule__Music__Group_0_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:838:1: ( ( ( rule__Music__OwnedNotesAssignment_0_7_1 )* ) )
            // InternalRyml.g:839:1: ( ( rule__Music__OwnedNotesAssignment_0_7_1 )* )
            {
            // InternalRyml.g:839:1: ( ( rule__Music__OwnedNotesAssignment_0_7_1 )* )
            // InternalRyml.g:840:2: ( rule__Music__OwnedNotesAssignment_0_7_1 )*
            {
             before(grammarAccess.getMusicAccess().getOwnedNotesAssignment_0_7_1()); 
            // InternalRyml.g:841:2: ( rule__Music__OwnedNotesAssignment_0_7_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRyml.g:841:3: rule__Music__OwnedNotesAssignment_0_7_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Music__OwnedNotesAssignment_0_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMusicAccess().getOwnedNotesAssignment_0_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_0_7__1__Impl"


    // $ANTLR start "rule__Music__Group_1__0"
    // InternalRyml.g:850:1: rule__Music__Group_1__0 : rule__Music__Group_1__0__Impl rule__Music__Group_1__1 ;
    public final void rule__Music__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:854:1: ( rule__Music__Group_1__0__Impl rule__Music__Group_1__1 )
            // InternalRyml.g:855:2: rule__Music__Group_1__0__Impl rule__Music__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Music__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_1__0"


    // $ANTLR start "rule__Music__Group_1__0__Impl"
    // InternalRyml.g:862:1: rule__Music__Group_1__0__Impl : ( ( rule__Music__OwnedBeatsAssignment_1_0 ) ) ;
    public final void rule__Music__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:866:1: ( ( ( rule__Music__OwnedBeatsAssignment_1_0 ) ) )
            // InternalRyml.g:867:1: ( ( rule__Music__OwnedBeatsAssignment_1_0 ) )
            {
            // InternalRyml.g:867:1: ( ( rule__Music__OwnedBeatsAssignment_1_0 ) )
            // InternalRyml.g:868:2: ( rule__Music__OwnedBeatsAssignment_1_0 )
            {
             before(grammarAccess.getMusicAccess().getOwnedBeatsAssignment_1_0()); 
            // InternalRyml.g:869:2: ( rule__Music__OwnedBeatsAssignment_1_0 )
            // InternalRyml.g:869:3: rule__Music__OwnedBeatsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Music__OwnedBeatsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getOwnedBeatsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_1__0__Impl"


    // $ANTLR start "rule__Music__Group_1__1"
    // InternalRyml.g:877:1: rule__Music__Group_1__1 : rule__Music__Group_1__1__Impl ;
    public final void rule__Music__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:881:1: ( rule__Music__Group_1__1__Impl )
            // InternalRyml.g:882:2: rule__Music__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_1__1"


    // $ANTLR start "rule__Music__Group_1__1__Impl"
    // InternalRyml.g:888:1: rule__Music__Group_1__1__Impl : ( ( rule__Music__OwnedBeatsAssignment_1_1 )* ) ;
    public final void rule__Music__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:892:1: ( ( ( rule__Music__OwnedBeatsAssignment_1_1 )* ) )
            // InternalRyml.g:893:1: ( ( rule__Music__OwnedBeatsAssignment_1_1 )* )
            {
            // InternalRyml.g:893:1: ( ( rule__Music__OwnedBeatsAssignment_1_1 )* )
            // InternalRyml.g:894:2: ( rule__Music__OwnedBeatsAssignment_1_1 )*
            {
             before(grammarAccess.getMusicAccess().getOwnedBeatsAssignment_1_1()); 
            // InternalRyml.g:895:2: ( rule__Music__OwnedBeatsAssignment_1_1 )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalRyml.g:895:3: rule__Music__OwnedBeatsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Music__OwnedBeatsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMusicAccess().getOwnedBeatsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_1__1__Impl"


    // $ANTLR start "rule__Music__Group_2__0"
    // InternalRyml.g:904:1: rule__Music__Group_2__0 : rule__Music__Group_2__0__Impl rule__Music__Group_2__1 ;
    public final void rule__Music__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:908:1: ( rule__Music__Group_2__0__Impl rule__Music__Group_2__1 )
            // InternalRyml.g:909:2: rule__Music__Group_2__0__Impl rule__Music__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Music__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_2__0"


    // $ANTLR start "rule__Music__Group_2__0__Impl"
    // InternalRyml.g:916:1: rule__Music__Group_2__0__Impl : ( ( rule__Music__OwnedBarsAssignment_2_0 ) ) ;
    public final void rule__Music__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:920:1: ( ( ( rule__Music__OwnedBarsAssignment_2_0 ) ) )
            // InternalRyml.g:921:1: ( ( rule__Music__OwnedBarsAssignment_2_0 ) )
            {
            // InternalRyml.g:921:1: ( ( rule__Music__OwnedBarsAssignment_2_0 ) )
            // InternalRyml.g:922:2: ( rule__Music__OwnedBarsAssignment_2_0 )
            {
             before(grammarAccess.getMusicAccess().getOwnedBarsAssignment_2_0()); 
            // InternalRyml.g:923:2: ( rule__Music__OwnedBarsAssignment_2_0 )
            // InternalRyml.g:923:3: rule__Music__OwnedBarsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Music__OwnedBarsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getOwnedBarsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_2__0__Impl"


    // $ANTLR start "rule__Music__Group_2__1"
    // InternalRyml.g:931:1: rule__Music__Group_2__1 : rule__Music__Group_2__1__Impl ;
    public final void rule__Music__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:935:1: ( rule__Music__Group_2__1__Impl )
            // InternalRyml.g:936:2: rule__Music__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_2__1"


    // $ANTLR start "rule__Music__Group_2__1__Impl"
    // InternalRyml.g:942:1: rule__Music__Group_2__1__Impl : ( ( rule__Music__OwnedBarsAssignment_2_1 )* ) ;
    public final void rule__Music__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:946:1: ( ( ( rule__Music__OwnedBarsAssignment_2_1 )* ) )
            // InternalRyml.g:947:1: ( ( rule__Music__OwnedBarsAssignment_2_1 )* )
            {
            // InternalRyml.g:947:1: ( ( rule__Music__OwnedBarsAssignment_2_1 )* )
            // InternalRyml.g:948:2: ( rule__Music__OwnedBarsAssignment_2_1 )*
            {
             before(grammarAccess.getMusicAccess().getOwnedBarsAssignment_2_1()); 
            // InternalRyml.g:949:2: ( rule__Music__OwnedBarsAssignment_2_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==RULE_STRING) ) {
                        int LA10_3 = input.LA(3);

                        if ( (LA10_3==23) ) {
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

                        if ( (LA10_4==23) ) {
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
            	    // InternalRyml.g:949:3: rule__Music__OwnedBarsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Music__OwnedBarsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMusicAccess().getOwnedBarsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_2__1__Impl"


    // $ANTLR start "rule__Music__Group_3__0"
    // InternalRyml.g:958:1: rule__Music__Group_3__0 : rule__Music__Group_3__0__Impl rule__Music__Group_3__1 ;
    public final void rule__Music__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:962:1: ( rule__Music__Group_3__0__Impl rule__Music__Group_3__1 )
            // InternalRyml.g:963:2: rule__Music__Group_3__0__Impl rule__Music__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Music__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_3__0"


    // $ANTLR start "rule__Music__Group_3__0__Impl"
    // InternalRyml.g:970:1: rule__Music__Group_3__0__Impl : ( ( rule__Music__Group_3_0__0 )? ) ;
    public final void rule__Music__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:974:1: ( ( ( rule__Music__Group_3_0__0 )? ) )
            // InternalRyml.g:975:1: ( ( rule__Music__Group_3_0__0 )? )
            {
            // InternalRyml.g:975:1: ( ( rule__Music__Group_3_0__0 )? )
            // InternalRyml.g:976:2: ( rule__Music__Group_3_0__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_3_0()); 
            // InternalRyml.g:977:2: ( rule__Music__Group_3_0__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRyml.g:977:3: rule__Music__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_3_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMusicAccess().getGroup_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_3__0__Impl"


    // $ANTLR start "rule__Music__Group_3__1"
    // InternalRyml.g:985:1: rule__Music__Group_3__1 : rule__Music__Group_3__1__Impl rule__Music__Group_3__2 ;
    public final void rule__Music__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:989:1: ( rule__Music__Group_3__1__Impl rule__Music__Group_3__2 )
            // InternalRyml.g:990:2: rule__Music__Group_3__1__Impl rule__Music__Group_3__2
            {
            pushFollow(FOLLOW_13);
            rule__Music__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_3__1"


    // $ANTLR start "rule__Music__Group_3__1__Impl"
    // InternalRyml.g:997:1: rule__Music__Group_3__1__Impl : ( ( rule__Music__OwnedSectionsAssignment_3_1 ) ) ;
    public final void rule__Music__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1001:1: ( ( ( rule__Music__OwnedSectionsAssignment_3_1 ) ) )
            // InternalRyml.g:1002:1: ( ( rule__Music__OwnedSectionsAssignment_3_1 ) )
            {
            // InternalRyml.g:1002:1: ( ( rule__Music__OwnedSectionsAssignment_3_1 ) )
            // InternalRyml.g:1003:2: ( rule__Music__OwnedSectionsAssignment_3_1 )
            {
             before(grammarAccess.getMusicAccess().getOwnedSectionsAssignment_3_1()); 
            // InternalRyml.g:1004:2: ( rule__Music__OwnedSectionsAssignment_3_1 )
            // InternalRyml.g:1004:3: rule__Music__OwnedSectionsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Music__OwnedSectionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getOwnedSectionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_3__1__Impl"


    // $ANTLR start "rule__Music__Group_3__2"
    // InternalRyml.g:1012:1: rule__Music__Group_3__2 : rule__Music__Group_3__2__Impl ;
    public final void rule__Music__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1016:1: ( rule__Music__Group_3__2__Impl )
            // InternalRyml.g:1017:2: rule__Music__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_3__2"


    // $ANTLR start "rule__Music__Group_3__2__Impl"
    // InternalRyml.g:1023:1: rule__Music__Group_3__2__Impl : ( ( rule__Music__OwnedSectionsAssignment_3_2 )* ) ;
    public final void rule__Music__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1027:1: ( ( ( rule__Music__OwnedSectionsAssignment_3_2 )* ) )
            // InternalRyml.g:1028:1: ( ( rule__Music__OwnedSectionsAssignment_3_2 )* )
            {
            // InternalRyml.g:1028:1: ( ( rule__Music__OwnedSectionsAssignment_3_2 )* )
            // InternalRyml.g:1029:2: ( rule__Music__OwnedSectionsAssignment_3_2 )*
            {
             before(grammarAccess.getMusicAccess().getOwnedSectionsAssignment_3_2()); 
            // InternalRyml.g:1030:2: ( rule__Music__OwnedSectionsAssignment_3_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_STRING) ) {
                        int LA12_3 = input.LA(3);

                        if ( (LA12_3==23) ) {
                            int LA12_5 = input.LA(4);

                            if ( (LA12_5==RULE_STRING) ) {
                                alt12=1;
                            }
                            else if ( (LA12_5==RULE_ID) ) {
                                alt12=1;
                            }


                        }


                    }
                    else if ( (LA12_2==RULE_ID) ) {
                        int LA12_4 = input.LA(3);

                        if ( (LA12_4==23) ) {
                            int LA12_5 = input.LA(4);

                            if ( (LA12_5==RULE_STRING) ) {
                                alt12=1;
                            }
                            else if ( (LA12_5==RULE_ID) ) {
                                alt12=1;
                            }


                        }


                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalRyml.g:1030:3: rule__Music__OwnedSectionsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Music__OwnedSectionsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMusicAccess().getOwnedSectionsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_3__2__Impl"


    // $ANTLR start "rule__Music__Group_3_0__0"
    // InternalRyml.g:1039:1: rule__Music__Group_3_0__0 : rule__Music__Group_3_0__0__Impl rule__Music__Group_3_0__1 ;
    public final void rule__Music__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1043:1: ( rule__Music__Group_3_0__0__Impl rule__Music__Group_3_0__1 )
            // InternalRyml.g:1044:2: rule__Music__Group_3_0__0__Impl rule__Music__Group_3_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Music__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_3_0__0"


    // $ANTLR start "rule__Music__Group_3_0__0__Impl"
    // InternalRyml.g:1051:1: rule__Music__Group_3_0__0__Impl : ( ( rule__Music__OwnedPatternsAssignment_3_0_0 ) ) ;
    public final void rule__Music__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1055:1: ( ( ( rule__Music__OwnedPatternsAssignment_3_0_0 ) ) )
            // InternalRyml.g:1056:1: ( ( rule__Music__OwnedPatternsAssignment_3_0_0 ) )
            {
            // InternalRyml.g:1056:1: ( ( rule__Music__OwnedPatternsAssignment_3_0_0 ) )
            // InternalRyml.g:1057:2: ( rule__Music__OwnedPatternsAssignment_3_0_0 )
            {
             before(grammarAccess.getMusicAccess().getOwnedPatternsAssignment_3_0_0()); 
            // InternalRyml.g:1058:2: ( rule__Music__OwnedPatternsAssignment_3_0_0 )
            // InternalRyml.g:1058:3: rule__Music__OwnedPatternsAssignment_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Music__OwnedPatternsAssignment_3_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getOwnedPatternsAssignment_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_3_0__0__Impl"


    // $ANTLR start "rule__Music__Group_3_0__1"
    // InternalRyml.g:1066:1: rule__Music__Group_3_0__1 : rule__Music__Group_3_0__1__Impl ;
    public final void rule__Music__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1070:1: ( rule__Music__Group_3_0__1__Impl )
            // InternalRyml.g:1071:2: rule__Music__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_3_0__1"


    // $ANTLR start "rule__Music__Group_3_0__1__Impl"
    // InternalRyml.g:1077:1: rule__Music__Group_3_0__1__Impl : ( ( rule__Music__OwnedPatternsAssignment_3_0_1 )* ) ;
    public final void rule__Music__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1081:1: ( ( ( rule__Music__OwnedPatternsAssignment_3_0_1 )* ) )
            // InternalRyml.g:1082:1: ( ( rule__Music__OwnedPatternsAssignment_3_0_1 )* )
            {
            // InternalRyml.g:1082:1: ( ( rule__Music__OwnedPatternsAssignment_3_0_1 )* )
            // InternalRyml.g:1083:2: ( rule__Music__OwnedPatternsAssignment_3_0_1 )*
            {
             before(grammarAccess.getMusicAccess().getOwnedPatternsAssignment_3_0_1()); 
            // InternalRyml.g:1084:2: ( rule__Music__OwnedPatternsAssignment_3_0_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRyml.g:1084:3: rule__Music__OwnedPatternsAssignment_3_0_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Music__OwnedPatternsAssignment_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMusicAccess().getOwnedPatternsAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__Group_3_0__1__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // InternalRyml.g:1093:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1097:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalRyml.g:1098:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // InternalRyml.g:1105:1: rule__Section__Group__0__Impl : ( 'Section' ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1109:1: ( ( 'Section' ) )
            // InternalRyml.g:1110:1: ( 'Section' )
            {
            // InternalRyml.g:1110:1: ( 'Section' )
            // InternalRyml.g:1111:2: 'Section'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getSectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // InternalRyml.g:1120:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1124:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalRyml.g:1125:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // InternalRyml.g:1132:1: rule__Section__Group__1__Impl : ( ( rule__Section__NameAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1136:1: ( ( ( rule__Section__NameAssignment_1 ) ) )
            // InternalRyml.g:1137:1: ( ( rule__Section__NameAssignment_1 ) )
            {
            // InternalRyml.g:1137:1: ( ( rule__Section__NameAssignment_1 ) )
            // InternalRyml.g:1138:2: ( rule__Section__NameAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1()); 
            // InternalRyml.g:1139:2: ( rule__Section__NameAssignment_1 )
            // InternalRyml.g:1139:3: rule__Section__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // InternalRyml.g:1147:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1151:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalRyml.g:1152:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Section__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // InternalRyml.g:1159:1: rule__Section__Group__2__Impl : ( ':' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1163:1: ( ( ':' ) )
            // InternalRyml.g:1164:1: ( ':' )
            {
            // InternalRyml.g:1164:1: ( ':' )
            // InternalRyml.g:1165:2: ':'
            {
             before(grammarAccess.getSectionAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__3"
    // InternalRyml.g:1174:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1178:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalRyml.g:1179:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Section__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3"


    // $ANTLR start "rule__Section__Group__3__Impl"
    // InternalRyml.g:1186:1: rule__Section__Group__3__Impl : ( ( rule__Section__PatternsAssignment_3 ) ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1190:1: ( ( ( rule__Section__PatternsAssignment_3 ) ) )
            // InternalRyml.g:1191:1: ( ( rule__Section__PatternsAssignment_3 ) )
            {
            // InternalRyml.g:1191:1: ( ( rule__Section__PatternsAssignment_3 ) )
            // InternalRyml.g:1192:2: ( rule__Section__PatternsAssignment_3 )
            {
             before(grammarAccess.getSectionAccess().getPatternsAssignment_3()); 
            // InternalRyml.g:1193:2: ( rule__Section__PatternsAssignment_3 )
            // InternalRyml.g:1193:3: rule__Section__PatternsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Section__PatternsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getPatternsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3__Impl"


    // $ANTLR start "rule__Section__Group__4"
    // InternalRyml.g:1201:1: rule__Section__Group__4 : rule__Section__Group__4__Impl ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1205:1: ( rule__Section__Group__4__Impl )
            // InternalRyml.g:1206:2: rule__Section__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4"


    // $ANTLR start "rule__Section__Group__4__Impl"
    // InternalRyml.g:1212:1: rule__Section__Group__4__Impl : ( ( rule__Section__Group_4__0 )* ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1216:1: ( ( ( rule__Section__Group_4__0 )* ) )
            // InternalRyml.g:1217:1: ( ( rule__Section__Group_4__0 )* )
            {
            // InternalRyml.g:1217:1: ( ( rule__Section__Group_4__0 )* )
            // InternalRyml.g:1218:2: ( rule__Section__Group_4__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_4()); 
            // InternalRyml.g:1219:2: ( rule__Section__Group_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRyml.g:1219:3: rule__Section__Group_4__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Section__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4__Impl"


    // $ANTLR start "rule__Section__Group_4__0"
    // InternalRyml.g:1228:1: rule__Section__Group_4__0 : rule__Section__Group_4__0__Impl rule__Section__Group_4__1 ;
    public final void rule__Section__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1232:1: ( rule__Section__Group_4__0__Impl rule__Section__Group_4__1 )
            // InternalRyml.g:1233:2: rule__Section__Group_4__0__Impl rule__Section__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Section__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_4__0"


    // $ANTLR start "rule__Section__Group_4__0__Impl"
    // InternalRyml.g:1240:1: rule__Section__Group_4__0__Impl : ( '|' ) ;
    public final void rule__Section__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1244:1: ( ( '|' ) )
            // InternalRyml.g:1245:1: ( '|' )
            {
            // InternalRyml.g:1245:1: ( '|' )
            // InternalRyml.g:1246:2: '|'
            {
             before(grammarAccess.getSectionAccess().getVerticalLineKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getVerticalLineKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_4__0__Impl"


    // $ANTLR start "rule__Section__Group_4__1"
    // InternalRyml.g:1255:1: rule__Section__Group_4__1 : rule__Section__Group_4__1__Impl ;
    public final void rule__Section__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1259:1: ( rule__Section__Group_4__1__Impl )
            // InternalRyml.g:1260:2: rule__Section__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_4__1"


    // $ANTLR start "rule__Section__Group_4__1__Impl"
    // InternalRyml.g:1266:1: rule__Section__Group_4__1__Impl : ( ( rule__Section__PatternsAssignment_4_1 ) ) ;
    public final void rule__Section__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1270:1: ( ( ( rule__Section__PatternsAssignment_4_1 ) ) )
            // InternalRyml.g:1271:1: ( ( rule__Section__PatternsAssignment_4_1 ) )
            {
            // InternalRyml.g:1271:1: ( ( rule__Section__PatternsAssignment_4_1 ) )
            // InternalRyml.g:1272:2: ( rule__Section__PatternsAssignment_4_1 )
            {
             before(grammarAccess.getSectionAccess().getPatternsAssignment_4_1()); 
            // InternalRyml.g:1273:2: ( rule__Section__PatternsAssignment_4_1 )
            // InternalRyml.g:1273:3: rule__Section__PatternsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__PatternsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getPatternsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_4__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalRyml.g:1282:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1286:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalRyml.g:1287:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalRyml.g:1294:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1298:1: ( ( ( '-' )? ) )
            // InternalRyml.g:1299:1: ( ( '-' )? )
            {
            // InternalRyml.g:1299:1: ( ( '-' )? )
            // InternalRyml.g:1300:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalRyml.g:1301:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRyml.g:1301:3: '-'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalRyml.g:1309:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1313:1: ( rule__EInt__Group__1__Impl )
            // InternalRyml.g:1314:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalRyml.g:1320:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1324:1: ( ( RULE_INT ) )
            // InternalRyml.g:1325:1: ( RULE_INT )
            {
            // InternalRyml.g:1325:1: ( RULE_INT )
            // InternalRyml.g:1326:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalRyml.g:1336:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1340:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalRyml.g:1341:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Pattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0"


    // $ANTLR start "rule__Pattern__Group__0__Impl"
    // InternalRyml.g:1348:1: rule__Pattern__Group__0__Impl : ( 'Pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1352:1: ( ( 'Pattern' ) )
            // InternalRyml.g:1353:1: ( 'Pattern' )
            {
            // InternalRyml.g:1353:1: ( 'Pattern' )
            // InternalRyml.g:1354:2: 'Pattern'
            {
             before(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getPatternKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0__Impl"


    // $ANTLR start "rule__Pattern__Group__1"
    // InternalRyml.g:1363:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1367:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalRyml.g:1368:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Pattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1"


    // $ANTLR start "rule__Pattern__Group__1__Impl"
    // InternalRyml.g:1375:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1379:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // InternalRyml.g:1380:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // InternalRyml.g:1380:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // InternalRyml.g:1381:2: ( rule__Pattern__NameAssignment_1 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            // InternalRyml.g:1382:2: ( rule__Pattern__NameAssignment_1 )
            // InternalRyml.g:1382:3: rule__Pattern__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1__Impl"


    // $ANTLR start "rule__Pattern__Group__2"
    // InternalRyml.g:1390:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1394:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalRyml.g:1395:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Pattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2"


    // $ANTLR start "rule__Pattern__Group__2__Impl"
    // InternalRyml.g:1402:1: rule__Pattern__Group__2__Impl : ( ':' ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1406:1: ( ( ':' ) )
            // InternalRyml.g:1407:1: ( ':' )
            {
            // InternalRyml.g:1407:1: ( ':' )
            // InternalRyml.g:1408:2: ':'
            {
             before(grammarAccess.getPatternAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2__Impl"


    // $ANTLR start "rule__Pattern__Group__3"
    // InternalRyml.g:1417:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1421:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalRyml.g:1422:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Pattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3"


    // $ANTLR start "rule__Pattern__Group__3__Impl"
    // InternalRyml.g:1429:1: rule__Pattern__Group__3__Impl : ( ( rule__Pattern__BarsAssignment_3 ) ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1433:1: ( ( ( rule__Pattern__BarsAssignment_3 ) ) )
            // InternalRyml.g:1434:1: ( ( rule__Pattern__BarsAssignment_3 ) )
            {
            // InternalRyml.g:1434:1: ( ( rule__Pattern__BarsAssignment_3 ) )
            // InternalRyml.g:1435:2: ( rule__Pattern__BarsAssignment_3 )
            {
             before(grammarAccess.getPatternAccess().getBarsAssignment_3()); 
            // InternalRyml.g:1436:2: ( rule__Pattern__BarsAssignment_3 )
            // InternalRyml.g:1436:3: rule__Pattern__BarsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__BarsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getBarsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3__Impl"


    // $ANTLR start "rule__Pattern__Group__4"
    // InternalRyml.g:1444:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1448:1: ( rule__Pattern__Group__4__Impl )
            // InternalRyml.g:1449:2: rule__Pattern__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__4"


    // $ANTLR start "rule__Pattern__Group__4__Impl"
    // InternalRyml.g:1455:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__Group_4__0 )* ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1459:1: ( ( ( rule__Pattern__Group_4__0 )* ) )
            // InternalRyml.g:1460:1: ( ( rule__Pattern__Group_4__0 )* )
            {
            // InternalRyml.g:1460:1: ( ( rule__Pattern__Group_4__0 )* )
            // InternalRyml.g:1461:2: ( rule__Pattern__Group_4__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_4()); 
            // InternalRyml.g:1462:2: ( rule__Pattern__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRyml.g:1462:3: rule__Pattern__Group_4__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Pattern__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPatternAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__4__Impl"


    // $ANTLR start "rule__Pattern__Group_4__0"
    // InternalRyml.g:1471:1: rule__Pattern__Group_4__0 : rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 ;
    public final void rule__Pattern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1475:1: ( rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 )
            // InternalRyml.g:1476:2: rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Pattern__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__0"


    // $ANTLR start "rule__Pattern__Group_4__0__Impl"
    // InternalRyml.g:1483:1: rule__Pattern__Group_4__0__Impl : ( '|' ) ;
    public final void rule__Pattern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1487:1: ( ( '|' ) )
            // InternalRyml.g:1488:1: ( '|' )
            {
            // InternalRyml.g:1488:1: ( '|' )
            // InternalRyml.g:1489:2: '|'
            {
             before(grammarAccess.getPatternAccess().getVerticalLineKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getVerticalLineKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__0__Impl"


    // $ANTLR start "rule__Pattern__Group_4__1"
    // InternalRyml.g:1498:1: rule__Pattern__Group_4__1 : rule__Pattern__Group_4__1__Impl ;
    public final void rule__Pattern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1502:1: ( rule__Pattern__Group_4__1__Impl )
            // InternalRyml.g:1503:2: rule__Pattern__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__1"


    // $ANTLR start "rule__Pattern__Group_4__1__Impl"
    // InternalRyml.g:1509:1: rule__Pattern__Group_4__1__Impl : ( ( rule__Pattern__BarsAssignment_4_1 ) ) ;
    public final void rule__Pattern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1513:1: ( ( ( rule__Pattern__BarsAssignment_4_1 ) ) )
            // InternalRyml.g:1514:1: ( ( rule__Pattern__BarsAssignment_4_1 ) )
            {
            // InternalRyml.g:1514:1: ( ( rule__Pattern__BarsAssignment_4_1 ) )
            // InternalRyml.g:1515:2: ( rule__Pattern__BarsAssignment_4_1 )
            {
             before(grammarAccess.getPatternAccess().getBarsAssignment_4_1()); 
            // InternalRyml.g:1516:2: ( rule__Pattern__BarsAssignment_4_1 )
            // InternalRyml.g:1516:3: rule__Pattern__BarsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__BarsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getBarsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__1__Impl"


    // $ANTLR start "rule__Bar__Group__0"
    // InternalRyml.g:1525:1: rule__Bar__Group__0 : rule__Bar__Group__0__Impl rule__Bar__Group__1 ;
    public final void rule__Bar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1529:1: ( rule__Bar__Group__0__Impl rule__Bar__Group__1 )
            // InternalRyml.g:1530:2: rule__Bar__Group__0__Impl rule__Bar__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Bar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bar__Group__0"


    // $ANTLR start "rule__Bar__Group__0__Impl"
    // InternalRyml.g:1537:1: rule__Bar__Group__0__Impl : ( 'Bar' ) ;
    public final void rule__Bar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1541:1: ( ( 'Bar' ) )
            // InternalRyml.g:1542:1: ( 'Bar' )
            {
            // InternalRyml.g:1542:1: ( 'Bar' )
            // InternalRyml.g:1543:2: 'Bar'
            {
             before(grammarAccess.getBarAccess().getBarKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBarAccess().getBarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bar__Group__0__Impl"


    // $ANTLR start "rule__Bar__Group__1"
    // InternalRyml.g:1552:1: rule__Bar__Group__1 : rule__Bar__Group__1__Impl rule__Bar__Group__2 ;
    public final void rule__Bar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1556:1: ( rule__Bar__Group__1__Impl rule__Bar__Group__2 )
            // InternalRyml.g:1557:2: rule__Bar__Group__1__Impl rule__Bar__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Bar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bar__Group__1"


    // $ANTLR start "rule__Bar__Group__1__Impl"
    // InternalRyml.g:1564:1: rule__Bar__Group__1__Impl : ( ( rule__Bar__NameAssignment_1 ) ) ;
    public final void rule__Bar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1568:1: ( ( ( rule__Bar__NameAssignment_1 ) ) )
            // InternalRyml.g:1569:1: ( ( rule__Bar__NameAssignment_1 ) )
            {
            // InternalRyml.g:1569:1: ( ( rule__Bar__NameAssignment_1 ) )
            // InternalRyml.g:1570:2: ( rule__Bar__NameAssignment_1 )
            {
             before(grammarAccess.getBarAccess().getNameAssignment_1()); 
            // InternalRyml.g:1571:2: ( rule__Bar__NameAssignment_1 )
            // InternalRyml.g:1571:3: rule__Bar__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Bar__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBarAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bar__Group__1__Impl"


    // $ANTLR start "rule__Bar__Group__2"
    // InternalRyml.g:1579:1: rule__Bar__Group__2 : rule__Bar__Group__2__Impl rule__Bar__Group__3 ;
    public final void rule__Bar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1583:1: ( rule__Bar__Group__2__Impl rule__Bar__Group__3 )
            // InternalRyml.g:1584:2: rule__Bar__Group__2__Impl rule__Bar__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Bar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bar__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bar__Group__2"


    // $ANTLR start "rule__Bar__Group__2__Impl"
    // InternalRyml.g:1591:1: rule__Bar__Group__2__Impl : ( ':' ) ;
    public final void rule__Bar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1595:1: ( ( ':' ) )
            // InternalRyml.g:1596:1: ( ':' )
            {
            // InternalRyml.g:1596:1: ( ':' )
            // InternalRyml.g:1597:2: ':'
            {
             before(grammarAccess.getBarAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBarAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bar__Group__2__Impl"


    // $ANTLR start "rule__Bar__Group__3"
    // InternalRyml.g:1606:1: rule__Bar__Group__3 : rule__Bar__Group__3__Impl rule__Bar__Group__4 ;
    public final void rule__Bar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1610:1: ( rule__Bar__Group__3__Impl rule__Bar__Group__4 )
            // InternalRyml.g:1611:2: rule__Bar__Group__3__Impl rule__Bar__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Bar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bar__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bar__Group__3"


    // $ANTLR start "rule__Bar__Group__3__Impl"
    // InternalRyml.g:1618:1: rule__Bar__Group__3__Impl : ( ( rule__Bar__BeatsAssignment_3 ) ) ;
    public final void rule__Bar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1622:1: ( ( ( rule__Bar__BeatsAssignment_3 ) ) )
            // InternalRyml.g:1623:1: ( ( rule__Bar__BeatsAssignment_3 ) )
            {
            // InternalRyml.g:1623:1: ( ( rule__Bar__BeatsAssignment_3 ) )
            // InternalRyml.g:1624:2: ( rule__Bar__BeatsAssignment_3 )
            {
             before(grammarAccess.getBarAccess().getBeatsAssignment_3()); 
            // InternalRyml.g:1625:2: ( rule__Bar__BeatsAssignment_3 )
            // InternalRyml.g:1625:3: rule__Bar__BeatsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Bar__BeatsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBarAccess().getBeatsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bar__Group__3__Impl"


    // $ANTLR start "rule__Bar__Group__4"
    // InternalRyml.g:1633:1: rule__Bar__Group__4 : rule__Bar__Group__4__Impl ;
    public final void rule__Bar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1637:1: ( rule__Bar__Group__4__Impl )
            // InternalRyml.g:1638:2: rule__Bar__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bar__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bar__Group__4"


    // $ANTLR start "rule__Bar__Group__4__Impl"
    // InternalRyml.g:1644:1: rule__Bar__Group__4__Impl : ( ( rule__Bar__Group_4__0 )* ) ;
    public final void rule__Bar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1648:1: ( ( ( rule__Bar__Group_4__0 )* ) )
            // InternalRyml.g:1649:1: ( ( rule__Bar__Group_4__0 )* )
            {
            // InternalRyml.g:1649:1: ( ( rule__Bar__Group_4__0 )* )
            // InternalRyml.g:1650:2: ( rule__Bar__Group_4__0 )*
            {
             before(grammarAccess.getBarAccess().getGroup_4()); 
            // InternalRyml.g:1651:2: ( rule__Bar__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRyml.g:1651:3: rule__Bar__Group_4__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Bar__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getBarAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bar__Group__4__Impl"


    // $ANTLR start "rule__Bar__Group_4__0"
    // InternalRyml.g:1660:1: rule__Bar__Group_4__0 : rule__Bar__Group_4__0__Impl rule__Bar__Group_4__1 ;
    public final void rule__Bar__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1664:1: ( rule__Bar__Group_4__0__Impl rule__Bar__Group_4__1 )
            // InternalRyml.g:1665:2: rule__Bar__Group_4__0__Impl rule__Bar__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Bar__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bar__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bar__Group_4__0"


    // $ANTLR start "rule__Bar__Group_4__0__Impl"
    // InternalRyml.g:1672:1: rule__Bar__Group_4__0__Impl : ( '|' ) ;
    public final void rule__Bar__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1676:1: ( ( '|' ) )
            // InternalRyml.g:1677:1: ( '|' )
            {
            // InternalRyml.g:1677:1: ( '|' )
            // InternalRyml.g:1678:2: '|'
            {
             before(grammarAccess.getBarAccess().getVerticalLineKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBarAccess().getVerticalLineKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bar__Group_4__0__Impl"


    // $ANTLR start "rule__Bar__Group_4__1"
    // InternalRyml.g:1687:1: rule__Bar__Group_4__1 : rule__Bar__Group_4__1__Impl ;
    public final void rule__Bar__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1691:1: ( rule__Bar__Group_4__1__Impl )
            // InternalRyml.g:1692:2: rule__Bar__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bar__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bar__Group_4__1"


    // $ANTLR start "rule__Bar__Group_4__1__Impl"
    // InternalRyml.g:1698:1: rule__Bar__Group_4__1__Impl : ( ( rule__Bar__BeatsAssignment_4_1 ) ) ;
    public final void rule__Bar__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1702:1: ( ( ( rule__Bar__BeatsAssignment_4_1 ) ) )
            // InternalRyml.g:1703:1: ( ( rule__Bar__BeatsAssignment_4_1 ) )
            {
            // InternalRyml.g:1703:1: ( ( rule__Bar__BeatsAssignment_4_1 ) )
            // InternalRyml.g:1704:2: ( rule__Bar__BeatsAssignment_4_1 )
            {
             before(grammarAccess.getBarAccess().getBeatsAssignment_4_1()); 
            // InternalRyml.g:1705:2: ( rule__Bar__BeatsAssignment_4_1 )
            // InternalRyml.g:1705:3: rule__Bar__BeatsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Bar__BeatsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBarAccess().getBeatsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bar__Group_4__1__Impl"


    // $ANTLR start "rule__Beat__Group__0"
    // InternalRyml.g:1714:1: rule__Beat__Group__0 : rule__Beat__Group__0__Impl rule__Beat__Group__1 ;
    public final void rule__Beat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1718:1: ( rule__Beat__Group__0__Impl rule__Beat__Group__1 )
            // InternalRyml.g:1719:2: rule__Beat__Group__0__Impl rule__Beat__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Beat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__0"


    // $ANTLR start "rule__Beat__Group__0__Impl"
    // InternalRyml.g:1726:1: rule__Beat__Group__0__Impl : ( 'Beat' ) ;
    public final void rule__Beat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1730:1: ( ( 'Beat' ) )
            // InternalRyml.g:1731:1: ( 'Beat' )
            {
            // InternalRyml.g:1731:1: ( 'Beat' )
            // InternalRyml.g:1732:2: 'Beat'
            {
             before(grammarAccess.getBeatAccess().getBeatKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBeatAccess().getBeatKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__0__Impl"


    // $ANTLR start "rule__Beat__Group__1"
    // InternalRyml.g:1741:1: rule__Beat__Group__1 : rule__Beat__Group__1__Impl rule__Beat__Group__2 ;
    public final void rule__Beat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1745:1: ( rule__Beat__Group__1__Impl rule__Beat__Group__2 )
            // InternalRyml.g:1746:2: rule__Beat__Group__1__Impl rule__Beat__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Beat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__1"


    // $ANTLR start "rule__Beat__Group__1__Impl"
    // InternalRyml.g:1753:1: rule__Beat__Group__1__Impl : ( ( rule__Beat__NameAssignment_1 ) ) ;
    public final void rule__Beat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1757:1: ( ( ( rule__Beat__NameAssignment_1 ) ) )
            // InternalRyml.g:1758:1: ( ( rule__Beat__NameAssignment_1 ) )
            {
            // InternalRyml.g:1758:1: ( ( rule__Beat__NameAssignment_1 ) )
            // InternalRyml.g:1759:2: ( rule__Beat__NameAssignment_1 )
            {
             before(grammarAccess.getBeatAccess().getNameAssignment_1()); 
            // InternalRyml.g:1760:2: ( rule__Beat__NameAssignment_1 )
            // InternalRyml.g:1760:3: rule__Beat__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Beat__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBeatAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__1__Impl"


    // $ANTLR start "rule__Beat__Group__2"
    // InternalRyml.g:1768:1: rule__Beat__Group__2 : rule__Beat__Group__2__Impl rule__Beat__Group__3 ;
    public final void rule__Beat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1772:1: ( rule__Beat__Group__2__Impl rule__Beat__Group__3 )
            // InternalRyml.g:1773:2: rule__Beat__Group__2__Impl rule__Beat__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Beat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__2"


    // $ANTLR start "rule__Beat__Group__2__Impl"
    // InternalRyml.g:1780:1: rule__Beat__Group__2__Impl : ( ':' ) ;
    public final void rule__Beat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1784:1: ( ( ':' ) )
            // InternalRyml.g:1785:1: ( ':' )
            {
            // InternalRyml.g:1785:1: ( ':' )
            // InternalRyml.g:1786:2: ':'
            {
             before(grammarAccess.getBeatAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBeatAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__2__Impl"


    // $ANTLR start "rule__Beat__Group__3"
    // InternalRyml.g:1795:1: rule__Beat__Group__3 : rule__Beat__Group__3__Impl rule__Beat__Group__4 ;
    public final void rule__Beat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1799:1: ( rule__Beat__Group__3__Impl rule__Beat__Group__4 )
            // InternalRyml.g:1800:2: rule__Beat__Group__3__Impl rule__Beat__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Beat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__3"


    // $ANTLR start "rule__Beat__Group__3__Impl"
    // InternalRyml.g:1807:1: rule__Beat__Group__3__Impl : ( ( rule__Beat__Group_3__0 )? ) ;
    public final void rule__Beat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1811:1: ( ( ( rule__Beat__Group_3__0 )? ) )
            // InternalRyml.g:1812:1: ( ( rule__Beat__Group_3__0 )? )
            {
            // InternalRyml.g:1812:1: ( ( rule__Beat__Group_3__0 )? )
            // InternalRyml.g:1813:2: ( rule__Beat__Group_3__0 )?
            {
             before(grammarAccess.getBeatAccess().getGroup_3()); 
            // InternalRyml.g:1814:2: ( rule__Beat__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRyml.g:1814:3: rule__Beat__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Beat__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBeatAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__3__Impl"


    // $ANTLR start "rule__Beat__Group__4"
    // InternalRyml.g:1822:1: rule__Beat__Group__4 : rule__Beat__Group__4__Impl rule__Beat__Group__5 ;
    public final void rule__Beat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1826:1: ( rule__Beat__Group__4__Impl rule__Beat__Group__5 )
            // InternalRyml.g:1827:2: rule__Beat__Group__4__Impl rule__Beat__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Beat__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__4"


    // $ANTLR start "rule__Beat__Group__4__Impl"
    // InternalRyml.g:1834:1: rule__Beat__Group__4__Impl : ( 'Notes :' ) ;
    public final void rule__Beat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1838:1: ( ( 'Notes :' ) )
            // InternalRyml.g:1839:1: ( 'Notes :' )
            {
            // InternalRyml.g:1839:1: ( 'Notes :' )
            // InternalRyml.g:1840:2: 'Notes :'
            {
             before(grammarAccess.getBeatAccess().getNotesKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBeatAccess().getNotesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__4__Impl"


    // $ANTLR start "rule__Beat__Group__5"
    // InternalRyml.g:1849:1: rule__Beat__Group__5 : rule__Beat__Group__5__Impl rule__Beat__Group__6 ;
    public final void rule__Beat__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1853:1: ( rule__Beat__Group__5__Impl rule__Beat__Group__6 )
            // InternalRyml.g:1854:2: rule__Beat__Group__5__Impl rule__Beat__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Beat__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__5"


    // $ANTLR start "rule__Beat__Group__5__Impl"
    // InternalRyml.g:1861:1: rule__Beat__Group__5__Impl : ( ( rule__Beat__NotesAssignment_5 ) ) ;
    public final void rule__Beat__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1865:1: ( ( ( rule__Beat__NotesAssignment_5 ) ) )
            // InternalRyml.g:1866:1: ( ( rule__Beat__NotesAssignment_5 ) )
            {
            // InternalRyml.g:1866:1: ( ( rule__Beat__NotesAssignment_5 ) )
            // InternalRyml.g:1867:2: ( rule__Beat__NotesAssignment_5 )
            {
             before(grammarAccess.getBeatAccess().getNotesAssignment_5()); 
            // InternalRyml.g:1868:2: ( rule__Beat__NotesAssignment_5 )
            // InternalRyml.g:1868:3: rule__Beat__NotesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Beat__NotesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBeatAccess().getNotesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__5__Impl"


    // $ANTLR start "rule__Beat__Group__6"
    // InternalRyml.g:1876:1: rule__Beat__Group__6 : rule__Beat__Group__6__Impl rule__Beat__Group__7 ;
    public final void rule__Beat__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1880:1: ( rule__Beat__Group__6__Impl rule__Beat__Group__7 )
            // InternalRyml.g:1881:2: rule__Beat__Group__6__Impl rule__Beat__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Beat__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__6"


    // $ANTLR start "rule__Beat__Group__6__Impl"
    // InternalRyml.g:1888:1: rule__Beat__Group__6__Impl : ( ',' ) ;
    public final void rule__Beat__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1892:1: ( ( ',' ) )
            // InternalRyml.g:1893:1: ( ',' )
            {
            // InternalRyml.g:1893:1: ( ',' )
            // InternalRyml.g:1894:2: ','
            {
             before(grammarAccess.getBeatAccess().getCommaKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBeatAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__6__Impl"


    // $ANTLR start "rule__Beat__Group__7"
    // InternalRyml.g:1903:1: rule__Beat__Group__7 : rule__Beat__Group__7__Impl rule__Beat__Group__8 ;
    public final void rule__Beat__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1907:1: ( rule__Beat__Group__7__Impl rule__Beat__Group__8 )
            // InternalRyml.g:1908:2: rule__Beat__Group__7__Impl rule__Beat__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Beat__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__7"


    // $ANTLR start "rule__Beat__Group__7__Impl"
    // InternalRyml.g:1915:1: rule__Beat__Group__7__Impl : ( ( rule__Beat__NotePositionsAssignment_7 ) ) ;
    public final void rule__Beat__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1919:1: ( ( ( rule__Beat__NotePositionsAssignment_7 ) ) )
            // InternalRyml.g:1920:1: ( ( rule__Beat__NotePositionsAssignment_7 ) )
            {
            // InternalRyml.g:1920:1: ( ( rule__Beat__NotePositionsAssignment_7 ) )
            // InternalRyml.g:1921:2: ( rule__Beat__NotePositionsAssignment_7 )
            {
             before(grammarAccess.getBeatAccess().getNotePositionsAssignment_7()); 
            // InternalRyml.g:1922:2: ( rule__Beat__NotePositionsAssignment_7 )
            // InternalRyml.g:1922:3: rule__Beat__NotePositionsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Beat__NotePositionsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBeatAccess().getNotePositionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__7__Impl"


    // $ANTLR start "rule__Beat__Group__8"
    // InternalRyml.g:1930:1: rule__Beat__Group__8 : rule__Beat__Group__8__Impl ;
    public final void rule__Beat__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1934:1: ( rule__Beat__Group__8__Impl )
            // InternalRyml.g:1935:2: rule__Beat__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Beat__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__8"


    // $ANTLR start "rule__Beat__Group__8__Impl"
    // InternalRyml.g:1941:1: rule__Beat__Group__8__Impl : ( ( rule__Beat__Group_8__0 )* ) ;
    public final void rule__Beat__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1945:1: ( ( ( rule__Beat__Group_8__0 )* ) )
            // InternalRyml.g:1946:1: ( ( rule__Beat__Group_8__0 )* )
            {
            // InternalRyml.g:1946:1: ( ( rule__Beat__Group_8__0 )* )
            // InternalRyml.g:1947:2: ( rule__Beat__Group_8__0 )*
            {
             before(grammarAccess.getBeatAccess().getGroup_8()); 
            // InternalRyml.g:1948:2: ( rule__Beat__Group_8__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRyml.g:1948:3: rule__Beat__Group_8__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Beat__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getBeatAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__8__Impl"


    // $ANTLR start "rule__Beat__Group_3__0"
    // InternalRyml.g:1957:1: rule__Beat__Group_3__0 : rule__Beat__Group_3__0__Impl rule__Beat__Group_3__1 ;
    public final void rule__Beat__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1961:1: ( rule__Beat__Group_3__0__Impl rule__Beat__Group_3__1 )
            // InternalRyml.g:1962:2: rule__Beat__Group_3__0__Impl rule__Beat__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Beat__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group_3__0"


    // $ANTLR start "rule__Beat__Group_3__0__Impl"
    // InternalRyml.g:1969:1: rule__Beat__Group_3__0__Impl : ( 'Nb of ticks : ' ) ;
    public final void rule__Beat__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1973:1: ( ( 'Nb of ticks : ' ) )
            // InternalRyml.g:1974:1: ( 'Nb of ticks : ' )
            {
            // InternalRyml.g:1974:1: ( 'Nb of ticks : ' )
            // InternalRyml.g:1975:2: 'Nb of ticks : '
            {
             before(grammarAccess.getBeatAccess().getNbOfTicksKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBeatAccess().getNbOfTicksKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group_3__0__Impl"


    // $ANTLR start "rule__Beat__Group_3__1"
    // InternalRyml.g:1984:1: rule__Beat__Group_3__1 : rule__Beat__Group_3__1__Impl ;
    public final void rule__Beat__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1988:1: ( rule__Beat__Group_3__1__Impl )
            // InternalRyml.g:1989:2: rule__Beat__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Beat__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group_3__1"


    // $ANTLR start "rule__Beat__Group_3__1__Impl"
    // InternalRyml.g:1995:1: rule__Beat__Group_3__1__Impl : ( ( rule__Beat__TotalDivNumberAssignment_3_1 ) ) ;
    public final void rule__Beat__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1999:1: ( ( ( rule__Beat__TotalDivNumberAssignment_3_1 ) ) )
            // InternalRyml.g:2000:1: ( ( rule__Beat__TotalDivNumberAssignment_3_1 ) )
            {
            // InternalRyml.g:2000:1: ( ( rule__Beat__TotalDivNumberAssignment_3_1 ) )
            // InternalRyml.g:2001:2: ( rule__Beat__TotalDivNumberAssignment_3_1 )
            {
             before(grammarAccess.getBeatAccess().getTotalDivNumberAssignment_3_1()); 
            // InternalRyml.g:2002:2: ( rule__Beat__TotalDivNumberAssignment_3_1 )
            // InternalRyml.g:2002:3: rule__Beat__TotalDivNumberAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Beat__TotalDivNumberAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBeatAccess().getTotalDivNumberAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group_3__1__Impl"


    // $ANTLR start "rule__Beat__Group_8__0"
    // InternalRyml.g:2011:1: rule__Beat__Group_8__0 : rule__Beat__Group_8__0__Impl rule__Beat__Group_8__1 ;
    public final void rule__Beat__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2015:1: ( rule__Beat__Group_8__0__Impl rule__Beat__Group_8__1 )
            // InternalRyml.g:2016:2: rule__Beat__Group_8__0__Impl rule__Beat__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__Beat__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group_8__0"


    // $ANTLR start "rule__Beat__Group_8__0__Impl"
    // InternalRyml.g:2023:1: rule__Beat__Group_8__0__Impl : ( '|' ) ;
    public final void rule__Beat__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2027:1: ( ( '|' ) )
            // InternalRyml.g:2028:1: ( '|' )
            {
            // InternalRyml.g:2028:1: ( '|' )
            // InternalRyml.g:2029:2: '|'
            {
             before(grammarAccess.getBeatAccess().getVerticalLineKeyword_8_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBeatAccess().getVerticalLineKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group_8__0__Impl"


    // $ANTLR start "rule__Beat__Group_8__1"
    // InternalRyml.g:2038:1: rule__Beat__Group_8__1 : rule__Beat__Group_8__1__Impl rule__Beat__Group_8__2 ;
    public final void rule__Beat__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2042:1: ( rule__Beat__Group_8__1__Impl rule__Beat__Group_8__2 )
            // InternalRyml.g:2043:2: rule__Beat__Group_8__1__Impl rule__Beat__Group_8__2
            {
            pushFollow(FOLLOW_20);
            rule__Beat__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group_8__1"


    // $ANTLR start "rule__Beat__Group_8__1__Impl"
    // InternalRyml.g:2050:1: rule__Beat__Group_8__1__Impl : ( ( rule__Beat__NotesAssignment_8_1 ) ) ;
    public final void rule__Beat__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2054:1: ( ( ( rule__Beat__NotesAssignment_8_1 ) ) )
            // InternalRyml.g:2055:1: ( ( rule__Beat__NotesAssignment_8_1 ) )
            {
            // InternalRyml.g:2055:1: ( ( rule__Beat__NotesAssignment_8_1 ) )
            // InternalRyml.g:2056:2: ( rule__Beat__NotesAssignment_8_1 )
            {
             before(grammarAccess.getBeatAccess().getNotesAssignment_8_1()); 
            // InternalRyml.g:2057:2: ( rule__Beat__NotesAssignment_8_1 )
            // InternalRyml.g:2057:3: rule__Beat__NotesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Beat__NotesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getBeatAccess().getNotesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group_8__1__Impl"


    // $ANTLR start "rule__Beat__Group_8__2"
    // InternalRyml.g:2065:1: rule__Beat__Group_8__2 : rule__Beat__Group_8__2__Impl rule__Beat__Group_8__3 ;
    public final void rule__Beat__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2069:1: ( rule__Beat__Group_8__2__Impl rule__Beat__Group_8__3 )
            // InternalRyml.g:2070:2: rule__Beat__Group_8__2__Impl rule__Beat__Group_8__3
            {
            pushFollow(FOLLOW_6);
            rule__Beat__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group_8__2"


    // $ANTLR start "rule__Beat__Group_8__2__Impl"
    // InternalRyml.g:2077:1: rule__Beat__Group_8__2__Impl : ( ',' ) ;
    public final void rule__Beat__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2081:1: ( ( ',' ) )
            // InternalRyml.g:2082:1: ( ',' )
            {
            // InternalRyml.g:2082:1: ( ',' )
            // InternalRyml.g:2083:2: ','
            {
             before(grammarAccess.getBeatAccess().getCommaKeyword_8_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBeatAccess().getCommaKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group_8__2__Impl"


    // $ANTLR start "rule__Beat__Group_8__3"
    // InternalRyml.g:2092:1: rule__Beat__Group_8__3 : rule__Beat__Group_8__3__Impl ;
    public final void rule__Beat__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2096:1: ( rule__Beat__Group_8__3__Impl )
            // InternalRyml.g:2097:2: rule__Beat__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Beat__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group_8__3"


    // $ANTLR start "rule__Beat__Group_8__3__Impl"
    // InternalRyml.g:2103:1: rule__Beat__Group_8__3__Impl : ( ( rule__Beat__NotePositionsAssignment_8_3 ) ) ;
    public final void rule__Beat__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2107:1: ( ( ( rule__Beat__NotePositionsAssignment_8_3 ) ) )
            // InternalRyml.g:2108:1: ( ( rule__Beat__NotePositionsAssignment_8_3 ) )
            {
            // InternalRyml.g:2108:1: ( ( rule__Beat__NotePositionsAssignment_8_3 ) )
            // InternalRyml.g:2109:2: ( rule__Beat__NotePositionsAssignment_8_3 )
            {
             before(grammarAccess.getBeatAccess().getNotePositionsAssignment_8_3()); 
            // InternalRyml.g:2110:2: ( rule__Beat__NotePositionsAssignment_8_3 )
            // InternalRyml.g:2110:3: rule__Beat__NotePositionsAssignment_8_3
            {
            pushFollow(FOLLOW_2);
            rule__Beat__NotePositionsAssignment_8_3();

            state._fsp--;


            }

             after(grammarAccess.getBeatAccess().getNotePositionsAssignment_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group_8__3__Impl"


    // $ANTLR start "rule__Note__Group__0"
    // InternalRyml.g:2119:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2123:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // InternalRyml.g:2124:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Note__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__0"


    // $ANTLR start "rule__Note__Group__0__Impl"
    // InternalRyml.g:2131:1: rule__Note__Group__0__Impl : ( 'Note' ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2135:1: ( ( 'Note' ) )
            // InternalRyml.g:2136:1: ( 'Note' )
            {
            // InternalRyml.g:2136:1: ( 'Note' )
            // InternalRyml.g:2137:2: 'Note'
            {
             before(grammarAccess.getNoteAccess().getNoteKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getNoteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__0__Impl"


    // $ANTLR start "rule__Note__Group__1"
    // InternalRyml.g:2146:1: rule__Note__Group__1 : rule__Note__Group__1__Impl rule__Note__Group__2 ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2150:1: ( rule__Note__Group__1__Impl rule__Note__Group__2 )
            // InternalRyml.g:2151:2: rule__Note__Group__1__Impl rule__Note__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Note__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__1"


    // $ANTLR start "rule__Note__Group__1__Impl"
    // InternalRyml.g:2158:1: rule__Note__Group__1__Impl : ( ( rule__Note__NameAssignment_1 ) ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2162:1: ( ( ( rule__Note__NameAssignment_1 ) ) )
            // InternalRyml.g:2163:1: ( ( rule__Note__NameAssignment_1 ) )
            {
            // InternalRyml.g:2163:1: ( ( rule__Note__NameAssignment_1 ) )
            // InternalRyml.g:2164:2: ( rule__Note__NameAssignment_1 )
            {
             before(grammarAccess.getNoteAccess().getNameAssignment_1()); 
            // InternalRyml.g:2165:2: ( rule__Note__NameAssignment_1 )
            // InternalRyml.g:2165:3: rule__Note__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Note__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__1__Impl"


    // $ANTLR start "rule__Note__Group__2"
    // InternalRyml.g:2173:1: rule__Note__Group__2 : rule__Note__Group__2__Impl rule__Note__Group__3 ;
    public final void rule__Note__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2177:1: ( rule__Note__Group__2__Impl rule__Note__Group__3 )
            // InternalRyml.g:2178:2: rule__Note__Group__2__Impl rule__Note__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Note__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__2"


    // $ANTLR start "rule__Note__Group__2__Impl"
    // InternalRyml.g:2185:1: rule__Note__Group__2__Impl : ( ':' ) ;
    public final void rule__Note__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2189:1: ( ( ':' ) )
            // InternalRyml.g:2190:1: ( ':' )
            {
            // InternalRyml.g:2190:1: ( ':' )
            // InternalRyml.g:2191:2: ':'
            {
             before(grammarAccess.getNoteAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__2__Impl"


    // $ANTLR start "rule__Note__Group__3"
    // InternalRyml.g:2200:1: rule__Note__Group__3 : rule__Note__Group__3__Impl ;
    public final void rule__Note__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2204:1: ( rule__Note__Group__3__Impl )
            // InternalRyml.g:2205:2: rule__Note__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__3"


    // $ANTLR start "rule__Note__Group__3__Impl"
    // InternalRyml.g:2211:1: rule__Note__Group__3__Impl : ( ( rule__Note__ValueAssignment_3 )? ) ;
    public final void rule__Note__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2215:1: ( ( ( rule__Note__ValueAssignment_3 )? ) )
            // InternalRyml.g:2216:1: ( ( rule__Note__ValueAssignment_3 )? )
            {
            // InternalRyml.g:2216:1: ( ( rule__Note__ValueAssignment_3 )? )
            // InternalRyml.g:2217:2: ( rule__Note__ValueAssignment_3 )?
            {
             before(grammarAccess.getNoteAccess().getValueAssignment_3()); 
            // InternalRyml.g:2218:2: ( rule__Note__ValueAssignment_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=11 && LA20_0<=21)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRyml.g:2218:3: rule__Note__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__ValueAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__3__Impl"


    // $ANTLR start "rule__Music__UnorderedGroup"
    // InternalRyml.g:2227:1: rule__Music__UnorderedGroup : rule__Music__UnorderedGroup__0 {...}?;
    public final void rule__Music__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMusicAccess().getUnorderedGroup());
        	
        try {
            // InternalRyml.g:2232:1: ( rule__Music__UnorderedGroup__0 {...}?)
            // InternalRyml.g:2233:2: rule__Music__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Music__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMusicAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__Music__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getMusicAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMusicAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__UnorderedGroup"


    // $ANTLR start "rule__Music__UnorderedGroup__Impl"
    // InternalRyml.g:2241:1: rule__Music__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Music__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_3__0 ) ) ) ) ) ;
    public final void rule__Music__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRyml.g:2246:1: ( ( ({...}? => ( ( ( rule__Music__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_3__0 ) ) ) ) ) )
            // InternalRyml.g:2247:3: ( ({...}? => ( ( ( rule__Music__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_3__0 ) ) ) ) )
            {
            // InternalRyml.g:2247:3: ( ({...}? => ( ( ( rule__Music__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_3__0 ) ) ) ) )
            int alt21=4;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1) ) {
                alt21=2;
            }
            else if ( LA21_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2) ) {
                alt21=3;
            }
            else if ( ( LA21_0 == 28 || LA21_0 == 31 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3) ) {
                alt21=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalRyml.g:2248:3: ({...}? => ( ( ( rule__Music__Group_0__0 ) ) ) )
                    {
                    // InternalRyml.g:2248:3: ({...}? => ( ( ( rule__Music__Group_0__0 ) ) ) )
                    // InternalRyml.g:2249:4: {...}? => ( ( ( rule__Music__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Music__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalRyml.g:2249:99: ( ( ( rule__Music__Group_0__0 ) ) )
                    // InternalRyml.g:2250:5: ( ( rule__Music__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRyml.g:2256:5: ( ( rule__Music__Group_0__0 ) )
                    // InternalRyml.g:2257:6: ( rule__Music__Group_0__0 )
                    {
                     before(grammarAccess.getMusicAccess().getGroup_0()); 
                    // InternalRyml.g:2258:6: ( rule__Music__Group_0__0 )
                    // InternalRyml.g:2258:7: rule__Music__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMusicAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRyml.g:2263:3: ({...}? => ( ( ( rule__Music__Group_1__0 ) ) ) )
                    {
                    // InternalRyml.g:2263:3: ({...}? => ( ( ( rule__Music__Group_1__0 ) ) ) )
                    // InternalRyml.g:2264:4: {...}? => ( ( ( rule__Music__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Music__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalRyml.g:2264:99: ( ( ( rule__Music__Group_1__0 ) ) )
                    // InternalRyml.g:2265:5: ( ( rule__Music__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRyml.g:2271:5: ( ( rule__Music__Group_1__0 ) )
                    // InternalRyml.g:2272:6: ( rule__Music__Group_1__0 )
                    {
                     before(grammarAccess.getMusicAccess().getGroup_1()); 
                    // InternalRyml.g:2273:6: ( rule__Music__Group_1__0 )
                    // InternalRyml.g:2273:7: rule__Music__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMusicAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRyml.g:2278:3: ({...}? => ( ( ( rule__Music__Group_2__0 ) ) ) )
                    {
                    // InternalRyml.g:2278:3: ({...}? => ( ( ( rule__Music__Group_2__0 ) ) ) )
                    // InternalRyml.g:2279:4: {...}? => ( ( ( rule__Music__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Music__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalRyml.g:2279:99: ( ( ( rule__Music__Group_2__0 ) ) )
                    // InternalRyml.g:2280:5: ( ( rule__Music__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRyml.g:2286:5: ( ( rule__Music__Group_2__0 ) )
                    // InternalRyml.g:2287:6: ( rule__Music__Group_2__0 )
                    {
                     before(grammarAccess.getMusicAccess().getGroup_2()); 
                    // InternalRyml.g:2288:6: ( rule__Music__Group_2__0 )
                    // InternalRyml.g:2288:7: rule__Music__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMusicAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRyml.g:2293:3: ({...}? => ( ( ( rule__Music__Group_3__0 ) ) ) )
                    {
                    // InternalRyml.g:2293:3: ({...}? => ( ( ( rule__Music__Group_3__0 ) ) ) )
                    // InternalRyml.g:2294:4: {...}? => ( ( ( rule__Music__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Music__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalRyml.g:2294:99: ( ( ( rule__Music__Group_3__0 ) ) )
                    // InternalRyml.g:2295:5: ( ( rule__Music__Group_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 3);
                    				

                    					selected = true;
                    				
                    // InternalRyml.g:2301:5: ( ( rule__Music__Group_3__0 ) )
                    // InternalRyml.g:2302:6: ( rule__Music__Group_3__0 )
                    {
                     before(grammarAccess.getMusicAccess().getGroup_3()); 
                    // InternalRyml.g:2303:6: ( rule__Music__Group_3__0 )
                    // InternalRyml.g:2303:7: rule__Music__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMusicAccess().getGroup_3()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMusicAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__UnorderedGroup__Impl"


    // $ANTLR start "rule__Music__UnorderedGroup__0"
    // InternalRyml.g:2316:1: rule__Music__UnorderedGroup__0 : rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__1 )? ;
    public final void rule__Music__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2320:1: ( rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__1 )? )
            // InternalRyml.g:2321:2: rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_22);
            rule__Music__UnorderedGroup__Impl();

            state._fsp--;

            // InternalRyml.g:2322:2: ( rule__Music__UnorderedGroup__1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1) ) {
                alt22=1;
            }
            else if ( LA22_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2) ) {
                alt22=1;
            }
            else if ( ( LA22_0 == 28 || LA22_0 == 31 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRyml.g:2322:2: rule__Music__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__UnorderedGroup__0"


    // $ANTLR start "rule__Music__UnorderedGroup__1"
    // InternalRyml.g:2328:1: rule__Music__UnorderedGroup__1 : rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__2 )? ;
    public final void rule__Music__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2332:1: ( rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__2 )? )
            // InternalRyml.g:2333:2: rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_22);
            rule__Music__UnorderedGroup__Impl();

            state._fsp--;

            // InternalRyml.g:2334:2: ( rule__Music__UnorderedGroup__2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1) ) {
                alt23=1;
            }
            else if ( LA23_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2) ) {
                alt23=1;
            }
            else if ( ( LA23_0 == 28 || LA23_0 == 31 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRyml.g:2334:2: rule__Music__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__UnorderedGroup__1"


    // $ANTLR start "rule__Music__UnorderedGroup__2"
    // InternalRyml.g:2340:1: rule__Music__UnorderedGroup__2 : rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__3 )? ;
    public final void rule__Music__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2344:1: ( rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__3 )? )
            // InternalRyml.g:2345:2: rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_22);
            rule__Music__UnorderedGroup__Impl();

            state._fsp--;

            // InternalRyml.g:2346:2: ( rule__Music__UnorderedGroup__3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1) ) {
                alt24=1;
            }
            else if ( LA24_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2) ) {
                alt24=1;
            }
            else if ( ( LA24_0 == 28 || LA24_0 == 31 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRyml.g:2346:2: rule__Music__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__UnorderedGroup__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__UnorderedGroup__2"


    // $ANTLR start "rule__Music__UnorderedGroup__3"
    // InternalRyml.g:2352:1: rule__Music__UnorderedGroup__3 : rule__Music__UnorderedGroup__Impl ;
    public final void rule__Music__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2356:1: ( rule__Music__UnorderedGroup__Impl )
            // InternalRyml.g:2357:2: rule__Music__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__UnorderedGroup__3"


    // $ANTLR start "rule__Music__NameAssignment_0_1"
    // InternalRyml.g:2364:1: rule__Music__NameAssignment_0_1 : ( ruleEString ) ;
    public final void rule__Music__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2368:1: ( ( ruleEString ) )
            // InternalRyml.g:2369:2: ( ruleEString )
            {
            // InternalRyml.g:2369:2: ( ruleEString )
            // InternalRyml.g:2370:3: ruleEString
            {
             before(grammarAccess.getMusicAccess().getNameEStringParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getNameEStringParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__NameAssignment_0_1"


    // $ANTLR start "rule__Music__TitleAssignment_0_3_1"
    // InternalRyml.g:2379:1: rule__Music__TitleAssignment_0_3_1 : ( ruleEString ) ;
    public final void rule__Music__TitleAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2383:1: ( ( ruleEString ) )
            // InternalRyml.g:2384:2: ( ruleEString )
            {
            // InternalRyml.g:2384:2: ( ruleEString )
            // InternalRyml.g:2385:3: ruleEString
            {
             before(grammarAccess.getMusicAccess().getTitleEStringParserRuleCall_0_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getTitleEStringParserRuleCall_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__TitleAssignment_0_3_1"


    // $ANTLR start "rule__Music__AuthorAssignment_0_4_1"
    // InternalRyml.g:2394:1: rule__Music__AuthorAssignment_0_4_1 : ( ruleEString ) ;
    public final void rule__Music__AuthorAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2398:1: ( ( ruleEString ) )
            // InternalRyml.g:2399:2: ( ruleEString )
            {
            // InternalRyml.g:2399:2: ( ruleEString )
            // InternalRyml.g:2400:3: ruleEString
            {
             before(grammarAccess.getMusicAccess().getAuthorEStringParserRuleCall_0_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getAuthorEStringParserRuleCall_0_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__AuthorAssignment_0_4_1"


    // $ANTLR start "rule__Music__BpmAssignment_0_5_1"
    // InternalRyml.g:2409:1: rule__Music__BpmAssignment_0_5_1 : ( ruleEInt ) ;
    public final void rule__Music__BpmAssignment_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2413:1: ( ( ruleEInt ) )
            // InternalRyml.g:2414:2: ( ruleEInt )
            {
            // InternalRyml.g:2414:2: ( ruleEInt )
            // InternalRyml.g:2415:3: ruleEInt
            {
             before(grammarAccess.getMusicAccess().getBpmEIntParserRuleCall_0_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getBpmEIntParserRuleCall_0_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__BpmAssignment_0_5_1"


    // $ANTLR start "rule__Music__ResolutionPerSlideAssignment_0_6_1"
    // InternalRyml.g:2424:1: rule__Music__ResolutionPerSlideAssignment_0_6_1 : ( ruleEInt ) ;
    public final void rule__Music__ResolutionPerSlideAssignment_0_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2428:1: ( ( ruleEInt ) )
            // InternalRyml.g:2429:2: ( ruleEInt )
            {
            // InternalRyml.g:2429:2: ( ruleEInt )
            // InternalRyml.g:2430:3: ruleEInt
            {
             before(grammarAccess.getMusicAccess().getResolutionPerSlideEIntParserRuleCall_0_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getResolutionPerSlideEIntParserRuleCall_0_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__ResolutionPerSlideAssignment_0_6_1"


    // $ANTLR start "rule__Music__OwnedNotesAssignment_0_7_0"
    // InternalRyml.g:2439:1: rule__Music__OwnedNotesAssignment_0_7_0 : ( ruleNote ) ;
    public final void rule__Music__OwnedNotesAssignment_0_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2443:1: ( ( ruleNote ) )
            // InternalRyml.g:2444:2: ( ruleNote )
            {
            // InternalRyml.g:2444:2: ( ruleNote )
            // InternalRyml.g:2445:3: ruleNote
            {
             before(grammarAccess.getMusicAccess().getOwnedNotesNoteParserRuleCall_0_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedNotesNoteParserRuleCall_0_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__OwnedNotesAssignment_0_7_0"


    // $ANTLR start "rule__Music__OwnedNotesAssignment_0_7_1"
    // InternalRyml.g:2454:1: rule__Music__OwnedNotesAssignment_0_7_1 : ( ruleNote ) ;
    public final void rule__Music__OwnedNotesAssignment_0_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2458:1: ( ( ruleNote ) )
            // InternalRyml.g:2459:2: ( ruleNote )
            {
            // InternalRyml.g:2459:2: ( ruleNote )
            // InternalRyml.g:2460:3: ruleNote
            {
             before(grammarAccess.getMusicAccess().getOwnedNotesNoteParserRuleCall_0_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedNotesNoteParserRuleCall_0_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__OwnedNotesAssignment_0_7_1"


    // $ANTLR start "rule__Music__OwnedBeatsAssignment_1_0"
    // InternalRyml.g:2469:1: rule__Music__OwnedBeatsAssignment_1_0 : ( ruleBeat ) ;
    public final void rule__Music__OwnedBeatsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2473:1: ( ( ruleBeat ) )
            // InternalRyml.g:2474:2: ( ruleBeat )
            {
            // InternalRyml.g:2474:2: ( ruleBeat )
            // InternalRyml.g:2475:3: ruleBeat
            {
             before(grammarAccess.getMusicAccess().getOwnedBeatsBeatParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBeat();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedBeatsBeatParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__OwnedBeatsAssignment_1_0"


    // $ANTLR start "rule__Music__OwnedBeatsAssignment_1_1"
    // InternalRyml.g:2484:1: rule__Music__OwnedBeatsAssignment_1_1 : ( ruleBeat ) ;
    public final void rule__Music__OwnedBeatsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2488:1: ( ( ruleBeat ) )
            // InternalRyml.g:2489:2: ( ruleBeat )
            {
            // InternalRyml.g:2489:2: ( ruleBeat )
            // InternalRyml.g:2490:3: ruleBeat
            {
             before(grammarAccess.getMusicAccess().getOwnedBeatsBeatParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBeat();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedBeatsBeatParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__OwnedBeatsAssignment_1_1"


    // $ANTLR start "rule__Music__OwnedBarsAssignment_2_0"
    // InternalRyml.g:2499:1: rule__Music__OwnedBarsAssignment_2_0 : ( ruleBar ) ;
    public final void rule__Music__OwnedBarsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2503:1: ( ( ruleBar ) )
            // InternalRyml.g:2504:2: ( ruleBar )
            {
            // InternalRyml.g:2504:2: ( ruleBar )
            // InternalRyml.g:2505:3: ruleBar
            {
             before(grammarAccess.getMusicAccess().getOwnedBarsBarParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBar();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedBarsBarParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__OwnedBarsAssignment_2_0"


    // $ANTLR start "rule__Music__OwnedBarsAssignment_2_1"
    // InternalRyml.g:2514:1: rule__Music__OwnedBarsAssignment_2_1 : ( ruleBar ) ;
    public final void rule__Music__OwnedBarsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2518:1: ( ( ruleBar ) )
            // InternalRyml.g:2519:2: ( ruleBar )
            {
            // InternalRyml.g:2519:2: ( ruleBar )
            // InternalRyml.g:2520:3: ruleBar
            {
             before(grammarAccess.getMusicAccess().getOwnedBarsBarParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBar();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedBarsBarParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__OwnedBarsAssignment_2_1"


    // $ANTLR start "rule__Music__OwnedPatternsAssignment_3_0_0"
    // InternalRyml.g:2529:1: rule__Music__OwnedPatternsAssignment_3_0_0 : ( rulePattern ) ;
    public final void rule__Music__OwnedPatternsAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2533:1: ( ( rulePattern ) )
            // InternalRyml.g:2534:2: ( rulePattern )
            {
            // InternalRyml.g:2534:2: ( rulePattern )
            // InternalRyml.g:2535:3: rulePattern
            {
             before(grammarAccess.getMusicAccess().getOwnedPatternsPatternParserRuleCall_3_0_0_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedPatternsPatternParserRuleCall_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__OwnedPatternsAssignment_3_0_0"


    // $ANTLR start "rule__Music__OwnedPatternsAssignment_3_0_1"
    // InternalRyml.g:2544:1: rule__Music__OwnedPatternsAssignment_3_0_1 : ( rulePattern ) ;
    public final void rule__Music__OwnedPatternsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2548:1: ( ( rulePattern ) )
            // InternalRyml.g:2549:2: ( rulePattern )
            {
            // InternalRyml.g:2549:2: ( rulePattern )
            // InternalRyml.g:2550:3: rulePattern
            {
             before(grammarAccess.getMusicAccess().getOwnedPatternsPatternParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedPatternsPatternParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__OwnedPatternsAssignment_3_0_1"


    // $ANTLR start "rule__Music__OwnedSectionsAssignment_3_1"
    // InternalRyml.g:2559:1: rule__Music__OwnedSectionsAssignment_3_1 : ( ruleSection ) ;
    public final void rule__Music__OwnedSectionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2563:1: ( ( ruleSection ) )
            // InternalRyml.g:2564:2: ( ruleSection )
            {
            // InternalRyml.g:2564:2: ( ruleSection )
            // InternalRyml.g:2565:3: ruleSection
            {
             before(grammarAccess.getMusicAccess().getOwnedSectionsSectionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedSectionsSectionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__OwnedSectionsAssignment_3_1"


    // $ANTLR start "rule__Music__OwnedSectionsAssignment_3_2"
    // InternalRyml.g:2574:1: rule__Music__OwnedSectionsAssignment_3_2 : ( ruleSection ) ;
    public final void rule__Music__OwnedSectionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2578:1: ( ( ruleSection ) )
            // InternalRyml.g:2579:2: ( ruleSection )
            {
            // InternalRyml.g:2579:2: ( ruleSection )
            // InternalRyml.g:2580:3: ruleSection
            {
             before(grammarAccess.getMusicAccess().getOwnedSectionsSectionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedSectionsSectionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__OwnedSectionsAssignment_3_2"


    // $ANTLR start "rule__Section__NameAssignment_1"
    // InternalRyml.g:2589:1: rule__Section__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Section__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2593:1: ( ( ruleEString ) )
            // InternalRyml.g:2594:2: ( ruleEString )
            {
            // InternalRyml.g:2594:2: ( ruleEString )
            // InternalRyml.g:2595:3: ruleEString
            {
             before(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__NameAssignment_1"


    // $ANTLR start "rule__Section__PatternsAssignment_3"
    // InternalRyml.g:2604:1: rule__Section__PatternsAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Section__PatternsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2608:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:2609:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:2609:2: ( ( ruleEString ) )
            // InternalRyml.g:2610:3: ( ruleEString )
            {
             before(grammarAccess.getSectionAccess().getPatternsPatternCrossReference_3_0()); 
            // InternalRyml.g:2611:3: ( ruleEString )
            // InternalRyml.g:2612:4: ruleEString
            {
             before(grammarAccess.getSectionAccess().getPatternsPatternEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getPatternsPatternEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSectionAccess().getPatternsPatternCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__PatternsAssignment_3"


    // $ANTLR start "rule__Section__PatternsAssignment_4_1"
    // InternalRyml.g:2623:1: rule__Section__PatternsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Section__PatternsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2627:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:2628:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:2628:2: ( ( ruleEString ) )
            // InternalRyml.g:2629:3: ( ruleEString )
            {
             before(grammarAccess.getSectionAccess().getPatternsPatternCrossReference_4_1_0()); 
            // InternalRyml.g:2630:3: ( ruleEString )
            // InternalRyml.g:2631:4: ruleEString
            {
             before(grammarAccess.getSectionAccess().getPatternsPatternEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getPatternsPatternEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSectionAccess().getPatternsPatternCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__PatternsAssignment_4_1"


    // $ANTLR start "rule__Pattern__NameAssignment_1"
    // InternalRyml.g:2642:1: rule__Pattern__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2646:1: ( ( ruleEString ) )
            // InternalRyml.g:2647:2: ( ruleEString )
            {
            // InternalRyml.g:2647:2: ( ruleEString )
            // InternalRyml.g:2648:3: ruleEString
            {
             before(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__NameAssignment_1"


    // $ANTLR start "rule__Pattern__BarsAssignment_3"
    // InternalRyml.g:2657:1: rule__Pattern__BarsAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Pattern__BarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2661:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:2662:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:2662:2: ( ( ruleEString ) )
            // InternalRyml.g:2663:3: ( ruleEString )
            {
             before(grammarAccess.getPatternAccess().getBarsBarCrossReference_3_0()); 
            // InternalRyml.g:2664:3: ( ruleEString )
            // InternalRyml.g:2665:4: ruleEString
            {
             before(grammarAccess.getPatternAccess().getBarsBarEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getBarsBarEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPatternAccess().getBarsBarCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__BarsAssignment_3"


    // $ANTLR start "rule__Pattern__BarsAssignment_4_1"
    // InternalRyml.g:2676:1: rule__Pattern__BarsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Pattern__BarsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2680:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:2681:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:2681:2: ( ( ruleEString ) )
            // InternalRyml.g:2682:3: ( ruleEString )
            {
             before(grammarAccess.getPatternAccess().getBarsBarCrossReference_4_1_0()); 
            // InternalRyml.g:2683:3: ( ruleEString )
            // InternalRyml.g:2684:4: ruleEString
            {
             before(grammarAccess.getPatternAccess().getBarsBarEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getBarsBarEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getPatternAccess().getBarsBarCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__BarsAssignment_4_1"


    // $ANTLR start "rule__Bar__NameAssignment_1"
    // InternalRyml.g:2695:1: rule__Bar__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Bar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2699:1: ( ( ruleEString ) )
            // InternalRyml.g:2700:2: ( ruleEString )
            {
            // InternalRyml.g:2700:2: ( ruleEString )
            // InternalRyml.g:2701:3: ruleEString
            {
             before(grammarAccess.getBarAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bar__NameAssignment_1"


    // $ANTLR start "rule__Bar__BeatsAssignment_3"
    // InternalRyml.g:2710:1: rule__Bar__BeatsAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Bar__BeatsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2714:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:2715:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:2715:2: ( ( ruleEString ) )
            // InternalRyml.g:2716:3: ( ruleEString )
            {
             before(grammarAccess.getBarAccess().getBeatsBeatCrossReference_3_0()); 
            // InternalRyml.g:2717:3: ( ruleEString )
            // InternalRyml.g:2718:4: ruleEString
            {
             before(grammarAccess.getBarAccess().getBeatsBeatEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarAccess().getBeatsBeatEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getBarAccess().getBeatsBeatCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bar__BeatsAssignment_3"


    // $ANTLR start "rule__Bar__BeatsAssignment_4_1"
    // InternalRyml.g:2729:1: rule__Bar__BeatsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Bar__BeatsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2733:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:2734:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:2734:2: ( ( ruleEString ) )
            // InternalRyml.g:2735:3: ( ruleEString )
            {
             before(grammarAccess.getBarAccess().getBeatsBeatCrossReference_4_1_0()); 
            // InternalRyml.g:2736:3: ( ruleEString )
            // InternalRyml.g:2737:4: ruleEString
            {
             before(grammarAccess.getBarAccess().getBeatsBeatEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarAccess().getBeatsBeatEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getBarAccess().getBeatsBeatCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bar__BeatsAssignment_4_1"


    // $ANTLR start "rule__Beat__NameAssignment_1"
    // InternalRyml.g:2748:1: rule__Beat__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Beat__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2752:1: ( ( ruleEString ) )
            // InternalRyml.g:2753:2: ( ruleEString )
            {
            // InternalRyml.g:2753:2: ( ruleEString )
            // InternalRyml.g:2754:3: ruleEString
            {
             before(grammarAccess.getBeatAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBeatAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__NameAssignment_1"


    // $ANTLR start "rule__Beat__TotalDivNumberAssignment_3_1"
    // InternalRyml.g:2763:1: rule__Beat__TotalDivNumberAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Beat__TotalDivNumberAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2767:1: ( ( ruleEInt ) )
            // InternalRyml.g:2768:2: ( ruleEInt )
            {
            // InternalRyml.g:2768:2: ( ruleEInt )
            // InternalRyml.g:2769:3: ruleEInt
            {
             before(grammarAccess.getBeatAccess().getTotalDivNumberEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBeatAccess().getTotalDivNumberEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__TotalDivNumberAssignment_3_1"


    // $ANTLR start "rule__Beat__NotesAssignment_5"
    // InternalRyml.g:2778:1: rule__Beat__NotesAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Beat__NotesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2782:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:2783:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:2783:2: ( ( ruleEString ) )
            // InternalRyml.g:2784:3: ( ruleEString )
            {
             before(grammarAccess.getBeatAccess().getNotesNoteCrossReference_5_0()); 
            // InternalRyml.g:2785:3: ( ruleEString )
            // InternalRyml.g:2786:4: ruleEString
            {
             before(grammarAccess.getBeatAccess().getNotesNoteEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBeatAccess().getNotesNoteEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getBeatAccess().getNotesNoteCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__NotesAssignment_5"


    // $ANTLR start "rule__Beat__NotePositionsAssignment_7"
    // InternalRyml.g:2797:1: rule__Beat__NotePositionsAssignment_7 : ( ruleEInt ) ;
    public final void rule__Beat__NotePositionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2801:1: ( ( ruleEInt ) )
            // InternalRyml.g:2802:2: ( ruleEInt )
            {
            // InternalRyml.g:2802:2: ( ruleEInt )
            // InternalRyml.g:2803:3: ruleEInt
            {
             before(grammarAccess.getBeatAccess().getNotePositionsEIntParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBeatAccess().getNotePositionsEIntParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__NotePositionsAssignment_7"


    // $ANTLR start "rule__Beat__NotesAssignment_8_1"
    // InternalRyml.g:2812:1: rule__Beat__NotesAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__Beat__NotesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2816:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:2817:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:2817:2: ( ( ruleEString ) )
            // InternalRyml.g:2818:3: ( ruleEString )
            {
             before(grammarAccess.getBeatAccess().getNotesNoteCrossReference_8_1_0()); 
            // InternalRyml.g:2819:3: ( ruleEString )
            // InternalRyml.g:2820:4: ruleEString
            {
             before(grammarAccess.getBeatAccess().getNotesNoteEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBeatAccess().getNotesNoteEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getBeatAccess().getNotesNoteCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__NotesAssignment_8_1"


    // $ANTLR start "rule__Beat__NotePositionsAssignment_8_3"
    // InternalRyml.g:2831:1: rule__Beat__NotePositionsAssignment_8_3 : ( ruleEInt ) ;
    public final void rule__Beat__NotePositionsAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2835:1: ( ( ruleEInt ) )
            // InternalRyml.g:2836:2: ( ruleEInt )
            {
            // InternalRyml.g:2836:2: ( ruleEInt )
            // InternalRyml.g:2837:3: ruleEInt
            {
             before(grammarAccess.getBeatAccess().getNotePositionsEIntParserRuleCall_8_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBeatAccess().getNotePositionsEIntParserRuleCall_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__NotePositionsAssignment_8_3"


    // $ANTLR start "rule__Note__NameAssignment_1"
    // InternalRyml.g:2846:1: rule__Note__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Note__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2850:1: ( ( ruleEString ) )
            // InternalRyml.g:2851:2: ( ruleEString )
            {
            // InternalRyml.g:2851:2: ( ruleEString )
            // InternalRyml.g:2852:3: ruleEString
            {
             before(grammarAccess.getNoteAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__NameAssignment_1"


    // $ANTLR start "rule__Note__ValueAssignment_3"
    // InternalRyml.g:2861:1: rule__Note__ValueAssignment_3 : ( ruleDrumNoteValue ) ;
    public final void rule__Note__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2865:1: ( ( ruleDrumNoteValue ) )
            // InternalRyml.g:2866:2: ( ruleDrumNoteValue )
            {
            // InternalRyml.g:2866:2: ( ruleDrumNoteValue )
            // InternalRyml.g:2867:3: ruleDrumNoteValue
            {
             before(grammarAccess.getNoteAccess().getValueDrumNoteValueEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDrumNoteValue();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getValueDrumNoteValueEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__ValueAssignment_3"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\1\16\uffff";
    static final String dfa_3s = "\1\26\1\uffff\1\4\2\27\1\42\1\6\1\4\1\6\1\42\2\43\2\6\1\uffff";
    static final String dfa_4s = "\1\41\1\uffff\1\5\2\27\1\44\1\36\1\5\1\6\1\42\2\43\1\36\1\6\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\14\uffff\1\1";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\5\uffff\1\1\2\uffff\2\1\1\2",
            "",
            "\1\3\1\4",
            "\1\5",
            "\1\5",
            "\1\7\1\uffff\1\6",
            "\1\11\27\uffff\1\10",
            "\1\12\1\13",
            "\1\11",
            "\1\7",
            "\1\14",
            "\1\14",
            "\1\16\27\uffff\1\15",
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

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 895:2: ( rule__Music__OwnedBeatsAssignment_1_1 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000200F000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000003FF800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000390400002L});

}
