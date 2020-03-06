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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SD'", "'BD'", "'CH'", "'OH'", "'CC'", "'RC'", "'TM'", "'TO'", "'S'", "'WS'", "'L'", "'Music'", "':'", "'title :'", "'author :'", "'bpm :'", "'resolution per beats : '", "'Section'", "'|'", "'-'", "'Pattern'", "'x'", "'Bar'", "' based on :'", "'Beat'", "'Notes :'", "','", "'Nb of ticks : '", "'Note'"
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


    // $ANTLR start "entryRuleBar"
    // InternalRyml.g:203:1: entryRuleBar : ruleBar EOF ;
    public final void entryRuleBar() throws RecognitionException {
        try {
            // InternalRyml.g:204:1: ( ruleBar EOF )
            // InternalRyml.g:205:1: ruleBar EOF
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
    // InternalRyml.g:212:1: ruleBar : ( ( rule__Bar__Alternatives ) ) ;
    public final void ruleBar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:216:2: ( ( ( rule__Bar__Alternatives ) ) )
            // InternalRyml.g:217:2: ( ( rule__Bar__Alternatives ) )
            {
            // InternalRyml.g:217:2: ( ( rule__Bar__Alternatives ) )
            // InternalRyml.g:218:3: ( rule__Bar__Alternatives )
            {
             before(grammarAccess.getBarAccess().getAlternatives()); 
            // InternalRyml.g:219:3: ( rule__Bar__Alternatives )
            // InternalRyml.g:219:4: rule__Bar__Alternatives
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
    // InternalRyml.g:228:1: entryRuleClassicalBar : ruleClassicalBar EOF ;
    public final void entryRuleClassicalBar() throws RecognitionException {
        try {
            // InternalRyml.g:229:1: ( ruleClassicalBar EOF )
            // InternalRyml.g:230:1: ruleClassicalBar EOF
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
    // InternalRyml.g:237:1: ruleClassicalBar : ( ( rule__ClassicalBar__Group__0 ) ) ;
    public final void ruleClassicalBar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:241:2: ( ( ( rule__ClassicalBar__Group__0 ) ) )
            // InternalRyml.g:242:2: ( ( rule__ClassicalBar__Group__0 ) )
            {
            // InternalRyml.g:242:2: ( ( rule__ClassicalBar__Group__0 ) )
            // InternalRyml.g:243:3: ( rule__ClassicalBar__Group__0 )
            {
             before(grammarAccess.getClassicalBarAccess().getGroup()); 
            // InternalRyml.g:244:3: ( rule__ClassicalBar__Group__0 )
            // InternalRyml.g:244:4: rule__ClassicalBar__Group__0
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
    // InternalRyml.g:253:1: entryRuleModifiedBar : ruleModifiedBar EOF ;
    public final void entryRuleModifiedBar() throws RecognitionException {
        try {
            // InternalRyml.g:254:1: ( ruleModifiedBar EOF )
            // InternalRyml.g:255:1: ruleModifiedBar EOF
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
    // InternalRyml.g:262:1: ruleModifiedBar : ( ( rule__ModifiedBar__Group__0 ) ) ;
    public final void ruleModifiedBar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:266:2: ( ( ( rule__ModifiedBar__Group__0 ) ) )
            // InternalRyml.g:267:2: ( ( rule__ModifiedBar__Group__0 ) )
            {
            // InternalRyml.g:267:2: ( ( rule__ModifiedBar__Group__0 ) )
            // InternalRyml.g:268:3: ( rule__ModifiedBar__Group__0 )
            {
             before(grammarAccess.getModifiedBarAccess().getGroup()); 
            // InternalRyml.g:269:3: ( rule__ModifiedBar__Group__0 )
            // InternalRyml.g:269:4: rule__ModifiedBar__Group__0
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
    // InternalRyml.g:278:1: entryRuleBeat : ruleBeat EOF ;
    public final void entryRuleBeat() throws RecognitionException {
        try {
            // InternalRyml.g:279:1: ( ruleBeat EOF )
            // InternalRyml.g:280:1: ruleBeat EOF
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
    // InternalRyml.g:287:1: ruleBeat : ( ( rule__Beat__Group__0 ) ) ;
    public final void ruleBeat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:291:2: ( ( ( rule__Beat__Group__0 ) ) )
            // InternalRyml.g:292:2: ( ( rule__Beat__Group__0 ) )
            {
            // InternalRyml.g:292:2: ( ( rule__Beat__Group__0 ) )
            // InternalRyml.g:293:3: ( rule__Beat__Group__0 )
            {
             before(grammarAccess.getBeatAccess().getGroup()); 
            // InternalRyml.g:294:3: ( rule__Beat__Group__0 )
            // InternalRyml.g:294:4: rule__Beat__Group__0
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
    // InternalRyml.g:303:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // InternalRyml.g:304:1: ( ruleNote EOF )
            // InternalRyml.g:305:1: ruleNote EOF
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
    // InternalRyml.g:312:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:316:2: ( ( ( rule__Note__Group__0 ) ) )
            // InternalRyml.g:317:2: ( ( rule__Note__Group__0 ) )
            {
            // InternalRyml.g:317:2: ( ( rule__Note__Group__0 ) )
            // InternalRyml.g:318:3: ( rule__Note__Group__0 )
            {
             before(grammarAccess.getNoteAccess().getGroup()); 
            // InternalRyml.g:319:3: ( rule__Note__Group__0 )
            // InternalRyml.g:319:4: rule__Note__Group__0
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
    // InternalRyml.g:328:1: ruleDrumNoteValue : ( ( rule__DrumNoteValue__Alternatives ) ) ;
    public final void ruleDrumNoteValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:332:1: ( ( ( rule__DrumNoteValue__Alternatives ) ) )
            // InternalRyml.g:333:2: ( ( rule__DrumNoteValue__Alternatives ) )
            {
            // InternalRyml.g:333:2: ( ( rule__DrumNoteValue__Alternatives ) )
            // InternalRyml.g:334:3: ( rule__DrumNoteValue__Alternatives )
            {
             before(grammarAccess.getDrumNoteValueAccess().getAlternatives()); 
            // InternalRyml.g:335:3: ( rule__DrumNoteValue__Alternatives )
            // InternalRyml.g:335:4: rule__DrumNoteValue__Alternatives
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
    // InternalRyml.g:343:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:347:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalRyml.g:348:2: ( RULE_STRING )
                    {
                    // InternalRyml.g:348:2: ( RULE_STRING )
                    // InternalRyml.g:349:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRyml.g:354:2: ( RULE_ID )
                    {
                    // InternalRyml.g:354:2: ( RULE_ID )
                    // InternalRyml.g:355:3: RULE_ID
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


    // $ANTLR start "rule__Bar__Alternatives"
    // InternalRyml.g:364:1: rule__Bar__Alternatives : ( ( ruleClassicalBar ) | ( ruleModifiedBar ) );
    public final void rule__Bar__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:368:1: ( ( ruleClassicalBar ) | ( ruleModifiedBar ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==33) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_STRING) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==23) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==34) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_1==RULE_ID) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==34) ) {
                        alt2=2;
                    }
                    else if ( (LA2_3==23) ) {
                        alt2=1;
                    }
                    else {
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
                    // InternalRyml.g:369:2: ( ruleClassicalBar )
                    {
                    // InternalRyml.g:369:2: ( ruleClassicalBar )
                    // InternalRyml.g:370:3: ruleClassicalBar
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
                    // InternalRyml.g:375:2: ( ruleModifiedBar )
                    {
                    // InternalRyml.g:375:2: ( ruleModifiedBar )
                    // InternalRyml.g:376:3: ruleModifiedBar
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
    // InternalRyml.g:385:1: rule__DrumNoteValue__Alternatives : ( ( ( 'SD' ) ) | ( ( 'BD' ) ) | ( ( 'CH' ) ) | ( ( 'OH' ) ) | ( ( 'CC' ) ) | ( ( 'RC' ) ) | ( ( 'TM' ) ) | ( ( 'TO' ) ) | ( ( 'S' ) ) | ( ( 'WS' ) ) | ( ( 'L' ) ) );
    public final void rule__DrumNoteValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:389:1: ( ( ( 'SD' ) ) | ( ( 'BD' ) ) | ( ( 'CH' ) ) | ( ( 'OH' ) ) | ( ( 'CC' ) ) | ( ( 'RC' ) ) | ( ( 'TM' ) ) | ( ( 'TO' ) ) | ( ( 'S' ) ) | ( ( 'WS' ) ) | ( ( 'L' ) ) )
            int alt3=11;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
                {
                alt3=8;
                }
                break;
            case 19:
                {
                alt3=9;
                }
                break;
            case 20:
                {
                alt3=10;
                }
                break;
            case 21:
                {
                alt3=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRyml.g:390:2: ( ( 'SD' ) )
                    {
                    // InternalRyml.g:390:2: ( ( 'SD' ) )
                    // InternalRyml.g:391:3: ( 'SD' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getSDEnumLiteralDeclaration_0()); 
                    // InternalRyml.g:392:3: ( 'SD' )
                    // InternalRyml.g:392:4: 'SD'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getSDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRyml.g:396:2: ( ( 'BD' ) )
                    {
                    // InternalRyml.g:396:2: ( ( 'BD' ) )
                    // InternalRyml.g:397:3: ( 'BD' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getBDEnumLiteralDeclaration_1()); 
                    // InternalRyml.g:398:3: ( 'BD' )
                    // InternalRyml.g:398:4: 'BD'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getBDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRyml.g:402:2: ( ( 'CH' ) )
                    {
                    // InternalRyml.g:402:2: ( ( 'CH' ) )
                    // InternalRyml.g:403:3: ( 'CH' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getCHEnumLiteralDeclaration_2()); 
                    // InternalRyml.g:404:3: ( 'CH' )
                    // InternalRyml.g:404:4: 'CH'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getCHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRyml.g:408:2: ( ( 'OH' ) )
                    {
                    // InternalRyml.g:408:2: ( ( 'OH' ) )
                    // InternalRyml.g:409:3: ( 'OH' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getOHEnumLiteralDeclaration_3()); 
                    // InternalRyml.g:410:3: ( 'OH' )
                    // InternalRyml.g:410:4: 'OH'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getOHEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRyml.g:414:2: ( ( 'CC' ) )
                    {
                    // InternalRyml.g:414:2: ( ( 'CC' ) )
                    // InternalRyml.g:415:3: ( 'CC' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getCCEnumLiteralDeclaration_4()); 
                    // InternalRyml.g:416:3: ( 'CC' )
                    // InternalRyml.g:416:4: 'CC'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getCCEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRyml.g:420:2: ( ( 'RC' ) )
                    {
                    // InternalRyml.g:420:2: ( ( 'RC' ) )
                    // InternalRyml.g:421:3: ( 'RC' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getRCEnumLiteralDeclaration_5()); 
                    // InternalRyml.g:422:3: ( 'RC' )
                    // InternalRyml.g:422:4: 'RC'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getRCEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRyml.g:426:2: ( ( 'TM' ) )
                    {
                    // InternalRyml.g:426:2: ( ( 'TM' ) )
                    // InternalRyml.g:427:3: ( 'TM' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getTMEnumLiteralDeclaration_6()); 
                    // InternalRyml.g:428:3: ( 'TM' )
                    // InternalRyml.g:428:4: 'TM'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getTMEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRyml.g:432:2: ( ( 'TO' ) )
                    {
                    // InternalRyml.g:432:2: ( ( 'TO' ) )
                    // InternalRyml.g:433:3: ( 'TO' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getTOEnumLiteralDeclaration_7()); 
                    // InternalRyml.g:434:3: ( 'TO' )
                    // InternalRyml.g:434:4: 'TO'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getTOEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRyml.g:438:2: ( ( 'S' ) )
                    {
                    // InternalRyml.g:438:2: ( ( 'S' ) )
                    // InternalRyml.g:439:3: ( 'S' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getSEnumLiteralDeclaration_8()); 
                    // InternalRyml.g:440:3: ( 'S' )
                    // InternalRyml.g:440:4: 'S'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getSEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRyml.g:444:2: ( ( 'WS' ) )
                    {
                    // InternalRyml.g:444:2: ( ( 'WS' ) )
                    // InternalRyml.g:445:3: ( 'WS' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getWSEnumLiteralDeclaration_9()); 
                    // InternalRyml.g:446:3: ( 'WS' )
                    // InternalRyml.g:446:4: 'WS'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDrumNoteValueAccess().getWSEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalRyml.g:450:2: ( ( 'L' ) )
                    {
                    // InternalRyml.g:450:2: ( ( 'L' ) )
                    // InternalRyml.g:451:3: ( 'L' )
                    {
                     before(grammarAccess.getDrumNoteValueAccess().getLEnumLiteralDeclaration_10()); 
                    // InternalRyml.g:452:3: ( 'L' )
                    // InternalRyml.g:452:4: 'L'
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
    // InternalRyml.g:460:1: rule__Music__Group_0__0 : rule__Music__Group_0__0__Impl rule__Music__Group_0__1 ;
    public final void rule__Music__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:464:1: ( rule__Music__Group_0__0__Impl rule__Music__Group_0__1 )
            // InternalRyml.g:465:2: rule__Music__Group_0__0__Impl rule__Music__Group_0__1
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
    // InternalRyml.g:472:1: rule__Music__Group_0__0__Impl : ( 'Music' ) ;
    public final void rule__Music__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:476:1: ( ( 'Music' ) )
            // InternalRyml.g:477:1: ( 'Music' )
            {
            // InternalRyml.g:477:1: ( 'Music' )
            // InternalRyml.g:478:2: 'Music'
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
    // InternalRyml.g:487:1: rule__Music__Group_0__1 : rule__Music__Group_0__1__Impl rule__Music__Group_0__2 ;
    public final void rule__Music__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:491:1: ( rule__Music__Group_0__1__Impl rule__Music__Group_0__2 )
            // InternalRyml.g:492:2: rule__Music__Group_0__1__Impl rule__Music__Group_0__2
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
    // InternalRyml.g:499:1: rule__Music__Group_0__1__Impl : ( ( rule__Music__NameAssignment_0_1 ) ) ;
    public final void rule__Music__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:503:1: ( ( ( rule__Music__NameAssignment_0_1 ) ) )
            // InternalRyml.g:504:1: ( ( rule__Music__NameAssignment_0_1 ) )
            {
            // InternalRyml.g:504:1: ( ( rule__Music__NameAssignment_0_1 ) )
            // InternalRyml.g:505:2: ( rule__Music__NameAssignment_0_1 )
            {
             before(grammarAccess.getMusicAccess().getNameAssignment_0_1()); 
            // InternalRyml.g:506:2: ( rule__Music__NameAssignment_0_1 )
            // InternalRyml.g:506:3: rule__Music__NameAssignment_0_1
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
    // InternalRyml.g:514:1: rule__Music__Group_0__2 : rule__Music__Group_0__2__Impl rule__Music__Group_0__3 ;
    public final void rule__Music__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:518:1: ( rule__Music__Group_0__2__Impl rule__Music__Group_0__3 )
            // InternalRyml.g:519:2: rule__Music__Group_0__2__Impl rule__Music__Group_0__3
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
    // InternalRyml.g:526:1: rule__Music__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Music__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:530:1: ( ( ':' ) )
            // InternalRyml.g:531:1: ( ':' )
            {
            // InternalRyml.g:531:1: ( ':' )
            // InternalRyml.g:532:2: ':'
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
    // InternalRyml.g:541:1: rule__Music__Group_0__3 : rule__Music__Group_0__3__Impl rule__Music__Group_0__4 ;
    public final void rule__Music__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:545:1: ( rule__Music__Group_0__3__Impl rule__Music__Group_0__4 )
            // InternalRyml.g:546:2: rule__Music__Group_0__3__Impl rule__Music__Group_0__4
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
    // InternalRyml.g:553:1: rule__Music__Group_0__3__Impl : ( ( rule__Music__Group_0_3__0 )? ) ;
    public final void rule__Music__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:557:1: ( ( ( rule__Music__Group_0_3__0 )? ) )
            // InternalRyml.g:558:1: ( ( rule__Music__Group_0_3__0 )? )
            {
            // InternalRyml.g:558:1: ( ( rule__Music__Group_0_3__0 )? )
            // InternalRyml.g:559:2: ( rule__Music__Group_0_3__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_0_3()); 
            // InternalRyml.g:560:2: ( rule__Music__Group_0_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRyml.g:560:3: rule__Music__Group_0_3__0
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
    // InternalRyml.g:568:1: rule__Music__Group_0__4 : rule__Music__Group_0__4__Impl rule__Music__Group_0__5 ;
    public final void rule__Music__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:572:1: ( rule__Music__Group_0__4__Impl rule__Music__Group_0__5 )
            // InternalRyml.g:573:2: rule__Music__Group_0__4__Impl rule__Music__Group_0__5
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
    // InternalRyml.g:580:1: rule__Music__Group_0__4__Impl : ( ( rule__Music__Group_0_4__0 )? ) ;
    public final void rule__Music__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:584:1: ( ( ( rule__Music__Group_0_4__0 )? ) )
            // InternalRyml.g:585:1: ( ( rule__Music__Group_0_4__0 )? )
            {
            // InternalRyml.g:585:1: ( ( rule__Music__Group_0_4__0 )? )
            // InternalRyml.g:586:2: ( rule__Music__Group_0_4__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_0_4()); 
            // InternalRyml.g:587:2: ( rule__Music__Group_0_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRyml.g:587:3: rule__Music__Group_0_4__0
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
    // InternalRyml.g:595:1: rule__Music__Group_0__5 : rule__Music__Group_0__5__Impl rule__Music__Group_0__6 ;
    public final void rule__Music__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:599:1: ( rule__Music__Group_0__5__Impl rule__Music__Group_0__6 )
            // InternalRyml.g:600:2: rule__Music__Group_0__5__Impl rule__Music__Group_0__6
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
    // InternalRyml.g:607:1: rule__Music__Group_0__5__Impl : ( ( rule__Music__Group_0_5__0 )? ) ;
    public final void rule__Music__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:611:1: ( ( ( rule__Music__Group_0_5__0 )? ) )
            // InternalRyml.g:612:1: ( ( rule__Music__Group_0_5__0 )? )
            {
            // InternalRyml.g:612:1: ( ( rule__Music__Group_0_5__0 )? )
            // InternalRyml.g:613:2: ( rule__Music__Group_0_5__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_0_5()); 
            // InternalRyml.g:614:2: ( rule__Music__Group_0_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRyml.g:614:3: rule__Music__Group_0_5__0
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
    // InternalRyml.g:622:1: rule__Music__Group_0__6 : rule__Music__Group_0__6__Impl rule__Music__Group_0__7 ;
    public final void rule__Music__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:626:1: ( rule__Music__Group_0__6__Impl rule__Music__Group_0__7 )
            // InternalRyml.g:627:2: rule__Music__Group_0__6__Impl rule__Music__Group_0__7
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
    // InternalRyml.g:634:1: rule__Music__Group_0__6__Impl : ( ( rule__Music__Group_0_6__0 )? ) ;
    public final void rule__Music__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:638:1: ( ( ( rule__Music__Group_0_6__0 )? ) )
            // InternalRyml.g:639:1: ( ( rule__Music__Group_0_6__0 )? )
            {
            // InternalRyml.g:639:1: ( ( rule__Music__Group_0_6__0 )? )
            // InternalRyml.g:640:2: ( rule__Music__Group_0_6__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_0_6()); 
            // InternalRyml.g:641:2: ( rule__Music__Group_0_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRyml.g:641:3: rule__Music__Group_0_6__0
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
    // InternalRyml.g:649:1: rule__Music__Group_0__7 : rule__Music__Group_0__7__Impl ;
    public final void rule__Music__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:653:1: ( rule__Music__Group_0__7__Impl )
            // InternalRyml.g:654:2: rule__Music__Group_0__7__Impl
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
    // InternalRyml.g:660:1: rule__Music__Group_0__7__Impl : ( ( rule__Music__Group_0_7__0 )? ) ;
    public final void rule__Music__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:664:1: ( ( ( rule__Music__Group_0_7__0 )? ) )
            // InternalRyml.g:665:1: ( ( rule__Music__Group_0_7__0 )? )
            {
            // InternalRyml.g:665:1: ( ( rule__Music__Group_0_7__0 )? )
            // InternalRyml.g:666:2: ( rule__Music__Group_0_7__0 )?
            {
             before(grammarAccess.getMusicAccess().getGroup_0_7()); 
            // InternalRyml.g:667:2: ( rule__Music__Group_0_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRyml.g:667:3: rule__Music__Group_0_7__0
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
    // InternalRyml.g:676:1: rule__Music__Group_0_3__0 : rule__Music__Group_0_3__0__Impl rule__Music__Group_0_3__1 ;
    public final void rule__Music__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:680:1: ( rule__Music__Group_0_3__0__Impl rule__Music__Group_0_3__1 )
            // InternalRyml.g:681:2: rule__Music__Group_0_3__0__Impl rule__Music__Group_0_3__1
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
    // InternalRyml.g:688:1: rule__Music__Group_0_3__0__Impl : ( 'title :' ) ;
    public final void rule__Music__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:692:1: ( ( 'title :' ) )
            // InternalRyml.g:693:1: ( 'title :' )
            {
            // InternalRyml.g:693:1: ( 'title :' )
            // InternalRyml.g:694:2: 'title :'
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
    // InternalRyml.g:703:1: rule__Music__Group_0_3__1 : rule__Music__Group_0_3__1__Impl ;
    public final void rule__Music__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:707:1: ( rule__Music__Group_0_3__1__Impl )
            // InternalRyml.g:708:2: rule__Music__Group_0_3__1__Impl
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
    // InternalRyml.g:714:1: rule__Music__Group_0_3__1__Impl : ( ( rule__Music__TitleAssignment_0_3_1 ) ) ;
    public final void rule__Music__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:718:1: ( ( ( rule__Music__TitleAssignment_0_3_1 ) ) )
            // InternalRyml.g:719:1: ( ( rule__Music__TitleAssignment_0_3_1 ) )
            {
            // InternalRyml.g:719:1: ( ( rule__Music__TitleAssignment_0_3_1 ) )
            // InternalRyml.g:720:2: ( rule__Music__TitleAssignment_0_3_1 )
            {
             before(grammarAccess.getMusicAccess().getTitleAssignment_0_3_1()); 
            // InternalRyml.g:721:2: ( rule__Music__TitleAssignment_0_3_1 )
            // InternalRyml.g:721:3: rule__Music__TitleAssignment_0_3_1
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
    // InternalRyml.g:730:1: rule__Music__Group_0_4__0 : rule__Music__Group_0_4__0__Impl rule__Music__Group_0_4__1 ;
    public final void rule__Music__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:734:1: ( rule__Music__Group_0_4__0__Impl rule__Music__Group_0_4__1 )
            // InternalRyml.g:735:2: rule__Music__Group_0_4__0__Impl rule__Music__Group_0_4__1
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
    // InternalRyml.g:742:1: rule__Music__Group_0_4__0__Impl : ( 'author :' ) ;
    public final void rule__Music__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:746:1: ( ( 'author :' ) )
            // InternalRyml.g:747:1: ( 'author :' )
            {
            // InternalRyml.g:747:1: ( 'author :' )
            // InternalRyml.g:748:2: 'author :'
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
    // InternalRyml.g:757:1: rule__Music__Group_0_4__1 : rule__Music__Group_0_4__1__Impl ;
    public final void rule__Music__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:761:1: ( rule__Music__Group_0_4__1__Impl )
            // InternalRyml.g:762:2: rule__Music__Group_0_4__1__Impl
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
    // InternalRyml.g:768:1: rule__Music__Group_0_4__1__Impl : ( ( rule__Music__AuthorAssignment_0_4_1 ) ) ;
    public final void rule__Music__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:772:1: ( ( ( rule__Music__AuthorAssignment_0_4_1 ) ) )
            // InternalRyml.g:773:1: ( ( rule__Music__AuthorAssignment_0_4_1 ) )
            {
            // InternalRyml.g:773:1: ( ( rule__Music__AuthorAssignment_0_4_1 ) )
            // InternalRyml.g:774:2: ( rule__Music__AuthorAssignment_0_4_1 )
            {
             before(grammarAccess.getMusicAccess().getAuthorAssignment_0_4_1()); 
            // InternalRyml.g:775:2: ( rule__Music__AuthorAssignment_0_4_1 )
            // InternalRyml.g:775:3: rule__Music__AuthorAssignment_0_4_1
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
    // InternalRyml.g:784:1: rule__Music__Group_0_5__0 : rule__Music__Group_0_5__0__Impl rule__Music__Group_0_5__1 ;
    public final void rule__Music__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:788:1: ( rule__Music__Group_0_5__0__Impl rule__Music__Group_0_5__1 )
            // InternalRyml.g:789:2: rule__Music__Group_0_5__0__Impl rule__Music__Group_0_5__1
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
    // InternalRyml.g:796:1: rule__Music__Group_0_5__0__Impl : ( 'bpm :' ) ;
    public final void rule__Music__Group_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:800:1: ( ( 'bpm :' ) )
            // InternalRyml.g:801:1: ( 'bpm :' )
            {
            // InternalRyml.g:801:1: ( 'bpm :' )
            // InternalRyml.g:802:2: 'bpm :'
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
    // InternalRyml.g:811:1: rule__Music__Group_0_5__1 : rule__Music__Group_0_5__1__Impl ;
    public final void rule__Music__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:815:1: ( rule__Music__Group_0_5__1__Impl )
            // InternalRyml.g:816:2: rule__Music__Group_0_5__1__Impl
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
    // InternalRyml.g:822:1: rule__Music__Group_0_5__1__Impl : ( ( rule__Music__BpmAssignment_0_5_1 ) ) ;
    public final void rule__Music__Group_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:826:1: ( ( ( rule__Music__BpmAssignment_0_5_1 ) ) )
            // InternalRyml.g:827:1: ( ( rule__Music__BpmAssignment_0_5_1 ) )
            {
            // InternalRyml.g:827:1: ( ( rule__Music__BpmAssignment_0_5_1 ) )
            // InternalRyml.g:828:2: ( rule__Music__BpmAssignment_0_5_1 )
            {
             before(grammarAccess.getMusicAccess().getBpmAssignment_0_5_1()); 
            // InternalRyml.g:829:2: ( rule__Music__BpmAssignment_0_5_1 )
            // InternalRyml.g:829:3: rule__Music__BpmAssignment_0_5_1
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
    // InternalRyml.g:838:1: rule__Music__Group_0_6__0 : rule__Music__Group_0_6__0__Impl rule__Music__Group_0_6__1 ;
    public final void rule__Music__Group_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:842:1: ( rule__Music__Group_0_6__0__Impl rule__Music__Group_0_6__1 )
            // InternalRyml.g:843:2: rule__Music__Group_0_6__0__Impl rule__Music__Group_0_6__1
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
    // InternalRyml.g:850:1: rule__Music__Group_0_6__0__Impl : ( 'resolution per beats : ' ) ;
    public final void rule__Music__Group_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:854:1: ( ( 'resolution per beats : ' ) )
            // InternalRyml.g:855:1: ( 'resolution per beats : ' )
            {
            // InternalRyml.g:855:1: ( 'resolution per beats : ' )
            // InternalRyml.g:856:2: 'resolution per beats : '
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
    // InternalRyml.g:865:1: rule__Music__Group_0_6__1 : rule__Music__Group_0_6__1__Impl ;
    public final void rule__Music__Group_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:869:1: ( rule__Music__Group_0_6__1__Impl )
            // InternalRyml.g:870:2: rule__Music__Group_0_6__1__Impl
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
    // InternalRyml.g:876:1: rule__Music__Group_0_6__1__Impl : ( ( rule__Music__ResolutionPerSlideAssignment_0_6_1 ) ) ;
    public final void rule__Music__Group_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:880:1: ( ( ( rule__Music__ResolutionPerSlideAssignment_0_6_1 ) ) )
            // InternalRyml.g:881:1: ( ( rule__Music__ResolutionPerSlideAssignment_0_6_1 ) )
            {
            // InternalRyml.g:881:1: ( ( rule__Music__ResolutionPerSlideAssignment_0_6_1 ) )
            // InternalRyml.g:882:2: ( rule__Music__ResolutionPerSlideAssignment_0_6_1 )
            {
             before(grammarAccess.getMusicAccess().getResolutionPerSlideAssignment_0_6_1()); 
            // InternalRyml.g:883:2: ( rule__Music__ResolutionPerSlideAssignment_0_6_1 )
            // InternalRyml.g:883:3: rule__Music__ResolutionPerSlideAssignment_0_6_1
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
    // InternalRyml.g:892:1: rule__Music__Group_0_7__0 : rule__Music__Group_0_7__0__Impl rule__Music__Group_0_7__1 ;
    public final void rule__Music__Group_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:896:1: ( rule__Music__Group_0_7__0__Impl rule__Music__Group_0_7__1 )
            // InternalRyml.g:897:2: rule__Music__Group_0_7__0__Impl rule__Music__Group_0_7__1
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
    // InternalRyml.g:904:1: rule__Music__Group_0_7__0__Impl : ( ( rule__Music__OwnedNotesAssignment_0_7_0 ) ) ;
    public final void rule__Music__Group_0_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:908:1: ( ( ( rule__Music__OwnedNotesAssignment_0_7_0 ) ) )
            // InternalRyml.g:909:1: ( ( rule__Music__OwnedNotesAssignment_0_7_0 ) )
            {
            // InternalRyml.g:909:1: ( ( rule__Music__OwnedNotesAssignment_0_7_0 ) )
            // InternalRyml.g:910:2: ( rule__Music__OwnedNotesAssignment_0_7_0 )
            {
             before(grammarAccess.getMusicAccess().getOwnedNotesAssignment_0_7_0()); 
            // InternalRyml.g:911:2: ( rule__Music__OwnedNotesAssignment_0_7_0 )
            // InternalRyml.g:911:3: rule__Music__OwnedNotesAssignment_0_7_0
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
    // InternalRyml.g:919:1: rule__Music__Group_0_7__1 : rule__Music__Group_0_7__1__Impl ;
    public final void rule__Music__Group_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:923:1: ( rule__Music__Group_0_7__1__Impl )
            // InternalRyml.g:924:2: rule__Music__Group_0_7__1__Impl
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
    // InternalRyml.g:930:1: rule__Music__Group_0_7__1__Impl : ( ( rule__Music__OwnedNotesAssignment_0_7_1 )* ) ;
    public final void rule__Music__Group_0_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:934:1: ( ( ( rule__Music__OwnedNotesAssignment_0_7_1 )* ) )
            // InternalRyml.g:935:1: ( ( rule__Music__OwnedNotesAssignment_0_7_1 )* )
            {
            // InternalRyml.g:935:1: ( ( rule__Music__OwnedNotesAssignment_0_7_1 )* )
            // InternalRyml.g:936:2: ( rule__Music__OwnedNotesAssignment_0_7_1 )*
            {
             before(grammarAccess.getMusicAccess().getOwnedNotesAssignment_0_7_1()); 
            // InternalRyml.g:937:2: ( rule__Music__OwnedNotesAssignment_0_7_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==39) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRyml.g:937:3: rule__Music__OwnedNotesAssignment_0_7_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Music__OwnedNotesAssignment_0_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalRyml.g:946:1: rule__Music__Group_1__0 : rule__Music__Group_1__0__Impl rule__Music__Group_1__1 ;
    public final void rule__Music__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:950:1: ( rule__Music__Group_1__0__Impl rule__Music__Group_1__1 )
            // InternalRyml.g:951:2: rule__Music__Group_1__0__Impl rule__Music__Group_1__1
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
    // InternalRyml.g:958:1: rule__Music__Group_1__0__Impl : ( ( rule__Music__OwnedBeatsAssignment_1_0 ) ) ;
    public final void rule__Music__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:962:1: ( ( ( rule__Music__OwnedBeatsAssignment_1_0 ) ) )
            // InternalRyml.g:963:1: ( ( rule__Music__OwnedBeatsAssignment_1_0 ) )
            {
            // InternalRyml.g:963:1: ( ( rule__Music__OwnedBeatsAssignment_1_0 ) )
            // InternalRyml.g:964:2: ( rule__Music__OwnedBeatsAssignment_1_0 )
            {
             before(grammarAccess.getMusicAccess().getOwnedBeatsAssignment_1_0()); 
            // InternalRyml.g:965:2: ( rule__Music__OwnedBeatsAssignment_1_0 )
            // InternalRyml.g:965:3: rule__Music__OwnedBeatsAssignment_1_0
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
    // InternalRyml.g:973:1: rule__Music__Group_1__1 : rule__Music__Group_1__1__Impl ;
    public final void rule__Music__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:977:1: ( rule__Music__Group_1__1__Impl )
            // InternalRyml.g:978:2: rule__Music__Group_1__1__Impl
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
    // InternalRyml.g:984:1: rule__Music__Group_1__1__Impl : ( ( rule__Music__OwnedBeatsAssignment_1_1 )* ) ;
    public final void rule__Music__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:988:1: ( ( ( rule__Music__OwnedBeatsAssignment_1_1 )* ) )
            // InternalRyml.g:989:1: ( ( rule__Music__OwnedBeatsAssignment_1_1 )* )
            {
            // InternalRyml.g:989:1: ( ( rule__Music__OwnedBeatsAssignment_1_1 )* )
            // InternalRyml.g:990:2: ( rule__Music__OwnedBeatsAssignment_1_1 )*
            {
             before(grammarAccess.getMusicAccess().getOwnedBeatsAssignment_1_1()); 
            // InternalRyml.g:991:2: ( rule__Music__OwnedBeatsAssignment_1_1 )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalRyml.g:991:3: rule__Music__OwnedBeatsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Music__OwnedBeatsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalRyml.g:1000:1: rule__Music__Group_2__0 : rule__Music__Group_2__0__Impl rule__Music__Group_2__1 ;
    public final void rule__Music__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1004:1: ( rule__Music__Group_2__0__Impl rule__Music__Group_2__1 )
            // InternalRyml.g:1005:2: rule__Music__Group_2__0__Impl rule__Music__Group_2__1
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
    // InternalRyml.g:1012:1: rule__Music__Group_2__0__Impl : ( ( rule__Music__OwnedBarsAssignment_2_0 ) ) ;
    public final void rule__Music__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1016:1: ( ( ( rule__Music__OwnedBarsAssignment_2_0 ) ) )
            // InternalRyml.g:1017:1: ( ( rule__Music__OwnedBarsAssignment_2_0 ) )
            {
            // InternalRyml.g:1017:1: ( ( rule__Music__OwnedBarsAssignment_2_0 ) )
            // InternalRyml.g:1018:2: ( rule__Music__OwnedBarsAssignment_2_0 )
            {
             before(grammarAccess.getMusicAccess().getOwnedBarsAssignment_2_0()); 
            // InternalRyml.g:1019:2: ( rule__Music__OwnedBarsAssignment_2_0 )
            // InternalRyml.g:1019:3: rule__Music__OwnedBarsAssignment_2_0
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
    // InternalRyml.g:1027:1: rule__Music__Group_2__1 : rule__Music__Group_2__1__Impl ;
    public final void rule__Music__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1031:1: ( rule__Music__Group_2__1__Impl )
            // InternalRyml.g:1032:2: rule__Music__Group_2__1__Impl
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
    // InternalRyml.g:1038:1: rule__Music__Group_2__1__Impl : ( ( rule__Music__OwnedBarsAssignment_2_1 )* ) ;
    public final void rule__Music__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1042:1: ( ( ( rule__Music__OwnedBarsAssignment_2_1 )* ) )
            // InternalRyml.g:1043:1: ( ( rule__Music__OwnedBarsAssignment_2_1 )* )
            {
            // InternalRyml.g:1043:1: ( ( rule__Music__OwnedBarsAssignment_2_1 )* )
            // InternalRyml.g:1044:2: ( rule__Music__OwnedBarsAssignment_2_1 )*
            {
             before(grammarAccess.getMusicAccess().getOwnedBarsAssignment_2_1()); 
            // InternalRyml.g:1045:2: ( rule__Music__OwnedBarsAssignment_2_1 )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalRyml.g:1045:3: rule__Music__OwnedBarsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Music__OwnedBarsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalRyml.g:1054:1: rule__Music__Group_3__0 : rule__Music__Group_3__0__Impl rule__Music__Group_3__1 ;
    public final void rule__Music__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1058:1: ( rule__Music__Group_3__0__Impl rule__Music__Group_3__1 )
            // InternalRyml.g:1059:2: rule__Music__Group_3__0__Impl rule__Music__Group_3__1
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
    // InternalRyml.g:1066:1: rule__Music__Group_3__0__Impl : ( ( rule__Music__OwnedPatternsAssignment_3_0 ) ) ;
    public final void rule__Music__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1070:1: ( ( ( rule__Music__OwnedPatternsAssignment_3_0 ) ) )
            // InternalRyml.g:1071:1: ( ( rule__Music__OwnedPatternsAssignment_3_0 ) )
            {
            // InternalRyml.g:1071:1: ( ( rule__Music__OwnedPatternsAssignment_3_0 ) )
            // InternalRyml.g:1072:2: ( rule__Music__OwnedPatternsAssignment_3_0 )
            {
             before(grammarAccess.getMusicAccess().getOwnedPatternsAssignment_3_0()); 
            // InternalRyml.g:1073:2: ( rule__Music__OwnedPatternsAssignment_3_0 )
            // InternalRyml.g:1073:3: rule__Music__OwnedPatternsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Music__OwnedPatternsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getOwnedPatternsAssignment_3_0()); 

            }


            }

        }
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
    // InternalRyml.g:1081:1: rule__Music__Group_3__1 : rule__Music__Group_3__1__Impl ;
    public final void rule__Music__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1085:1: ( rule__Music__Group_3__1__Impl )
            // InternalRyml.g:1086:2: rule__Music__Group_3__1__Impl
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
    // InternalRyml.g:1092:1: rule__Music__Group_3__1__Impl : ( ( rule__Music__OwnedPatternsAssignment_3_1 )* ) ;
    public final void rule__Music__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1096:1: ( ( ( rule__Music__OwnedPatternsAssignment_3_1 )* ) )
            // InternalRyml.g:1097:1: ( ( rule__Music__OwnedPatternsAssignment_3_1 )* )
            {
            // InternalRyml.g:1097:1: ( ( rule__Music__OwnedPatternsAssignment_3_1 )* )
            // InternalRyml.g:1098:2: ( rule__Music__OwnedPatternsAssignment_3_1 )*
            {
             before(grammarAccess.getMusicAccess().getOwnedPatternsAssignment_3_1()); 
            // InternalRyml.g:1099:2: ( rule__Music__OwnedPatternsAssignment_3_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
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
            	    // InternalRyml.g:1099:3: rule__Music__OwnedPatternsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Music__OwnedPatternsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMusicAccess().getOwnedPatternsAssignment_3_1()); 

            }


            }

        }
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
    // InternalRyml.g:1108:1: rule__Music__Group_4__0 : rule__Music__Group_4__0__Impl rule__Music__Group_4__1 ;
    public final void rule__Music__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1112:1: ( rule__Music__Group_4__0__Impl rule__Music__Group_4__1 )
            // InternalRyml.g:1113:2: rule__Music__Group_4__0__Impl rule__Music__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalRyml.g:1120:1: rule__Music__Group_4__0__Impl : ( ( rule__Music__OwnedSectionsAssignment_4_0 ) ) ;
    public final void rule__Music__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1124:1: ( ( ( rule__Music__OwnedSectionsAssignment_4_0 ) ) )
            // InternalRyml.g:1125:1: ( ( rule__Music__OwnedSectionsAssignment_4_0 ) )
            {
            // InternalRyml.g:1125:1: ( ( rule__Music__OwnedSectionsAssignment_4_0 ) )
            // InternalRyml.g:1126:2: ( rule__Music__OwnedSectionsAssignment_4_0 )
            {
             before(grammarAccess.getMusicAccess().getOwnedSectionsAssignment_4_0()); 
            // InternalRyml.g:1127:2: ( rule__Music__OwnedSectionsAssignment_4_0 )
            // InternalRyml.g:1127:3: rule__Music__OwnedSectionsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Music__OwnedSectionsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getMusicAccess().getOwnedSectionsAssignment_4_0()); 

            }


            }

        }
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
    // InternalRyml.g:1135:1: rule__Music__Group_4__1 : rule__Music__Group_4__1__Impl ;
    public final void rule__Music__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1139:1: ( rule__Music__Group_4__1__Impl )
            // InternalRyml.g:1140:2: rule__Music__Group_4__1__Impl
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
    // InternalRyml.g:1146:1: rule__Music__Group_4__1__Impl : ( ( rule__Music__OwnedSectionsAssignment_4_1 )* ) ;
    public final void rule__Music__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1150:1: ( ( ( rule__Music__OwnedSectionsAssignment_4_1 )* ) )
            // InternalRyml.g:1151:1: ( ( rule__Music__OwnedSectionsAssignment_4_1 )* )
            {
            // InternalRyml.g:1151:1: ( ( rule__Music__OwnedSectionsAssignment_4_1 )* )
            // InternalRyml.g:1152:2: ( rule__Music__OwnedSectionsAssignment_4_1 )*
            {
             before(grammarAccess.getMusicAccess().getOwnedSectionsAssignment_4_1()); 
            // InternalRyml.g:1153:2: ( rule__Music__OwnedSectionsAssignment_4_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==RULE_STRING) ) {
                        int LA13_3 = input.LA(3);

                        if ( (LA13_3==23) ) {
                            int LA13_5 = input.LA(4);

                            if ( (LA13_5==RULE_STRING) ) {
                                alt13=1;
                            }
                            else if ( (LA13_5==RULE_ID) ) {
                                alt13=1;
                            }


                        }


                    }
                    else if ( (LA13_2==RULE_ID) ) {
                        int LA13_4 = input.LA(3);

                        if ( (LA13_4==23) ) {
                            int LA13_5 = input.LA(4);

                            if ( (LA13_5==RULE_STRING) ) {
                                alt13=1;
                            }
                            else if ( (LA13_5==RULE_ID) ) {
                                alt13=1;
                            }


                        }


                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalRyml.g:1153:3: rule__Music__OwnedSectionsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Music__OwnedSectionsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMusicAccess().getOwnedSectionsAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Section__Group__0"
    // InternalRyml.g:1162:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1166:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalRyml.g:1167:2: rule__Section__Group__0__Impl rule__Section__Group__1
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
    // InternalRyml.g:1174:1: rule__Section__Group__0__Impl : ( 'Section' ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1178:1: ( ( 'Section' ) )
            // InternalRyml.g:1179:1: ( 'Section' )
            {
            // InternalRyml.g:1179:1: ( 'Section' )
            // InternalRyml.g:1180:2: 'Section'
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
    // InternalRyml.g:1189:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1193:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalRyml.g:1194:2: rule__Section__Group__1__Impl rule__Section__Group__2
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
    // InternalRyml.g:1201:1: rule__Section__Group__1__Impl : ( ( rule__Section__NameAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1205:1: ( ( ( rule__Section__NameAssignment_1 ) ) )
            // InternalRyml.g:1206:1: ( ( rule__Section__NameAssignment_1 ) )
            {
            // InternalRyml.g:1206:1: ( ( rule__Section__NameAssignment_1 ) )
            // InternalRyml.g:1207:2: ( rule__Section__NameAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1()); 
            // InternalRyml.g:1208:2: ( rule__Section__NameAssignment_1 )
            // InternalRyml.g:1208:3: rule__Section__NameAssignment_1
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
    // InternalRyml.g:1216:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1220:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalRyml.g:1221:2: rule__Section__Group__2__Impl rule__Section__Group__3
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
    // InternalRyml.g:1228:1: rule__Section__Group__2__Impl : ( ':' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1232:1: ( ( ':' ) )
            // InternalRyml.g:1233:1: ( ':' )
            {
            // InternalRyml.g:1233:1: ( ':' )
            // InternalRyml.g:1234:2: ':'
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
    // InternalRyml.g:1243:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1247:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalRyml.g:1248:2: rule__Section__Group__3__Impl rule__Section__Group__4
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
    // InternalRyml.g:1255:1: rule__Section__Group__3__Impl : ( ( rule__Section__PatternsAssignment_3 ) ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1259:1: ( ( ( rule__Section__PatternsAssignment_3 ) ) )
            // InternalRyml.g:1260:1: ( ( rule__Section__PatternsAssignment_3 ) )
            {
            // InternalRyml.g:1260:1: ( ( rule__Section__PatternsAssignment_3 ) )
            // InternalRyml.g:1261:2: ( rule__Section__PatternsAssignment_3 )
            {
             before(grammarAccess.getSectionAccess().getPatternsAssignment_3()); 
            // InternalRyml.g:1262:2: ( rule__Section__PatternsAssignment_3 )
            // InternalRyml.g:1262:3: rule__Section__PatternsAssignment_3
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
    // InternalRyml.g:1270:1: rule__Section__Group__4 : rule__Section__Group__4__Impl ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1274:1: ( rule__Section__Group__4__Impl )
            // InternalRyml.g:1275:2: rule__Section__Group__4__Impl
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
    // InternalRyml.g:1281:1: rule__Section__Group__4__Impl : ( ( rule__Section__Group_4__0 )* ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1285:1: ( ( ( rule__Section__Group_4__0 )* ) )
            // InternalRyml.g:1286:1: ( ( rule__Section__Group_4__0 )* )
            {
            // InternalRyml.g:1286:1: ( ( rule__Section__Group_4__0 )* )
            // InternalRyml.g:1287:2: ( rule__Section__Group_4__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_4()); 
            // InternalRyml.g:1288:2: ( rule__Section__Group_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRyml.g:1288:3: rule__Section__Group_4__0
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
    // InternalRyml.g:1297:1: rule__Section__Group_4__0 : rule__Section__Group_4__0__Impl rule__Section__Group_4__1 ;
    public final void rule__Section__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1301:1: ( rule__Section__Group_4__0__Impl rule__Section__Group_4__1 )
            // InternalRyml.g:1302:2: rule__Section__Group_4__0__Impl rule__Section__Group_4__1
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
    // InternalRyml.g:1309:1: rule__Section__Group_4__0__Impl : ( '|' ) ;
    public final void rule__Section__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1313:1: ( ( '|' ) )
            // InternalRyml.g:1314:1: ( '|' )
            {
            // InternalRyml.g:1314:1: ( '|' )
            // InternalRyml.g:1315:2: '|'
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
    // InternalRyml.g:1324:1: rule__Section__Group_4__1 : rule__Section__Group_4__1__Impl ;
    public final void rule__Section__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1328:1: ( rule__Section__Group_4__1__Impl )
            // InternalRyml.g:1329:2: rule__Section__Group_4__1__Impl
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
    // InternalRyml.g:1335:1: rule__Section__Group_4__1__Impl : ( ( rule__Section__PatternsAssignment_4_1 ) ) ;
    public final void rule__Section__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1339:1: ( ( ( rule__Section__PatternsAssignment_4_1 ) ) )
            // InternalRyml.g:1340:1: ( ( rule__Section__PatternsAssignment_4_1 ) )
            {
            // InternalRyml.g:1340:1: ( ( rule__Section__PatternsAssignment_4_1 ) )
            // InternalRyml.g:1341:2: ( rule__Section__PatternsAssignment_4_1 )
            {
             before(grammarAccess.getSectionAccess().getPatternsAssignment_4_1()); 
            // InternalRyml.g:1342:2: ( rule__Section__PatternsAssignment_4_1 )
            // InternalRyml.g:1342:3: rule__Section__PatternsAssignment_4_1
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
    // InternalRyml.g:1351:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1355:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalRyml.g:1356:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalRyml.g:1363:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1367:1: ( ( ( '-' )? ) )
            // InternalRyml.g:1368:1: ( ( '-' )? )
            {
            // InternalRyml.g:1368:1: ( ( '-' )? )
            // InternalRyml.g:1369:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalRyml.g:1370:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRyml.g:1370:3: '-'
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
    // InternalRyml.g:1378:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1382:1: ( rule__EInt__Group__1__Impl )
            // InternalRyml.g:1383:2: rule__EInt__Group__1__Impl
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
    // InternalRyml.g:1389:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1393:1: ( ( RULE_INT ) )
            // InternalRyml.g:1394:1: ( RULE_INT )
            {
            // InternalRyml.g:1394:1: ( RULE_INT )
            // InternalRyml.g:1395:2: RULE_INT
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
    // InternalRyml.g:1405:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1409:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalRyml.g:1410:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
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
    // InternalRyml.g:1417:1: rule__Pattern__Group__0__Impl : ( 'Pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1421:1: ( ( 'Pattern' ) )
            // InternalRyml.g:1422:1: ( 'Pattern' )
            {
            // InternalRyml.g:1422:1: ( 'Pattern' )
            // InternalRyml.g:1423:2: 'Pattern'
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
    // InternalRyml.g:1432:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1436:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalRyml.g:1437:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
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
    // InternalRyml.g:1444:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1448:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // InternalRyml.g:1449:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // InternalRyml.g:1449:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // InternalRyml.g:1450:2: ( rule__Pattern__NameAssignment_1 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            // InternalRyml.g:1451:2: ( rule__Pattern__NameAssignment_1 )
            // InternalRyml.g:1451:3: rule__Pattern__NameAssignment_1
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
    // InternalRyml.g:1459:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1463:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalRyml.g:1464:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
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
    // InternalRyml.g:1471:1: rule__Pattern__Group__2__Impl : ( ':' ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1475:1: ( ( ':' ) )
            // InternalRyml.g:1476:1: ( ':' )
            {
            // InternalRyml.g:1476:1: ( ':' )
            // InternalRyml.g:1477:2: ':'
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
    // InternalRyml.g:1486:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1490:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalRyml.g:1491:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
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
    // InternalRyml.g:1498:1: rule__Pattern__Group__3__Impl : ( ( rule__Pattern__BarsAssignment_3 ) ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1502:1: ( ( ( rule__Pattern__BarsAssignment_3 ) ) )
            // InternalRyml.g:1503:1: ( ( rule__Pattern__BarsAssignment_3 ) )
            {
            // InternalRyml.g:1503:1: ( ( rule__Pattern__BarsAssignment_3 ) )
            // InternalRyml.g:1504:2: ( rule__Pattern__BarsAssignment_3 )
            {
             before(grammarAccess.getPatternAccess().getBarsAssignment_3()); 
            // InternalRyml.g:1505:2: ( rule__Pattern__BarsAssignment_3 )
            // InternalRyml.g:1505:3: rule__Pattern__BarsAssignment_3
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
    // InternalRyml.g:1513:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1517:1: ( rule__Pattern__Group__4__Impl )
            // InternalRyml.g:1518:2: rule__Pattern__Group__4__Impl
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
    // InternalRyml.g:1524:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__Group_4__0 )* ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1528:1: ( ( ( rule__Pattern__Group_4__0 )* ) )
            // InternalRyml.g:1529:1: ( ( rule__Pattern__Group_4__0 )* )
            {
            // InternalRyml.g:1529:1: ( ( rule__Pattern__Group_4__0 )* )
            // InternalRyml.g:1530:2: ( rule__Pattern__Group_4__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_4()); 
            // InternalRyml.g:1531:2: ( rule__Pattern__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRyml.g:1531:3: rule__Pattern__Group_4__0
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
    // InternalRyml.g:1540:1: rule__Pattern__Group_4__0 : rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 ;
    public final void rule__Pattern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1544:1: ( rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 )
            // InternalRyml.g:1545:2: rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1
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
    // InternalRyml.g:1552:1: rule__Pattern__Group_4__0__Impl : ( '|' ) ;
    public final void rule__Pattern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1556:1: ( ( '|' ) )
            // InternalRyml.g:1557:1: ( '|' )
            {
            // InternalRyml.g:1557:1: ( '|' )
            // InternalRyml.g:1558:2: '|'
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
    // InternalRyml.g:1567:1: rule__Pattern__Group_4__1 : rule__Pattern__Group_4__1__Impl ;
    public final void rule__Pattern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1571:1: ( rule__Pattern__Group_4__1__Impl )
            // InternalRyml.g:1572:2: rule__Pattern__Group_4__1__Impl
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
    // InternalRyml.g:1578:1: rule__Pattern__Group_4__1__Impl : ( ( rule__Pattern__BarsAssignment_4_1 ) ) ;
    public final void rule__Pattern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1582:1: ( ( ( rule__Pattern__BarsAssignment_4_1 ) ) )
            // InternalRyml.g:1583:1: ( ( rule__Pattern__BarsAssignment_4_1 ) )
            {
            // InternalRyml.g:1583:1: ( ( rule__Pattern__BarsAssignment_4_1 ) )
            // InternalRyml.g:1584:2: ( rule__Pattern__BarsAssignment_4_1 )
            {
             before(grammarAccess.getPatternAccess().getBarsAssignment_4_1()); 
            // InternalRyml.g:1585:2: ( rule__Pattern__BarsAssignment_4_1 )
            // InternalRyml.g:1585:3: rule__Pattern__BarsAssignment_4_1
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
    // InternalRyml.g:1594:1: rule__BarMultiplier__Group__0 : rule__BarMultiplier__Group__0__Impl rule__BarMultiplier__Group__1 ;
    public final void rule__BarMultiplier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1598:1: ( rule__BarMultiplier__Group__0__Impl rule__BarMultiplier__Group__1 )
            // InternalRyml.g:1599:2: rule__BarMultiplier__Group__0__Impl rule__BarMultiplier__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalRyml.g:1606:1: rule__BarMultiplier__Group__0__Impl : ( ( rule__BarMultiplier__BarAssignment_0 ) ) ;
    public final void rule__BarMultiplier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1610:1: ( ( ( rule__BarMultiplier__BarAssignment_0 ) ) )
            // InternalRyml.g:1611:1: ( ( rule__BarMultiplier__BarAssignment_0 ) )
            {
            // InternalRyml.g:1611:1: ( ( rule__BarMultiplier__BarAssignment_0 ) )
            // InternalRyml.g:1612:2: ( rule__BarMultiplier__BarAssignment_0 )
            {
             before(grammarAccess.getBarMultiplierAccess().getBarAssignment_0()); 
            // InternalRyml.g:1613:2: ( rule__BarMultiplier__BarAssignment_0 )
            // InternalRyml.g:1613:3: rule__BarMultiplier__BarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BarMultiplier__BarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBarMultiplierAccess().getBarAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarMultiplier__Group__0__Impl"


    // $ANTLR start "rule__BarMultiplier__Group__1"
    // InternalRyml.g:1621:1: rule__BarMultiplier__Group__1 : rule__BarMultiplier__Group__1__Impl ;
    public final void rule__BarMultiplier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1625:1: ( rule__BarMultiplier__Group__1__Impl )
            // InternalRyml.g:1626:2: rule__BarMultiplier__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarMultiplier__Group__1__Impl();

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
    // InternalRyml.g:1632:1: rule__BarMultiplier__Group__1__Impl : ( ( rule__BarMultiplier__Group_1__0 )? ) ;
    public final void rule__BarMultiplier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1636:1: ( ( ( rule__BarMultiplier__Group_1__0 )? ) )
            // InternalRyml.g:1637:1: ( ( rule__BarMultiplier__Group_1__0 )? )
            {
            // InternalRyml.g:1637:1: ( ( rule__BarMultiplier__Group_1__0 )? )
            // InternalRyml.g:1638:2: ( rule__BarMultiplier__Group_1__0 )?
            {
             before(grammarAccess.getBarMultiplierAccess().getGroup_1()); 
            // InternalRyml.g:1639:2: ( rule__BarMultiplier__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRyml.g:1639:3: rule__BarMultiplier__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarMultiplier__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarMultiplierAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BarMultiplier__Group_1__0"
    // InternalRyml.g:1648:1: rule__BarMultiplier__Group_1__0 : rule__BarMultiplier__Group_1__0__Impl rule__BarMultiplier__Group_1__1 ;
    public final void rule__BarMultiplier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1652:1: ( rule__BarMultiplier__Group_1__0__Impl rule__BarMultiplier__Group_1__1 )
            // InternalRyml.g:1653:2: rule__BarMultiplier__Group_1__0__Impl rule__BarMultiplier__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__BarMultiplier__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarMultiplier__Group_1__1();

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
    // $ANTLR end "rule__BarMultiplier__Group_1__0"


    // $ANTLR start "rule__BarMultiplier__Group_1__0__Impl"
    // InternalRyml.g:1660:1: rule__BarMultiplier__Group_1__0__Impl : ( 'x' ) ;
    public final void rule__BarMultiplier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1664:1: ( ( 'x' ) )
            // InternalRyml.g:1665:1: ( 'x' )
            {
            // InternalRyml.g:1665:1: ( 'x' )
            // InternalRyml.g:1666:2: 'x'
            {
             before(grammarAccess.getBarMultiplierAccess().getXKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBarMultiplierAccess().getXKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarMultiplier__Group_1__0__Impl"


    // $ANTLR start "rule__BarMultiplier__Group_1__1"
    // InternalRyml.g:1675:1: rule__BarMultiplier__Group_1__1 : rule__BarMultiplier__Group_1__1__Impl ;
    public final void rule__BarMultiplier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1679:1: ( rule__BarMultiplier__Group_1__1__Impl )
            // InternalRyml.g:1680:2: rule__BarMultiplier__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarMultiplier__Group_1__1__Impl();

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
    // $ANTLR end "rule__BarMultiplier__Group_1__1"


    // $ANTLR start "rule__BarMultiplier__Group_1__1__Impl"
    // InternalRyml.g:1686:1: rule__BarMultiplier__Group_1__1__Impl : ( ( rule__BarMultiplier__MultiplierAssignment_1_1 ) ) ;
    public final void rule__BarMultiplier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1690:1: ( ( ( rule__BarMultiplier__MultiplierAssignment_1_1 ) ) )
            // InternalRyml.g:1691:1: ( ( rule__BarMultiplier__MultiplierAssignment_1_1 ) )
            {
            // InternalRyml.g:1691:1: ( ( rule__BarMultiplier__MultiplierAssignment_1_1 ) )
            // InternalRyml.g:1692:2: ( rule__BarMultiplier__MultiplierAssignment_1_1 )
            {
             before(grammarAccess.getBarMultiplierAccess().getMultiplierAssignment_1_1()); 
            // InternalRyml.g:1693:2: ( rule__BarMultiplier__MultiplierAssignment_1_1 )
            // InternalRyml.g:1693:3: rule__BarMultiplier__MultiplierAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BarMultiplier__MultiplierAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBarMultiplierAccess().getMultiplierAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarMultiplier__Group_1__1__Impl"


    // $ANTLR start "rule__ClassicalBar__Group__0"
    // InternalRyml.g:1702:1: rule__ClassicalBar__Group__0 : rule__ClassicalBar__Group__0__Impl rule__ClassicalBar__Group__1 ;
    public final void rule__ClassicalBar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1706:1: ( rule__ClassicalBar__Group__0__Impl rule__ClassicalBar__Group__1 )
            // InternalRyml.g:1707:2: rule__ClassicalBar__Group__0__Impl rule__ClassicalBar__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRyml.g:1714:1: rule__ClassicalBar__Group__0__Impl : ( 'Bar' ) ;
    public final void rule__ClassicalBar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1718:1: ( ( 'Bar' ) )
            // InternalRyml.g:1719:1: ( 'Bar' )
            {
            // InternalRyml.g:1719:1: ( 'Bar' )
            // InternalRyml.g:1720:2: 'Bar'
            {
             before(grammarAccess.getClassicalBarAccess().getBarKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getClassicalBarAccess().getBarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalBar__Group__0__Impl"


    // $ANTLR start "rule__ClassicalBar__Group__1"
    // InternalRyml.g:1729:1: rule__ClassicalBar__Group__1 : rule__ClassicalBar__Group__1__Impl rule__ClassicalBar__Group__2 ;
    public final void rule__ClassicalBar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1733:1: ( rule__ClassicalBar__Group__1__Impl rule__ClassicalBar__Group__2 )
            // InternalRyml.g:1734:2: rule__ClassicalBar__Group__1__Impl rule__ClassicalBar__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalRyml.g:1741:1: rule__ClassicalBar__Group__1__Impl : ( ( rule__ClassicalBar__NameAssignment_1 ) ) ;
    public final void rule__ClassicalBar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1745:1: ( ( ( rule__ClassicalBar__NameAssignment_1 ) ) )
            // InternalRyml.g:1746:1: ( ( rule__ClassicalBar__NameAssignment_1 ) )
            {
            // InternalRyml.g:1746:1: ( ( rule__ClassicalBar__NameAssignment_1 ) )
            // InternalRyml.g:1747:2: ( rule__ClassicalBar__NameAssignment_1 )
            {
             before(grammarAccess.getClassicalBarAccess().getNameAssignment_1()); 
            // InternalRyml.g:1748:2: ( rule__ClassicalBar__NameAssignment_1 )
            // InternalRyml.g:1748:3: rule__ClassicalBar__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalBar__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassicalBarAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalRyml.g:1756:1: rule__ClassicalBar__Group__2 : rule__ClassicalBar__Group__2__Impl rule__ClassicalBar__Group__3 ;
    public final void rule__ClassicalBar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1760:1: ( rule__ClassicalBar__Group__2__Impl rule__ClassicalBar__Group__3 )
            // InternalRyml.g:1761:2: rule__ClassicalBar__Group__2__Impl rule__ClassicalBar__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalRyml.g:1768:1: rule__ClassicalBar__Group__2__Impl : ( ':' ) ;
    public final void rule__ClassicalBar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1772:1: ( ( ':' ) )
            // InternalRyml.g:1773:1: ( ':' )
            {
            // InternalRyml.g:1773:1: ( ':' )
            // InternalRyml.g:1774:2: ':'
            {
             before(grammarAccess.getClassicalBarAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getClassicalBarAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalRyml.g:1783:1: rule__ClassicalBar__Group__3 : rule__ClassicalBar__Group__3__Impl rule__ClassicalBar__Group__4 ;
    public final void rule__ClassicalBar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1787:1: ( rule__ClassicalBar__Group__3__Impl rule__ClassicalBar__Group__4 )
            // InternalRyml.g:1788:2: rule__ClassicalBar__Group__3__Impl rule__ClassicalBar__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalRyml.g:1795:1: rule__ClassicalBar__Group__3__Impl : ( ( rule__ClassicalBar__BeatsAssignment_3 ) ) ;
    public final void rule__ClassicalBar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1799:1: ( ( ( rule__ClassicalBar__BeatsAssignment_3 ) ) )
            // InternalRyml.g:1800:1: ( ( rule__ClassicalBar__BeatsAssignment_3 ) )
            {
            // InternalRyml.g:1800:1: ( ( rule__ClassicalBar__BeatsAssignment_3 ) )
            // InternalRyml.g:1801:2: ( rule__ClassicalBar__BeatsAssignment_3 )
            {
             before(grammarAccess.getClassicalBarAccess().getBeatsAssignment_3()); 
            // InternalRyml.g:1802:2: ( rule__ClassicalBar__BeatsAssignment_3 )
            // InternalRyml.g:1802:3: rule__ClassicalBar__BeatsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalBar__BeatsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClassicalBarAccess().getBeatsAssignment_3()); 

            }


            }

        }
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
    // InternalRyml.g:1810:1: rule__ClassicalBar__Group__4 : rule__ClassicalBar__Group__4__Impl ;
    public final void rule__ClassicalBar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1814:1: ( rule__ClassicalBar__Group__4__Impl )
            // InternalRyml.g:1815:2: rule__ClassicalBar__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalBar__Group__4__Impl();

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
    // InternalRyml.g:1821:1: rule__ClassicalBar__Group__4__Impl : ( ( rule__ClassicalBar__Group_4__0 )* ) ;
    public final void rule__ClassicalBar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1825:1: ( ( ( rule__ClassicalBar__Group_4__0 )* ) )
            // InternalRyml.g:1826:1: ( ( rule__ClassicalBar__Group_4__0 )* )
            {
            // InternalRyml.g:1826:1: ( ( rule__ClassicalBar__Group_4__0 )* )
            // InternalRyml.g:1827:2: ( rule__ClassicalBar__Group_4__0 )*
            {
             before(grammarAccess.getClassicalBarAccess().getGroup_4()); 
            // InternalRyml.g:1828:2: ( rule__ClassicalBar__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRyml.g:1828:3: rule__ClassicalBar__Group_4__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ClassicalBar__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getClassicalBarAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ClassicalBar__Group_4__0"
    // InternalRyml.g:1837:1: rule__ClassicalBar__Group_4__0 : rule__ClassicalBar__Group_4__0__Impl rule__ClassicalBar__Group_4__1 ;
    public final void rule__ClassicalBar__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1841:1: ( rule__ClassicalBar__Group_4__0__Impl rule__ClassicalBar__Group_4__1 )
            // InternalRyml.g:1842:2: rule__ClassicalBar__Group_4__0__Impl rule__ClassicalBar__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__ClassicalBar__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalBar__Group_4__1();

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
    // $ANTLR end "rule__ClassicalBar__Group_4__0"


    // $ANTLR start "rule__ClassicalBar__Group_4__0__Impl"
    // InternalRyml.g:1849:1: rule__ClassicalBar__Group_4__0__Impl : ( '|' ) ;
    public final void rule__ClassicalBar__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1853:1: ( ( '|' ) )
            // InternalRyml.g:1854:1: ( '|' )
            {
            // InternalRyml.g:1854:1: ( '|' )
            // InternalRyml.g:1855:2: '|'
            {
             before(grammarAccess.getClassicalBarAccess().getVerticalLineKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getClassicalBarAccess().getVerticalLineKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalBar__Group_4__0__Impl"


    // $ANTLR start "rule__ClassicalBar__Group_4__1"
    // InternalRyml.g:1864:1: rule__ClassicalBar__Group_4__1 : rule__ClassicalBar__Group_4__1__Impl ;
    public final void rule__ClassicalBar__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1868:1: ( rule__ClassicalBar__Group_4__1__Impl )
            // InternalRyml.g:1869:2: rule__ClassicalBar__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalBar__Group_4__1__Impl();

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
    // $ANTLR end "rule__ClassicalBar__Group_4__1"


    // $ANTLR start "rule__ClassicalBar__Group_4__1__Impl"
    // InternalRyml.g:1875:1: rule__ClassicalBar__Group_4__1__Impl : ( ( rule__ClassicalBar__BeatsAssignment_4_1 ) ) ;
    public final void rule__ClassicalBar__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1879:1: ( ( ( rule__ClassicalBar__BeatsAssignment_4_1 ) ) )
            // InternalRyml.g:1880:1: ( ( rule__ClassicalBar__BeatsAssignment_4_1 ) )
            {
            // InternalRyml.g:1880:1: ( ( rule__ClassicalBar__BeatsAssignment_4_1 ) )
            // InternalRyml.g:1881:2: ( rule__ClassicalBar__BeatsAssignment_4_1 )
            {
             before(grammarAccess.getClassicalBarAccess().getBeatsAssignment_4_1()); 
            // InternalRyml.g:1882:2: ( rule__ClassicalBar__BeatsAssignment_4_1 )
            // InternalRyml.g:1882:3: rule__ClassicalBar__BeatsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalBar__BeatsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassicalBarAccess().getBeatsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalBar__Group_4__1__Impl"


    // $ANTLR start "rule__ModifiedBar__Group__0"
    // InternalRyml.g:1891:1: rule__ModifiedBar__Group__0 : rule__ModifiedBar__Group__0__Impl rule__ModifiedBar__Group__1 ;
    public final void rule__ModifiedBar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1895:1: ( rule__ModifiedBar__Group__0__Impl rule__ModifiedBar__Group__1 )
            // InternalRyml.g:1896:2: rule__ModifiedBar__Group__0__Impl rule__ModifiedBar__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRyml.g:1903:1: rule__ModifiedBar__Group__0__Impl : ( 'Bar' ) ;
    public final void rule__ModifiedBar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1907:1: ( ( 'Bar' ) )
            // InternalRyml.g:1908:1: ( 'Bar' )
            {
            // InternalRyml.g:1908:1: ( 'Bar' )
            // InternalRyml.g:1909:2: 'Bar'
            {
             before(grammarAccess.getModifiedBarAccess().getBarKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getModifiedBarAccess().getBarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiedBar__Group__0__Impl"


    // $ANTLR start "rule__ModifiedBar__Group__1"
    // InternalRyml.g:1918:1: rule__ModifiedBar__Group__1 : rule__ModifiedBar__Group__1__Impl rule__ModifiedBar__Group__2 ;
    public final void rule__ModifiedBar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1922:1: ( rule__ModifiedBar__Group__1__Impl rule__ModifiedBar__Group__2 )
            // InternalRyml.g:1923:2: rule__ModifiedBar__Group__1__Impl rule__ModifiedBar__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalRyml.g:1930:1: rule__ModifiedBar__Group__1__Impl : ( ( rule__ModifiedBar__NameAssignment_1 ) ) ;
    public final void rule__ModifiedBar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1934:1: ( ( ( rule__ModifiedBar__NameAssignment_1 ) ) )
            // InternalRyml.g:1935:1: ( ( rule__ModifiedBar__NameAssignment_1 ) )
            {
            // InternalRyml.g:1935:1: ( ( rule__ModifiedBar__NameAssignment_1 ) )
            // InternalRyml.g:1936:2: ( rule__ModifiedBar__NameAssignment_1 )
            {
             before(grammarAccess.getModifiedBarAccess().getNameAssignment_1()); 
            // InternalRyml.g:1937:2: ( rule__ModifiedBar__NameAssignment_1 )
            // InternalRyml.g:1937:3: rule__ModifiedBar__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ModifiedBar__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModifiedBarAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalRyml.g:1945:1: rule__ModifiedBar__Group__2 : rule__ModifiedBar__Group__2__Impl rule__ModifiedBar__Group__3 ;
    public final void rule__ModifiedBar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1949:1: ( rule__ModifiedBar__Group__2__Impl rule__ModifiedBar__Group__3 )
            // InternalRyml.g:1950:2: rule__ModifiedBar__Group__2__Impl rule__ModifiedBar__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalRyml.g:1957:1: rule__ModifiedBar__Group__2__Impl : ( ' based on :' ) ;
    public final void rule__ModifiedBar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1961:1: ( ( ' based on :' ) )
            // InternalRyml.g:1962:1: ( ' based on :' )
            {
            // InternalRyml.g:1962:1: ( ' based on :' )
            // InternalRyml.g:1963:2: ' based on :'
            {
             before(grammarAccess.getModifiedBarAccess().getBasedOnKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getModifiedBarAccess().getBasedOnKeyword_2()); 

            }


            }

        }
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
    // InternalRyml.g:1972:1: rule__ModifiedBar__Group__3 : rule__ModifiedBar__Group__3__Impl ;
    public final void rule__ModifiedBar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1976:1: ( rule__ModifiedBar__Group__3__Impl )
            // InternalRyml.g:1977:2: rule__ModifiedBar__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModifiedBar__Group__3__Impl();

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
    // InternalRyml.g:1983:1: rule__ModifiedBar__Group__3__Impl : ( ( rule__ModifiedBar__BarAssignment_3 ) ) ;
    public final void rule__ModifiedBar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:1987:1: ( ( ( rule__ModifiedBar__BarAssignment_3 ) ) )
            // InternalRyml.g:1988:1: ( ( rule__ModifiedBar__BarAssignment_3 ) )
            {
            // InternalRyml.g:1988:1: ( ( rule__ModifiedBar__BarAssignment_3 ) )
            // InternalRyml.g:1989:2: ( rule__ModifiedBar__BarAssignment_3 )
            {
             before(grammarAccess.getModifiedBarAccess().getBarAssignment_3()); 
            // InternalRyml.g:1990:2: ( rule__ModifiedBar__BarAssignment_3 )
            // InternalRyml.g:1990:3: rule__ModifiedBar__BarAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ModifiedBar__BarAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModifiedBarAccess().getBarAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Beat__Group__0"
    // InternalRyml.g:1999:1: rule__Beat__Group__0 : rule__Beat__Group__0__Impl rule__Beat__Group__1 ;
    public final void rule__Beat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2003:1: ( rule__Beat__Group__0__Impl rule__Beat__Group__1 )
            // InternalRyml.g:2004:2: rule__Beat__Group__0__Impl rule__Beat__Group__1
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
    // InternalRyml.g:2011:1: rule__Beat__Group__0__Impl : ( 'Beat' ) ;
    public final void rule__Beat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2015:1: ( ( 'Beat' ) )
            // InternalRyml.g:2016:1: ( 'Beat' )
            {
            // InternalRyml.g:2016:1: ( 'Beat' )
            // InternalRyml.g:2017:2: 'Beat'
            {
             before(grammarAccess.getBeatAccess().getBeatKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRyml.g:2026:1: rule__Beat__Group__1 : rule__Beat__Group__1__Impl rule__Beat__Group__2 ;
    public final void rule__Beat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2030:1: ( rule__Beat__Group__1__Impl rule__Beat__Group__2 )
            // InternalRyml.g:2031:2: rule__Beat__Group__1__Impl rule__Beat__Group__2
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
    // InternalRyml.g:2038:1: rule__Beat__Group__1__Impl : ( ( rule__Beat__NameAssignment_1 ) ) ;
    public final void rule__Beat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2042:1: ( ( ( rule__Beat__NameAssignment_1 ) ) )
            // InternalRyml.g:2043:1: ( ( rule__Beat__NameAssignment_1 ) )
            {
            // InternalRyml.g:2043:1: ( ( rule__Beat__NameAssignment_1 ) )
            // InternalRyml.g:2044:2: ( rule__Beat__NameAssignment_1 )
            {
             before(grammarAccess.getBeatAccess().getNameAssignment_1()); 
            // InternalRyml.g:2045:2: ( rule__Beat__NameAssignment_1 )
            // InternalRyml.g:2045:3: rule__Beat__NameAssignment_1
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
    // InternalRyml.g:2053:1: rule__Beat__Group__2 : rule__Beat__Group__2__Impl rule__Beat__Group__3 ;
    public final void rule__Beat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2057:1: ( rule__Beat__Group__2__Impl rule__Beat__Group__3 )
            // InternalRyml.g:2058:2: rule__Beat__Group__2__Impl rule__Beat__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalRyml.g:2065:1: rule__Beat__Group__2__Impl : ( ':' ) ;
    public final void rule__Beat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2069:1: ( ( ':' ) )
            // InternalRyml.g:2070:1: ( ':' )
            {
            // InternalRyml.g:2070:1: ( ':' )
            // InternalRyml.g:2071:2: ':'
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
    // InternalRyml.g:2080:1: rule__Beat__Group__3 : rule__Beat__Group__3__Impl rule__Beat__Group__4 ;
    public final void rule__Beat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2084:1: ( rule__Beat__Group__3__Impl rule__Beat__Group__4 )
            // InternalRyml.g:2085:2: rule__Beat__Group__3__Impl rule__Beat__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalRyml.g:2092:1: rule__Beat__Group__3__Impl : ( ( rule__Beat__Group_3__0 )? ) ;
    public final void rule__Beat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2096:1: ( ( ( rule__Beat__Group_3__0 )? ) )
            // InternalRyml.g:2097:1: ( ( rule__Beat__Group_3__0 )? )
            {
            // InternalRyml.g:2097:1: ( ( rule__Beat__Group_3__0 )? )
            // InternalRyml.g:2098:2: ( rule__Beat__Group_3__0 )?
            {
             before(grammarAccess.getBeatAccess().getGroup_3()); 
            // InternalRyml.g:2099:2: ( rule__Beat__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRyml.g:2099:3: rule__Beat__Group_3__0
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
    // InternalRyml.g:2107:1: rule__Beat__Group__4 : rule__Beat__Group__4__Impl rule__Beat__Group__5 ;
    public final void rule__Beat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2111:1: ( rule__Beat__Group__4__Impl rule__Beat__Group__5 )
            // InternalRyml.g:2112:2: rule__Beat__Group__4__Impl rule__Beat__Group__5
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
    // InternalRyml.g:2119:1: rule__Beat__Group__4__Impl : ( 'Notes :' ) ;
    public final void rule__Beat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2123:1: ( ( 'Notes :' ) )
            // InternalRyml.g:2124:1: ( 'Notes :' )
            {
            // InternalRyml.g:2124:1: ( 'Notes :' )
            // InternalRyml.g:2125:2: 'Notes :'
            {
             before(grammarAccess.getBeatAccess().getNotesKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRyml.g:2134:1: rule__Beat__Group__5 : rule__Beat__Group__5__Impl rule__Beat__Group__6 ;
    public final void rule__Beat__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2138:1: ( rule__Beat__Group__5__Impl rule__Beat__Group__6 )
            // InternalRyml.g:2139:2: rule__Beat__Group__5__Impl rule__Beat__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalRyml.g:2146:1: rule__Beat__Group__5__Impl : ( ( rule__Beat__NotesAssignment_5 ) ) ;
    public final void rule__Beat__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2150:1: ( ( ( rule__Beat__NotesAssignment_5 ) ) )
            // InternalRyml.g:2151:1: ( ( rule__Beat__NotesAssignment_5 ) )
            {
            // InternalRyml.g:2151:1: ( ( rule__Beat__NotesAssignment_5 ) )
            // InternalRyml.g:2152:2: ( rule__Beat__NotesAssignment_5 )
            {
             before(grammarAccess.getBeatAccess().getNotesAssignment_5()); 
            // InternalRyml.g:2153:2: ( rule__Beat__NotesAssignment_5 )
            // InternalRyml.g:2153:3: rule__Beat__NotesAssignment_5
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
    // InternalRyml.g:2161:1: rule__Beat__Group__6 : rule__Beat__Group__6__Impl rule__Beat__Group__7 ;
    public final void rule__Beat__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2165:1: ( rule__Beat__Group__6__Impl rule__Beat__Group__7 )
            // InternalRyml.g:2166:2: rule__Beat__Group__6__Impl rule__Beat__Group__7
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
    // InternalRyml.g:2173:1: rule__Beat__Group__6__Impl : ( ',' ) ;
    public final void rule__Beat__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2177:1: ( ( ',' ) )
            // InternalRyml.g:2178:1: ( ',' )
            {
            // InternalRyml.g:2178:1: ( ',' )
            // InternalRyml.g:2179:2: ','
            {
             before(grammarAccess.getBeatAccess().getCommaKeyword_6()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRyml.g:2188:1: rule__Beat__Group__7 : rule__Beat__Group__7__Impl rule__Beat__Group__8 ;
    public final void rule__Beat__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2192:1: ( rule__Beat__Group__7__Impl rule__Beat__Group__8 )
            // InternalRyml.g:2193:2: rule__Beat__Group__7__Impl rule__Beat__Group__8
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
    // InternalRyml.g:2200:1: rule__Beat__Group__7__Impl : ( ( rule__Beat__NotePositionsAssignment_7 ) ) ;
    public final void rule__Beat__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2204:1: ( ( ( rule__Beat__NotePositionsAssignment_7 ) ) )
            // InternalRyml.g:2205:1: ( ( rule__Beat__NotePositionsAssignment_7 ) )
            {
            // InternalRyml.g:2205:1: ( ( rule__Beat__NotePositionsAssignment_7 ) )
            // InternalRyml.g:2206:2: ( rule__Beat__NotePositionsAssignment_7 )
            {
             before(grammarAccess.getBeatAccess().getNotePositionsAssignment_7()); 
            // InternalRyml.g:2207:2: ( rule__Beat__NotePositionsAssignment_7 )
            // InternalRyml.g:2207:3: rule__Beat__NotePositionsAssignment_7
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
    // InternalRyml.g:2215:1: rule__Beat__Group__8 : rule__Beat__Group__8__Impl ;
    public final void rule__Beat__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2219:1: ( rule__Beat__Group__8__Impl )
            // InternalRyml.g:2220:2: rule__Beat__Group__8__Impl
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
    // InternalRyml.g:2226:1: rule__Beat__Group__8__Impl : ( ( rule__Beat__Group_8__0 )* ) ;
    public final void rule__Beat__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2230:1: ( ( ( rule__Beat__Group_8__0 )* ) )
            // InternalRyml.g:2231:1: ( ( rule__Beat__Group_8__0 )* )
            {
            // InternalRyml.g:2231:1: ( ( rule__Beat__Group_8__0 )* )
            // InternalRyml.g:2232:2: ( rule__Beat__Group_8__0 )*
            {
             before(grammarAccess.getBeatAccess().getGroup_8()); 
            // InternalRyml.g:2233:2: ( rule__Beat__Group_8__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRyml.g:2233:3: rule__Beat__Group_8__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Beat__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalRyml.g:2242:1: rule__Beat__Group_3__0 : rule__Beat__Group_3__0__Impl rule__Beat__Group_3__1 ;
    public final void rule__Beat__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2246:1: ( rule__Beat__Group_3__0__Impl rule__Beat__Group_3__1 )
            // InternalRyml.g:2247:2: rule__Beat__Group_3__0__Impl rule__Beat__Group_3__1
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
    // InternalRyml.g:2254:1: rule__Beat__Group_3__0__Impl : ( 'Nb of ticks : ' ) ;
    public final void rule__Beat__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2258:1: ( ( 'Nb of ticks : ' ) )
            // InternalRyml.g:2259:1: ( 'Nb of ticks : ' )
            {
            // InternalRyml.g:2259:1: ( 'Nb of ticks : ' )
            // InternalRyml.g:2260:2: 'Nb of ticks : '
            {
             before(grammarAccess.getBeatAccess().getNbOfTicksKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRyml.g:2269:1: rule__Beat__Group_3__1 : rule__Beat__Group_3__1__Impl ;
    public final void rule__Beat__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2273:1: ( rule__Beat__Group_3__1__Impl )
            // InternalRyml.g:2274:2: rule__Beat__Group_3__1__Impl
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
    // InternalRyml.g:2280:1: rule__Beat__Group_3__1__Impl : ( ( rule__Beat__TotalDivNumberAssignment_3_1 ) ) ;
    public final void rule__Beat__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2284:1: ( ( ( rule__Beat__TotalDivNumberAssignment_3_1 ) ) )
            // InternalRyml.g:2285:1: ( ( rule__Beat__TotalDivNumberAssignment_3_1 ) )
            {
            // InternalRyml.g:2285:1: ( ( rule__Beat__TotalDivNumberAssignment_3_1 ) )
            // InternalRyml.g:2286:2: ( rule__Beat__TotalDivNumberAssignment_3_1 )
            {
             before(grammarAccess.getBeatAccess().getTotalDivNumberAssignment_3_1()); 
            // InternalRyml.g:2287:2: ( rule__Beat__TotalDivNumberAssignment_3_1 )
            // InternalRyml.g:2287:3: rule__Beat__TotalDivNumberAssignment_3_1
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
    // InternalRyml.g:2296:1: rule__Beat__Group_8__0 : rule__Beat__Group_8__0__Impl rule__Beat__Group_8__1 ;
    public final void rule__Beat__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2300:1: ( rule__Beat__Group_8__0__Impl rule__Beat__Group_8__1 )
            // InternalRyml.g:2301:2: rule__Beat__Group_8__0__Impl rule__Beat__Group_8__1
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
    // InternalRyml.g:2308:1: rule__Beat__Group_8__0__Impl : ( '|' ) ;
    public final void rule__Beat__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2312:1: ( ( '|' ) )
            // InternalRyml.g:2313:1: ( '|' )
            {
            // InternalRyml.g:2313:1: ( '|' )
            // InternalRyml.g:2314:2: '|'
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
    // InternalRyml.g:2323:1: rule__Beat__Group_8__1 : rule__Beat__Group_8__1__Impl rule__Beat__Group_8__2 ;
    public final void rule__Beat__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2327:1: ( rule__Beat__Group_8__1__Impl rule__Beat__Group_8__2 )
            // InternalRyml.g:2328:2: rule__Beat__Group_8__1__Impl rule__Beat__Group_8__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalRyml.g:2335:1: rule__Beat__Group_8__1__Impl : ( ( rule__Beat__NotesAssignment_8_1 ) ) ;
    public final void rule__Beat__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2339:1: ( ( ( rule__Beat__NotesAssignment_8_1 ) ) )
            // InternalRyml.g:2340:1: ( ( rule__Beat__NotesAssignment_8_1 ) )
            {
            // InternalRyml.g:2340:1: ( ( rule__Beat__NotesAssignment_8_1 ) )
            // InternalRyml.g:2341:2: ( rule__Beat__NotesAssignment_8_1 )
            {
             before(grammarAccess.getBeatAccess().getNotesAssignment_8_1()); 
            // InternalRyml.g:2342:2: ( rule__Beat__NotesAssignment_8_1 )
            // InternalRyml.g:2342:3: rule__Beat__NotesAssignment_8_1
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
    // InternalRyml.g:2350:1: rule__Beat__Group_8__2 : rule__Beat__Group_8__2__Impl rule__Beat__Group_8__3 ;
    public final void rule__Beat__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2354:1: ( rule__Beat__Group_8__2__Impl rule__Beat__Group_8__3 )
            // InternalRyml.g:2355:2: rule__Beat__Group_8__2__Impl rule__Beat__Group_8__3
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
    // InternalRyml.g:2362:1: rule__Beat__Group_8__2__Impl : ( ',' ) ;
    public final void rule__Beat__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2366:1: ( ( ',' ) )
            // InternalRyml.g:2367:1: ( ',' )
            {
            // InternalRyml.g:2367:1: ( ',' )
            // InternalRyml.g:2368:2: ','
            {
             before(grammarAccess.getBeatAccess().getCommaKeyword_8_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRyml.g:2377:1: rule__Beat__Group_8__3 : rule__Beat__Group_8__3__Impl ;
    public final void rule__Beat__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2381:1: ( rule__Beat__Group_8__3__Impl )
            // InternalRyml.g:2382:2: rule__Beat__Group_8__3__Impl
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
    // InternalRyml.g:2388:1: rule__Beat__Group_8__3__Impl : ( ( rule__Beat__NotePositionsAssignment_8_3 ) ) ;
    public final void rule__Beat__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2392:1: ( ( ( rule__Beat__NotePositionsAssignment_8_3 ) ) )
            // InternalRyml.g:2393:1: ( ( rule__Beat__NotePositionsAssignment_8_3 ) )
            {
            // InternalRyml.g:2393:1: ( ( rule__Beat__NotePositionsAssignment_8_3 ) )
            // InternalRyml.g:2394:2: ( rule__Beat__NotePositionsAssignment_8_3 )
            {
             before(grammarAccess.getBeatAccess().getNotePositionsAssignment_8_3()); 
            // InternalRyml.g:2395:2: ( rule__Beat__NotePositionsAssignment_8_3 )
            // InternalRyml.g:2395:3: rule__Beat__NotePositionsAssignment_8_3
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
    // InternalRyml.g:2404:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2408:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // InternalRyml.g:2409:2: rule__Note__Group__0__Impl rule__Note__Group__1
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
    // InternalRyml.g:2416:1: rule__Note__Group__0__Impl : ( 'Note' ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2420:1: ( ( 'Note' ) )
            // InternalRyml.g:2421:1: ( 'Note' )
            {
            // InternalRyml.g:2421:1: ( 'Note' )
            // InternalRyml.g:2422:2: 'Note'
            {
             before(grammarAccess.getNoteAccess().getNoteKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRyml.g:2431:1: rule__Note__Group__1 : rule__Note__Group__1__Impl rule__Note__Group__2 ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2435:1: ( rule__Note__Group__1__Impl rule__Note__Group__2 )
            // InternalRyml.g:2436:2: rule__Note__Group__1__Impl rule__Note__Group__2
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
    // InternalRyml.g:2443:1: rule__Note__Group__1__Impl : ( ( rule__Note__NameAssignment_1 ) ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2447:1: ( ( ( rule__Note__NameAssignment_1 ) ) )
            // InternalRyml.g:2448:1: ( ( rule__Note__NameAssignment_1 ) )
            {
            // InternalRyml.g:2448:1: ( ( rule__Note__NameAssignment_1 ) )
            // InternalRyml.g:2449:2: ( rule__Note__NameAssignment_1 )
            {
             before(grammarAccess.getNoteAccess().getNameAssignment_1()); 
            // InternalRyml.g:2450:2: ( rule__Note__NameAssignment_1 )
            // InternalRyml.g:2450:3: rule__Note__NameAssignment_1
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
    // InternalRyml.g:2458:1: rule__Note__Group__2 : rule__Note__Group__2__Impl rule__Note__Group__3 ;
    public final void rule__Note__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2462:1: ( rule__Note__Group__2__Impl rule__Note__Group__3 )
            // InternalRyml.g:2463:2: rule__Note__Group__2__Impl rule__Note__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalRyml.g:2470:1: rule__Note__Group__2__Impl : ( ':' ) ;
    public final void rule__Note__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2474:1: ( ( ':' ) )
            // InternalRyml.g:2475:1: ( ':' )
            {
            // InternalRyml.g:2475:1: ( ':' )
            // InternalRyml.g:2476:2: ':'
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
    // InternalRyml.g:2485:1: rule__Note__Group__3 : rule__Note__Group__3__Impl ;
    public final void rule__Note__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2489:1: ( rule__Note__Group__3__Impl )
            // InternalRyml.g:2490:2: rule__Note__Group__3__Impl
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
    // InternalRyml.g:2496:1: rule__Note__Group__3__Impl : ( ( rule__Note__ValueAssignment_3 )? ) ;
    public final void rule__Note__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2500:1: ( ( ( rule__Note__ValueAssignment_3 )? ) )
            // InternalRyml.g:2501:1: ( ( rule__Note__ValueAssignment_3 )? )
            {
            // InternalRyml.g:2501:1: ( ( rule__Note__ValueAssignment_3 )? )
            // InternalRyml.g:2502:2: ( rule__Note__ValueAssignment_3 )?
            {
             before(grammarAccess.getNoteAccess().getValueAssignment_3()); 
            // InternalRyml.g:2503:2: ( rule__Note__ValueAssignment_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=11 && LA21_0<=21)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRyml.g:2503:3: rule__Note__ValueAssignment_3
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
    // InternalRyml.g:2512:1: rule__Music__UnorderedGroup : rule__Music__UnorderedGroup__0 {...}?;
    public final void rule__Music__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMusicAccess().getUnorderedGroup());
        	
        try {
            // InternalRyml.g:2517:1: ( rule__Music__UnorderedGroup__0 {...}?)
            // InternalRyml.g:2518:2: rule__Music__UnorderedGroup__0 {...}?
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
    // InternalRyml.g:2526:1: rule__Music__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Music__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_4__0 ) ) ) ) ) ;
    public final void rule__Music__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalRyml.g:2531:1: ( ( ({...}? => ( ( ( rule__Music__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_4__0 ) ) ) ) ) )
            // InternalRyml.g:2532:3: ( ({...}? => ( ( ( rule__Music__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_4__0 ) ) ) ) )
            {
            // InternalRyml.g:2532:3: ( ({...}? => ( ( ( rule__Music__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Music__Group_4__0 ) ) ) ) )
            int alt22=5;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1) ) {
                alt22=2;
            }
            else if ( LA22_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2) ) {
                alt22=3;
            }
            else if ( LA22_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3) ) {
                alt22=4;
            }
            else if ( LA22_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 4) ) {
                alt22=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalRyml.g:2533:3: ({...}? => ( ( ( rule__Music__Group_0__0 ) ) ) )
                    {
                    // InternalRyml.g:2533:3: ({...}? => ( ( ( rule__Music__Group_0__0 ) ) ) )
                    // InternalRyml.g:2534:4: {...}? => ( ( ( rule__Music__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Music__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalRyml.g:2534:99: ( ( ( rule__Music__Group_0__0 ) ) )
                    // InternalRyml.g:2535:5: ( ( rule__Music__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalRyml.g:2541:5: ( ( rule__Music__Group_0__0 ) )
                    // InternalRyml.g:2542:6: ( rule__Music__Group_0__0 )
                    {
                     before(grammarAccess.getMusicAccess().getGroup_0()); 
                    // InternalRyml.g:2543:6: ( rule__Music__Group_0__0 )
                    // InternalRyml.g:2543:7: rule__Music__Group_0__0
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
                    // InternalRyml.g:2548:3: ({...}? => ( ( ( rule__Music__Group_1__0 ) ) ) )
                    {
                    // InternalRyml.g:2548:3: ({...}? => ( ( ( rule__Music__Group_1__0 ) ) ) )
                    // InternalRyml.g:2549:4: {...}? => ( ( ( rule__Music__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Music__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalRyml.g:2549:99: ( ( ( rule__Music__Group_1__0 ) ) )
                    // InternalRyml.g:2550:5: ( ( rule__Music__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalRyml.g:2556:5: ( ( rule__Music__Group_1__0 ) )
                    // InternalRyml.g:2557:6: ( rule__Music__Group_1__0 )
                    {
                     before(grammarAccess.getMusicAccess().getGroup_1()); 
                    // InternalRyml.g:2558:6: ( rule__Music__Group_1__0 )
                    // InternalRyml.g:2558:7: rule__Music__Group_1__0
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
                    // InternalRyml.g:2563:3: ({...}? => ( ( ( rule__Music__Group_2__0 ) ) ) )
                    {
                    // InternalRyml.g:2563:3: ({...}? => ( ( ( rule__Music__Group_2__0 ) ) ) )
                    // InternalRyml.g:2564:4: {...}? => ( ( ( rule__Music__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Music__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalRyml.g:2564:99: ( ( ( rule__Music__Group_2__0 ) ) )
                    // InternalRyml.g:2565:5: ( ( rule__Music__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalRyml.g:2571:5: ( ( rule__Music__Group_2__0 ) )
                    // InternalRyml.g:2572:6: ( rule__Music__Group_2__0 )
                    {
                     before(grammarAccess.getMusicAccess().getGroup_2()); 
                    // InternalRyml.g:2573:6: ( rule__Music__Group_2__0 )
                    // InternalRyml.g:2573:7: rule__Music__Group_2__0
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
                    // InternalRyml.g:2578:3: ({...}? => ( ( ( rule__Music__Group_3__0 ) ) ) )
                    {
                    // InternalRyml.g:2578:3: ({...}? => ( ( ( rule__Music__Group_3__0 ) ) ) )
                    // InternalRyml.g:2579:4: {...}? => ( ( ( rule__Music__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Music__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalRyml.g:2579:99: ( ( ( rule__Music__Group_3__0 ) ) )
                    // InternalRyml.g:2580:5: ( ( rule__Music__Group_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 3);
                    				

                    					selected = true;
                    				
                    // InternalRyml.g:2586:5: ( ( rule__Music__Group_3__0 ) )
                    // InternalRyml.g:2587:6: ( rule__Music__Group_3__0 )
                    {
                     before(grammarAccess.getMusicAccess().getGroup_3()); 
                    // InternalRyml.g:2588:6: ( rule__Music__Group_3__0 )
                    // InternalRyml.g:2588:7: rule__Music__Group_3__0
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
                case 5 :
                    // InternalRyml.g:2593:3: ({...}? => ( ( ( rule__Music__Group_4__0 ) ) ) )
                    {
                    // InternalRyml.g:2593:3: ({...}? => ( ( ( rule__Music__Group_4__0 ) ) ) )
                    // InternalRyml.g:2594:4: {...}? => ( ( ( rule__Music__Group_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Music__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalRyml.g:2594:99: ( ( ( rule__Music__Group_4__0 ) ) )
                    // InternalRyml.g:2595:5: ( ( rule__Music__Group_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMusicAccess().getUnorderedGroup(), 4);
                    				

                    					selected = true;
                    				
                    // InternalRyml.g:2601:5: ( ( rule__Music__Group_4__0 ) )
                    // InternalRyml.g:2602:6: ( rule__Music__Group_4__0 )
                    {
                     before(grammarAccess.getMusicAccess().getGroup_4()); 
                    // InternalRyml.g:2603:6: ( rule__Music__Group_4__0 )
                    // InternalRyml.g:2603:7: rule__Music__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMusicAccess().getGroup_4()); 

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
    // InternalRyml.g:2616:1: rule__Music__UnorderedGroup__0 : rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__1 )? ;
    public final void rule__Music__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2620:1: ( rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__1 )? )
            // InternalRyml.g:2621:2: rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_24);
            rule__Music__UnorderedGroup__Impl();

            state._fsp--;

            // InternalRyml.g:2622:2: ( rule__Music__UnorderedGroup__1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1) ) {
                alt23=1;
            }
            else if ( LA23_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2) ) {
                alt23=1;
            }
            else if ( LA23_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3) ) {
                alt23=1;
            }
            else if ( LA23_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 4) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRyml.g:2622:2: rule__Music__UnorderedGroup__1
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
    // InternalRyml.g:2628:1: rule__Music__UnorderedGroup__1 : rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__2 )? ;
    public final void rule__Music__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2632:1: ( rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__2 )? )
            // InternalRyml.g:2633:2: rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_24);
            rule__Music__UnorderedGroup__Impl();

            state._fsp--;

            // InternalRyml.g:2634:2: ( rule__Music__UnorderedGroup__2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1) ) {
                alt24=1;
            }
            else if ( LA24_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2) ) {
                alt24=1;
            }
            else if ( LA24_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3) ) {
                alt24=1;
            }
            else if ( LA24_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 4) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRyml.g:2634:2: rule__Music__UnorderedGroup__2
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
    // InternalRyml.g:2640:1: rule__Music__UnorderedGroup__2 : rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__3 )? ;
    public final void rule__Music__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2644:1: ( rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__3 )? )
            // InternalRyml.g:2645:2: rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_24);
            rule__Music__UnorderedGroup__Impl();

            state._fsp--;

            // InternalRyml.g:2646:2: ( rule__Music__UnorderedGroup__3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1) ) {
                alt25=1;
            }
            else if ( LA25_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2) ) {
                alt25=1;
            }
            else if ( LA25_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3) ) {
                alt25=1;
            }
            else if ( LA25_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 4) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRyml.g:2646:2: rule__Music__UnorderedGroup__3
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
    // InternalRyml.g:2652:1: rule__Music__UnorderedGroup__3 : rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__4 )? ;
    public final void rule__Music__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2656:1: ( rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__4 )? )
            // InternalRyml.g:2657:2: rule__Music__UnorderedGroup__Impl ( rule__Music__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_24);
            rule__Music__UnorderedGroup__Impl();

            state._fsp--;

            // InternalRyml.g:2658:2: ( rule__Music__UnorderedGroup__4 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 1) ) {
                alt26=1;
            }
            else if ( LA26_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 2) ) {
                alt26=1;
            }
            else if ( LA26_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 3) ) {
                alt26=1;
            }
            else if ( LA26_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMusicAccess().getUnorderedGroup(), 4) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRyml.g:2658:2: rule__Music__UnorderedGroup__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Music__UnorderedGroup__4();

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
    // $ANTLR end "rule__Music__UnorderedGroup__3"


    // $ANTLR start "rule__Music__UnorderedGroup__4"
    // InternalRyml.g:2664:1: rule__Music__UnorderedGroup__4 : rule__Music__UnorderedGroup__Impl ;
    public final void rule__Music__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2668:1: ( rule__Music__UnorderedGroup__Impl )
            // InternalRyml.g:2669:2: rule__Music__UnorderedGroup__Impl
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
    // $ANTLR end "rule__Music__UnorderedGroup__4"


    // $ANTLR start "rule__Music__NameAssignment_0_1"
    // InternalRyml.g:2676:1: rule__Music__NameAssignment_0_1 : ( ruleEString ) ;
    public final void rule__Music__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2680:1: ( ( ruleEString ) )
            // InternalRyml.g:2681:2: ( ruleEString )
            {
            // InternalRyml.g:2681:2: ( ruleEString )
            // InternalRyml.g:2682:3: ruleEString
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
    // InternalRyml.g:2691:1: rule__Music__TitleAssignment_0_3_1 : ( ruleEString ) ;
    public final void rule__Music__TitleAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2695:1: ( ( ruleEString ) )
            // InternalRyml.g:2696:2: ( ruleEString )
            {
            // InternalRyml.g:2696:2: ( ruleEString )
            // InternalRyml.g:2697:3: ruleEString
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
    // InternalRyml.g:2706:1: rule__Music__AuthorAssignment_0_4_1 : ( ruleEString ) ;
    public final void rule__Music__AuthorAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2710:1: ( ( ruleEString ) )
            // InternalRyml.g:2711:2: ( ruleEString )
            {
            // InternalRyml.g:2711:2: ( ruleEString )
            // InternalRyml.g:2712:3: ruleEString
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
    // InternalRyml.g:2721:1: rule__Music__BpmAssignment_0_5_1 : ( ruleEInt ) ;
    public final void rule__Music__BpmAssignment_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2725:1: ( ( ruleEInt ) )
            // InternalRyml.g:2726:2: ( ruleEInt )
            {
            // InternalRyml.g:2726:2: ( ruleEInt )
            // InternalRyml.g:2727:3: ruleEInt
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
    // InternalRyml.g:2736:1: rule__Music__ResolutionPerSlideAssignment_0_6_1 : ( ruleEInt ) ;
    public final void rule__Music__ResolutionPerSlideAssignment_0_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2740:1: ( ( ruleEInt ) )
            // InternalRyml.g:2741:2: ( ruleEInt )
            {
            // InternalRyml.g:2741:2: ( ruleEInt )
            // InternalRyml.g:2742:3: ruleEInt
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
    // InternalRyml.g:2751:1: rule__Music__OwnedNotesAssignment_0_7_0 : ( ruleNote ) ;
    public final void rule__Music__OwnedNotesAssignment_0_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2755:1: ( ( ruleNote ) )
            // InternalRyml.g:2756:2: ( ruleNote )
            {
            // InternalRyml.g:2756:2: ( ruleNote )
            // InternalRyml.g:2757:3: ruleNote
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
    // InternalRyml.g:2766:1: rule__Music__OwnedNotesAssignment_0_7_1 : ( ruleNote ) ;
    public final void rule__Music__OwnedNotesAssignment_0_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2770:1: ( ( ruleNote ) )
            // InternalRyml.g:2771:2: ( ruleNote )
            {
            // InternalRyml.g:2771:2: ( ruleNote )
            // InternalRyml.g:2772:3: ruleNote
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
    // InternalRyml.g:2781:1: rule__Music__OwnedBeatsAssignment_1_0 : ( ruleBeat ) ;
    public final void rule__Music__OwnedBeatsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2785:1: ( ( ruleBeat ) )
            // InternalRyml.g:2786:2: ( ruleBeat )
            {
            // InternalRyml.g:2786:2: ( ruleBeat )
            // InternalRyml.g:2787:3: ruleBeat
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
    // InternalRyml.g:2796:1: rule__Music__OwnedBeatsAssignment_1_1 : ( ruleBeat ) ;
    public final void rule__Music__OwnedBeatsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2800:1: ( ( ruleBeat ) )
            // InternalRyml.g:2801:2: ( ruleBeat )
            {
            // InternalRyml.g:2801:2: ( ruleBeat )
            // InternalRyml.g:2802:3: ruleBeat
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
    // InternalRyml.g:2811:1: rule__Music__OwnedBarsAssignment_2_0 : ( ruleBar ) ;
    public final void rule__Music__OwnedBarsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2815:1: ( ( ruleBar ) )
            // InternalRyml.g:2816:2: ( ruleBar )
            {
            // InternalRyml.g:2816:2: ( ruleBar )
            // InternalRyml.g:2817:3: ruleBar
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
    // InternalRyml.g:2826:1: rule__Music__OwnedBarsAssignment_2_1 : ( ruleBar ) ;
    public final void rule__Music__OwnedBarsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2830:1: ( ( ruleBar ) )
            // InternalRyml.g:2831:2: ( ruleBar )
            {
            // InternalRyml.g:2831:2: ( ruleBar )
            // InternalRyml.g:2832:3: ruleBar
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


    // $ANTLR start "rule__Music__OwnedPatternsAssignment_3_0"
    // InternalRyml.g:2841:1: rule__Music__OwnedPatternsAssignment_3_0 : ( rulePattern ) ;
    public final void rule__Music__OwnedPatternsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2845:1: ( ( rulePattern ) )
            // InternalRyml.g:2846:2: ( rulePattern )
            {
            // InternalRyml.g:2846:2: ( rulePattern )
            // InternalRyml.g:2847:3: rulePattern
            {
             before(grammarAccess.getMusicAccess().getOwnedPatternsPatternParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedPatternsPatternParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__OwnedPatternsAssignment_3_0"


    // $ANTLR start "rule__Music__OwnedPatternsAssignment_3_1"
    // InternalRyml.g:2856:1: rule__Music__OwnedPatternsAssignment_3_1 : ( rulePattern ) ;
    public final void rule__Music__OwnedPatternsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2860:1: ( ( rulePattern ) )
            // InternalRyml.g:2861:2: ( rulePattern )
            {
            // InternalRyml.g:2861:2: ( rulePattern )
            // InternalRyml.g:2862:3: rulePattern
            {
             before(grammarAccess.getMusicAccess().getOwnedPatternsPatternParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedPatternsPatternParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__OwnedPatternsAssignment_3_1"


    // $ANTLR start "rule__Music__OwnedSectionsAssignment_4_0"
    // InternalRyml.g:2871:1: rule__Music__OwnedSectionsAssignment_4_0 : ( ruleSection ) ;
    public final void rule__Music__OwnedSectionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2875:1: ( ( ruleSection ) )
            // InternalRyml.g:2876:2: ( ruleSection )
            {
            // InternalRyml.g:2876:2: ( ruleSection )
            // InternalRyml.g:2877:3: ruleSection
            {
             before(grammarAccess.getMusicAccess().getOwnedSectionsSectionParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedSectionsSectionParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__OwnedSectionsAssignment_4_0"


    // $ANTLR start "rule__Music__OwnedSectionsAssignment_4_1"
    // InternalRyml.g:2886:1: rule__Music__OwnedSectionsAssignment_4_1 : ( ruleSection ) ;
    public final void rule__Music__OwnedSectionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2890:1: ( ( ruleSection ) )
            // InternalRyml.g:2891:2: ( ruleSection )
            {
            // InternalRyml.g:2891:2: ( ruleSection )
            // InternalRyml.g:2892:3: ruleSection
            {
             before(grammarAccess.getMusicAccess().getOwnedSectionsSectionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getMusicAccess().getOwnedSectionsSectionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Music__OwnedSectionsAssignment_4_1"


    // $ANTLR start "rule__Section__NameAssignment_1"
    // InternalRyml.g:2901:1: rule__Section__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Section__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2905:1: ( ( ruleEString ) )
            // InternalRyml.g:2906:2: ( ruleEString )
            {
            // InternalRyml.g:2906:2: ( ruleEString )
            // InternalRyml.g:2907:3: ruleEString
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
    // InternalRyml.g:2916:1: rule__Section__PatternsAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Section__PatternsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2920:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:2921:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:2921:2: ( ( ruleEString ) )
            // InternalRyml.g:2922:3: ( ruleEString )
            {
             before(grammarAccess.getSectionAccess().getPatternsPatternCrossReference_3_0()); 
            // InternalRyml.g:2923:3: ( ruleEString )
            // InternalRyml.g:2924:4: ruleEString
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
    // InternalRyml.g:2935:1: rule__Section__PatternsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Section__PatternsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2939:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:2940:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:2940:2: ( ( ruleEString ) )
            // InternalRyml.g:2941:3: ( ruleEString )
            {
             before(grammarAccess.getSectionAccess().getPatternsPatternCrossReference_4_1_0()); 
            // InternalRyml.g:2942:3: ( ruleEString )
            // InternalRyml.g:2943:4: ruleEString
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
    // InternalRyml.g:2954:1: rule__Pattern__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2958:1: ( ( ruleEString ) )
            // InternalRyml.g:2959:2: ( ruleEString )
            {
            // InternalRyml.g:2959:2: ( ruleEString )
            // InternalRyml.g:2960:3: ruleEString
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
    // InternalRyml.g:2969:1: rule__Pattern__BarsAssignment_3 : ( ruleBarMultiplier ) ;
    public final void rule__Pattern__BarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2973:1: ( ( ruleBarMultiplier ) )
            // InternalRyml.g:2974:2: ( ruleBarMultiplier )
            {
            // InternalRyml.g:2974:2: ( ruleBarMultiplier )
            // InternalRyml.g:2975:3: ruleBarMultiplier
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
    // InternalRyml.g:2984:1: rule__Pattern__BarsAssignment_4_1 : ( ruleBarMultiplier ) ;
    public final void rule__Pattern__BarsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:2988:1: ( ( ruleBarMultiplier ) )
            // InternalRyml.g:2989:2: ( ruleBarMultiplier )
            {
            // InternalRyml.g:2989:2: ( ruleBarMultiplier )
            // InternalRyml.g:2990:3: ruleBarMultiplier
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


    // $ANTLR start "rule__BarMultiplier__BarAssignment_0"
    // InternalRyml.g:2999:1: rule__BarMultiplier__BarAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__BarMultiplier__BarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3003:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:3004:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:3004:2: ( ( ruleEString ) )
            // InternalRyml.g:3005:3: ( ruleEString )
            {
             before(grammarAccess.getBarMultiplierAccess().getBarBarCrossReference_0_0()); 
            // InternalRyml.g:3006:3: ( ruleEString )
            // InternalRyml.g:3007:4: ruleEString
            {
             before(grammarAccess.getBarMultiplierAccess().getBarBarEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarMultiplierAccess().getBarBarEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBarMultiplierAccess().getBarBarCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarMultiplier__BarAssignment_0"


    // $ANTLR start "rule__BarMultiplier__MultiplierAssignment_1_1"
    // InternalRyml.g:3018:1: rule__BarMultiplier__MultiplierAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__BarMultiplier__MultiplierAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3022:1: ( ( ruleEInt ) )
            // InternalRyml.g:3023:2: ( ruleEInt )
            {
            // InternalRyml.g:3023:2: ( ruleEInt )
            // InternalRyml.g:3024:3: ruleEInt
            {
             before(grammarAccess.getBarMultiplierAccess().getMultiplierEIntParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBarMultiplierAccess().getMultiplierEIntParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarMultiplier__MultiplierAssignment_1_1"


    // $ANTLR start "rule__ClassicalBar__NameAssignment_1"
    // InternalRyml.g:3033:1: rule__ClassicalBar__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ClassicalBar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3037:1: ( ( ruleEString ) )
            // InternalRyml.g:3038:2: ( ruleEString )
            {
            // InternalRyml.g:3038:2: ( ruleEString )
            // InternalRyml.g:3039:3: ruleEString
            {
             before(grammarAccess.getClassicalBarAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassicalBarAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalBar__NameAssignment_1"


    // $ANTLR start "rule__ClassicalBar__BeatsAssignment_3"
    // InternalRyml.g:3048:1: rule__ClassicalBar__BeatsAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ClassicalBar__BeatsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3052:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:3053:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:3053:2: ( ( ruleEString ) )
            // InternalRyml.g:3054:3: ( ruleEString )
            {
             before(grammarAccess.getClassicalBarAccess().getBeatsBeatCrossReference_3_0()); 
            // InternalRyml.g:3055:3: ( ruleEString )
            // InternalRyml.g:3056:4: ruleEString
            {
             before(grammarAccess.getClassicalBarAccess().getBeatsBeatEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassicalBarAccess().getBeatsBeatEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getClassicalBarAccess().getBeatsBeatCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalBar__BeatsAssignment_3"


    // $ANTLR start "rule__ClassicalBar__BeatsAssignment_4_1"
    // InternalRyml.g:3067:1: rule__ClassicalBar__BeatsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__ClassicalBar__BeatsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3071:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:3072:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:3072:2: ( ( ruleEString ) )
            // InternalRyml.g:3073:3: ( ruleEString )
            {
             before(grammarAccess.getClassicalBarAccess().getBeatsBeatCrossReference_4_1_0()); 
            // InternalRyml.g:3074:3: ( ruleEString )
            // InternalRyml.g:3075:4: ruleEString
            {
             before(grammarAccess.getClassicalBarAccess().getBeatsBeatEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassicalBarAccess().getBeatsBeatEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getClassicalBarAccess().getBeatsBeatCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalBar__BeatsAssignment_4_1"


    // $ANTLR start "rule__ModifiedBar__NameAssignment_1"
    // InternalRyml.g:3086:1: rule__ModifiedBar__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ModifiedBar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3090:1: ( ( ruleEString ) )
            // InternalRyml.g:3091:2: ( ruleEString )
            {
            // InternalRyml.g:3091:2: ( ruleEString )
            // InternalRyml.g:3092:3: ruleEString
            {
             before(grammarAccess.getModifiedBarAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModifiedBarAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiedBar__NameAssignment_1"


    // $ANTLR start "rule__ModifiedBar__BarAssignment_3"
    // InternalRyml.g:3101:1: rule__ModifiedBar__BarAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ModifiedBar__BarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3105:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:3106:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:3106:2: ( ( ruleEString ) )
            // InternalRyml.g:3107:3: ( ruleEString )
            {
             before(grammarAccess.getModifiedBarAccess().getBarBarCrossReference_3_0()); 
            // InternalRyml.g:3108:3: ( ruleEString )
            // InternalRyml.g:3109:4: ruleEString
            {
             before(grammarAccess.getModifiedBarAccess().getBarBarEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModifiedBarAccess().getBarBarEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getModifiedBarAccess().getBarBarCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifiedBar__BarAssignment_3"


    // $ANTLR start "rule__Beat__NameAssignment_1"
    // InternalRyml.g:3120:1: rule__Beat__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Beat__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3124:1: ( ( ruleEString ) )
            // InternalRyml.g:3125:2: ( ruleEString )
            {
            // InternalRyml.g:3125:2: ( ruleEString )
            // InternalRyml.g:3126:3: ruleEString
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
    // InternalRyml.g:3135:1: rule__Beat__TotalDivNumberAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Beat__TotalDivNumberAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3139:1: ( ( ruleEInt ) )
            // InternalRyml.g:3140:2: ( ruleEInt )
            {
            // InternalRyml.g:3140:2: ( ruleEInt )
            // InternalRyml.g:3141:3: ruleEInt
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
    // InternalRyml.g:3150:1: rule__Beat__NotesAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Beat__NotesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3154:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:3155:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:3155:2: ( ( ruleEString ) )
            // InternalRyml.g:3156:3: ( ruleEString )
            {
             before(grammarAccess.getBeatAccess().getNotesNoteCrossReference_5_0()); 
            // InternalRyml.g:3157:3: ( ruleEString )
            // InternalRyml.g:3158:4: ruleEString
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
    // InternalRyml.g:3169:1: rule__Beat__NotePositionsAssignment_7 : ( ruleEInt ) ;
    public final void rule__Beat__NotePositionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3173:1: ( ( ruleEInt ) )
            // InternalRyml.g:3174:2: ( ruleEInt )
            {
            // InternalRyml.g:3174:2: ( ruleEInt )
            // InternalRyml.g:3175:3: ruleEInt
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
    // InternalRyml.g:3184:1: rule__Beat__NotesAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__Beat__NotesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3188:1: ( ( ( ruleEString ) ) )
            // InternalRyml.g:3189:2: ( ( ruleEString ) )
            {
            // InternalRyml.g:3189:2: ( ( ruleEString ) )
            // InternalRyml.g:3190:3: ( ruleEString )
            {
             before(grammarAccess.getBeatAccess().getNotesNoteCrossReference_8_1_0()); 
            // InternalRyml.g:3191:3: ( ruleEString )
            // InternalRyml.g:3192:4: ruleEString
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
    // InternalRyml.g:3203:1: rule__Beat__NotePositionsAssignment_8_3 : ( ruleEInt ) ;
    public final void rule__Beat__NotePositionsAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3207:1: ( ( ruleEInt ) )
            // InternalRyml.g:3208:2: ( ruleEInt )
            {
            // InternalRyml.g:3208:2: ( ruleEInt )
            // InternalRyml.g:3209:3: ruleEInt
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
    // InternalRyml.g:3218:1: rule__Note__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Note__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3222:1: ( ( ruleEString ) )
            // InternalRyml.g:3223:2: ( ruleEString )
            {
            // InternalRyml.g:3223:2: ( ruleEString )
            // InternalRyml.g:3224:3: ruleEString
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
    // InternalRyml.g:3233:1: rule__Note__ValueAssignment_3 : ( ruleDrumNoteValue ) ;
    public final void rule__Note__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRyml.g:3237:1: ( ( ruleDrumNoteValue ) )
            // InternalRyml.g:3238:2: ( ruleDrumNoteValue )
            {
            // InternalRyml.g:3238:2: ( ruleDrumNoteValue )
            // InternalRyml.g:3239:3: ruleDrumNoteValue
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


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\1\16\uffff";
    static final String dfa_3s = "\1\26\1\uffff\1\4\2\27\1\44\1\6\1\4\1\6\1\44\2\45\2\6\1\uffff";
    static final String dfa_4s = "\1\43\1\uffff\1\5\2\27\1\46\1\36\1\5\1\6\1\44\2\45\1\36\1\6\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\14\uffff\1\1";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\5\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1\uffff\1\2",
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

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 991:2: ( rule__Music__OwnedBeatsAssignment_1_1 )*";
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\1\12\uffff";
    static final String dfa_10s = "\1\26\1\uffff\1\4\2\27\2\4\4\uffff";
    static final String dfa_11s = "\1\43\1\uffff\1\5\2\42\2\5\4\uffff";
    static final String dfa_12s = "\1\uffff\1\2\5\uffff\4\1";
    static final String dfa_13s = "\13\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\5\uffff\1\1\2\uffff\1\1\1\uffff\1\2\1\uffff\1\1",
            "",
            "\1\3\1\4",
            "\1\6\12\uffff\1\5",
            "\1\6\12\uffff\1\5",
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

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 1045:2: ( rule__Music__OwnedBarsAssignment_2_1 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000800F000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000003FF800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000A90400002L});

}
