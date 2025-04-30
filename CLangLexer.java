// Generated from CLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, TYPE=11, ID=12, INT=13, WS=14, MUL=15, DIV=16, ADD=17, SUB=18, 
		LT=19, LEQ=20, GT=21, GEQ=22, EQ=23, NEQ=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "TYPE", "ID", "INT", "WS", "MUL", "DIV", "ADD", "SUB", "LT", 
			"LEQ", "GT", "GEQ", "EQ", "NEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'print'", "'('", "')'", "'{'", "'}'", "'if'", "'else'", 
			"'while'", "'int'", null, null, null, "'*'", "'/'", "'+'", "'-'", "'<'", 
			"'<='", "'>'", "'>='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "TYPE", 
			"ID", "INT", "WS", "MUL", "DIV", "ADD", "SUB", "LT", "LEQ", "GT", "GEQ", 
			"EQ", "NEQ"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0018\u0080\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000bX\b\u000b\n\u000b\f\u000b"+
		"[\t\u000b\u0001\f\u0004\f^\b\f\u000b\f\f\f_\u0001\r\u0004\rc\b\r\u000b"+
		"\r\f\rd\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000\u0004\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u0082"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u00033\u0001\u0000"+
		"\u0000\u0000\u00055\u0001\u0000\u0000\u0000\u0007;\u0001\u0000\u0000\u0000"+
		"\t=\u0001\u0000\u0000\u0000\u000b?\u0001\u0000\u0000\u0000\rA\u0001\u0000"+
		"\u0000\u0000\u000fC\u0001\u0000\u0000\u0000\u0011F\u0001\u0000\u0000\u0000"+
		"\u0013K\u0001\u0000\u0000\u0000\u0015Q\u0001\u0000\u0000\u0000\u0017U"+
		"\u0001\u0000\u0000\u0000\u0019]\u0001\u0000\u0000\u0000\u001bb\u0001\u0000"+
		"\u0000\u0000\u001dh\u0001\u0000\u0000\u0000\u001fj\u0001\u0000\u0000\u0000"+
		"!l\u0001\u0000\u0000\u0000#n\u0001\u0000\u0000\u0000%p\u0001\u0000\u0000"+
		"\u0000\'r\u0001\u0000\u0000\u0000)u\u0001\u0000\u0000\u0000+w\u0001\u0000"+
		"\u0000\u0000-z\u0001\u0000\u0000\u0000/}\u0001\u0000\u0000\u000012\u0005"+
		"=\u0000\u00002\u0002\u0001\u0000\u0000\u000034\u0005;\u0000\u00004\u0004"+
		"\u0001\u0000\u0000\u000056\u0005p\u0000\u000067\u0005r\u0000\u000078\u0005"+
		"i\u0000\u000089\u0005n\u0000\u00009:\u0005t\u0000\u0000:\u0006\u0001\u0000"+
		"\u0000\u0000;<\u0005(\u0000\u0000<\b\u0001\u0000\u0000\u0000=>\u0005)"+
		"\u0000\u0000>\n\u0001\u0000\u0000\u0000?@\u0005{\u0000\u0000@\f\u0001"+
		"\u0000\u0000\u0000AB\u0005}\u0000\u0000B\u000e\u0001\u0000\u0000\u0000"+
		"CD\u0005i\u0000\u0000DE\u0005f\u0000\u0000E\u0010\u0001\u0000\u0000\u0000"+
		"FG\u0005e\u0000\u0000GH\u0005l\u0000\u0000HI\u0005s\u0000\u0000IJ\u0005"+
		"e\u0000\u0000J\u0012\u0001\u0000\u0000\u0000KL\u0005w\u0000\u0000LM\u0005"+
		"h\u0000\u0000MN\u0005i\u0000\u0000NO\u0005l\u0000\u0000OP\u0005e\u0000"+
		"\u0000P\u0014\u0001\u0000\u0000\u0000QR\u0005i\u0000\u0000RS\u0005n\u0000"+
		"\u0000ST\u0005t\u0000\u0000T\u0016\u0001\u0000\u0000\u0000UY\u0007\u0000"+
		"\u0000\u0000VX\u0007\u0001\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z\u0018\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\^\u0007\u0002"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u001a\u0001\u0000\u0000"+
		"\u0000ac\u0007\u0003\u0000\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fg\u0006\r\u0000\u0000g\u001c\u0001\u0000\u0000\u0000"+
		"hi\u0005*\u0000\u0000i\u001e\u0001\u0000\u0000\u0000jk\u0005/\u0000\u0000"+
		"k \u0001\u0000\u0000\u0000lm\u0005+\u0000\u0000m\"\u0001\u0000\u0000\u0000"+
		"no\u0005-\u0000\u0000o$\u0001\u0000\u0000\u0000pq\u0005<\u0000\u0000q"+
		"&\u0001\u0000\u0000\u0000rs\u0005<\u0000\u0000st\u0005=\u0000\u0000t("+
		"\u0001\u0000\u0000\u0000uv\u0005>\u0000\u0000v*\u0001\u0000\u0000\u0000"+
		"wx\u0005>\u0000\u0000xy\u0005=\u0000\u0000y,\u0001\u0000\u0000\u0000z"+
		"{\u0005=\u0000\u0000{|\u0005=\u0000\u0000|.\u0001\u0000\u0000\u0000}~"+
		"\u0005!\u0000\u0000~\u007f\u0005=\u0000\u0000\u007f0\u0001\u0000\u0000"+
		"\u0000\u0004\u0000Y_d\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}