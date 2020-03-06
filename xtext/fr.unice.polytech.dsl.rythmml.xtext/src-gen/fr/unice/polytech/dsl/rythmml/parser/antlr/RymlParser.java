/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.dsl.rythmml.parser.antlr;

import com.google.inject.Inject;
import fr.unice.polytech.dsl.rythmml.parser.antlr.internal.InternalRymlParser;
import fr.unice.polytech.dsl.rythmml.services.RymlGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class RymlParser extends AbstractAntlrParser {

	@Inject
	private RymlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRymlParser createParser(XtextTokenStream stream) {
		return new InternalRymlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Music";
	}

	public RymlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RymlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}