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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SD'", "'BD'", "'CH'", "'OH'", "'CC'", "'RC'", "'TM'", "'TO'", "'S'", "'WS'", "'L'", "'Music'", "':'", "'title :'", "'author :'", "'bpm :'", "'resolution per beats : '", "'Section'", "'|'", "'-'", "'Pattern'", "'x'", "'beat'", "'add'", "'delete'", "'replace'", "'by'", "'Bar'", "'based on'", "'Modifications:'", "'Beat'", "','", "'Nb of ticks :'", "'Note'"
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
    // InternalRyml.g:62:1: ruleMusic : ( ( rule__Music__Group__0 ) ) ;
    public final void ruleMusic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:66:2: ( ( ( rule__Music__Group__0 ) ) )
            // InternalRyml.g:67:2: ( ( rule__Music__Group__0 ) )
            {
            // InternalRyml.g:67:2: ( ( rule__Music__Group__0 ) )
            // InternalRyml.g:68:3: ( rule__Music__Group__0 )
            {
             before(grammarAccess.getMusicAccess().getGroup()); 
            // InternalRyml.g:69:3: ( rule__Music__Group__0 )
            // InternalRyml.g:69:4: rule__Music__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getGroup()); 

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


    // $ANTLR start "entryRuleBarMultiplier"
    // InternalRyml.g:178:1: entryRuleBarMultiplier : ruleBarMultiplier EOF ;
    public final void entryRuleBarMultiplier() throws RecognitionException {
        try {
            // InternalRyml.g:179:1: ( ruleBarMultiplier EOF )
            // InternalRyml.g:180:1: ruleBarMultiplier EOF
            {
             before(grammarAccess.getBarMultiplierRule()); 
            pushFollow(FOLLOW_1);
            ruleBarMultiplier();

            state._fsp--;

             after(grammarAccess.getBarMultiplierRule()); 
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
    // $ANTLR end "entryRuleBarMultiplier"


    // $ANTLR start "ruleBarMultiplier"
    // InternalRyml.g:187:1: ruleBarMultiplier : ( ( rule__BarMultiplier__Group__0 ) ) ;
    public final void ruleBarMultiplier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:191:2: ( ( ( rule__BarMultiplier__Group__0 ) ) )
            // InternalRyml.g:192:2: ( ( rule__BarMultiplier__Group__0 ) )
            {
            // InternalRyml.g:192:2: ( ( rule__BarMultiplier__Group__0 ) )
            // InternalRyml.g:193:3: ( rule__BarMultiplier__Group__0 )
            {
             before(grammarAccess.getBarMultiplierAccess().getGroup()); 
            // InternalRyml.g:194:3: ( rule__BarMultiplier__Group__0 )
            // InternalRyml.g:194:4: rule__BarMultiplier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BarMultiplier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBarMultiplierAccess().getGroup()); 

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
    // $ANTLR end "ruleBarMultiplier"


    // $ANTLR start "entryRuleOperation"
    // InternalRyml.g:203:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalRyml.g:204:1: ( ruleOperation EOF )
            // InternalRyml.g:205:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalRyml.g:212:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:216:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalRyml.g:217:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalRyml.g:217:2: ( ( rule__Operation__Alternatives ) )
            // InternalRyml.g:218:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalRyml.g:219:3: ( rule__Operation__Alternatives )
            // InternalRyml.g:219:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleNoteAddition"
    // InternalRyml.g:228:1: entryRuleNoteAddition : ruleNoteAddition EOF ;
    public final void entryRuleNoteAddition() throws RecognitionException {
        try {
            // InternalRyml.g:229:1: ( ruleNoteAddition EOF )
            // InternalRyml.g:230:1: ruleNoteAddition EOF
            {
             before(grammarAccess.getNoteAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleNoteAddition();

            state._fsp--;

             after(grammarAccess.getNoteAdditionRule()); 
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
    // $ANTLR end "entryRuleNoteAddition"


    // $ANTLR start "ruleNoteAddition"
    // InternalRyml.g:237:1: ruleNoteAddition : ( ( rule__NoteAddition__Group__0 ) ) ;
    public final void ruleNoteAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:241:2: ( ( ( rule__NoteAddition__Group__0 ) ) )
            // InternalRyml.g:242:2: ( ( rule__NoteAddition__Group__0 ) )
            {
            // InternalRyml.g:242:2: ( ( rule__NoteAddition__Group__0 ) )
            // InternalRyml.g:243:3: ( rule__NoteAddition__Group__0 )
            {
             before(grammarAccess.getNoteAdditionAccess().getGroup()); 
            // InternalRyml.g:244:3: ( rule__NoteAddition__Group__0 )
            // InternalRyml.g:244:4: rule__NoteAddition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NoteAddition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoteAdditionAccess().getGroup()); 

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
    // $ANTLR end "ruleNoteAddition"


    // $ANTLR start "entryRuleNoteDeletion"
    // InternalRyml.g:253:1: entryRuleNoteDeletion : ruleNoteDeletion EOF ;
    public final void entryRuleNoteDeletion() throws RecognitionException {
        try {
            // InternalRyml.g:254:1: ( ruleNoteDeletion EOF )
            // InternalRyml.g:255:1: ruleNoteDeletion EOF
            {
             before(grammarAccess.getNoteDeletionRule()); 
            pushFollow(FOLLOW_1);
            ruleNoteDeletion();

            state._fsp--;

             after(grammarAccess.getNoteDeletionRule()); 
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
    // $ANTLR end "entryRuleNoteDeletion"


    // $ANTLR start "ruleNoteDeletion"
    // InternalRyml.g:262:1: ruleNoteDeletion : ( ( rule__NoteDeletion__Group__0 ) ) ;
    public final void ruleNoteDeletion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:266:2: ( ( ( rule__NoteDeletion__Group__0 ) ) )
            // InternalRyml.g:267:2: ( ( rule__NoteDeletion__Group__0 ) )
            {
            // InternalRyml.g:267:2: ( ( rule__NoteDeletion__Group__0 ) )
            // InternalRyml.g:268:3: ( rule__NoteDeletion__Group__0 )
            {
             before(grammarAccess.getNoteDeletionAccess().getGroup()); 
            // InternalRyml.g:269:3: ( rule__NoteDeletion__Group__0 )
            // InternalRyml.g:269:4: rule__NoteDeletion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NoteDeletion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoteDeletionAccess().getGroup()); 

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
    // $ANTLR end "ruleNoteDeletion"


    // $ANTLR start "entryRuleNoteReplacement"
    // InternalRyml.g:278:1: entryRuleNoteReplacement : ruleNoteReplacement EOF ;
    public final void entryRuleNoteReplacement() throws RecognitionException {
        try {
            // InternalRyml.g:279:1: ( ruleNoteReplacement EOF )
            // InternalRyml.g:280:1: ruleNoteReplacement EOF
            {
             before(grammarAccess.getNoteReplacementRule()); 
            pushFollow(FOLLOW_1);
            ruleNoteReplacement();

            state._fsp--;

             after(grammarAccess.getNoteReplacementRule()); 
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
    // $ANTLR end "entryRuleNoteReplacement"


    // $ANTLR start "ruleNoteReplacement"
    // InternalRyml.g:287:1: ruleNoteReplacement : ( ( rule__NoteReplacement__Group__0 ) ) ;
    public final void ruleNoteReplacement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:291:2: ( ( ( rule__NoteReplacement__Group__0 ) ) )
            // InternalRyml.g:292:2: ( ( rule__NoteReplacement__Group__0 ) )
            {
            // InternalRyml.g:292:2: ( ( rule__NoteReplacement__Group__0 ) )
            // InternalRyml.g:293:3: ( rule__NoteReplacement__Group__0 )
            {
             before(grammarAccess.getNoteReplacementAccess().getGroup()); 
            // InternalRyml.g:294:3: ( rule__NoteReplacement__Group__0 )
            // InternalRyml.g:294:4: rule__NoteReplacement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NoteReplacement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoteReplacementAccess().getGroup()); 

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
    // $ANTLR end "ruleNoteReplacement"


    // $ANTLR start "entryRuleBar"
    // InternalRyml.g:303:1: entryRuleBar : ruleBar EOF ;
    public final void entryRuleBar() throws RecognitionException {
        try {
            // InternalRyml.g:304:1: ( ruleBar EOF )
            // InternalRyml.g:305:1: ruleBar EOF
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
    // InternalRyml.g:312:1: ruleBar : ( ( rule__Bar__Alternatives ) ) ;
    public final void ruleBar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:316:2: ( ( ( rule__Bar__Alternatives ) ) )
            // InternalRyml.g:317:2: ( ( rule__Bar__Alternatives ) )
            {
            // InternalRyml.g:317:2: ( ( rule__Bar__Alternatives ) )
            // InternalRyml.g:318:3: ( rule__Bar__Alternatives )
            {
             before(grammarAccess.getBarAccess().getAlternatives()); 
            // InternalRyml.g:319:3: ( rule__Bar__Alternatives )
            // InternalRyml.g:319:4: rule__Bar__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Bar__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBarAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleClassicalBar"
    // InternalRyml.g:328:1: entryRuleClassicalBar : ruleClassicalBar EOF ;
    public final void entryRuleClassicalBar() throws RecognitionException {
        try {
            // InternalRyml.g:329:1: ( ruleClassicalBar EOF )
            // InternalRyml.g:330:1: ruleClassicalBar EOF
            {
             before(grammarAccess.getClassicalBarRule()); 
            pushFollow(FOLLOW_1);
            ruleClassicalBar();

            state._fsp--;

             after(grammarAccess.getClassicalBarRule()); 
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
    // $ANTLR end "entryRuleClassicalBar"


    // $ANTLR start "ruleClassicalBar"
    // InternalRyml.g:337:1: ruleClassicalBar : ( ( rule__ClassicalBar__Group__0 ) ) ;
    public final void ruleClassicalBar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:341:2: ( ( ( rule__ClassicalBar__Group__0 ) ) )
            // InternalRyml.g:342:2: ( ( rule__ClassicalBar__Group__0 ) )
            {
            // InternalRyml.g:342:2: ( ( rule__ClassicalBar__Group__0 ) )
            // InternalRyml.g:343:3: ( rule__ClassicalBar__Group__0 )
            {
             before(grammarAccess.getClassicalBarAccess().getGroup()); 
            // InternalRyml.g:344:3: ( rule__ClassicalBar__Group__0 )
            // InternalRyml.g:344:4: rule__ClassicalBar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalBar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassicalBarAccess().getGroup()); 

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
    // $ANTLR end "ruleClassicalBar"


    // $ANTLR start "entryRuleModifiedBar"
    // InternalRyml.g:353:1: entryRuleModifiedBar : ruleModifiedBar EOF ;
    public final void entryRuleModifiedBar() throws RecognitionException {
        try {
            // InternalRyml.g:354:1: ( ruleModifiedBar EOF )
            // InternalRyml.g:355:1: ruleModifiedBar EOF
            {
             before(grammarAccess.getModifiedBarRule()); 
            pushFollow(FOLLOW_1);
            ruleModifiedBar();

            state._fsp--;

             after(grammarAccess.getModifiedBarRule()); 
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
    // $ANTLR end "entryRuleModifiedBar"


    // $ANTLR start "ruleModifiedBar"
    // InternalRyml.g:362:1: ruleModifiedBar : ( ( rule__ModifiedBar__Group__0 ) ) ;
    public final void ruleModifiedBar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:366:2: ( ( ( rule__ModifiedBar__Group__0 ) ) )
            // InternalRyml.g:367:2: ( ( rule__ModifiedBar__Group__0 ) )
            {
            // InternalRyml.g:367:2: ( ( rule__ModifiedBar__Group__0 ) )
            // InternalRyml.g:368:3: ( rule__ModifiedBar__Group__0 )
            {
             before(grammarAccess.getModifiedBarAccess().getGroup()); 
            // InternalRyml.g:369:3: ( rule__ModifiedBar__Group__0 )
            // InternalRyml.g:369:4: rule__ModifiedBar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModifiedBar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModifiedBarAccess().getGroup()); 

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
    // $ANTLR end "ruleModifiedBar"


    // $ANTLR start "entryRuleBeat"
    // InternalRyml.g:378:1: entryRuleBeat : ruleBeat EOF ;
    public final void entryRuleBeat() throws RecognitionException {
        try {
            // InternalRyml.g:379:1: ( ruleBeat EOF )
            // InternalRyml.g:380:1: ruleBeat EOF
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
    // InternalRyml.g:387:1: ruleBeat : ( ( rule__Beat__Group__0 ) ) ;
    public final void ruleBeat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:391:2: ( ( ( rule__Beat__Group__0 ) ) )
            // InternalRyml.g:392:2: ( ( rule__Beat__Group__0 ) )
            {
            // InternalRyml.g:392:2: ( ( rule__Beat__Group__0 ) )
            // InternalRyml.g:393:3: ( rule__Beat__Group__0 )
            {
             before(grammarAccess.getBeatAccess().getGroup()); 
            // InternalRyml.g:394:3: ( rule__Beat__Group__0 )
            // InternalRyml.g:394:4: rule__Beat__Group__0
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
    // InternalRyml.g:403:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // InternalRyml.g:404:1: ( ruleNote EOF )
            // InternalRyml.g:405:1: ruleNote EOF
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
    // InternalRyml.g:412:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:416:2: ( ( ( rule__Note__Group__0 ) ) )
            // InternalRyml.g:417:2: ( ( rule__Note__Group__0 ) )
            {
            // InternalRyml.g:417:2: ( ( rule__Note__Group__0 ) )
            // InternalRyml.g:418:3: ( rule__Note__Group__0 )
            {
             before(grammarAccess.getNoteAccess().getGroup()); 
            // InternalRyml.g:419:3: ( rule__Note__Group__0 )
            // InternalRyml.g:419:4: rule__Note__Group__0
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
    // InternalRyml.g:428:1: ruleDrumNoteValue : ( ( rule__DrumNoteValue__Alternatives ) ) ;
    public final void ruleDrumNoteValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:432:1: ( ( ( rule__DrumNoteValue__Alternatives ) ) )
            // InternalRyml.g:433:2: ( ( rule__DrumNoteValue__Alternatives ) )
            {
            // InternalRyml.g:433:2: ( ( rule__DrumNoteValue__Alternatives ) )
            // InternalRyml.g:434:3: ( rule__DrumNoteValue__Alternatives )
            {
             before(grammarAccess.getDrumNoteValueAccess().getAlternatives()); 
            // InternalRyml.g:435:3: ( rule__DrumNoteValue__Alternatives )
            // InternalRyml.g:435:4: rule__DrumNoteValue__Alternatives
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
    // InternalRyml.g:443:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:447:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalRyml.g:448:2: ( RULE_STRING )
                    {
                    // InternalRyml.g:448:2: ( RULE_STRING )
                    // InternalRyml.g:449:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRyml.g:454:2: ( RULE_ID )
                    {
                    // InternalRyml.g:454:2: ( RULE_ID )
                    // InternalRyml.g:455:3: RULE_ID
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


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalRyml.g:464:1: rule__Operation__Alternatives : ( ( ruleNoteAddition ) | ( ruleNoteDeletion ) | ( ruleNoteReplacement ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:468:1: ( ( ruleNoteAddition ) | ( ruleNoteDeletion ) | ( ruleNoteReplacement ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==33) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==30) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==RULE_INT) ) {
                        switch ( input.LA(4) ) {
                        case 36:
                            {
                            alt2=3;
                            }
                            break;
                        case 35:
                            {
                            alt2=2;
                            }
                            break;
                        case 34:
                            {
                            alt2=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_1==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 36:
                        {
                        alt2=3;
                        }
                        break;
                    case 35:
                        {
                        alt2=2;
                        }
                        break;
                    case 34:
                        {
                        alt2=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRyml.g:469:2: ( ruleNoteAddition )
                    {
                    // InternalRyml.g:469:2: ( ruleNoteAddition )
                    // InternalRyml.g:470:3: ruleNoteAddition
                    {
                     before(grammarAccess.getOperationAccess().getNoteAdditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNoteAddition();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getNoteAdditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRyml.g:475:2: ( ruleNoteDeletion )
                    {
                    // InternalRyml.g:475:2: ( ruleNoteDeletion )
                    // InternalRyml.g:476:3: ruleNoteDeletion
                    {
                     before(grammarAccess.getOperationAccess().getNoteDeletionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNoteDeletion();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getNoteDeletionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRyml.g:481:2: ( ruleNoteReplacement )
                    {
                    // InternalRyml.g:481:2: ( ruleNoteReplacement )
                    // InternalRyml.g:482:3: ruleNoteReplacement
                    {
                     before(grammarAccess.getOperationAccess().getNoteReplacementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNoteReplacement();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getNoteReplacementParserRuleCall_2()); 

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
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__Bar__Alternatives"
    // InternalRyml.g:491:1: rule__Bar__Alternatives : ( ( ruleClassicalBar ) | ( ruleModifiedBar ) );
    public final void rule__Bar__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:495:1: ( ( ruleClassicalBar ) | ( ruleModifiedBar ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==38) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_STRING) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==39) ) {
                        alt3=2;
                    }
                    else if ( (LA3_2==23) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_1==RULE_ID) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==39) ) {
                        alt3=2;
                    }
                    else if ( (LA3_3==23) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRyml.g:496:2: ( ruleClassicalBar )
                    {
                    // InternalRyml.g:496:2: ( ruleClassicalBar )
                    // InternalRyml.g:497:3: ruleClassicalBar
                    {
                     before(grammarAccess.getBarAccess().getClassicalBarParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClassicalBar();

                    state._fsp--;

                     after(grammarAccess.getBarAccess().getClassicalBarParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRyml.g:502:2: ( ruleModifiedBar )
                    {
                    // InternalRyml.g:502:2: ( ruleModifiedBar )
                    // InternalRyml.g:503:3: ruleModifiedBar
                    {
                     before(grammarAccess.getBarAccess().getModifiedBarParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleModifiedBar();

                    state._fsp--;

                     after(grammarAccess.getBarAccess().getModifiedBarParserRuleCall_1()); 

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
    // $ANTLR end "rule__Bar__Alternatives"


    // $ANTLR start "rule__DrumNoteValue__Alternatives"
    // InternalRyml.g:512:1: rule__DrumNoteValue__Alternatives : ( ( ( 'SD' ) ) | ( ( 'BD' ) ) | ( ( 'CH' ) ) | ( ( 'OH' ) ) | ( ( 'CC' ) ) | ( ( 'RC' ) ) | ( ( 'TM' ) ) | ( ( 'TO' ) ) | ( ( 'S' ) ) | ( ( 'WS' ) ) | ( ( 'L' ) ) );
    public final void rule__DrumNoteValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:516:1: ( ( ( 'SD' ) ) | ( ( 'BD' ) ) | ( ( 'CH' ) ) | ( ( 'OH' ) ) | ( ( 'CC' ) ) | ( ( 'RC' ) ) | ( ( 'TM' ) ) | ( ( 'TO' ) ) | ( ( 'S' ) ) | ( ( 'WS' ) ) | ( ( 'L' ) ) )
            int alt4=11;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            case 17:
                {
                alt4=7;
                }
                break;
            case 18:
                {
                alt4=8;
                }
                break;
            case 19:
                {
                alt4=9;
                }
                break;
            case 20:
                {
                alt4=10;
                }
                break;
            case 21:
                {
                alt4=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRyml.g:517:2: ( ( 'SD' ) )
                    {
                    // InternalRyml.g:517:2: ( ( 'SD' ) )
                    // InternalRyml.g:518:3: ( 'SD' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getSDEnumLiteralDeclaration_0()); 
                    // InternalRyml.g:519:3: ( 'SD' )
                    // InternalRyml.g:519:4: 'SD'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getSDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRyml.g:523:2: ( ( 'BD' ) )
                    {
                    // InternalRyml.g:523:2: ( ( 'BD' ) )
                    // InternalRyml.g:524:3: ( 'BD' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getBDEnumLiteralDeclaration_1()); 
                    // InternalRyml.g:525:3: ( 'BD' )
                    // InternalRyml.g:525:4: 'BD'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getBDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRyml.g:529:2: ( ( 'CH' ) )
                    {
                    // InternalRyml.g:529:2: ( ( 'CH' ) )
                    // InternalRyml.g:530:3: ( 'CH' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getCHEnumLiteralDeclaration_2()); 
                    // InternalRyml.g:531:3: ( 'CH' )
                    // InternalRyml.g:531:4: 'CH'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getCHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRyml.g:535:2: ( ( 'OH' ) )
                    {
                    // InternalRyml.g:535:2: ( ( 'OH' ) )
                    // InternalRyml.g:536:3: ( 'OH' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getOHEnumLiteralDeclaration_3()); 
                    // InternalRyml.g:537:3: ( 'OH' )
                    // InternalRyml.g:537:4: 'OH'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getOHEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRyml.g:541:2: ( ( 'CC' ) )
                    {
                    // InternalRyml.g:541:2: ( ( 'CC' ) )
                    // InternalRyml.g:542:3: ( 'CC' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getCCEnumLiteralDeclaration_4()); 
                    // InternalRyml.g:543:3: ( 'CC' )
                    // InternalRyml.g:543:4: 'CC'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getCCEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRyml.g:547:2: ( ( 'RC' ) )
                    {
                    // InternalRyml.g:547:2: ( ( 'RC' ) )
                    // InternalRyml.g:548:3: ( 'RC' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getRCEnumLiteralDeclaration_5()); 
                    // InternalRyml.g:549:3: ( 'RC' )
                    // InternalRyml.g:549:4: 'RC'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getRCEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRyml.g:553:2: ( ( 'TM' ) )
                    {
                    // InternalRyml.g:553:2: ( ( 'TM' ) )
                    // InternalRyml.g:554:3: ( 'TM' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getTMEnumLiteralDeclaration_6()); 
                    // InternalRyml.g:555:3: ( 'TM' )
                    // InternalRyml.g:555:4: 'TM'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getTMEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRyml.g:559:2: ( ( 'TO' ) )
                    {
                    // InternalRyml.g:559:2: ( ( 'TO' ) )
                    // InternalRyml.g:560:3: ( 'TO' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getTOEnumLiteralDeclaration_7()); 
                    // InternalRyml.g:561:3: ( 'TO' )
                    // InternalRyml.g:561:4: 'TO'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getTOEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRyml.g:565:2: ( ( 'S' ) )
                    {
                    // InternalRyml.g:565:2: ( ( 'S' ) )
                    // InternalRyml.g:566:3: ( 'S' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getSEnumLiteralDeclaration_8()); 
                    // InternalRyml.g:567:3: ( 'S' )
                    // InternalRyml.g:567:4: 'S'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getSEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRyml.g:571:2: ( ( 'WS' ) )
                    {
                    // InternalRyml.g:571:2: ( ( 'WS' ) )
                    // InternalRyml.g:572:3: ( 'WS' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getWSEnumLiteralDeclaration_9()); 
                    // InternalRyml.g:573:3: ( 'WS' )
                    // InternalRyml.g:573:4: 'WS'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getWSEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalRyml.g:577:2: ( ( 'L' ) )
                    {
                    // InternalRyml.g:577:2: ( ( 'L' ) )
                    // InternalRyml.g:578:3: ( 'L' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getLEnumLiteralDeclaration_10()); 
                    // InternalRyml.g:579:3: ( 'L' )
                    // InternalRyml.g:579:4: 'L'
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


    // $ANTLR start "rule__Music__Group__0"
    // InternalRyml.g:587:1: rule__Music__Group__0 : rule__Music__Group__0__Impl rule__Music__Group__1 ;
    public final void rule__Music__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:591:1: ( rule__Music__Group__0__Impl rule__Music__Group__1 )
            // InternalRyml.g:592:2: rule__Music__Group__0__Impl rule__Music__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Music__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__1();

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
    // $ANTLR end "rule__Music__Group__0"


    // $ANTLR start "rule__Music__Group__0__Impl"
    // InternalRyml.g:599:1: rule__Music__Group__0__Impl : ( 'Music' ) ;
    public final void rule__Music__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:603:1: ( ( 'Music' ) )
            // InternalRyml.g:604:1: ( 'Music' )
            {
            // InternalRyml.g:604:1: ( 'Music' )
            // InternalRyml.g:605:2: 'Music'
            {
             before(grammarAccess.getMusicAccess().getMusicKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getMusicKeyword_0()); 

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
    // $ANTLR end "rule__Music__Group__0__Impl"


    // $ANTLR start "rule__Music__Group__1"
    // InternalRyml.g:614:1: rule__Music__Group__1 : rule__Music__Group__1__Impl rule__Music__Group__2 ;
    public final void rule__Music__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:618:1: ( rule__Music__Group__1__Impl rule__Music__Group__2 )
            // InternalRyml.g:619:2: rule__Music__Group__1__Impl rule__Music__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Music__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__2();

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
    // $ANTLR end "rule__Music__Group__1"


    // $ANTLR start "rule__Music__Group__1__Impl"
    // InternalRyml.g:626:1: rule__Music__Group__1__Impl : ( ( rule__Music__NameAssignment_1 ) ) ;
    public final void rule__Music__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:630:1: ( ( ( rule__Music__NameAssignment_1 ) ) )
            // InternalRyml.g:631:1: ( ( rule__Music__NameAssignment_1 ) )
            {
            // InternalRyml.g:631:1: ( ( rule__Music__NameAssignment_1 ) )
            // InternalRyml.g:632:2: ( rule__Music__NameAssignment_1 )
            {
             before(grammarAccess.getMusicAccess().getNameAssignment_1()); 
            // InternalRyml.g:633:2: ( rule__Music__NameAssignment_1 )
            // InternalRyml.g:633:3: rule__Music__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Music__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Music__Group__1__Impl"


    // $ANTLR start "rule__Music__Group__2"
    // InternalRyml.g:641:1: rule__Music__Group__2 : rule__Music__Group__2__Impl rule__Music__Group__3 ;
    public final void rule__Music__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:645:1: ( rule__Music__Group__2__Impl rule__Music__Group__3 )
            // InternalRyml.g:646:2: rule__Music__Group__2__Impl rule__Music__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Music__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__3();

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
    // $ANTLR end "rule__Music__Group__2"


    // $ANTLR start "rule__Music__Group__2__Impl"
    // InternalRyml.g:653:1: rule__Music__Group__2__Impl : ( ':' ) ;
    public final void rule__Music__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:657:1: ( ( ':' ) )
            // InternalRyml.g:658:1: ( ':' )
            {
            // InternalRyml.g:658:1: ( ':' )
            // InternalRyml.g:659:2: ':'
            {
             before(grammarAccess.getMusicAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Music__Group__2__Impl"


    // $ANTLR start "rule__Music__Group__3"
    // InternalRyml.g:668:1: rule__Music__Group__3 : rule__Music__Group__3__Impl rule__Music__Group__4 ;
    public final void rule__Music__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:672:1: ( rule__Music__Group__3__Impl rule__Music__Group__4 )
            // InternalRyml.g:673:2: rule__Music__Group__3__Impl rule__Music__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Music__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__4();

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
    // $ANTLR end "rule__Music__Group__3"


    // $ANTLR start "rule__Music__Group__3__Impl"
    // InternalRyml.g:680:1: rule__Music__Group__3__Impl : ( ( rule__Music__Group_3__0 )? ) ;
    public final void rule__Music__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:684:1: ( ( ( rule__Music__Group_3__0 )? ) )
            // InternalRyml.g:685:1: ( ( rule__Music__Group_3__0 )? )
            {
            // InternalRyml.g:685:1: ( ( rule__Music__Group_3__0 )? )
            // InternalRyml.g:686:2: ( rule__Music__Group_3__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_3()); 
            // InternalRyml.g:687:2: ( rule__Music__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRyml.g:687:3: rule__Music__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMusicAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Music__Group__3__Impl"


    // $ANTLR start "rule__Music__Group__4"
    // InternalRyml.g:695:1: rule__Music__Group__4 : rule__Music__Group__4__Impl rule__Music__Group__5 ;
    public final void rule__Music__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:699:1: ( rule__Music__Group__4__Impl rule__Music__Group__5 )
            // InternalRyml.g:700:2: rule__Music__Group__4__Impl rule__Music__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Music__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__5();

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
    // $ANTLR end "rule__Music__Group__4"


    // $ANTLR start "rule__Music__Group__4__Impl"
    // InternalRyml.g:707:1: rule__Music__Group__4__Impl : ( ( rule__Music__Group_4__0 )? ) ;
    public final void rule__Music__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:711:1: ( ( ( rule__Music__Group_4__0 )? ) )
            // InternalRyml.g:712:1: ( ( rule__Music__Group_4__0 )? )
            {
            // InternalRyml.g:712:1: ( ( rule__Music__Group_4__0 )? )
            // InternalRyml.g:713:2: ( rule__Music__Group_4__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_4()); 
            // InternalRyml.g:714:2: ( rule__Music__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRyml.g:714:3: rule__Music__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMusicAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Music__Group__4__Impl"


    // $ANTLR start "rule__Music__Group__5"
    // InternalRyml.g:722:1: rule__Music__Group__5 : rule__Music__Group__5__Impl rule__Music__Group__6 ;
    public final void rule__Music__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:726:1: ( rule__Music__Group__5__Impl rule__Music__Group__6 )
            // InternalRyml.g:727:2: rule__Music__Group__5__Impl rule__Music__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Music__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__6();

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
    // $ANTLR end "rule__Music__Group__5"


    // $ANTLR start "rule__Music__Group__5__Impl"
    // InternalRyml.g:734:1: rule__Music__Group__5__Impl : ( ( rule__Music__Group_5__0 )? ) ;
    public final void rule__Music__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:738:1: ( ( ( rule__Music__Group_5__0 )? ) )
            // InternalRyml.g:739:1: ( ( rule__Music__Group_5__0 )? )
            {
            // InternalRyml.g:739:1: ( ( rule__Music__Group_5__0 )? )
            // InternalRyml.g:740:2: ( rule__Music__Group_5__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_5()); 
            // InternalRyml.g:741:2: ( rule__Music__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRyml.g:741:3: rule__Music__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMusicAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Music__Group__5__Impl"


    // $ANTLR start "rule__Music__Group__6"
    // InternalRyml.g:749:1: rule__Music__Group__6 : rule__Music__Group__6__Impl rule__Music__Group__7 ;
    public final void rule__Music__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:753:1: ( rule__Music__Group__6__Impl rule__Music__Group__7 )
            // InternalRyml.g:754:2: rule__Music__Group__6__Impl rule__Music__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Music__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__7();

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
    // $ANTLR end "rule__Music__Group__6"


    // $ANTLR start "rule__Music__Group__6__Impl"
    // InternalRyml.g:761:1: rule__Music__Group__6__Impl : ( ( rule__Music__Group_6__0 )? ) ;
    public final void rule__Music__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:765:1: ( ( ( rule__Music__Group_6__0 )? ) )
            // InternalRyml.g:766:1: ( ( rule__Music__Group_6__0 )? )
            {
            // InternalRyml.g:766:1: ( ( rule__Music__Group_6__0 )? )
            // InternalRyml.g:767:2: ( rule__Music__Group_6__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_6()); 
            // InternalRyml.g:768:2: ( rule__Music__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRyml.g:768:3: rule__Music__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMusicAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Music__Group__6__Impl"


    // $ANTLR start "rule__Music__Group__7"
    // InternalRyml.g:776:1: rule__Music__Group__7 : rule__Music__Group__7__Impl rule__Music__Group__8 ;
    public final void rule__Music__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:780:1: ( rule__Music__Group__7__Impl rule__Music__Group__8 )
            // InternalRyml.g:781:2: rule__Music__Group__7__Impl rule__Music__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Music__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__8();

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
    // $ANTLR end "rule__Music__Group__7"


    // $ANTLR start "rule__Music__Group__7__Impl"
    // InternalRyml.g:788:1: rule__Music__Group__7__Impl : ( ( rule__Music__Group_7__0 )? ) ;
    public final void rule__Music__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:792:1: ( ( ( rule__Music__Group_7__0 )? ) )
            // InternalRyml.g:793:1: ( ( rule__Music__Group_7__0 )? )
            {
            // InternalRyml.g:793:1: ( ( rule__Music__Group_7__0 )? )
            // InternalRyml.g:794:2: ( rule__Music__Group_7__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_7()); 
            // InternalRyml.g:795:2: ( rule__Music__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==44) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRyml.g:795:3: rule__Music__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMusicAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Music__Group__7__Impl"


    // $ANTLR start "rule__Music__Group__8"
    // InternalRyml.g:803:1: rule__Music__Group__8 : rule__Music__Group__8__Impl rule__Music__Group__9 ;
    public final void rule__Music__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:807:1: ( rule__Music__Group__8__Impl rule__Music__Group__9 )
            // InternalRyml.g:808:2: rule__Music__Group__8__Impl rule__Music__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__Music__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__9();

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
    // $ANTLR end "rule__Music__Group__8"


    // $ANTLR start "rule__Music__Group__8__Impl"
    // InternalRyml.g:815:1: rule__Music__Group__8__Impl : ( ( rule__Music__Group_8__0 )? ) ;
    public final void rule__Music__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:819:1: ( ( ( rule__Music__Group_8__0 )? ) )
            // InternalRyml.g:820:1: ( ( rule__Music__Group_8__0 )? )
            {
            // InternalRyml.g:820:1: ( ( rule__Music__Group_8__0 )? )
            // InternalRyml.g:821:2: ( rule__Music__Group_8__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_8()); 
            // InternalRyml.g:822:2: ( rule__Music__Group_8__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRyml.g:822:3: rule__Music__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMusicAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Music__Group__8__Impl"


    // $ANTLR start "rule__Music__Group__9"
    // InternalRyml.g:830:1: rule__Music__Group__9 : rule__Music__Group__9__Impl rule__Music__Group__10 ;
    public final void rule__Music__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:834:1: ( rule__Music__Group__9__Impl rule__Music__Group__10 )
            // InternalRyml.g:835:2: rule__Music__Group__9__Impl rule__Music__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__Music__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__10();

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
    // $ANTLR end "rule__Music__Group__9"


    // $ANTLR start "rule__Music__Group__9__Impl"
    // InternalRyml.g:842:1: rule__Music__Group__9__Impl : ( ( rule__Music__Group_9__0 )? ) ;
    public final void rule__Music__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:846:1: ( ( ( rule__Music__Group_9__0 )? ) )
            // InternalRyml.g:847:1: ( ( rule__Music__Group_9__0 )? )
            {
            // InternalRyml.g:847:1: ( ( rule__Music__Group_9__0 )? )
            // InternalRyml.g:848:2: ( rule__Music__Group_9__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_9()); 
            // InternalRyml.g:849:2: ( rule__Music__Group_9__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRyml.g:849:3: rule__Music__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMusicAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Music__Group__9__Impl"


    // $ANTLR start "rule__Music__Group__10"
    // InternalRyml.g:857:1: rule__Music__Group__10 : rule__Music__Group__10__Impl rule__Music__Group__11 ;
    public final void rule__Music__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:861:1: ( rule__Music__Group__10__Impl rule__Music__Group__11 )
            // InternalRyml.g:862:2: rule__Music__Group__10__Impl rule__Music__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__Music__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group__11();

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
    // $ANTLR end "rule__Music__Group__10"


    // $ANTLR start "rule__Music__Group__10__Impl"
    // InternalRyml.g:869:1: rule__Music__Group__10__Impl : ( ( rule__Music__Group_10__0 )? ) ;
    public final void rule__Music__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:873:1: ( ( ( rule__Music__Group_10__0 )? ) )
            // InternalRyml.g:874:1: ( ( rule__Music__Group_10__0 )? )
            {
            // InternalRyml.g:874:1: ( ( rule__Music__Group_10__0 )? )
            // InternalRyml.g:875:2: ( rule__Music__Group_10__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_10()); 
            // InternalRyml.g:876:2: ( rule__Music__Group_10__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRyml.g:876:3: rule__Music__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMusicAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Music__Group__10__Impl"


    // $ANTLR start "rule__Music__Group__11"
    // InternalRyml.g:884:1: rule__Music__Group__11 : rule__Music__Group__11__Impl ;
    public final void rule__Music__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:888:1: ( rule__Music__Group__11__Impl )
            // InternalRyml.g:889:2: rule__Music__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group__11__Impl();

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
    // $ANTLR end "rule__Music__Group__11"


    // $ANTLR start "rule__Music__Group__11__Impl"
    // InternalRyml.g:895:1: rule__Music__Group__11__Impl : ( ( rule__Music__Group_11__0 )? ) ;
    public final void rule__Music__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:899:1: ( ( ( rule__Music__Group_11__0 )? ) )
            // InternalRyml.g:900:1: ( ( rule__Music__Group_11__0 )? )
            {
            // InternalRyml.g:900:1: ( ( rule__Music__Group_11__0 )? )
            // InternalRyml.g:901:2: ( rule__Music__Group_11__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_11()); 
            // InternalRyml.g:902:2: ( rule__Music__Group_11__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRyml.g:902:3: rule__Music__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMusicAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Music__Group__11__Impl"


    // $ANTLR start "rule__Music__Group_3__0"
    // InternalRyml.g:911:1: rule__Music__Group_3__0 : rule__Music__Group_3__0__Impl rule__Music__Group_3__1 ;
    public final void rule__Music__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:915:1: ( rule__Music__Group_3__0__Impl rule__Music__Group_3__1 )
            // InternalRyml.g:916:2: rule__Music__Group_3__0__Impl rule__Music__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRyml.g:923:1: rule__Music__Group_3__0__Impl : ( 'title :' ) ;
    public final void rule__Music__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:927:1: ( ( 'title :' ) )
            // InternalRyml.g:928:1: ( 'title :' )
            {
            // InternalRyml.g:928:1: ( 'title :' )
            // InternalRyml.g:929:2: 'title :'
            {
             before(grammarAccess.getMusicAccess().getTitleKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getTitleKeyword_3_0()); 

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
    // InternalRyml.g:938:1: rule__Music__Group_3__1 : rule__Music__Group_3__1__Impl ;
    public final void rule__Music__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:942:1: ( rule__Music__Group_3__1__Impl )
            // InternalRyml.g:943:2: rule__Music__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_3__1__Impl();

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
    // InternalRyml.g:949:1: rule__Music__Group_3__1__Impl : ( ( rule__Music__TitleAssignment_3_1 ) ) ;
    public final void rule__Music__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:953:1: ( ( ( rule__Music__TitleAssignment_3_1 ) ) )
            // InternalRyml.g:954:1: ( ( rule__Music__TitleAssignment_3_1 ) )
            {
            // InternalRyml.g:954:1: ( ( rule__Music__TitleAssignment_3_1 ) )
            // InternalRyml.g:955:2: ( rule__Music__TitleAssignment_3_1 )
            {
             before(grammarAccess.getMusicAccess().getTitleAssignment_3_1()); 
            // InternalRyml.g:956:2: ( rule__Music__TitleAssignment_3_1 )
            // InternalRyml.g:956:3: rule__Music__TitleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Music__TitleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getTitleAssignment_3_1()); 

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


    // $ANTLR start "rule__Music__Group_4__0"
    // InternalRyml.g:965:1: rule__Music__Group_4__0 : rule__Music__Group_4__0__Impl rule__Music__Group_4__1 ;
    public final void rule__Music__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:969:1: ( rule__Music__Group_4__0__Impl rule__Music__Group_4__1 )
            // InternalRyml.g:970:2: rule__Music__Group_4__0__Impl rule__Music__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Music__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_4__1();

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
    // $ANTLR end "rule__Music__Group_4__0"


    // $ANTLR start "rule__Music__Group_4__0__Impl"
    // InternalRyml.g:977:1: rule__Music__Group_4__0__Impl : ( 'author :' ) ;
    public final void rule__Music__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:981:1: ( ( 'author :' ) )
            // InternalRyml.g:982:1: ( 'author :' )
            {
            // InternalRyml.g:982:1: ( 'author :' )
            // InternalRyml.g:983:2: 'author :'
            {
             before(grammarAccess.getMusicAccess().getAuthorKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getAuthorKeyword_4_0()); 

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
    // $ANTLR end "rule__Music__Group_4__0__Impl"


    // $ANTLR start "rule__Music__Group_4__1"
    // InternalRyml.g:992:1: rule__Music__Group_4__1 : rule__Music__Group_4__1__Impl ;
    public final void rule__Music__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:996:1: ( rule__Music__Group_4__1__Impl )
            // InternalRyml.g:997:2: rule__Music__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_4__1__Impl();

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
    // $ANTLR end "rule__Music__Group_4__1"


    // $ANTLR start "rule__Music__Group_4__1__Impl"
    // InternalRyml.g:1003:1: rule__Music__Group_4__1__Impl : ( ( rule__Music__AuthorAssignment_4_1 ) ) ;
    public final void rule__Music__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1007:1: ( ( ( rule__Music__AuthorAssignment_4_1 ) ) )
            // InternalRyml.g:1008:1: ( ( rule__Music__AuthorAssignment_4_1 ) )
            {
            // InternalRyml.g:1008:1: ( ( rule__Music__AuthorAssignment_4_1 ) )
            // InternalRyml.g:1009:2: ( rule__Music__AuthorAssignment_4_1 )
            {
             before(grammarAccess.getMusicAccess().getAuthorAssignment_4_1()); 
            // InternalRyml.g:1010:2: ( rule__Music__AuthorAssignment_4_1 )
            // InternalRyml.g:1010:3: rule__Music__AuthorAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Music__AuthorAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getAuthorAssignment_4_1()); 

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
    // $ANTLR end "rule__Music__Group_4__1__Impl"


    // $ANTLR start "rule__Music__Group_5__0"
    // InternalRyml.g:1019:1: rule__Music__Group_5__0 : rule__Music__Group_5__0__Impl rule__Music__Group_5__1 ;
    public final void rule__Music__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1023:1: ( rule__Music__Group_5__0__Impl rule__Music__Group_5__1 )
            // InternalRyml.g:1024:2: rule__Music__Group_5__0__Impl rule__Music__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Music__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_5__1();

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
    // $ANTLR end "rule__Music__Group_5__0"


    // $ANTLR start "rule__Music__Group_5__0__Impl"
    // InternalRyml.g:1031:1: rule__Music__Group_5__0__Impl : ( 'bpm :' ) ;
    public final void rule__Music__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1035:1: ( ( 'bpm :' ) )
            // InternalRyml.g:1036:1: ( 'bpm :' )
            {
            // InternalRyml.g:1036:1: ( 'bpm :' )
            // InternalRyml.g:1037:2: 'bpm :'
            {
             before(grammarAccess.getMusicAccess().getBpmKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getBpmKeyword_5_0()); 

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
    // $ANTLR end "rule__Music__Group_5__0__Impl"


    // $ANTLR start "rule__Music__Group_5__1"
    // InternalRyml.g:1046:1: rule__Music__Group_5__1 : rule__Music__Group_5__1__Impl ;
    public final void rule__Music__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1050:1: ( rule__Music__Group_5__1__Impl )
            // InternalRyml.g:1051:2: rule__Music__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_5__1__Impl();

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
    // $ANTLR end "rule__Music__Group_5__1"


    // $ANTLR start "rule__Music__Group_5__1__Impl"
    // InternalRyml.g:1057:1: rule__Music__Group_5__1__Impl : ( ( rule__Music__BpmAssignment_5_1 ) ) ;
    public final void rule__Music__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1061:1: ( ( ( rule__Music__BpmAssignment_5_1 ) ) )
            // InternalRyml.g:1062:1: ( ( rule__Music__BpmAssignment_5_1 ) )
            {
            // InternalRyml.g:1062:1: ( ( rule__Music__BpmAssignment_5_1 ) )
            // InternalRyml.g:1063:2: ( rule__Music__BpmAssignment_5_1 )
            {
             before(grammarAccess.getMusicAccess().getBpmAssignment_5_1()); 
            // InternalRyml.g:1064:2: ( rule__Music__BpmAssignment_5_1 )
            // InternalRyml.g:1064:3: rule__Music__BpmAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Music__BpmAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getBpmAssignment_5_1()); 

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
    // $ANTLR end "rule__Music__Group_5__1__Impl"


    // $ANTLR start "rule__Music__Group_6__0"
    // InternalRyml.g:1073:1: rule__Music__Group_6__0 : rule__Music__Group_6__0__Impl rule__Music__Group_6__1 ;
    public final void rule__Music__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1077:1: ( rule__Music__Group_6__0__Impl rule__Music__Group_6__1 )
            // InternalRyml.g:1078:2: rule__Music__Group_6__0__Impl rule__Music__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__Music__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_6__1();

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
    // $ANTLR end "rule__Music__Group_6__0"


    // $ANTLR start "rule__Music__Group_6__0__Impl"
    // InternalRyml.g:1085:1: rule__Music__Group_6__0__Impl : ( 'resolution per beats : ' ) ;
    public final void rule__Music__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1089:1: ( ( 'resolution per beats : ' ) )
            // InternalRyml.g:1090:1: ( 'resolution per beats : ' )
            {
            // InternalRyml.g:1090:1: ( 'resolution per beats : ' )
            // InternalRyml.g:1091:2: 'resolution per beats : '
            {
             before(grammarAccess.getMusicAccess().getResolutionPerBeatsKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMusicAccess().getResolutionPerBeatsKeyword_6_0()); 

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
    // $ANTLR end "rule__Music__Group_6__0__Impl"


    // $ANTLR start "rule__Music__Group_6__1"
    // InternalRyml.g:1100:1: rule__Music__Group_6__1 : rule__Music__Group_6__1__Impl ;
    public final void rule__Music__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1104:1: ( rule__Music__Group_6__1__Impl )
            // InternalRyml.g:1105:2: rule__Music__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_6__1__Impl();

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
    // $ANTLR end "rule__Music__Group_6__1"


    // $ANTLR start "rule__Music__Group_6__1__Impl"
    // InternalRyml.g:1111:1: rule__Music__Group_6__1__Impl : ( ( rule__Music__ResolutionPerSlideAssignment_6_1 ) ) ;
    public final void rule__Music__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1115:1: ( ( ( rule__Music__ResolutionPerSlideAssignment_6_1 ) ) )
            // InternalRyml.g:1116:1: ( ( rule__Music__ResolutionPerSlideAssignment_6_1 ) )
            {
            // InternalRyml.g:1116:1: ( ( rule__Music__ResolutionPerSlideAssignment_6_1 ) )
            // InternalRyml.g:1117:2: ( rule__Music__ResolutionPerSlideAssignment_6_1 )
            {
             before(grammarAccess.getMusicAccess().getResolutionPerSlideAssignment_6_1()); 
            // InternalRyml.g:1118:2: ( rule__Music__ResolutionPerSlideAssignment_6_1 )
            // InternalRyml.g:1118:3: rule__Music__ResolutionPerSlideAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Music__ResolutionPerSlideAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getResolutionPerSlideAssignment_6_1()); 

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
    // $ANTLR end "rule__Music__Group_6__1__Impl"


    // $ANTLR start "rule__Music__Group_7__0"
    // InternalRyml.g:1127:1: rule__Music__Group_7__0 : rule__Music__Group_7__0__Impl rule__Music__Group_7__1 ;
    public final void rule__Music__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1131:1: ( rule__Music__Group_7__0__Impl rule__Music__Group_7__1 )
            // InternalRyml.g:1132:2: rule__Music__Group_7__0__Impl rule__Music__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__Music__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_7__1();

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
    // $ANTLR end "rule__Music__Group_7__0"


    // $ANTLR start "rule__Music__Group_7__0__Impl"
    // InternalRyml.g:1139:1: rule__Music__Group_7__0__Impl : ( ( rule__Music__OwnedNotesAssignment_7_0 ) ) ;
    public final void rule__Music__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1143:1: ( ( ( rule__Music__OwnedNotesAssignment_7_0 ) ) )
            // InternalRyml.g:1144:1: ( ( rule__Music__OwnedNotesAssignment_7_0 ) )
            {
            // InternalRyml.g:1144:1: ( ( rule__Music__OwnedNotesAssignment_7_0 ) )
            // InternalRyml.g:1145:2: ( rule__Music__OwnedNotesAssignment_7_0 )
            {
             before(grammarAccess.getMusicAccess().getOwnedNotesAssignment_7_0()); 
            // InternalRyml.g:1146:2: ( rule__Music__OwnedNotesAssignment_7_0 )
            // InternalRyml.g:1146:3: rule__Music__OwnedNotesAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__Music__OwnedNotesAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getOwnedNotesAssignment_7_0()); 

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
    // $ANTLR end "rule__Music__Group_7__0__Impl"


    // $ANTLR start "rule__Music__Group_7__1"
    // InternalRyml.g:1154:1: rule__Music__Group_7__1 : rule__Music__Group_7__1__Impl ;
    public final void rule__Music__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1158:1: ( rule__Music__Group_7__1__Impl )
            // InternalRyml.g:1159:2: rule__Music__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_7__1__Impl();

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
    // $ANTLR end "rule__Music__Group_7__1"


    // $ANTLR start "rule__Music__Group_7__1__Impl"
    // InternalRyml.g:1165:1: rule__Music__Group_7__1__Impl : ( ( rule__Music__OwnedNotesAssignment_7_1 )* ) ;
    public final void rule__Music__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1169:1: ( ( ( rule__Music__OwnedNotesAssignment_7_1 )* ) )
            // InternalRyml.g:1170:1: ( ( rule__Music__OwnedNotesAssignment_7_1 )* )
            {
            // InternalRyml.g:1170:1: ( ( rule__Music__OwnedNotesAssignment_7_1 )* )
            // InternalRyml.g:1171:2: ( rule__Music__OwnedNotesAssignment_7_1 )*
            {
             before(grammarAccess.getMusicAccess().getOwnedNotesAssignment_7_1()); 
            // InternalRyml.g:1172:2: ( rule__Music__OwnedNotesAssignment_7_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==44) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRyml.g:1172:3: rule__Music__OwnedNotesAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Music__OwnedNotesAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMusicAccess().getOwnedNotesAssignment_7_1()); 

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
    // $ANTLR end "rule__Music__Group_7__1__Impl"


    // $ANTLR start "rule__Music__Group_8__0"
    // InternalRyml.g:1181:1: rule__Music__Group_8__0 : rule__Music__Group_8__0__Impl rule__Music__Group_8__1 ;
    public final void rule__Music__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1185:1: ( rule__Music__Group_8__0__Impl rule__Music__Group_8__1 )
            // InternalRyml.g:1186:2: rule__Music__Group_8__0__Impl rule__Music__Group_8__1
            {
            pushFollow(FOLLOW_9);
            rule__Music__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_8__1();

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
    // $ANTLR end "rule__Music__Group_8__0"


    // $ANTLR start "rule__Music__Group_8__0__Impl"
    // InternalRyml.g:1193:1: rule__Music__Group_8__0__Impl : ( ( rule__Music__OwnedBeatsAssignment_8_0 ) ) ;
    public final void rule__Music__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1197:1: ( ( ( rule__Music__OwnedBeatsAssignment_8_0 ) ) )
            // InternalRyml.g:1198:1: ( ( rule__Music__OwnedBeatsAssignment_8_0 ) )
            {
            // InternalRyml.g:1198:1: ( ( rule__Music__OwnedBeatsAssignment_8_0 ) )
            // InternalRyml.g:1199:2: ( rule__Music__OwnedBeatsAssignment_8_0 )
            {
             before(grammarAccess.getMusicAccess().getOwnedBeatsAssignment_8_0()); 
            // InternalRyml.g:1200:2: ( rule__Music__OwnedBeatsAssignment_8_0 )
            // InternalRyml.g:1200:3: rule__Music__OwnedBeatsAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__Music__OwnedBeatsAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getOwnedBeatsAssignment_8_0()); 

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
    // $ANTLR end "rule__Music__Group_8__0__Impl"


    // $ANTLR start "rule__Music__Group_8__1"
    // InternalRyml.g:1208:1: rule__Music__Group_8__1 : rule__Music__Group_8__1__Impl ;
    public final void rule__Music__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1212:1: ( rule__Music__Group_8__1__Impl )
            // InternalRyml.g:1213:2: rule__Music__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_8__1__Impl();

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
    // $ANTLR end "rule__Music__Group_8__1"


    // $ANTLR start "rule__Music__Group_8__1__Impl"
    // InternalRyml.g:1219:1: rule__Music__Group_8__1__Impl : ( ( rule__Music__OwnedBeatsAssignment_8_1 )* ) ;
    public final void rule__Music__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1223:1: ( ( ( rule__Music__OwnedBeatsAssignment_8_1 )* ) )
            // InternalRyml.g:1224:1: ( ( rule__Music__OwnedBeatsAssignment_8_1 )* )
            {
            // InternalRyml.g:1224:1: ( ( rule__Music__OwnedBeatsAssignment_8_1 )* )
            // InternalRyml.g:1225:2: ( rule__Music__OwnedBeatsAssignment_8_1 )*
            {
             before(grammarAccess.getMusicAccess().getOwnedBeatsAssignment_8_1()); 
            // InternalRyml.g:1226:2: ( rule__Music__OwnedBeatsAssignment_8_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==41) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRyml.g:1226:3: rule__Music__OwnedBeatsAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Music__OwnedBeatsAssignment_8_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMusicAccess().getOwnedBeatsAssignment_8_1()); 

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
    // $ANTLR end "rule__Music__Group_8__1__Impl"


    // $ANTLR start "rule__Music__Group_9__0"
    // InternalRyml.g:1235:1: rule__Music__Group_9__0 : rule__Music__Group_9__0__Impl rule__Music__Group_9__1 ;
    public final void rule__Music__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1239:1: ( rule__Music__Group_9__0__Impl rule__Music__Group_9__1 )
            // InternalRyml.g:1240:2: rule__Music__Group_9__0__Impl rule__Music__Group_9__1
            {
            pushFollow(FOLLOW_11);
            rule__Music__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_9__1();

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
    // $ANTLR end "rule__Music__Group_9__0"


    // $ANTLR start "rule__Music__Group_9__0__Impl"
    // InternalRyml.g:1247:1: rule__Music__Group_9__0__Impl : ( ( rule__Music__OwnedBarsAssignment_9_0 ) ) ;
    public final void rule__Music__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1251:1: ( ( ( rule__Music__OwnedBarsAssignment_9_0 ) ) )
            // InternalRyml.g:1252:1: ( ( rule__Music__OwnedBarsAssignment_9_0 ) )
            {
            // InternalRyml.g:1252:1: ( ( rule__Music__OwnedBarsAssignment_9_0 ) )
            // InternalRyml.g:1253:2: ( rule__Music__OwnedBarsAssignment_9_0 )
            {
             before(grammarAccess.getMusicAccess().getOwnedBarsAssignment_9_0()); 
            // InternalRyml.g:1254:2: ( rule__Music__OwnedBarsAssignment_9_0 )
            // InternalRyml.g:1254:3: rule__Music__OwnedBarsAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__Music__OwnedBarsAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getOwnedBarsAssignment_9_0()); 

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
    // $ANTLR end "rule__Music__Group_9__0__Impl"


    // $ANTLR start "rule__Music__Group_9__1"
    // InternalRyml.g:1262:1: rule__Music__Group_9__1 : rule__Music__Group_9__1__Impl ;
    public final void rule__Music__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1266:1: ( rule__Music__Group_9__1__Impl )
            // InternalRyml.g:1267:2: rule__Music__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_9__1__Impl();

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
    // $ANTLR end "rule__Music__Group_9__1"


    // $ANTLR start "rule__Music__Group_9__1__Impl"
    // InternalRyml.g:1273:1: rule__Music__Group_9__1__Impl : ( ( rule__Music__OwnedBarsAssignment_9_1 )* ) ;
    public final void rule__Music__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1277:1: ( ( ( rule__Music__OwnedBarsAssignment_9_1 )* ) )
            // InternalRyml.g:1278:1: ( ( rule__Music__OwnedBarsAssignment_9_1 )* )
            {
            // InternalRyml.g:1278:1: ( ( rule__Music__OwnedBarsAssignment_9_1 )* )
            // InternalRyml.g:1279:2: ( rule__Music__OwnedBarsAssignment_9_1 )*
            {
             before(grammarAccess.getMusicAccess().getOwnedBarsAssignment_9_1()); 
            // InternalRyml.g:1280:2: ( rule__Music__OwnedBarsAssignment_9_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==38) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRyml.g:1280:3: rule__Music__OwnedBarsAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Music__OwnedBarsAssignment_9_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMusicAccess().getOwnedBarsAssignment_9_1()); 

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
    // $ANTLR end "rule__Music__Group_9__1__Impl"


    // $ANTLR start "rule__Music__Group_10__0"
    // InternalRyml.g:1289:1: rule__Music__Group_10__0 : rule__Music__Group_10__0__Impl rule__Music__Group_10__1 ;
    public final void rule__Music__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1293:1: ( rule__Music__Group_10__0__Impl rule__Music__Group_10__1 )
            // InternalRyml.g:1294:2: rule__Music__Group_10__0__Impl rule__Music__Group_10__1
            {
            pushFollow(FOLLOW_13);
            rule__Music__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_10__1();

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
    // $ANTLR end "rule__Music__Group_10__0"


    // $ANTLR start "rule__Music__Group_10__0__Impl"
    // InternalRyml.g:1301:1: rule__Music__Group_10__0__Impl : ( ( rule__Music__OwnedPatternsAssignment_10_0 ) ) ;
    public final void rule__Music__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1305:1: ( ( ( rule__Music__OwnedPatternsAssignment_10_0 ) ) )
            // InternalRyml.g:1306:1: ( ( rule__Music__OwnedPatternsAssignment_10_0 ) )
            {
            // InternalRyml.g:1306:1: ( ( rule__Music__OwnedPatternsAssignment_10_0 ) )
            // InternalRyml.g:1307:2: ( rule__Music__OwnedPatternsAssignment_10_0 )
            {
             before(grammarAccess.getMusicAccess().getOwnedPatternsAssignment_10_0()); 
            // InternalRyml.g:1308:2: ( rule__Music__OwnedPatternsAssignment_10_0 )
            // InternalRyml.g:1308:3: rule__Music__OwnedPatternsAssignment_10_0
            {
            pushFollow(FOLLOW_2);
            rule__Music__OwnedPatternsAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getOwnedPatternsAssignment_10_0()); 

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
    // $ANTLR end "rule__Music__Group_10__0__Impl"


    // $ANTLR start "rule__Music__Group_10__1"
    // InternalRyml.g:1316:1: rule__Music__Group_10__1 : rule__Music__Group_10__1__Impl ;
    public final void rule__Music__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1320:1: ( rule__Music__Group_10__1__Impl )
            // InternalRyml.g:1321:2: rule__Music__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_10__1__Impl();

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
    // $ANTLR end "rule__Music__Group_10__1"


    // $ANTLR start "rule__Music__Group_10__1__Impl"
    // InternalRyml.g:1327:1: rule__Music__Group_10__1__Impl : ( ( rule__Music__OwnedPatternsAssignment_10_1 )* ) ;
    public final void rule__Music__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1331:1: ( ( ( rule__Music__OwnedPatternsAssignment_10_1 )* ) )
            // InternalRyml.g:1332:1: ( ( rule__Music__OwnedPatternsAssignment_10_1 )* )
            {
            // InternalRyml.g:1332:1: ( ( rule__Music__OwnedPatternsAssignment_10_1 )* )
            // InternalRyml.g:1333:2: ( rule__Music__OwnedPatternsAssignment_10_1 )*
            {
             before(grammarAccess.getMusicAccess().getOwnedPatternsAssignment_10_1()); 
            // InternalRyml.g:1334:2: ( rule__Music__OwnedPatternsAssignment_10_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRyml.g:1334:3: rule__Music__OwnedPatternsAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Music__OwnedPatternsAssignment_10_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMusicAccess().getOwnedPatternsAssignment_10_1()); 

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
    // $ANTLR end "rule__Music__Group_10__1__Impl"


    // $ANTLR start "rule__Music__Group_11__0"
    // InternalRyml.g:1343:1: rule__Music__Group_11__0 : rule__Music__Group_11__0__Impl rule__Music__Group_11__1 ;
    public final void rule__Music__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1347:1: ( rule__Music__Group_11__0__Impl rule__Music__Group_11__1 )
            // InternalRyml.g:1348:2: rule__Music__Group_11__0__Impl rule__Music__Group_11__1
            {
            pushFollow(FOLLOW_15);
            rule__Music__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Music__Group_11__1();

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
    // $ANTLR end "rule__Music__Group_11__0"


    // $ANTLR start "rule__Music__Group_11__0__Impl"
    // InternalRyml.g:1355:1: rule__Music__Group_11__0__Impl : ( ( rule__Music__OwnedSectionsAssignment_11_0 ) ) ;
    public final void rule__Music__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1359:1: ( ( ( rule__Music__OwnedSectionsAssignment_11_0 ) ) )
            // InternalRyml.g:1360:1: ( ( rule__Music__OwnedSectionsAssignment_11_0 ) )
            {
            // InternalRyml.g:1360:1: ( ( rule__Music__OwnedSectionsAssignment_11_0 ) )
            // InternalRyml.g:1361:2: ( rule__Music__OwnedSectionsAssignment_11_0 )
            {
             before(grammarAccess.getMusicAccess().getOwnedSectionsAssignment_11_0()); 
            // InternalRyml.g:1362:2: ( rule__Music__OwnedSectionsAssignment_11_0 )
            // InternalRyml.g:1362:3: rule__Music__OwnedSectionsAssignment_11_0
            {
            pushFollow(FOLLOW_2);
            rule__Music__OwnedSectionsAssignment_11_0();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getOwnedSectionsAssignment_11_0()); 

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
    // $ANTLR end "rule__Music__Group_11__0__Impl"


    // $ANTLR start "rule__Music__Group_11__1"
    // InternalRyml.g:1370:1: rule__Music__Group_11__1 : rule__Music__Group_11__1__Impl ;
    public final void rule__Music__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1374:1: ( rule__Music__Group_11__1__Impl )
            // InternalRyml.g:1375:2: rule__Music__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Music__Group_11__1__Impl();

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
    // $ANTLR end "rule__Music__Group_11__1"


    // $ANTLR start "rule__Music__Group_11__1__Impl"
    // InternalRyml.g:1381:1: rule__Music__Group_11__1__Impl : ( ( rule__Music__OwnedSectionsAssignment_11_1 )* ) ;
    public final void rule__Music__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1385:1: ( ( ( rule__Music__OwnedSectionsAssignment_11_1 )* ) )
            // InternalRyml.g:1386:1: ( ( rule__Music__OwnedSectionsAssignment_11_1 )* )
            {
            // InternalRyml.g:1386:1: ( ( rule__Music__OwnedSectionsAssignment_11_1 )* )
            // InternalRyml.g:1387:2: ( rule__Music__OwnedSectionsAssignment_11_1 )*
            {
             before(grammarAccess.getMusicAccess().getOwnedSectionsAssignment_11_1()); 
            // InternalRyml.g:1388:2: ( rule__Music__OwnedSectionsAssignment_11_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRyml.g:1388:3: rule__Music__OwnedSectionsAssignment_11_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Music__OwnedSectionsAssignment_11_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMusicAccess().getOwnedSectionsAssignment_11_1()); 

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
    // $ANTLR end "rule__Music__Group_11__1__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // InternalRyml.g:1397:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1401:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalRyml.g:1402:2: rule__Section__Group__0__Impl rule__Section__Group__1
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
    // InternalRyml.g:1409:1: rule__Section__Group__0__Impl : ( 'Section' ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1413:1: ( ( 'Section' ) )
            // InternalRyml.g:1414:1: ( 'Section' )
            {
            // InternalRyml.g:1414:1: ( 'Section' )
            // InternalRyml.g:1415:2: 'Section'
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
    // InternalRyml.g:1424:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1428:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalRyml.g:1429:2: rule__Section__Group__1__Impl rule__Section__Group__2
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
    // InternalRyml.g:1436:1: rule__Section__Group__1__Impl : ( ( rule__Section__NameAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1440:1: ( ( ( rule__Section__NameAssignment_1 ) ) )
            // InternalRyml.g:1441:1: ( ( rule__Section__NameAssignment_1 ) )
            {
            // InternalRyml.g:1441:1: ( ( rule__Section__NameAssignment_1 ) )
            // InternalRyml.g:1442:2: ( rule__Section__NameAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1()); 
            // InternalRyml.g:1443:2: ( rule__Section__NameAssignment_1 )
            // InternalRyml.g:1443:3: rule__Section__NameAssignment_1
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
    // InternalRyml.g:1451:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1455:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalRyml.g:1456:2: rule__Section__Group__2__Impl rule__Section__Group__3
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
    // InternalRyml.g:1463:1: rule__Section__Group__2__Impl : ( ':' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1467:1: ( ( ':' ) )
            // InternalRyml.g:1468:1: ( ':' )
            {
            // InternalRyml.g:1468:1: ( ':' )
            // InternalRyml.g:1469:2: ':'
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
    // InternalRyml.g:1478:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1482:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalRyml.g:1483:2: rule__Section__Group__3__Impl rule__Section__Group__4
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
    // InternalRyml.g:1490:1: rule__Section__Group__3__Impl : ( ( rule__Section__PatternsAssignment_3 ) ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1494:1: ( ( ( rule__Section__PatternsAssignment_3 ) ) )
            // InternalRyml.g:1495:1: ( ( rule__Section__PatternsAssignment_3 ) )
            {
            // InternalRyml.g:1495:1: ( ( rule__Section__PatternsAssignment_3 ) )
            // InternalRyml.g:1496:2: ( rule__Section__PatternsAssignment_3 )
            {
             before(grammarAccess.getSectionAccess().getPatternsAssignment_3()); 
            // InternalRyml.g:1497:2: ( rule__Section__PatternsAssignment_3 )
            // InternalRyml.g:1497:3: rule__Section__PatternsAssignment_3
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
    // InternalRyml.g:1505:1: rule__Section__Group__4 : rule__Section__Group__4__Impl ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1509:1: ( rule__Section__Group__4__Impl )
            // InternalRyml.g:1510:2: rule__Section__Group__4__Impl
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
    // InternalRyml.g:1516:1: rule__Section__Group__4__Impl : ( ( rule__Section__Group_4__0 )* ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1520:1: ( ( ( rule__Section__Group_4__0 )* ) )
            // InternalRyml.g:1521:1: ( ( rule__Section__Group_4__0 )* )
            {
            // InternalRyml.g:1521:1: ( ( rule__Section__Group_4__0 )* )
            // InternalRyml.g:1522:2: ( rule__Section__Group_4__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_4()); 
            // InternalRyml.g:1523:2: ( rule__Section__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRyml.g:1523:3: rule__Section__Group_4__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Section__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalRyml.g:1532:1: rule__Section__Group_4__0 : rule__Section__Group_4__0__Impl rule__Section__Group_4__1 ;
    public final void rule__Section__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1536:1: ( rule__Section__Group_4__0__Impl rule__Section__Group_4__1 )
            // InternalRyml.g:1537:2: rule__Section__Group_4__0__Impl rule__Section__Group_4__1
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
    // InternalRyml.g:1544:1: rule__Section__Group_4__0__Impl : ( '|' ) ;
    public final void rule__Section__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1548:1: ( ( '|' ) )
            // InternalRyml.g:1549:1: ( '|' )
            {
            // InternalRyml.g:1549:1: ( '|' )
            // InternalRyml.g:1550:2: '|'
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
    // InternalRyml.g:1559:1: rule__Section__Group_4__1 : rule__Section__Group_4__1__Impl ;
    public final void rule__Section__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1563:1: ( rule__Section__Group_4__1__Impl )
            // InternalRyml.g:1564:2: rule__Section__Group_4__1__Impl
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
    // InternalRyml.g:1570:1: rule__Section__Group_4__1__Impl : ( ( rule__Section__PatternsAssignment_4_1 ) ) ;
    public final void rule__Section__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1574:1: ( ( ( rule__Section__PatternsAssignment_4_1 ) ) )
            // InternalRyml.g:1575:1: ( ( rule__Section__PatternsAssignment_4_1 ) )
            {
            // InternalRyml.g:1575:1: ( ( rule__Section__PatternsAssignment_4_1 ) )
            // InternalRyml.g:1576:2: ( rule__Section__PatternsAssignment_4_1 )
            {
             before(grammarAccess.getSectionAccess().getPatternsAssignment_4_1()); 
            // InternalRyml.g:1577:2: ( rule__Section__PatternsAssignment_4_1 )
            // InternalRyml.g:1577:3: rule__Section__PatternsAssignment_4_1
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
    // InternalRyml.g:1586:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1590:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalRyml.g:1591:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalRyml.g:1598:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1602:1: ( ( ( '-' )? ) )
            // InternalRyml.g:1603:1: ( ( '-' )? )
            {
            // InternalRyml.g:1603:1: ( ( '-' )? )
            // InternalRyml.g:1604:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalRyml.g:1605:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRyml.g:1605:3: '-'
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
    // InternalRyml.g:1613:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1617:1: ( rule__EInt__Group__1__Impl )
            // InternalRyml.g:1618:2: rule__EInt__Group__1__Impl
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
    // InternalRyml.g:1624:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1628:1: ( ( RULE_INT ) )
            // InternalRyml.g:1629:1: ( RULE_INT )
            {
            // InternalRyml.g:1629:1: ( RULE_INT )
            // InternalRyml.g:1630:2: RULE_INT
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
    // InternalRyml.g:1640:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1644:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalRyml.g:1645:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
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
    // InternalRyml.g:1652:1: rule__Pattern__Group__0__Impl : ( 'Pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1656:1: ( ( 'Pattern' ) )
            // InternalRyml.g:1657:1: ( 'Pattern' )
            {
            // InternalRyml.g:1657:1: ( 'Pattern' )
            // InternalRyml.g:1658:2: 'Pattern'
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
    // InternalRyml.g:1667:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1671:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalRyml.g:1672:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
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
    // InternalRyml.g:1679:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1683:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // InternalRyml.g:1684:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // InternalRyml.g:1684:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // InternalRyml.g:1685:2: ( rule__Pattern__NameAssignment_1 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            // InternalRyml.g:1686:2: ( rule__Pattern__NameAssignment_1 )
            // InternalRyml.g:1686:3: rule__Pattern__NameAssignment_1
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
    // InternalRyml.g:1694:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1698:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalRyml.g:1699:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
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
    // InternalRyml.g:1706:1: rule__Pattern__Group__2__Impl : ( ':' ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1710:1: ( ( ':' ) )
            // InternalRyml.g:1711:1: ( ':' )
            {
            // InternalRyml.g:1711:1: ( ':' )
            // InternalRyml.g:1712:2: ':'
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
    // InternalRyml.g:1721:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1725:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalRyml.g:1726:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
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
    // InternalRyml.g:1733:1: rule__Pattern__Group__3__Impl : ( ( rule__Pattern__BarsAssignment_3 ) ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1737:1: ( ( ( rule__Pattern__BarsAssignment_3 ) ) )
            // InternalRyml.g:1738:1: ( ( rule__Pattern__BarsAssignment_3 ) )
            {
            // InternalRyml.g:1738:1: ( ( rule__Pattern__BarsAssignment_3 ) )
            // InternalRyml.g:1739:2: ( rule__Pattern__BarsAssignment_3 )
            {
             before(grammarAccess.getPatternAccess().getBarsAssignment_3()); 
            // InternalRyml.g:1740:2: ( rule__Pattern__BarsAssignment_3 )
            // InternalRyml.g:1740:3: rule__Pattern__BarsAssignment_3
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
    // InternalRyml.g:1748:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1752:1: ( rule__Pattern__Group__4__Impl )
            // InternalRyml.g:1753:2: rule__Pattern__Group__4__Impl
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
    // InternalRyml.g:1759:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__Group_4__0 )* ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1763:1: ( ( ( rule__Pattern__Group_4__0 )* ) )
            // InternalRyml.g:1764:1: ( ( rule__Pattern__Group_4__0 )* )
            {
            // InternalRyml.g:1764:1: ( ( rule__Pattern__Group_4__0 )* )
            // InternalRyml.g:1765:2: ( rule__Pattern__Group_4__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_4()); 
            // InternalRyml.g:1766:2: ( rule__Pattern__Group_4__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRyml.g:1766:3: rule__Pattern__Group_4__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Pattern__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalRyml.g:1775:1: rule__Pattern__Group_4__0 : rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 ;
    public final void rule__Pattern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1779:1: ( rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 )
            // InternalRyml.g:1780:2: rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1
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
    // InternalRyml.g:1787:1: rule__Pattern__Group_4__0__Impl : ( '|' ) ;
    public final void rule__Pattern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1791:1: ( ( '|' ) )
            // InternalRyml.g:1792:1: ( '|' )
            {
            // InternalRyml.g:1792:1: ( '|' )
            // InternalRyml.g:1793:2: '|'
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
    // InternalRyml.g:1802:1: rule__Pattern__Group_4__1 : rule__Pattern__Group_4__1__Impl ;
    public final void rule__Pattern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1806:1: ( rule__Pattern__Group_4__1__Impl )
            // InternalRyml.g:1807:2: rule__Pattern__Group_4__1__Impl
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
    // InternalRyml.g:1813:1: rule__Pattern__Group_4__1__Impl : ( ( rule__Pattern__BarsAssignment_4_1 ) ) ;
    public final void rule__Pattern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1817:1: ( ( ( rule__Pattern__BarsAssignment_4_1 ) ) )
            // InternalRyml.g:1818:1: ( ( rule__Pattern__BarsAssignment_4_1 ) )
            {
            // InternalRyml.g:1818:1: ( ( rule__Pattern__BarsAssignment_4_1 ) )
            // InternalRyml.g:1819:2: ( rule__Pattern__BarsAssignment_4_1 )
            {
             before(grammarAccess.getPatternAccess().getBarsAssignment_4_1()); 
            // InternalRyml.g:1820:2: ( rule__Pattern__BarsAssignment_4_1 )
            // InternalRyml.g:1820:3: rule__Pattern__BarsAssignment_4_1
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


    // $ANTLR start "rule__BarMultiplier__Group__0"
    // InternalRyml.g:1829:1: rule__BarMultiplier__Group__0 : rule__BarMultiplier__Group__0__Impl rule__BarMultiplier__Group__1 ;
    public final void rule__BarMultiplier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1833:1: ( rule__BarMultiplier__Group__0__Impl rule__BarMultiplier__Group__1 )
            // InternalRyml.g:1834:2: rule__BarMultiplier__Group__0__Impl rule__BarMultiplier__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BarMultiplier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarMultiplier__Group__1();

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
    // $ANTLR end "rule__BarMultiplier__Group__0"


    // $ANTLR start "rule__BarMultiplier__Group__0__Impl"
    // InternalRyml.g:1841:1: rule__BarMultiplier__Group__0__Impl : ( () ) ;
    public final void rule__BarMultiplier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1845:1: ( ( () ) )
            // InternalRyml.g:1846:1: ( () )
            {
            // InternalRyml.g:1846:1: ( () )
            // InternalRyml.g:1847:2: ()
            {
             before(grammarAccess.getBarMultiplierAccess().getBarMultiplierAction_0()); 
            // InternalRyml.g:1848:2: ()
            // InternalRyml.g:1848:3: 
            {
            }

             after(grammarAccess.getBarMultiplierAccess().getBarMultiplierAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarMultiplier__Group__0__Impl"


    // $ANTLR start "rule__BarMultiplier__Group__1"
    // InternalRyml.g:1856:1: rule__BarMultiplier__Group__1 : rule__BarMultiplier__Group__1__Impl rule__BarMultiplier__Group__2 ;
    public final void rule__BarMultiplier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1860:1: ( rule__BarMultiplier__Group__1__Impl rule__BarMultiplier__Group__2 )
            // InternalRyml.g:1861:2: rule__BarMultiplier__Group__1__Impl rule__BarMultiplier__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__BarMultiplier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarMultiplier__Group__2();

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
    // $ANTLR end "rule__BarMultiplier__Group__1"


    // $ANTLR start "rule__BarMultiplier__Group__1__Impl"
    // InternalRyml.g:1868:1: rule__BarMultiplier__Group__1__Impl : ( ( rule__BarMultiplier__BarAssignment_1 ) ) ;
    public final void rule__BarMultiplier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1872:1: ( ( ( rule__BarMultiplier__BarAssignment_1 ) ) )
            // InternalRyml.g:1873:1: ( ( rule__BarMultiplier__BarAssignment_1 ) )
            {
            // InternalRyml.g:1873:1: ( ( rule__BarMultiplier__BarAssignment_1 ) )
            // InternalRyml.g:1874:2: ( rule__BarMultiplier__BarAssignment_1 )
            {
             before(grammarAccess.getBarMultiplierAccess().getBarAssignment_1()); 
            // InternalRyml.g:1875:2: ( rule__BarMultiplier__BarAssignment_1 )
            // InternalRyml.g:1875:3: rule__BarMultiplier__BarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BarMultiplier__BarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBarMultiplierAccess().getBarAssignment_1()); 

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
    // $ANTLR end "rule__BarMultiplier__Group__1__Impl"


    // $ANTLR start "rule__BarMultiplier__Group__2"
    // InternalRyml.g:1883:1: rule__BarMultiplier__Group__2 : rule__BarMultiplier__Group__2__Impl ;
    public final void rule__BarMultiplier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1887:1: ( rule__BarMultiplier__Group__2__Impl )
            // InternalRyml.g:1888:2: rule__BarMultiplier__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarMultiplier__Group__2__Impl();

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
    // $ANTLR end "rule__BarMultiplier__Group__2"


    // $ANTLR start "rule__BarMultiplier__Group__2__Impl"
    // InternalRyml.g:1894:1: rule__BarMultiplier__Group__2__Impl : ( ( rule__BarMultiplier__Group_2__0 )? ) ;
    public final void rule__BarMultiplier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1898:1: ( ( ( rule__BarMultiplier__Group_2__0 )? ) )
            // InternalRyml.g:1899:1: ( ( rule__BarMultiplier__Group_2__0 )? )
            {
            // InternalRyml.g:1899:1: ( ( rule__BarMultiplier__Group_2__0 )? )
            // InternalRyml.g:1900:2: ( rule__BarMultiplier__Group_2__0 )?
            {
             before(grammarAccess.getBarMultiplierAccess().getGroup_2()); 
            // InternalRyml.g:1901:2: ( rule__BarMultiplier__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRyml.g:1901:3: rule__BarMultiplier__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarMultiplier__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarMultiplierAccess().getGroup_2()); 

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
    // $ANTLR end "rule__BarMultiplier__Group__2__Impl"


    // $ANTLR start "rule__BarMultiplier__Group_2__0"
    // InternalRyml.g:1910:1: rule__BarMultiplier__Group_2__0 : rule__BarMultiplier__Group_2__0__Impl rule__BarMultiplier__Group_2__1 ;
    public final void rule__BarMultiplier__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1914:1: ( rule__BarMultiplier__Group_2__0__Impl rule__BarMultiplier__Group_2__1 )
            // InternalRyml.g:1915:2: rule__BarMultiplier__Group_2__0__Impl rule__BarMultiplier__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__BarMultiplier__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarMultiplier__Group_2__1();

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
    // $ANTLR end "rule__BarMultiplier__Group_2__0"


    // $ANTLR start "rule__BarMultiplier__Group_2__0__Impl"
    // InternalRyml.g:1922:1: rule__BarMultiplier__Group_2__0__Impl : ( 'x' ) ;
    public final void rule__BarMultiplier__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1926:1: ( ( 'x' ) )
            // InternalRyml.g:1927:1: ( 'x' )
            {
            // InternalRyml.g:1927:1: ( 'x' )
            // InternalRyml.g:1928:2: 'x'
            {
             before(grammarAccess.getBarMultiplierAccess().getXKeyword_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBarMultiplierAccess().getXKeyword_2_0()); 

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
    // $ANTLR end "rule__BarMultiplier__Group_2__0__Impl"


    // $ANTLR start "rule__BarMultiplier__Group_2__1"
    // InternalRyml.g:1937:1: rule__BarMultiplier__Group_2__1 : rule__BarMultiplier__Group_2__1__Impl ;
    public final void rule__BarMultiplier__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1941:1: ( rule__BarMultiplier__Group_2__1__Impl )
            // InternalRyml.g:1942:2: rule__BarMultiplier__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarMultiplier__Group_2__1__Impl();

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
    // $ANTLR end "rule__BarMultiplier__Group_2__1"


    // $ANTLR start "rule__BarMultiplier__Group_2__1__Impl"
    // InternalRyml.g:1948:1: rule__BarMultiplier__Group_2__1__Impl : ( ( rule__BarMultiplier__MultiplierAssignment_2_1 ) ) ;
    public final void rule__BarMultiplier__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1952:1: ( ( ( rule__BarMultiplier__MultiplierAssignment_2_1 ) ) )
            // InternalRyml.g:1953:1: ( ( rule__BarMultiplier__MultiplierAssignment_2_1 ) )
            {
            // InternalRyml.g:1953:1: ( ( rule__BarMultiplier__MultiplierAssignment_2_1 ) )
            // InternalRyml.g:1954:2: ( rule__BarMultiplier__MultiplierAssignment_2_1 )
            {
             before(grammarAccess.getBarMultiplierAccess().getMultiplierAssignment_2_1()); 
            // InternalRyml.g:1955:2: ( rule__BarMultiplier__MultiplierAssignment_2_1 )
            // InternalRyml.g:1955:3: rule__BarMultiplier__MultiplierAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BarMultiplier__MultiplierAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBarMultiplierAccess().getMultiplierAssignment_2_1()); 

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
    // $ANTLR end "rule__BarMultiplier__Group_2__1__Impl"


    // $ANTLR start "rule__NoteAddition__Group__0"
    // InternalRyml.g:1964:1: rule__NoteAddition__Group__0 : rule__NoteAddition__Group__0__Impl rule__NoteAddition__Group__1 ;
    public final void rule__NoteAddition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1968:1: ( rule__NoteAddition__Group__0__Impl rule__NoteAddition__Group__1 )
            // InternalRyml.g:1969:2: rule__NoteAddition__Group__0__Impl rule__NoteAddition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__NoteAddition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoteAddition__Group__1();

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
    // $ANTLR end "rule__NoteAddition__Group__0"


    // $ANTLR start "rule__NoteAddition__Group__0__Impl"
    // InternalRyml.g:1976:1: rule__NoteAddition__Group__0__Impl : ( 'beat' ) ;
    public final void rule__NoteAddition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1980:1: ( ( 'beat' ) )
            // InternalRyml.g:1981:1: ( 'beat' )
            {
            // InternalRyml.g:1981:1: ( 'beat' )
            // InternalRyml.g:1982:2: 'beat'
            {
             before(grammarAccess.getNoteAdditionAccess().getBeatKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNoteAdditionAccess().getBeatKeyword_0()); 

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
    // $ANTLR end "rule__NoteAddition__Group__0__Impl"


    // $ANTLR start "rule__NoteAddition__Group__1"
    // InternalRyml.g:1991:1: rule__NoteAddition__Group__1 : rule__NoteAddition__Group__1__Impl rule__NoteAddition__Group__2 ;
    public final void rule__NoteAddition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1995:1: ( rule__NoteAddition__Group__1__Impl rule__NoteAddition__Group__2 )
            // InternalRyml.g:1996:2: rule__NoteAddition__Group__1__Impl rule__NoteAddition__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__NoteAddition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoteAddition__Group__2();

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
    // $ANTLR end "rule__NoteAddition__Group__1"


    // $ANTLR start "rule__NoteAddition__Group__1__Impl"
    // InternalRyml.g:2003:1: rule__NoteAddition__Group__1__Impl : ( ( rule__NoteAddition__BeatNumberAssignment_1 ) ) ;
    public final void rule__NoteAddition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2007:1: ( ( ( rule__NoteAddition__BeatNumberAssignment_1 ) ) )
            // InternalRyml.g:2008:1: ( ( rule__NoteAddition__BeatNumberAssignment_1 ) )
            {
            // InternalRyml.g:2008:1: ( ( rule__NoteAddition__BeatNumberAssignment_1 ) )
            // InternalRyml.g:2009:2: ( rule__NoteAddition__BeatNumberAssignment_1 )
            {
             before(grammarAccess.getNoteAdditionAccess().getBeatNumberAssignment_1()); 
            // InternalRyml.g:2010:2: ( rule__NoteAddition__BeatNumberAssignment_1 )
            // InternalRyml.g:2010:3: rule__NoteAddition__BeatNumberAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NoteAddition__BeatNumberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAdditionAccess().getBeatNumberAssignment_1()); 

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
    // $ANTLR end "rule__NoteAddition__Group__1__Impl"


    // $ANTLR start "rule__NoteAddition__Group__2"
    // InternalRyml.g:2018:1: rule__NoteAddition__Group__2 : rule__NoteAddition__Group__2__Impl rule__NoteAddition__Group__3 ;
    public final void rule__NoteAddition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2022:1: ( rule__NoteAddition__Group__2__Impl rule__NoteAddition__Group__3 )
            // InternalRyml.g:2023:2: rule__NoteAddition__Group__2__Impl rule__NoteAddition__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__NoteAddition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoteAddition__Group__3();

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
    // $ANTLR end "rule__NoteAddition__Group__2"


    // $ANTLR start "rule__NoteAddition__Group__2__Impl"
    // InternalRyml.g:2030:1: rule__NoteAddition__Group__2__Impl : ( 'add' ) ;
    public final void rule__NoteAddition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2034:1: ( ( 'add' ) )
            // InternalRyml.g:2035:1: ( 'add' )
            {
            // InternalRyml.g:2035:1: ( 'add' )
            // InternalRyml.g:2036:2: 'add'
            {
             before(grammarAccess.getNoteAdditionAccess().getAddKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNoteAdditionAccess().getAddKeyword_2()); 

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
    // $ANTLR end "rule__NoteAddition__Group__2__Impl"


    // $ANTLR start "rule__NoteAddition__Group__3"
    // InternalRyml.g:2045:1: rule__NoteAddition__Group__3 : rule__NoteAddition__Group__3__Impl ;
    public final void rule__NoteAddition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2049:1: ( rule__NoteAddition__Group__3__Impl )
            // InternalRyml.g:2050:2: rule__NoteAddition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NoteAddition__Group__3__Impl();

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
    // $ANTLR end "rule__NoteAddition__Group__3"


    // $ANTLR start "rule__NoteAddition__Group__3__Impl"
    // InternalRyml.g:2056:1: rule__NoteAddition__Group__3__Impl : ( ( rule__NoteAddition__NoteAssignment_3 ) ) ;
    public final void rule__NoteAddition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2060:1: ( ( ( rule__NoteAddition__NoteAssignment_3 ) ) )
            // InternalRyml.g:2061:1: ( ( rule__NoteAddition__NoteAssignment_3 ) )
            {
            // InternalRyml.g:2061:1: ( ( rule__NoteAddition__NoteAssignment_3 ) )
            // InternalRyml.g:2062:2: ( rule__NoteAddition__NoteAssignment_3 )
            {
             before(grammarAccess.getNoteAdditionAccess().getNoteAssignment_3()); 
            // InternalRyml.g:2063:2: ( rule__NoteAddition__NoteAssignment_3 )
            // InternalRyml.g:2063:3: rule__NoteAddition__NoteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NoteAddition__NoteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNoteAdditionAccess().getNoteAssignment_3()); 

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
    // $ANTLR end "rule__NoteAddition__Group__3__Impl"


    // $ANTLR start "rule__NoteDeletion__Group__0"
    // InternalRyml.g:2072:1: rule__NoteDeletion__Group__0 : rule__NoteDeletion__Group__0__Impl rule__NoteDeletion__Group__1 ;
    public final void rule__NoteDeletion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2076:1: ( rule__NoteDeletion__Group__0__Impl rule__NoteDeletion__Group__1 )
            // InternalRyml.g:2077:2: rule__NoteDeletion__Group__0__Impl rule__NoteDeletion__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__NoteDeletion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoteDeletion__Group__1();

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
    // $ANTLR end "rule__NoteDeletion__Group__0"


    // $ANTLR start "rule__NoteDeletion__Group__0__Impl"
    // InternalRyml.g:2084:1: rule__NoteDeletion__Group__0__Impl : ( 'beat' ) ;
    public final void rule__NoteDeletion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2088:1: ( ( 'beat' ) )
            // InternalRyml.g:2089:1: ( 'beat' )
            {
            // InternalRyml.g:2089:1: ( 'beat' )
            // InternalRyml.g:2090:2: 'beat'
            {
             before(grammarAccess.getNoteDeletionAccess().getBeatKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNoteDeletionAccess().getBeatKeyword_0()); 

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
    // $ANTLR end "rule__NoteDeletion__Group__0__Impl"


    // $ANTLR start "rule__NoteDeletion__Group__1"
    // InternalRyml.g:2099:1: rule__NoteDeletion__Group__1 : rule__NoteDeletion__Group__1__Impl rule__NoteDeletion__Group__2 ;
    public final void rule__NoteDeletion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2103:1: ( rule__NoteDeletion__Group__1__Impl rule__NoteDeletion__Group__2 )
            // InternalRyml.g:2104:2: rule__NoteDeletion__Group__1__Impl rule__NoteDeletion__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__NoteDeletion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoteDeletion__Group__2();

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
    // $ANTLR end "rule__NoteDeletion__Group__1"


    // $ANTLR start "rule__NoteDeletion__Group__1__Impl"
    // InternalRyml.g:2111:1: rule__NoteDeletion__Group__1__Impl : ( ( rule__NoteDeletion__BeatNumberAssignment_1 ) ) ;
    public final void rule__NoteDeletion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2115:1: ( ( ( rule__NoteDeletion__BeatNumberAssignment_1 ) ) )
            // InternalRyml.g:2116:1: ( ( rule__NoteDeletion__BeatNumberAssignment_1 ) )
            {
            // InternalRyml.g:2116:1: ( ( rule__NoteDeletion__BeatNumberAssignment_1 ) )
            // InternalRyml.g:2117:2: ( rule__NoteDeletion__BeatNumberAssignment_1 )
            {
             before(grammarAccess.getNoteDeletionAccess().getBeatNumberAssignment_1()); 
            // InternalRyml.g:2118:2: ( rule__NoteDeletion__BeatNumberAssignment_1 )
            // InternalRyml.g:2118:3: rule__NoteDeletion__BeatNumberAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NoteDeletion__BeatNumberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteDeletionAccess().getBeatNumberAssignment_1()); 

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
    // $ANTLR end "rule__NoteDeletion__Group__1__Impl"


    // $ANTLR start "rule__NoteDeletion__Group__2"
    // InternalRyml.g:2126:1: rule__NoteDeletion__Group__2 : rule__NoteDeletion__Group__2__Impl rule__NoteDeletion__Group__3 ;
    public final void rule__NoteDeletion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2130:1: ( rule__NoteDeletion__Group__2__Impl rule__NoteDeletion__Group__3 )
            // InternalRyml.g:2131:2: rule__NoteDeletion__Group__2__Impl rule__NoteDeletion__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__NoteDeletion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoteDeletion__Group__3();

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
    // $ANTLR end "rule__NoteDeletion__Group__2"


    // $ANTLR start "rule__NoteDeletion__Group__2__Impl"
    // InternalRyml.g:2138:1: rule__NoteDeletion__Group__2__Impl : ( 'delete' ) ;
    public final void rule__NoteDeletion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2142:1: ( ( 'delete' ) )
            // InternalRyml.g:2143:1: ( 'delete' )
            {
            // InternalRyml.g:2143:1: ( 'delete' )
            // InternalRyml.g:2144:2: 'delete'
            {
             before(grammarAccess.getNoteDeletionAccess().getDeleteKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getNoteDeletionAccess().getDeleteKeyword_2()); 

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
    // $ANTLR end "rule__NoteDeletion__Group__2__Impl"


    // $ANTLR start "rule__NoteDeletion__Group__3"
    // InternalRyml.g:2153:1: rule__NoteDeletion__Group__3 : rule__NoteDeletion__Group__3__Impl ;
    public final void rule__NoteDeletion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2157:1: ( rule__NoteDeletion__Group__3__Impl )
            // InternalRyml.g:2158:2: rule__NoteDeletion__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NoteDeletion__Group__3__Impl();

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
    // $ANTLR end "rule__NoteDeletion__Group__3"


    // $ANTLR start "rule__NoteDeletion__Group__3__Impl"
    // InternalRyml.g:2164:1: rule__NoteDeletion__Group__3__Impl : ( ( rule__NoteDeletion__NoteAssignment_3 ) ) ;
    public final void rule__NoteDeletion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2168:1: ( ( ( rule__NoteDeletion__NoteAssignment_3 ) ) )
            // InternalRyml.g:2169:1: ( ( rule__NoteDeletion__NoteAssignment_3 ) )
            {
            // InternalRyml.g:2169:1: ( ( rule__NoteDeletion__NoteAssignment_3 ) )
            // InternalRyml.g:2170:2: ( rule__NoteDeletion__NoteAssignment_3 )
            {
             before(grammarAccess.getNoteDeletionAccess().getNoteAssignment_3()); 
            // InternalRyml.g:2171:2: ( rule__NoteDeletion__NoteAssignment_3 )
            // InternalRyml.g:2171:3: rule__NoteDeletion__NoteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NoteDeletion__NoteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNoteDeletionAccess().getNoteAssignment_3()); 

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
    // $ANTLR end "rule__NoteDeletion__Group__3__Impl"


    // $ANTLR start "rule__NoteReplacement__Group__0"
    // InternalRyml.g:2180:1: rule__NoteReplacement__Group__0 : rule__NoteReplacement__Group__0__Impl rule__NoteReplacement__Group__1 ;
    public final void rule__NoteReplacement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2184:1: ( rule__NoteReplacement__Group__0__Impl rule__NoteReplacement__Group__1 )
            // InternalRyml.g:2185:2: rule__NoteReplacement__Group__0__Impl rule__NoteReplacement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__NoteReplacement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoteReplacement__Group__1();

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
    // $ANTLR end "rule__NoteReplacement__Group__0"


    // $ANTLR start "rule__NoteReplacement__Group__0__Impl"
    // InternalRyml.g:2192:1: rule__NoteReplacement__Group__0__Impl : ( 'beat' ) ;
    public final void rule__NoteReplacement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2196:1: ( ( 'beat' ) )
            // InternalRyml.g:2197:1: ( 'beat' )
            {
            // InternalRyml.g:2197:1: ( 'beat' )
            // InternalRyml.g:2198:2: 'beat'
            {
             before(grammarAccess.getNoteReplacementAccess().getBeatKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNoteReplacementAccess().getBeatKeyword_0()); 

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
    // $ANTLR end "rule__NoteReplacement__Group__0__Impl"


    // $ANTLR start "rule__NoteReplacement__Group__1"
    // InternalRyml.g:2207:1: rule__NoteReplacement__Group__1 : rule__NoteReplacement__Group__1__Impl rule__NoteReplacement__Group__2 ;
    public final void rule__NoteReplacement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2211:1: ( rule__NoteReplacement__Group__1__Impl rule__NoteReplacement__Group__2 )
            // InternalRyml.g:2212:2: rule__NoteReplacement__Group__1__Impl rule__NoteReplacement__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__NoteReplacement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoteReplacement__Group__2();

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
    // $ANTLR end "rule__NoteReplacement__Group__1"


    // $ANTLR start "rule__NoteReplacement__Group__1__Impl"
    // InternalRyml.g:2219:1: rule__NoteReplacement__Group__1__Impl : ( ( rule__NoteReplacement__BeatNumberAssignment_1 ) ) ;
    public final void rule__NoteReplacement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2223:1: ( ( ( rule__NoteReplacement__BeatNumberAssignment_1 ) ) )
            // InternalRyml.g:2224:1: ( ( rule__NoteReplacement__BeatNumberAssignment_1 ) )
            {
            // InternalRyml.g:2224:1: ( ( rule__NoteReplacement__BeatNumberAssignment_1 ) )
            // InternalRyml.g:2225:2: ( rule__NoteReplacement__BeatNumberAssignment_1 )
            {
             before(grammarAccess.getNoteReplacementAccess().getBeatNumberAssignment_1()); 
            // InternalRyml.g:2226:2: ( rule__NoteReplacement__BeatNumberAssignment_1 )
            // InternalRyml.g:2226:3: rule__NoteReplacement__BeatNumberAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NoteReplacement__BeatNumberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteReplacementAccess().getBeatNumberAssignment_1()); 

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
    // $ANTLR end "rule__NoteReplacement__Group__1__Impl"


    // $ANTLR start "rule__NoteReplacement__Group__2"
    // InternalRyml.g:2234:1: rule__NoteReplacement__Group__2 : rule__NoteReplacement__Group__2__Impl rule__NoteReplacement__Group__3 ;
    public final void rule__NoteReplacement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2238:1: ( rule__NoteReplacement__Group__2__Impl rule__NoteReplacement__Group__3 )
            // InternalRyml.g:2239:2: rule__NoteReplacement__Group__2__Impl rule__NoteReplacement__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__NoteReplacement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoteReplacement__Group__3();

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
    // $ANTLR end "rule__NoteReplacement__Group__2"


    // $ANTLR start "rule__NoteReplacement__Group__2__Impl"
    // InternalRyml.g:2246:1: rule__NoteReplacement__Group__2__Impl : ( 'replace' ) ;
    public final void rule__NoteReplacement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2250:1: ( ( 'replace' ) )
            // InternalRyml.g:2251:1: ( 'replace' )
            {
            // InternalRyml.g:2251:1: ( 'replace' )
            // InternalRyml.g:2252:2: 'replace'
            {
             before(grammarAccess.getNoteReplacementAccess().getReplaceKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNoteReplacementAccess().getReplaceKeyword_2()); 

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
    // $ANTLR end "rule__NoteReplacement__Group__2__Impl"


    // $ANTLR start "rule__NoteReplacement__Group__3"
    // InternalRyml.g:2261:1: rule__NoteReplacement__Group__3 : rule__NoteReplacement__Group__3__Impl rule__NoteReplacement__Group__4 ;
    public final void rule__NoteReplacement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2265:1: ( rule__NoteReplacement__Group__3__Impl rule__NoteReplacement__Group__4 )
            // InternalRyml.g:2266:2: rule__NoteReplacement__Group__3__Impl rule__NoteReplacement__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__NoteReplacement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoteReplacement__Group__4();

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
    // $ANTLR end "rule__NoteReplacement__Group__3"


    // $ANTLR start "rule__NoteReplacement__Group__3__Impl"
    // InternalRyml.g:2273:1: rule__NoteReplacement__Group__3__Impl : ( ( rule__NoteReplacement__NoteSrcAssignment_3 ) ) ;
    public final void rule__NoteReplacement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2277:1: ( ( ( rule__NoteReplacement__NoteSrcAssignment_3 ) ) )
            // InternalRyml.g:2278:1: ( ( rule__NoteReplacement__NoteSrcAssignment_3 ) )
            {
            // InternalRyml.g:2278:1: ( ( rule__NoteReplacement__NoteSrcAssignment_3 ) )
            // InternalRyml.g:2279:2: ( rule__NoteReplacement__NoteSrcAssignment_3 )
            {
             before(grammarAccess.getNoteReplacementAccess().getNoteSrcAssignment_3()); 
            // InternalRyml.g:2280:2: ( rule__NoteReplacement__NoteSrcAssignment_3 )
            // InternalRyml.g:2280:3: rule__NoteReplacement__NoteSrcAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NoteReplacement__NoteSrcAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNoteReplacementAccess().getNoteSrcAssignment_3()); 

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
    // $ANTLR end "rule__NoteReplacement__Group__3__Impl"


    // $ANTLR start "rule__NoteReplacement__Group__4"
    // InternalRyml.g:2288:1: rule__NoteReplacement__Group__4 : rule__NoteReplacement__Group__4__Impl rule__NoteReplacement__Group__5 ;
    public final void rule__NoteReplacement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2292:1: ( rule__NoteReplacement__Group__4__Impl rule__NoteReplacement__Group__5 )
            // InternalRyml.g:2293:2: rule__NoteReplacement__Group__4__Impl rule__NoteReplacement__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__NoteReplacement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoteReplacement__Group__5();

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
    // $ANTLR end "rule__NoteReplacement__Group__4"


    // $ANTLR start "rule__NoteReplacement__Group__4__Impl"
    // InternalRyml.g:2300:1: rule__NoteReplacement__Group__4__Impl : ( 'by' ) ;
    public final void rule__NoteReplacement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2304:1: ( ( 'by' ) )
            // InternalRyml.g:2305:1: ( 'by' )
            {
            // InternalRyml.g:2305:1: ( 'by' )
            // InternalRyml.g:2306:2: 'by'
            {
             before(grammarAccess.getNoteReplacementAccess().getByKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNoteReplacementAccess().getByKeyword_4()); 

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
    // $ANTLR end "rule__NoteReplacement__Group__4__Impl"


    // $ANTLR start "rule__NoteReplacement__Group__5"
    // InternalRyml.g:2315:1: rule__NoteReplacement__Group__5 : rule__NoteReplacement__Group__5__Impl ;
    public final void rule__NoteReplacement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2319:1: ( rule__NoteReplacement__Group__5__Impl )
            // InternalRyml.g:2320:2: rule__NoteReplacement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NoteReplacement__Group__5__Impl();

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
    // $ANTLR end "rule__NoteReplacement__Group__5"


    // $ANTLR start "rule__NoteReplacement__Group__5__Impl"
    // InternalRyml.g:2326:1: rule__NoteReplacement__Group__5__Impl : ( ( rule__NoteReplacement__NewNoteAssignment_5 ) ) ;
    public final void rule__NoteReplacement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2330:1: ( ( ( rule__NoteReplacement__NewNoteAssignment_5 ) ) )
            // InternalRyml.g:2331:1: ( ( rule__NoteReplacement__NewNoteAssignment_5 ) )
            {
            // InternalRyml.g:2331:1: ( ( rule__NoteReplacement__NewNoteAssignment_5 ) )
            // InternalRyml.g:2332:2: ( rule__NoteReplacement__NewNoteAssignment_5 )
            {
             before(grammarAccess.getNoteReplacementAccess().getNewNoteAssignment_5()); 
            // InternalRyml.g:2333:2: ( rule__NoteReplacement__NewNoteAssignment_5 )
            // InternalRyml.g:2333:3: rule__NoteReplacement__NewNoteAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__NoteReplacement__NewNoteAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNoteReplacementAccess().getNewNoteAssignment_5()); 

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
    // $ANTLR end "rule__NoteReplacement__Group__5__Impl"


    // $ANTLR start "rule__ClassicalBar__Group__0"
    // InternalRyml.g:2342:1: rule__ClassicalBar__Group__0 : rule__ClassicalBar__Group__0__Impl rule__ClassicalBar__Group__1 ;
    public final void rule__ClassicalBar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2346:1: ( rule__ClassicalBar__Group__0__Impl rule__ClassicalBar__Group__1 )
            // InternalRyml.g:2347:2: rule__ClassicalBar__Group__0__Impl rule__ClassicalBar__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ClassicalBar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalBar__Group__1();

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
    // $ANTLR end "rule__ClassicalBar__Group__0"


    // $ANTLR start "rule__ClassicalBar__Group__0__Impl"
    // InternalRyml.g:2354:1: rule__ClassicalBar__Group__0__Impl : ( () ) ;
    public final void rule__ClassicalBar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2358:1: ( ( () ) )
            // InternalRyml.g:2359:1: ( () )
            {
            // InternalRyml.g:2359:1: ( () )
            // InternalRyml.g:2360:2: ()
            {
             before(grammarAccess.getClassicalBarAccess().getClassicalBarAction_0()); 
            // InternalRyml.g:2361:2: ()
            // InternalRyml.g:2361:3: 
            {
            }

             after(grammarAccess.getClassicalBarAccess().getClassicalBarAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalBar__Group__0__Impl"


    // $ANTLR start "rule__ClassicalBar__Group__1"
    // InternalRyml.g:2369:1: rule__ClassicalBar__Group__1 : rule__ClassicalBar__Group__1__Impl rule__ClassicalBar__Group__2 ;
    public final void rule__ClassicalBar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2373:1: ( rule__ClassicalBar__Group__1__Impl rule__ClassicalBar__Group__2 )
            // InternalRyml.g:2374:2: rule__ClassicalBar__Group__1__Impl rule__ClassicalBar__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ClassicalBar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalBar__Group__2();

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
    // $ANTLR end "rule__ClassicalBar__Group__1"


    // $ANTLR start "rule__ClassicalBar__Group__1__Impl"
    // InternalRyml.g:2381:1: rule__ClassicalBar__Group__1__Impl : ( 'Bar' ) ;
    public final void rule__ClassicalBar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2385:1: ( ( 'Bar' ) )
            // InternalRyml.g:2386:1: ( 'Bar' )
            {
            // InternalRyml.g:2386:1: ( 'Bar' )
            // InternalRyml.g:2387:2: 'Bar'
            {
             before(grammarAccess.getClassicalBarAccess().getBarKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getClassicalBarAccess().getBarKeyword_1()); 

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
    // $ANTLR end "rule__ClassicalBar__Group__1__Impl"


    // $ANTLR start "rule__ClassicalBar__Group__2"
    // InternalRyml.g:2396:1: rule__ClassicalBar__Group__2 : rule__ClassicalBar__Group__2__Impl rule__ClassicalBar__Group__3 ;
    public final void rule__ClassicalBar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2400:1: ( rule__ClassicalBar__Group__2__Impl rule__ClassicalBar__Group__3 )
            // InternalRyml.g:2401:2: rule__ClassicalBar__Group__2__Impl rule__ClassicalBar__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ClassicalBar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalBar__Group__3();

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
    // $ANTLR end "rule__ClassicalBar__Group__2"


    // $ANTLR start "rule__ClassicalBar__Group__2__Impl"
    // InternalRyml.g:2408:1: rule__ClassicalBar__Group__2__Impl : ( ( rule__ClassicalBar__NameAssignment_2 ) ) ;
    public final void rule__ClassicalBar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2412:1: ( ( ( rule__ClassicalBar__NameAssignment_2 ) ) )
            // InternalRyml.g:2413:1: ( ( rule__ClassicalBar__NameAssignment_2 ) )
            {
            // InternalRyml.g:2413:1: ( ( rule__ClassicalBar__NameAssignment_2 ) )
            // InternalRyml.g:2414:2: ( rule__ClassicalBar__NameAssignment_2 )
            {
             before(grammarAccess.getClassicalBarAccess().getNameAssignment_2()); 
            // InternalRyml.g:2415:2: ( rule__ClassicalBar__NameAssignment_2 )
            // InternalRyml.g:2415:3: rule__ClassicalBar__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalBar__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassicalBarAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ClassicalBar__Group__2__Impl"


    // $ANTLR start "rule__ClassicalBar__Group__3"
    // InternalRyml.g:2423:1: rule__ClassicalBar__Group__3 : rule__ClassicalBar__Group__3__Impl rule__ClassicalBar__Group__4 ;
    public final void rule__ClassicalBar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2427:1: ( rule__ClassicalBar__Group__3__Impl rule__ClassicalBar__Group__4 )
            // InternalRyml.g:2428:2: rule__ClassicalBar__Group__3__Impl rule__ClassicalBar__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__ClassicalBar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalBar__Group__4();

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
    // $ANTLR end "rule__ClassicalBar__Group__3"


    // $ANTLR start "rule__ClassicalBar__Group__3__Impl"
    // InternalRyml.g:2435:1: rule__ClassicalBar__Group__3__Impl : ( ':' ) ;
    public final void rule__ClassicalBar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2439:1: ( ( ':' ) )
            // InternalRyml.g:2440:1: ( ':' )
            {
            // InternalRyml.g:2440:1: ( ':' )
            // InternalRyml.g:2441:2: ':'
            {
             before(grammarAccess.getClassicalBarAccess().getColonKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getClassicalBarAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__ClassicalBar__Group__3__Impl"


    // $ANTLR start "rule__ClassicalBar__Group__4"
    // InternalRyml.g:2450:1: rule__ClassicalBar__Group__4 : rule__ClassicalBar__Group__4__Impl rule__ClassicalBar__Group__5 ;
    public final void rule__ClassicalBar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2454:1: ( rule__ClassicalBar__Group__4__Impl rule__ClassicalBar__Group__5 )
            // InternalRyml.g:2455:2: rule__ClassicalBar__Group__4__Impl rule__ClassicalBar__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__ClassicalBar__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalBar__Group__5();

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
    // $ANTLR end "rule__ClassicalBar__Group__4"


    // $ANTLR start "rule__ClassicalBar__Group__4__Impl"
    // InternalRyml.g:2462:1: rule__ClassicalBar__Group__4__Impl : ( ( rule__ClassicalBar__BeatsAssignment_4 ) ) ;
    public final void rule__ClassicalBar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2466:1: ( ( ( rule__ClassicalBar__BeatsAssignment_4 ) ) )
            // InternalRyml.g:2467:1: ( ( rule__ClassicalBar__BeatsAssignment_4 ) )
            {
            // InternalRyml.g:2467:1: ( ( rule__ClassicalBar__BeatsAssignment_4 ) )
            // InternalRyml.g:2468:2: ( rule__ClassicalBar__BeatsAssignment_4 )
            {
             before(grammarAccess.getClassicalBarAccess().getBeatsAssignment_4()); 
            // InternalRyml.g:2469:2: ( rule__ClassicalBar__BeatsAssignment_4 )
            // InternalRyml.g:2469:3: rule__ClassicalBar__BeatsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalBar__BeatsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getClassicalBarAccess().getBeatsAssignment_4()); 

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
    // $ANTLR end "rule__ClassicalBar__Group__4__Impl"


    // $ANTLR start "rule__ClassicalBar__Group__5"
    // InternalRyml.g:2477:1: rule__ClassicalBar__Group__5 : rule__ClassicalBar__Group__5__Impl ;
    public final void rule__ClassicalBar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2481:1: ( rule__ClassicalBar__Group__5__Impl )
            // InternalRyml.g:2482:2: rule__ClassicalBar__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalBar__Group__5__Impl();

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
    // $ANTLR end "rule__ClassicalBar__Group__5"


    // $ANTLR start "rule__ClassicalBar__Group__5__Impl"
    // InternalRyml.g:2488:1: rule__ClassicalBar__Group__5__Impl : ( ( rule__ClassicalBar__Group_5__0 )* ) ;
    public final void rule__ClassicalBar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2492:1: ( ( ( rule__ClassicalBar__Group_5__0 )* ) )
            // InternalRyml.g:2493:1: ( ( rule__ClassicalBar__Group_5__0 )* )
            {
            // InternalRyml.g:2493:1: ( ( rule__ClassicalBar__Group_5__0 )* )
            // InternalRyml.g:2494:2: ( rule__ClassicalBar__Group_5__0 )*
            {
             before(grammarAccess.getClassicalBarAccess().getGroup_5()); 
            // InternalRyml.g:2495:2: ( rule__ClassicalBar__Group_5__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==29) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRyml.g:2495:3: rule__ClassicalBar__Group_5__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ClassicalBar__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getClassicalBarAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ClassicalBar__Group__5__Impl"


    // $ANTLR start "rule__ClassicalBar__Group_5__0"
    // InternalRyml.g:2504:1: rule__ClassicalBar__Group_5__0 : rule__ClassicalBar__Group_5__0__Impl rule__ClassicalBar__Group_5__1 ;
    public final void rule__ClassicalBar__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2508:1: ( rule__ClassicalBar__Group_5__0__Impl rule__ClassicalBar__Group_5__1 )
            // InternalRyml.g:2509:2: rule__ClassicalBar__Group_5__0__Impl rule__ClassicalBar__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__ClassicalBar__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalBar__Group_5__1();

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
    // $ANTLR end "rule__ClassicalBar__Group_5__0"


    // $ANTLR start "rule__ClassicalBar__Group_5__0__Impl"
    // InternalRyml.g:2516:1: rule__ClassicalBar__Group_5__0__Impl : ( '|' ) ;
    public final void rule__ClassicalBar__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2520:1: ( ( '|' ) )
            // InternalRyml.g:2521:1: ( '|' )
            {
            // InternalRyml.g:2521:1: ( '|' )
            // InternalRyml.g:2522:2: '|'
            {
             before(grammarAccess.getClassicalBarAccess().getVerticalLineKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getClassicalBarAccess().getVerticalLineKeyword_5_0()); 

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
    // $ANTLR end "rule__ClassicalBar__Group_5__0__Impl"


    // $ANTLR start "rule__ClassicalBar__Group_5__1"
    // InternalRyml.g:2531:1: rule__ClassicalBar__Group_5__1 : rule__ClassicalBar__Group_5__1__Impl ;
    public final void rule__ClassicalBar__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2535:1: ( rule__ClassicalBar__Group_5__1__Impl )
            // InternalRyml.g:2536:2: rule__ClassicalBar__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalBar__Group_5__1__Impl();

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
    // $ANTLR end "rule__ClassicalBar__Group_5__1"


    // $ANTLR start "rule__ClassicalBar__Group_5__1__Impl"
    // InternalRyml.g:2542:1: rule__ClassicalBar__Group_5__1__Impl : ( ( rule__ClassicalBar__BeatsAssignment_5_1 ) ) ;
    public final void rule__ClassicalBar__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2546:1: ( ( ( rule__ClassicalBar__BeatsAssignment_5_1 ) ) )
            // InternalRyml.g:2547:1: ( ( rule__ClassicalBar__BeatsAssignment_5_1 ) )
            {
            // InternalRyml.g:2547:1: ( ( rule__ClassicalBar__BeatsAssignment_5_1 ) )
            // InternalRyml.g:2548:2: ( rule__ClassicalBar__BeatsAssignment_5_1 )
            {
             before(grammarAccess.getClassicalBarAccess().getBeatsAssignment_5_1()); 
            // InternalRyml.g:2549:2: ( rule__ClassicalBar__BeatsAssignment_5_1 )
            // InternalRyml.g:2549:3: rule__ClassicalBar__BeatsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalBar__BeatsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getClassicalBarAccess().getBeatsAssignment_5_1()); 

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
    // $ANTLR end "rule__ClassicalBar__Group_5__1__Impl"


    // $ANTLR start "rule__ModifiedBar__Group__0"
    // InternalRyml.g:2558:1: rule__ModifiedBar__Group__0 : rule__ModifiedBar__Group__0__Impl rule__ModifiedBar__Group__1 ;
    public final void rule__ModifiedBar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2562:1: ( rule__ModifiedBar__Group__0__Impl rule__ModifiedBar__Group__1 )
            // InternalRyml.g:2563:2: rule__ModifiedBar__Group__0__Impl rule__ModifiedBar__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ModifiedBar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifiedBar__Group__1();

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
    // $ANTLR end "rule__ModifiedBar__Group__0"


    // $ANTLR start "rule__ModifiedBar__Group__0__Impl"
    // InternalRyml.g:2570:1: rule__ModifiedBar__Group__0__Impl : ( () ) ;
    public final void rule__ModifiedBar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2574:1: ( ( () ) )
            // InternalRyml.g:2575:1: ( () )
            {
            // InternalRyml.g:2575:1: ( () )
            // InternalRyml.g:2576:2: ()
            {
             before(grammarAccess.getModifiedBarAccess().getModifiedBarAction_0()); 
            // InternalRyml.g:2577:2: ()
            // InternalRyml.g:2577:3: 
            {
            }

             after(grammarAccess.getModifiedBarAccess().getModifiedBarAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiedBar__Group__0__Impl"


    // $ANTLR start "rule__ModifiedBar__Group__1"
    // InternalRyml.g:2585:1: rule__ModifiedBar__Group__1 : rule__ModifiedBar__Group__1__Impl rule__ModifiedBar__Group__2 ;
    public final void rule__ModifiedBar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2589:1: ( rule__ModifiedBar__Group__1__Impl rule__ModifiedBar__Group__2 )
            // InternalRyml.g:2590:2: rule__ModifiedBar__Group__1__Impl rule__ModifiedBar__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ModifiedBar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifiedBar__Group__2();

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
    // $ANTLR end "rule__ModifiedBar__Group__1"


    // $ANTLR start "rule__ModifiedBar__Group__1__Impl"
    // InternalRyml.g:2597:1: rule__ModifiedBar__Group__1__Impl : ( 'Bar' ) ;
    public final void rule__ModifiedBar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2601:1: ( ( 'Bar' ) )
            // InternalRyml.g:2602:1: ( 'Bar' )
            {
            // InternalRyml.g:2602:1: ( 'Bar' )
            // InternalRyml.g:2603:2: 'Bar'
            {
             before(grammarAccess.getModifiedBarAccess().getBarKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getModifiedBarAccess().getBarKeyword_1()); 

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
    // $ANTLR end "rule__ModifiedBar__Group__1__Impl"


    // $ANTLR start "rule__ModifiedBar__Group__2"
    // InternalRyml.g:2612:1: rule__ModifiedBar__Group__2 : rule__ModifiedBar__Group__2__Impl rule__ModifiedBar__Group__3 ;
    public final void rule__ModifiedBar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2616:1: ( rule__ModifiedBar__Group__2__Impl rule__ModifiedBar__Group__3 )
            // InternalRyml.g:2617:2: rule__ModifiedBar__Group__2__Impl rule__ModifiedBar__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ModifiedBar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifiedBar__Group__3();

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
    // $ANTLR end "rule__ModifiedBar__Group__2"


    // $ANTLR start "rule__ModifiedBar__Group__2__Impl"
    // InternalRyml.g:2624:1: rule__ModifiedBar__Group__2__Impl : ( ( rule__ModifiedBar__NameAssignment_2 ) ) ;
    public final void rule__ModifiedBar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2628:1: ( ( ( rule__ModifiedBar__NameAssignment_2 ) ) )
            // InternalRyml.g:2629:1: ( ( rule__ModifiedBar__NameAssignment_2 ) )
            {
            // InternalRyml.g:2629:1: ( ( rule__ModifiedBar__NameAssignment_2 ) )
            // InternalRyml.g:2630:2: ( rule__ModifiedBar__NameAssignment_2 )
            {
             before(grammarAccess.getModifiedBarAccess().getNameAssignment_2()); 
            // InternalRyml.g:2631:2: ( rule__ModifiedBar__NameAssignment_2 )
            // InternalRyml.g:2631:3: rule__ModifiedBar__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ModifiedBar__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModifiedBarAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ModifiedBar__Group__2__Impl"


    // $ANTLR start "rule__ModifiedBar__Group__3"
    // InternalRyml.g:2639:1: rule__ModifiedBar__Group__3 : rule__ModifiedBar__Group__3__Impl rule__ModifiedBar__Group__4 ;
    public final void rule__ModifiedBar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2643:1: ( rule__ModifiedBar__Group__3__Impl rule__ModifiedBar__Group__4 )
            // InternalRyml.g:2644:2: rule__ModifiedBar__Group__3__Impl rule__ModifiedBar__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__ModifiedBar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifiedBar__Group__4();

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
    // $ANTLR end "rule__ModifiedBar__Group__3"


    // $ANTLR start "rule__ModifiedBar__Group__3__Impl"
    // InternalRyml.g:2651:1: rule__ModifiedBar__Group__3__Impl : ( 'based on' ) ;
    public final void rule__ModifiedBar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2655:1: ( ( 'based on' ) )
            // InternalRyml.g:2656:1: ( 'based on' )
            {
            // InternalRyml.g:2656:1: ( 'based on' )
            // InternalRyml.g:2657:2: 'based on'
            {
             before(grammarAccess.getModifiedBarAccess().getBasedOnKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getModifiedBarAccess().getBasedOnKeyword_3()); 

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
    // $ANTLR end "rule__ModifiedBar__Group__3__Impl"


    // $ANTLR start "rule__ModifiedBar__Group__4"
    // InternalRyml.g:2666:1: rule__ModifiedBar__Group__4 : rule__ModifiedBar__Group__4__Impl rule__ModifiedBar__Group__5 ;
    public final void rule__ModifiedBar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2670:1: ( rule__ModifiedBar__Group__4__Impl rule__ModifiedBar__Group__5 )
            // InternalRyml.g:2671:2: rule__ModifiedBar__Group__4__Impl rule__ModifiedBar__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__ModifiedBar__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifiedBar__Group__5();

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
    // $ANTLR end "rule__ModifiedBar__Group__4"


    // $ANTLR start "rule__ModifiedBar__Group__4__Impl"
    // InternalRyml.g:2678:1: rule__ModifiedBar__Group__4__Impl : ( ( rule__ModifiedBar__BarAssignment_4 ) ) ;
    public final void rule__ModifiedBar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2682:1: ( ( ( rule__ModifiedBar__BarAssignment_4 ) ) )
            // InternalRyml.g:2683:1: ( ( rule__ModifiedBar__BarAssignment_4 ) )
            {
            // InternalRyml.g:2683:1: ( ( rule__ModifiedBar__BarAssignment_4 ) )
            // InternalRyml.g:2684:2: ( rule__ModifiedBar__BarAssignment_4 )
            {
             before(grammarAccess.getModifiedBarAccess().getBarAssignment_4()); 
            // InternalRyml.g:2685:2: ( rule__ModifiedBar__BarAssignment_4 )
            // InternalRyml.g:2685:3: rule__ModifiedBar__BarAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ModifiedBar__BarAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModifiedBarAccess().getBarAssignment_4()); 

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
    // $ANTLR end "rule__ModifiedBar__Group__4__Impl"


    // $ANTLR start "rule__ModifiedBar__Group__5"
    // InternalRyml.g:2693:1: rule__ModifiedBar__Group__5 : rule__ModifiedBar__Group__5__Impl rule__ModifiedBar__Group__6 ;
    public final void rule__ModifiedBar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2697:1: ( rule__ModifiedBar__Group__5__Impl rule__ModifiedBar__Group__6 )
            // InternalRyml.g:2698:2: rule__ModifiedBar__Group__5__Impl rule__ModifiedBar__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__ModifiedBar__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifiedBar__Group__6();

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
    // $ANTLR end "rule__ModifiedBar__Group__5"


    // $ANTLR start "rule__ModifiedBar__Group__5__Impl"
    // InternalRyml.g:2705:1: rule__ModifiedBar__Group__5__Impl : ( 'Modifications:' ) ;
    public final void rule__ModifiedBar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2709:1: ( ( 'Modifications:' ) )
            // InternalRyml.g:2710:1: ( 'Modifications:' )
            {
            // InternalRyml.g:2710:1: ( 'Modifications:' )
            // InternalRyml.g:2711:2: 'Modifications:'
            {
             before(grammarAccess.getModifiedBarAccess().getModificationsKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getModifiedBarAccess().getModificationsKeyword_5()); 

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
    // $ANTLR end "rule__ModifiedBar__Group__5__Impl"


    // $ANTLR start "rule__ModifiedBar__Group__6"
    // InternalRyml.g:2720:1: rule__ModifiedBar__Group__6 : rule__ModifiedBar__Group__6__Impl rule__ModifiedBar__Group__7 ;
    public final void rule__ModifiedBar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2724:1: ( rule__ModifiedBar__Group__6__Impl rule__ModifiedBar__Group__7 )
            // InternalRyml.g:2725:2: rule__ModifiedBar__Group__6__Impl rule__ModifiedBar__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__ModifiedBar__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifiedBar__Group__7();

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
    // $ANTLR end "rule__ModifiedBar__Group__6"


    // $ANTLR start "rule__ModifiedBar__Group__6__Impl"
    // InternalRyml.g:2732:1: rule__ModifiedBar__Group__6__Impl : ( '-' ) ;
    public final void rule__ModifiedBar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2736:1: ( ( '-' ) )
            // InternalRyml.g:2737:1: ( '-' )
            {
            // InternalRyml.g:2737:1: ( '-' )
            // InternalRyml.g:2738:2: '-'
            {
             before(grammarAccess.getModifiedBarAccess().getHyphenMinusKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getModifiedBarAccess().getHyphenMinusKeyword_6()); 

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
    // $ANTLR end "rule__ModifiedBar__Group__6__Impl"


    // $ANTLR start "rule__ModifiedBar__Group__7"
    // InternalRyml.g:2747:1: rule__ModifiedBar__Group__7 : rule__ModifiedBar__Group__7__Impl rule__ModifiedBar__Group__8 ;
    public final void rule__ModifiedBar__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2751:1: ( rule__ModifiedBar__Group__7__Impl rule__ModifiedBar__Group__8 )
            // InternalRyml.g:2752:2: rule__ModifiedBar__Group__7__Impl rule__ModifiedBar__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__ModifiedBar__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifiedBar__Group__8();

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
    // $ANTLR end "rule__ModifiedBar__Group__7"


    // $ANTLR start "rule__ModifiedBar__Group__7__Impl"
    // InternalRyml.g:2759:1: rule__ModifiedBar__Group__7__Impl : ( ( rule__ModifiedBar__OperationsAssignment_7 ) ) ;
    public final void rule__ModifiedBar__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2763:1: ( ( ( rule__ModifiedBar__OperationsAssignment_7 ) ) )
            // InternalRyml.g:2764:1: ( ( rule__ModifiedBar__OperationsAssignment_7 ) )
            {
            // InternalRyml.g:2764:1: ( ( rule__ModifiedBar__OperationsAssignment_7 ) )
            // InternalRyml.g:2765:2: ( rule__ModifiedBar__OperationsAssignment_7 )
            {
             before(grammarAccess.getModifiedBarAccess().getOperationsAssignment_7()); 
            // InternalRyml.g:2766:2: ( rule__ModifiedBar__OperationsAssignment_7 )
            // InternalRyml.g:2766:3: rule__ModifiedBar__OperationsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ModifiedBar__OperationsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getModifiedBarAccess().getOperationsAssignment_7()); 

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
    // $ANTLR end "rule__ModifiedBar__Group__7__Impl"


    // $ANTLR start "rule__ModifiedBar__Group__8"
    // InternalRyml.g:2774:1: rule__ModifiedBar__Group__8 : rule__ModifiedBar__Group__8__Impl ;
    public final void rule__ModifiedBar__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2778:1: ( rule__ModifiedBar__Group__8__Impl )
            // InternalRyml.g:2779:2: rule__ModifiedBar__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModifiedBar__Group__8__Impl();

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
    // $ANTLR end "rule__ModifiedBar__Group__8"


    // $ANTLR start "rule__ModifiedBar__Group__8__Impl"
    // InternalRyml.g:2785:1: rule__ModifiedBar__Group__8__Impl : ( ( rule__ModifiedBar__Group_8__0 )* ) ;
    public final void rule__ModifiedBar__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2789:1: ( ( ( rule__ModifiedBar__Group_8__0 )* ) )
            // InternalRyml.g:2790:1: ( ( rule__ModifiedBar__Group_8__0 )* )
            {
            // InternalRyml.g:2790:1: ( ( rule__ModifiedBar__Group_8__0 )* )
            // InternalRyml.g:2791:2: ( rule__ModifiedBar__Group_8__0 )*
            {
             before(grammarAccess.getModifiedBarAccess().getGroup_8()); 
            // InternalRyml.g:2792:2: ( rule__ModifiedBar__Group_8__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==30) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRyml.g:2792:3: rule__ModifiedBar__Group_8__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__ModifiedBar__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getModifiedBarAccess().getGroup_8()); 

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
    // $ANTLR end "rule__ModifiedBar__Group__8__Impl"


    // $ANTLR start "rule__ModifiedBar__Group_8__0"
    // InternalRyml.g:2801:1: rule__ModifiedBar__Group_8__0 : rule__ModifiedBar__Group_8__0__Impl rule__ModifiedBar__Group_8__1 ;
    public final void rule__ModifiedBar__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2805:1: ( rule__ModifiedBar__Group_8__0__Impl rule__ModifiedBar__Group_8__1 )
            // InternalRyml.g:2806:2: rule__ModifiedBar__Group_8__0__Impl rule__ModifiedBar__Group_8__1
            {
            pushFollow(FOLLOW_27);
            rule__ModifiedBar__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifiedBar__Group_8__1();

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
    // $ANTLR end "rule__ModifiedBar__Group_8__0"


    // $ANTLR start "rule__ModifiedBar__Group_8__0__Impl"
    // InternalRyml.g:2813:1: rule__ModifiedBar__Group_8__0__Impl : ( '-' ) ;
    public final void rule__ModifiedBar__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2817:1: ( ( '-' ) )
            // InternalRyml.g:2818:1: ( '-' )
            {
            // InternalRyml.g:2818:1: ( '-' )
            // InternalRyml.g:2819:2: '-'
            {
             before(grammarAccess.getModifiedBarAccess().getHyphenMinusKeyword_8_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getModifiedBarAccess().getHyphenMinusKeyword_8_0()); 

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
    // $ANTLR end "rule__ModifiedBar__Group_8__0__Impl"


    // $ANTLR start "rule__ModifiedBar__Group_8__1"
    // InternalRyml.g:2828:1: rule__ModifiedBar__Group_8__1 : rule__ModifiedBar__Group_8__1__Impl ;
    public final void rule__ModifiedBar__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2832:1: ( rule__ModifiedBar__Group_8__1__Impl )
            // InternalRyml.g:2833:2: rule__ModifiedBar__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModifiedBar__Group_8__1__Impl();

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
    // $ANTLR end "rule__ModifiedBar__Group_8__1"


    // $ANTLR start "rule__ModifiedBar__Group_8__1__Impl"
    // InternalRyml.g:2839:1: rule__ModifiedBar__Group_8__1__Impl : ( ( rule__ModifiedBar__OperationsAssignment_8_1 ) ) ;
    public final void rule__ModifiedBar__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2843:1: ( ( ( rule__ModifiedBar__OperationsAssignment_8_1 ) ) )
            // InternalRyml.g:2844:1: ( ( rule__ModifiedBar__OperationsAssignment_8_1 ) )
            {
            // InternalRyml.g:2844:1: ( ( rule__ModifiedBar__OperationsAssignment_8_1 ) )
            // InternalRyml.g:2845:2: ( rule__ModifiedBar__OperationsAssignment_8_1 )
            {
             before(grammarAccess.getModifiedBarAccess().getOperationsAssignment_8_1()); 
            // InternalRyml.g:2846:2: ( rule__ModifiedBar__OperationsAssignment_8_1 )
            // InternalRyml.g:2846:3: rule__ModifiedBar__OperationsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ModifiedBar__OperationsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getModifiedBarAccess().getOperationsAssignment_8_1()); 

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
    // $ANTLR end "rule__ModifiedBar__Group_8__1__Impl"


    // $ANTLR start "rule__Beat__Group__0"
    // InternalRyml.g:2855:1: rule__Beat__Group__0 : rule__Beat__Group__0__Impl rule__Beat__Group__1 ;
    public final void rule__Beat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2859:1: ( rule__Beat__Group__0__Impl rule__Beat__Group__1 )
            // InternalRyml.g:2860:2: rule__Beat__Group__0__Impl rule__Beat__Group__1
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
    // InternalRyml.g:2867:1: rule__Beat__Group__0__Impl : ( 'Beat' ) ;
    public final void rule__Beat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2871:1: ( ( 'Beat' ) )
            // InternalRyml.g:2872:1: ( 'Beat' )
            {
            // InternalRyml.g:2872:1: ( 'Beat' )
            // InternalRyml.g:2873:2: 'Beat'
            {
             before(grammarAccess.getBeatAccess().getBeatKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalRyml.g:2882:1: rule__Beat__Group__1 : rule__Beat__Group__1__Impl rule__Beat__Group__2 ;
    public final void rule__Beat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2886:1: ( rule__Beat__Group__1__Impl rule__Beat__Group__2 )
            // InternalRyml.g:2887:2: rule__Beat__Group__1__Impl rule__Beat__Group__2
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
    // InternalRyml.g:2894:1: rule__Beat__Group__1__Impl : ( ( rule__Beat__NameAssignment_1 ) ) ;
    public final void rule__Beat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2898:1: ( ( ( rule__Beat__NameAssignment_1 ) ) )
            // InternalRyml.g:2899:1: ( ( rule__Beat__NameAssignment_1 ) )
            {
            // InternalRyml.g:2899:1: ( ( rule__Beat__NameAssignment_1 ) )
            // InternalRyml.g:2900:2: ( rule__Beat__NameAssignment_1 )
            {
             before(grammarAccess.getBeatAccess().getNameAssignment_1()); 
            // InternalRyml.g:2901:2: ( rule__Beat__NameAssignment_1 )
            // InternalRyml.g:2901:3: rule__Beat__NameAssignment_1
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
    // InternalRyml.g:2909:1: rule__Beat__Group__2 : rule__Beat__Group__2__Impl rule__Beat__Group__3 ;
    public final void rule__Beat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2913:1: ( rule__Beat__Group__2__Impl rule__Beat__Group__3 )
            // InternalRyml.g:2914:2: rule__Beat__Group__2__Impl rule__Beat__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalRyml.g:2921:1: rule__Beat__Group__2__Impl : ( ':' ) ;
    public final void rule__Beat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2925:1: ( ( ':' ) )
            // InternalRyml.g:2926:1: ( ':' )
            {
            // InternalRyml.g:2926:1: ( ':' )
            // InternalRyml.g:2927:2: ':'
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
    // InternalRyml.g:2936:1: rule__Beat__Group__3 : rule__Beat__Group__3__Impl rule__Beat__Group__4 ;
    public final void rule__Beat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2940:1: ( rule__Beat__Group__3__Impl rule__Beat__Group__4 )
            // InternalRyml.g:2941:2: rule__Beat__Group__3__Impl rule__Beat__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalRyml.g:2948:1: rule__Beat__Group__3__Impl : ( ( rule__Beat__Group_3__0 )? ) ;
    public final void rule__Beat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2952:1: ( ( ( rule__Beat__Group_3__0 )? ) )
            // InternalRyml.g:2953:1: ( ( rule__Beat__Group_3__0 )? )
            {
            // InternalRyml.g:2953:1: ( ( rule__Beat__Group_3__0 )? )
            // InternalRyml.g:2954:2: ( rule__Beat__Group_3__0 )?
            {
             before(grammarAccess.getBeatAccess().getGroup_3()); 
            // InternalRyml.g:2955:2: ( rule__Beat__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRyml.g:2955:3: rule__Beat__Group_3__0
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
    // InternalRyml.g:2963:1: rule__Beat__Group__4 : rule__Beat__Group__4__Impl rule__Beat__Group__5 ;
    public final void rule__Beat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2967:1: ( rule__Beat__Group__4__Impl rule__Beat__Group__5 )
            // InternalRyml.g:2968:2: rule__Beat__Group__4__Impl rule__Beat__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalRyml.g:2975:1: rule__Beat__Group__4__Impl : ( ( rule__Beat__NotesAssignment_4 ) ) ;
    public final void rule__Beat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2979:1: ( ( ( rule__Beat__NotesAssignment_4 ) ) )
            // InternalRyml.g:2980:1: ( ( rule__Beat__NotesAssignment_4 ) )
            {
            // InternalRyml.g:2980:1: ( ( rule__Beat__NotesAssignment_4 ) )
            // InternalRyml.g:2981:2: ( rule__Beat__NotesAssignment_4 )
            {
             before(grammarAccess.getBeatAccess().getNotesAssignment_4()); 
            // InternalRyml.g:2982:2: ( rule__Beat__NotesAssignment_4 )
            // InternalRyml.g:2982:3: rule__Beat__NotesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Beat__NotesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBeatAccess().getNotesAssignment_4()); 

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
    // InternalRyml.g:2990:1: rule__Beat__Group__5 : rule__Beat__Group__5__Impl rule__Beat__Group__6 ;
    public final void rule__Beat__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2994:1: ( rule__Beat__Group__5__Impl rule__Beat__Group__6 )
            // InternalRyml.g:2995:2: rule__Beat__Group__5__Impl rule__Beat__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalRyml.g:3002:1: rule__Beat__Group__5__Impl : ( ',' ) ;
    public final void rule__Beat__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3006:1: ( ( ',' ) )
            // InternalRyml.g:3007:1: ( ',' )
            {
            // InternalRyml.g:3007:1: ( ',' )
            // InternalRyml.g:3008:2: ','
            {
             before(grammarAccess.getBeatAccess().getCommaKeyword_5()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBeatAccess().getCommaKeyword_5()); 

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
    // InternalRyml.g:3017:1: rule__Beat__Group__6 : rule__Beat__Group__6__Impl rule__Beat__Group__7 ;
    public final void rule__Beat__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3021:1: ( rule__Beat__Group__6__Impl rule__Beat__Group__7 )
            // InternalRyml.g:3022:2: rule__Beat__Group__6__Impl rule__Beat__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalRyml.g:3029:1: rule__Beat__Group__6__Impl : ( ( rule__Beat__NotePositionsAssignment_6 ) ) ;
    public final void rule__Beat__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3033:1: ( ( ( rule__Beat__NotePositionsAssignment_6 ) ) )
            // InternalRyml.g:3034:1: ( ( rule__Beat__NotePositionsAssignment_6 ) )
            {
            // InternalRyml.g:3034:1: ( ( rule__Beat__NotePositionsAssignment_6 ) )
            // InternalRyml.g:3035:2: ( rule__Beat__NotePositionsAssignment_6 )
            {
             before(grammarAccess.getBeatAccess().getNotePositionsAssignment_6()); 
            // InternalRyml.g:3036:2: ( rule__Beat__NotePositionsAssignment_6 )
            // InternalRyml.g:3036:3: rule__Beat__NotePositionsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Beat__NotePositionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBeatAccess().getNotePositionsAssignment_6()); 

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
    // InternalRyml.g:3044:1: rule__Beat__Group__7 : rule__Beat__Group__7__Impl ;
    public final void rule__Beat__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3048:1: ( rule__Beat__Group__7__Impl )
            // InternalRyml.g:3049:2: rule__Beat__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Beat__Group__7__Impl();

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
    // InternalRyml.g:3055:1: rule__Beat__Group__7__Impl : ( ( rule__Beat__Group_7__0 )* ) ;
    public final void rule__Beat__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3059:1: ( ( ( rule__Beat__Group_7__0 )* ) )
            // InternalRyml.g:3060:1: ( ( rule__Beat__Group_7__0 )* )
            {
            // InternalRyml.g:3060:1: ( ( rule__Beat__Group_7__0 )* )
            // InternalRyml.g:3061:2: ( rule__Beat__Group_7__0 )*
            {
             before(grammarAccess.getBeatAccess().getGroup_7()); 
            // InternalRyml.g:3062:2: ( rule__Beat__Group_7__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==29) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRyml.g:3062:3: rule__Beat__Group_7__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Beat__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getBeatAccess().getGroup_7()); 

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


    // $ANTLR start "rule__Beat__Group_3__0"
    // InternalRyml.g:3071:1: rule__Beat__Group_3__0 : rule__Beat__Group_3__0__Impl rule__Beat__Group_3__1 ;
    public final void rule__Beat__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3075:1: ( rule__Beat__Group_3__0__Impl rule__Beat__Group_3__1 )
            // InternalRyml.g:3076:2: rule__Beat__Group_3__0__Impl rule__Beat__Group_3__1
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
    // InternalRyml.g:3083:1: rule__Beat__Group_3__0__Impl : ( 'Nb of ticks :' ) ;
    public final void rule__Beat__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3087:1: ( ( 'Nb of ticks :' ) )
            // InternalRyml.g:3088:1: ( 'Nb of ticks :' )
            {
            // InternalRyml.g:3088:1: ( 'Nb of ticks :' )
            // InternalRyml.g:3089:2: 'Nb of ticks :'
            {
             before(grammarAccess.getBeatAccess().getNbOfTicksKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalRyml.g:3098:1: rule__Beat__Group_3__1 : rule__Beat__Group_3__1__Impl ;
    public final void rule__Beat__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3102:1: ( rule__Beat__Group_3__1__Impl )
            // InternalRyml.g:3103:2: rule__Beat__Group_3__1__Impl
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
    // InternalRyml.g:3109:1: rule__Beat__Group_3__1__Impl : ( ( rule__Beat__TotalDivNumberAssignment_3_1 ) ) ;
    public final void rule__Beat__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3113:1: ( ( ( rule__Beat__TotalDivNumberAssignment_3_1 ) ) )
            // InternalRyml.g:3114:1: ( ( rule__Beat__TotalDivNumberAssignment_3_1 ) )
            {
            // InternalRyml.g:3114:1: ( ( rule__Beat__TotalDivNumberAssignment_3_1 ) )
            // InternalRyml.g:3115:2: ( rule__Beat__TotalDivNumberAssignment_3_1 )
            {
             before(grammarAccess.getBeatAccess().getTotalDivNumberAssignment_3_1()); 
            // InternalRyml.g:3116:2: ( rule__Beat__TotalDivNumberAssignment_3_1 )
            // InternalRyml.g:3116:3: rule__Beat__TotalDivNumberAssignment_3_1
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


    // $ANTLR start "rule__Beat__Group_7__0"
    // InternalRyml.g:3125:1: rule__Beat__Group_7__0 : rule__Beat__Group_7__0__Impl rule__Beat__Group_7__1 ;
    public final void rule__Beat__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3129:1: ( rule__Beat__Group_7__0__Impl rule__Beat__Group_7__1 )
            // InternalRyml.g:3130:2: rule__Beat__Group_7__0__Impl rule__Beat__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Beat__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group_7__1();

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
    // $ANTLR end "rule__Beat__Group_7__0"


    // $ANTLR start "rule__Beat__Group_7__0__Impl"
    // InternalRyml.g:3137:1: rule__Beat__Group_7__0__Impl : ( '|' ) ;
    public final void rule__Beat__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3141:1: ( ( '|' ) )
            // InternalRyml.g:3142:1: ( '|' )
            {
            // InternalRyml.g:3142:1: ( '|' )
            // InternalRyml.g:3143:2: '|'
            {
             before(grammarAccess.getBeatAccess().getVerticalLineKeyword_7_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBeatAccess().getVerticalLineKeyword_7_0()); 

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
    // $ANTLR end "rule__Beat__Group_7__0__Impl"


    // $ANTLR start "rule__Beat__Group_7__1"
    // InternalRyml.g:3152:1: rule__Beat__Group_7__1 : rule__Beat__Group_7__1__Impl rule__Beat__Group_7__2 ;
    public final void rule__Beat__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3156:1: ( rule__Beat__Group_7__1__Impl rule__Beat__Group_7__2 )
            // InternalRyml.g:3157:2: rule__Beat__Group_7__1__Impl rule__Beat__Group_7__2
            {
            pushFollow(FOLLOW_30);
            rule__Beat__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group_7__2();

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
    // $ANTLR end "rule__Beat__Group_7__1"


    // $ANTLR start "rule__Beat__Group_7__1__Impl"
    // InternalRyml.g:3164:1: rule__Beat__Group_7__1__Impl : ( ( rule__Beat__NotesAssignment_7_1 ) ) ;
    public final void rule__Beat__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3168:1: ( ( ( rule__Beat__NotesAssignment_7_1 ) ) )
            // InternalRyml.g:3169:1: ( ( rule__Beat__NotesAssignment_7_1 ) )
            {
            // InternalRyml.g:3169:1: ( ( rule__Beat__NotesAssignment_7_1 ) )
            // InternalRyml.g:3170:2: ( rule__Beat__NotesAssignment_7_1 )
            {
             before(grammarAccess.getBeatAccess().getNotesAssignment_7_1()); 
            // InternalRyml.g:3171:2: ( rule__Beat__NotesAssignment_7_1 )
            // InternalRyml.g:3171:3: rule__Beat__NotesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Beat__NotesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBeatAccess().getNotesAssignment_7_1()); 

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
    // $ANTLR end "rule__Beat__Group_7__1__Impl"


    // $ANTLR start "rule__Beat__Group_7__2"
    // InternalRyml.g:3179:1: rule__Beat__Group_7__2 : rule__Beat__Group_7__2__Impl rule__Beat__Group_7__3 ;
    public final void rule__Beat__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3183:1: ( rule__Beat__Group_7__2__Impl rule__Beat__Group_7__3 )
            // InternalRyml.g:3184:2: rule__Beat__Group_7__2__Impl rule__Beat__Group_7__3
            {
            pushFollow(FOLLOW_6);
            rule__Beat__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group_7__3();

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
    // $ANTLR end "rule__Beat__Group_7__2"


    // $ANTLR start "rule__Beat__Group_7__2__Impl"
    // InternalRyml.g:3191:1: rule__Beat__Group_7__2__Impl : ( ',' ) ;
    public final void rule__Beat__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3195:1: ( ( ',' ) )
            // InternalRyml.g:3196:1: ( ',' )
            {
            // InternalRyml.g:3196:1: ( ',' )
            // InternalRyml.g:3197:2: ','
            {
             before(grammarAccess.getBeatAccess().getCommaKeyword_7_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBeatAccess().getCommaKeyword_7_2()); 

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
    // $ANTLR end "rule__Beat__Group_7__2__Impl"


    // $ANTLR start "rule__Beat__Group_7__3"
    // InternalRyml.g:3206:1: rule__Beat__Group_7__3 : rule__Beat__Group_7__3__Impl ;
    public final void rule__Beat__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3210:1: ( rule__Beat__Group_7__3__Impl )
            // InternalRyml.g:3211:2: rule__Beat__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Beat__Group_7__3__Impl();

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
    // $ANTLR end "rule__Beat__Group_7__3"


    // $ANTLR start "rule__Beat__Group_7__3__Impl"
    // InternalRyml.g:3217:1: rule__Beat__Group_7__3__Impl : ( ( rule__Beat__NotePositionsAssignment_7_3 ) ) ;
    public final void rule__Beat__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3221:1: ( ( ( rule__Beat__NotePositionsAssignment_7_3 ) ) )
            // InternalRyml.g:3222:1: ( ( rule__Beat__NotePositionsAssignment_7_3 ) )
            {
            // InternalRyml.g:3222:1: ( ( rule__Beat__NotePositionsAssignment_7_3 ) )
            // InternalRyml.g:3223:2: ( rule__Beat__NotePositionsAssignment_7_3 )
            {
             before(grammarAccess.getBeatAccess().getNotePositionsAssignment_7_3()); 
            // InternalRyml.g:3224:2: ( rule__Beat__NotePositionsAssignment_7_3 )
            // InternalRyml.g:3224:3: rule__Beat__NotePositionsAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__Beat__NotePositionsAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getBeatAccess().getNotePositionsAssignment_7_3()); 

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
    // $ANTLR end "rule__Beat__Group_7__3__Impl"


    // $ANTLR start "rule__Note__Group__0"
    // InternalRyml.g:3233:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3237:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // InternalRyml.g:3238:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRyml.g:3245:1: rule__Note__Group__0__Impl : ( () ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3249:1: ( ( () ) )
            // InternalRyml.g:3250:1: ( () )
            {
            // InternalRyml.g:3250:1: ( () )
            // InternalRyml.g:3251:2: ()
            {
             before(grammarAccess.getNoteAccess().getNoteAction_0()); 
            // InternalRyml.g:3252:2: ()
            // InternalRyml.g:3252:3: 
            {
            }

             after(grammarAccess.getNoteAccess().getNoteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__0__Impl"


    // $ANTLR start "rule__Note__Group__1"
    // InternalRyml.g:3260:1: rule__Note__Group__1 : rule__Note__Group__1__Impl rule__Note__Group__2 ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3264:1: ( rule__Note__Group__1__Impl rule__Note__Group__2 )
            // InternalRyml.g:3265:2: rule__Note__Group__1__Impl rule__Note__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalRyml.g:3272:1: rule__Note__Group__1__Impl : ( 'Note' ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3276:1: ( ( 'Note' ) )
            // InternalRyml.g:3277:1: ( 'Note' )
            {
            // InternalRyml.g:3277:1: ( 'Note' )
            // InternalRyml.g:3278:2: 'Note'
            {
             before(grammarAccess.getNoteAccess().getNoteKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getNoteKeyword_1()); 

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
    // InternalRyml.g:3287:1: rule__Note__Group__2 : rule__Note__Group__2__Impl rule__Note__Group__3 ;
    public final void rule__Note__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3291:1: ( rule__Note__Group__2__Impl rule__Note__Group__3 )
            // InternalRyml.g:3292:2: rule__Note__Group__2__Impl rule__Note__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalRyml.g:3299:1: rule__Note__Group__2__Impl : ( ( rule__Note__NameAssignment_2 ) ) ;
    public final void rule__Note__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3303:1: ( ( ( rule__Note__NameAssignment_2 ) ) )
            // InternalRyml.g:3304:1: ( ( rule__Note__NameAssignment_2 ) )
            {
            // InternalRyml.g:3304:1: ( ( rule__Note__NameAssignment_2 ) )
            // InternalRyml.g:3305:2: ( rule__Note__NameAssignment_2 )
            {
             before(grammarAccess.getNoteAccess().getNameAssignment_2()); 
            // InternalRyml.g:3306:2: ( rule__Note__NameAssignment_2 )
            // InternalRyml.g:3306:3: rule__Note__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Note__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getNameAssignment_2()); 

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
    // InternalRyml.g:3314:1: rule__Note__Group__3 : rule__Note__Group__3__Impl rule__Note__Group__4 ;
    public final void rule__Note__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3318:1: ( rule__Note__Group__3__Impl rule__Note__Group__4 )
            // InternalRyml.g:3319:2: rule__Note__Group__3__Impl rule__Note__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Note__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__4();

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
    // InternalRyml.g:3326:1: rule__Note__Group__3__Impl : ( ':' ) ;
    public final void rule__Note__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3330:1: ( ( ':' ) )
            // InternalRyml.g:3331:1: ( ':' )
            {
            // InternalRyml.g:3331:1: ( ':' )
            // InternalRyml.g:3332:2: ':'
            {
             before(grammarAccess.getNoteAccess().getColonKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getColonKeyword_3()); 

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


    // $ANTLR start "rule__Note__Group__4"
    // InternalRyml.g:3341:1: rule__Note__Group__4 : rule__Note__Group__4__Impl ;
    public final void rule__Note__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3345:1: ( rule__Note__Group__4__Impl )
            // InternalRyml.g:3346:2: rule__Note__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group__4__Impl();

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
    // $ANTLR end "rule__Note__Group__4"


    // $ANTLR start "rule__Note__Group__4__Impl"
    // InternalRyml.g:3352:1: rule__Note__Group__4__Impl : ( ( rule__Note__ValueAssignment_4 )? ) ;
    public final void rule__Note__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3356:1: ( ( ( rule__Note__ValueAssignment_4 )? ) )
            // InternalRyml.g:3357:1: ( ( rule__Note__ValueAssignment_4 )? )
            {
            // InternalRyml.g:3357:1: ( ( rule__Note__ValueAssignment_4 )? )
            // InternalRyml.g:3358:2: ( rule__Note__ValueAssignment_4 )?
            {
             before(grammarAccess.getNoteAccess().getValueAssignment_4()); 
            // InternalRyml.g:3359:2: ( rule__Note__ValueAssignment_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=11 && LA27_0<=21)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRyml.g:3359:3: rule__Note__ValueAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__ValueAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__Note__Group__4__Impl"


    // $ANTLR start "rule__Music__NameAssignment_1"
    // InternalRyml.g:3368:1: rule__Music__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Music__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3372:1: ( ( ruleEString ) )
            // InternalRyml.g:3373:2: ( ruleEString )
            {
            // InternalRyml.g:3373:2: ( ruleEString )
            // InternalRyml.g:3374:3: ruleEString
            {
             before(grammarAccess.getMusicAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Music__NameAssignment_1"


    // $ANTLR start "rule__Music__TitleAssignment_3_1"
    // InternalRyml.g:3383:1: rule__Music__TitleAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Music__TitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3387:1: ( ( ruleEString ) )
            // InternalRyml.g:3388:2: ( ruleEString )
            {
            // InternalRyml.g:3388:2: ( ruleEString )
            // InternalRyml.g:3389:3: ruleEString
            {
             before(grammarAccess.getMusicAccess().getTitleEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getTitleEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Music__TitleAssignment_3_1"


    // $ANTLR start "rule__Music__AuthorAssignment_4_1"
    // InternalRyml.g:3398:1: rule__Music__AuthorAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Music__AuthorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3402:1: ( ( ruleEString ) )
            // InternalRyml.g:3403:2: ( ruleEString )
            {
            // InternalRyml.g:3403:2: ( ruleEString )
            // InternalRyml.g:3404:3: ruleEString
            {
             before(grammarAccess.getMusicAccess().getAuthorEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getAuthorEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Music__AuthorAssignment_4_1"


    // $ANTLR start "rule__Music__BpmAssignment_5_1"
    // InternalRyml.g:3413:1: rule__Music__BpmAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Music__BpmAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3417:1: ( ( ruleEInt ) )
            // InternalRyml.g:3418:2: ( ruleEInt )
            {
            // InternalRyml.g:3418:2: ( ruleEInt )
            // InternalRyml.g:3419:3: ruleEInt
            {
             before(grammarAccess.getMusicAccess().getBpmEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getBpmEIntParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Music__BpmAssignment_5_1"


    // $ANTLR start "rule__Music__ResolutionPerSlideAssignment_6_1"
    // InternalRyml.g:3428:1: rule__Music__ResolutionPerSlideAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Music__ResolutionPerSlideAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3432:1: ( ( ruleEInt ) )
            // InternalRyml.g:3433:2: ( ruleEInt )
            {
            // InternalRyml.g:3433:2: ( ruleEInt )
            // InternalRyml.g:3434:3: ruleEInt
            {
             before(grammarAccess.getMusicAccess().getResolutionPerSlideEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getResolutionPerSlideEIntParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Music__ResolutionPerSlideAssignment_6_1"


    // $ANTLR start "rule__Music__OwnedNotesAssignment_7_0"
    // InternalRyml.g:3443:1: rule__Music__OwnedNotesAssignment_7_0 : ( ruleNote ) ;
    public final void rule__Music__OwnedNotesAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3447:1: ( ( ruleNote ) )
            // InternalRyml.g:3448:2: ( ruleNote )
            {
            // InternalRyml.g:3448:2: ( ruleNote )
            // InternalRyml.g:3449:3: ruleNote
            {
             before(grammarAccess.getMusicAccess().getOwnedNotesNoteParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedNotesNoteParserRuleCall_7_0_0()); 

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
    // $ANTLR end "rule__Music__OwnedNotesAssignment_7_0"


    // $ANTLR start "rule__Music__OwnedNotesAssignment_7_1"
    // InternalRyml.g:3458:1: rule__Music__OwnedNotesAssignment_7_1 : ( ruleNote ) ;
    public final void rule__Music__OwnedNotesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3462:1: ( ( ruleNote ) )
            // InternalRyml.g:3463:2: ( ruleNote )
            {
            // InternalRyml.g:3463:2: ( ruleNote )
            // InternalRyml.g:3464:3: ruleNote
            {
             before(grammarAccess.getMusicAccess().getOwnedNotesNoteParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedNotesNoteParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Music__OwnedNotesAssignment_7_1"


    // $ANTLR start "rule__Music__OwnedBeatsAssignment_8_0"
    // InternalRyml.g:3473:1: rule__Music__OwnedBeatsAssignment_8_0 : ( ruleBeat ) ;
    public final void rule__Music__OwnedBeatsAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3477:1: ( ( ruleBeat ) )
            // InternalRyml.g:3478:2: ( ruleBeat )
            {
            // InternalRyml.g:3478:2: ( ruleBeat )
            // InternalRyml.g:3479:3: ruleBeat
            {
             before(grammarAccess.getMusicAccess().getOwnedBeatsBeatParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBeat();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedBeatsBeatParserRuleCall_8_0_0()); 

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
    // $ANTLR end "rule__Music__OwnedBeatsAssignment_8_0"


    // $ANTLR start "rule__Music__OwnedBeatsAssignment_8_1"
    // InternalRyml.g:3488:1: rule__Music__OwnedBeatsAssignment_8_1 : ( ruleBeat ) ;
    public final void rule__Music__OwnedBeatsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3492:1: ( ( ruleBeat ) )
            // InternalRyml.g:3493:2: ( ruleBeat )
            {
            // InternalRyml.g:3493:2: ( ruleBeat )
            // InternalRyml.g:3494:3: ruleBeat
            {
             before(grammarAccess.getMusicAccess().getOwnedBeatsBeatParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBeat();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedBeatsBeatParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Music__OwnedBeatsAssignment_8_1"


    // $ANTLR start "rule__Music__OwnedBarsAssignment_9_0"
    // InternalRyml.g:3503:1: rule__Music__OwnedBarsAssignment_9_0 : ( ruleBar ) ;
    public final void rule__Music__OwnedBarsAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3507:1: ( ( ruleBar ) )
            // InternalRyml.g:3508:2: ( ruleBar )
            {
            // InternalRyml.g:3508:2: ( ruleBar )
            // InternalRyml.g:3509:3: ruleBar
            {
             before(grammarAccess.getMusicAccess().getOwnedBarsBarParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBar();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedBarsBarParserRuleCall_9_0_0()); 

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
    // $ANTLR end "rule__Music__OwnedBarsAssignment_9_0"


    // $ANTLR start "rule__Music__OwnedBarsAssignment_9_1"
    // InternalRyml.g:3518:1: rule__Music__OwnedBarsAssignment_9_1 : ( ruleBar ) ;
    public final void rule__Music__OwnedBarsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3522:1: ( ( ruleBar ) )
            // InternalRyml.g:3523:2: ( ruleBar )
            {
            // InternalRyml.g:3523:2: ( ruleBar )
            // InternalRyml.g:3524:3: ruleBar
            {
             before(grammarAccess.getMusicAccess().getOwnedBarsBarParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBar();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedBarsBarParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Music__OwnedBarsAssignment_9_1"


    // $ANTLR start "rule__Music__OwnedPatternsAssignment_10_0"
    // InternalRyml.g:3533:1: rule__Music__OwnedPatternsAssignment_10_0 : ( rulePattern ) ;
    public final void rule__Music__OwnedPatternsAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3537:1: ( ( rulePattern ) )
            // InternalRyml.g:3538:2: ( rulePattern )
            {
            // InternalRyml.g:3538:2: ( rulePattern )
            // InternalRyml.g:3539:3: rulePattern
            {
             before(grammarAccess.getMusicAccess().getOwnedPatternsPatternParserRuleCall_10_0_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedPatternsPatternParserRuleCall_10_0_0()); 

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
    // $ANTLR end "rule__Music__OwnedPatternsAssignment_10_0"


    // $ANTLR start "rule__Music__OwnedPatternsAssignment_10_1"
    // InternalRyml.g:3548:1: rule__Music__OwnedPatternsAssignment_10_1 : ( rulePattern ) ;
    public final void rule__Music__OwnedPatternsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3552:1: ( ( rulePattern ) )
            // InternalRyml.g:3553:2: ( rulePattern )
            {
            // InternalRyml.g:3553:2: ( rulePattern )
            // InternalRyml.g:3554:3: rulePattern
            {
             before(grammarAccess.getMusicAccess().getOwnedPatternsPatternParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedPatternsPatternParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__Music__OwnedPatternsAssignment_10_1"


    // $ANTLR start "rule__Music__OwnedSectionsAssignment_11_0"
    // InternalRyml.g:3563:1: rule__Music__OwnedSectionsAssignment_11_0 : ( ruleSection ) ;
    public final void rule__Music__OwnedSectionsAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3567:1: ( ( ruleSection ) )
            // InternalRyml.g:3568:2: ( ruleSection )
            {
            // InternalRyml.g:3568:2: ( ruleSection )
            // InternalRyml.g:3569:3: ruleSection
            {
             before(grammarAccess.getMusicAccess().getOwnedSectionsSectionParserRuleCall_11_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedSectionsSectionParserRuleCall_11_0_0()); 

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
    // $ANTLR end "rule__Music__OwnedSectionsAssignment_11_0"


    // $ANTLR start "rule__Music__OwnedSectionsAssignment_11_1"
    // InternalRyml.g:3578:1: rule__Music__OwnedSectionsAssignment_11_1 : ( ruleSection ) ;
    public final void rule__Music__OwnedSectionsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3582:1: ( ( ruleSection ) )
            // InternalRyml.g:3583:2: ( ruleSection )
            {
            // InternalRyml.g:3583:2: ( ruleSection )
            // InternalRyml.g:3584:3: ruleSection
            {
             before(grammarAccess.getMusicAccess().getOwnedSectionsSectionParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedSectionsSectionParserRuleCall_11_1_0()); 

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
    // $ANTLR end "rule__Music__OwnedSectionsAssignment_11_1"


    // $ANTLR start "rule__Section__NameAssignment_1"
    // InternalRyml.g:3593:1: rule__Section__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Section__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3597:1: ( ( ruleEString ) )
            // InternalRyml.g:3598:2: ( ruleEString )
            {
            // InternalRyml.g:3598:2: ( ruleEString )
            // InternalRyml.g:3599:3: ruleEString
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
    // InternalRyml.g:3608:1: rule__Section__PatternsAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Section__PatternsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3612:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:3613:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:3613:2: ( ( ruleEString ) )
            // InternalRyml.g:3614:3: ( ruleEString )
            {
             before(grammarAccess.getSectionAccess().getPatternsPatternCrossReference_3_0()); 
            // InternalRyml.g:3615:3: ( ruleEString )
            // InternalRyml.g:3616:4: ruleEString
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
    // InternalRyml.g:3627:1: rule__Section__PatternsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Section__PatternsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3631:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:3632:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:3632:2: ( ( ruleEString ) )
            // InternalRyml.g:3633:3: ( ruleEString )
            {
             before(grammarAccess.getSectionAccess().getPatternsPatternCrossReference_4_1_0()); 
            // InternalRyml.g:3634:3: ( ruleEString )
            // InternalRyml.g:3635:4: ruleEString
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
    // InternalRyml.g:3646:1: rule__Pattern__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3650:1: ( ( ruleEString ) )
            // InternalRyml.g:3651:2: ( ruleEString )
            {
            // InternalRyml.g:3651:2: ( ruleEString )
            // InternalRyml.g:3652:3: ruleEString
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
    // InternalRyml.g:3661:1: rule__Pattern__BarsAssignment_3 : ( ruleBarMultiplier ) ;
    public final void rule__Pattern__BarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3665:1: ( ( ruleBarMultiplier ) )
            // InternalRyml.g:3666:2: ( ruleBarMultiplier )
            {
            // InternalRyml.g:3666:2: ( ruleBarMultiplier )
            // InternalRyml.g:3667:3: ruleBarMultiplier
            {
             before(grammarAccess.getPatternAccess().getBarsBarMultiplierParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBarMultiplier();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getBarsBarMultiplierParserRuleCall_3_0()); 

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
    // InternalRyml.g:3676:1: rule__Pattern__BarsAssignment_4_1 : ( ruleBarMultiplier ) ;
    public final void rule__Pattern__BarsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3680:1: ( ( ruleBarMultiplier ) )
            // InternalRyml.g:3681:2: ( ruleBarMultiplier )
            {
            // InternalRyml.g:3681:2: ( ruleBarMultiplier )
            // InternalRyml.g:3682:3: ruleBarMultiplier
            {
             before(grammarAccess.getPatternAccess().getBarsBarMultiplierParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBarMultiplier();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getBarsBarMultiplierParserRuleCall_4_1_0()); 

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


    // $ANTLR start "rule__BarMultiplier__BarAssignment_1"
    // InternalRyml.g:3691:1: rule__BarMultiplier__BarAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__BarMultiplier__BarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3695:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:3696:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:3696:2: ( ( ruleEString ) )
            // InternalRyml.g:3697:3: ( ruleEString )
            {
             before(grammarAccess.getBarMultiplierAccess().getBarBarCrossReference_1_0()); 
            // InternalRyml.g:3698:3: ( ruleEString )
            // InternalRyml.g:3699:4: ruleEString
            {
             before(grammarAccess.getBarMultiplierAccess().getBarBarEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarMultiplierAccess().getBarBarEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBarMultiplierAccess().getBarBarCrossReference_1_0()); 

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
    // $ANTLR end "rule__BarMultiplier__BarAssignment_1"


    // $ANTLR start "rule__BarMultiplier__MultiplierAssignment_2_1"
    // InternalRyml.g:3710:1: rule__BarMultiplier__MultiplierAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__BarMultiplier__MultiplierAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3714:1: ( ( ruleEInt ) )
            // InternalRyml.g:3715:2: ( ruleEInt )
            {
            // InternalRyml.g:3715:2: ( ruleEInt )
            // InternalRyml.g:3716:3: ruleEInt
            {
             before(grammarAccess.getBarMultiplierAccess().getMultiplierEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBarMultiplierAccess().getMultiplierEIntParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__BarMultiplier__MultiplierAssignment_2_1"


    // $ANTLR start "rule__NoteAddition__BeatNumberAssignment_1"
    // InternalRyml.g:3725:1: rule__NoteAddition__BeatNumberAssignment_1 : ( ruleEInt ) ;
    public final void rule__NoteAddition__BeatNumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3729:1: ( ( ruleEInt ) )
            // InternalRyml.g:3730:2: ( ruleEInt )
            {
            // InternalRyml.g:3730:2: ( ruleEInt )
            // InternalRyml.g:3731:3: ruleEInt
            {
             before(grammarAccess.getNoteAdditionAccess().getBeatNumberEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNoteAdditionAccess().getBeatNumberEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NoteAddition__BeatNumberAssignment_1"


    // $ANTLR start "rule__NoteAddition__NoteAssignment_3"
    // InternalRyml.g:3740:1: rule__NoteAddition__NoteAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__NoteAddition__NoteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3744:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:3745:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:3745:2: ( ( ruleEString ) )
            // InternalRyml.g:3746:3: ( ruleEString )
            {
             before(grammarAccess.getNoteAdditionAccess().getNoteNoteCrossReference_3_0()); 
            // InternalRyml.g:3747:3: ( ruleEString )
            // InternalRyml.g:3748:4: ruleEString
            {
             before(grammarAccess.getNoteAdditionAccess().getNoteNoteEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNoteAdditionAccess().getNoteNoteEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getNoteAdditionAccess().getNoteNoteCrossReference_3_0()); 

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
    // $ANTLR end "rule__NoteAddition__NoteAssignment_3"


    // $ANTLR start "rule__NoteDeletion__BeatNumberAssignment_1"
    // InternalRyml.g:3759:1: rule__NoteDeletion__BeatNumberAssignment_1 : ( ruleEInt ) ;
    public final void rule__NoteDeletion__BeatNumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3763:1: ( ( ruleEInt ) )
            // InternalRyml.g:3764:2: ( ruleEInt )
            {
            // InternalRyml.g:3764:2: ( ruleEInt )
            // InternalRyml.g:3765:3: ruleEInt
            {
             before(grammarAccess.getNoteDeletionAccess().getBeatNumberEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNoteDeletionAccess().getBeatNumberEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NoteDeletion__BeatNumberAssignment_1"


    // $ANTLR start "rule__NoteDeletion__NoteAssignment_3"
    // InternalRyml.g:3774:1: rule__NoteDeletion__NoteAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__NoteDeletion__NoteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3778:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:3779:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:3779:2: ( ( ruleEString ) )
            // InternalRyml.g:3780:3: ( ruleEString )
            {
             before(grammarAccess.getNoteDeletionAccess().getNoteNoteCrossReference_3_0()); 
            // InternalRyml.g:3781:3: ( ruleEString )
            // InternalRyml.g:3782:4: ruleEString
            {
             before(grammarAccess.getNoteDeletionAccess().getNoteNoteEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNoteDeletionAccess().getNoteNoteEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getNoteDeletionAccess().getNoteNoteCrossReference_3_0()); 

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
    // $ANTLR end "rule__NoteDeletion__NoteAssignment_3"


    // $ANTLR start "rule__NoteReplacement__BeatNumberAssignment_1"
    // InternalRyml.g:3793:1: rule__NoteReplacement__BeatNumberAssignment_1 : ( ruleEInt ) ;
    public final void rule__NoteReplacement__BeatNumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3797:1: ( ( ruleEInt ) )
            // InternalRyml.g:3798:2: ( ruleEInt )
            {
            // InternalRyml.g:3798:2: ( ruleEInt )
            // InternalRyml.g:3799:3: ruleEInt
            {
             before(grammarAccess.getNoteReplacementAccess().getBeatNumberEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNoteReplacementAccess().getBeatNumberEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NoteReplacement__BeatNumberAssignment_1"


    // $ANTLR start "rule__NoteReplacement__NoteSrcAssignment_3"
    // InternalRyml.g:3808:1: rule__NoteReplacement__NoteSrcAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__NoteReplacement__NoteSrcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3812:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:3813:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:3813:2: ( ( ruleEString ) )
            // InternalRyml.g:3814:3: ( ruleEString )
            {
             before(grammarAccess.getNoteReplacementAccess().getNoteSrcNoteCrossReference_3_0()); 
            // InternalRyml.g:3815:3: ( ruleEString )
            // InternalRyml.g:3816:4: ruleEString
            {
             before(grammarAccess.getNoteReplacementAccess().getNoteSrcNoteEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNoteReplacementAccess().getNoteSrcNoteEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getNoteReplacementAccess().getNoteSrcNoteCrossReference_3_0()); 

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
    // $ANTLR end "rule__NoteReplacement__NoteSrcAssignment_3"


    // $ANTLR start "rule__NoteReplacement__NewNoteAssignment_5"
    // InternalRyml.g:3827:1: rule__NoteReplacement__NewNoteAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__NoteReplacement__NewNoteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3831:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:3832:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:3832:2: ( ( ruleEString ) )
            // InternalRyml.g:3833:3: ( ruleEString )
            {
             before(grammarAccess.getNoteReplacementAccess().getNewNoteNoteCrossReference_5_0()); 
            // InternalRyml.g:3834:3: ( ruleEString )
            // InternalRyml.g:3835:4: ruleEString
            {
             before(grammarAccess.getNoteReplacementAccess().getNewNoteNoteEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNoteReplacementAccess().getNewNoteNoteEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getNoteReplacementAccess().getNewNoteNoteCrossReference_5_0()); 

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
    // $ANTLR end "rule__NoteReplacement__NewNoteAssignment_5"


    // $ANTLR start "rule__ClassicalBar__NameAssignment_2"
    // InternalRyml.g:3846:1: rule__ClassicalBar__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ClassicalBar__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3850:1: ( ( ruleEString ) )
            // InternalRyml.g:3851:2: ( ruleEString )
            {
            // InternalRyml.g:3851:2: ( ruleEString )
            // InternalRyml.g:3852:3: ruleEString
            {
             before(grammarAccess.getClassicalBarAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassicalBarAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ClassicalBar__NameAssignment_2"


    // $ANTLR start "rule__ClassicalBar__BeatsAssignment_4"
    // InternalRyml.g:3861:1: rule__ClassicalBar__BeatsAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ClassicalBar__BeatsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3865:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:3866:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:3866:2: ( ( ruleEString ) )
            // InternalRyml.g:3867:3: ( ruleEString )
            {
             before(grammarAccess.getClassicalBarAccess().getBeatsBeatCrossReference_4_0()); 
            // InternalRyml.g:3868:3: ( ruleEString )
            // InternalRyml.g:3869:4: ruleEString
            {
             before(grammarAccess.getClassicalBarAccess().getBeatsBeatEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassicalBarAccess().getBeatsBeatEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getClassicalBarAccess().getBeatsBeatCrossReference_4_0()); 

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
    // $ANTLR end "rule__ClassicalBar__BeatsAssignment_4"


    // $ANTLR start "rule__ClassicalBar__BeatsAssignment_5_1"
    // InternalRyml.g:3880:1: rule__ClassicalBar__BeatsAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__ClassicalBar__BeatsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3884:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:3885:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:3885:2: ( ( ruleEString ) )
            // InternalRyml.g:3886:3: ( ruleEString )
            {
             before(grammarAccess.getClassicalBarAccess().getBeatsBeatCrossReference_5_1_0()); 
            // InternalRyml.g:3887:3: ( ruleEString )
            // InternalRyml.g:3888:4: ruleEString
            {
             before(grammarAccess.getClassicalBarAccess().getBeatsBeatEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassicalBarAccess().getBeatsBeatEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getClassicalBarAccess().getBeatsBeatCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__ClassicalBar__BeatsAssignment_5_1"


    // $ANTLR start "rule__ModifiedBar__NameAssignment_2"
    // InternalRyml.g:3899:1: rule__ModifiedBar__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ModifiedBar__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3903:1: ( ( ruleEString ) )
            // InternalRyml.g:3904:2: ( ruleEString )
            {
            // InternalRyml.g:3904:2: ( ruleEString )
            // InternalRyml.g:3905:3: ruleEString
            {
             before(grammarAccess.getModifiedBarAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModifiedBarAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ModifiedBar__NameAssignment_2"


    // $ANTLR start "rule__ModifiedBar__BarAssignment_4"
    // InternalRyml.g:3914:1: rule__ModifiedBar__BarAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ModifiedBar__BarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3918:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:3919:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:3919:2: ( ( ruleEString ) )
            // InternalRyml.g:3920:3: ( ruleEString )
            {
             before(grammarAccess.getModifiedBarAccess().getBarBarCrossReference_4_0()); 
            // InternalRyml.g:3921:3: ( ruleEString )
            // InternalRyml.g:3922:4: ruleEString
            {
             before(grammarAccess.getModifiedBarAccess().getBarBarEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModifiedBarAccess().getBarBarEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getModifiedBarAccess().getBarBarCrossReference_4_0()); 

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
    // $ANTLR end "rule__ModifiedBar__BarAssignment_4"


    // $ANTLR start "rule__ModifiedBar__OperationsAssignment_7"
    // InternalRyml.g:3933:1: rule__ModifiedBar__OperationsAssignment_7 : ( ruleOperation ) ;
    public final void rule__ModifiedBar__OperationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3937:1: ( ( ruleOperation ) )
            // InternalRyml.g:3938:2: ( ruleOperation )
            {
            // InternalRyml.g:3938:2: ( ruleOperation )
            // InternalRyml.g:3939:3: ruleOperation
            {
             before(grammarAccess.getModifiedBarAccess().getOperationsOperationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getModifiedBarAccess().getOperationsOperationParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ModifiedBar__OperationsAssignment_7"


    // $ANTLR start "rule__ModifiedBar__OperationsAssignment_8_1"
    // InternalRyml.g:3948:1: rule__ModifiedBar__OperationsAssignment_8_1 : ( ruleOperation ) ;
    public final void rule__ModifiedBar__OperationsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3952:1: ( ( ruleOperation ) )
            // InternalRyml.g:3953:2: ( ruleOperation )
            {
            // InternalRyml.g:3953:2: ( ruleOperation )
            // InternalRyml.g:3954:3: ruleOperation
            {
             before(grammarAccess.getModifiedBarAccess().getOperationsOperationParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getModifiedBarAccess().getOperationsOperationParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__ModifiedBar__OperationsAssignment_8_1"


    // $ANTLR start "rule__Beat__NameAssignment_1"
    // InternalRyml.g:3963:1: rule__Beat__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Beat__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3967:1: ( ( ruleEString ) )
            // InternalRyml.g:3968:2: ( ruleEString )
            {
            // InternalRyml.g:3968:2: ( ruleEString )
            // InternalRyml.g:3969:3: ruleEString
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
    // InternalRyml.g:3978:1: rule__Beat__TotalDivNumberAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Beat__TotalDivNumberAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3982:1: ( ( ruleEInt ) )
            // InternalRyml.g:3983:2: ( ruleEInt )
            {
            // InternalRyml.g:3983:2: ( ruleEInt )
            // InternalRyml.g:3984:3: ruleEInt
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


    // $ANTLR start "rule__Beat__NotesAssignment_4"
    // InternalRyml.g:3993:1: rule__Beat__NotesAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Beat__NotesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3997:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:3998:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:3998:2: ( ( ruleEString ) )
            // InternalRyml.g:3999:3: ( ruleEString )
            {
             before(grammarAccess.getBeatAccess().getNotesNoteCrossReference_4_0()); 
            // InternalRyml.g:4000:3: ( ruleEString )
            // InternalRyml.g:4001:4: ruleEString
            {
             before(grammarAccess.getBeatAccess().getNotesNoteEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBeatAccess().getNotesNoteEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getBeatAccess().getNotesNoteCrossReference_4_0()); 

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
    // $ANTLR end "rule__Beat__NotesAssignment_4"


    // $ANTLR start "rule__Beat__NotePositionsAssignment_6"
    // InternalRyml.g:4012:1: rule__Beat__NotePositionsAssignment_6 : ( ruleEInt ) ;
    public final void rule__Beat__NotePositionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:4016:1: ( ( ruleEInt ) )
            // InternalRyml.g:4017:2: ( ruleEInt )
            {
            // InternalRyml.g:4017:2: ( ruleEInt )
            // InternalRyml.g:4018:3: ruleEInt
            {
             before(grammarAccess.getBeatAccess().getNotePositionsEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBeatAccess().getNotePositionsEIntParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Beat__NotePositionsAssignment_6"


    // $ANTLR start "rule__Beat__NotesAssignment_7_1"
    // InternalRyml.g:4027:1: rule__Beat__NotesAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Beat__NotesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:4031:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:4032:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:4032:2: ( ( ruleEString ) )
            // InternalRyml.g:4033:3: ( ruleEString )
            {
             before(grammarAccess.getBeatAccess().getNotesNoteCrossReference_7_1_0()); 
            // InternalRyml.g:4034:3: ( ruleEString )
            // InternalRyml.g:4035:4: ruleEString
            {
             before(grammarAccess.getBeatAccess().getNotesNoteEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBeatAccess().getNotesNoteEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getBeatAccess().getNotesNoteCrossReference_7_1_0()); 

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
    // $ANTLR end "rule__Beat__NotesAssignment_7_1"


    // $ANTLR start "rule__Beat__NotePositionsAssignment_7_3"
    // InternalRyml.g:4046:1: rule__Beat__NotePositionsAssignment_7_3 : ( ruleEInt ) ;
    public final void rule__Beat__NotePositionsAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:4050:1: ( ( ruleEInt ) )
            // InternalRyml.g:4051:2: ( ruleEInt )
            {
            // InternalRyml.g:4051:2: ( ruleEInt )
            // InternalRyml.g:4052:3: ruleEInt
            {
             before(grammarAccess.getBeatAccess().getNotePositionsEIntParserRuleCall_7_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBeatAccess().getNotePositionsEIntParserRuleCall_7_3_0()); 

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
    // $ANTLR end "rule__Beat__NotePositionsAssignment_7_3"


    // $ANTLR start "rule__Note__NameAssignment_2"
    // InternalRyml.g:4061:1: rule__Note__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Note__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:4065:1: ( ( ruleEString ) )
            // InternalRyml.g:4066:2: ( ruleEString )
            {
            // InternalRyml.g:4066:2: ( ruleEString )
            // InternalRyml.g:4067:3: ruleEString
            {
             before(grammarAccess.getNoteAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Note__NameAssignment_2"


    // $ANTLR start "rule__Note__ValueAssignment_4"
    // InternalRyml.g:4076:1: rule__Note__ValueAssignment_4 : ( ruleDrumNoteValue ) ;
    public final void rule__Note__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:4080:1: ( ( ruleDrumNoteValue ) )
            // InternalRyml.g:4081:2: ( ruleDrumNoteValue )
            {
            // InternalRyml.g:4081:2: ( ruleDrumNoteValue )
            // InternalRyml.g:4082:3: ruleDrumNoteValue
            {
             before(grammarAccess.getNoteAccess().getValueDrumNoteValueEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDrumNoteValue();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getValueDrumNoteValueEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__Note__ValueAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000012409F000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000003FF800L});

}