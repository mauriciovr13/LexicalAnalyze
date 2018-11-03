// Generated from C:/Users/Maur�cio Vieira/IdeaProjects/Compiler/src/JLexer\JLexer.g4 by ANTLR 4.7
package JLexer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DECIMAL_NUMBER=1, OCTAL_NUMBER=2, HEX_NUMBER=3, FLOAT_NUMBER=4, DOUBLE_NUMBER=5, 
		CHARACTER=6, STRING=7, ESPACE=8, COMMENT=9, BLOCK_COMMENT=10, NumberID=11, 
		HashtagID=12, CifraoID=13, ABSTRACT=14, BOOLEAN=15, BREAK=16, BYTE=17, 
		CASE=18, CATCH=19, CHAR=20, CLASS=21, CONST=22, CONTINUE=23, DEFAULT=24, 
		DO=25, DOUBLE=26, ELSE=27, ENUM=28, EXTENDS=29, FINAL=30, FINALLY=31, 
		FLOAT=32, FOR=33, IF=34, GOTO=35, IMPLEMENTS=36, IMPORT=37, INSTANCEOF=38, 
		INT=39, INTERFACE=40, LONG=41, NATIVE=42, NEW=43, PACKAGE=44, PRIVATE=45, 
		PROTECTED=46, PUBLIC=47, RETURN=48, SHORT=49, STATIC=50, STRICTFP=51, 
		SUPER=52, SWITCH=53, SYNCHRONIZED=54, THIS=55, THROW=56, THROWS=57, TRANSIENT=58, 
		TRY=59, VOID=60, VOLATILE=61, WHILE=62, STRING_TYPE=63, ASSIGNMENT_OPERATOR=64, 
		CONDITIONAL_OR=65, CONDITIONAL_AND=66, INCLUSIVE_OR=67, EXCLUSIVE_OR=68, 
		AND_EXPRESSION=69, EQUALITY=70, NOT_EQUALITY=71, RELATIONAL=72, SHIFT=73, 
		OPERATOR=74, DECREMENT=75, INCREMENT=76, UNARY_EXPRESSION=77, DIM_O=78, 
		DIM_C=79, CB_O=80, CB_C=81, BRACE_O=82, BRACE_C=83, DOT=84, DOT_C=85, 
		SYMBOL=86, ID=87;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LETTER", "NON_ZERO_DIGIT", "DIGIT", "OCTAL_DIGIT", "HEX_DIGIT", "EscapeSequence", 
		"DECIMAL_NUMBER", "OCTAL_NUMBER", "HEX_NUMBER", "FLOAT_NUMBER", "DOUBLE_NUMBER", 
		"CHARACTER", "STRING", "ESPACE", "COMMENT", "BLOCK_COMMENT", "NumberID", 
		"HashtagID", "CifraoID", "ABSTRACT", "BOOLEAN", "BREAK", "BYTE", "CASE", 
		"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
		"ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
		"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
		"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
		"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
		"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "STRING_TYPE", 
		"ASSIGNMENT_OPERATOR", "CONDITIONAL_OR", "CONDITIONAL_AND", "INCLUSIVE_OR", 
		"EXCLUSIVE_OR", "AND_EXPRESSION", "EQUALITY", "NOT_EQUALITY", "RELATIONAL", 
		"SHIFT", "OPERATOR", "DECREMENT", "INCREMENT", "UNARY_EXPRESSION", "DIM_O", 
		"DIM_C", "CB_O", "CB_C", "BRACE_O", "BRACE_C", "DOT", "DOT_C", "SYMBOL", 
		"ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'abstract'", "'boolean'", "'break'", "'byte'", "'case'", 
		"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'String'", 
		null, "'||'", "'&&'", "'|'", "'^'", "'&'", "'=='", "'!='", null, null, 
		null, "'--'", "'++'", null, "'['", "']'", "'{'", "'}'", "'('", "')'", 
		"'.'", "';'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DECIMAL_NUMBER", "OCTAL_NUMBER", "HEX_NUMBER", "FLOAT_NUMBER", 
		"DOUBLE_NUMBER", "CHARACTER", "STRING", "ESPACE", "COMMENT", "BLOCK_COMMENT", 
		"NumberID", "HashtagID", "CifraoID", "ABSTRACT", "BOOLEAN", "BREAK", "BYTE", 
		"CASE", "CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", 
		"DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", 
		"IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", 
		"LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", 
		"RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", 
		"THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", 
		"STRING_TYPE", "ASSIGNMENT_OPERATOR", "CONDITIONAL_OR", "CONDITIONAL_AND", 
		"INCLUSIVE_OR", "EXCLUSIVE_OR", "AND_EXPRESSION", "EQUALITY", "NOT_EQUALITY", 
		"RELATIONAL", "SHIFT", "OPERATOR", "DECREMENT", "INCREMENT", "UNARY_EXPRESSION", 
		"DIM_O", "DIM_C", "CB_O", "CB_C", "BRACE_O", "BRACE_C", "DOT", "DOT_C", 
		"SYMBOL", "ID"
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


	public JLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Y\u0349\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d8\n\7\3\b\3\b\5\b\u00dc\n\b\3\b\3\b"+
		"\7\b\u00e0\n\b\f\b\16\b\u00e3\13\b\3\b\5\b\u00e6\n\b\5\b\u00e8\n\b\3\t"+
		"\3\t\7\t\u00ec\n\t\f\t\16\t\u00ef\13\t\3\t\5\t\u00f2\n\t\3\n\3\n\3\n\7"+
		"\n\u00f7\n\n\f\n\16\n\u00fa\13\n\3\n\5\n\u00fd\n\n\3\13\6\13\u0100\n\13"+
		"\r\13\16\13\u0101\3\13\3\13\6\13\u0106\n\13\r\13\16\13\u0107\5\13\u010a"+
		"\n\13\3\13\3\13\6\13\u010e\n\13\r\13\16\13\u010f\5\13\u0112\n\13\3\13"+
		"\5\13\u0115\n\13\3\13\3\13\3\13\3\13\3\13\6\13\u011c\n\13\r\13\16\13\u011d"+
		"\3\13\5\13\u0121\n\13\5\13\u0123\n\13\3\f\6\f\u0126\n\f\r\f\16\f\u0127"+
		"\3\f\3\f\6\f\u012c\n\f\r\f\16\f\u012d\5\f\u0130\n\f\3\f\3\f\6\f\u0134"+
		"\n\f\r\f\16\f\u0135\5\f\u0138\n\f\3\f\5\f\u013b\n\f\3\f\3\f\3\f\3\f\3"+
		"\f\6\f\u0142\n\f\r\f\16\f\u0143\3\f\5\f\u0147\n\f\5\f\u0149\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u0152\n\r\3\16\3\16\3\16\7\16\u0157\n\16\f"+
		"\16\16\16\u015a\13\16\3\16\3\16\3\17\6\17\u015f\n\17\r\17\16\17\u0160"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u0169\n\20\f\20\16\20\u016c\13\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u0174\n\21\f\21\16\21\u0177\13\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\7\22\u0180\n\22\f\22\16\22\u0183\13"+
		"\22\3\23\3\23\7\23\u0187\n\23\f\23\16\23\u018a\13\23\3\24\3\24\7\24\u018e"+
		"\n\24\f\24\16\24\u0191\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3("+
		"\3(\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,"+
		"\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@"+
		"\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\5G\u0301\nG\3H\3H\3H\3I\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3M\3N\3N"+
		"\3N\3O\3O\3O\3O\3O\5O\u031a\nO\3P\3P\3P\3P\3P\3P\3P\5P\u0323\nP\3Q\3Q"+
		"\3R\3R\3R\3S\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\"+
		"\3\\\3]\3]\3^\3^\3^\3^\7^\u0345\n^\f^\16^\u0348\13^\3\u0175\2_\3\2\5\2"+
		"\7\2\t\2\13\2\r\2\17\3\21\4\23\5\25\6\27\7\31\b\33\t\35\n\37\13!\f#\r"+
		"%\16\'\17)\20+\21-\22/\23\61\24\63\25\65\26\67\279\30;\31=\32?\33A\34"+
		"C\35E\36G\37I K!M\"O#Q$S%U&W\'Y([)]*_+a,c-e.g/i\60k\61m\62o\63q\64s\65"+
		"u\66w\67y8{9}:\177;\u0081<\u0083=\u0085>\u0087?\u0089@\u008bA\u008dB\u008f"+
		"C\u0091D\u0093E\u0095F\u0097G\u0099H\u009bI\u009dJ\u009fK\u00a1L\u00a3"+
		"M\u00a5N\u00a7O\u00a9P\u00abQ\u00adR\u00afS\u00b1T\u00b3U\u00b5V\u00b7"+
		"W\u00b9X\u00bbY\3\2\22\4\2C\\c|\5\2\62;CHch\4\2NNnn\4\2ZZzz\4\2GGgg\4"+
		"\2HHhh\6\2FFHHffhh\4\2$$^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17\3\2\62;\6"+
		"\2\62;C\\aac|\4\2&&BB\4\2>>@@\5\2,-//\61\61\4\2##\u0080\u0080\2\u0380"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\3\u00bd\3\2\2\2\5\u00bf\3\2\2\2\7\u00c1\3\2\2\2\t\u00c3\3\2\2"+
		"\2\13\u00c5\3\2\2\2\r\u00d7\3\2\2\2\17\u00e7\3\2\2\2\21\u00e9\3\2\2\2"+
		"\23\u00f3\3\2\2\2\25\u00ff\3\2\2\2\27\u0125\3\2\2\2\31\u0151\3\2\2\2\33"+
		"\u0153\3\2\2\2\35\u015e\3\2\2\2\37\u0164\3\2\2\2!\u016f\3\2\2\2#\u017d"+
		"\3\2\2\2%\u0184\3\2\2\2\'\u018b\3\2\2\2)\u0192\3\2\2\2+\u019b\3\2\2\2"+
		"-\u01a3\3\2\2\2/\u01a9\3\2\2\2\61\u01ae\3\2\2\2\63\u01b3\3\2\2\2\65\u01b9"+
		"\3\2\2\2\67\u01be\3\2\2\29\u01c4\3\2\2\2;\u01ca\3\2\2\2=\u01d3\3\2\2\2"+
		"?\u01db\3\2\2\2A\u01de\3\2\2\2C\u01e5\3\2\2\2E\u01ea\3\2\2\2G\u01ef\3"+
		"\2\2\2I\u01f7\3\2\2\2K\u01fd\3\2\2\2M\u0205\3\2\2\2O\u020b\3\2\2\2Q\u020f"+
		"\3\2\2\2S\u0212\3\2\2\2U\u0217\3\2\2\2W\u0222\3\2\2\2Y\u0229\3\2\2\2["+
		"\u0234\3\2\2\2]\u0238\3\2\2\2_\u0242\3\2\2\2a\u0247\3\2\2\2c\u024e\3\2"+
		"\2\2e\u0252\3\2\2\2g\u025a\3\2\2\2i\u0262\3\2\2\2k\u026c\3\2\2\2m\u0273"+
		"\3\2\2\2o\u027a\3\2\2\2q\u0280\3\2\2\2s\u0287\3\2\2\2u\u0290\3\2\2\2w"+
		"\u0296\3\2\2\2y\u029d\3\2\2\2{\u02aa\3\2\2\2}\u02af\3\2\2\2\177\u02b5"+
		"\3\2\2\2\u0081\u02bc\3\2\2\2\u0083\u02c6\3\2\2\2\u0085\u02ca\3\2\2\2\u0087"+
		"\u02cf\3\2\2\2\u0089\u02d8\3\2\2\2\u008b\u02de\3\2\2\2\u008d\u0300\3\2"+
		"\2\2\u008f\u0302\3\2\2\2\u0091\u0305\3\2\2\2\u0093\u0308\3\2\2\2\u0095"+
		"\u030a\3\2\2\2\u0097\u030c\3\2\2\2\u0099\u030e\3\2\2\2\u009b\u0311\3\2"+
		"\2\2\u009d\u0319\3\2\2\2\u009f\u0322\3\2\2\2\u00a1\u0324\3\2\2\2\u00a3"+
		"\u0326\3\2\2\2\u00a5\u0329\3\2\2\2\u00a7\u032c\3\2\2\2\u00a9\u032e\3\2"+
		"\2\2\u00ab\u0330\3\2\2\2\u00ad\u0332\3\2\2\2\u00af\u0334\3\2\2\2\u00b1"+
		"\u0336\3\2\2\2\u00b3\u0338\3\2\2\2\u00b5\u033a\3\2\2\2\u00b7\u033c\3\2"+
		"\2\2\u00b9\u033e\3\2\2\2\u00bb\u0340\3\2\2\2\u00bd\u00be\t\2\2\2\u00be"+
		"\4\3\2\2\2\u00bf\u00c0\4\63;\2\u00c0\6\3\2\2\2\u00c1\u00c2\4\62;\2\u00c2"+
		"\b\3\2\2\2\u00c3\u00c4\4\629\2\u00c4\n\3\2\2\2\u00c5\u00c6\t\3\2\2\u00c6"+
		"\f\3\2\2\2\u00c7\u00c8\7^\2\2\u00c8\u00d8\7v\2\2\u00c9\u00ca\7^\2\2\u00ca"+
		"\u00d8\7d\2\2\u00cb\u00cc\7^\2\2\u00cc\u00d8\7p\2\2\u00cd\u00ce\7^\2\2"+
		"\u00ce\u00d8\7t\2\2\u00cf\u00d0\7^\2\2\u00d0\u00d8\7h\2\2\u00d1\u00d2"+
		"\7^\2\2\u00d2\u00d8\7)\2\2\u00d3\u00d4\7^\2\2\u00d4\u00d8\7^\2\2\u00d5"+
		"\u00d6\7^\2\2\u00d6\u00d8\7$\2\2\u00d7\u00c7\3\2\2\2\u00d7\u00c9\3\2\2"+
		"\2\u00d7\u00cb\3\2\2\2\u00d7\u00cd\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d7\u00d1"+
		"\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\16\3\2\2\2\u00d9"+
		"\u00db\7\62\2\2\u00da\u00dc\t\4\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3"+
		"\2\2\2\u00dc\u00e8\3\2\2\2\u00dd\u00e1\5\5\3\2\u00de\u00e0\5\7\4\2\u00df"+
		"\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\t\4\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00d9\3\2"+
		"\2\2\u00e7\u00dd\3\2\2\2\u00e8\20\3\2\2\2\u00e9\u00ed\7\62\2\2\u00ea\u00ec"+
		"\5\t\5\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\t\4"+
		"\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\22\3\2\2\2\u00f3\u00f4"+
		"\7\62\2\2\u00f4\u00f8\t\5\2\2\u00f5\u00f7\5\13\6\2\u00f6\u00f5\3\2\2\2"+
		"\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc"+
		"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\t\4\2\2\u00fc\u00fb\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\24\3\2\2\2\u00fe\u0100\5\7\4\2\u00ff\u00fe\3\2\2"+
		"\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0122"+
		"\3\2\2\2\u0103\u0105\7\60\2\2\u0104\u0106\5\7\4\2\u0105\u0104\3\2\2\2"+
		"\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a"+
		"\3\2\2\2\u0109\u0103\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0111\3\2\2\2\u010b"+
		"\u010d\t\6\2\2\u010c\u010e\5\7\4\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u010b\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0115\t\7"+
		"\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0123\3\2\2\2\u0116"+
		"\u0117\7\60\2\2\u0117\u0123\t\7\2\2\u0118\u0119\7\60\2\2\u0119\u011b\t"+
		"\6\2\2\u011a\u011c\5\7\4\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u0121\t\7"+
		"\2\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122"+
		"\u0109\3\2\2\2\u0122\u0116\3\2\2\2\u0122\u0118\3\2\2\2\u0123\26\3\2\2"+
		"\2\u0124\u0126\5\7\4\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0148\3\2\2\2\u0129\u012b\7\60\2\2"+
		"\u012a\u012c\5\7\4\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u0129\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0137\3\2\2\2\u0131\u0133\t\6\2\2\u0132\u0134\5\7"+
		"\4\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0131\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u013a\3\2\2\2\u0139\u013b\t\b\2\2\u013a\u0139\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u0149\3\2\2\2\u013c\u013d\7\60\2\2\u013d\u0149\t"+
		"\b\2\2\u013e\u013f\7\60\2\2\u013f\u0141\t\6\2\2\u0140\u0142\5\7\4\2\u0141"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0146\3\2\2\2\u0145\u0147\t\b\2\2\u0146\u0145\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u012f\3\2\2\2\u0148\u013c\3\2"+
		"\2\2\u0148\u013e\3\2\2\2\u0149\30\3\2\2\2\u014a\u014b\7)\2\2\u014b\u014c"+
		"\n\t\2\2\u014c\u0152\7)\2\2\u014d\u014e\7)\2\2\u014e\u014f\5\r\7\2\u014f"+
		"\u0150\7)\2\2\u0150\u0152\3\2\2\2\u0151\u014a\3\2\2\2\u0151\u014d\3\2"+
		"\2\2\u0152\32\3\2\2\2\u0153\u0158\7$\2\2\u0154\u0157\n\t\2\2\u0155\u0157"+
		"\5\r\7\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015b\u015c\7$\2\2\u015c\34\3\2\2\2\u015d\u015f\t\n\2\2\u015e\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0163\b\17\2\2\u0163\36\3\2\2\2\u0164\u0165\7\61"+
		"\2\2\u0165\u0166\7\61\2\2\u0166\u016a\3\2\2\2\u0167\u0169\n\13\2\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\b\20\2\2\u016e"+
		" \3\2\2\2\u016f\u0170\7\61\2\2\u0170\u0171\7,\2\2\u0171\u0175\3\2\2\2"+
		"\u0172\u0174\13\2\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178"+
		"\u0179\7,\2\2\u0179\u017a\7\61\2\2\u017a\u017b\3\2\2\2\u017b\u017c\b\21"+
		"\2\2\u017c\"\3\2\2\2\u017d\u0181\t\f\2\2\u017e\u0180\t\r\2\2\u017f\u017e"+
		"\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"$\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0188\7%\2\2\u0185\u0187\t\r\2\2\u0186"+
		"\u0185\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189&\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018f\t\16\2\2\u018c\u018e"+
		"\t\r\2\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190(\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0193\7c\2\2\u0193"+
		"\u0194\7d\2\2\u0194\u0195\7u\2\2\u0195\u0196\7v\2\2\u0196\u0197\7t\2\2"+
		"\u0197\u0198\7c\2\2\u0198\u0199\7e\2\2\u0199\u019a\7v\2\2\u019a*\3\2\2"+
		"\2\u019b\u019c\7d\2\2\u019c\u019d\7q\2\2\u019d\u019e\7q\2\2\u019e\u019f"+
		"\7n\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7c\2\2\u01a1\u01a2\7p\2\2\u01a2"+
		",\3\2\2\2\u01a3\u01a4\7d\2\2\u01a4\u01a5\7t\2\2\u01a5\u01a6\7g\2\2\u01a6"+
		"\u01a7\7c\2\2\u01a7\u01a8\7m\2\2\u01a8.\3\2\2\2\u01a9\u01aa\7d\2\2\u01aa"+
		"\u01ab\7{\2\2\u01ab\u01ac\7v\2\2\u01ac\u01ad\7g\2\2\u01ad\60\3\2\2\2\u01ae"+
		"\u01af\7e\2\2\u01af\u01b0\7c\2\2\u01b0\u01b1\7u\2\2\u01b1\u01b2\7g\2\2"+
		"\u01b2\62\3\2\2\2\u01b3\u01b4\7e\2\2\u01b4\u01b5\7c\2\2\u01b5\u01b6\7"+
		"v\2\2\u01b6\u01b7\7e\2\2\u01b7\u01b8\7j\2\2\u01b8\64\3\2\2\2\u01b9\u01ba"+
		"\7e\2\2\u01ba\u01bb\7j\2\2\u01bb\u01bc\7c\2\2\u01bc\u01bd\7t\2\2\u01bd"+
		"\66\3\2\2\2\u01be\u01bf\7e\2\2\u01bf\u01c0\7n\2\2\u01c0\u01c1\7c\2\2\u01c1"+
		"\u01c2\7u\2\2\u01c2\u01c3\7u\2\2\u01c38\3\2\2\2\u01c4\u01c5\7e\2\2\u01c5"+
		"\u01c6\7q\2\2\u01c6\u01c7\7p\2\2\u01c7\u01c8\7u\2\2\u01c8\u01c9\7v\2\2"+
		"\u01c9:\3\2\2\2\u01ca\u01cb\7e\2\2\u01cb\u01cc\7q\2\2\u01cc\u01cd\7p\2"+
		"\2\u01cd\u01ce\7v\2\2\u01ce\u01cf\7k\2\2\u01cf\u01d0\7p\2\2\u01d0\u01d1"+
		"\7w\2\2\u01d1\u01d2\7g\2\2\u01d2<\3\2\2\2\u01d3\u01d4\7f\2\2\u01d4\u01d5"+
		"\7g\2\2\u01d5\u01d6\7h\2\2\u01d6\u01d7\7c\2\2\u01d7\u01d8\7w\2\2\u01d8"+
		"\u01d9\7n\2\2\u01d9\u01da\7v\2\2\u01da>\3\2\2\2\u01db\u01dc\7f\2\2\u01dc"+
		"\u01dd\7q\2\2\u01dd@\3\2\2\2\u01de\u01df\7f\2\2\u01df\u01e0\7q\2\2\u01e0"+
		"\u01e1\7w\2\2\u01e1\u01e2\7d\2\2\u01e2\u01e3\7n\2\2\u01e3\u01e4\7g\2\2"+
		"\u01e4B\3\2\2\2\u01e5\u01e6\7g\2\2\u01e6\u01e7\7n\2\2\u01e7\u01e8\7u\2"+
		"\2\u01e8\u01e9\7g\2\2\u01e9D\3\2\2\2\u01ea\u01eb\7g\2\2\u01eb\u01ec\7"+
		"p\2\2\u01ec\u01ed\7w\2\2\u01ed\u01ee\7o\2\2\u01eeF\3\2\2\2\u01ef\u01f0"+
		"\7g\2\2\u01f0\u01f1\7z\2\2\u01f1\u01f2\7v\2\2\u01f2\u01f3\7g\2\2\u01f3"+
		"\u01f4\7p\2\2\u01f4\u01f5\7f\2\2\u01f5\u01f6\7u\2\2\u01f6H\3\2\2\2\u01f7"+
		"\u01f8\7h\2\2\u01f8\u01f9\7k\2\2\u01f9\u01fa\7p\2\2\u01fa\u01fb\7c\2\2"+
		"\u01fb\u01fc\7n\2\2\u01fcJ\3\2\2\2\u01fd\u01fe\7h\2\2\u01fe\u01ff\7k\2"+
		"\2\u01ff\u0200\7p\2\2\u0200\u0201\7c\2\2\u0201\u0202\7n\2\2\u0202\u0203"+
		"\7n\2\2\u0203\u0204\7{\2\2\u0204L\3\2\2\2\u0205\u0206\7h\2\2\u0206\u0207"+
		"\7n\2\2\u0207\u0208\7q\2\2\u0208\u0209\7c\2\2\u0209\u020a\7v\2\2\u020a"+
		"N\3\2\2\2\u020b\u020c\7h\2\2\u020c\u020d\7q\2\2\u020d\u020e\7t\2\2\u020e"+
		"P\3\2\2\2\u020f\u0210\7k\2\2\u0210\u0211\7h\2\2\u0211R\3\2\2\2\u0212\u0213"+
		"\7i\2\2\u0213\u0214\7q\2\2\u0214\u0215\7v\2\2\u0215\u0216\7q\2\2\u0216"+
		"T\3\2\2\2\u0217\u0218\7k\2\2\u0218\u0219\7o\2\2\u0219\u021a\7r\2\2\u021a"+
		"\u021b\7n\2\2\u021b\u021c\7g\2\2\u021c\u021d\7o\2\2\u021d\u021e\7g\2\2"+
		"\u021e\u021f\7p\2\2\u021f\u0220\7v\2\2\u0220\u0221\7u\2\2\u0221V\3\2\2"+
		"\2\u0222\u0223\7k\2\2\u0223\u0224\7o\2\2\u0224\u0225\7r\2\2\u0225\u0226"+
		"\7q\2\2\u0226\u0227\7t\2\2\u0227\u0228\7v\2\2\u0228X\3\2\2\2\u0229\u022a"+
		"\7k\2\2\u022a\u022b\7p\2\2\u022b\u022c\7u\2\2\u022c\u022d\7v\2\2\u022d"+
		"\u022e\7c\2\2\u022e\u022f\7p\2\2\u022f\u0230\7e\2\2\u0230\u0231\7g\2\2"+
		"\u0231\u0232\7q\2\2\u0232\u0233\7h\2\2\u0233Z\3\2\2\2\u0234\u0235\7k\2"+
		"\2\u0235\u0236\7p\2\2\u0236\u0237\7v\2\2\u0237\\\3\2\2\2\u0238\u0239\7"+
		"k\2\2\u0239\u023a\7p\2\2\u023a\u023b\7v\2\2\u023b\u023c\7g\2\2\u023c\u023d"+
		"\7t\2\2\u023d\u023e\7h\2\2\u023e\u023f\7c\2\2\u023f\u0240\7e\2\2\u0240"+
		"\u0241\7g\2\2\u0241^\3\2\2\2\u0242\u0243\7n\2\2\u0243\u0244\7q\2\2\u0244"+
		"\u0245\7p\2\2\u0245\u0246\7i\2\2\u0246`\3\2\2\2\u0247\u0248\7p\2\2\u0248"+
		"\u0249\7c\2\2\u0249\u024a\7v\2\2\u024a\u024b\7k\2\2\u024b\u024c\7x\2\2"+
		"\u024c\u024d\7g\2\2\u024db\3\2\2\2\u024e\u024f\7p\2\2\u024f\u0250\7g\2"+
		"\2\u0250\u0251\7y\2\2\u0251d\3\2\2\2\u0252\u0253\7r\2\2\u0253\u0254\7"+
		"c\2\2\u0254\u0255\7e\2\2\u0255\u0256\7m\2\2\u0256\u0257\7c\2\2\u0257\u0258"+
		"\7i\2\2\u0258\u0259\7g\2\2\u0259f\3\2\2\2\u025a\u025b\7r\2\2\u025b\u025c"+
		"\7t\2\2\u025c\u025d\7k\2\2\u025d\u025e\7x\2\2\u025e\u025f\7c\2\2\u025f"+
		"\u0260\7v\2\2\u0260\u0261\7g\2\2\u0261h\3\2\2\2\u0262\u0263\7r\2\2\u0263"+
		"\u0264\7t\2\2\u0264\u0265\7q\2\2\u0265\u0266\7v\2\2\u0266\u0267\7g\2\2"+
		"\u0267\u0268\7e\2\2\u0268\u0269\7v\2\2\u0269\u026a\7g\2\2\u026a\u026b"+
		"\7f\2\2\u026bj\3\2\2\2\u026c\u026d\7r\2\2\u026d\u026e\7w\2\2\u026e\u026f"+
		"\7d\2\2\u026f\u0270\7n\2\2\u0270\u0271\7k\2\2\u0271\u0272\7e\2\2\u0272"+
		"l\3\2\2\2\u0273\u0274\7t\2\2\u0274\u0275\7g\2\2\u0275\u0276\7v\2\2\u0276"+
		"\u0277\7w\2\2\u0277\u0278\7t\2\2\u0278\u0279\7p\2\2\u0279n\3\2\2\2\u027a"+
		"\u027b\7u\2\2\u027b\u027c\7j\2\2\u027c\u027d\7q\2\2\u027d\u027e\7t\2\2"+
		"\u027e\u027f\7v\2\2\u027fp\3\2\2\2\u0280\u0281\7u\2\2\u0281\u0282\7v\2"+
		"\2\u0282\u0283\7c\2\2\u0283\u0284\7v\2\2\u0284\u0285\7k\2\2\u0285\u0286"+
		"\7e\2\2\u0286r\3\2\2\2\u0287\u0288\7u\2\2\u0288\u0289\7v\2\2\u0289\u028a"+
		"\7t\2\2\u028a\u028b\7k\2\2\u028b\u028c\7e\2\2\u028c\u028d\7v\2\2\u028d"+
		"\u028e\7h\2\2\u028e\u028f\7r\2\2\u028ft\3\2\2\2\u0290\u0291\7u\2\2\u0291"+
		"\u0292\7w\2\2\u0292\u0293\7r\2\2\u0293\u0294\7g\2\2\u0294\u0295\7t\2\2"+
		"\u0295v\3\2\2\2\u0296\u0297\7u\2\2\u0297\u0298\7y\2\2\u0298\u0299\7k\2"+
		"\2\u0299\u029a\7v\2\2\u029a\u029b\7e\2\2\u029b\u029c\7j\2\2\u029cx\3\2"+
		"\2\2\u029d\u029e\7u\2\2\u029e\u029f\7{\2\2\u029f\u02a0\7p\2\2\u02a0\u02a1"+
		"\7e\2\2\u02a1\u02a2\7j\2\2\u02a2\u02a3\7t\2\2\u02a3\u02a4\7q\2\2\u02a4"+
		"\u02a5\7p\2\2\u02a5\u02a6\7k\2\2\u02a6\u02a7\7|\2\2\u02a7\u02a8\7g\2\2"+
		"\u02a8\u02a9\7f\2\2\u02a9z\3\2\2\2\u02aa\u02ab\7v\2\2\u02ab\u02ac\7j\2"+
		"\2\u02ac\u02ad\7k\2\2\u02ad\u02ae\7u\2\2\u02ae|\3\2\2\2\u02af\u02b0\7"+
		"v\2\2\u02b0\u02b1\7j\2\2\u02b1\u02b2\7t\2\2\u02b2\u02b3\7q\2\2\u02b3\u02b4"+
		"\7y\2\2\u02b4~\3\2\2\2\u02b5\u02b6\7v\2\2\u02b6\u02b7\7j\2\2\u02b7\u02b8"+
		"\7t\2\2\u02b8\u02b9\7q\2\2\u02b9\u02ba\7y\2\2\u02ba\u02bb\7u\2\2\u02bb"+
		"\u0080\3\2\2\2\u02bc\u02bd\7v\2\2\u02bd\u02be\7t\2\2\u02be\u02bf\7c\2"+
		"\2\u02bf\u02c0\7p\2\2\u02c0\u02c1\7u\2\2\u02c1\u02c2\7k\2\2\u02c2\u02c3"+
		"\7g\2\2\u02c3\u02c4\7p\2\2\u02c4\u02c5\7v\2\2\u02c5\u0082\3\2\2\2\u02c6"+
		"\u02c7\7v\2\2\u02c7\u02c8\7t\2\2\u02c8\u02c9\7{\2\2\u02c9\u0084\3\2\2"+
		"\2\u02ca\u02cb\7x\2\2\u02cb\u02cc\7q\2\2\u02cc\u02cd\7k\2\2\u02cd\u02ce"+
		"\7f\2\2\u02ce\u0086\3\2\2\2\u02cf\u02d0\7x\2\2\u02d0\u02d1\7q\2\2\u02d1"+
		"\u02d2\7n\2\2\u02d2\u02d3\7c\2\2\u02d3\u02d4\7v\2\2\u02d4\u02d5\7k\2\2"+
		"\u02d5\u02d6\7n\2\2\u02d6\u02d7\7g\2\2\u02d7\u0088\3\2\2\2\u02d8\u02d9"+
		"\7y\2\2\u02d9\u02da\7j\2\2\u02da\u02db\7k\2\2\u02db\u02dc\7n\2\2\u02dc"+
		"\u02dd\7g\2\2\u02dd\u008a\3\2\2\2\u02de\u02df\7U\2\2\u02df\u02e0\7v\2"+
		"\2\u02e0\u02e1\7t\2\2\u02e1\u02e2\7k\2\2\u02e2\u02e3\7p\2\2\u02e3\u02e4"+
		"\7i\2\2\u02e4\u008c\3\2\2\2\u02e5\u0301\7?\2\2\u02e6\u02e7\7,\2\2\u02e7"+
		"\u0301\7?\2\2\u02e8\u02e9\7\61\2\2\u02e9\u0301\7?\2\2\u02ea\u02eb\7\'"+
		"\2\2\u02eb\u0301\7?\2\2\u02ec\u02ed\7-\2\2\u02ed\u0301\7?\2\2\u02ee\u02ef"+
		"\7/\2\2\u02ef\u0301\7?\2\2\u02f0\u02f1\7>\2\2\u02f1\u02f2\7>\2\2\u02f2"+
		"\u0301\7?\2\2\u02f3\u02f4\7@\2\2\u02f4\u02f5\7@\2\2\u02f5\u0301\7?\2\2"+
		"\u02f6\u02f7\7@\2\2\u02f7\u02f8\7@\2\2\u02f8\u02f9\7@\2\2\u02f9\u0301"+
		"\7?\2\2\u02fa\u02fb\7(\2\2\u02fb\u0301\7?\2\2\u02fc\u02fd\7`\2\2\u02fd"+
		"\u0301\7?\2\2\u02fe\u02ff\7~\2\2\u02ff\u0301\7?\2\2\u0300\u02e5\3\2\2"+
		"\2\u0300\u02e6\3\2\2\2\u0300\u02e8\3\2\2\2\u0300\u02ea\3\2\2\2\u0300\u02ec"+
		"\3\2\2\2\u0300\u02ee\3\2\2\2\u0300\u02f0\3\2\2\2\u0300\u02f3\3\2\2\2\u0300"+
		"\u02f6\3\2\2\2\u0300\u02fa\3\2\2\2\u0300\u02fc\3\2\2\2\u0300\u02fe\3\2"+
		"\2\2\u0301\u008e\3\2\2\2\u0302\u0303\7~\2\2\u0303\u0304\7~\2\2\u0304\u0090"+
		"\3\2\2\2\u0305\u0306\7(\2\2\u0306\u0307\7(\2\2\u0307\u0092\3\2\2\2\u0308"+
		"\u0309\7~\2\2\u0309\u0094\3\2\2\2\u030a\u030b\7`\2\2\u030b\u0096\3\2\2"+
		"\2\u030c\u030d\7(\2\2\u030d\u0098\3\2\2\2\u030e\u030f\7?\2\2\u030f\u0310"+
		"\7?\2\2\u0310\u009a\3\2\2\2\u0311\u0312\7#\2\2\u0312\u0313\7?\2\2\u0313"+
		"\u009c\3\2\2\2\u0314\u031a\t\17\2\2\u0315\u0316\7>\2\2\u0316\u031a\7?"+
		"\2\2\u0317\u0318\7@\2\2\u0318\u031a\7?\2\2\u0319\u0314\3\2\2\2\u0319\u0315"+
		"\3\2\2\2\u0319\u0317\3\2\2\2\u031a\u009e\3\2\2\2\u031b\u031c\7>\2\2\u031c"+
		"\u0323\7>\2\2\u031d\u031e\7@\2\2\u031e\u0323\7@\2\2\u031f\u0320\7@\2\2"+
		"\u0320\u0321\7@\2\2\u0321\u0323\7@\2\2\u0322\u031b\3\2\2\2\u0322\u031d"+
		"\3\2\2\2\u0322\u031f\3\2\2\2\u0323\u00a0\3\2\2\2\u0324\u0325\t\20\2\2"+
		"\u0325\u00a2\3\2\2\2\u0326\u0327\7/\2\2\u0327\u0328\7/\2\2\u0328\u00a4"+
		"\3\2\2\2\u0329\u032a\7-\2\2\u032a\u032b\7-\2\2\u032b\u00a6\3\2\2\2\u032c"+
		"\u032d\t\21\2\2\u032d\u00a8\3\2\2\2\u032e\u032f\7]\2\2\u032f\u00aa\3\2"+
		"\2\2\u0330\u0331\7_\2\2\u0331\u00ac\3\2\2\2\u0332\u0333\7}\2\2\u0333\u00ae"+
		"\3\2\2\2\u0334\u0335\7\177\2\2\u0335\u00b0\3\2\2\2\u0336\u0337\7*\2\2"+
		"\u0337\u00b2\3\2\2\2\u0338\u0339\7+\2\2\u0339\u00b4\3\2\2\2\u033a\u033b"+
		"\7\60\2\2\u033b\u00b6\3\2\2\2\u033c\u033d\7=\2\2\u033d\u00b8\3\2\2\2\u033e"+
		"\u033f\7B\2\2\u033f\u00ba\3\2\2\2\u0340\u0346\5\3\2\2\u0341\u0345\5\3"+
		"\2\2\u0342\u0345\5\7\4\2\u0343\u0345\7a\2\2\u0344\u0341\3\2\2\2\u0344"+
		"\u0342\3\2\2\2\u0344\u0343\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344\3\2"+
		"\2\2\u0346\u0347\3\2\2\2\u0347\u00bc\3\2\2\2\u0348\u0346\3\2\2\2,\2\u00d7"+
		"\u00db\u00e1\u00e5\u00e7\u00ed\u00f1\u00f8\u00fc\u0101\u0107\u0109\u010f"+
		"\u0111\u0114\u011d\u0120\u0122\u0127\u012d\u012f\u0135\u0137\u013a\u0143"+
		"\u0146\u0148\u0151\u0156\u0158\u0160\u016a\u0175\u0181\u0188\u018f\u0300"+
		"\u0319\u0322\u0344\u0346\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}