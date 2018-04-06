// Generated from sqlParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sqlParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, SELECT=2, FROM=3, WHERE=4, DISTINCT=5, ALL=6, ASC=7, DESC=8, LIMIT=9, 
		HAVING=10, GROUP_BY=11, ORDER_BY=12, AS=13, BETWEEN=14, OR=15, AND=16, 
		XOR=17, CURRENT_DATE=18, UPDATE=19, DELETE=20, SET=21, LOW_PRIORITY=22, 
		QUICK=23, IGNORE=24, INSERT=25, INTO=26, DELAYED=27, HIGH_PRIORITY=28, 
		VALUES=29, VALUE=30, INNER=31, CROSS=32, STRAIGHT_JOIN=33, ON=34, JOIN=35, 
		NATURAL=36, LEFT=37, RIGHT=38, OUTER=39, USING=40, NOT=41, NULL=42, DIV=43, 
		MOD=44, EQ=45, LTE=46, GTE=47, GT=48, LT=49, SEMI=50, COLON=51, DOT=52, 
		COMMA=53, ASTERISK=54, RPAREN=55, LPAREN=56, RBRACK=57, LBRACK=58, PLUS=59, 
		MINUS=60, NEGATION=61, BITOR=62, BITAND=63, POWER_OP=64, BIT_NOT=65, BIT_NOT_EQ=66, 
		LETTER=67, DIGIT=68, UNDERSCORE=69, DOLLER=70, TICK=71, INTEGER_NUM=72, 
		REAL_NUMBER=73;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "SELECT", "FROM", "WHERE", "DISTINCT", "ALL", "ASC", "DESC", "LIMIT", 
		"HAVING", "GROUP_BY", "ORDER_BY", "AS", "BETWEEN", "OR", "AND", "XOR", 
		"CURRENT_DATE", "UPDATE", "DELETE", "SET", "LOW_PRIORITY", "QUICK", "IGNORE", 
		"INSERT", "INTO", "DELAYED", "HIGH_PRIORITY", "VALUES", "VALUE", "INNER", 
		"CROSS", "STRAIGHT_JOIN", "ON", "JOIN", "NATURAL", "LEFT", "RIGHT", "OUTER", 
		"USING", "NOT", "NULL", "DIV", "MOD", "EQ", "LTE", "GTE", "GT", "LT", 
		"SEMI", "COLON", "DOT", "COMMA", "ASTERISK", "RPAREN", "LPAREN", "RBRACK", 
		"LBRACK", "PLUS", "MINUS", "NEGATION", "BITOR", "BITAND", "POWER_OP", 
		"BIT_NOT", "BIT_NOT_EQ", "LETTER", "DIGIT", "UNDERSCORE", "DOLLER", "TICK", 
		"INTEGER_NUM", "REAL_NUMBER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'='", "'<='", "'>='", 
		"'>'", "'<'", "';'", "':'", "'.'", "','", "'*'", "')'", "'('", "']'", 
		"'['", "'+'", "'-'", "'~'", "'|'", "'&'", "'^'", "'!'", "'!='", null, 
		null, "'_'", "'$'", "'`'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "SELECT", "FROM", "WHERE", "DISTINCT", "ALL", "ASC", "DESC", 
		"LIMIT", "HAVING", "GROUP_BY", "ORDER_BY", "AS", "BETWEEN", "OR", "AND", 
		"XOR", "CURRENT_DATE", "UPDATE", "DELETE", "SET", "LOW_PRIORITY", "QUICK", 
		"IGNORE", "INSERT", "INTO", "DELAYED", "HIGH_PRIORITY", "VALUES", "VALUE", 
		"INNER", "CROSS", "STRAIGHT_JOIN", "ON", "JOIN", "NATURAL", "LEFT", "RIGHT", 
		"OUTER", "USING", "NOT", "NULL", "DIV", "MOD", "EQ", "LTE", "GTE", "GT", 
		"LT", "SEMI", "COLON", "DOT", "COMMA", "ASTERISK", "RPAREN", "LPAREN", 
		"RBRACK", "LBRACK", "PLUS", "MINUS", "NEGATION", "BITOR", "BITAND", "POWER_OP", 
		"BIT_NOT", "BIT_NOT_EQ", "LETTER", "DIGIT", "UNDERSCORE", "DOLLER", "TICK", 
		"INTEGER_NUM", "REAL_NUMBER"
	};
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


	public sqlParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sqlParser.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2K\u0213\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\6\2\u0097\n\2\r\2\16\2\u0098\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\6\f\u00d8\n\f\r\f\16\f\u00d9\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\6\r\u00e5\n\r\r\r\16\r\u00e6\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00ff\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\5,\u01bb\n,\3-\3-\3-\3"+
		"-\5-\u01c1\n-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3"+
		"<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3C\3D\3D\3E\3E\3F\3F\3"+
		"G\3G\3H\3H\3I\6I\u01fd\nI\rI\16I\u01fe\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5"+
		"J\u020b\nJ\3J\3J\5J\u020f\nJ\3J\5J\u0212\nJ\2\2K\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\3\2+"+
		"\5\2\13\f\17\17\"\"\5\2UUuu~~\5\2GGgg~~\5\2NNnn~~\5\2EEee~~\5\2VVvv~~"+
		"\5\2HHhh~~\5\2TTtt~~\5\2QQqq~~\5\2OOoo~~\5\2YYyy~~\5\2JJjj~~\5\2FFff~"+
		"~\5\2KKkk~~\5\2PPpp~~\5\2CCcc~~\5\2XXxx~~\5\2IIii~~\5\2WWww~~\5\2RRrr"+
		"~~\3\2\"\"\5\2DDdd~~\5\2[[{{~~\3\2((\5\2ZZzz~~\3\2aa\5\2SSss~~\5\2MMm"+
		"m~~\3\2xx\3\2cc\3\2nn\3\2ww\3\2gg\3\2uu\5\2LLll~~\4\2pp~~\3\2\61\61\3"+
		"\2\'\'\4\2C\\c|\4\2GGgg\4\2--//\2\u021e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"+
		"\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\3\u0096\3\2\2\2\5\u009c\3\2\2\2\7\u00a3\3\2\2"+
		"\2\t\u00a8\3\2\2\2\13\u00ae\3\2\2\2\r\u00b7\3\2\2\2\17\u00bb\3\2\2\2\21"+
		"\u00bf\3\2\2\2\23\u00c4\3\2\2\2\25\u00ca\3\2\2\2\27\u00d1\3\2\2\2\31\u00de"+
		"\3\2\2\2\33\u00eb\3\2\2\2\35\u00ee\3\2\2\2\37\u00f6\3\2\2\2!\u00fe\3\2"+
		"\2\2#\u0100\3\2\2\2%\u0104\3\2\2\2\'\u0111\3\2\2\2)\u0118\3\2\2\2+\u011f"+
		"\3\2\2\2-\u0123\3\2\2\2/\u0130\3\2\2\2\61\u0136\3\2\2\2\63\u013d\3\2\2"+
		"\2\65\u0144\3\2\2\2\67\u0149\3\2\2\29\u0151\3\2\2\2;\u015f\3\2\2\2=\u0166"+
		"\3\2\2\2?\u016c\3\2\2\2A\u0172\3\2\2\2C\u0178\3\2\2\2E\u0186\3\2\2\2G"+
		"\u0189\3\2\2\2I\u018e\3\2\2\2K\u0196\3\2\2\2M\u019b\3\2\2\2O\u01a1\3\2"+
		"\2\2Q\u01a7\3\2\2\2S\u01ad\3\2\2\2U\u01b1\3\2\2\2W\u01ba\3\2\2\2Y\u01c0"+
		"\3\2\2\2[\u01c2\3\2\2\2]\u01c4\3\2\2\2_\u01c7\3\2\2\2a\u01ca\3\2\2\2c"+
		"\u01cc\3\2\2\2e\u01ce\3\2\2\2g\u01d0\3\2\2\2i\u01d2\3\2\2\2k\u01d4\3\2"+
		"\2\2m\u01d6\3\2\2\2o\u01d8\3\2\2\2q\u01da\3\2\2\2s\u01dc\3\2\2\2u\u01de"+
		"\3\2\2\2w\u01e0\3\2\2\2y\u01e2\3\2\2\2{\u01e4\3\2\2\2}\u01e6\3\2\2\2\177"+
		"\u01e8\3\2\2\2\u0081\u01ea\3\2\2\2\u0083\u01ec\3\2\2\2\u0085\u01ee\3\2"+
		"\2\2\u0087\u01f1\3\2\2\2\u0089\u01f3\3\2\2\2\u008b\u01f5\3\2\2\2\u008d"+
		"\u01f7\3\2\2\2\u008f\u01f9\3\2\2\2\u0091\u01fc\3\2\2\2\u0093\u020a\3\2"+
		"\2\2\u0095\u0097\t\2\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\2"+
		"\2\2\u009b\4\3\2\2\2\u009c\u009d\t\3\2\2\u009d\u009e\t\4\2\2\u009e\u009f"+
		"\t\5\2\2\u009f\u00a0\t\4\2\2\u00a0\u00a1\t\6\2\2\u00a1\u00a2\t\7\2\2\u00a2"+
		"\6\3\2\2\2\u00a3\u00a4\t\b\2\2\u00a4\u00a5\t\t\2\2\u00a5\u00a6\t\n\2\2"+
		"\u00a6\u00a7\t\13\2\2\u00a7\b\3\2\2\2\u00a8\u00a9\t\f\2\2\u00a9\u00aa"+
		"\t\r\2\2\u00aa\u00ab\t\4\2\2\u00ab\u00ac\t\t\2\2\u00ac\u00ad\t\4\2\2\u00ad"+
		"\n\3\2\2\2\u00ae\u00af\t\16\2\2\u00af\u00b0\t\17\2\2\u00b0\u00b1\t\3\2"+
		"\2\u00b1\u00b2\t\7\2\2\u00b2\u00b3\t\17\2\2\u00b3\u00b4\t\20\2\2\u00b4"+
		"\u00b5\t\6\2\2\u00b5\u00b6\t\7\2\2\u00b6\f\3\2\2\2\u00b7\u00b8\t\21\2"+
		"\2\u00b8\u00b9\t\5\2\2\u00b9\u00ba\t\5\2\2\u00ba\16\3\2\2\2\u00bb\u00bc"+
		"\t\21\2\2\u00bc\u00bd\t\3\2\2\u00bd\u00be\t\6\2\2\u00be\20\3\2\2\2\u00bf"+
		"\u00c0\t\16\2\2\u00c0\u00c1\t\4\2\2\u00c1\u00c2\t\3\2\2\u00c2\u00c3\t"+
		"\6\2\2\u00c3\22\3\2\2\2\u00c4\u00c5\t\5\2\2\u00c5\u00c6\t\17\2\2\u00c6"+
		"\u00c7\t\13\2\2\u00c7\u00c8\t\17\2\2\u00c8\u00c9\t\7\2\2\u00c9\24\3\2"+
		"\2\2\u00ca\u00cb\t\r\2\2\u00cb\u00cc\t\21\2\2\u00cc\u00cd\t\22\2\2\u00cd"+
		"\u00ce\t\17\2\2\u00ce\u00cf\t\20\2\2\u00cf\u00d0\t\23\2\2\u00d0\26\3\2"+
		"\2\2\u00d1\u00d2\t\23\2\2\u00d2\u00d3\t\t\2\2\u00d3\u00d4\t\n\2\2\u00d4"+
		"\u00d5\t\24\2\2\u00d5\u00d7\t\25\2\2\u00d6\u00d8\t\26\2\2\u00d7\u00d6"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\t\27\2\2\u00dc\u00dd\t\30\2\2\u00dd\30\3\2"+
		"\2\2\u00de\u00df\t\n\2\2\u00df\u00e0\t\t\2\2\u00e0\u00e1\t\16\2\2\u00e1"+
		"\u00e2\t\4\2\2\u00e2\u00e4\t\t\2\2\u00e3\u00e5\t\26\2\2\u00e4\u00e3\3"+
		"\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\t\27\2\2\u00e9\u00ea\t\30\2\2\u00ea\32\3\2"+
		"\2\2\u00eb\u00ec\t\21\2\2\u00ec\u00ed\t\3\2\2\u00ed\34\3\2\2\2\u00ee\u00ef"+
		"\t\27\2\2\u00ef\u00f0\t\4\2\2\u00f0\u00f1\t\7\2\2\u00f1\u00f2\t\f\2\2"+
		"\u00f2\u00f3\t\4\2\2\u00f3\u00f4\t\4\2\2\u00f4\u00f5\t\20\2\2\u00f5\36"+
		"\3\2\2\2\u00f6\u00f7\t\n\2\2\u00f7\u00f8\t\t\2\2\u00f8 \3\2\2\2\u00f9"+
		"\u00fa\t\21\2\2\u00fa\u00fb\t\20\2\2\u00fb\u00ff\t\16\2\2\u00fc\u00fd"+
		"\t\31\2\2\u00fd\u00ff\t\31\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fc\3\2\2\2"+
		"\u00ff\"\3\2\2\2\u0100\u0101\t\32\2\2\u0101\u0102\t\n\2\2\u0102\u0103"+
		"\t\t\2\2\u0103$\3\2\2\2\u0104\u0105\t\6\2\2\u0105\u0106\t\24\2\2\u0106"+
		"\u0107\t\t\2\2\u0107\u0108\t\t\2\2\u0108\u0109\t\4\2\2\u0109\u010a\t\20"+
		"\2\2\u010a\u010b\t\7\2\2\u010b\u010c\t\33\2\2\u010c\u010d\t\16\2\2\u010d"+
		"\u010e\t\21\2\2\u010e\u010f\t\7\2\2\u010f\u0110\t\4\2\2\u0110&\3\2\2\2"+
		"\u0111\u0112\t\24\2\2\u0112\u0113\t\25\2\2\u0113\u0114\t\16\2\2\u0114"+
		"\u0115\t\21\2\2\u0115\u0116\t\7\2\2\u0116\u0117\t\4\2\2\u0117(\3\2\2\2"+
		"\u0118\u0119\t\16\2\2\u0119\u011a\t\4\2\2\u011a\u011b\t\5\2\2\u011b\u011c"+
		"\t\4\2\2\u011c\u011d\t\7\2\2\u011d\u011e\t\4\2\2\u011e*\3\2\2\2\u011f"+
		"\u0120\t\3\2\2\u0120\u0121\t\4\2\2\u0121\u0122\t\7\2\2\u0122,\3\2\2\2"+
		"\u0123\u0124\t\5\2\2\u0124\u0125\t\n\2\2\u0125\u0126\t\f\2\2\u0126\u0127"+
		"\t\33\2\2\u0127\u0128\t\25\2\2\u0128\u0129\t\t\2\2\u0129\u012a\t\17\2"+
		"\2\u012a\u012b\t\n\2\2\u012b\u012c\t\t\2\2\u012c\u012d\t\17\2\2\u012d"+
		"\u012e\t\7\2\2\u012e\u012f\t\30\2\2\u012f.\3\2\2\2\u0130\u0131\t\34\2"+
		"\2\u0131\u0132\t\24\2\2\u0132\u0133\t\17\2\2\u0133\u0134\t\6\2\2\u0134"+
		"\u0135\t\35\2\2\u0135\60\3\2\2\2\u0136\u0137\t\17\2\2\u0137\u0138\t\23"+
		"\2\2\u0138\u0139\t\20\2\2\u0139\u013a\t\n\2\2\u013a\u013b\t\t\2\2\u013b"+
		"\u013c\t\4\2\2\u013c\62\3\2\2\2\u013d\u013e\t\17\2\2\u013e\u013f\t\20"+
		"\2\2\u013f\u0140\t\3\2\2\u0140\u0141\t\4\2\2\u0141\u0142\t\t\2\2\u0142"+
		"\u0143\t\7\2\2\u0143\64\3\2\2\2\u0144\u0145\t\17\2\2\u0145\u0146\t\20"+
		"\2\2\u0146\u0147\t\7\2\2\u0147\u0148\t\n\2\2\u0148\66\3\2\2\2\u0149\u014a"+
		"\t\16\2\2\u014a\u014b\t\4\2\2\u014b\u014c\t\5\2\2\u014c\u014d\t\21\2\2"+
		"\u014d\u014e\t\30\2\2\u014e\u014f\t\4\2\2\u014f\u0150\t\16\2\2\u01508"+
		"\3\2\2\2\u0151\u0152\t\r\2\2\u0152\u0153\t\17\2\2\u0153\u0154\t\23\2\2"+
		"\u0154\u0155\t\r\2\2\u0155\u0156\t\33\2\2\u0156\u0157\t\25\2\2\u0157\u0158"+
		"\t\t\2\2\u0158\u0159\t\17\2\2\u0159\u015a\t\n\2\2\u015a\u015b\t\t\2\2"+
		"\u015b\u015c\t\17\2\2\u015c\u015d\t\7\2\2\u015d\u015e\t\30\2\2\u015e:"+
		"\3\2\2\2\u015f\u0160\t\36\2\2\u0160\u0161\t\37\2\2\u0161\u0162\t \2\2"+
		"\u0162\u0163\t!\2\2\u0163\u0164\t\"\2\2\u0164\u0165\t#\2\2\u0165<\3\2"+
		"\2\2\u0166\u0167\t\36\2\2\u0167\u0168\t\37\2\2\u0168\u0169\t \2\2\u0169"+
		"\u016a\t!\2\2\u016a\u016b\t\"\2\2\u016b>\3\2\2\2\u016c\u016d\t\17\2\2"+
		"\u016d\u016e\t\20\2\2\u016e\u016f\t\20\2\2\u016f\u0170\t\4\2\2\u0170\u0171"+
		"\t\t\2\2\u0171@\3\2\2\2\u0172\u0173\t\6\2\2\u0173\u0174\t\t\2\2\u0174"+
		"\u0175\t\n\2\2\u0175\u0176\t\3\2\2\u0176\u0177\t\3\2\2\u0177B\3\2\2\2"+
		"\u0178\u0179\t\3\2\2\u0179\u017a\t\7\2\2\u017a\u017b\t\t\2\2\u017b\u017c"+
		"\t\21\2\2\u017c\u017d\t\17\2\2\u017d\u017e\t\23\2\2\u017e\u017f\t\r\2"+
		"\2\u017f\u0180\t\7\2\2\u0180\u0181\t\33\2\2\u0181\u0182\t$\2\2\u0182\u0183"+
		"\t\n\2\2\u0183\u0184\t\17\2\2\u0184\u0185\t\20\2\2\u0185D\3\2\2\2\u0186"+
		"\u0187\t\n\2\2\u0187\u0188\t\20\2\2\u0188F\3\2\2\2\u0189\u018a\t$\2\2"+
		"\u018a\u018b\t\n\2\2\u018b\u018c\t\17\2\2\u018c\u018d\t\20\2\2\u018dH"+
		"\3\2\2\2\u018e\u018f\t\20\2\2\u018f\u0190\t\21\2\2\u0190\u0191\t\7\2\2"+
		"\u0191\u0192\t\24\2\2\u0192\u0193\t\t\2\2\u0193\u0194\t\21\2\2\u0194\u0195"+
		"\t\5\2\2\u0195J\3\2\2\2\u0196\u0197\t\5\2\2\u0197\u0198\t\4\2\2\u0198"+
		"\u0199\t\b\2\2\u0199\u019a\t\7\2\2\u019aL\3\2\2\2\u019b\u019c\t\t\2\2"+
		"\u019c\u019d\t\17\2\2\u019d\u019e\t\23\2\2\u019e\u019f\t\r\2\2\u019f\u01a0"+
		"\t\7\2\2\u01a0N\3\2\2\2\u01a1\u01a2\t\n\2\2\u01a2\u01a3\t\24\2\2\u01a3"+
		"\u01a4\t\7\2\2\u01a4\u01a5\t\4\2\2\u01a5\u01a6\t\t\2\2\u01a6P\3\2\2\2"+
		"\u01a7\u01a8\t\24\2\2\u01a8\u01a9\t\3\2\2\u01a9\u01aa\t\17\2\2\u01aa\u01ab"+
		"\t\20\2\2\u01ab\u01ac\t\23\2\2\u01acR\3\2\2\2\u01ad\u01ae\t\20\2\2\u01ae"+
		"\u01af\t\n\2\2\u01af\u01b0\t\7\2\2\u01b0T\3\2\2\2\u01b1\u01b2\t%\2\2\u01b2"+
		"\u01b3\t\24\2\2\u01b3\u01b4\t\5\2\2\u01b4\u01b5\t\5\2\2\u01b5V\3\2\2\2"+
		"\u01b6\u01b7\t\16\2\2\u01b7\u01b8\t\17\2\2\u01b8\u01bb\t\22\2\2\u01b9"+
		"\u01bb\t&\2\2\u01ba\u01b6\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bbX\3\2\2\2\u01bc"+
		"\u01bd\t\13\2\2\u01bd\u01be\t\n\2\2\u01be\u01c1\t\16\2\2\u01bf\u01c1\t"+
		"\'\2\2\u01c0\u01bc\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1Z\3\2\2\2\u01c2\u01c3"+
		"\7?\2\2\u01c3\\\3\2\2\2\u01c4\u01c5\7>\2\2\u01c5\u01c6\7?\2\2\u01c6^\3"+
		"\2\2\2\u01c7\u01c8\7@\2\2\u01c8\u01c9\7?\2\2\u01c9`\3\2\2\2\u01ca\u01cb"+
		"\7@\2\2\u01cbb\3\2\2\2\u01cc\u01cd\7>\2\2\u01cdd\3\2\2\2\u01ce\u01cf\7"+
		"=\2\2\u01cff\3\2\2\2\u01d0\u01d1\7<\2\2\u01d1h\3\2\2\2\u01d2\u01d3\7\60"+
		"\2\2\u01d3j\3\2\2\2\u01d4\u01d5\7.\2\2\u01d5l\3\2\2\2\u01d6\u01d7\7,\2"+
		"\2\u01d7n\3\2\2\2\u01d8\u01d9\7+\2\2\u01d9p\3\2\2\2\u01da\u01db\7*\2\2"+
		"\u01dbr\3\2\2\2\u01dc\u01dd\7_\2\2\u01ddt\3\2\2\2\u01de\u01df\7]\2\2\u01df"+
		"v\3\2\2\2\u01e0\u01e1\7-\2\2\u01e1x\3\2\2\2\u01e2\u01e3\7/\2\2\u01e3z"+
		"\3\2\2\2\u01e4\u01e5\7\u0080\2\2\u01e5|\3\2\2\2\u01e6\u01e7\7~\2\2\u01e7"+
		"~\3\2\2\2\u01e8\u01e9\7(\2\2\u01e9\u0080\3\2\2\2\u01ea\u01eb\7`\2\2\u01eb"+
		"\u0082\3\2\2\2\u01ec\u01ed\7#\2\2\u01ed\u0084\3\2\2\2\u01ee\u01ef\7#\2"+
		"\2\u01ef\u01f0\7?\2\2\u01f0\u0086\3\2\2\2\u01f1\u01f2\t(\2\2\u01f2\u0088"+
		"\3\2\2\2\u01f3\u01f4\4\62;\2\u01f4\u008a\3\2\2\2\u01f5\u01f6\7a\2\2\u01f6"+
		"\u008c\3\2\2\2\u01f7\u01f8\7&\2\2\u01f8\u008e\3\2\2\2\u01f9\u01fa\7b\2"+
		"\2\u01fa\u0090\3\2\2\2\u01fb\u01fd\5\u0089E\2\u01fc\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0092\3\2"+
		"\2\2\u0200\u0201\5\u0091I\2\u0201\u0202\7\60\2\2\u0202\u0203\5\u0091I"+
		"\2\u0203\u020b\3\2\2\2\u0204\u0205\5\u0091I\2\u0205\u0206\7\60\2\2\u0206"+
		"\u020b\3\2\2\2\u0207\u0208\7\60\2\2\u0208\u020b\5\u0091I\2\u0209\u020b"+
		"\5\u0091I\2\u020a\u0200\3\2\2\2\u020a\u0204\3\2\2\2\u020a\u0207\3\2\2"+
		"\2\u020a\u0209\3\2\2\2\u020b\u0211\3\2\2\2\u020c\u020e\t)\2\2\u020d\u020f"+
		"\t*\2\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u0212\5\u0091I\2\u0211\u020c\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0094"+
		"\3\2\2\2\r\2\u0098\u00d9\u00e6\u00fe\u01ba\u01c0\u01fe\u020a\u020e\u0211"+
		"\3\3\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}