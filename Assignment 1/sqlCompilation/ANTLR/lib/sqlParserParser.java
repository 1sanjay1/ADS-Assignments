// Generated from sqlParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sqlParserParser extends Parser {
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
	public static final int
		RULE_var1 = 0, RULE_var2 = 1, RULE_var3 = 2, RULE_identifier = 3, RULE_number_literal = 4, 
		RULE_sqlQuery = 5, RULE_sql_statement = 6, RULE_select_statement = 7, 
		RULE_select_expression = 8, RULE_select_list1 = 9, RULE_from_clause1 = 10, 
		RULE_where_clause = 11, RULE_groupby_clause = 12, RULE_groupby_item = 13, 
		RULE_having_clause = 14, RULE_orderby_clause = 15, RULE_orderby_item = 16, 
		RULE_limit_clause = 17, RULE_offset = 18, RULE_row_count = 19, RULE_select_list = 20, 
		RULE_displayed_column = 21, RULE_table_spec = 22, RULE_column_spec = 23, 
		RULE_alias = 24, RULE_expression = 25, RULE_expr = 26, RULE_boolean_primary = 27, 
		RULE_comparison_operator = 28, RULE_predicate = 29, RULE_bit_expr = 30, 
		RULE_simple_expr = 31, RULE_literal = 32, RULE_delete_statement = 33, 
		RULE_delete_expression = 34, RULE_delete_list1 = 35, RULE_table_name = 36, 
		RULE_update_statement = 37, RULE_update_expression = 38, RULE_update_list1 = 39, 
		RULE_set_clause = 40, RULE_assignment_list = 41, RULE_col_name = 42, RULE_insert_statement = 43, 
		RULE_insert_expression = 44, RULE_insert_list1 = 45, RULE_column_name_list = 46, 
		RULE_value_list = 47, RULE_value_list1 = 48, RULE_value_list_A = 49, RULE_column_list_B = 50, 
		RULE_table_references = 51, RULE_table_reference = 52, RULE_table_factor = 53, 
		RULE_table_subquery = 54, RULE_join_table = 55, RULE_join_table_factor = 56, 
		RULE_join_condition = 57, RULE_conditional_expr = 58;
	public static final String[] ruleNames = {
		"var1", "var2", "var3", "identifier", "number_literal", "sqlQuery", "sql_statement", 
		"select_statement", "select_expression", "select_list1", "from_clause1", 
		"where_clause", "groupby_clause", "groupby_item", "having_clause", "orderby_clause", 
		"orderby_item", "limit_clause", "offset", "row_count", "select_list", 
		"displayed_column", "table_spec", "column_spec", "alias", "expression", 
		"expr", "boolean_primary", "comparison_operator", "predicate", "bit_expr", 
		"simple_expr", "literal", "delete_statement", "delete_expression", "delete_list1", 
		"table_name", "update_statement", "update_expression", "update_list1", 
		"set_clause", "assignment_list", "col_name", "insert_statement", "insert_expression", 
		"insert_list1", "column_name_list", "value_list", "value_list1", "value_list_A", 
		"column_list_B", "table_references", "table_reference", "table_factor", 
		"table_subquery", "join_table", "join_table_factor", "join_condition", 
		"conditional_expr"
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

	@Override
	public String getGrammarFileName() { return "sqlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sqlParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Var1Context extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(sqlParserParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(sqlParserParser.LETTER, i);
		}
		public List<TerminalNode> DOLLER() { return getTokens(sqlParserParser.DOLLER); }
		public TerminalNode DOLLER(int i) {
			return getToken(sqlParserParser.DOLLER, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(sqlParserParser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(sqlParserParser.UNDERSCORE, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(sqlParserParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(sqlParserParser.DIGIT, i);
		}
		public Var1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterVar1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitVar1(this);
		}
	}

	public final Var1Context var1() throws RecognitionException {
		Var1Context _localctx = new Var1Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_var1);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				match(DIGIT);
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(123);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LETTER - 67)) | (1L << (UNDERSCORE - 67)) | (1L << (DOLLER - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					_la = _input.LA(1);
					if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LETTER - 67)) | (1L << (DIGIT - 67)) | (1L << (UNDERSCORE - 67)) | (1L << (DOLLER - 67)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var2Context extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(sqlParserParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(sqlParserParser.LETTER, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(sqlParserParser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(sqlParserParser.UNDERSCORE, i);
		}
		public List<TerminalNode> DOLLER() { return getTokens(sqlParserParser.DOLLER); }
		public TerminalNode DOLLER(int i) {
			return getToken(sqlParserParser.DOLLER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(sqlParserParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(sqlParserParser.DIGIT, i);
		}
		public Var2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterVar2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitVar2(this);
		}
	}

	public final Var2Context var2() throws RecognitionException {
		Var2Context _localctx = new Var2Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_var2);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LETTER - 67)) | (1L << (UNDERSCORE - 67)) | (1L << (DOLLER - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(131);
					_la = _input.LA(1);
					if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LETTER - 67)) | (1L << (DIGIT - 67)) | (1L << (UNDERSCORE - 67)) | (1L << (DOLLER - 67)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var3Context extends ParserRuleContext {
		public List<TerminalNode> TICK() { return getTokens(sqlParserParser.TICK); }
		public TerminalNode TICK(int i) {
			return getToken(sqlParserParser.TICK, i);
		}
		public Var3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterVar3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitVar3(this);
		}
	}

	public final Var3Context var3() throws RecognitionException {
		Var3Context _localctx = new Var3Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_var3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(TICK);
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TICK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << SELECT) | (1L << FROM) | (1L << WHERE) | (1L << DISTINCT) | (1L << ALL) | (1L << ASC) | (1L << DESC) | (1L << LIMIT) | (1L << HAVING) | (1L << GROUP_BY) | (1L << ORDER_BY) | (1L << AS) | (1L << BETWEEN) | (1L << OR) | (1L << AND) | (1L << XOR) | (1L << CURRENT_DATE) | (1L << UPDATE) | (1L << DELETE) | (1L << SET) | (1L << LOW_PRIORITY) | (1L << QUICK) | (1L << IGNORE) | (1L << INSERT) | (1L << INTO) | (1L << DELAYED) | (1L << HIGH_PRIORITY) | (1L << VALUES) | (1L << VALUE) | (1L << INNER) | (1L << CROSS) | (1L << STRAIGHT_JOIN) | (1L << ON) | (1L << JOIN) | (1L << NATURAL) | (1L << LEFT) | (1L << RIGHT) | (1L << OUTER) | (1L << USING) | (1L << NOT) | (1L << NULL) | (1L << DIV) | (1L << MOD) | (1L << EQ) | (1L << LTE) | (1L << GTE) | (1L << GT) | (1L << LT) | (1L << SEMI) | (1L << COLON) | (1L << DOT) | (1L << COMMA) | (1L << ASTERISK) | (1L << RPAREN) | (1L << LPAREN) | (1L << RBRACK) | (1L << LBRACK) | (1L << PLUS) | (1L << MINUS) | (1L << NEGATION) | (1L << BITOR) | (1L << BITAND))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (POWER_OP - 64)) | (1L << (BIT_NOT - 64)) | (1L << (BIT_NOT_EQ - 64)) | (1L << (LETTER - 64)) | (1L << (DIGIT - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (DOLLER - 64)) | (1L << (INTEGER_NUM - 64)) | (1L << (REAL_NUMBER - 64)))) != 0) );
			setState(143);
			match(TICK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public Var1Context var1() {
			return getRuleContext(Var1Context.class,0);
		}
		public Var2Context var2() {
			return getRuleContext(Var2Context.class,0);
		}
		public Var3Context var3() {
			return getRuleContext(Var3Context.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(145);
				var1();
				}
				break;
			case LETTER:
			case UNDERSCORE:
			case DOLLER:
				{
				setState(146);
				var2();
				}
				break;
			case TICK:
				{
				setState(147);
				var3();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_literalContext extends ParserRuleContext {
		public TerminalNode REAL_NUMBER() { return getToken(sqlParserParser.REAL_NUMBER, 0); }
		public TerminalNode INTEGER_NUM() { return getToken(sqlParserParser.INTEGER_NUM, 0); }
		public Number_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterNumber_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitNumber_literal(this);
		}
	}

	public final Number_literalContext number_literal() throws RecognitionException {
		Number_literalContext _localctx = new Number_literalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_number_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(150);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(153);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_NUM || _la==REAL_NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlQueryContext extends ParserRuleContext {
		public Sql_statementContext sql_statement() {
			return getRuleContext(Sql_statementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(sqlParserParser.SEMI, 0); }
		public SqlQueryContext sqlQuery() {
			return getRuleContext(SqlQueryContext.class,0);
		}
		public SqlQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterSqlQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitSqlQuery(this);
		}
	}

	public final SqlQueryContext sqlQuery() throws RecognitionException {
		return sqlQuery(0);
	}

	private SqlQueryContext sqlQuery(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SqlQueryContext _localctx = new SqlQueryContext(_ctx, _parentState);
		SqlQueryContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_sqlQuery, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(156);
			sql_statement();
			setState(157);
			match(SEMI);
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SqlQueryContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sqlQuery);
					setState(159);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(160);
					match(SEMI);
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Sql_statementContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(sqlParserParser.LPAREN, 0); }
		public Sql_statementContext sql_statement() {
			return getRuleContext(Sql_statementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sqlParserParser.RPAREN, 0); }
		public Sql_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterSql_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitSql_statement(this);
		}
	}

	public final Sql_statementContext sql_statement() throws RecognitionException {
		Sql_statementContext _localctx = new Sql_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sql_statement);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				select_statement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				delete_statement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				update_statement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				insert_statement();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				match(LPAREN);
				setState(171);
				sql_statement();
				setState(172);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_statementContext extends ParserRuleContext {
		public Select_expressionContext select_expression() {
			return getRuleContext(Select_expressionContext.class,0);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitSelect_statement(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_select_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			select_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_expressionContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(sqlParserParser.SELECT, 0); }
		public Select_list1Context select_list1() {
			return getRuleContext(Select_list1Context.class,0);
		}
		public TerminalNode ALL() { return getToken(sqlParserParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(sqlParserParser.DISTINCT, 0); }
		public Select_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterSelect_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitSelect_expression(this);
		}
	}

	public final Select_expressionContext select_expression() throws RecognitionException {
		Select_expressionContext _localctx = new Select_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_select_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(SELECT);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(179);
				_la = _input.LA(1);
				if ( !(_la==DISTINCT || _la==ALL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(182);
			select_list1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list1Context extends ParserRuleContext {
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public From_clause1Context from_clause1() {
			return getRuleContext(From_clause1Context.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Select_list1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterSelect_list1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitSelect_list1(this);
		}
	}

	public final Select_list1Context select_list1() throws RecognitionException {
		Select_list1Context _localctx = new Select_list1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_select_list1);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				select_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				select_list();
				setState(189);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FROM:
					{
					setState(186);
					from_clause1();
					}
					break;
				case ORDER_BY:
					{
					setState(187);
					orderby_clause();
					}
					break;
				case LIMIT:
					{
					setState(188);
					limit_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				select_list();
				setState(201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(192);
					from_clause1();
					setState(193);
					orderby_clause();
					}
					break;
				case 2:
					{
					setState(195);
					from_clause1();
					setState(196);
					limit_clause();
					}
					break;
				case 3:
					{
					setState(198);
					orderby_clause();
					setState(199);
					limit_clause();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				select_list();
				setState(204);
				from_clause1();
				setState(205);
				orderby_clause();
				setState(206);
				limit_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clause1Context extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(sqlParserParser.FROM, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Groupby_clauseContext groupby_clause() {
			return getRuleContext(Groupby_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public From_clause1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterFrom_clause1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitFrom_clause1(this);
		}
	}

	public final From_clause1Context from_clause1() throws RecognitionException {
		From_clause1Context _localctx = new From_clause1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_from_clause1);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(FROM);
				setState(211);
				table_references();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(FROM);
				setState(213);
				table_references();
				setState(217);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WHERE:
					{
					setState(214);
					where_clause();
					}
					break;
				case GROUP_BY:
					{
					setState(215);
					groupby_clause();
					}
					break;
				case HAVING:
					{
					setState(216);
					having_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(FROM);
				setState(220);
				table_references();
				setState(230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(221);
					where_clause();
					setState(222);
					groupby_clause();
					}
					break;
				case 2:
					{
					setState(224);
					where_clause();
					setState(225);
					having_clause();
					}
					break;
				case 3:
					{
					setState(227);
					groupby_clause();
					setState(228);
					having_clause();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(FROM);
				setState(233);
				table_references();
				setState(234);
				where_clause();
				setState(235);
				groupby_clause();
				setState(236);
				having_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(sqlParserParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitWhere_clause(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(WHERE);
			setState(241);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_clauseContext extends ParserRuleContext {
		public TerminalNode GROUP_BY() { return getToken(sqlParserParser.GROUP_BY, 0); }
		public List<Groupby_itemContext> groupby_item() {
			return getRuleContexts(Groupby_itemContext.class);
		}
		public Groupby_itemContext groupby_item(int i) {
			return getRuleContext(Groupby_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(sqlParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqlParserParser.COMMA, i);
		}
		public Groupby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterGroupby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitGroupby_clause(this);
		}
	}

	public final Groupby_clauseContext groupby_clause() throws RecognitionException {
		Groupby_clauseContext _localctx = new Groupby_clauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_groupby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(GROUP_BY);
			setState(244);
			groupby_item();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(245);
				match(COMMA);
				setState(246);
				groupby_item();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_itemContext extends ParserRuleContext {
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public TerminalNode INTEGER_NUM() { return getToken(sqlParserParser.INTEGER_NUM, 0); }
		public Groupby_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterGroupby_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitGroupby_item(this);
		}
	}

	public final Groupby_itemContext groupby_item() throws RecognitionException {
		Groupby_itemContext _localctx = new Groupby_itemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_groupby_item);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case DIGIT:
			case UNDERSCORE:
			case DOLLER:
			case TICK:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				column_spec();
				}
				break;
			case INTEGER_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(INTEGER_NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(sqlParserParser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitHaving_clause(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(HAVING);
			setState(257);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_clauseContext extends ParserRuleContext {
		public TerminalNode ORDER_BY() { return getToken(sqlParserParser.ORDER_BY, 0); }
		public List<Orderby_itemContext> orderby_item() {
			return getRuleContexts(Orderby_itemContext.class);
		}
		public Orderby_itemContext orderby_item(int i) {
			return getRuleContext(Orderby_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(sqlParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqlParserParser.COMMA, i);
		}
		public Orderby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterOrderby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitOrderby_clause(this);
		}
	}

	public final Orderby_clauseContext orderby_clause() throws RecognitionException {
		Orderby_clauseContext _localctx = new Orderby_clauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orderby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ORDER_BY);
			setState(260);
			orderby_item();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(261);
				match(COMMA);
				setState(262);
				orderby_item();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_itemContext extends ParserRuleContext {
		public Groupby_itemContext groupby_item() {
			return getRuleContext(Groupby_itemContext.class,0);
		}
		public TerminalNode ASC() { return getToken(sqlParserParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(sqlParserParser.DESC, 0); }
		public Orderby_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterOrderby_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitOrderby_item(this);
		}
	}

	public final Orderby_itemContext orderby_item() throws RecognitionException {
		Orderby_itemContext _localctx = new Orderby_itemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_orderby_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			groupby_item();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(269);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Limit_clauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(sqlParserParser.LIMIT, 0); }
		public Row_countContext row_count() {
			return getRuleContext(Row_countContext.class,0);
		}
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(sqlParserParser.COMMA, 0); }
		public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterLimit_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitLimit_clause(this);
		}
	}

	public final Limit_clauseContext limit_clause() throws RecognitionException {
		Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(LIMIT);
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(273);
				offset();
				setState(274);
				match(COMMA);
				}
				break;
			}
			setState(278);
			row_count();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(sqlParserParser.INTEGER_NUM, 0); }
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitOffset(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_countContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(sqlParserParser.INTEGER_NUM, 0); }
		public Row_countContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_count; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterRow_count(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitRow_count(this);
		}
	}

	public final Row_countContext row_count() throws RecognitionException {
		Row_countContext _localctx = new Row_countContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_row_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(sqlParserParser.ASTERISK, 0); }
		public List<Displayed_columnContext> displayed_column() {
			return getRuleContexts(Displayed_columnContext.class);
		}
		public Displayed_columnContext displayed_column(int i) {
			return getRuleContext(Displayed_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(sqlParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqlParserParser.COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitSelect_list(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case DIGIT:
			case UNDERSCORE:
			case DOLLER:
			case TICK:
				{
				{
				setState(284);
				displayed_column();
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(285);
					match(COMMA);
					setState(286);
					displayed_column();
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ASTERISK:
				{
				setState(292);
				match(ASTERISK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Displayed_columnContext extends ParserRuleContext {
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode DOT() { return getToken(sqlParserParser.DOT, 0); }
		public TerminalNode ASTERISK() { return getToken(sqlParserParser.ASTERISK, 0); }
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Displayed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterDisplayed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitDisplayed_column(this);
		}
	}

	public final Displayed_columnContext displayed_column() throws RecognitionException {
		Displayed_columnContext _localctx = new Displayed_columnContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_displayed_column);
		int _la;
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(295);
				table_spec();
				setState(296);
				match(DOT);
				setState(297);
				match(ASTERISK);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(299);
				column_spec();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LETTER - 67)) | (1L << (DIGIT - 67)) | (1L << (UNDERSCORE - 67)) | (1L << (DOLLER - 67)) | (1L << (TICK - 67)))) != 0)) {
					{
					setState(300);
					alias();
					}
				}

				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_specContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(sqlParserParser.DOT, 0); }
		public Table_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterTable_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitTable_spec(this);
		}
	}

	public final Table_specContext table_spec() throws RecognitionException {
		Table_specContext _localctx = new Table_specContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(305);
				identifier();
				setState(306);
				match(DOT);
				}
				break;
			}
			setState(310);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_specContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Column_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterColumn_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitColumn_spec(this);
		}
	}

	public final Column_specContext column_spec() throws RecognitionException {
		Column_specContext _localctx = new Column_specContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_column_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitAlias(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(sqlParserParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sqlParserParser.RPAREN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(LPAREN);
				setState(318);
				expression();
				setState(319);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(sqlParserParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(sqlParserParser.RPAREN, 0); }
		public TerminalNode BIT_NOT() { return getToken(sqlParserParser.BIT_NOT, 0); }
		public Boolean_primaryContext boolean_primary() {
			return getRuleContext(Boolean_primaryContext.class,0);
		}
		public TerminalNode OR() { return getToken(sqlParserParser.OR, 0); }
		public TerminalNode XOR() { return getToken(sqlParserParser.XOR, 0); }
		public TerminalNode AND() { return getToken(sqlParserParser.AND, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(324);
				match(LPAREN);
				setState(325);
				expr(0);
				setState(326);
				match(RPAREN);
				}
				break;
			case BIT_NOT:
				{
				setState(328);
				match(BIT_NOT);
				setState(329);
				expr(2);
				}
				break;
			case LETTER:
			case DIGIT:
			case UNDERSCORE:
			case DOLLER:
			case TICK:
			case INTEGER_NUM:
			case REAL_NUMBER:
				{
				setState(330);
				boolean_primary(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(342);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(333);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(334);
						match(OR);
						setState(335);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(336);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(337);
						match(XOR);
						setState(338);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(339);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(340);
						match(AND);
						setState(341);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Boolean_primaryContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public Boolean_primaryContext boolean_primary() {
			return getRuleContext(Boolean_primaryContext.class,0);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public Boolean_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterBoolean_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitBoolean_primary(this);
		}
	}

	public final Boolean_primaryContext boolean_primary() throws RecognitionException {
		return boolean_primary(0);
	}

	private Boolean_primaryContext boolean_primary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Boolean_primaryContext _localctx = new Boolean_primaryContext(_ctx, _parentState);
		Boolean_primaryContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_boolean_primary, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(348);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Boolean_primaryContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolean_primary);
					setState(350);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(351);
					comparison_operator();
					setState(352);
					predicate();
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Comparison_operatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(sqlParserParser.EQ, 0); }
		public TerminalNode GTE() { return getToken(sqlParserParser.GTE, 0); }
		public TerminalNode GT() { return getToken(sqlParserParser.GT, 0); }
		public TerminalNode LTE() { return getToken(sqlParserParser.LTE, 0); }
		public TerminalNode LT() { return getToken(sqlParserParser.LT, 0); }
		public TerminalNode BIT_NOT_EQ() { return getToken(sqlParserParser.BIT_NOT_EQ, 0); }
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterComparison_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitComparison_operator(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comparison_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !(((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (EQ - 45)) | (1L << (LTE - 45)) | (1L << (GTE - 45)) | (1L << (GT - 45)) | (1L << (LT - 45)) | (1L << (BIT_NOT_EQ - 45)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(sqlParserParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(sqlParserParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode NOT() { return getToken(sqlParserParser.NOT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_predicate);
		int _la;
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				bit_expr(0);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(362);
					match(NOT);
					}
				}

				setState(365);
				match(BETWEEN);
				setState(366);
				bit_expr(0);
				setState(367);
				match(AND);
				setState(368);
				predicate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				bit_expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_exprContext extends ParserRuleContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public TerminalNode BITOR() { return getToken(sqlParserParser.BITOR, 0); }
		public TerminalNode BITAND() { return getToken(sqlParserParser.BITAND, 0); }
		public TerminalNode PLUS() { return getToken(sqlParserParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(sqlParserParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(sqlParserParser.ASTERISK, 0); }
		public TerminalNode DIV() { return getToken(sqlParserParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(sqlParserParser.MOD, 0); }
		public TerminalNode POWER_OP() { return getToken(sqlParserParser.POWER_OP, 0); }
		public Bit_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterBit_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitBit_expr(this);
		}
	}

	public final Bit_exprContext bit_expr() throws RecognitionException {
		return bit_expr(0);
	}

	private Bit_exprContext bit_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bit_exprContext _localctx = new Bit_exprContext(_ctx, _parentState);
		Bit_exprContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_bit_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(374);
			simple_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(400);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(376);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(377);
						match(BITOR);
						setState(378);
						bit_expr(10);
						}
						break;
					case 2:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(379);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(380);
						match(BITAND);
						setState(381);
						bit_expr(9);
						}
						break;
					case 3:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(382);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(383);
						match(PLUS);
						setState(384);
						bit_expr(8);
						}
						break;
					case 4:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(385);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(386);
						match(MINUS);
						setState(387);
						bit_expr(7);
						}
						break;
					case 5:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(388);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(389);
						match(ASTERISK);
						setState(390);
						bit_expr(6);
						}
						break;
					case 6:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(391);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(392);
						match(DIV);
						setState(393);
						bit_expr(5);
						}
						break;
					case 7:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(394);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(395);
						match(MOD);
						setState(396);
						bit_expr(4);
						}
						break;
					case 8:
						{
						_localctx = new Bit_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bit_expr);
						setState(397);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(398);
						match(POWER_OP);
						setState(399);
						bit_expr(3);
						}
						break;
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Simple_exprContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterSimple_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitSimple_expr(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_simple_expr);
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_NUM:
			case REAL_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				literal();
				}
				break;
			case LETTER:
			case DIGIT:
			case UNDERSCORE:
			case DOLLER:
			case TICK:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(sqlParserParser.INTEGER_NUM, 0); }
		public TerminalNode REAL_NUMBER() { return getToken(sqlParserParser.REAL_NUMBER, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_NUM || _la==REAL_NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_statementContext extends ParserRuleContext {
		public Delete_expressionContext delete_expression() {
			return getRuleContext(Delete_expressionContext.class,0);
		}
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterDelete_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitDelete_statement(this);
		}
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_delete_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			delete_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_expressionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(sqlParserParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(sqlParserParser.FROM, 0); }
		public Delete_list1Context delete_list1() {
			return getRuleContext(Delete_list1Context.class,0);
		}
		public TerminalNode LOW_PRIORITY() { return getToken(sqlParserParser.LOW_PRIORITY, 0); }
		public TerminalNode QUICK() { return getToken(sqlParserParser.QUICK, 0); }
		public TerminalNode IGNORE() { return getToken(sqlParserParser.IGNORE, 0); }
		public Delete_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterDelete_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitDelete_expression(this);
		}
	}

	public final Delete_expressionContext delete_expression() throws RecognitionException {
		Delete_expressionContext _localctx = new Delete_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_delete_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(DELETE);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOW_PRIORITY) | (1L << QUICK) | (1L << IGNORE))) != 0)) {
				{
				setState(414);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOW_PRIORITY) | (1L << QUICK) | (1L << IGNORE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(417);
			match(FROM);
			setState(418);
			delete_list1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_list1Context extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Delete_list1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_list1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterDelete_list1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitDelete_list1(this);
		}
	}

	public final Delete_list1Context delete_list1() throws RecognitionException {
		Delete_list1Context _localctx = new Delete_list1Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_delete_list1);
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				table_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				table_name();
				setState(425);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WHERE:
					{
					setState(422);
					where_clause();
					}
					break;
				case ORDER_BY:
					{
					setState(423);
					orderby_clause();
					}
					break;
				case LIMIT:
					{
					setState(424);
					limit_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				table_name();
				setState(437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(428);
					where_clause();
					setState(429);
					orderby_clause();
					}
					break;
				case 2:
					{
					setState(431);
					where_clause();
					setState(432);
					limit_clause();
					}
					break;
				case 3:
					{
					setState(434);
					orderby_clause();
					setState(435);
					limit_clause();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				table_name();
				setState(440);
				where_clause();
				setState(441);
				orderby_clause();
				setState(442);
				limit_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(sqlParserParser.DOT, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_table_name);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				identifier();
				setState(448);
				match(DOT);
				setState(449);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_statementContext extends ParserRuleContext {
		public Update_expressionContext update_expression() {
			return getRuleContext(Update_expressionContext.class,0);
		}
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterUpdate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitUpdate_statement(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_update_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			update_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_expressionContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(sqlParserParser.UPDATE, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public Update_list1Context update_list1() {
			return getRuleContext(Update_list1Context.class,0);
		}
		public TerminalNode LOW_PRIORITY() { return getToken(sqlParserParser.LOW_PRIORITY, 0); }
		public TerminalNode IGNORE() { return getToken(sqlParserParser.IGNORE, 0); }
		public Update_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterUpdate_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitUpdate_expression(this);
		}
	}

	public final Update_expressionContext update_expression() throws RecognitionException {
		Update_expressionContext _localctx = new Update_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_update_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(UPDATE);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY || _la==IGNORE) {
				{
				setState(456);
				_la = _input.LA(1);
				if ( !(_la==LOW_PRIORITY || _la==IGNORE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(459);
			table_references();
			setState(460);
			update_list1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_list1Context extends ParserRuleContext {
		public Set_clauseContext set_clause() {
			return getRuleContext(Set_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Update_list1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_list1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterUpdate_list1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitUpdate_list1(this);
		}
	}

	public final Update_list1Context update_list1() throws RecognitionException {
		Update_list1Context _localctx = new Update_list1Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_update_list1);
		try {
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				set_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				set_clause();
				setState(467);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WHERE:
					{
					setState(464);
					where_clause();
					}
					break;
				case ORDER_BY:
					{
					setState(465);
					orderby_clause();
					}
					break;
				case LIMIT:
					{
					setState(466);
					limit_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				set_clause();
				setState(479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(470);
					where_clause();
					setState(471);
					orderby_clause();
					}
					break;
				case 2:
					{
					setState(473);
					where_clause();
					setState(474);
					limit_clause();
					}
					break;
				case 3:
					{
					setState(476);
					orderby_clause();
					setState(477);
					limit_clause();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(481);
				set_clause();
				setState(482);
				where_clause();
				setState(483);
				orderby_clause();
				setState(484);
				limit_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_clauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(sqlParserParser.SET, 0); }
		public List<Assignment_listContext> assignment_list() {
			return getRuleContexts(Assignment_listContext.class);
		}
		public Assignment_listContext assignment_list(int i) {
			return getRuleContext(Assignment_listContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(sqlParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqlParserParser.COMMA, i);
		}
		public Set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterSet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitSet_clause(this);
		}
	}

	public final Set_clauseContext set_clause() throws RecognitionException {
		Set_clauseContext _localctx = new Set_clauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_set_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(SET);
			setState(489);
			assignment_list();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(490);
				match(COMMA);
				setState(491);
				assignment_list();
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_listContext extends ParserRuleContext {
		public Col_nameContext col_name() {
			return getRuleContext(Col_nameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(sqlParserParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assignment_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterAssignment_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitAssignment_list(this);
		}
	}

	public final Assignment_listContext assignment_list() throws RecognitionException {
		Assignment_listContext _localctx = new Assignment_listContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_assignment_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			col_name();
			setState(498);
			match(EQ);
			setState(499);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Col_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterCol_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitCol_name(this);
		}
	}

	public final Col_nameContext col_name() throws RecognitionException {
		Col_nameContext _localctx = new Col_nameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_col_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statementContext extends ParserRuleContext {
		public Insert_expressionContext insert_expression() {
			return getRuleContext(Insert_expressionContext.class,0);
		}
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterInsert_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitInsert_statement(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_insert_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			insert_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_expressionContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(sqlParserParser.INSERT, 0); }
		public Insert_list1Context insert_list1() {
			return getRuleContext(Insert_list1Context.class,0);
		}
		public TerminalNode INTO() { return getToken(sqlParserParser.INTO, 0); }
		public TerminalNode LOW_PRIORITY() { return getToken(sqlParserParser.LOW_PRIORITY, 0); }
		public TerminalNode DELAYED() { return getToken(sqlParserParser.DELAYED, 0); }
		public TerminalNode HIGH_PRIORITY() { return getToken(sqlParserParser.HIGH_PRIORITY, 0); }
		public Insert_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterInsert_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitInsert_expression(this);
		}
	}

	public final Insert_expressionContext insert_expression() throws RecognitionException {
		Insert_expressionContext _localctx = new Insert_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_insert_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(INSERT);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOW_PRIORITY) | (1L << DELAYED) | (1L << HIGH_PRIORITY))) != 0)) {
				{
				setState(506);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOW_PRIORITY) | (1L << DELAYED) | (1L << HIGH_PRIORITY))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(509);
				match(INTO);
				}
			}

			setState(512);
			insert_list1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_list1Context extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(sqlParserParser.LPAREN, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sqlParserParser.RPAREN, 0); }
		public Insert_list1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_list1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterInsert_list1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitInsert_list1(this);
		}
	}

	public final Insert_list1Context insert_list1() throws RecognitionException {
		Insert_list1Context _localctx = new Insert_list1Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_insert_list1);
		try {
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				table_name();
				setState(515);
				value_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				table_name();
				setState(518);
				match(LPAREN);
				setState(519);
				column_name_list();
				setState(520);
				match(RPAREN);
				setState(521);
				value_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_name_listContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(sqlParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqlParserParser.COMMA, i);
		}
		public Column_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterColumn_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitColumn_name_list(this);
		}
	}

	public final Column_name_listContext column_name_list() throws RecognitionException {
		Column_name_listContext _localctx = new Column_name_listContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			identifier();
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(526);
				match(COMMA);
				setState(527);
				identifier();
				}
				}
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_listContext extends ParserRuleContext {
		public Value_list1Context value_list1() {
			return getRuleContext(Value_list1Context.class,0);
		}
		public TerminalNode VALUES() { return getToken(sqlParserParser.VALUES, 0); }
		public TerminalNode VALUE() { return getToken(sqlParserParser.VALUE, 0); }
		public Value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterValue_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitValue_list(this);
		}
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_la = _input.LA(1);
			if ( !(_la==VALUES || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(534);
			value_list1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_list1Context extends ParserRuleContext {
		public List<Value_list_AContext> value_list_A() {
			return getRuleContexts(Value_list_AContext.class);
		}
		public Value_list_AContext value_list_A(int i) {
			return getRuleContext(Value_list_AContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(sqlParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqlParserParser.COMMA, i);
		}
		public Value_list1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterValue_list1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitValue_list1(this);
		}
	}

	public final Value_list1Context value_list1() throws RecognitionException {
		Value_list1Context _localctx = new Value_list1Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_value_list1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			value_list_A();
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(537);
				match(COMMA);
				setState(538);
				value_list_A();
				}
				}
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_list_AContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(sqlParserParser.LPAREN, 0); }
		public List<Column_list_BContext> column_list_B() {
			return getRuleContexts(Column_list_BContext.class);
		}
		public Column_list_BContext column_list_B(int i) {
			return getRuleContext(Column_list_BContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(sqlParserParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(sqlParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqlParserParser.COMMA, i);
		}
		public Value_list_AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list_A; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterValue_list_A(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitValue_list_A(this);
		}
	}

	public final Value_list_AContext value_list_A() throws RecognitionException {
		Value_list_AContext _localctx = new Value_list_AContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_value_list_A);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(LPAREN);
			setState(545);
			column_list_B();
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(546);
				match(COMMA);
				setState(547);
				column_list_B();
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(553);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_list_BContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(sqlParserParser.INTEGER_NUM, 0); }
		public TerminalNode REAL_NUMBER() { return getToken(sqlParserParser.REAL_NUMBER, 0); }
		public Column_list_BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list_B; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterColumn_list_B(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitColumn_list_B(this);
		}
	}

	public final Column_list_BContext column_list_B() throws RecognitionException {
		Column_list_BContext _localctx = new Column_list_BContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_column_list_B);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_NUM || _la==REAL_NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_referencesContext extends ParserRuleContext {
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(sqlParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqlParserParser.COMMA, i);
		}
		public Table_referencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_references; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterTable_references(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitTable_references(this);
		}
	}

	public final Table_referencesContext table_references() throws RecognitionException {
		Table_referencesContext _localctx = new Table_referencesContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_table_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			table_reference();
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(558);
				match(COMMA);
				setState(559);
				table_reference();
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_referenceContext extends ParserRuleContext {
		public Table_factorContext table_factor() {
			return getRuleContext(Table_factorContext.class,0);
		}
		public Join_tableContext join_table() {
			return getRuleContext(Join_tableContext.class,0);
		}
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterTable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitTable_reference(this);
		}
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_table_reference);
		try {
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				table_factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				join_table();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factorContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Table_subqueryContext table_subquery() {
			return getRuleContext(Table_subqueryContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(sqlParserParser.LPAREN, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sqlParserParser.RPAREN, 0); }
		public Table_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterTable_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitTable_factor(this);
		}
	}

	public final Table_factorContext table_factor() throws RecognitionException {
		Table_factorContext _localctx = new Table_factorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_table_factor);
		try {
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				table_name();
				setState(572);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(570);
					identifier();
					}
					break;
				case 2:
					{
					setState(571);
					alias();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				table_subquery();
				setState(577);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(575);
					identifier();
					}
					break;
				case 2:
					{
					setState(576);
					alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(579);
				match(LPAREN);
				setState(580);
				table_references();
				setState(581);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_subqueryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(sqlParserParser.LPAREN, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sqlParserParser.RPAREN, 0); }
		public Table_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterTable_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitTable_subquery(this);
		}
	}

	public final Table_subqueryContext table_subquery() throws RecognitionException {
		Table_subqueryContext _localctx = new Table_subqueryContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_table_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(LPAREN);
			setState(586);
			select_statement();
			setState(587);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_tableContext extends ParserRuleContext {
		public List<Table_factorContext> table_factor() {
			return getRuleContexts(Table_factorContext.class);
		}
		public Table_factorContext table_factor(int i) {
			return getRuleContext(Table_factorContext.class,i);
		}
		public Join_table_factorContext join_table_factor() {
			return getRuleContext(Join_table_factorContext.class,0);
		}
		public TerminalNode INNER() { return getToken(sqlParserParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(sqlParserParser.CROSS, 0); }
		public TerminalNode STRAIGHT_JOIN() { return getToken(sqlParserParser.STRAIGHT_JOIN, 0); }
		public TerminalNode ON() { return getToken(sqlParserParser.ON, 0); }
		public Conditional_exprContext conditional_expr() {
			return getRuleContext(Conditional_exprContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(sqlParserParser.JOIN, 0); }
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(sqlParserParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(sqlParserParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(sqlParserParser.OUTER, 0); }
		public TerminalNode NATURAL() { return getToken(sqlParserParser.NATURAL, 0); }
		public Join_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterJoin_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitJoin_table(this);
		}
	}

	public final Join_tableContext join_table() throws RecognitionException {
		Join_tableContext _localctx = new Join_tableContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_join_table);
		int _la;
		try {
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				table_factor();
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INNER) | (1L << CROSS) | (1L << STRAIGHT_JOIN))) != 0)) {
					{
					setState(590);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INNER) | (1L << CROSS) | (1L << STRAIGHT_JOIN))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(593);
				join_table_factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				table_factor();
				setState(596);
				match(STRAIGHT_JOIN);
				setState(597);
				table_factor();
				setState(598);
				match(ON);
				setState(599);
				conditional_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				table_factor();
				setState(608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(602);
					match(LEFT);
					}
					break;
				case 2:
					{
					setState(603);
					match(RIGHT);
					}
					break;
				case 3:
					{
					setState(604);
					match(LEFT);
					setState(605);
					match(OUTER);
					}
					break;
				case 4:
					{
					setState(606);
					match(RIGHT);
					setState(607);
					match(OUTER);
					}
					break;
				}
				setState(610);
				match(JOIN);
				setState(611);
				table_factor();
				setState(612);
				join_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(614);
				table_factor();
				setState(615);
				match(NATURAL);
				setState(616);
				match(JOIN);
				setState(617);
				table_factor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(619);
				table_factor();
				setState(620);
				match(NATURAL);
				setState(627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(621);
					match(LEFT);
					}
					break;
				case 2:
					{
					setState(622);
					match(RIGHT);
					}
					break;
				case 3:
					{
					setState(623);
					match(LEFT);
					setState(624);
					match(OUTER);
					}
					break;
				case 4:
					{
					setState(625);
					match(RIGHT);
					setState(626);
					match(OUTER);
					}
					break;
				}
				setState(629);
				match(JOIN);
				setState(630);
				table_factor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_table_factorContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(sqlParserParser.JOIN, 0); }
		public Table_factorContext table_factor() {
			return getRuleContext(Table_factorContext.class,0);
		}
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public Join_table_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_table_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterJoin_table_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitJoin_table_factor(this);
		}
	}

	public final Join_table_factorContext join_table_factor() throws RecognitionException {
		Join_table_factorContext _localctx = new Join_table_factorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_join_table_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(JOIN);
			setState(635);
			table_factor();
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON || _la==USING) {
				{
				setState(636);
				join_condition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_conditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(sqlParserParser.ON, 0); }
		public Conditional_exprContext conditional_expr() {
			return getRuleContext(Conditional_exprContext.class,0);
		}
		public TerminalNode USING() { return getToken(sqlParserParser.USING, 0); }
		public TerminalNode LPAREN() { return getToken(sqlParserParser.LPAREN, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(sqlParserParser.RPAREN, 0); }
		public Join_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterJoin_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitJoin_condition(this);
		}
	}

	public final Join_conditionContext join_condition() throws RecognitionException {
		Join_conditionContext _localctx = new Join_conditionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_join_condition);
		try {
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				match(ON);
				setState(640);
				conditional_expr();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				match(USING);
				setState(642);
				match(LPAREN);
				setState(643);
				column_name_list();
				setState(644);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_exprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Conditional_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).enterConditional_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlParserListener ) ((sqlParserListener)listener).exitConditional_expr(this);
		}
	}

	public final Conditional_exprContext conditional_expr() throws RecognitionException {
		Conditional_exprContext _localctx = new Conditional_exprContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_conditional_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return sqlQuery_sempred((SqlQueryContext)_localctx, predIndex);
		case 26:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 27:
			return boolean_primary_sempred((Boolean_primaryContext)_localctx, predIndex);
		case 30:
			return bit_expr_sempred((Bit_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sqlQuery_sempred(SqlQueryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean boolean_primary_sempred(Boolean_primaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bit_expr_sempred(Bit_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u028d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\6"+
		"\2z\n\2\r\2\16\2{\3\2\3\2\7\2\u0080\n\2\f\2\16\2\u0083\13\2\3\3\3\3\7"+
		"\3\u0087\n\3\f\3\16\3\u008a\13\3\3\4\3\4\6\4\u008e\n\4\r\4\16\4\u008f"+
		"\3\4\3\4\3\5\3\5\3\5\5\5\u0097\n\5\3\6\5\6\u009a\n\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\7\7\u00a4\n\7\f\7\16\7\u00a7\13\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00b1\n\b\3\t\3\t\3\n\3\n\5\n\u00b7\n\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00c0\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00cc\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d3\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00dc\n\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00e9\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f1\n"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u00fa\n\16\f\16\16\16\u00fd\13"+
		"\16\3\17\3\17\5\17\u0101\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21"+
		"\u010a\n\21\f\21\16\21\u010d\13\21\3\22\3\22\5\22\u0111\n\22\3\23\3\23"+
		"\3\23\3\23\5\23\u0117\n\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\7\26\u0122\n\26\f\26\16\26\u0125\13\26\3\26\5\26\u0128\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0130\n\27\5\27\u0132\n\27\3\30\3\30\3\30\5"+
		"\30\u0137\n\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0144\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u014e\n"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0159\n\34\f\34"+
		"\16\34\u015c\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0165\n\35"+
		"\f\35\16\35\u0168\13\35\3\36\3\36\3\37\3\37\5\37\u016e\n\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0176\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0193\n \f \16 \u0196"+
		"\13 \3!\3!\5!\u019a\n!\3\"\3\"\3#\3#\3$\3$\5$\u01a2\n$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\5%\u01ac\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01b8\n%\3%\3%"+
		"\3%\3%\3%\5%\u01bf\n%\3&\3&\3&\3&\3&\5&\u01c6\n&\3\'\3\'\3(\3(\5(\u01cc"+
		"\n(\3(\3(\3(\3)\3)\3)\3)\3)\5)\u01d6\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\5)\u01e2\n)\3)\3)\3)\3)\3)\5)\u01e9\n)\3*\3*\3*\3*\7*\u01ef\n*\f*\16"+
		"*\u01f2\13*\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\5.\u01fe\n.\3.\5.\u0201\n.\3"+
		".\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u020e\n/\3\60\3\60\3\60\7\60\u0213"+
		"\n\60\f\60\16\60\u0216\13\60\3\61\3\61\3\61\3\62\3\62\3\62\7\62\u021e"+
		"\n\62\f\62\16\62\u0221\13\62\3\63\3\63\3\63\3\63\7\63\u0227\n\63\f\63"+
		"\16\63\u022a\13\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\7\65\u0233\n\65"+
		"\f\65\16\65\u0236\13\65\3\66\3\66\5\66\u023a\n\66\3\67\3\67\3\67\5\67"+
		"\u023f\n\67\3\67\3\67\3\67\5\67\u0244\n\67\3\67\3\67\3\67\3\67\5\67\u024a"+
		"\n\67\38\38\38\38\39\39\59\u0252\n9\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\59\u0263\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\59\u0276\n9\39\39\39\59\u027b\n9\3:\3:\3:\5:\u0280\n:\3;\3;\3;\3"+
		";\3;\3;\3;\5;\u0289\n;\3<\3<\3<\2\6\f\668>=\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\2\17"+
		"\4\2EEGH\3\2EH\3\2II\3\2=>\3\2JK\3\2\7\b\3\2\t\n\4\2/\63DD\3\2\30\32\4"+
		"\2\30\30\32\32\4\2\30\30\35\36\3\2\37 \3\2!#\2\u02b4\2y\3\2\2\2\4\u0084"+
		"\3\2\2\2\6\u008b\3\2\2\2\b\u0096\3\2\2\2\n\u0099\3\2\2\2\f\u009d\3\2\2"+
		"\2\16\u00b0\3\2\2\2\20\u00b2\3\2\2\2\22\u00b4\3\2\2\2\24\u00d2\3\2\2\2"+
		"\26\u00f0\3\2\2\2\30\u00f2\3\2\2\2\32\u00f5\3\2\2\2\34\u0100\3\2\2\2\36"+
		"\u0102\3\2\2\2 \u0105\3\2\2\2\"\u010e\3\2\2\2$\u0112\3\2\2\2&\u011a\3"+
		"\2\2\2(\u011c\3\2\2\2*\u0127\3\2\2\2,\u0131\3\2\2\2.\u0136\3\2\2\2\60"+
		"\u013a\3\2\2\2\62\u013c\3\2\2\2\64\u0143\3\2\2\2\66\u014d\3\2\2\28\u015d"+
		"\3\2\2\2:\u0169\3\2\2\2<\u0175\3\2\2\2>\u0177\3\2\2\2@\u0199\3\2\2\2B"+
		"\u019b\3\2\2\2D\u019d\3\2\2\2F\u019f\3\2\2\2H\u01be\3\2\2\2J\u01c5\3\2"+
		"\2\2L\u01c7\3\2\2\2N\u01c9\3\2\2\2P\u01e8\3\2\2\2R\u01ea\3\2\2\2T\u01f3"+
		"\3\2\2\2V\u01f7\3\2\2\2X\u01f9\3\2\2\2Z\u01fb\3\2\2\2\\\u020d\3\2\2\2"+
		"^\u020f\3\2\2\2`\u0217\3\2\2\2b\u021a\3\2\2\2d\u0222\3\2\2\2f\u022d\3"+
		"\2\2\2h\u022f\3\2\2\2j\u0239\3\2\2\2l\u0249\3\2\2\2n\u024b\3\2\2\2p\u027a"+
		"\3\2\2\2r\u027c\3\2\2\2t\u0288\3\2\2\2v\u028a\3\2\2\2xz\7F\2\2yx\3\2\2"+
		"\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\u0081\t\2\2\2~\u0080\t\3\2"+
		"\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\3\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0088\t\2\2\2\u0085\u0087"+
		"\t\3\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\5\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d\7I\2\2"+
		"\u008c\u008e\n\4\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7I\2\2\u0092"+
		"\7\3\2\2\2\u0093\u0097\5\2\2\2\u0094\u0097\5\4\3\2\u0095\u0097\5\6\4\2"+
		"\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\t\3"+
		"\2\2\2\u0098\u009a\t\5\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\t\6\2\2\u009c\13\3\2\2\2\u009d\u009e\b\7\1"+
		"\2\u009e\u009f\5\16\b\2\u009f\u00a0\7\64\2\2\u00a0\u00a5\3\2\2\2\u00a1"+
		"\u00a2\f\3\2\2\u00a2\u00a4\7\64\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3"+
		"\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\r\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00b1\5\20\t\2\u00a9\u00b1\5D#\2\u00aa\u00b1\5L\'\2\u00ab"+
		"\u00b1\5X-\2\u00ac\u00ad\7:\2\2\u00ad\u00ae\5\16\b\2\u00ae\u00af\79\2"+
		"\2\u00af\u00b1\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b0\u00aa"+
		"\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b1\17\3\2\2\2\u00b2"+
		"\u00b3\5\22\n\2\u00b3\21\3\2\2\2\u00b4\u00b6\7\4\2\2\u00b5\u00b7\t\7\2"+
		"\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9"+
		"\5\24\13\2\u00b9\23\3\2\2\2\u00ba\u00d3\5*\26\2\u00bb\u00bf\5*\26\2\u00bc"+
		"\u00c0\5\26\f\2\u00bd\u00c0\5 \21\2\u00be\u00c0\5$\23\2\u00bf\u00bc\3"+
		"\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00d3\3\2\2\2\u00c1"+
		"\u00cb\5*\26\2\u00c2\u00c3\5\26\f\2\u00c3\u00c4\5 \21\2\u00c4\u00cc\3"+
		"\2\2\2\u00c5\u00c6\5\26\f\2\u00c6\u00c7\5$\23\2\u00c7\u00cc\3\2\2\2\u00c8"+
		"\u00c9\5 \21\2\u00c9\u00ca\5$\23\2\u00ca\u00cc\3\2\2\2\u00cb\u00c2\3\2"+
		"\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc\u00d3\3\2\2\2\u00cd"+
		"\u00ce\5*\26\2\u00ce\u00cf\5\26\f\2\u00cf\u00d0\5 \21\2\u00d0\u00d1\5"+
		"$\23\2\u00d1\u00d3\3\2\2\2\u00d2\u00ba\3\2\2\2\u00d2\u00bb\3\2\2\2\u00d2"+
		"\u00c1\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d3\25\3\2\2\2\u00d4\u00d5\7\5\2"+
		"\2\u00d5\u00f1\5h\65\2\u00d6\u00d7\7\5\2\2\u00d7\u00db\5h\65\2\u00d8\u00dc"+
		"\5\30\r\2\u00d9\u00dc\5\32\16\2\u00da\u00dc\5\36\20\2\u00db\u00d8\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00f1\3\2\2\2\u00dd"+
		"\u00de\7\5\2\2\u00de\u00e8\5h\65\2\u00df\u00e0\5\30\r\2\u00e0\u00e1\5"+
		"\32\16\2\u00e1\u00e9\3\2\2\2\u00e2\u00e3\5\30\r\2\u00e3\u00e4\5\36\20"+
		"\2\u00e4\u00e9\3\2\2\2\u00e5\u00e6\5\32\16\2\u00e6\u00e7\5\36\20\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00df\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e5\3\2"+
		"\2\2\u00e9\u00f1\3\2\2\2\u00ea\u00eb\7\5\2\2\u00eb\u00ec\5h\65\2\u00ec"+
		"\u00ed\5\30\r\2\u00ed\u00ee\5\32\16\2\u00ee\u00ef\5\36\20\2\u00ef\u00f1"+
		"\3\2\2\2\u00f0\u00d4\3\2\2\2\u00f0\u00d6\3\2\2\2\u00f0\u00dd\3\2\2\2\u00f0"+
		"\u00ea\3\2\2\2\u00f1\27\3\2\2\2\u00f2\u00f3\7\6\2\2\u00f3\u00f4\5\64\33"+
		"\2\u00f4\31\3\2\2\2\u00f5\u00f6\7\r\2\2\u00f6\u00fb\5\34\17\2\u00f7\u00f8"+
		"\7\67\2\2\u00f8\u00fa\5\34\17\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2"+
		"\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\33\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe\u0101\5\60\31\2\u00ff\u0101\7J\2\2\u0100\u00fe\3\2\2\2"+
		"\u0100\u00ff\3\2\2\2\u0101\35\3\2\2\2\u0102\u0103\7\f\2\2\u0103\u0104"+
		"\5\64\33\2\u0104\37\3\2\2\2\u0105\u0106\7\16\2\2\u0106\u010b\5\"\22\2"+
		"\u0107\u0108\7\67\2\2\u0108\u010a\5\"\22\2\u0109\u0107\3\2\2\2\u010a\u010d"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c!\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0110\5\34\17\2\u010f\u0111\t\b\2\2\u0110\u010f\3"+
		"\2\2\2\u0110\u0111\3\2\2\2\u0111#\3\2\2\2\u0112\u0116\7\13\2\2\u0113\u0114"+
		"\5&\24\2\u0114\u0115\7\67\2\2\u0115\u0117\3\2\2\2\u0116\u0113\3\2\2\2"+
		"\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\5(\25\2\u0119%\3"+
		"\2\2\2\u011a\u011b\7J\2\2\u011b\'\3\2\2\2\u011c\u011d\7J\2\2\u011d)\3"+
		"\2\2\2\u011e\u0123\5,\27\2\u011f\u0120\7\67\2\2\u0120\u0122\5,\27\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0128\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0128\78\2\2\u0127"+
		"\u011e\3\2\2\2\u0127\u0126\3\2\2\2\u0128+\3\2\2\2\u0129\u012a\5.\30\2"+
		"\u012a\u012b\7\66\2\2\u012b\u012c\78\2\2\u012c\u0132\3\2\2\2\u012d\u012f"+
		"\5\60\31\2\u012e\u0130\5\62\32\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2"+
		"\2\u0130\u0132\3\2\2\2\u0131\u0129\3\2\2\2\u0131\u012d\3\2\2\2\u0132-"+
		"\3\2\2\2\u0133\u0134\5\b\5\2\u0134\u0135\7\66\2\2\u0135\u0137\3\2\2\2"+
		"\u0136\u0133\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139"+
		"\5\b\5\2\u0139/\3\2\2\2\u013a\u013b\5\b\5\2\u013b\61\3\2\2\2\u013c\u013d"+
		"\5\b\5\2\u013d\63\3\2\2\2\u013e\u0144\5\66\34\2\u013f\u0140\7:\2\2\u0140"+
		"\u0141\5\64\33\2\u0141\u0142\79\2\2\u0142\u0144\3\2\2\2\u0143\u013e\3"+
		"\2\2\2\u0143\u013f\3\2\2\2\u0144\65\3\2\2\2\u0145\u0146\b\34\1\2\u0146"+
		"\u0147\7:\2\2\u0147\u0148\5\66\34\2\u0148\u0149\79\2\2\u0149\u014e\3\2"+
		"\2\2\u014a\u014b\7C\2\2\u014b\u014e\5\66\34\4\u014c\u014e\58\35\2\u014d"+
		"\u0145\3\2\2\2\u014d\u014a\3\2\2\2\u014d\u014c\3\2\2\2\u014e\u015a\3\2"+
		"\2\2\u014f\u0150\f\7\2\2\u0150\u0151\7\21\2\2\u0151\u0159\5\66\34\b\u0152"+
		"\u0153\f\6\2\2\u0153\u0154\7\23\2\2\u0154\u0159\5\66\34\7\u0155\u0156"+
		"\f\5\2\2\u0156\u0157\7\22\2\2\u0157\u0159\5\66\34\6\u0158\u014f\3\2\2"+
		"\2\u0158\u0152\3\2\2\2\u0158\u0155\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\67\3\2\2\2\u015c\u015a\3\2\2\2\u015d"+
		"\u015e\b\35\1\2\u015e\u015f\5<\37\2\u015f\u0166\3\2\2\2\u0160\u0161\f"+
		"\4\2\2\u0161\u0162\5:\36\2\u0162\u0163\5<\37\2\u0163\u0165\3\2\2\2\u0164"+
		"\u0160\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u01679\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\t\t\2\2\u016a;\3\2"+
		"\2\2\u016b\u016d\5> \2\u016c\u016e\7+\2\2\u016d\u016c\3\2\2\2\u016d\u016e"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7\20\2\2\u0170\u0171\5> \2\u0171"+
		"\u0172\7\22\2\2\u0172\u0173\5<\37\2\u0173\u0176\3\2\2\2\u0174\u0176\5"+
		"> \2\u0175\u016b\3\2\2\2\u0175\u0174\3\2\2\2\u0176=\3\2\2\2\u0177\u0178"+
		"\b \1\2\u0178\u0179\5@!\2\u0179\u0194\3\2\2\2\u017a\u017b\f\13\2\2\u017b"+
		"\u017c\7@\2\2\u017c\u0193\5> \f\u017d\u017e\f\n\2\2\u017e\u017f\7A\2\2"+
		"\u017f\u0193\5> \13\u0180\u0181\f\t\2\2\u0181\u0182\7=\2\2\u0182\u0193"+
		"\5> \n\u0183\u0184\f\b\2\2\u0184\u0185\7>\2\2\u0185\u0193\5> \t\u0186"+
		"\u0187\f\7\2\2\u0187\u0188\78\2\2\u0188\u0193\5> \b\u0189\u018a\f\6\2"+
		"\2\u018a\u018b\7-\2\2\u018b\u0193\5> \7\u018c\u018d\f\5\2\2\u018d\u018e"+
		"\7.\2\2\u018e\u0193\5> \6\u018f\u0190\f\4\2\2\u0190\u0191\7B\2\2\u0191"+
		"\u0193\5> \5\u0192\u017a\3\2\2\2\u0192\u017d\3\2\2\2\u0192\u0180\3\2\2"+
		"\2\u0192\u0183\3\2\2\2\u0192\u0186\3\2\2\2\u0192\u0189\3\2\2\2\u0192\u018c"+
		"\3\2\2\2\u0192\u018f\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195?\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u019a\5B\"\2\u0198"+
		"\u019a\5\b\5\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019aA\3\2\2\2"+
		"\u019b\u019c\t\6\2\2\u019cC\3\2\2\2\u019d\u019e\5F$\2\u019eE\3\2\2\2\u019f"+
		"\u01a1\7\26\2\2\u01a0\u01a2\t\n\2\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3"+
		"\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\7\5\2\2\u01a4\u01a5\5H%\2\u01a5"+
		"G\3\2\2\2\u01a6\u01bf\5J&\2\u01a7\u01ab\5J&\2\u01a8\u01ac\5\30\r\2\u01a9"+
		"\u01ac\5 \21\2\u01aa\u01ac\5$\23\2\u01ab\u01a8\3\2\2\2\u01ab\u01a9\3\2"+
		"\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01bf\3\2\2\2\u01ad\u01b7\5J&\2\u01ae\u01af"+
		"\5\30\r\2\u01af\u01b0\5 \21\2\u01b0\u01b8\3\2\2\2\u01b1\u01b2\5\30\r\2"+
		"\u01b2\u01b3\5$\23\2\u01b3\u01b8\3\2\2\2\u01b4\u01b5\5 \21\2\u01b5\u01b6"+
		"\5$\23\2\u01b6\u01b8\3\2\2\2\u01b7\u01ae\3\2\2\2\u01b7\u01b1\3\2\2\2\u01b7"+
		"\u01b4\3\2\2\2\u01b8\u01bf\3\2\2\2\u01b9\u01ba\5J&\2\u01ba\u01bb\5\30"+
		"\r\2\u01bb\u01bc\5 \21\2\u01bc\u01bd\5$\23\2\u01bd\u01bf\3\2\2\2\u01be"+
		"\u01a6\3\2\2\2\u01be\u01a7\3\2\2\2\u01be\u01ad\3\2\2\2\u01be\u01b9\3\2"+
		"\2\2\u01bfI\3\2\2\2\u01c0\u01c6\5\b\5\2\u01c1\u01c2\5\b\5\2\u01c2\u01c3"+
		"\7\66\2\2\u01c3\u01c4\5\b\5\2\u01c4\u01c6\3\2\2\2\u01c5\u01c0\3\2\2\2"+
		"\u01c5\u01c1\3\2\2\2\u01c6K\3\2\2\2\u01c7\u01c8\5N(\2\u01c8M\3\2\2\2\u01c9"+
		"\u01cb\7\25\2\2\u01ca\u01cc\t\13\2\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3"+
		"\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\5h\65\2\u01ce\u01cf\5P)\2\u01cf"+
		"O\3\2\2\2\u01d0\u01e9\5R*\2\u01d1\u01d5\5R*\2\u01d2\u01d6\5\30\r\2\u01d3"+
		"\u01d6\5 \21\2\u01d4\u01d6\5$\23\2\u01d5\u01d2\3\2\2\2\u01d5\u01d3\3\2"+
		"\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01e9\3\2\2\2\u01d7\u01e1\5R*\2\u01d8\u01d9"+
		"\5\30\r\2\u01d9\u01da\5 \21\2\u01da\u01e2\3\2\2\2\u01db\u01dc\5\30\r\2"+
		"\u01dc\u01dd\5$\23\2\u01dd\u01e2\3\2\2\2\u01de\u01df\5 \21\2\u01df\u01e0"+
		"\5$\23\2\u01e0\u01e2\3\2\2\2\u01e1\u01d8\3\2\2\2\u01e1\u01db\3\2\2\2\u01e1"+
		"\u01de\3\2\2\2\u01e2\u01e9\3\2\2\2\u01e3\u01e4\5R*\2\u01e4\u01e5\5\30"+
		"\r\2\u01e5\u01e6\5 \21\2\u01e6\u01e7\5$\23\2\u01e7\u01e9\3\2\2\2\u01e8"+
		"\u01d0\3\2\2\2\u01e8\u01d1\3\2\2\2\u01e8\u01d7\3\2\2\2\u01e8\u01e3\3\2"+
		"\2\2\u01e9Q\3\2\2\2\u01ea\u01eb\7\27\2\2\u01eb\u01f0\5T+\2\u01ec\u01ed"+
		"\7\67\2\2\u01ed\u01ef\5T+\2\u01ee\u01ec\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0"+
		"\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1S\3\2\2\2\u01f2\u01f0\3\2\2\2"+
		"\u01f3\u01f4\5V,\2\u01f4\u01f5\7/\2\2\u01f5\u01f6\5\66\34\2\u01f6U\3\2"+
		"\2\2\u01f7\u01f8\5\b\5\2\u01f8W\3\2\2\2\u01f9\u01fa\5Z.\2\u01faY\3\2\2"+
		"\2\u01fb\u01fd\7\33\2\2\u01fc\u01fe\t\f\2\2\u01fd\u01fc\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u0201\7\34\2\2\u0200\u01ff\3"+
		"\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\5\\/\2\u0203"+
		"[\3\2\2\2\u0204\u0205\5J&\2\u0205\u0206\5`\61\2\u0206\u020e\3\2\2\2\u0207"+
		"\u0208\5J&\2\u0208\u0209\7:\2\2\u0209\u020a\5^\60\2\u020a\u020b\79\2\2"+
		"\u020b\u020c\5`\61\2\u020c\u020e\3\2\2\2\u020d\u0204\3\2\2\2\u020d\u0207"+
		"\3\2\2\2\u020e]\3\2\2\2\u020f\u0214\5\b\5\2\u0210\u0211\7\67\2\2\u0211"+
		"\u0213\5\b\5\2\u0212\u0210\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2"+
		"\2\2\u0214\u0215\3\2\2\2\u0215_\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0218"+
		"\t\r\2\2\u0218\u0219\5b\62\2\u0219a\3\2\2\2\u021a\u021f\5d\63\2\u021b"+
		"\u021c\7\67\2\2\u021c\u021e\5d\63\2\u021d\u021b\3\2\2\2\u021e\u0221\3"+
		"\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220c\3\2\2\2\u0221\u021f"+
		"\3\2\2\2\u0222\u0223\7:\2\2\u0223\u0228\5f\64\2\u0224\u0225\7\67\2\2\u0225"+
		"\u0227\5f\64\2\u0226\u0224\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2"+
		"\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b"+
		"\u022c\79\2\2\u022ce\3\2\2\2\u022d\u022e\t\6\2\2\u022eg\3\2\2\2\u022f"+
		"\u0234\5j\66\2\u0230\u0231\7\67\2\2\u0231\u0233\5j\66\2\u0232\u0230\3"+
		"\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"i\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u023a\5l\67\2\u0238\u023a\5p9\2\u0239"+
		"\u0237\3\2\2\2\u0239\u0238\3\2\2\2\u023ak\3\2\2\2\u023b\u023e\5J&\2\u023c"+
		"\u023f\5\b\5\2\u023d\u023f\5\62\32\2\u023e\u023c\3\2\2\2\u023e\u023d\3"+
		"\2\2\2\u023e\u023f\3\2\2\2\u023f\u024a\3\2\2\2\u0240\u0243\5n8\2\u0241"+
		"\u0244\5\b\5\2\u0242\u0244\5\62\32\2\u0243\u0241\3\2\2\2\u0243\u0242\3"+
		"\2\2\2\u0244\u024a\3\2\2\2\u0245\u0246\7:\2\2\u0246\u0247\5h\65\2\u0247"+
		"\u0248\79\2\2\u0248\u024a\3\2\2\2\u0249\u023b\3\2\2\2\u0249\u0240\3\2"+
		"\2\2\u0249\u0245\3\2\2\2\u024am\3\2\2\2\u024b\u024c\7:\2\2\u024c\u024d"+
		"\5\20\t\2\u024d\u024e\79\2\2\u024eo\3\2\2\2\u024f\u0251\5l\67\2\u0250"+
		"\u0252\t\16\2\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3"+
		"\2\2\2\u0253\u0254\5r:\2\u0254\u027b\3\2\2\2\u0255\u0256\5l\67\2\u0256"+
		"\u0257\7#\2\2\u0257\u0258\5l\67\2\u0258\u0259\7$\2\2\u0259\u025a\5v<\2"+
		"\u025a\u027b\3\2\2\2\u025b\u0262\5l\67\2\u025c\u0263\7\'\2\2\u025d\u0263"+
		"\7(\2\2\u025e\u025f\7\'\2\2\u025f\u0263\7)\2\2\u0260\u0261\7(\2\2\u0261"+
		"\u0263\7)\2\2\u0262\u025c\3\2\2\2\u0262\u025d\3\2\2\2\u0262\u025e\3\2"+
		"\2\2\u0262\u0260\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\7%\2\2\u0265"+
		"\u0266\5l\67\2\u0266\u0267\5t;\2\u0267\u027b\3\2\2\2\u0268\u0269\5l\67"+
		"\2\u0269\u026a\7&\2\2\u026a\u026b\7%\2\2\u026b\u026c\5l\67\2\u026c\u027b"+
		"\3\2\2\2\u026d\u026e\5l\67\2\u026e\u0275\7&\2\2\u026f\u0276\7\'\2\2\u0270"+
		"\u0276\7(\2\2\u0271\u0272\7\'\2\2\u0272\u0276\7)\2\2\u0273\u0274\7(\2"+
		"\2\u0274\u0276\7)\2\2\u0275\u026f\3\2\2\2\u0275\u0270\3\2\2\2\u0275\u0271"+
		"\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\7%\2\2\u0278"+
		"\u0279\5l\67\2\u0279\u027b\3\2\2\2\u027a\u024f\3\2\2\2\u027a\u0255\3\2"+
		"\2\2\u027a\u025b\3\2\2\2\u027a\u0268\3\2\2\2\u027a\u026d\3\2\2\2\u027b"+
		"q\3\2\2\2\u027c\u027d\7%\2\2\u027d\u027f\5l\67\2\u027e\u0280\5t;\2\u027f"+
		"\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280s\3\2\2\2\u0281\u0282\7$\2\2\u0282"+
		"\u0289\5v<\2\u0283\u0284\7*\2\2\u0284\u0285\7:\2\2\u0285\u0286\5^\60\2"+
		"\u0286\u0287\79\2\2\u0287\u0289\3\2\2\2\u0288\u0281\3\2\2\2\u0288\u0283"+
		"\3\2\2\2\u0289u\3\2\2\2\u028a\u028b\5\64\33\2\u028bw\3\2\2\2@{\u0081\u0088"+
		"\u008f\u0096\u0099\u00a5\u00b0\u00b6\u00bf\u00cb\u00d2\u00db\u00e8\u00f0"+
		"\u00fb\u0100\u010b\u0110\u0116\u0123\u0127\u012f\u0131\u0136\u0143\u014d"+
		"\u0158\u015a\u0166\u016d\u0175\u0192\u0194\u0199\u01a1\u01ab\u01b7\u01be"+
		"\u01c5\u01cb\u01d5\u01e1\u01e8\u01f0\u01fd\u0200\u020d\u0214\u021f\u0228"+
		"\u0234\u0239\u023e\u0243\u0249\u0251\u0262\u0275\u027a\u027f\u0288";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}