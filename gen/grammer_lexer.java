// Generated from /home/salehmh/FUM/Machines Theory/Project/antlr_proj/university_antlr_project/src/grammer_lexer.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class grammer_lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SemiColon=1, Comma=2, DolorSign=3, QuestionMark=4, Colon=5, ComputeSigns=6, 
		Des_In_CreamentOprators=7, LogicalOperator=8, RelationalOperator=9, RelationalOprators=10, 
		Assign=11, Equals=12, As=13, From=14, Import=15, Const=16, Var=17, Let=18, 
		OpenBracket=19, CloseBracket=20, OpenParen=21, CloseParen=22, OpenBrace=23, 
		CloseBrace=24, For=25, In=26, Of=27, Continue=28, Break=29, While=30, 
		Do=31, If=32, Else=33, ElseIf=34, Switch=35, Match=36, Case=37, Default=38, 
		Finally=39, Class=40, Constructor=41, This=42, New=43, Return=44, DataTypes=45, 
		Function_=46, Try=47, Catch=48, Identifier=49, Char=50, WS=51, StringLiteral=52, 
		Number=53, DecimalNumber=54, Exponent=55, Integer=56, SingleLineComment=57, 
		MultiLineComment=58, Plus=59, Minus=60, Multiply=61, Divide=62, IntegerDivide=63, 
		Power=64, LogicalAnd=65, LogicalOr=66, Equalsw=67, NotEquals=68, RelationalOperatorw=69, 
		InequalityOperator=70, UnaryOperator=71, Tt=72;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SemiColon", "Comma", "DolorSign", "QuestionMark", "Colon", "ComputeSigns", 
			"Des_In_CreamentOprators", "LogicalOperator", "RelationalOperator", "RelationalOprators", 
			"Assign", "Equals", "As", "From", "Import", "Const", "Var", "Let", "OpenBracket", 
			"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
			"For", "In", "Of", "Continue", "Break", "While", "Do", "If", "Else", 
			"ElseIf", "Switch", "Match", "Case", "Default", "Finally", "Class", "Constructor", 
			"This", "New", "Return", "DataTypes", "Function_", "Try", "Catch", "Identifier", 
			"Char", "WS", "StringLiteral", "Number", "DecimalNumber", "Exponent", 
			"Integer", "SingleLineComment", "MultiLineComment", "Plus", "Minus", 
			"Multiply", "Divide", "IntegerDivide", "Power", "LogicalAnd", "LogicalOr", 
			"Equalsw", "NotEquals", "RelationalOperatorw", "InequalityOperator", 
			"UnaryOperator", "Tt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'$'", "'?'", "':'", null, null, null, null, null, 
			null, null, "'as'", "'from'", "'import'", "'const'", "'var'", "'let'", 
			"'['", "']'", "'('", "')'", "'{'", "'}'", "'for'", "'in'", "'of'", "'continue'", 
			"'break'", "'while'", "'do'", "'if'", "'else'", "'elif'", "'switch'", 
			"'match'", "'case'", "'default'", "'finally'", "'class'", "'constructor'", 
			"'this'", "'new'", "'return'", null, "'function'", "'try'", "'catch'", 
			null, null, null, null, null, null, null, null, null, null, "'+'", "'-'", 
			"'*'", "'/'", "'//'", "'**'", "'&&'", "'||'", "'=='", "'!='", null, "'<>'", 
			null, "'###'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SemiColon", "Comma", "DolorSign", "QuestionMark", "Colon", "ComputeSigns", 
			"Des_In_CreamentOprators", "LogicalOperator", "RelationalOperator", "RelationalOprators", 
			"Assign", "Equals", "As", "From", "Import", "Const", "Var", "Let", "OpenBracket", 
			"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
			"For", "In", "Of", "Continue", "Break", "While", "Do", "If", "Else", 
			"ElseIf", "Switch", "Match", "Case", "Default", "Finally", "Class", "Constructor", 
			"This", "New", "Return", "DataTypes", "Function_", "Try", "Catch", "Identifier", 
			"Char", "WS", "StringLiteral", "Number", "DecimalNumber", "Exponent", 
			"Integer", "SingleLineComment", "MultiLineComment", "Plus", "Minus", 
			"Multiply", "Divide", "IntegerDivide", "Power", "LogicalAnd", "LogicalOr", 
			"Equalsw", "NotEquals", "RelationalOperatorw", "InequalityOperator", 
			"UnaryOperator", "Tt"
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


	public grammer_lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammer_lexer.g4"; }

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
		"\u0004\u0000H\u0215\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0002F\u0007F\u0002G\u0007G\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00a0\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00a7\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00ad\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00be\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00c8\b\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#"+
		"\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u0181\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u00010\u00010\u00040\u0198\b0\u000b0\f0\u0199\u00011\u00011\u0001"+
		"2\u00042\u019f\b2\u000b2\f2\u01a0\u00012\u00012\u00013\u00013\u00053\u01a7"+
		"\b3\n3\f3\u01aa\t3\u00013\u00013\u00013\u00053\u01af\b3\n3\f3\u01b2\t"+
		"3\u00013\u00033\u01b5\b3\u00014\u00034\u01b8\b4\u00014\u00014\u00034\u01bc"+
		"\b4\u00015\u00015\u00015\u00035\u01c1\b5\u00016\u00016\u00036\u01c5\b"+
		"6\u00016\u00016\u00017\u00047\u01ca\b7\u000b7\f7\u01cb\u00018\u00018\u0001"+
		"8\u00018\u00058\u01d2\b8\n8\f8\u01d5\t8\u00018\u00018\u00019\u00019\u0001"+
		"9\u00019\u00059\u01dd\b9\n9\f9\u01e0\t9\u00019\u00019\u00019\u00019\u0001"+
		"9\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001=\u0001=\u0001>\u0001"+
		">\u0001>\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001A\u0001A\u0001"+
		"A\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0003D\u0206\bD\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0003F\u0210\bF\u0001G\u0001G\u0001G\u0001G\u0001\u01de\u0000"+
		"H\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%"+
		"K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s:u;w<y={>}?\u007f@\u0081A\u0083"+
		"B\u0085C\u0087D\u0089E\u008bF\u008dG\u008fH\u0001\u0000\f\u0003\u0000"+
		"*+--//\u0002\u0000<<>>\u0002\u0000AZaz\u0005\u0000$$09AZ__az\u0003\u0000"+
		"\t\n\r\r  \u0003\u0000\n\n\r\r\'\'\u0003\u0000\n\n\r\r\"\"\u0002\u0000"+
		"EEee\u0002\u0000++--\u0001\u000009\u0002\u0000\n\n\r\r\u0004\u0000!!+"+
		"+--~~\u0236\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"+
		"O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001"+
		"\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000"+
		"\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000"+
		"]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001"+
		"\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000"+
		"\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000"+
		"k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001"+
		"\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000"+
		"\u0000\u0000u\u0001\u0000\u0000\u0000\u0000w\u0001\u0000\u0000\u0000\u0000"+
		"y\u0001\u0000\u0000\u0000\u0000{\u0001\u0000\u0000\u0000\u0000}\u0001"+
		"\u0000\u0000\u0000\u0000\u007f\u0001\u0000\u0000\u0000\u0000\u0081\u0001"+
		"\u0000\u0000\u0000\u0000\u0083\u0001\u0000\u0000\u0000\u0000\u0085\u0001"+
		"\u0000\u0000\u0000\u0000\u0087\u0001\u0000\u0000\u0000\u0000\u0089\u0001"+
		"\u0000\u0000\u0000\u0000\u008b\u0001\u0000\u0000\u0000\u0000\u008d\u0001"+
		"\u0000\u0000\u0000\u0000\u008f\u0001\u0000\u0000\u0000\u0001\u0091\u0001"+
		"\u0000\u0000\u0000\u0003\u0093\u0001\u0000\u0000\u0000\u0005\u0095\u0001"+
		"\u0000\u0000\u0000\u0007\u0097\u0001\u0000\u0000\u0000\t\u0099\u0001\u0000"+
		"\u0000\u0000\u000b\u009f\u0001\u0000\u0000\u0000\r\u00a6\u0001\u0000\u0000"+
		"\u0000\u000f\u00ac\u0001\u0000\u0000\u0000\u0011\u00bd\u0001\u0000\u0000"+
		"\u0000\u0013\u00c7\u0001\u0000\u0000\u0000\u0015\u00c9\u0001\u0000\u0000"+
		"\u0000\u0017\u00cb\u0001\u0000\u0000\u0000\u0019\u00cd\u0001\u0000\u0000"+
		"\u0000\u001b\u00d0\u0001\u0000\u0000\u0000\u001d\u00d5\u0001\u0000\u0000"+
		"\u0000\u001f\u00dc\u0001\u0000\u0000\u0000!\u00e2\u0001\u0000\u0000\u0000"+
		"#\u00e6\u0001\u0000\u0000\u0000%\u00ea\u0001\u0000\u0000\u0000\'\u00ec"+
		"\u0001\u0000\u0000\u0000)\u00ee\u0001\u0000\u0000\u0000+\u00f0\u0001\u0000"+
		"\u0000\u0000-\u00f2\u0001\u0000\u0000\u0000/\u00f4\u0001\u0000\u0000\u0000"+
		"1\u00f6\u0001\u0000\u0000\u00003\u00fa\u0001\u0000\u0000\u00005\u00fd"+
		"\u0001\u0000\u0000\u00007\u0100\u0001\u0000\u0000\u00009\u0109\u0001\u0000"+
		"\u0000\u0000;\u010f\u0001\u0000\u0000\u0000=\u0115\u0001\u0000\u0000\u0000"+
		"?\u0118\u0001\u0000\u0000\u0000A\u011b\u0001\u0000\u0000\u0000C\u0120"+
		"\u0001\u0000\u0000\u0000E\u0125\u0001\u0000\u0000\u0000G\u012c\u0001\u0000"+
		"\u0000\u0000I\u0132\u0001\u0000\u0000\u0000K\u0137\u0001\u0000\u0000\u0000"+
		"M\u013f\u0001\u0000\u0000\u0000O\u0147\u0001\u0000\u0000\u0000Q\u014d"+
		"\u0001\u0000\u0000\u0000S\u0159\u0001\u0000\u0000\u0000U\u015e\u0001\u0000"+
		"\u0000\u0000W\u0162\u0001\u0000\u0000\u0000Y\u0180\u0001\u0000\u0000\u0000"+
		"[\u0182\u0001\u0000\u0000\u0000]\u018b\u0001\u0000\u0000\u0000_\u018f"+
		"\u0001\u0000\u0000\u0000a\u0195\u0001\u0000\u0000\u0000c\u019b\u0001\u0000"+
		"\u0000\u0000e\u019e\u0001\u0000\u0000\u0000g\u01b4\u0001\u0000\u0000\u0000"+
		"i\u01b7\u0001\u0000\u0000\u0000k\u01bd\u0001\u0000\u0000\u0000m\u01c2"+
		"\u0001\u0000\u0000\u0000o\u01c9\u0001\u0000\u0000\u0000q\u01cd\u0001\u0000"+
		"\u0000\u0000s\u01d8\u0001\u0000\u0000\u0000u\u01e6\u0001\u0000\u0000\u0000"+
		"w\u01e8\u0001\u0000\u0000\u0000y\u01ea\u0001\u0000\u0000\u0000{\u01ec"+
		"\u0001\u0000\u0000\u0000}\u01ee\u0001\u0000\u0000\u0000\u007f\u01f1\u0001"+
		"\u0000\u0000\u0000\u0081\u01f4\u0001\u0000\u0000\u0000\u0083\u01f7\u0001"+
		"\u0000\u0000\u0000\u0085\u01fa\u0001\u0000\u0000\u0000\u0087\u01fd\u0001"+
		"\u0000\u0000\u0000\u0089\u0205\u0001\u0000\u0000\u0000\u008b\u0207\u0001"+
		"\u0000\u0000\u0000\u008d\u020f\u0001\u0000\u0000\u0000\u008f\u0211\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005;\u0000\u0000\u0092\u0002\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0005,\u0000\u0000\u0094\u0004\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005$\u0000\u0000\u0096\u0006\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005?\u0000\u0000\u0098\b\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005:\u0000\u0000\u009a\n\u0001\u0000\u0000\u0000\u009b\u00a0"+
		"\u0007\u0000\u0000\u0000\u009c\u009d\u0005*\u0000\u0000\u009d\u00a0\u0005"+
		"*\u0000\u0000\u009e\u00a0\u0005%\u0000\u0000\u009f\u009b\u0001\u0000\u0000"+
		"\u0000\u009f\u009c\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005+\u0000\u0000"+
		"\u00a2\u00a7\u0005+\u0000\u0000\u00a3\u00a4\u0005-\u0000\u0000\u00a4\u00a7"+
		"\u0005-\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u000e\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		"&\u0000\u0000\u00a9\u00ad\u0005&\u0000\u0000\u00aa\u00ab\u0005|\u0000"+
		"\u0000\u00ab\u00ad\u0005|\u0000\u0000\u00ac\u00a8\u0001\u0000\u0000\u0000"+
		"\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u0010\u0001\u0000\u0000\u0000"+
		"\u00ae\u00be\u0007\u0001\u0000\u0000\u00af\u00b0\u0005<\u0000\u0000\u00b0"+
		"\u00be\u0005=\u0000\u0000\u00b1\u00b2\u0005>\u0000\u0000\u00b2\u00be\u0005"+
		"=\u0000\u0000\u00b3\u00b4\u0005=\u0000\u0000\u00b4\u00be\u0005=\u0000"+
		"\u0000\u00b5\u00b6\u0005!\u0000\u0000\u00b6\u00be\u0005=\u0000\u0000\u00b7"+
		"\u00b8\u0005=\u0000\u0000\u00b8\u00b9\u0005=\u0000\u0000\u00b9\u00be\u0005"+
		"=\u0000\u0000\u00ba\u00bb\u0005!\u0000\u0000\u00bb\u00bc\u0005=\u0000"+
		"\u0000\u00bc\u00be\u0005=\u0000\u0000\u00bd\u00ae\u0001\u0000\u0000\u0000"+
		"\u00bd\u00af\u0001\u0000\u0000\u0000\u00bd\u00b1\u0001\u0000\u0000\u0000"+
		"\u00bd\u00b3\u0001\u0000\u0000\u0000\u00bd\u00b5\u0001\u0000\u0000\u0000"+
		"\u00bd\u00b7\u0001\u0000\u0000\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000"+
		"\u00be\u0012\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005+\u0000\u0000\u00c0"+
		"\u00c8\u0005=\u0000\u0000\u00c1\u00c2\u0005-\u0000\u0000\u00c2\u00c8\u0005"+
		"=\u0000\u0000\u00c3\u00c4\u0005/\u0000\u0000\u00c4\u00c8\u0005=\u0000"+
		"\u0000\u00c5\u00c6\u0005*\u0000\u0000\u00c6\u00c8\u0005=\u0000\u0000\u00c7"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c7\u00c1\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8"+
		"\u0014\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005=\u0000\u0000\u00ca\u0016"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005=\u0000\u0000\u00cc\u0018\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0005a\u0000\u0000\u00ce\u00cf\u0005s\u0000"+
		"\u0000\u00cf\u001a\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005f\u0000\u0000"+
		"\u00d1\u00d2\u0005r\u0000\u0000\u00d2\u00d3\u0005o\u0000\u0000\u00d3\u00d4"+
		"\u0005m\u0000\u0000\u00d4\u001c\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"+
		"i\u0000\u0000\u00d6\u00d7\u0005m\u0000\u0000\u00d7\u00d8\u0005p\u0000"+
		"\u0000\u00d8\u00d9\u0005o\u0000\u0000\u00d9\u00da\u0005r\u0000\u0000\u00da"+
		"\u00db\u0005t\u0000\u0000\u00db\u001e\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0005c\u0000\u0000\u00dd\u00de\u0005o\u0000\u0000\u00de\u00df\u0005n"+
		"\u0000\u0000\u00df\u00e0\u0005s\u0000\u0000\u00e0\u00e1\u0005t\u0000\u0000"+
		"\u00e1 \u0001\u0000\u0000\u0000\u00e2\u00e3\u0005v\u0000\u0000\u00e3\u00e4"+
		"\u0005a\u0000\u0000\u00e4\u00e5\u0005r\u0000\u0000\u00e5\"\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0005l\u0000\u0000\u00e7\u00e8\u0005e\u0000\u0000"+
		"\u00e8\u00e9\u0005t\u0000\u0000\u00e9$\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0005[\u0000\u0000\u00eb&\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005]"+
		"\u0000\u0000\u00ed(\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005(\u0000\u0000"+
		"\u00ef*\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005)\u0000\u0000\u00f1,"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005{\u0000\u0000\u00f3.\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0005}\u0000\u0000\u00f50\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0005f\u0000\u0000\u00f7\u00f8\u0005o\u0000\u0000\u00f8\u00f9"+
		"\u0005r\u0000\u0000\u00f92\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005i"+
		"\u0000\u0000\u00fb\u00fc\u0005n\u0000\u0000\u00fc4\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0005o\u0000\u0000\u00fe\u00ff\u0005f\u0000\u0000\u00ff6"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0005c\u0000\u0000\u0101\u0102\u0005"+
		"o\u0000\u0000\u0102\u0103\u0005n\u0000\u0000\u0103\u0104\u0005t\u0000"+
		"\u0000\u0104\u0105\u0005i\u0000\u0000\u0105\u0106\u0005n\u0000\u0000\u0106"+
		"\u0107\u0005u\u0000\u0000\u0107\u0108\u0005e\u0000\u0000\u01088\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0005b\u0000\u0000\u010a\u010b\u0005r\u0000"+
		"\u0000\u010b\u010c\u0005e\u0000\u0000\u010c\u010d\u0005a\u0000\u0000\u010d"+
		"\u010e\u0005k\u0000\u0000\u010e:\u0001\u0000\u0000\u0000\u010f\u0110\u0005"+
		"w\u0000\u0000\u0110\u0111\u0005h\u0000\u0000\u0111\u0112\u0005i\u0000"+
		"\u0000\u0112\u0113\u0005l\u0000\u0000\u0113\u0114\u0005e\u0000\u0000\u0114"+
		"<\u0001\u0000\u0000\u0000\u0115\u0116\u0005d\u0000\u0000\u0116\u0117\u0005"+
		"o\u0000\u0000\u0117>\u0001\u0000\u0000\u0000\u0118\u0119\u0005i\u0000"+
		"\u0000\u0119\u011a\u0005f\u0000\u0000\u011a@\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u0005e\u0000\u0000\u011c\u011d\u0005l\u0000\u0000\u011d\u011e\u0005"+
		"s\u0000\u0000\u011e\u011f\u0005e\u0000\u0000\u011fB\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0005e\u0000\u0000\u0121\u0122\u0005l\u0000\u0000\u0122"+
		"\u0123\u0005i\u0000\u0000\u0123\u0124\u0005f\u0000\u0000\u0124D\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0005s\u0000\u0000\u0126\u0127\u0005w\u0000"+
		"\u0000\u0127\u0128\u0005i\u0000\u0000\u0128\u0129\u0005t\u0000\u0000\u0129"+
		"\u012a\u0005c\u0000\u0000\u012a\u012b\u0005h\u0000\u0000\u012bF\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0005m\u0000\u0000\u012d\u012e\u0005a\u0000"+
		"\u0000\u012e\u012f\u0005t\u0000\u0000\u012f\u0130\u0005c\u0000\u0000\u0130"+
		"\u0131\u0005h\u0000\u0000\u0131H\u0001\u0000\u0000\u0000\u0132\u0133\u0005"+
		"c\u0000\u0000\u0133\u0134\u0005a\u0000\u0000\u0134\u0135\u0005s\u0000"+
		"\u0000\u0135\u0136\u0005e\u0000\u0000\u0136J\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0005d\u0000\u0000\u0138\u0139\u0005e\u0000\u0000\u0139\u013a\u0005"+
		"f\u0000\u0000\u013a\u013b\u0005a\u0000\u0000\u013b\u013c\u0005u\u0000"+
		"\u0000\u013c\u013d\u0005l\u0000\u0000\u013d\u013e\u0005t\u0000\u0000\u013e"+
		"L\u0001\u0000\u0000\u0000\u013f\u0140\u0005f\u0000\u0000\u0140\u0141\u0005"+
		"i\u0000\u0000\u0141\u0142\u0005n\u0000\u0000\u0142\u0143\u0005a\u0000"+
		"\u0000\u0143\u0144\u0005l\u0000\u0000\u0144\u0145\u0005l\u0000\u0000\u0145"+
		"\u0146\u0005y\u0000\u0000\u0146N\u0001\u0000\u0000\u0000\u0147\u0148\u0005"+
		"c\u0000\u0000\u0148\u0149\u0005l\u0000\u0000\u0149\u014a\u0005a\u0000"+
		"\u0000\u014a\u014b\u0005s\u0000\u0000\u014b\u014c\u0005s\u0000\u0000\u014c"+
		"P\u0001\u0000\u0000\u0000\u014d\u014e\u0005c\u0000\u0000\u014e\u014f\u0005"+
		"o\u0000\u0000\u014f\u0150\u0005n\u0000\u0000\u0150\u0151\u0005s\u0000"+
		"\u0000\u0151\u0152\u0005t\u0000\u0000\u0152\u0153\u0005r\u0000\u0000\u0153"+
		"\u0154\u0005u\u0000\u0000\u0154\u0155\u0005c\u0000\u0000\u0155\u0156\u0005"+
		"t\u0000\u0000\u0156\u0157\u0005o\u0000\u0000\u0157\u0158\u0005r\u0000"+
		"\u0000\u0158R\u0001\u0000\u0000\u0000\u0159\u015a\u0005t\u0000\u0000\u015a"+
		"\u015b\u0005h\u0000\u0000\u015b\u015c\u0005i\u0000\u0000\u015c\u015d\u0005"+
		"s\u0000\u0000\u015dT\u0001\u0000\u0000\u0000\u015e\u015f\u0005n\u0000"+
		"\u0000\u015f\u0160\u0005e\u0000\u0000\u0160\u0161\u0005w\u0000\u0000\u0161"+
		"V\u0001\u0000\u0000\u0000\u0162\u0163\u0005r\u0000\u0000\u0163\u0164\u0005"+
		"e\u0000\u0000\u0164\u0165\u0005t\u0000\u0000\u0165\u0166\u0005u\u0000"+
		"\u0000\u0166\u0167\u0005r\u0000\u0000\u0167\u0168\u0005n\u0000\u0000\u0168"+
		"X\u0001\u0000\u0000\u0000\u0169\u016a\u0005i\u0000\u0000\u016a\u016b\u0005"+
		"n\u0000\u0000\u016b\u0181\u0005t\u0000\u0000\u016c\u016d\u0005f\u0000"+
		"\u0000\u016d\u016e\u0005l\u0000\u0000\u016e\u016f\u0005o\u0000\u0000\u016f"+
		"\u0170\u0005a\u0000\u0000\u0170\u0181\u0005t\u0000\u0000\u0171\u0172\u0005"+
		"d\u0000\u0000\u0172\u0173\u0005o\u0000\u0000\u0173\u0174\u0005u\u0000"+
		"\u0000\u0174\u0175\u0005b\u0000\u0000\u0175\u0176\u0005l\u0000\u0000\u0176"+
		"\u0181\u0005e\u0000\u0000\u0177\u0178\u0005l\u0000\u0000\u0178\u0179\u0005"+
		"o\u0000\u0000\u0179\u017a\u0005n\u0000\u0000\u017a\u0181\u0005g\u0000"+
		"\u0000\u017b\u017c\u0005s\u0000\u0000\u017c\u017d\u0005h\u0000\u0000\u017d"+
		"\u017e\u0005o\u0000\u0000\u017e\u017f\u0005r\u0000\u0000\u017f\u0181\u0005"+
		"t\u0000\u0000\u0180\u0169\u0001\u0000\u0000\u0000\u0180\u016c\u0001\u0000"+
		"\u0000\u0000\u0180\u0171\u0001\u0000\u0000\u0000\u0180\u0177\u0001\u0000"+
		"\u0000\u0000\u0180\u017b\u0001\u0000\u0000\u0000\u0181Z\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0005f\u0000\u0000\u0183\u0184\u0005u\u0000\u0000\u0184"+
		"\u0185\u0005n\u0000\u0000\u0185\u0186\u0005c\u0000\u0000\u0186\u0187\u0005"+
		"t\u0000\u0000\u0187\u0188\u0005i\u0000\u0000\u0188\u0189\u0005o\u0000"+
		"\u0000\u0189\u018a\u0005n\u0000\u0000\u018a\\\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0005t\u0000\u0000\u018c\u018d\u0005r\u0000\u0000\u018d\u018e"+
		"\u0005y\u0000\u0000\u018e^\u0001\u0000\u0000\u0000\u018f\u0190\u0005c"+
		"\u0000\u0000\u0190\u0191\u0005a\u0000\u0000\u0191\u0192\u0005t\u0000\u0000"+
		"\u0192\u0193\u0005c\u0000\u0000\u0193\u0194\u0005h\u0000\u0000\u0194`"+
		"\u0001\u0000\u0000\u0000\u0195\u0197\u0007\u0002\u0000\u0000\u0196\u0198"+
		"\u0007\u0003\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199\u019a"+
		"\u0001\u0000\u0000\u0000\u019ab\u0001\u0000\u0000\u0000\u019b\u019c\u0007"+
		"\u0002\u0000\u0000\u019cd\u0001\u0000\u0000\u0000\u019d\u019f\u0007\u0004"+
		"\u0000\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3\u00062\u0000"+
		"\u0000\u01a3f\u0001\u0000\u0000\u0000\u01a4\u01a8\u0005\'\u0000\u0000"+
		"\u01a5\u01a7\b\u0005\u0000\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7"+
		"\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a8\u0001\u0000\u0000\u0000\u01ab\u01b5\u0005\'\u0000\u0000\u01ac\u01b0"+
		"\u0005\"\u0000\u0000\u01ad\u01af\b\u0006\u0000\u0000\u01ae\u01ad\u0001"+
		"\u0000\u0000\u0000\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b5\u0005"+
		"\"\u0000\u0000\u01b4\u01a4\u0001\u0000\u0000\u0000\u01b4\u01ac\u0001\u0000"+
		"\u0000\u0000\u01b5h\u0001\u0000\u0000\u0000\u01b6\u01b8\u0005-\u0000\u0000"+
		"\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01bb\u0003k5\u0000\u01ba\u01bc"+
		"\u0003m6\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000"+
		"\u0000\u0000\u01bcj\u0001\u0000\u0000\u0000\u01bd\u01c0\u0003o7\u0000"+
		"\u01be\u01bf\u0005.\u0000\u0000\u01bf\u01c1\u0003o7\u0000\u01c0\u01be"+
		"\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1l\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c4\u0007\u0007\u0000\u0000\u01c3\u01c5\u0007"+
		"\b\u0000\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c7\u0003o7\u0000"+
		"\u01c7n\u0001\u0000\u0000\u0000\u01c8\u01ca\u0007\t\u0000\u0000\u01c9"+
		"\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb"+
		"\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc"+
		"p\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005/\u0000\u0000\u01ce\u01cf\u0005"+
		"/\u0000\u0000\u01cf\u01d3\u0001\u0000\u0000\u0000\u01d0\u01d2\b\n\u0000"+
		"\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d7\u00068\u0001\u0000\u01d7r\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d9\u0005/\u0000\u0000\u01d9\u01da\u0005*\u0000\u0000\u01da\u01de\u0001"+
		"\u0000\u0000\u0000\u01db\u01dd\t\u0000\u0000\u0000\u01dc\u01db\u0001\u0000"+
		"\u0000\u0000\u01dd\u01e0\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000"+
		"\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005*\u0000"+
		"\u0000\u01e2\u01e3\u0005/\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e5\u00069\u0001\u0000\u01e5t\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\u0005+\u0000\u0000\u01e7v\u0001\u0000\u0000\u0000\u01e8\u01e9\u0005-"+
		"\u0000\u0000\u01e9x\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005*\u0000\u0000"+
		"\u01ebz\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005/\u0000\u0000\u01ed|"+
		"\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005/\u0000\u0000\u01ef\u01f0\u0005"+
		"/\u0000\u0000\u01f0~\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005*\u0000"+
		"\u0000\u01f2\u01f3\u0005*\u0000\u0000\u01f3\u0080\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f5\u0005&\u0000\u0000\u01f5\u01f6\u0005&\u0000\u0000\u01f6\u0082"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005|\u0000\u0000\u01f8\u01f9\u0005"+
		"|\u0000\u0000\u01f9\u0084\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005=\u0000"+
		"\u0000\u01fb\u01fc\u0005=\u0000\u0000\u01fc\u0086\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fe\u0005!\u0000\u0000\u01fe\u01ff\u0005=\u0000\u0000\u01ff\u0088"+
		"\u0001\u0000\u0000\u0000\u0200\u0206\u0007\u0001\u0000\u0000\u0201\u0202"+
		"\u0005<\u0000\u0000\u0202\u0206\u0005=\u0000\u0000\u0203\u0204\u0005>"+
		"\u0000\u0000\u0204\u0206\u0005=\u0000\u0000\u0205\u0200\u0001\u0000\u0000"+
		"\u0000\u0205\u0201\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000"+
		"\u0000\u0206\u008a\u0001\u0000\u0000\u0000\u0207\u0208\u0005<\u0000\u0000"+
		"\u0208\u0209\u0005>\u0000\u0000\u0209\u008c\u0001\u0000\u0000\u0000\u020a"+
		"\u020b\u0005+\u0000\u0000\u020b\u0210\u0005+\u0000\u0000\u020c\u020d\u0005"+
		"-\u0000\u0000\u020d\u0210\u0005-\u0000\u0000\u020e\u0210\u0007\u000b\u0000"+
		"\u0000\u020f\u020a\u0001\u0000\u0000\u0000\u020f\u020c\u0001\u0000\u0000"+
		"\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u0210\u008e\u0001\u0000\u0000"+
		"\u0000\u0211\u0212\u0005#\u0000\u0000\u0212\u0213\u0005#\u0000\u0000\u0213"+
		"\u0214\u0005#\u0000\u0000\u0214\u0090\u0001\u0000\u0000\u0000\u0015\u0000"+
		"\u009f\u00a6\u00ac\u00bd\u00c7\u0180\u0199\u01a0\u01a8\u01b0\u01b4\u01b7"+
		"\u01bb\u01c0\u01c4\u01cb\u01d3\u01de\u0205\u020f\u0002\u0006\u0000\u0000"+
		"\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}