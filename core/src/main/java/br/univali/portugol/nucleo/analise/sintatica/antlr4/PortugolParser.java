// Generated from Portugol.g4 by ANTLR 4.13.2
package br.univali.portugol.nucleo.analise.sintatica.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PortugolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABRE_PARENTESES=1, FECHA_PARENTESES=2, ABRE_COLCHETES=3, FECHA_COLCHETES=4, 
		ABRE_CHAVES=5, FECHA_CHAVES=6, TIPO=7, FACA=8, ENQUANTO=9, PARA=10, SE=11, 
		SENAO=12, CONSTANTE=13, FUNCAO=14, PROGRAMA=15, ESCOLHA=16, CASO=17, CONTRARIO=18, 
		PARE=19, RETORNE=20, INCLUA=21, BIBLIOTECA=22, OP_NAO=23, OP_E_LOGICO=24, 
		OP_OU_LOGICO=25, OP_SUBTRACAO=26, OP_ADICAO=27, OP_MULTIPLICACAO=28, OP_DIVISAO=29, 
		OP_MOD=30, OP_ATRIBUICAO=31, OP_IGUALDADE=32, OP_DIFERENCA=33, OP_MAIOR=34, 
		OP_MENOR=35, OP_MENOR_IGUAL=36, OP_MAIOR_IGUAL=37, OP_INCREMENTO_UNARIO=38, 
		OP_DECREMENTO_UNARIO=39, OP_SHIFT_LEFT=40, OP_SHIFT_RIGHT=41, OP_XOR=42, 
		OP_OU_BITWISE=43, OP_NOT_BITWISE=44, OP_ALIAS_BIBLIOTECA=45, E_COMERCIAL=46, 
		OP_MAIS_IGUAL=47, OP_MENOS_IGUAL=48, OP_MULTIPLICACAO_IGUAL=49, OP_DIVISAO_IGUAL=50, 
		LOGICO=51, VERDADEIRO=52, FALSO=53, CARACTER=54, STRING=55, ID=56, REAL=57, 
		INT=58, HEXADECIMAL=59, COMENTARIO=60, COMENTARIO_SIMPLES=61, WS=62, PONTO=63, 
		VIRGULA=64, PONTOVIRGULA=65, DOISPONTOS=66;
	public static final int
		RULE_arquivo = 0, RULE_inclusaoBiblioteca = 1, RULE_listaDeclaracoes = 2, 
		RULE_declaracao = 3, RULE_declaracaoVariavel = 4, RULE_declaracaoMatriz = 5, 
		RULE_inicializacaoMatriz = 6, RULE_linhaMatriz = 7, RULE_colunaMatriz = 8, 
		RULE_declaracaoArray = 9, RULE_inicializacaoArray = 10, RULE_tamanhoArray = 11, 
		RULE_declaracaoFuncao = 12, RULE_parametroFuncao = 13, RULE_listaParametros = 14, 
		RULE_parametro = 15, RULE_parametroArray = 16, RULE_parametroMatriz = 17, 
		RULE_comando = 18, RULE_atribuicao = 19, RULE_atribuicaoComposta = 20, 
		RULE_retorne = 21, RULE_se = 22, RULE_senao = 23, RULE_enquanto = 24, 
		RULE_facaEnquanto = 25, RULE_para = 26, RULE_listaComandos = 27, RULE_inicializacaoPara = 28, 
		RULE_condicao = 29, RULE_incrementoPara = 30, RULE_escolha = 31, RULE_caso = 32, 
		RULE_pare = 33, RULE_indiceArray = 34, RULE_expressao = 35, RULE_listaExpressoes = 36, 
		RULE_escopoBiblioteca = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"arquivo", "inclusaoBiblioteca", "listaDeclaracoes", "declaracao", "declaracaoVariavel", 
			"declaracaoMatriz", "inicializacaoMatriz", "linhaMatriz", "colunaMatriz", 
			"declaracaoArray", "inicializacaoArray", "tamanhoArray", "declaracaoFuncao", 
			"parametroFuncao", "listaParametros", "parametro", "parametroArray", 
			"parametroMatriz", "comando", "atribuicao", "atribuicaoComposta", "retorne", 
			"se", "senao", "enquanto", "facaEnquanto", "para", "listaComandos", "inicializacaoPara", 
			"condicao", "incrementoPara", "escolha", "caso", "pare", "indiceArray", 
			"expressao", "listaExpressoes", "escopoBiblioteca"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", null, "'faca'", "'enquanto'", 
			"'para'", "'se'", "'senao'", "'const'", "'funcao'", "'programa'", "'escolha'", 
			"'caso'", "'contrario'", "'pare'", "'retorne'", "'inclua'", "'biblioteca'", 
			"'nao'", "'e'", "'ou'", "'-'", "'+'", "'*'", "'/'", "'%'", "'='", "'=='", 
			"'!='", "'>'", "'<'", "'<='", "'>='", "'++'", "'--'", "'<<'", "'>>'", 
			"'^'", "'|'", "'~'", "'-->'", "'&'", "'+='", "'-='", "'*='", "'/='", 
			null, "'verdadeiro'", "'falso'", null, null, null, null, null, null, 
			null, null, null, "'.'", "','", "';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABRE_PARENTESES", "FECHA_PARENTESES", "ABRE_COLCHETES", "FECHA_COLCHETES", 
			"ABRE_CHAVES", "FECHA_CHAVES", "TIPO", "FACA", "ENQUANTO", "PARA", "SE", 
			"SENAO", "CONSTANTE", "FUNCAO", "PROGRAMA", "ESCOLHA", "CASO", "CONTRARIO", 
			"PARE", "RETORNE", "INCLUA", "BIBLIOTECA", "OP_NAO", "OP_E_LOGICO", "OP_OU_LOGICO", 
			"OP_SUBTRACAO", "OP_ADICAO", "OP_MULTIPLICACAO", "OP_DIVISAO", "OP_MOD", 
			"OP_ATRIBUICAO", "OP_IGUALDADE", "OP_DIFERENCA", "OP_MAIOR", "OP_MENOR", 
			"OP_MENOR_IGUAL", "OP_MAIOR_IGUAL", "OP_INCREMENTO_UNARIO", "OP_DECREMENTO_UNARIO", 
			"OP_SHIFT_LEFT", "OP_SHIFT_RIGHT", "OP_XOR", "OP_OU_BITWISE", "OP_NOT_BITWISE", 
			"OP_ALIAS_BIBLIOTECA", "E_COMERCIAL", "OP_MAIS_IGUAL", "OP_MENOS_IGUAL", 
			"OP_MULTIPLICACAO_IGUAL", "OP_DIVISAO_IGUAL", "LOGICO", "VERDADEIRO", 
			"FALSO", "CARACTER", "STRING", "ID", "REAL", "INT", "HEXADECIMAL", "COMENTARIO", 
			"COMENTARIO_SIMPLES", "WS", "PONTO", "VIRGULA", "PONTOVIRGULA", "DOISPONTOS"
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

	@Override
	public String getGrammarFileName() { return "Portugol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PortugolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArquivoContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(PortugolParser.PROGRAMA, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(PortugolParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(PortugolParser.FECHA_CHAVES, 0); }
		public List<InclusaoBibliotecaContext> inclusaoBiblioteca() {
			return getRuleContexts(InclusaoBibliotecaContext.class);
		}
		public InclusaoBibliotecaContext inclusaoBiblioteca(int i) {
			return getRuleContext(InclusaoBibliotecaContext.class,i);
		}
		public List<DeclaracaoFuncaoContext> declaracaoFuncao() {
			return getRuleContexts(DeclaracaoFuncaoContext.class);
		}
		public DeclaracaoFuncaoContext declaracaoFuncao(int i) {
			return getRuleContext(DeclaracaoFuncaoContext.class,i);
		}
		public List<ListaDeclaracoesContext> listaDeclaracoes() {
			return getRuleContexts(ListaDeclaracoesContext.class);
		}
		public ListaDeclaracoesContext listaDeclaracoes(int i) {
			return getRuleContext(ListaDeclaracoesContext.class,i);
		}
		public ArquivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arquivo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitArquivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArquivoContext arquivo() throws RecognitionException {
		ArquivoContext _localctx = new ArquivoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_arquivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(PROGRAMA);
			setState(77);
			match(ABRE_CHAVES);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUA) {
				{
				{
				setState(78);
				inclusaoBiblioteca();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 24704L) != 0)) {
				{
				setState(86);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNCAO:
					{
					setState(84);
					declaracaoFuncao();
					}
					break;
				case TIPO:
				case CONSTANTE:
					{
					setState(85);
					listaDeclaracoes();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(FECHA_CHAVES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InclusaoBibliotecaContext extends ParserRuleContext {
		public TerminalNode INCLUA() { return getToken(PortugolParser.INCLUA, 0); }
		public TerminalNode BIBLIOTECA() { return getToken(PortugolParser.BIBLIOTECA, 0); }
		public List<TerminalNode> ID() { return getTokens(PortugolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PortugolParser.ID, i);
		}
		public TerminalNode OP_ALIAS_BIBLIOTECA() { return getToken(PortugolParser.OP_ALIAS_BIBLIOTECA, 0); }
		public InclusaoBibliotecaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusaoBiblioteca; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitInclusaoBiblioteca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusaoBibliotecaContext inclusaoBiblioteca() throws RecognitionException {
		InclusaoBibliotecaContext _localctx = new InclusaoBibliotecaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inclusaoBiblioteca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(INCLUA);
			setState(94);
			match(BIBLIOTECA);
			setState(95);
			match(ID);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ALIAS_BIBLIOTECA) {
				{
				setState(96);
				match(OP_ALIAS_BIBLIOTECA);
				setState(97);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaDeclaracoesContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(PortugolParser.TIPO, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public TerminalNode CONSTANTE() { return getToken(PortugolParser.CONSTANTE, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(PortugolParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(PortugolParser.VIRGULA, i);
		}
		public ListaDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracoes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitListaDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaDeclaracoesContext listaDeclaracoes() throws RecognitionException {
		ListaDeclaracoesContext _localctx = new ListaDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listaDeclaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANTE) {
				{
				setState(100);
				match(CONSTANTE);
				}
			}

			setState(103);
			match(TIPO);
			setState(104);
			declaracao();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(105);
				match(VIRGULA);
				setState(106);
				declaracao();
				}
				}
				setState(111);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaoVariavelContext declaracaoVariavel() {
			return getRuleContext(DeclaracaoVariavelContext.class,0);
		}
		public DeclaracaoArrayContext declaracaoArray() {
			return getRuleContext(DeclaracaoArrayContext.class,0);
		}
		public DeclaracaoMatrizContext declaracaoMatriz() {
			return getRuleContext(DeclaracaoMatrizContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				declaracaoVariavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				declaracaoArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				declaracaoMatriz();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoVariavelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode OP_ATRIBUICAO() { return getToken(PortugolParser.OP_ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclaracaoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariavel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDeclaracaoVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoVariavelContext declaracaoVariavel() throws RecognitionException {
		DeclaracaoVariavelContext _localctx = new DeclaracaoVariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracaoVariavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ID);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATRIBUICAO) {
				{
				setState(118);
				match(OP_ATRIBUICAO);
				setState(119);
				expressao(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoMatrizContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public List<TerminalNode> ABRE_COLCHETES() { return getTokens(PortugolParser.ABRE_COLCHETES); }
		public TerminalNode ABRE_COLCHETES(int i) {
			return getToken(PortugolParser.ABRE_COLCHETES, i);
		}
		public List<TerminalNode> FECHA_COLCHETES() { return getTokens(PortugolParser.FECHA_COLCHETES); }
		public TerminalNode FECHA_COLCHETES(int i) {
			return getToken(PortugolParser.FECHA_COLCHETES, i);
		}
		public LinhaMatrizContext linhaMatriz() {
			return getRuleContext(LinhaMatrizContext.class,0);
		}
		public ColunaMatrizContext colunaMatriz() {
			return getRuleContext(ColunaMatrizContext.class,0);
		}
		public TerminalNode OP_ATRIBUICAO() { return getToken(PortugolParser.OP_ATRIBUICAO, 0); }
		public InicializacaoMatrizContext inicializacaoMatriz() {
			return getRuleContext(InicializacaoMatrizContext.class,0);
		}
		public DeclaracaoMatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoMatriz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDeclaracaoMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoMatrizContext declaracaoMatriz() throws RecognitionException {
		DeclaracaoMatrizContext _localctx = new DeclaracaoMatrizContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracaoMatriz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ID);
			setState(123);
			match(ABRE_COLCHETES);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1137177322940530690L) != 0)) {
				{
				setState(124);
				linhaMatriz();
				}
			}

			setState(127);
			match(FECHA_COLCHETES);
			setState(128);
			match(ABRE_COLCHETES);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1137177322940530690L) != 0)) {
				{
				setState(129);
				colunaMatriz();
				}
			}

			setState(132);
			match(FECHA_COLCHETES);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATRIBUICAO) {
				{
				setState(133);
				match(OP_ATRIBUICAO);
				setState(134);
				inicializacaoMatriz();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InicializacaoMatrizContext extends ParserRuleContext {
		public TerminalNode ABRE_CHAVES() { return getToken(PortugolParser.ABRE_CHAVES, 0); }
		public List<InicializacaoArrayContext> inicializacaoArray() {
			return getRuleContexts(InicializacaoArrayContext.class);
		}
		public InicializacaoArrayContext inicializacaoArray(int i) {
			return getRuleContext(InicializacaoArrayContext.class,i);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(PortugolParser.FECHA_CHAVES, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(PortugolParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(PortugolParser.VIRGULA, i);
		}
		public InicializacaoMatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacaoMatriz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitInicializacaoMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacaoMatrizContext inicializacaoMatriz() throws RecognitionException {
		InicializacaoMatrizContext _localctx = new InicializacaoMatrizContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inicializacaoMatriz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(ABRE_CHAVES);
			setState(138);
			inicializacaoArray();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(139);
				match(VIRGULA);
				setState(140);
				inicializacaoArray();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(FECHA_CHAVES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LinhaMatrizContext extends ParserRuleContext {
		public TamanhoArrayContext tamanhoArray() {
			return getRuleContext(TamanhoArrayContext.class,0);
		}
		public LinhaMatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linhaMatriz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitLinhaMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinhaMatrizContext linhaMatriz() throws RecognitionException {
		LinhaMatrizContext _localctx = new LinhaMatrizContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_linhaMatriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			tamanhoArray();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColunaMatrizContext extends ParserRuleContext {
		public TamanhoArrayContext tamanhoArray() {
			return getRuleContext(TamanhoArrayContext.class,0);
		}
		public ColunaMatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colunaMatriz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitColunaMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColunaMatrizContext colunaMatriz() throws RecognitionException {
		ColunaMatrizContext _localctx = new ColunaMatrizContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_colunaMatriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			tamanhoArray();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode ABRE_COLCHETES() { return getToken(PortugolParser.ABRE_COLCHETES, 0); }
		public TerminalNode FECHA_COLCHETES() { return getToken(PortugolParser.FECHA_COLCHETES, 0); }
		public TamanhoArrayContext tamanhoArray() {
			return getRuleContext(TamanhoArrayContext.class,0);
		}
		public TerminalNode OP_ATRIBUICAO() { return getToken(PortugolParser.OP_ATRIBUICAO, 0); }
		public InicializacaoArrayContext inicializacaoArray() {
			return getRuleContext(InicializacaoArrayContext.class,0);
		}
		public DeclaracaoArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDeclaracaoArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoArrayContext declaracaoArray() throws RecognitionException {
		DeclaracaoArrayContext _localctx = new DeclaracaoArrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracaoArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ID);
			setState(153);
			match(ABRE_COLCHETES);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1137177322940530690L) != 0)) {
				{
				setState(154);
				tamanhoArray();
				}
			}

			setState(157);
			match(FECHA_COLCHETES);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATRIBUICAO) {
				{
				setState(158);
				match(OP_ATRIBUICAO);
				setState(159);
				inicializacaoArray();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InicializacaoArrayContext extends ParserRuleContext {
		public TerminalNode ABRE_CHAVES() { return getToken(PortugolParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(PortugolParser.FECHA_CHAVES, 0); }
		public ListaExpressoesContext listaExpressoes() {
			return getRuleContext(ListaExpressoesContext.class,0);
		}
		public InicializacaoArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacaoArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitInicializacaoArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacaoArrayContext inicializacaoArray() throws RecognitionException {
		InicializacaoArrayContext _localctx = new InicializacaoArrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inicializacaoArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ABRE_CHAVES);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1137177322940530690L) != 0)) {
				{
				setState(163);
				listaExpressoes();
				}
			}

			setState(166);
			match(FECHA_CHAVES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TamanhoArrayContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TamanhoArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tamanhoArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitTamanhoArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TamanhoArrayContext tamanhoArray() throws RecognitionException {
		TamanhoArrayContext _localctx = new TamanhoArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tamanhoArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			expressao(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoFuncaoContext extends ParserRuleContext {
		public TerminalNode FUNCAO() { return getToken(PortugolParser.FUNCAO, 0); }
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public ParametroFuncaoContext parametroFuncao() {
			return getRuleContext(ParametroFuncaoContext.class,0);
		}
		public TerminalNode ABRE_CHAVES() { return getToken(PortugolParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(PortugolParser.FECHA_CHAVES, 0); }
		public TerminalNode TIPO() { return getToken(PortugolParser.TIPO, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public DeclaracaoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoFuncao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDeclaracaoFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoFuncaoContext declaracaoFuncao() throws RecognitionException {
		DeclaracaoFuncaoContext _localctx = new DeclaracaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaracaoFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(FUNCAO);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(171);
				match(TIPO);
				}
			}

			setState(174);
			match(ID);
			setState(175);
			parametroFuncao();
			setState(176);
			match(ABRE_CHAVES);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1137177322942181250L) != 0)) {
				{
				{
				setState(177);
				comando();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(FECHA_CHAVES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroFuncaoContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(PortugolParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(PortugolParser.FECHA_PARENTESES, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public ParametroFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroFuncao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitParametroFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroFuncaoContext parametroFuncao() throws RecognitionException {
		ParametroFuncaoContext _localctx = new ParametroFuncaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametroFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ABRE_PARENTESES);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(186);
				listaParametros();
				}
			}

			setState(189);
			match(FECHA_PARENTESES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(PortugolParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(PortugolParser.VIRGULA, i);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitListaParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			parametro();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(192);
				match(VIRGULA);
				setState(193);
				parametro();
				}
				}
				setState(198);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(PortugolParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode E_COMERCIAL() { return getToken(PortugolParser.E_COMERCIAL, 0); }
		public ParametroArrayContext parametroArray() {
			return getRuleContext(ParametroArrayContext.class,0);
		}
		public ParametroMatrizContext parametroMatriz() {
			return getRuleContext(ParametroMatrizContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(TIPO);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==E_COMERCIAL) {
				{
				setState(200);
				match(E_COMERCIAL);
				}
			}

			setState(203);
			match(ID);
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(204);
				parametroArray();
				}
				break;
			case 2:
				{
				setState(205);
				parametroMatriz();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroArrayContext extends ParserRuleContext {
		public TerminalNode ABRE_COLCHETES() { return getToken(PortugolParser.ABRE_COLCHETES, 0); }
		public TerminalNode FECHA_COLCHETES() { return getToken(PortugolParser.FECHA_COLCHETES, 0); }
		public ParametroArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitParametroArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroArrayContext parametroArray() throws RecognitionException {
		ParametroArrayContext _localctx = new ParametroArrayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parametroArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(ABRE_COLCHETES);
			setState(209);
			match(FECHA_COLCHETES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroMatrizContext extends ParserRuleContext {
		public List<TerminalNode> ABRE_COLCHETES() { return getTokens(PortugolParser.ABRE_COLCHETES); }
		public TerminalNode ABRE_COLCHETES(int i) {
			return getToken(PortugolParser.ABRE_COLCHETES, i);
		}
		public List<TerminalNode> FECHA_COLCHETES() { return getTokens(PortugolParser.FECHA_COLCHETES); }
		public TerminalNode FECHA_COLCHETES(int i) {
			return getToken(PortugolParser.FECHA_COLCHETES, i);
		}
		public ParametroMatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroMatriz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitParametroMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroMatrizContext parametroMatriz() throws RecognitionException {
		ParametroMatrizContext _localctx = new ParametroMatrizContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parametroMatriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(ABRE_COLCHETES);
			setState(212);
			match(FECHA_COLCHETES);
			setState(213);
			match(ABRE_COLCHETES);
			setState(214);
			match(FECHA_COLCHETES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public FacaEnquantoContext facaEnquanto() {
			return getRuleContext(FacaEnquantoContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public EscolhaContext escolha() {
			return getRuleContext(EscolhaContext.class,0);
		}
		public RetorneContext retorne() {
			return getRuleContext(RetorneContext.class,0);
		}
		public PareContext pare() {
			return getRuleContext(PareContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public AtribuicaoCompostaContext atribuicaoComposta() {
			return getRuleContext(AtribuicaoCompostaContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comando);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				listaDeclaracoes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				se();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				enquanto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				facaEnquanto();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				para();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(221);
				escolha();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(222);
				retorne();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(223);
				pare();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(224);
				atribuicao();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(225);
				atribuicaoComposta();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(226);
				expressao(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_ATRIBUICAO() { return getToken(PortugolParser.OP_ATRIBUICAO, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			expressao(0);
			setState(230);
			match(OP_ATRIBUICAO);
			setState(231);
			expressao(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoCompostaContext extends ParserRuleContext {
		public AtribuicaoCompostaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoComposta; }
	 
		public AtribuicaoCompostaContext() { }
		public void copyFrom(AtribuicaoCompostaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoCompostaSomaContext extends AtribuicaoCompostaContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_MAIS_IGUAL() { return getToken(PortugolParser.OP_MAIS_IGUAL, 0); }
		public AtribuicaoCompostaSomaContext(AtribuicaoCompostaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAtribuicaoCompostaSoma(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoCompostaSubtracaoContext extends AtribuicaoCompostaContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_MENOS_IGUAL() { return getToken(PortugolParser.OP_MENOS_IGUAL, 0); }
		public AtribuicaoCompostaSubtracaoContext(AtribuicaoCompostaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAtribuicaoCompostaSubtracao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoCompostaMultiplicacaoContext extends AtribuicaoCompostaContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_MULTIPLICACAO_IGUAL() { return getToken(PortugolParser.OP_MULTIPLICACAO_IGUAL, 0); }
		public AtribuicaoCompostaMultiplicacaoContext(AtribuicaoCompostaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAtribuicaoCompostaMultiplicacao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoCompostaDivisaoContext extends AtribuicaoCompostaContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_DIVISAO_IGUAL() { return getToken(PortugolParser.OP_DIVISAO_IGUAL, 0); }
		public AtribuicaoCompostaDivisaoContext(AtribuicaoCompostaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAtribuicaoCompostaDivisao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoCompostaContext atribuicaoComposta() throws RecognitionException {
		AtribuicaoCompostaContext _localctx = new AtribuicaoCompostaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atribuicaoComposta);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new AtribuicaoCompostaSomaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				expressao(0);
				setState(234);
				match(OP_MAIS_IGUAL);
				setState(235);
				expressao(0);
				}
				break;
			case 2:
				_localctx = new AtribuicaoCompostaSubtracaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				expressao(0);
				setState(238);
				match(OP_MENOS_IGUAL);
				setState(239);
				expressao(0);
				}
				break;
			case 3:
				_localctx = new AtribuicaoCompostaMultiplicacaoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				expressao(0);
				setState(242);
				match(OP_MULTIPLICACAO_IGUAL);
				setState(243);
				expressao(0);
				}
				break;
			case 4:
				_localctx = new AtribuicaoCompostaDivisaoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				expressao(0);
				setState(246);
				match(OP_DIVISAO_IGUAL);
				setState(247);
				expressao(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RetorneContext extends ParserRuleContext {
		public TerminalNode RETORNE() { return getToken(PortugolParser.RETORNE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RetorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorne; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitRetorne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetorneContext retorne() throws RecognitionException {
		RetorneContext _localctx = new RetorneContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_retorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(RETORNE);
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(252);
				expressao(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class SeContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(PortugolParser.SE, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(PortugolParser.ABRE_PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(PortugolParser.FECHA_PARENTESES, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(SE);
			setState(256);
			match(ABRE_PARENTESES);
			setState(257);
			expressao(0);
			setState(258);
			match(FECHA_PARENTESES);
			setState(259);
			listaComandos();
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(260);
				senao();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class SenaoContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(PortugolParser.SENAO, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitSenao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(SENAO);
			setState(264);
			listaComandos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(PortugolParser.ENQUANTO, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(PortugolParser.ABRE_PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(PortugolParser.FECHA_PARENTESES, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(ENQUANTO);
			setState(267);
			match(ABRE_PARENTESES);
			setState(268);
			expressao(0);
			setState(269);
			match(FECHA_PARENTESES);
			setState(270);
			listaComandos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FacaEnquantoContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(PortugolParser.FACA, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TerminalNode ENQUANTO() { return getToken(PortugolParser.ENQUANTO, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(PortugolParser.ABRE_PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(PortugolParser.FECHA_PARENTESES, 0); }
		public FacaEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facaEnquanto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitFacaEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FacaEnquantoContext facaEnquanto() throws RecognitionException {
		FacaEnquantoContext _localctx = new FacaEnquantoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_facaEnquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(FACA);
			setState(273);
			listaComandos();
			setState(274);
			match(ENQUANTO);
			setState(275);
			match(ABRE_PARENTESES);
			setState(276);
			expressao(0);
			setState(277);
			match(FECHA_PARENTESES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(PortugolParser.PARA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(PortugolParser.ABRE_PARENTESES, 0); }
		public List<TerminalNode> PONTOVIRGULA() { return getTokens(PortugolParser.PONTOVIRGULA); }
		public TerminalNode PONTOVIRGULA(int i) {
			return getToken(PortugolParser.PONTOVIRGULA, i);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public IncrementoParaContext incrementoPara() {
			return getRuleContext(IncrementoParaContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(PortugolParser.FECHA_PARENTESES, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public InicializacaoParaContext inicializacaoPara() {
			return getRuleContext(InicializacaoParaContext.class,0);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(PARA);
			setState(280);
			match(ABRE_PARENTESES);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1137177322940539010L) != 0)) {
				{
				setState(281);
				inicializacaoPara();
				}
			}

			setState(284);
			match(PONTOVIRGULA);
			setState(285);
			condicao();
			setState(286);
			match(PONTOVIRGULA);
			setState(287);
			incrementoPara();
			setState(288);
			match(FECHA_PARENTESES);
			setState(289);
			listaComandos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaComandosContext extends ParserRuleContext {
		public TerminalNode ABRE_CHAVES() { return getToken(PortugolParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(PortugolParser.FECHA_CHAVES, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ListaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitListaComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listaComandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_CHAVES:
				{
				setState(291);
				match(ABRE_CHAVES);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1137177322942181250L) != 0)) {
					{
					{
					setState(292);
					comando();
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(298);
				match(FECHA_CHAVES);
				}
				break;
			case ABRE_PARENTESES:
			case TIPO:
			case FACA:
			case ENQUANTO:
			case PARA:
			case SE:
			case CONSTANTE:
			case ESCOLHA:
			case PARE:
			case RETORNE:
			case OP_NAO:
			case OP_SUBTRACAO:
			case OP_ADICAO:
			case OP_INCREMENTO_UNARIO:
			case OP_DECREMENTO_UNARIO:
			case OP_NOT_BITWISE:
			case LOGICO:
			case CARACTER:
			case STRING:
			case ID:
			case REAL:
			case INT:
			case HEXADECIMAL:
				{
				setState(299);
				comando();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InicializacaoParaContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public InicializacaoParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacaoPara; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitInicializacaoPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacaoParaContext inicializacaoPara() throws RecognitionException {
		InicializacaoParaContext _localctx = new InicializacaoParaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_inicializacaoPara);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				listaDeclaracoes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitCondicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			expressao(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncrementoParaContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoCompostaContext atribuicaoComposta() {
			return getRuleContext(AtribuicaoCompostaContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public IncrementoParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementoPara; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitIncrementoPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementoParaContext incrementoPara() throws RecognitionException {
		IncrementoParaContext _localctx = new IncrementoParaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_incrementoPara);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				expressao(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				atribuicaoComposta();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				atribuicao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EscolhaContext extends ParserRuleContext {
		public TerminalNode ESCOLHA() { return getToken(PortugolParser.ESCOLHA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(PortugolParser.ABRE_PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(PortugolParser.FECHA_PARENTESES, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(PortugolParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(PortugolParser.FECHA_CHAVES, 0); }
		public List<CasoContext> caso() {
			return getRuleContexts(CasoContext.class);
		}
		public CasoContext caso(int i) {
			return getRuleContext(CasoContext.class,i);
		}
		public EscolhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escolha; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitEscolha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscolhaContext escolha() throws RecognitionException {
		EscolhaContext _localctx = new EscolhaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_escolha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(ESCOLHA);
			setState(315);
			match(ABRE_PARENTESES);
			setState(316);
			expressao(0);
			setState(317);
			match(FECHA_PARENTESES);
			setState(318);
			match(ABRE_CHAVES);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASO) {
				{
				{
				setState(319);
				caso();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(FECHA_CHAVES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CasoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(PortugolParser.CASO, 0); }
		public TerminalNode DOISPONTOS() { return getToken(PortugolParser.DOISPONTOS, 0); }
		public TerminalNode CONTRARIO() { return getToken(PortugolParser.CONTRARIO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ABRE_CHAVES() { return getToken(PortugolParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(PortugolParser.FECHA_CHAVES, 0); }
		public PareContext pare() {
			return getRuleContext(PareContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_caso);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(CASO);
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTRARIO:
				{
				setState(328);
				match(CONTRARIO);
				}
				break;
			case ABRE_PARENTESES:
			case OP_NAO:
			case OP_SUBTRACAO:
			case OP_ADICAO:
			case OP_INCREMENTO_UNARIO:
			case OP_DECREMENTO_UNARIO:
			case OP_NOT_BITWISE:
			case LOGICO:
			case CARACTER:
			case STRING:
			case ID:
			case REAL:
			case INT:
			case HEXADECIMAL:
				{
				setState(329);
				expressao(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(332);
			match(DOISPONTOS);
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PARENTESES:
			case FECHA_CHAVES:
			case TIPO:
			case FACA:
			case ENQUANTO:
			case PARA:
			case SE:
			case CONSTANTE:
			case ESCOLHA:
			case CASO:
			case PARE:
			case RETORNE:
			case OP_NAO:
			case OP_SUBTRACAO:
			case OP_ADICAO:
			case OP_INCREMENTO_UNARIO:
			case OP_DECREMENTO_UNARIO:
			case OP_NOT_BITWISE:
			case LOGICO:
			case CARACTER:
			case STRING:
			case ID:
			case REAL:
			case INT:
			case HEXADECIMAL:
				{
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(333);
						comando();
						}
						} 
					}
					setState(338);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
				break;
			case ABRE_CHAVES:
				{
				setState(339);
				match(ABRE_CHAVES);
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1137177322942181250L) != 0)) {
					{
					{
					setState(340);
					comando();
					}
					}
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(346);
				match(FECHA_CHAVES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARE) {
				{
				setState(349);
				pare();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PareContext extends ParserRuleContext {
		public TerminalNode PARE() { return getToken(PortugolParser.PARE, 0); }
		public PareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitPare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PareContext pare() throws RecognitionException {
		PareContext _localctx = new PareContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_pare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(PARE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IndiceArrayContext extends ParserRuleContext {
		public TerminalNode ABRE_COLCHETES() { return getToken(PortugolParser.ABRE_COLCHETES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_COLCHETES() { return getToken(PortugolParser.FECHA_COLCHETES, 0); }
		public IndiceArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indiceArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitIndiceArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndiceArrayContext indiceArray() throws RecognitionException {
		IndiceArrayContext _localctx = new IndiceArrayContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_indiceArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(ABRE_COLCHETES);
			setState(355);
			expressao(0);
			setState(356);
			match(FECHA_COLCHETES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChamadaFuncaoContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(PortugolParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(PortugolParser.FECHA_PARENTESES, 0); }
		public EscopoBibliotecaContext escopoBiblioteca() {
			return getRuleContext(EscopoBibliotecaContext.class,0);
		}
		public ListaExpressoesContext listaExpressoes() {
			return getRuleContext(ListaExpressoesContext.class,0);
		}
		public ChamadaFuncaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitChamadaFuncao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExpressaoContext {
		public TerminalNode STRING() { return getToken(PortugolParser.STRING, 0); }
		public StringContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegacaoBitwiseContext extends ExpressaoContext {
		public TerminalNode OP_NOT_BITWISE() { return getToken(PortugolParser.OP_NOT_BITWISE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public NegacaoBitwiseContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitNegacaoBitwise(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReferenciaArrayContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public IndiceArrayContext indiceArray() {
			return getRuleContext(IndiceArrayContext.class,0);
		}
		public EscopoBibliotecaContext escopoBiblioteca() {
			return getRuleContext(EscopoBibliotecaContext.class,0);
		}
		public ReferenciaArrayContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitReferenciaArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumeroRealContext extends ExpressaoContext {
		public TerminalNode REAL() { return getToken(PortugolParser.REAL, 0); }
		public NumeroRealContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitNumeroReal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaisUnarioContext extends ExpressaoContext {
		public TerminalNode OP_ADICAO() { return getToken(PortugolParser.OP_ADICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public MaisUnarioContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitMaisUnario(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoDiferencaContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_DIFERENCA() { return getToken(PortugolParser.OP_DIFERENCA, 0); }
		public OperacaoDiferencaContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoDiferenca(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MenosUnarioContext extends ExpressaoContext {
		public TerminalNode OP_SUBTRACAO() { return getToken(PortugolParser.OP_SUBTRACAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public MenosUnarioContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitMenosUnario(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdicaoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_ADICAO() { return getToken(PortugolParser.OP_ADICAO, 0); }
		public AdicaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAdicao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoXorContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_XOR() { return getToken(PortugolParser.OP_XOR, 0); }
		public OperacaoXorContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoXor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoMaiorIgualContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_MAIOR_IGUAL() { return getToken(PortugolParser.OP_MAIOR_IGUAL, 0); }
		public OperacaoMaiorIgualContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoMaiorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecrementoUnarioPrefixadoContext extends ExpressaoContext {
		public TerminalNode OP_DECREMENTO_UNARIO() { return getToken(PortugolParser.OP_DECREMENTO_UNARIO, 0); }
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public List<IndiceArrayContext> indiceArray() {
			return getRuleContexts(IndiceArrayContext.class);
		}
		public IndiceArrayContext indiceArray(int i) {
			return getRuleContext(IndiceArrayContext.class,i);
		}
		public DecrementoUnarioPrefixadoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDecrementoUnarioPrefixado(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementoUnarioPosfixadoContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode OP_INCREMENTO_UNARIO() { return getToken(PortugolParser.OP_INCREMENTO_UNARIO, 0); }
		public List<IndiceArrayContext> indiceArray() {
			return getRuleContexts(IndiceArrayContext.class);
		}
		public IndiceArrayContext indiceArray(int i) {
			return getRuleContext(IndiceArrayContext.class,i);
		}
		public IncrementoUnarioPosfixadoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitIncrementoUnarioPosfixado(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicacaoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_MULTIPLICACAO() { return getToken(PortugolParser.OP_MULTIPLICACAO, 0); }
		public MultiplicacaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitMultiplicacao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoOuLogicoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_OU_LOGICO() { return getToken(PortugolParser.OP_OU_LOGICO, 0); }
		public OperacaoOuLogicoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoOuLogico(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoIgualdadeContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_IGUALDADE() { return getToken(PortugolParser.OP_IGUALDADE, 0); }
		public OperacaoIgualdadeContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoIgualdade(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoShiftRightContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_SHIFT_RIGHT() { return getToken(PortugolParser.OP_SHIFT_RIGHT, 0); }
		public OperacaoShiftRightContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoShiftRight(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisaoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_DIVISAO() { return getToken(PortugolParser.OP_DIVISAO, 0); }
		public DivisaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDivisao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoEntreParentesesContext extends ExpressaoContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(PortugolParser.ABRE_PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(PortugolParser.FECHA_PARENTESES, 0); }
		public ExpressaoEntreParentesesContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitExpressaoEntreParenteses(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoMenorIgualContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_MENOR_IGUAL() { return getToken(PortugolParser.OP_MENOR_IGUAL, 0); }
		public OperacaoMenorIgualContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoMenorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReferenciaMatrizContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public List<IndiceArrayContext> indiceArray() {
			return getRuleContexts(IndiceArrayContext.class);
		}
		public IndiceArrayContext indiceArray(int i) {
			return getRuleContext(IndiceArrayContext.class,i);
		}
		public EscopoBibliotecaContext escopoBiblioteca() {
			return getRuleContext(EscopoBibliotecaContext.class,0);
		}
		public ReferenciaMatrizContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitReferenciaMatriz(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoMaiorContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_MAIOR() { return getToken(PortugolParser.OP_MAIOR, 0); }
		public OperacaoMaiorContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoMaior(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumeroInteiroContext extends ExpressaoContext {
		public TerminalNode INT() { return getToken(PortugolParser.INT, 0); }
		public TerminalNode HEXADECIMAL() { return getToken(PortugolParser.HEXADECIMAL, 0); }
		public NumeroInteiroContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitNumeroInteiro(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaracterContext extends ExpressaoContext {
		public TerminalNode CARACTER() { return getToken(PortugolParser.CARACTER, 0); }
		public CaracterContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitCaracter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReferenciaParaVariavelContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public EscopoBibliotecaContext escopoBiblioteca() {
			return getRuleContext(EscopoBibliotecaContext.class,0);
		}
		public ReferenciaParaVariavelContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitReferenciaParaVariavel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValorLogicoContext extends ExpressaoContext {
		public TerminalNode LOGICO() { return getToken(PortugolParser.LOGICO, 0); }
		public ValorLogicoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitValorLogico(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoMenorContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_MENOR() { return getToken(PortugolParser.OP_MENOR, 0); }
		public OperacaoMenorContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoMenor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoShiftLeftContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_SHIFT_LEFT() { return getToken(PortugolParser.OP_SHIFT_LEFT, 0); }
		public OperacaoShiftLeftContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoShiftLeft(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementoUnarioPrefixadoContext extends ExpressaoContext {
		public TerminalNode OP_INCREMENTO_UNARIO() { return getToken(PortugolParser.OP_INCREMENTO_UNARIO, 0); }
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public List<IndiceArrayContext> indiceArray() {
			return getRuleContexts(IndiceArrayContext.class);
		}
		public IndiceArrayContext indiceArray(int i) {
			return getRuleContext(IndiceArrayContext.class,i);
		}
		public IncrementoUnarioPrefixadoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitIncrementoUnarioPrefixado(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoELogicoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_E_LOGICO() { return getToken(PortugolParser.OP_E_LOGICO, 0); }
		public OperacaoELogicoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoELogico(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecrementoUnarioPosfixadoContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode OP_DECREMENTO_UNARIO() { return getToken(PortugolParser.OP_DECREMENTO_UNARIO, 0); }
		public List<IndiceArrayContext> indiceArray() {
			return getRuleContexts(IndiceArrayContext.class);
		}
		public IndiceArrayContext indiceArray(int i) {
			return getRuleContext(IndiceArrayContext.class,i);
		}
		public DecrementoUnarioPosfixadoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDecrementoUnarioPosfixado(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoOrBitwiseContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_OU_BITWISE() { return getToken(PortugolParser.OP_OU_BITWISE, 0); }
		public OperacaoOrBitwiseContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoOrBitwise(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModuloContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_MOD() { return getToken(PortugolParser.OP_MOD, 0); }
		public ModuloContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitModulo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtracaoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_SUBTRACAO() { return getToken(PortugolParser.OP_SUBTRACAO, 0); }
		public SubtracaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitSubtracao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegacaoContext extends ExpressaoContext {
		public TerminalNode OP_NAO() { return getToken(PortugolParser.OP_NAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public NegacaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitNegacao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoAndBitwiseContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode E_COMERCIAL() { return getToken(PortugolParser.E_COMERCIAL, 0); }
		public OperacaoAndBitwiseContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoAndBitwise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				_localctx = new ChamadaFuncaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(359);
					escopoBiblioteca();
					}
					break;
				}
				setState(362);
				match(ID);
				setState(363);
				match(ABRE_PARENTESES);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1137177322940530690L) != 0)) {
					{
					setState(364);
					listaExpressoes();
					}
				}

				setState(367);
				match(FECHA_PARENTESES);
				}
				break;
			case 2:
				{
				_localctx = new ReferenciaArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(368);
					escopoBiblioteca();
					}
					break;
				}
				setState(371);
				match(ID);
				setState(372);
				indiceArray();
				}
				break;
			case 3:
				{
				_localctx = new ReferenciaMatrizContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(373);
					escopoBiblioteca();
					}
					break;
				}
				setState(376);
				match(ID);
				setState(377);
				indiceArray();
				setState(379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(378);
					indiceArray();
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new MenosUnarioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(381);
				match(OP_SUBTRACAO);
				setState(382);
				expressao(33);
				}
				break;
			case 5:
				{
				_localctx = new MaisUnarioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(383);
				match(OP_ADICAO);
				setState(384);
				expressao(32);
				}
				break;
			case 6:
				{
				_localctx = new NegacaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(385);
				match(OP_NAO);
				setState(386);
				expressao(31);
				}
				break;
			case 7:
				{
				_localctx = new NegacaoBitwiseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(387);
				match(OP_NOT_BITWISE);
				setState(388);
				expressao(30);
				}
				break;
			case 8:
				{
				_localctx = new IncrementoUnarioPosfixadoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(389);
				match(ID);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABRE_COLCHETES) {
					{
					setState(390);
					indiceArray();
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ABRE_COLCHETES) {
						{
						setState(391);
						indiceArray();
						}
					}

					}
				}

				setState(396);
				match(OP_INCREMENTO_UNARIO);
				}
				break;
			case 9:
				{
				_localctx = new DecrementoUnarioPosfixadoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(397);
				match(ID);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABRE_COLCHETES) {
					{
					setState(398);
					indiceArray();
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ABRE_COLCHETES) {
						{
						setState(399);
						indiceArray();
						}
					}

					}
				}

				setState(404);
				match(OP_DECREMENTO_UNARIO);
				}
				break;
			case 10:
				{
				_localctx = new IncrementoUnarioPrefixadoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(405);
				match(OP_INCREMENTO_UNARIO);
				setState(406);
				match(ID);
				setState(411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(407);
					indiceArray();
					setState(409);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(408);
						indiceArray();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 11:
				{
				_localctx = new DecrementoUnarioPrefixadoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(413);
				match(OP_DECREMENTO_UNARIO);
				setState(414);
				match(ID);
				setState(419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(415);
					indiceArray();
					setState(417);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(416);
						indiceArray();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 12:
				{
				_localctx = new ReferenciaParaVariavelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(422);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(421);
					escopoBiblioteca();
					}
					break;
				}
				setState(424);
				match(ID);
				}
				break;
			case 13:
				{
				_localctx = new NumeroInteiroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(425);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==HEXADECIMAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 14:
				{
				_localctx = new NumeroRealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(426);
				match(REAL);
				}
				break;
			case 15:
				{
				_localctx = new ValorLogicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(427);
				match(LOGICO);
				}
				break;
			case 16:
				{
				_localctx = new CaracterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(428);
				match(CARACTER);
				}
				break;
			case 17:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(429);
				match(STRING);
				}
				break;
			case 18:
				{
				_localctx = new ExpressaoEntreParentesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(430);
				match(ABRE_PARENTESES);
				setState(431);
				expressao(0);
				setState(432);
				match(FECHA_PARENTESES);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(490);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicacaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(436);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(437);
						match(OP_MULTIPLICACAO);
						setState(438);
						expressao(26);
						}
						break;
					case 2:
						{
						_localctx = new DivisaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(439);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(440);
						match(OP_DIVISAO);
						setState(441);
						expressao(25);
						}
						break;
					case 3:
						{
						_localctx = new ModuloContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(442);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(443);
						match(OP_MOD);
						setState(444);
						expressao(24);
						}
						break;
					case 4:
						{
						_localctx = new AdicaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(445);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(446);
						match(OP_ADICAO);
						setState(447);
						expressao(23);
						}
						break;
					case 5:
						{
						_localctx = new SubtracaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(448);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(449);
						match(OP_SUBTRACAO);
						setState(450);
						expressao(22);
						}
						break;
					case 6:
						{
						_localctx = new OperacaoIgualdadeContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(451);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(452);
						match(OP_IGUALDADE);
						setState(453);
						expressao(21);
						}
						break;
					case 7:
						{
						_localctx = new OperacaoDiferencaContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(454);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(455);
						match(OP_DIFERENCA);
						setState(456);
						expressao(20);
						}
						break;
					case 8:
						{
						_localctx = new OperacaoMaiorContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(457);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(458);
						match(OP_MAIOR);
						setState(459);
						expressao(19);
						}
						break;
					case 9:
						{
						_localctx = new OperacaoMenorContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(460);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(461);
						match(OP_MENOR);
						setState(462);
						expressao(18);
						}
						break;
					case 10:
						{
						_localctx = new OperacaoMenorIgualContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(463);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(464);
						match(OP_MENOR_IGUAL);
						setState(465);
						expressao(17);
						}
						break;
					case 11:
						{
						_localctx = new OperacaoMaiorIgualContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(466);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(467);
						match(OP_MAIOR_IGUAL);
						setState(468);
						expressao(16);
						}
						break;
					case 12:
						{
						_localctx = new OperacaoELogicoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(469);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(470);
						match(OP_E_LOGICO);
						setState(471);
						expressao(15);
						}
						break;
					case 13:
						{
						_localctx = new OperacaoOuLogicoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(472);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(473);
						match(OP_OU_LOGICO);
						setState(474);
						expressao(14);
						}
						break;
					case 14:
						{
						_localctx = new OperacaoXorContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(475);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(476);
						match(OP_XOR);
						setState(477);
						expressao(13);
						}
						break;
					case 15:
						{
						_localctx = new OperacaoShiftLeftContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(478);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(479);
						match(OP_SHIFT_LEFT);
						setState(480);
						expressao(12);
						}
						break;
					case 16:
						{
						_localctx = new OperacaoShiftRightContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(481);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(482);
						match(OP_SHIFT_RIGHT);
						setState(483);
						expressao(11);
						}
						break;
					case 17:
						{
						_localctx = new OperacaoAndBitwiseContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(484);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(485);
						match(E_COMERCIAL);
						setState(486);
						expressao(10);
						}
						break;
					case 18:
						{
						_localctx = new OperacaoOrBitwiseContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(487);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(488);
						match(OP_OU_BITWISE);
						setState(489);
						expressao(9);
						}
						break;
					}
					} 
				}
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaExpressoesContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<AtribuicaoCompostaContext> atribuicaoComposta() {
			return getRuleContexts(AtribuicaoCompostaContext.class);
		}
		public AtribuicaoCompostaContext atribuicaoComposta(int i) {
			return getRuleContext(AtribuicaoCompostaContext.class,i);
		}
		public List<AtribuicaoContext> atribuicao() {
			return getRuleContexts(AtribuicaoContext.class);
		}
		public AtribuicaoContext atribuicao(int i) {
			return getRuleContext(AtribuicaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(PortugolParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(PortugolParser.VIRGULA, i);
		}
		public ListaExpressoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExpressoes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitListaExpressoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaExpressoesContext listaExpressoes() throws RecognitionException {
		ListaExpressoesContext _localctx = new ListaExpressoesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_listaExpressoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(495);
				expressao(0);
				}
				break;
			case 2:
				{
				setState(496);
				atribuicaoComposta();
				}
				break;
			case 3:
				{
				setState(497);
				atribuicao();
				}
				break;
			}
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(500);
				match(VIRGULA);
				setState(504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(501);
					expressao(0);
					}
					break;
				case 2:
					{
					setState(502);
					atribuicaoComposta();
					}
					break;
				case 3:
					{
					setState(503);
					atribuicao();
					}
					break;
				}
				}
				}
				setState(510);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EscopoBibliotecaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode PONTO() { return getToken(PortugolParser.PONTO, 0); }
		public EscopoBibliotecaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escopoBiblioteca; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitEscopoBiblioteca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscopoBibliotecaContext escopoBiblioteca() throws RecognitionException {
		EscopoBibliotecaContext _localctx = new EscopoBibliotecaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_escopoBiblioteca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(511);
			match(ID);
			setState(512);
			match(PONTO);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 25);
		case 1:
			return precpred(_ctx, 24);
		case 2:
			return precpred(_ctx, 23);
		case 3:
			return precpred(_ctx, 22);
		case 4:
			return precpred(_ctx, 21);
		case 5:
			return precpred(_ctx, 20);
		case 6:
			return precpred(_ctx, 19);
		case 7:
			return precpred(_ctx, 18);
		case 8:
			return precpred(_ctx, 17);
		case 9:
			return precpred(_ctx, 16);
		case 10:
			return precpred(_ctx, 15);
		case 11:
			return precpred(_ctx, 14);
		case 12:
			return precpred(_ctx, 13);
		case 13:
			return precpred(_ctx, 12);
		case 14:
			return precpred(_ctx, 11);
		case 15:
			return precpred(_ctx, 10);
		case 16:
			return precpred(_ctx, 9);
		case 17:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001B\u0203\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000P\b\u0000\n\u0000\f\u0000S\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000W\b\u0000\n\u0000\f\u0000Z\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"c\b\u0001\u0001\u0002\u0003\u0002f\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002l\b\u0002\n\u0002\f\u0002o\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003t\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004y\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005~\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0083\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0088"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u008e"+
		"\b\u0006\n\u0006\f\u0006\u0091\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u009c\b\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u00a1\b\t\u0001\n\u0001\n\u0003\n\u00a5"+
		"\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u00ad"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00b3\b\f\n\f\f\f\u00b6\t"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u00bc\b\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00c3\b\u000e\n\u000e\f\u000e"+
		"\u00c6\t\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00ca\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00cf\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00e4\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00fa\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00fe\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0106\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u011b\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u0126\b\u001b\n\u001b\f\u001b\u0129\t\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u012d\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0132\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u0139\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0005\u001f\u0141\b\u001f\n\u001f\f\u001f\u0144"+
		"\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u014b\b "+
		"\u0001 \u0001 \u0005 \u014f\b \n \f \u0152\t \u0001 \u0001 \u0005 \u0156"+
		"\b \n \f \u0159\t \u0001 \u0003 \u015c\b \u0001 \u0003 \u015f\b \u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0003#\u0169\b"+
		"#\u0001#\u0001#\u0001#\u0003#\u016e\b#\u0001#\u0001#\u0003#\u0172\b#\u0001"+
		"#\u0001#\u0001#\u0003#\u0177\b#\u0001#\u0001#\u0001#\u0003#\u017c\b#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u0189\b#\u0003#\u018b\b#\u0001#\u0001#\u0001#\u0001#\u0003#\u0191"+
		"\b#\u0003#\u0193\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u019a\b"+
		"#\u0003#\u019c\b#\u0001#\u0001#\u0001#\u0001#\u0003#\u01a2\b#\u0003#\u01a4"+
		"\b#\u0001#\u0003#\u01a7\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u01b3\b#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005"+
		"#\u01eb\b#\n#\f#\u01ee\t#\u0001$\u0001$\u0001$\u0003$\u01f3\b$\u0001$"+
		"\u0001$\u0001$\u0001$\u0003$\u01f9\b$\u0005$\u01fb\b$\n$\f$\u01fe\t$\u0001"+
		"%\u0001%\u0001%\u0001%\u0000\u0001F&\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJ\u0000\u0001\u0001\u0000:;\u0245\u0000L\u0001\u0000\u0000\u0000\u0002"+
		"]\u0001\u0000\u0000\u0000\u0004e\u0001\u0000\u0000\u0000\u0006s\u0001"+
		"\u0000\u0000\u0000\bu\u0001\u0000\u0000\u0000\nz\u0001\u0000\u0000\u0000"+
		"\f\u0089\u0001\u0000\u0000\u0000\u000e\u0094\u0001\u0000\u0000\u0000\u0010"+
		"\u0096\u0001\u0000\u0000\u0000\u0012\u0098\u0001\u0000\u0000\u0000\u0014"+
		"\u00a2\u0001\u0000\u0000\u0000\u0016\u00a8\u0001\u0000\u0000\u0000\u0018"+
		"\u00aa\u0001\u0000\u0000\u0000\u001a\u00b9\u0001\u0000\u0000\u0000\u001c"+
		"\u00bf\u0001\u0000\u0000\u0000\u001e\u00c7\u0001\u0000\u0000\u0000 \u00d0"+
		"\u0001\u0000\u0000\u0000\"\u00d3\u0001\u0000\u0000\u0000$\u00e3\u0001"+
		"\u0000\u0000\u0000&\u00e5\u0001\u0000\u0000\u0000(\u00f9\u0001\u0000\u0000"+
		"\u0000*\u00fb\u0001\u0000\u0000\u0000,\u00ff\u0001\u0000\u0000\u0000."+
		"\u0107\u0001\u0000\u0000\u00000\u010a\u0001\u0000\u0000\u00002\u0110\u0001"+
		"\u0000\u0000\u00004\u0117\u0001\u0000\u0000\u00006\u012c\u0001\u0000\u0000"+
		"\u00008\u0131\u0001\u0000\u0000\u0000:\u0133\u0001\u0000\u0000\u0000<"+
		"\u0138\u0001\u0000\u0000\u0000>\u013a\u0001\u0000\u0000\u0000@\u0147\u0001"+
		"\u0000\u0000\u0000B\u0160\u0001\u0000\u0000\u0000D\u0162\u0001\u0000\u0000"+
		"\u0000F\u01b2\u0001\u0000\u0000\u0000H\u01f2\u0001\u0000\u0000\u0000J"+
		"\u01ff\u0001\u0000\u0000\u0000LM\u0005\u000f\u0000\u0000MQ\u0005\u0005"+
		"\u0000\u0000NP\u0003\u0002\u0001\u0000ON\u0001\u0000\u0000\u0000PS\u0001"+
		"\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RX\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TW\u0003\u0018\f\u0000"+
		"UW\u0003\u0004\u0002\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000"+
		"\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005"+
		"\u0006\u0000\u0000\\\u0001\u0001\u0000\u0000\u0000]^\u0005\u0015\u0000"+
		"\u0000^_\u0005\u0016\u0000\u0000_b\u00058\u0000\u0000`a\u0005-\u0000\u0000"+
		"ac\u00058\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"c\u0003\u0001\u0000\u0000\u0000df\u0005\r\u0000\u0000ed\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0005\u0007"+
		"\u0000\u0000hm\u0003\u0006\u0003\u0000ij\u0005@\u0000\u0000jl\u0003\u0006"+
		"\u0003\u0000ki\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u0005\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000pt\u0003\b\u0004\u0000qt\u0003\u0012\t"+
		"\u0000rt\u0003\n\u0005\u0000sp\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000sr\u0001\u0000\u0000\u0000t\u0007\u0001\u0000\u0000\u0000ux\u0005"+
		"8\u0000\u0000vw\u0005\u001f\u0000\u0000wy\u0003F#\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y\t\u0001\u0000\u0000\u0000z{\u0005"+
		"8\u0000\u0000{}\u0005\u0003\u0000\u0000|~\u0003\u000e\u0007\u0000}|\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005\u0004\u0000\u0000\u0080\u0082\u0005\u0003\u0000"+
		"\u0000\u0081\u0083\u0003\u0010\b\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0087\u0005\u0004\u0000\u0000\u0085\u0086\u0005\u001f\u0000\u0000"+
		"\u0086\u0088\u0003\f\u0006\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u000b\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005\u0005\u0000\u0000\u008a\u008f\u0003\u0014\n\u0000\u008b\u008c"+
		"\u0005@\u0000\u0000\u008c\u008e\u0003\u0014\n\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0005"+
		"\u0006\u0000\u0000\u0093\r\u0001\u0000\u0000\u0000\u0094\u0095\u0003\u0016"+
		"\u000b\u0000\u0095\u000f\u0001\u0000\u0000\u0000\u0096\u0097\u0003\u0016"+
		"\u000b\u0000\u0097\u0011\u0001\u0000\u0000\u0000\u0098\u0099\u00058\u0000"+
		"\u0000\u0099\u009b\u0005\u0003\u0000\u0000\u009a\u009c\u0003\u0016\u000b"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u00a0\u0005\u0004\u0000"+
		"\u0000\u009e\u009f\u0005\u001f\u0000\u0000\u009f\u00a1\u0003\u0014\n\u0000"+
		"\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u0013\u0001\u0000\u0000\u0000\u00a2\u00a4\u0005\u0005\u0000\u0000"+
		"\u00a3\u00a5\u0003H$\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005\u0006\u0000\u0000\u00a7\u0015\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0003F#\u0000\u00a9\u0017\u0001\u0000\u0000\u0000\u00aa\u00ac\u0005\u000e"+
		"\u0000\u0000\u00ab\u00ad\u0005\u0007\u0000\u0000\u00ac\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u00058\u0000\u0000\u00af\u00b0\u0003\u001a\r"+
		"\u0000\u00b0\u00b4\u0005\u0005\u0000\u0000\u00b1\u00b3\u0003$\u0012\u0000"+
		"\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0005\u0006\u0000\u0000\u00b8\u0019\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bb\u0005\u0001\u0000\u0000\u00ba\u00bc\u0003\u001c\u000e\u0000"+
		"\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0002\u0000\u0000"+
		"\u00be\u001b\u0001\u0000\u0000\u0000\u00bf\u00c4\u0003\u001e\u000f\u0000"+
		"\u00c0\u00c1\u0005@\u0000\u0000\u00c1\u00c3\u0003\u001e\u000f\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5"+
		"\u001d\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c9\u0005\u0007\u0000\u0000\u00c8\u00ca\u0005.\u0000\u0000\u00c9\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cb\u00ce\u00058\u0000\u0000\u00cc\u00cf\u0003"+
		" \u0010\u0000\u00cd\u00cf\u0003\"\u0011\u0000\u00ce\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cf\u001f\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0003"+
		"\u0000\u0000\u00d1\u00d2\u0005\u0004\u0000\u0000\u00d2!\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0005\u0003\u0000\u0000\u00d4\u00d5\u0005\u0004\u0000"+
		"\u0000\u00d5\u00d6\u0005\u0003\u0000\u0000\u00d6\u00d7\u0005\u0004\u0000"+
		"\u0000\u00d7#\u0001\u0000\u0000\u0000\u00d8\u00e4\u0003\u0004\u0002\u0000"+
		"\u00d9\u00e4\u0003,\u0016\u0000\u00da\u00e4\u00030\u0018\u0000\u00db\u00e4"+
		"\u00032\u0019\u0000\u00dc\u00e4\u00034\u001a\u0000\u00dd\u00e4\u0003>"+
		"\u001f\u0000\u00de\u00e4\u0003*\u0015\u0000\u00df\u00e4\u0003B!\u0000"+
		"\u00e0\u00e4\u0003&\u0013\u0000\u00e1\u00e4\u0003(\u0014\u0000\u00e2\u00e4"+
		"\u0003F#\u0000\u00e3\u00d8\u0001\u0000\u0000\u0000\u00e3\u00d9\u0001\u0000"+
		"\u0000\u0000\u00e3\u00da\u0001\u0000\u0000\u0000\u00e3\u00db\u0001\u0000"+
		"\u0000\u0000\u00e3\u00dc\u0001\u0000\u0000\u0000\u00e3\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e3\u00de\u0001\u0000\u0000\u0000\u00e3\u00df\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4%\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0003F#\u0000\u00e6\u00e7\u0005\u001f\u0000\u0000\u00e7"+
		"\u00e8\u0003F#\u0000\u00e8\'\u0001\u0000\u0000\u0000\u00e9\u00ea\u0003"+
		"F#\u0000\u00ea\u00eb\u0005/\u0000\u0000\u00eb\u00ec\u0003F#\u0000\u00ec"+
		"\u00fa\u0001\u0000\u0000\u0000\u00ed\u00ee\u0003F#\u0000\u00ee\u00ef\u0005"+
		"0\u0000\u0000\u00ef\u00f0\u0003F#\u0000\u00f0\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0003F#\u0000\u00f2\u00f3\u00051\u0000\u0000\u00f3"+
		"\u00f4\u0003F#\u0000\u00f4\u00fa\u0001\u0000\u0000\u0000\u00f5\u00f6\u0003"+
		"F#\u0000\u00f6\u00f7\u00052\u0000\u0000\u00f7\u00f8\u0003F#\u0000\u00f8"+
		"\u00fa\u0001\u0000\u0000\u0000\u00f9\u00e9\u0001\u0000\u0000\u0000\u00f9"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f9\u00f1\u0001\u0000\u0000\u0000\u00f9"+
		"\u00f5\u0001\u0000\u0000\u0000\u00fa)\u0001\u0000\u0000\u0000\u00fb\u00fd"+
		"\u0005\u0014\u0000\u0000\u00fc\u00fe\u0003F#\u0000\u00fd\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe+\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005\u000b\u0000\u0000\u0100\u0101\u0005\u0001\u0000"+
		"\u0000\u0101\u0102\u0003F#\u0000\u0102\u0103\u0005\u0002\u0000\u0000\u0103"+
		"\u0105\u00036\u001b\u0000\u0104\u0106\u0003.\u0017\u0000\u0105\u0104\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106-\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0005\f\u0000\u0000\u0108\u0109\u00036\u001b"+
		"\u0000\u0109/\u0001\u0000\u0000\u0000\u010a\u010b\u0005\t\u0000\u0000"+
		"\u010b\u010c\u0005\u0001\u0000\u0000\u010c\u010d\u0003F#\u0000\u010d\u010e"+
		"\u0005\u0002\u0000\u0000\u010e\u010f\u00036\u001b\u0000\u010f1\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0005\b\u0000\u0000\u0111\u0112\u00036\u001b"+
		"\u0000\u0112\u0113\u0005\t\u0000\u0000\u0113\u0114\u0005\u0001\u0000\u0000"+
		"\u0114\u0115\u0003F#\u0000\u0115\u0116\u0005\u0002\u0000\u0000\u01163"+
		"\u0001\u0000\u0000\u0000\u0117\u0118\u0005\n\u0000\u0000\u0118\u011a\u0005"+
		"\u0001\u0000\u0000\u0119\u011b\u00038\u001c\u0000\u011a\u0119\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0005A\u0000\u0000\u011d\u011e\u0003:\u001d\u0000"+
		"\u011e\u011f\u0005A\u0000\u0000\u011f\u0120\u0003<\u001e\u0000\u0120\u0121"+
		"\u0005\u0002\u0000\u0000\u0121\u0122\u00036\u001b\u0000\u01225\u0001\u0000"+
		"\u0000\u0000\u0123\u0127\u0005\u0005\u0000\u0000\u0124\u0126\u0003$\u0012"+
		"\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000"+
		"\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000"+
		"\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000"+
		"\u0000\u012a\u012d\u0005\u0006\u0000\u0000\u012b\u012d\u0003$\u0012\u0000"+
		"\u012c\u0123\u0001\u0000\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000"+
		"\u012d7\u0001\u0000\u0000\u0000\u012e\u0132\u0003&\u0013\u0000\u012f\u0132"+
		"\u0003\u0004\u0002\u0000\u0130\u0132\u00058\u0000\u0000\u0131\u012e\u0001"+
		"\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0130\u0001"+
		"\u0000\u0000\u0000\u01329\u0001\u0000\u0000\u0000\u0133\u0134\u0003F#"+
		"\u0000\u0134;\u0001\u0000\u0000\u0000\u0135\u0139\u0003F#\u0000\u0136"+
		"\u0139\u0003(\u0014\u0000\u0137\u0139\u0003&\u0013\u0000\u0138\u0135\u0001"+
		"\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0137\u0001"+
		"\u0000\u0000\u0000\u0139=\u0001\u0000\u0000\u0000\u013a\u013b\u0005\u0010"+
		"\u0000\u0000\u013b\u013c\u0005\u0001\u0000\u0000\u013c\u013d\u0003F#\u0000"+
		"\u013d\u013e\u0005\u0002\u0000\u0000\u013e\u0142\u0005\u0005\u0000\u0000"+
		"\u013f\u0141\u0003@ \u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141\u0144"+
		"\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0001\u0000\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0142"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u0006\u0000\u0000\u0146?\u0001"+
		"\u0000\u0000\u0000\u0147\u014a\u0005\u0011\u0000\u0000\u0148\u014b\u0005"+
		"\u0012\u0000\u0000\u0149\u014b\u0003F#\u0000\u014a\u0148\u0001\u0000\u0000"+
		"\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000"+
		"\u0000\u014c\u015b\u0005B\u0000\u0000\u014d\u014f\u0003$\u0012\u0000\u014e"+
		"\u014d\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150"+
		"\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151"+
		"\u015c\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153"+
		"\u0157\u0005\u0005\u0000\u0000\u0154\u0156\u0003$\u0012\u0000\u0155\u0154"+
		"\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015a"+
		"\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015c"+
		"\u0005\u0006\u0000\u0000\u015b\u0150\u0001\u0000\u0000\u0000\u015b\u0153"+
		"\u0001\u0000\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u015f"+
		"\u0003B!\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000"+
		"\u0000\u0000\u015fA\u0001\u0000\u0000\u0000\u0160\u0161\u0005\u0013\u0000"+
		"\u0000\u0161C\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u0003\u0000\u0000"+
		"\u0163\u0164\u0003F#\u0000\u0164\u0165\u0005\u0004\u0000\u0000\u0165E"+
		"\u0001\u0000\u0000\u0000\u0166\u0168\u0006#\uffff\uffff\u0000\u0167\u0169"+
		"\u0003J%\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000"+
		"\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u00058\u0000"+
		"\u0000\u016b\u016d\u0005\u0001\u0000\u0000\u016c\u016e\u0003H$\u0000\u016d"+
		"\u016c\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0001\u0000\u0000\u0000\u016f\u01b3\u0005\u0002\u0000\u0000\u0170"+
		"\u0172\u0003J%\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0171\u0172\u0001"+
		"\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0005"+
		"8\u0000\u0000\u0174\u01b3\u0003D\"\u0000\u0175\u0177\u0003J%\u0000\u0176"+
		"\u0175\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177"+
		"\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u00058\u0000\u0000\u0179\u017b"+
		"\u0003D\"\u0000\u017a\u017c\u0003D\"\u0000\u017b\u017a\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u01b3\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0005\u001a\u0000\u0000\u017e\u01b3\u0003F#!\u017f"+
		"\u0180\u0005\u001b\u0000\u0000\u0180\u01b3\u0003F# \u0181\u0182\u0005"+
		"\u0017\u0000\u0000\u0182\u01b3\u0003F#\u001f\u0183\u0184\u0005,\u0000"+
		"\u0000\u0184\u01b3\u0003F#\u001e\u0185\u018a\u00058\u0000\u0000\u0186"+
		"\u0188\u0003D\"\u0000\u0187\u0189\u0003D\"\u0000\u0188\u0187\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018b\u0001\u0000"+
		"\u0000\u0000\u018a\u0186\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000"+
		"\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u01b3\u0005&\u0000"+
		"\u0000\u018d\u0192\u00058\u0000\u0000\u018e\u0190\u0003D\"\u0000\u018f"+
		"\u0191\u0003D\"\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0190\u0191"+
		"\u0001\u0000\u0000\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u018e"+
		"\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0194"+
		"\u0001\u0000\u0000\u0000\u0194\u01b3\u0005\'\u0000\u0000\u0195\u0196\u0005"+
		"&\u0000\u0000\u0196\u019b\u00058\u0000\u0000\u0197\u0199\u0003D\"\u0000"+
		"\u0198\u019a\u0003D\"\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u0199"+
		"\u019a\u0001\u0000\u0000\u0000\u019a\u019c\u0001\u0000\u0000\u0000\u019b"+
		"\u0197\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c"+
		"\u01b3\u0001\u0000\u0000\u0000\u019d\u019e\u0005\'\u0000\u0000\u019e\u01a3"+
		"\u00058\u0000\u0000\u019f\u01a1\u0003D\"\u0000\u01a0\u01a2\u0003D\"\u0000"+
		"\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3\u019f\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01b3\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a7\u0003J%\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01b3"+
		"\u00058\u0000\u0000\u01a9\u01b3\u0007\u0000\u0000\u0000\u01aa\u01b3\u0005"+
		"9\u0000\u0000\u01ab\u01b3\u00053\u0000\u0000\u01ac\u01b3\u00056\u0000"+
		"\u0000\u01ad\u01b3\u00057\u0000\u0000\u01ae\u01af\u0005\u0001\u0000\u0000"+
		"\u01af\u01b0\u0003F#\u0000\u01b0\u01b1\u0005\u0002\u0000\u0000\u01b1\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b2\u0166\u0001\u0000\u0000\u0000\u01b2\u0171"+
		"\u0001\u0000\u0000\u0000\u01b2\u0176\u0001\u0000\u0000\u0000\u01b2\u017d"+
		"\u0001\u0000\u0000\u0000\u01b2\u017f\u0001\u0000\u0000\u0000\u01b2\u0181"+
		"\u0001\u0000\u0000\u0000\u01b2\u0183\u0001\u0000\u0000\u0000\u01b2\u0185"+
		"\u0001\u0000\u0000\u0000\u01b2\u018d\u0001\u0000\u0000\u0000\u01b2\u0195"+
		"\u0001\u0000\u0000\u0000\u01b2\u019d\u0001\u0000\u0000\u0000\u01b2\u01a6"+
		"\u0001\u0000\u0000\u0000\u01b2\u01a9\u0001\u0000\u0000\u0000\u01b2\u01aa"+
		"\u0001\u0000\u0000\u0000\u01b2\u01ab\u0001\u0000\u0000\u0000\u01b2\u01ac"+
		"\u0001\u0000\u0000\u0000\u01b2\u01ad\u0001\u0000\u0000\u0000\u01b2\u01ae"+
		"\u0001\u0000\u0000\u0000\u01b3\u01ec\u0001\u0000\u0000\u0000\u01b4\u01b5"+
		"\n\u0019\u0000\u0000\u01b5\u01b6\u0005\u001c\u0000\u0000\u01b6\u01eb\u0003"+
		"F#\u001a\u01b7\u01b8\n\u0018\u0000\u0000\u01b8\u01b9\u0005\u001d\u0000"+
		"\u0000\u01b9\u01eb\u0003F#\u0019\u01ba\u01bb\n\u0017\u0000\u0000\u01bb"+
		"\u01bc\u0005\u001e\u0000\u0000\u01bc\u01eb\u0003F#\u0018\u01bd\u01be\n"+
		"\u0016\u0000\u0000\u01be\u01bf\u0005\u001b\u0000\u0000\u01bf\u01eb\u0003"+
		"F#\u0017\u01c0\u01c1\n\u0015\u0000\u0000\u01c1\u01c2\u0005\u001a\u0000"+
		"\u0000\u01c2\u01eb\u0003F#\u0016\u01c3\u01c4\n\u0014\u0000\u0000\u01c4"+
		"\u01c5\u0005 \u0000\u0000\u01c5\u01eb\u0003F#\u0015\u01c6\u01c7\n\u0013"+
		"\u0000\u0000\u01c7\u01c8\u0005!\u0000\u0000\u01c8\u01eb\u0003F#\u0014"+
		"\u01c9\u01ca\n\u0012\u0000\u0000\u01ca\u01cb\u0005\"\u0000\u0000\u01cb"+
		"\u01eb\u0003F#\u0013\u01cc\u01cd\n\u0011\u0000\u0000\u01cd\u01ce\u0005"+
		"#\u0000\u0000\u01ce\u01eb\u0003F#\u0012\u01cf\u01d0\n\u0010\u0000\u0000"+
		"\u01d0\u01d1\u0005$\u0000\u0000\u01d1\u01eb\u0003F#\u0011\u01d2\u01d3"+
		"\n\u000f\u0000\u0000\u01d3\u01d4\u0005%\u0000\u0000\u01d4\u01eb\u0003"+
		"F#\u0010\u01d5\u01d6\n\u000e\u0000\u0000\u01d6\u01d7\u0005\u0018\u0000"+
		"\u0000\u01d7\u01eb\u0003F#\u000f\u01d8\u01d9\n\r\u0000\u0000\u01d9\u01da"+
		"\u0005\u0019\u0000\u0000\u01da\u01eb\u0003F#\u000e\u01db\u01dc\n\f\u0000"+
		"\u0000\u01dc\u01dd\u0005*\u0000\u0000\u01dd\u01eb\u0003F#\r\u01de\u01df"+
		"\n\u000b\u0000\u0000\u01df\u01e0\u0005(\u0000\u0000\u01e0\u01eb\u0003"+
		"F#\f\u01e1\u01e2\n\n\u0000\u0000\u01e2\u01e3\u0005)\u0000\u0000\u01e3"+
		"\u01eb\u0003F#\u000b\u01e4\u01e5\n\t\u0000\u0000\u01e5\u01e6\u0005.\u0000"+
		"\u0000\u01e6\u01eb\u0003F#\n\u01e7\u01e8\n\b\u0000\u0000\u01e8\u01e9\u0005"+
		"+\u0000\u0000\u01e9\u01eb\u0003F#\t\u01ea\u01b4\u0001\u0000\u0000\u0000"+
		"\u01ea\u01b7\u0001\u0000\u0000\u0000\u01ea\u01ba\u0001\u0000\u0000\u0000"+
		"\u01ea\u01bd\u0001\u0000\u0000\u0000\u01ea\u01c0\u0001\u0000\u0000\u0000"+
		"\u01ea\u01c3\u0001\u0000\u0000\u0000\u01ea\u01c6\u0001\u0000\u0000\u0000"+
		"\u01ea\u01c9\u0001\u0000\u0000\u0000\u01ea\u01cc\u0001\u0000\u0000\u0000"+
		"\u01ea\u01cf\u0001\u0000\u0000\u0000\u01ea\u01d2\u0001\u0000\u0000\u0000"+
		"\u01ea\u01d5\u0001\u0000\u0000\u0000\u01ea\u01d8\u0001\u0000\u0000\u0000"+
		"\u01ea\u01db\u0001\u0000\u0000\u0000\u01ea\u01de\u0001\u0000\u0000\u0000"+
		"\u01ea\u01e1\u0001\u0000\u0000\u0000\u01ea\u01e4\u0001\u0000\u0000\u0000"+
		"\u01ea\u01e7\u0001\u0000\u0000\u0000\u01eb\u01ee\u0001\u0000\u0000\u0000"+
		"\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000"+
		"\u01edG\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ef"+
		"\u01f3\u0003F#\u0000\u01f0\u01f3\u0003(\u0014\u0000\u01f1\u01f3\u0003"+
		"&\u0013\u0000\u01f2\u01ef\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f3\u01fc\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f8\u0005@\u0000\u0000\u01f5\u01f9\u0003F#\u0000"+
		"\u01f6\u01f9\u0003(\u0014\u0000\u01f7\u01f9\u0003&\u0013\u0000\u01f8\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f9\u01fb\u0001\u0000\u0000\u0000\u01fa\u01f4"+
		"\u0001\u0000\u0000\u0000\u01fb\u01fe\u0001\u0000\u0000\u0000\u01fc\u01fa"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fdI\u0001"+
		"\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01ff\u0200\u0005"+
		"8\u0000\u0000\u0200\u0201\u0005?\u0000\u0000\u0201K\u0001\u0000\u0000"+
		"\u00008QVXbemsx}\u0082\u0087\u008f\u009b\u00a0\u00a4\u00ac\u00b4\u00bb"+
		"\u00c4\u00c9\u00ce\u00e3\u00f9\u00fd\u0105\u011a\u0127\u012c\u0131\u0138"+
		"\u0142\u014a\u0150\u0157\u015b\u015e\u0168\u016d\u0171\u0176\u017b\u0188"+
		"\u018a\u0190\u0192\u0199\u019b\u01a1\u01a3\u01a6\u01b2\u01ea\u01ec\u01f2"+
		"\u01f8\u01fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}