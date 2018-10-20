// Generated from Prophecy.g4 by ANTLR 4.2.2
package com.theprophet31337.prophecy.parser.antlr4;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProphecyLexer extends Lexer
{
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			T__31 = 1, T__30 = 2, T__29 = 3, T__28 = 4, T__27 = 5, T__26 = 6, T__25 = 7, T__24 = 8,
			T__23 = 9, T__22 = 10, T__21 = 11, T__20 = 12, T__19 = 13, T__18 = 14, T__17 = 15, T__16 = 16,
			T__15 = 17, T__14 = 18, T__13 = 19, T__12 = 20, T__11 = 21, T__10 = 22, T__9 = 23, T__8 = 24,
			T__7 = 25, T__6 = 26, T__5 = 27, T__4 = 28, T__3 = 29, T__2 = 30, T__1 = 31, T__0 = 32,
			CLASS = 33, EXTENDS = 34, THIS = 35, STATIC = 36, IF = 37, WHILE = 38, ELSE = 39, RETURN = 40,
			TRUE = 41, FALSE = 42, FLOAT = 43, INT = 44, CHAR = 45, BOOL = 46, VOID = 47, ID = 48,
			STRINGLIT = 49, INTLIT = 50, FLOATLIT = 51, CHARLIT = 52, WS = 53, SL_COMMENT = 54,
			ML_COMMENT = 55;
	public static String[] modeNames = {
			"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
			"<INVALID>",
			"']'", "'&'", "','", "'*'", "'-'", "'['", "'('", "'<'", "'--'", "'!='",
			"'<='", "'<<'", "'{'", "'}'", "'++'", "'>>'", "'[]'", "'^'", "')'", "'.'",
			"'+'", "'='", "';'", "'&&'", "'||'", "'>'", "'/'", "'=='", "'~'", "'>='",
			"'|'", "'!'", "'class'", "'extends'", "'this'", "'static'", "'if'", "'while'",
			"'else'", "'return'", "'true'", "'false'", "'float'", "'int'", "'char'",
			"'bool'", "'void'", "ID", "STRINGLIT", "INTLIT", "FLOATLIT", "CHARLIT",
			"WS", "SL_COMMENT", "ML_COMMENT"
	};
	public static final String[] ruleNames = {
			"T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24",
			"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16",
			"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8",
			"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "CLASS",
			"EXTENDS", "THIS", "STATIC", "IF", "WHILE", "ELSE", "RETURN", "TRUE",
			"FALSE", "FLOAT", "INT", "CHAR", "BOOL", "VOID", "ID", "STRINGLIT", "INTLIT",
			"FLOATLIT", "CHARLIT", "WS", "SL_COMMENT", "ML_COMMENT"
	};


	public ProphecyLexer(CharStream input)
	{
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@Override
	public String getGrammarFileName()
	{
		return "Prophecy.g4";
	}

	@Override
	public String[] getTokenNames()
	{
		return tokenNames;
	}

	@Override
	public String[] getRuleNames()
	{
		return ruleNames;
	}

	@Override
	public String getSerializedATN()
	{
		return _serializedATN;
	}

	@Override
	public String[] getModeNames()
	{
		return modeNames;
	}

	@Override
	public ATN getATN()
	{
		return _ATN;
	}

	public static final String _serializedATN =
			"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\29\u015b\b\1\4\2\t" +
					"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
					"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
					"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
					"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
					",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
					"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3" +
					"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f" +
					"\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22" +
					"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30" +
					"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36" +
					"\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3" +
					"#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3" +
					"\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3" +
					"+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3" +
					"/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\7\61\u0112\n\61\f\61\16\61\u0115" +
					"\13\61\3\62\3\62\7\62\u0119\n\62\f\62\16\62\u011c\13\62\3\62\3\62\3\63" +
					"\6\63\u0121\n\63\r\63\16\63\u0122\3\64\5\64\u0126\n\64\3\64\6\64\u0129" +
					"\n\64\r\64\16\64\u012a\3\64\3\64\6\64\u012f\n\64\r\64\16\64\u0130\3\65" +
					"\3\65\3\65\3\65\3\66\6\66\u0138\n\66\r\66\16\66\u0139\3\66\3\66\3\67\3" +
					"\67\3\67\3\67\7\67\u0142\n\67\f\67\16\67\u0145\13\67\3\67\5\67\u0148\n" +
					"\67\3\67\3\67\3\67\3\67\38\38\38\38\78\u0152\n8\f8\168\u0155\138\38\3" +
					"8\38\38\38\3\u0153\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27" +
					"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33" +
					"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63" +
					"e\64g\65i\66k\67m8o9\3\2\t\4\2C\\c|\6\2\62;C\\aac|\5\2\f\f\17\17$$\3\2" +
					"\62;\5\2\f\f\17\17))\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u0164\2\3\3\2\2" +
					"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3" +
					"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2" +
					"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2" +
					"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2" +
					"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3" +
					"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2" +
					"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2" +
					"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3" +
					"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2" +
					"\2\3q\3\2\2\2\5s\3\2\2\2\7u\3\2\2\2\tw\3\2\2\2\13y\3\2\2\2\r{\3\2\2\2" +
					"\17}\3\2\2\2\21\177\3\2\2\2\23\u0081\3\2\2\2\25\u0084\3\2\2\2\27\u0087" +
					"\3\2\2\2\31\u008a\3\2\2\2\33\u008d\3\2\2\2\35\u008f\3\2\2\2\37\u0091\3" +
					"\2\2\2!\u0094\3\2\2\2#\u0097\3\2\2\2%\u009a\3\2\2\2\'\u009c\3\2\2\2)\u009e" +
					"\3\2\2\2+\u00a0\3\2\2\2-\u00a2\3\2\2\2/\u00a4\3\2\2\2\61\u00a6\3\2\2\2" +
					"\63\u00a9\3\2\2\2\65\u00ac\3\2\2\2\67\u00ae\3\2\2\29\u00b0\3\2\2\2;\u00b3" +
					"\3\2\2\2=\u00b5\3\2\2\2?\u00b8\3\2\2\2A\u00ba\3\2\2\2C\u00bc\3\2\2\2E" +
					"\u00c2\3\2\2\2G\u00ca\3\2\2\2I\u00cf\3\2\2\2K\u00d6\3\2\2\2M\u00d9\3\2" +
					"\2\2O\u00df\3\2\2\2Q\u00e4\3\2\2\2S\u00eb\3\2\2\2U\u00f0\3\2\2\2W\u00f6" +
					"\3\2\2\2Y\u00fc\3\2\2\2[\u0100\3\2\2\2]\u0105\3\2\2\2_\u010a\3\2\2\2a" +
					"\u010f\3\2\2\2c\u0116\3\2\2\2e\u0120\3\2\2\2g\u0125\3\2\2\2i\u0132\3\2" +
					"\2\2k\u0137\3\2\2\2m\u013d\3\2\2\2o\u014d\3\2\2\2qr\7_\2\2r\4\3\2\2\2" +
					"st\7(\2\2t\6\3\2\2\2uv\7.\2\2v\b\3\2\2\2wx\7,\2\2x\n\3\2\2\2yz\7/\2\2" +
					"z\f\3\2\2\2{|\7]\2\2|\16\3\2\2\2}~\7*\2\2~\20\3\2\2\2\177\u0080\7>\2\2" +
					"\u0080\22\3\2\2\2\u0081\u0082\7/\2\2\u0082\u0083\7/\2\2\u0083\24\3\2\2" +
					"\2\u0084\u0085\7#\2\2\u0085\u0086\7?\2\2\u0086\26\3\2\2\2\u0087\u0088" +
					"\7>\2\2\u0088\u0089\7?\2\2\u0089\30\3\2\2\2\u008a\u008b\7>\2\2\u008b\u008c" +
					"\7>\2\2\u008c\32\3\2\2\2\u008d\u008e\7}\2\2\u008e\34\3\2\2\2\u008f\u0090" +
					"\7\177\2\2\u0090\36\3\2\2\2\u0091\u0092\7-\2\2\u0092\u0093\7-\2\2\u0093" +
					" \3\2\2\2\u0094\u0095\7@\2\2\u0095\u0096\7@\2\2\u0096\"\3\2\2\2\u0097" +
					"\u0098\7]\2\2\u0098\u0099\7_\2\2\u0099$\3\2\2\2\u009a\u009b\7`\2\2\u009b" +
					"&\3\2\2\2\u009c\u009d\7+\2\2\u009d(\3\2\2\2\u009e\u009f\7\60\2\2\u009f" +
					"*\3\2\2\2\u00a0\u00a1\7-\2\2\u00a1,\3\2\2\2\u00a2\u00a3\7?\2\2\u00a3." +
					"\3\2\2\2\u00a4\u00a5\7=\2\2\u00a5\60\3\2\2\2\u00a6\u00a7\7(\2\2\u00a7" +
					"\u00a8\7(\2\2\u00a8\62\3\2\2\2\u00a9\u00aa\7~\2\2\u00aa\u00ab\7~\2\2\u00ab" +
					"\64\3\2\2\2\u00ac\u00ad\7@\2\2\u00ad\66\3\2\2\2\u00ae\u00af\7\61\2\2\u00af" +
					"8\3\2\2\2\u00b0\u00b1\7?\2\2\u00b1\u00b2\7?\2\2\u00b2:\3\2\2\2\u00b3\u00b4" +
					"\7\u0080\2\2\u00b4<\3\2\2\2\u00b5\u00b6\7@\2\2\u00b6\u00b7\7?\2\2\u00b7" +
					">\3\2\2\2\u00b8\u00b9\7~\2\2\u00b9@\3\2\2\2\u00ba\u00bb\7#\2\2\u00bbB" +
					"\3\2\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7c\2\2\u00bf" +
					"\u00c0\7u\2\2\u00c0\u00c1\7u\2\2\u00c1D\3\2\2\2\u00c2\u00c3\7g\2\2\u00c3" +
					"\u00c4\7z\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7p\2\2" +
					"\u00c7\u00c8\7f\2\2\u00c8\u00c9\7u\2\2\u00c9F\3\2\2\2\u00ca\u00cb\7v\2" +
					"\2\u00cb\u00cc\7j\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7u\2\2\u00ceH\3\2" +
					"\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3" +
					"\7v\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7e\2\2\u00d5J\3\2\2\2\u00d6\u00d7" +
					"\7k\2\2\u00d7\u00d8\7h\2\2\u00d8L\3\2\2\2\u00d9\u00da\7y\2\2\u00da\u00db" +
					"\7j\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7g\2\2\u00de" +
					"N\3\2\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7u\2\2\u00e2" +
					"\u00e3\7g\2\2\u00e3P\3\2\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7g\2\2\u00e6" +
					"\u00e7\7v\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7p\2\2" +
					"\u00eaR\3\2\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7w\2" +
					"\2\u00ee\u00ef\7g\2\2\u00efT\3\2\2\2\u00f0\u00f1\7h\2\2\u00f1\u00f2\7" +
					"c\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f5\7g\2\2\u00f5V" +
					"\3\2\2\2\u00f6\u00f7\7h\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7q\2\2\u00f9" +
					"\u00fa\7c\2\2\u00fa\u00fb\7v\2\2\u00fbX\3\2\2\2\u00fc\u00fd\7k\2\2\u00fd" +
					"\u00fe\7p\2\2\u00fe\u00ff\7v\2\2\u00ffZ\3\2\2\2\u0100\u0101\7e\2\2\u0101" +
					"\u0102\7j\2\2\u0102\u0103\7c\2\2\u0103\u0104\7t\2\2\u0104\\\3\2\2\2\u0105" +
					"\u0106\7d\2\2\u0106\u0107\7q\2\2\u0107\u0108\7q\2\2\u0108\u0109\7n\2\2" +
					"\u0109^\3\2\2\2\u010a\u010b\7x\2\2\u010b\u010c\7q\2\2\u010c\u010d\7k\2" +
					"\2\u010d\u010e\7f\2\2\u010e`\3\2\2\2\u010f\u0113\t\2\2\2\u0110\u0112\t" +
					"\3\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113" +
					"\u0114\3\2\2\2\u0114b\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u011a\7$\2\2\u0117" +
					"\u0119\n\4\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2" +
					"\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d" +
					"\u011e\7$\2\2\u011ed\3\2\2\2\u011f\u0121\t\5\2\2\u0120\u011f\3\2\2\2\u0121" +
					"\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123f\3\2\2\2" +
					"\u0124\u0126\7/\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128" +
					"\3\2\2\2\u0127\u0129\t\5\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a" +
					"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\7\60" +
					"\2\2\u012d\u012f\t\5\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130" +
					"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131h\3\2\2\2\u0132\u0133\7)\2\2\u0133" +
					"\u0134\n\6\2\2\u0134\u0135\7)\2\2\u0135j\3\2\2\2\u0136\u0138\t\7\2\2\u0137" +
					"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2" +
					"\2\2\u013a\u013b\3\2\2\2\u013b\u013c\b\66\2\2\u013cl\3\2\2\2\u013d\u013e" +
					"\7\61\2\2\u013e\u013f\7\61\2\2\u013f\u0143\3\2\2\2\u0140\u0142\n\b\2\2" +
					"\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144" +
					"\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0148\7\17\2\2" +
					"\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a" +
					"\7\f\2\2\u014a\u014b\3\2\2\2\u014b\u014c\b\67\2\2\u014cn\3\2\2\2\u014d" +
					"\u014e\7\61\2\2\u014e\u014f\7,\2\2\u014f\u0153\3\2\2\2\u0150\u0152\13" +
					"\2\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0154\3\2\2\2\u0153" +
					"\u0151\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7," +
					"\2\2\u0157\u0158\7\61\2\2\u0158\u0159\3\2\2\2\u0159\u015a\b8\2\2\u015a" +
					"p\3\2\2\2\r\2\u0113\u011a\u0122\u0125\u012a\u0130\u0139\u0143\u0147\u0153" +
					"\3\b\2\2";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}