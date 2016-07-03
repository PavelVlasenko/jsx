// Generated from jsx/antlr4/Java8.g4 by ANTLR 4.3
package jsx.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java8Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, ABSTRACT=4, ASSERT=5, BOOLEAN=6, BREAK=7, BYTE=8, 
		CASE=9, CATCH=10, CHAR=11, CLASS=12, CONST=13, CONTINUE=14, DEFAULT=15, 
		DO=16, DOUBLE=17, ELSE=18, ENUM=19, EXTENDS=20, FINAL=21, FINALLY=22, 
		FLOAT=23, FOR=24, IF=25, GOTO=26, IMPLEMENTS=27, IMPORT=28, INSTANCEOF=29, 
		INT=30, INTERFACE=31, LONG=32, NATIVE=33, NEW=34, PACKAGE=35, PRIVATE=36, 
		PROTECTED=37, PUBLIC=38, RETURN=39, SHORT=40, STATIC=41, STRICTFP=42, 
		SUPER=43, SWITCH=44, SYNCHRONIZED=45, THIS=46, THROW=47, THROWS=48, TRANSIENT=49, 
		TRY=50, VOID=51, VOLATILE=52, WHILE=53, IntegerLiteral=54, FloatingPointLiteral=55, 
		BooleanLiteral=56, CharacterLiteral=57, StringLiteral=58, NullLiteral=59, 
		LPAREN=60, RPAREN=61, LBRACE=62, RBRACE=63, LBRACK=64, RBRACK=65, SEMI=66, 
		COMMA=67, DOT=68, ASSIGN=69, GT=70, LT=71, BANG=72, TILDE=73, QUESTION=74, 
		COLON=75, EQUAL=76, LE=77, GE=78, NOTEQUAL=79, AND=80, OR=81, INC=82, 
		DEC=83, ADD=84, SUB=85, MUL=86, DIV=87, BITAND=88, BITOR=89, CARET=90, 
		MOD=91, ARROW=92, COLONCOLON=93, ADD_ASSIGN=94, SUB_ASSIGN=95, MUL_ASSIGN=96, 
		DIV_ASSIGN=97, AND_ASSIGN=98, OR_ASSIGN=99, XOR_ASSIGN=100, MOD_ASSIGN=101, 
		LSHIFT_ASSIGN=102, RSHIFT_ASSIGN=103, URSHIFT_ASSIGN=104, Identifier=105, 
		AT=106, ELLIPSIS=107, WS=108, COMMENT=109, LINE_COMMENT=110;
	public static final String[] tokenNames = {
		"<INVALID>", "'''", "'</'", "'/>'", "'abstract'", "'assert'", "'boolean'", 
		"'break'", "'byte'", "'case'", "'catch'", "'char'", "'class'", "'const'", 
		"'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", "'extends'", 
		"'final'", "'finally'", "'float'", "'for'", "'if'", "'goto'", "'implements'", 
		"'import'", "'instanceof'", "'int'", "'interface'", "'long'", "'native'", 
		"'new'", "'package'", "'private'", "'protected'", "'public'", "'return'", 
		"'short'", "'static'", "'strictfp'", "'super'", "'switch'", "'synchronized'", 
		"'this'", "'throw'", "'throws'", "'transient'", "'try'", "'void'", "'volatile'", 
		"'while'", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"CharacterLiteral", "StringLiteral", "'null'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", 
		"'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", 
		"'::'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
		"'<<='", "'>>='", "'>>>='", "Identifier", "'@'", "'...'", "WS", "COMMENT", 
		"LINE_COMMENT"
	};
	public static final int
		RULE_literal = 0, RULE_type = 1, RULE_primitiveType = 2, RULE_numericType = 3, 
		RULE_integralType = 4, RULE_floatingPointType = 5, RULE_referenceType = 6, 
		RULE_classOrInterfaceType = 7, RULE_classType = 8, RULE_classType_lf_classOrInterfaceType = 9, 
		RULE_classType_lfno_classOrInterfaceType = 10, RULE_interfaceType = 11, 
		RULE_interfaceType_lf_classOrInterfaceType = 12, RULE_interfaceType_lfno_classOrInterfaceType = 13, 
		RULE_typeVariable = 14, RULE_arrayType = 15, RULE_dims = 16, RULE_typeParameter = 17, 
		RULE_typeParameterModifier = 18, RULE_typeBound = 19, RULE_additionalBound = 20, 
		RULE_typeArguments = 21, RULE_typeArgumentList = 22, RULE_typeArgument = 23, 
		RULE_wildcard = 24, RULE_wildcardBounds = 25, RULE_packageName = 26, RULE_typeName = 27, 
		RULE_packageOrTypeName = 28, RULE_expressionName = 29, RULE_methodName = 30, 
		RULE_ambiguousName = 31, RULE_compilationUnit = 32, RULE_packageDeclaration = 33, 
		RULE_packageModifier = 34, RULE_importDeclaration = 35, RULE_singleTypeImportDeclaration = 36, 
		RULE_typeImportOnDemandDeclaration = 37, RULE_singleStaticImportDeclaration = 38, 
		RULE_staticImportOnDemandDeclaration = 39, RULE_typeDeclaration = 40, 
		RULE_classDeclaration = 41, RULE_normalClassDeclaration = 42, RULE_classModifier = 43, 
		RULE_typeParameters = 44, RULE_typeParameterList = 45, RULE_superclass = 46, 
		RULE_superinterfaces = 47, RULE_interfaceTypeList = 48, RULE_classBody = 49, 
		RULE_classBodyDeclaration = 50, RULE_classMemberDeclaration = 51, RULE_fieldDeclaration = 52, 
		RULE_fieldModifier = 53, RULE_variableDeclaratorList = 54, RULE_variableDeclarator = 55, 
		RULE_variableDeclaratorId = 56, RULE_variableInitializer = 57, RULE_unannType = 58, 
		RULE_unannPrimitiveType = 59, RULE_unannReferenceType = 60, RULE_unannClassOrInterfaceType = 61, 
		RULE_unannClassType = 62, RULE_unannClassType_lf_unannClassOrInterfaceType = 63, 
		RULE_unannClassType_lfno_unannClassOrInterfaceType = 64, RULE_unannInterfaceType = 65, 
		RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 66, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 67, 
		RULE_unannTypeVariable = 68, RULE_unannArrayType = 69, RULE_methodDeclaration = 70, 
		RULE_methodModifier = 71, RULE_methodHeader = 72, RULE_result = 73, RULE_methodDeclarator = 74, 
		RULE_formalParameterList = 75, RULE_formalParameters = 76, RULE_formalParameter = 77, 
		RULE_variableModifier = 78, RULE_lastFormalParameter = 79, RULE_receiverParameter = 80, 
		RULE_throws_ = 81, RULE_exceptionTypeList = 82, RULE_exceptionType = 83, 
		RULE_methodBody = 84, RULE_instanceInitializer = 85, RULE_staticInitializer = 86, 
		RULE_constructorDeclaration = 87, RULE_constructorModifier = 88, RULE_constructorDeclarator = 89, 
		RULE_simpleTypeName = 90, RULE_constructorBody = 91, RULE_explicitConstructorInvocation = 92, 
		RULE_enumDeclaration = 93, RULE_enumBody = 94, RULE_enumConstantList = 95, 
		RULE_enumConstant = 96, RULE_enumConstantModifier = 97, RULE_enumBodyDeclarations = 98, 
		RULE_interfaceDeclaration = 99, RULE_normalInterfaceDeclaration = 100, 
		RULE_interfaceModifier = 101, RULE_extendsInterfaces = 102, RULE_interfaceBody = 103, 
		RULE_interfaceMemberDeclaration = 104, RULE_constantDeclaration = 105, 
		RULE_constantModifier = 106, RULE_interfaceMethodDeclaration = 107, RULE_interfaceMethodModifier = 108, 
		RULE_annotationTypeDeclaration = 109, RULE_annotationTypeBody = 110, RULE_annotationTypeMemberDeclaration = 111, 
		RULE_annotationTypeElementDeclaration = 112, RULE_annotationTypeElementModifier = 113, 
		RULE_defaultValue = 114, RULE_annotation = 115, RULE_normalAnnotation = 116, 
		RULE_elementValuePairList = 117, RULE_elementValuePair = 118, RULE_elementValue = 119, 
		RULE_elementValueArrayInitializer = 120, RULE_elementValueList = 121, 
		RULE_markerAnnotation = 122, RULE_singleElementAnnotation = 123, RULE_arrayInitializer = 124, 
		RULE_variableInitializerList = 125, RULE_block = 126, RULE_blockStatements = 127, 
		RULE_blockStatement = 128, RULE_localVariableDeclarationStatement = 129, 
		RULE_localVariableDeclaration = 130, RULE_statement = 131, RULE_statementNoShortIf = 132, 
		RULE_statementWithoutTrailingSubstatement = 133, RULE_emptyStatement = 134, 
		RULE_labeledStatement = 135, RULE_labeledStatementNoShortIf = 136, RULE_expressionStatement = 137, 
		RULE_statementExpression = 138, RULE_ifThenStatement = 139, RULE_ifThenElseStatement = 140, 
		RULE_ifThenElseStatementNoShortIf = 141, RULE_assertStatement = 142, RULE_switchStatement = 143, 
		RULE_switchBlock = 144, RULE_switchBlockStatementGroup = 145, RULE_switchLabels = 146, 
		RULE_switchLabel = 147, RULE_enumConstantName = 148, RULE_whileStatement = 149, 
		RULE_whileStatementNoShortIf = 150, RULE_doStatement = 151, RULE_forStatement = 152, 
		RULE_forStatementNoShortIf = 153, RULE_basicForStatement = 154, RULE_basicForStatementNoShortIf = 155, 
		RULE_forInit = 156, RULE_forUpdate = 157, RULE_statementExpressionList = 158, 
		RULE_enhancedForStatement = 159, RULE_enhancedForStatementNoShortIf = 160, 
		RULE_breakStatement = 161, RULE_continueStatement = 162, RULE_returnStatement = 163, 
		RULE_throwStatement = 164, RULE_synchronizedStatement = 165, RULE_tryStatement = 166, 
		RULE_catches = 167, RULE_catchClause = 168, RULE_catchFormalParameter = 169, 
		RULE_catchType = 170, RULE_finally_ = 171, RULE_tryWithResourcesStatement = 172, 
		RULE_resourceSpecification = 173, RULE_resourceList = 174, RULE_resource = 175, 
		RULE_primary = 176, RULE_primaryNoNewArray = 177, RULE_primaryNoNewArray_lf_arrayAccess = 178, 
		RULE_primaryNoNewArray_lfno_arrayAccess = 179, RULE_primaryNoNewArray_lf_primary = 180, 
		RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 181, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 182, 
		RULE_primaryNoNewArray_lfno_primary = 183, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 184, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 185, 
		RULE_classInstanceCreationExpression = 186, RULE_classInstanceCreationExpression_lf_primary = 187, 
		RULE_classInstanceCreationExpression_lfno_primary = 188, RULE_typeArgumentsOrDiamond = 189, 
		RULE_fieldAccess = 190, RULE_fieldAccess_lf_primary = 191, RULE_fieldAccess_lfno_primary = 192, 
		RULE_arrayAccess = 193, RULE_arrayAccess_lf_primary = 194, RULE_arrayAccess_lfno_primary = 195, 
		RULE_methodInvocation = 196, RULE_methodInvocation_lf_primary = 197, RULE_methodInvocation_lfno_primary = 198, 
		RULE_argumentList = 199, RULE_methodReference = 200, RULE_methodReference_lf_primary = 201, 
		RULE_methodReference_lfno_primary = 202, RULE_arrayCreationExpression = 203, 
		RULE_dimExprs = 204, RULE_dimExpr = 205, RULE_constantExpression = 206, 
		RULE_expression = 207, RULE_lambdaExpression = 208, RULE_lambdaParameters = 209, 
		RULE_inferredFormalParameterList = 210, RULE_lambdaBody = 211, RULE_assignmentExpression = 212, 
		RULE_assignment = 213, RULE_leftHandSide = 214, RULE_assignmentOperator = 215, 
		RULE_conditionalExpression = 216, RULE_conditionalOrExpression = 217, 
		RULE_conditionalAndExpression = 218, RULE_inclusiveOrExpression = 219, 
		RULE_exclusiveOrExpression = 220, RULE_andExpression = 221, RULE_equalityExpression = 222, 
		RULE_relationalExpression = 223, RULE_shiftExpression = 224, RULE_additiveExpression = 225, 
		RULE_multiplicativeExpression = 226, RULE_unaryExpression = 227, RULE_preIncrementExpression = 228, 
		RULE_preDecrementExpression = 229, RULE_unaryExpressionNotPlusMinus = 230, 
		RULE_postfixExpression = 231, RULE_postIncrementExpression = 232, RULE_postIncrementExpression_lf_postfixExpression = 233, 
		RULE_postDecrementExpression = 234, RULE_postDecrementExpression_lf_postfixExpression = 235, 
		RULE_castExpression = 236, RULE_jsxElement = 237, RULE_jsxSelfClosingElement = 238, 
		RULE_jsxOpeningElement = 239, RULE_jsxChildren = 240, RULE_jsxClosingElement = 241, 
		RULE_jsxElementName = 242, RULE_jsxAttribute = 243, RULE_jsxAttributeValue = 244, 
		RULE_jsxDoubleStringAttributeValue = 245, RULE_jsxSingleStringAttributeValue = 246, 
		RULE_jsxBlockAttributeValue = 247, RULE_jsxBlock = 248, RULE_assigmentExpression = 249, 
		RULE_jsxAttributeName = 250;
	public static final String[] ruleNames = {
		"literal", "type", "primitiveType", "numericType", "integralType", "floatingPointType", 
		"referenceType", "classOrInterfaceType", "classType", "classType_lf_classOrInterfaceType", 
		"classType_lfno_classOrInterfaceType", "interfaceType", "interfaceType_lf_classOrInterfaceType", 
		"interfaceType_lfno_classOrInterfaceType", "typeVariable", "arrayType", 
		"dims", "typeParameter", "typeParameterModifier", "typeBound", "additionalBound", 
		"typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", 
		"packageName", "typeName", "packageOrTypeName", "expressionName", "methodName", 
		"ambiguousName", "compilationUnit", "packageDeclaration", "packageModifier", 
		"importDeclaration", "singleTypeImportDeclaration", "typeImportOnDemandDeclaration", 
		"singleStaticImportDeclaration", "staticImportOnDemandDeclaration", "typeDeclaration", 
		"classDeclaration", "normalClassDeclaration", "classModifier", "typeParameters", 
		"typeParameterList", "superclass", "superinterfaces", "interfaceTypeList", 
		"classBody", "classBodyDeclaration", "classMemberDeclaration", "fieldDeclaration", 
		"fieldModifier", "variableDeclaratorList", "variableDeclarator", "variableDeclaratorId", 
		"variableInitializer", "unannType", "unannPrimitiveType", "unannReferenceType", 
		"unannClassOrInterfaceType", "unannClassType", "unannClassType_lf_unannClassOrInterfaceType", 
		"unannClassType_lfno_unannClassOrInterfaceType", "unannInterfaceType", 
		"unannInterfaceType_lf_unannClassOrInterfaceType", "unannInterfaceType_lfno_unannClassOrInterfaceType", 
		"unannTypeVariable", "unannArrayType", "methodDeclaration", "methodModifier", 
		"methodHeader", "result", "methodDeclarator", "formalParameterList", "formalParameters", 
		"formalParameter", "variableModifier", "lastFormalParameter", "receiverParameter", 
		"throws_", "exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", 
		"staticInitializer", "constructorDeclaration", "constructorModifier", 
		"constructorDeclarator", "simpleTypeName", "constructorBody", "explicitConstructorInvocation", 
		"enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumConstantModifier", 
		"enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
		"interfaceModifier", "extendsInterfaces", "interfaceBody", "interfaceMemberDeclaration", 
		"constantDeclaration", "constantModifier", "interfaceMethodDeclaration", 
		"interfaceMethodModifier", "annotationTypeDeclaration", "annotationTypeBody", 
		"annotationTypeMemberDeclaration", "annotationTypeElementDeclaration", 
		"annotationTypeElementModifier", "defaultValue", "annotation", "normalAnnotation", 
		"elementValuePairList", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"elementValueList", "markerAnnotation", "singleElementAnnotation", "arrayInitializer", 
		"variableInitializerList", "block", "blockStatements", "blockStatement", 
		"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
		"statementNoShortIf", "statementWithoutTrailingSubstatement", "emptyStatement", 
		"labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
		"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
		"assertStatement", "switchStatement", "switchBlock", "switchBlockStatementGroup", 
		"switchLabels", "switchLabel", "enumConstantName", "whileStatement", "whileStatementNoShortIf", 
		"doStatement", "forStatement", "forStatementNoShortIf", "basicForStatement", 
		"basicForStatementNoShortIf", "forInit", "forUpdate", "statementExpressionList", 
		"enhancedForStatement", "enhancedForStatementNoShortIf", "breakStatement", 
		"continueStatement", "returnStatement", "throwStatement", "synchronizedStatement", 
		"tryStatement", "catches", "catchClause", "catchFormalParameter", "catchType", 
		"finally_", "tryWithResourcesStatement", "resourceSpecification", "resourceList", 
		"resource", "primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", 
		"primaryNoNewArray_lfno_arrayAccess", "primaryNoNewArray_lf_primary", 
		"primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", "primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", 
		"primaryNoNewArray_lfno_primary", "primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", 
		"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "classInstanceCreationExpression", 
		"classInstanceCreationExpression_lf_primary", "classInstanceCreationExpression_lfno_primary", 
		"typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", 
		"arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", "methodInvocation", 
		"methodInvocation_lf_primary", "methodInvocation_lfno_primary", "argumentList", 
		"methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
		"arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", 
		"expression", "lambdaExpression", "lambdaParameters", "inferredFormalParameterList", 
		"lambdaBody", "assignmentExpression", "assignment", "leftHandSide", "assignmentOperator", 
		"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
		"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
		"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
		"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
		"unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", 
		"postIncrementExpression_lf_postfixExpression", "postDecrementExpression", 
		"postDecrementExpression_lf_postfixExpression", "castExpression", "jsxElement", 
		"jsxSelfClosingElement", "jsxOpeningElement", "jsxChildren", "jsxClosingElement", 
		"jsxElementName", "jsxAttribute", "jsxAttributeValue", "jsxDoubleStringAttributeValue", 
		"jsxSingleStringAttributeValue", "jsxBlockAttributeValue", "jsxBlock", 
		"assigmentExpression", "jsxAttributeName"
	};

	@Override
	public String getGrammarFileName() { return "Java8.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(Java8Parser.NullLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(Java8Parser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java8Parser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(Java8Parser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Java8Parser.CharacterLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TypeContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(506);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504); primitiveType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505); referenceType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primitiveType);
		int _la;
		try {
			setState(522);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(508); annotation();
					}
					}
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(514); numericType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(515); annotation();
					}
					}
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(521); match(BOOLEAN);
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

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNumericType(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numericType);
		try {
			setState(526);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(524); integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(525); floatingPointType();
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

	public static class IntegralTypeContext extends ParserRuleContext {
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIntegralType(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFloatingPointType(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReferenceType(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_referenceType);
		try {
			setState(535);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(532); classOrInterfaceType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533); typeVariable();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(534); arrayType();
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(537); classType_lfno_classOrInterfaceType();
				}
				break;

			case 2:
				{
				setState(538); interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(543);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(541); classType_lf_classOrInterfaceType();
						}
						break;

					case 2:
						{
						setState(542); interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ClassTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType);
		int _la;
		try {
			setState(570);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(548); annotation();
					}
					}
					setState(553);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(554); match(Identifier);
				setState(556);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(555); typeArguments();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(558); classOrInterfaceType();
				setState(559); match(DOT);
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(560); annotation();
					}
					}
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(566); match(Identifier);
				setState(568);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(567); typeArguments();
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

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572); match(DOT);
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(573); annotation();
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(579); match(Identifier);
			setState(581);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(580); typeArguments();
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

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(583); annotation();
				}
				}
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(589); match(Identifier);
			setState(591);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(590); typeArguments();
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

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593); classType();
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

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); classType_lf_classOrInterfaceType();
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

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597); classType_lfno_classOrInterfaceType();
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

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeVariable(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(599); annotation();
				}
				}
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(605); match(Identifier);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayType);
		try {
			setState(616);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607); primitiveType();
				setState(608); dims();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610); classOrInterfaceType();
				setState(611); dims();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(613); typeVariable();
				setState(614); dims();
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

	public static class DimsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDims(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(618); annotation();
				}
				}
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(624); match(LBRACK);
			setState(625); match(RBRACK);
			setState(636);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(629);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(626); annotation();
						}
						}
						setState(631);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(632); match(LBRACK);
					setState(633); match(RBRACK);
					}
					} 
				}
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(639); typeParameterModifier();
				}
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(645); match(Identifier);
			setState(647);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(646); typeBound();
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

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameterModifier(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649); annotation();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeBound);
		int _la;
		try {
			setState(661);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651); match(EXTENDS);
				setState(652); typeVariable();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(653); match(EXTENDS);
				setState(654); classOrInterfaceType();
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(655); additionalBound();
					}
					}
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class AdditionalBoundContext extends ParserRuleContext {
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAdditionalBound(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663); match(BITAND);
			setState(664); interfaceType();
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666); match(LT);
			setState(667); typeArgumentList();
			setState(668); match(GT);
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

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgumentList(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670); typeArgument();
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(671); match(COMMA);
				setState(672); typeArgument();
				}
				}
				setState(677);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeArgument);
		try {
			setState(680);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(678); referenceType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(679); wildcard();
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

	public static class WildcardContext extends ParserRuleContext {
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWildcard(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(682); annotation();
				}
				}
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(688); match(QUESTION);
			setState(690);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(689); wildcardBounds();
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

	public static class WildcardBoundsContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWildcardBounds(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_wildcardBounds);
		try {
			setState(696);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(692); match(EXTENDS);
				setState(693); referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(694); match(SUPER);
				setState(695); referenceType();
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

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageName(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(699); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(706);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(701);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(702); match(DOT);
					setState(703); match(Identifier);
					}
					} 
				}
				setState(708);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeName);
		try {
			setState(714);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(709); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710); packageOrTypeName(0);
				setState(711); match(DOT);
				setState(712); match(Identifier);
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

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageOrTypeName(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(717); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(724);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(719);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(720); match(DOT);
					setState(721); match(Identifier);
					}
					} 
				}
				setState(726);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpressionName(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionName);
		try {
			setState(732);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(727); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(728); ambiguousName(0);
				setState(729); match(DOT);
				setState(730); match(Identifier);
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

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodName(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734); match(Identifier);
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

	public static class AmbiguousNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAmbiguousName(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(737); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(739);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(740); match(DOT);
					setState(741); match(Identifier);
					}
					} 
				}
				setState(746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(Java8Parser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(747); packageDeclaration();
				}
				break;
			}
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(750); importDeclaration();
				}
				}
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(756); typeDeclaration();
				}
				}
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(762); match(EOF);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}
		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(764); packageModifier();
				}
				}
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(770); match(PACKAGE);
			setState(771); match(Identifier);
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(772); match(DOT);
				setState(773); match(Identifier);
				}
				}
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(779); match(SEMI);
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

	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageModifier(this);
		}
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781); annotation();
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_importDeclaration);
		try {
			setState(787);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(783); singleTypeImportDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(784); typeImportOnDemandDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(785); singleStaticImportDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(786); staticImportOnDemandDeclaration();
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

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleTypeImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleTypeImportDeclaration(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789); match(IMPORT);
			setState(790); typeName();
			setState(791); match(SEMI);
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

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeImportOnDemandDeclaration(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793); match(IMPORT);
			setState(794); packageOrTypeName(0);
			setState(795); match(DOT);
			setState(796); match(MUL);
			setState(797); match(SEMI);
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

	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleStaticImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleStaticImportDeclaration(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799); match(IMPORT);
			setState(800); match(STATIC);
			setState(801); typeName();
			setState(802); match(DOT);
			setState(803); match(Identifier);
			setState(804); match(SEMI);
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

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStaticImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStaticImportOnDemandDeclaration(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806); match(IMPORT);
			setState(807); match(STATIC);
			setState(808); typeName();
			setState(809); match(DOT);
			setState(810); match(MUL);
			setState(811); match(SEMI);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeDeclaration);
		try {
			setState(816);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(813); classDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(814); interfaceDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(815); match(SEMI);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_classDeclaration);
		try {
			setState(820);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(818); normalClassDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(819); enumDeclaration();
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

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalClassDeclaration(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(822); classModifier();
				}
				}
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(828); match(CLASS);
			setState(829); match(Identifier);
			setState(831);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(830); typeParameters();
				}
			}

			setState(834);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(833); superclass();
				}
			}

			setState(837);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(836); superinterfaces();
				}
			}

			setState(839); classBody();
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

	public static class ClassModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassModifier(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classModifier);
		try {
			setState(849);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(841); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(842); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(843); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(844); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(845); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(846); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(847); match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(848); match(STRICTFP);
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

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851); match(LT);
			setState(852); typeParameterList();
			setState(853); match(GT);
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

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameterList(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855); typeParameter();
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(856); match(COMMA);
				setState(857); typeParameter();
				}
				}
				setState(862);
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

	public static class SuperclassContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperclass(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863); match(EXTENDS);
			setState(864); classType();
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

	public static class SuperinterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperinterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperinterfaces(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866); match(IMPLEMENTS);
			setState(867); interfaceTypeList();
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

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceTypeList(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869); interfaceType();
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(870); match(COMMA);
				setState(871); interfaceType();
				}
				}
				setState(876);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877); match(LBRACE);
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(878); classBodyDeclaration();
				}
				}
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(884); match(RBRACE);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_classBodyDeclaration);
		try {
			setState(890);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(886); classMemberDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(887); instanceInitializer();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(888); staticInitializer();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(889); constructorDeclaration();
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

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassMemberDeclaration(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classMemberDeclaration);
		try {
			setState(897);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(892); fieldDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(893); methodDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(894); classDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(895); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(896); match(SEMI);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				{
				setState(899); fieldModifier();
				}
				}
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(905); unannType();
			setState(906); variableDeclaratorList();
			setState(907); match(SEMI);
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

	public static class FieldModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldModifier(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fieldModifier);
		try {
			setState(917);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(909); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(910); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(911); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(912); match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(913); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(914); match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(915); match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(916); match(VOLATILE);
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

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclaratorList(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919); variableDeclarator();
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(920); match(COMMA);
				setState(921); variableDeclarator();
				}
				}
				setState(926);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927); variableDeclaratorId();
			setState(930);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(928); match(ASSIGN);
				setState(929); variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932); match(Identifier);
			setState(934);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(933); dims();
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_variableInitializer);
		try {
			setState(938);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(936); expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(937); arrayInitializer();
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

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannType(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unannType);
		try {
			setState(942);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(940); unannPrimitiveType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(941); unannReferenceType();
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

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannPrimitiveType(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unannPrimitiveType);
		try {
			setState(946);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(944); numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(945); match(BOOLEAN);
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

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannReferenceType(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unannReferenceType);
		try {
			setState(951);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(948); unannClassOrInterfaceType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(949); unannTypeVariable();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(950); unannArrayType();
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

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassOrInterfaceType(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(953); unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;

			case 2:
				{
				setState(954); unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(961);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(959);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(957); unannClassType_lf_unannClassOrInterfaceType();
						}
						break;

					case 2:
						{
						setState(958); unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(963);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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

	public static class UnannClassTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unannClassType);
		int _la;
		try {
			setState(980);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(964); match(Identifier);
				setState(966);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(965); typeArguments();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(968); unannClassOrInterfaceType();
				setState(969); match(DOT);
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(970); annotation();
					}
					}
					setState(975);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(976); match(Identifier);
				setState(978);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(977); typeArguments();
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

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982); match(DOT);
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(983); annotation();
				}
				}
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(989); match(Identifier);
			setState(991);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(990); typeArguments();
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

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993); match(Identifier);
			setState(995);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(994); typeArguments();
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

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997); unannClassType();
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

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999); unannClassType_lf_unannClassOrInterfaceType();
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

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001); unannClassType_lfno_unannClassOrInterfaceType();
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

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannTypeVariable(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003); match(Identifier);
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

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannArrayType(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unannArrayType);
		try {
			setState(1014);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005); unannPrimitiveType();
				setState(1006); dims();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008); unannClassOrInterfaceType();
				setState(1009); dims();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1011); unannTypeVariable();
				setState(1012); dims();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				{
				setState(1016); methodModifier();
				}
				}
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1022); methodHeader();
			setState(1023); methodBody();
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

	public static class MethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodModifier(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_methodModifier);
		try {
			setState(1035);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1025); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1026); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1027); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1028); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1029); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1030); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1031); match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1032); match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1033); match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1034); match(STRICTFP);
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

	public static class MethodHeaderContext extends ParserRuleContext {
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodHeader(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_methodHeader);
		int _la;
		try {
			setState(1054);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1037); result();
				setState(1038); methodDeclarator();
				setState(1040);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1039); throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1042); typeParameters();
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1043); annotation();
					}
					}
					setState(1048);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1049); result();
				setState(1050); methodDeclarator();
				setState(1052);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1051); throws_();
					}
				}

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

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_result);
		try {
			setState(1058);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1056); unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1057); match(VOID);
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

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodDeclarator(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060); match(Identifier);
			setState(1061); match(LPAREN);
			setState(1063);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1062); formalParameterList();
				}
			}

			setState(1065); match(RPAREN);
			setState(1067);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1066); dims();
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_formalParameterList);
		try {
			setState(1074);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1069); formalParameters();
				setState(1070); match(COMMA);
				setState(1071); lastFormalParameter();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073); lastFormalParameter();
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

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_formalParameters);
		try {
			int _alt;
			setState(1092);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1076); formalParameter();
				setState(1081);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1077); match(COMMA);
						setState(1078); formalParameter();
						}
						} 
					}
					setState(1083);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084); receiverParameter();
				setState(1089);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1085); match(COMMA);
						setState(1086); formalParameter();
						}
						} 
					}
					setState(1091);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1094); variableModifier();
				}
				}
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1100); unannType();
			setState(1101); variableDeclaratorId();
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

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_variableModifier);
		try {
			setState(1105);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103); annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1104); match(FINAL);
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

	public static class LastFormalParameterContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1124);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1107); variableModifier();
					}
					}
					setState(1112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1113); unannType();
				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1114); annotation();
					}
					}
					setState(1119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1120); match(ELLIPSIS);
				setState(1121); variableDeclaratorId();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123); formalParameter();
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

	public static class ReceiverParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReceiverParameter(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1126); annotation();
				}
				}
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1132); unannType();
			setState(1135);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1133); match(Identifier);
				setState(1134); match(DOT);
				}
			}

			setState(1137); match(THIS);
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

	public static class Throws_Context extends ParserRuleContext {
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThrows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThrows_(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139); match(THROWS);
			setState(1140); exceptionTypeList();
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

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExceptionTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExceptionTypeList(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142); exceptionType();
			setState(1147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1143); match(COMMA);
				setState(1144); exceptionType();
				}
				}
				setState(1149);
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

	public static class ExceptionTypeContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExceptionType(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_exceptionType);
		try {
			setState(1152);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1150); classType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151); typeVariable();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_methodBody);
		try {
			setState(1156);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1154); block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1155); match(SEMI);
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

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInstanceInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInstanceInitializer(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158); block();
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

	public static class StaticInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStaticInitializer(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160); match(STATIC);
			setState(1161); block();
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1163); constructorModifier();
				}
				}
				setState(1168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1169); constructorDeclarator();
			setState(1171);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1170); throws_();
				}
			}

			setState(1173); constructorBody();
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

	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorModifier(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_constructorModifier);
		try {
			setState(1179);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1175); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1176); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1177); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1178); match(PRIVATE);
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

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorDeclarator(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1181); typeParameters();
				}
			}

			setState(1184); simpleTypeName();
			setState(1185); match(LPAREN);
			setState(1187);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1186); formalParameterList();
				}
			}

			setState(1189); match(RPAREN);
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

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSimpleTypeName(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191); match(Identifier);
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

	public static class ConstructorBodyContext extends ParserRuleContext {
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193); match(LBRACE);
			setState(1195);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(1194); explicitConstructorInvocation();
				}
				break;
			}
			setState(1198);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(1197); blockStatements();
				}
			}

			setState(1200); match(RBRACE);
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

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExplicitConstructorInvocation(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1248);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1203);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1202); typeArguments();
					}
				}

				setState(1205); match(THIS);
				setState(1206); match(LPAREN);
				setState(1208);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(1207); argumentList();
					}
				}

				setState(1210); match(RPAREN);
				setState(1211); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1213);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1212); typeArguments();
					}
				}

				setState(1215); match(SUPER);
				setState(1216); match(LPAREN);
				setState(1218);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(1217); argumentList();
					}
				}

				setState(1220); match(RPAREN);
				setState(1221); match(SEMI);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1222); expressionName();
				setState(1223); match(DOT);
				setState(1225);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1224); typeArguments();
					}
				}

				setState(1227); match(SUPER);
				setState(1228); match(LPAREN);
				setState(1230);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(1229); argumentList();
					}
				}

				setState(1232); match(RPAREN);
				setState(1233); match(SEMI);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1235); primary();
				setState(1236); match(DOT);
				setState(1238);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1237); typeArguments();
					}
				}

				setState(1240); match(SUPER);
				setState(1241); match(LPAREN);
				setState(1243);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(1242); argumentList();
					}
				}

				setState(1245); match(RPAREN);
				setState(1246); match(SEMI);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1250); classModifier();
				}
				}
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1256); match(ENUM);
			setState(1257); match(Identifier);
			setState(1259);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1258); superinterfaces();
				}
			}

			setState(1261); enumBody();
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

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumBody(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263); match(LBRACE);
			setState(1265);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1264); enumConstantList();
				}
			}

			setState(1268);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1267); match(COMMA);
				}
			}

			setState(1271);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1270); enumBodyDeclarations();
				}
			}

			setState(1273); match(RBRACE);
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

	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantList(this);
		}
	}

	public final EnumConstantListContext enumConstantList() throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1275); enumConstant();
			setState(1280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1276); match(COMMA);
					setState(1277); enumConstant();
					}
					} 
				}
				setState(1282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
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

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}
		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class,i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1283); enumConstantModifier();
				}
				}
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1289); match(Identifier);
			setState(1295);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1290); match(LPAREN);
				setState(1292);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(1291); argumentList();
					}
				}

				setState(1294); match(RPAREN);
				}
			}

			setState(1298);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1297); classBody();
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

	public static class EnumConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public EnumConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantModifier(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier() throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300); annotation();
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302); match(SEMI);
			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(1303); classBodyDeclaration();
				}
				}
				setState(1308);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_interfaceDeclaration);
		try {
			setState(1311);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1309); normalInterfaceDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1310); annotationTypeDeclaration();
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

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalInterfaceDeclaration(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1313); interfaceModifier();
				}
				}
				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1319); match(INTERFACE);
			setState(1320); match(Identifier);
			setState(1322);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1321); typeParameters();
				}
			}

			setState(1325);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1324); extendsInterfaces();
				}
			}

			setState(1327); interfaceBody();
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

	public static class InterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceModifier(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_interfaceModifier);
		try {
			setState(1336);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1329); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1330); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1331); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1332); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1333); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1334); match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1335); match(STRICTFP);
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

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExtendsInterfaces(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338); match(EXTENDS);
			setState(1339); interfaceTypeList();
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341); match(LBRACE);
			setState(1345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(1342); interfaceMemberDeclaration();
				}
				}
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1348); match(RBRACE);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_interfaceMemberDeclaration);
		try {
			setState(1355);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1350); constantDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1351); interfaceMethodDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1352); classDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1353); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1354); match(SEMI);
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

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantDeclaration(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1357); constantModifier();
				}
				}
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1363); unannType();
			setState(1364); variableDeclaratorList();
			setState(1365); match(SEMI);
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

	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantModifier(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constantModifier);
		try {
			setState(1371);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1367); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1368); match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1369); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1370); match(FINAL);
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

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1373); interfaceMethodModifier();
				}
				}
				setState(1378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1379); methodHeader();
			setState(1380); methodBody();
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

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_interfaceMethodModifier);
		try {
			setState(1388);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1382); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1383); match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1384); match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1385); match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1386); match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1387); match(STRICTFP);
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

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1390); interfaceModifier();
					}
					} 
				}
				setState(1395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1396); match(AT);
			setState(1397); match(INTERFACE);
			setState(1398); match(Identifier);
			setState(1399); annotationTypeBody();
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

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401); match(LBRACE);
			setState(1405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(1402); annotationTypeMemberDeclaration();
				}
				}
				setState(1407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1408); match(RBRACE);
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

	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeMemberDeclaration(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1415);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1410); annotationTypeElementDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1411); constantDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1412); classDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1413); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1414); match(SEMI);
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

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class,i);
		}
		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1417); annotationTypeElementModifier();
				}
				}
				setState(1422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1423); unannType();
			setState(1424); match(Identifier);
			setState(1425); match(LPAREN);
			setState(1426); match(RPAREN);
			setState(1428);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1427); dims();
				}
			}

			setState(1431);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1430); defaultValue();
				}
			}

			setState(1433); match(SEMI);
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

	public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeElementModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeElementModifier(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_annotationTypeElementModifier);
		try {
			setState(1438);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1435); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1436); match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1437); match(ABSTRACT);
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

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440); match(DEFAULT);
			setState(1441); elementValue();
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

	public static class AnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_annotation);
		try {
			setState(1446);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1443); normalAnnotation();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1444); markerAnnotation();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1445); singleElementAnnotation();
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

	public static class NormalAnnotationContext extends ParserRuleContext {
		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalAnnotation(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448); match(AT);
			setState(1449); typeName();
			setState(1450); match(LPAREN);
			setState(1452);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1451); elementValuePairList();
				}
			}

			setState(1454); match(RPAREN);
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

	public static class ElementValuePairListContext extends ParserRuleContext {
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValuePairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValuePairList(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456); elementValuePair();
			setState(1461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1457); match(COMMA);
				setState(1458); elementValuePair();
				}
				}
				setState(1463);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464); match(Identifier);
			setState(1465); match(ASSIGN);
			setState(1466); elementValue();
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

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_elementValue);
		try {
			setState(1471);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1468); conditionalExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1469); elementValueArrayInitializer();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1470); annotation();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473); match(LBRACE);
			setState(1475);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				setState(1474); elementValueList();
				}
			}

			setState(1478);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1477); match(COMMA);
				}
			}

			setState(1480); match(RBRACE);
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

	public static class ElementValueListContext extends ParserRuleContext {
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValueList(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1482); elementValue();
			setState(1487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1483); match(COMMA);
					setState(1484); elementValue();
					}
					} 
				}
				setState(1489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
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

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMarkerAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMarkerAnnotation(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490); match(AT);
			setState(1491); typeName();
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

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleElementAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleElementAnnotation(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493); match(AT);
			setState(1494); typeName();
			setState(1495); match(LPAREN);
			setState(1496); elementValue();
			setState(1497); match(RPAREN);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499); match(LBRACE);
			setState(1501);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				setState(1500); variableInitializerList();
				}
			}

			setState(1504);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1503); match(COMMA);
				}
			}

			setState(1506); match(RBRACE);
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

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableInitializerList(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1508); variableInitializer();
			setState(1513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1509); match(COMMA);
					setState(1510); variableInitializer();
					}
					} 
				}
				setState(1515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1516); match(LBRACE);
			setState(1518);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(1517); blockStatements();
				}
			}

			setState(1520); match(RBRACE);
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

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlockStatements(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522); blockStatement();
			setState(1526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(1523); blockStatement();
				}
				}
				setState(1528);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_blockStatement);
		try {
			setState(1533);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1529); localVariableDeclarationStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1530); classDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1531); statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1532); jsxElement();
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535); localVariableDeclaration();
			setState(1536); match(SEMI);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1538); variableModifier();
				}
				}
				setState(1543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1544); unannType();
			setState(1545); variableDeclaratorList();
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

	public static class StatementContext extends ParserRuleContext {
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_statement);
		try {
			setState(1553);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1547); statementWithoutTrailingSubstatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1548); labeledStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1549); ifThenStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1550); ifThenElseStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1551); whileStatement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1552); forStatement();
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

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementNoShortIf(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_statementNoShortIf);
		try {
			setState(1560);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1555); statementWithoutTrailingSubstatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1556); labeledStatementNoShortIf();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1557); ifThenElseStatementNoShortIf();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1558); whileStatementNoShortIf();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1559); forStatementNoShortIf();
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

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1574);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1562); block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1563); emptyStatement();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case INC:
			case DEC:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1564); expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1565); assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1566); switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(1567); doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1568); breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1569); continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1570); returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1571); synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1572); throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(1573); tryStatement();
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576); match(SEMI);
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578); match(Identifier);
			setState(1579); match(COLON);
			setState(1580); statement();
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

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLabeledStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLabeledStatementNoShortIf(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582); match(Identifier);
			setState(1583); match(COLON);
			setState(1584); statementNoShortIf();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586); statementExpression();
			setState(1587); match(SEMI);
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_statementExpression);
		try {
			setState(1596);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1589); assignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1590); preIncrementExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1591); preDecrementExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1592); postIncrementExpression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1593); postDecrementExpression();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1594); methodInvocation();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1595); classInstanceCreationExpression();
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

	public static class IfThenStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenStatement(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1598); match(IF);
			setState(1599); match(LPAREN);
			setState(1600); expression();
			setState(1601); match(RPAREN);
			setState(1602); statement();
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

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenElseStatement(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604); match(IF);
			setState(1605); match(LPAREN);
			setState(1606); expression();
			setState(1607); match(RPAREN);
			setState(1608); statementNoShortIf();
			setState(1609); match(ELSE);
			setState(1610); statement();
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

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenElseStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenElseStatementNoShortIf(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612); match(IF);
			setState(1613); match(LPAREN);
			setState(1614); expression();
			setState(1615); match(RPAREN);
			setState(1616); statementNoShortIf();
			setState(1617); match(ELSE);
			setState(1618); statementNoShortIf();
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

	public static class AssertStatementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssertStatement(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_assertStatement);
		try {
			setState(1630);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1620); match(ASSERT);
				setState(1621); expression();
				setState(1622); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1624); match(ASSERT);
				setState(1625); expression();
				setState(1626); match(COLON);
				setState(1627); expression();
				setState(1628); match(SEMI);
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632); match(SWITCH);
			setState(1633); match(LPAREN);
			setState(1634); expression();
			setState(1635); match(RPAREN);
			setState(1636); switchBlock();
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

	public static class SwitchBlockContext extends ParserRuleContext {
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1638); match(LBRACE);
			setState(1642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1639); switchBlockStatementGroup();
					}
					} 
				}
				setState(1644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			}
			setState(1648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1645); switchLabel();
				}
				}
				setState(1650);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1651); match(RBRACE);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653); switchLabels();
			setState(1654); blockStatements();
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

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchLabels(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656); switchLabel();
			setState(1660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1657); switchLabel();
				}
				}
				setState(1662);
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_switchLabel);
		try {
			setState(1673);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1663); match(CASE);
				setState(1664); constantExpression();
				setState(1665); match(COLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1667); match(CASE);
				setState(1668); enumConstantName();
				setState(1669); match(COLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1671); match(DEFAULT);
				setState(1672); match(COLON);
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

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675); match(Identifier);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677); match(WHILE);
			setState(1678); match(LPAREN);
			setState(1679); expression();
			setState(1680); match(RPAREN);
			setState(1681); statement();
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

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWhileStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWhileStatementNoShortIf(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683); match(WHILE);
			setState(1684); match(LPAREN);
			setState(1685); expression();
			setState(1686); match(RPAREN);
			setState(1687); statementNoShortIf();
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

	public static class DoStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDoStatement(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689); match(DO);
			setState(1690); statement();
			setState(1691); match(WHILE);
			setState(1692); match(LPAREN);
			setState(1693); expression();
			setState(1694); match(RPAREN);
			setState(1695); match(SEMI);
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

	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_forStatement);
		try {
			setState(1699);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1697); basicForStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1698); enhancedForStatement();
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

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForStatementNoShortIf(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_forStatementNoShortIf);
		try {
			setState(1703);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1701); basicForStatementNoShortIf();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1702); enhancedForStatementNoShortIf();
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

	public static class BasicForStatementContext extends ParserRuleContext {
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBasicForStatement(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1705); match(FOR);
			setState(1706); match(LPAREN);
			setState(1708);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (INC - 82)) | (1L << (DEC - 82)) | (1L << (Identifier - 82)) | (1L << (AT - 82)))) != 0)) {
				{
				setState(1707); forInit();
				}
			}

			setState(1710); match(SEMI);
			setState(1712);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				setState(1711); expression();
				}
			}

			setState(1714); match(SEMI);
			setState(1716);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (INC - 82)) | (1L << (DEC - 82)) | (1L << (Identifier - 82)) | (1L << (AT - 82)))) != 0)) {
				{
				setState(1715); forUpdate();
				}
			}

			setState(1718); match(RPAREN);
			setState(1719); statement();
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

	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBasicForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBasicForStatementNoShortIf(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1721); match(FOR);
			setState(1722); match(LPAREN);
			setState(1724);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (INC - 82)) | (1L << (DEC - 82)) | (1L << (Identifier - 82)) | (1L << (AT - 82)))) != 0)) {
				{
				setState(1723); forInit();
				}
			}

			setState(1726); match(SEMI);
			setState(1728);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				setState(1727); expression();
				}
			}

			setState(1730); match(SEMI);
			setState(1732);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (INC - 82)) | (1L << (DEC - 82)) | (1L << (Identifier - 82)) | (1L << (AT - 82)))) != 0)) {
				{
				setState(1731); forUpdate();
				}
			}

			setState(1734); match(RPAREN);
			setState(1735); statementNoShortIf();
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_forInit);
		try {
			setState(1739);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1737); statementExpressionList();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1738); localVariableDeclaration();
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

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741); statementExpressionList();
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

	public static class StatementExpressionListContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementExpressionList(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743); statementExpression();
			setState(1748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1744); match(COMMA);
				setState(1745); statementExpression();
				}
				}
				setState(1750);
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

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnhancedForStatement(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751); match(FOR);
			setState(1752); match(LPAREN);
			setState(1756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1753); variableModifier();
				}
				}
				setState(1758);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1759); unannType();
			setState(1760); variableDeclaratorId();
			setState(1761); match(COLON);
			setState(1762); expression();
			setState(1763); match(RPAREN);
			setState(1764); statement();
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

	public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnhancedForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnhancedForStatementNoShortIf(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766); match(FOR);
			setState(1767); match(LPAREN);
			setState(1771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1768); variableModifier();
				}
				}
				setState(1773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1774); unannType();
			setState(1775); variableDeclaratorId();
			setState(1776); match(COLON);
			setState(1777); expression();
			setState(1778); match(RPAREN);
			setState(1779); statementNoShortIf();
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781); match(BREAK);
			setState(1783);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1782); match(Identifier);
				}
			}

			setState(1785); match(SEMI);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787); match(CONTINUE);
			setState(1789);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1788); match(Identifier);
				}
			}

			setState(1791); match(SEMI);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1793); match(RETURN);
			setState(1795);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				setState(1794); expression();
				}
			}

			setState(1797); match(SEMI);
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799); match(THROW);
			setState(1800); expression();
			setState(1801); match(SEMI);
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

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSynchronizedStatement(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1803); match(SYNCHRONIZED);
			setState(1804); match(LPAREN);
			setState(1805); expression();
			setState(1806); match(RPAREN);
			setState(1807); block();
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

	public static class TryStatementContext extends ParserRuleContext {
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_tryStatement);
		int _la;
		try {
			setState(1821);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1809); match(TRY);
				setState(1810); block();
				setState(1811); catches();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1813); match(TRY);
				setState(1814); block();
				setState(1816);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1815); catches();
					}
				}

				setState(1818); finally_();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1820); tryWithResourcesStatement();
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

	public static class CatchesContext extends ParserRuleContext {
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatches(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1823); catchClause();
			setState(1827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1824); catchClause();
				}
				}
				setState(1829);
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

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830); match(CATCH);
			setState(1831); match(LPAREN);
			setState(1832); catchFormalParameter();
			setState(1833); match(RPAREN);
			setState(1834); block();
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

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchFormalParameter(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1836); variableModifier();
				}
				}
				setState(1841);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1842); catchType();
			setState(1843); variableDeclaratorId();
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

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845); unannClassType();
			setState(1850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1846); match(BITOR);
				setState(1847); classType();
				}
				}
				setState(1852);
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

	public static class Finally_Context extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFinally_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFinally_(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 342, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853); match(FINALLY);
			setState(1854); block();
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

	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTryWithResourcesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTryWithResourcesStatement(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1856); match(TRY);
			setState(1857); resourceSpecification();
			setState(1858); block();
			setState(1860);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1859); catches();
				}
			}

			setState(1863);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1862); finally_();
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865); match(LPAREN);
			setState(1866); resourceList();
			setState(1868);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1867); match(SEMI);
				}
			}

			setState(1870); match(RPAREN);
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

	public static class ResourceListContext extends ParserRuleContext {
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResourceList(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1872); resource();
			setState(1877);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1873); match(SEMI);
					setState(1874); resource();
					}
					} 
				}
				setState(1879);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1880); variableModifier();
				}
				}
				setState(1885);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1886); unannType();
			setState(1887); variableDeclaratorId();
			setState(1888); match(ASSIGN);
			setState(1889); expression();
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

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1893);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1891); primaryNoNewArray_lfno_primary();
				}
				break;

			case 2:
				{
				setState(1892); arrayCreationExpression();
				}
				break;
			}
			setState(1898);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1895); primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(1900);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
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

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(1930);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1901); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1902); typeName();
				setState(1907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1903); match(LBRACK);
					setState(1904); match(RBRACK);
					}
					}
					setState(1909);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1910); match(DOT);
				setState(1911); match(CLASS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1913); match(VOID);
				setState(1914); match(DOT);
				setState(1915); match(CLASS);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1916); match(THIS);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1917); typeName();
				setState(1918); match(DOT);
				setState(1919); match(THIS);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1921); match(LPAREN);
				setState(1922); expression();
				setState(1923); match(RPAREN);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1925); classInstanceCreationExpression();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1926); fieldAccess();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1927); arrayAccess();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1928); methodInvocation();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1929); methodReference();
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

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(1962);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1934); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1935); typeName();
				setState(1940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1936); match(LBRACK);
					setState(1937); match(RBRACK);
					}
					}
					setState(1942);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1943); match(DOT);
				setState(1944); match(CLASS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1946); match(VOID);
				setState(1947); match(DOT);
				setState(1948); match(CLASS);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1949); match(THIS);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1950); typeName();
				setState(1951); match(DOT);
				setState(1952); match(THIS);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1954); match(LPAREN);
				setState(1955); expression();
				setState(1956); match(RPAREN);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1958); classInstanceCreationExpression();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1959); fieldAccess();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1960); methodInvocation();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1961); methodReference();
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

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(1969);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1964); classInstanceCreationExpression_lf_primary();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1965); fieldAccess_lf_primary();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1966); arrayAccess_lf_primary();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1967); methodInvocation_lf_primary();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1968); methodReference_lf_primary();
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

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(1977);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1973); classInstanceCreationExpression_lf_primary();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1974); fieldAccess_lf_primary();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1975); methodInvocation_lf_primary();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1976); methodReference_lf_primary();
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

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(2019);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1979); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1980); typeName();
				setState(1985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1981); match(LBRACK);
					setState(1982); match(RBRACK);
					}
					}
					setState(1987);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1988); match(DOT);
				setState(1989); match(CLASS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1991); unannPrimitiveType();
				setState(1996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1992); match(LBRACK);
					setState(1993); match(RBRACK);
					}
					}
					setState(1998);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1999); match(DOT);
				setState(2000); match(CLASS);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2002); match(VOID);
				setState(2003); match(DOT);
				setState(2004); match(CLASS);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2005); match(THIS);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2006); typeName();
				setState(2007); match(DOT);
				setState(2008); match(THIS);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2010); match(LPAREN);
				setState(2011); expression();
				setState(2012); match(RPAREN);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2014); classInstanceCreationExpression_lfno_primary();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2015); fieldAccess_lfno_primary();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2016); arrayAccess_lfno_primary();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2017); methodInvocation_lfno_primary();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2018); methodReference_lfno_primary();
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

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2062);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2023); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2024); typeName();
				setState(2029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2025); match(LBRACK);
					setState(2026); match(RBRACK);
					}
					}
					setState(2031);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2032); match(DOT);
				setState(2033); match(CLASS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2035); unannPrimitiveType();
				setState(2040);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2036); match(LBRACK);
					setState(2037); match(RBRACK);
					}
					}
					setState(2042);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2043); match(DOT);
				setState(2044); match(CLASS);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2046); match(VOID);
				setState(2047); match(DOT);
				setState(2048); match(CLASS);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2049); match(THIS);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2050); typeName();
				setState(2051); match(DOT);
				setState(2052); match(THIS);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2054); match(LPAREN);
				setState(2055); expression();
				setState(2056); match(RPAREN);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2058); classInstanceCreationExpression_lfno_primary();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2059); fieldAccess_lfno_primary();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2060); methodInvocation_lfno_primary();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2061); methodReference_lfno_primary();
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

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2147);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2064); match(NEW);
				setState(2066);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2065); typeArguments();
					}
				}

				setState(2071);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2068); annotation();
					}
					}
					setState(2073);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2074); match(Identifier);
				setState(2085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2075); match(DOT);
					setState(2079);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2076); annotation();
						}
						}
						setState(2081);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2082); match(Identifier);
					}
					}
					setState(2087);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2089);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2088); typeArgumentsOrDiamond();
					}
				}

				setState(2091); match(LPAREN);
				setState(2093);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2092); argumentList();
					}
				}

				setState(2095); match(RPAREN);
				setState(2097);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2096); classBody();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2099); expressionName();
				setState(2100); match(DOT);
				setState(2101); match(NEW);
				setState(2103);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2102); typeArguments();
					}
				}

				setState(2108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2105); annotation();
					}
					}
					setState(2110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2111); match(Identifier);
				setState(2113);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2112); typeArgumentsOrDiamond();
					}
				}

				setState(2115); match(LPAREN);
				setState(2117);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2116); argumentList();
					}
				}

				setState(2119); match(RPAREN);
				setState(2121);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2120); classBody();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2123); primary();
				setState(2124); match(DOT);
				setState(2125); match(NEW);
				setState(2127);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2126); typeArguments();
					}
				}

				setState(2132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2129); annotation();
					}
					}
					setState(2134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2135); match(Identifier);
				setState(2137);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2136); typeArgumentsOrDiamond();
					}
				}

				setState(2139); match(LPAREN);
				setState(2141);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2140); argumentList();
					}
				}

				setState(2143); match(RPAREN);
				setState(2145);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2144); classBody();
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

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression_lf_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2149); match(DOT);
			setState(2150); match(NEW);
			setState(2152);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2151); typeArguments();
				}
			}

			setState(2157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2154); annotation();
				}
				}
				setState(2159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2160); match(Identifier);
			setState(2162);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2161); typeArgumentsOrDiamond();
				}
			}

			setState(2164); match(LPAREN);
			setState(2166);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				setState(2165); argumentList();
				}
			}

			setState(2168); match(RPAREN);
			setState(2170);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(2169); classBody();
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

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2231);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2172); match(NEW);
				setState(2174);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2173); typeArguments();
					}
				}

				setState(2179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2176); annotation();
					}
					}
					setState(2181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2182); match(Identifier);
				setState(2193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2183); match(DOT);
					setState(2187);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2184); annotation();
						}
						}
						setState(2189);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2190); match(Identifier);
					}
					}
					setState(2195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2197);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2196); typeArgumentsOrDiamond();
					}
				}

				setState(2199); match(LPAREN);
				setState(2201);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2200); argumentList();
					}
				}

				setState(2203); match(RPAREN);
				setState(2205);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(2204); classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2207); expressionName();
				setState(2208); match(DOT);
				setState(2209); match(NEW);
				setState(2211);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2210); typeArguments();
					}
				}

				setState(2216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2213); annotation();
					}
					}
					setState(2218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2219); match(Identifier);
				setState(2221);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2220); typeArgumentsOrDiamond();
					}
				}

				setState(2223); match(LPAREN);
				setState(2225);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2224); argumentList();
					}
				}

				setState(2227); match(RPAREN);
				setState(2229);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(2228); classBody();
					}
					break;
				}
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

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_typeArgumentsOrDiamond);
		try {
			setState(2236);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2233); typeArguments();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2234); match(LT);
				setState(2235); match(GT);
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

	public static class FieldAccessContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_fieldAccess);
		try {
			setState(2251);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2238); primary();
				setState(2239); match(DOT);
				setState(2240); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2242); match(SUPER);
				setState(2243); match(DOT);
				setState(2244); match(Identifier);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2245); typeName();
				setState(2246); match(DOT);
				setState(2247); match(SUPER);
				setState(2248); match(DOT);
				setState(2249); match(Identifier);
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

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess_lf_primary(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2253); match(DOT);
			setState(2254); match(Identifier);
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

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess_lfno_primary(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_fieldAccess_lfno_primary);
		try {
			setState(2265);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2256); match(SUPER);
				setState(2257); match(DOT);
				setState(2258); match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2259); typeName();
				setState(2260); match(DOT);
				setState(2261); match(SUPER);
				setState(2262); match(DOT);
				setState(2263); match(Identifier);
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2277);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(2267); expressionName();
				setState(2268); match(LBRACK);
				setState(2269); expression();
				setState(2270); match(RBRACK);
				}
				break;

			case 2:
				{
				setState(2272); primaryNoNewArray_lfno_arrayAccess();
				setState(2273); match(LBRACK);
				setState(2274); expression();
				setState(2275); match(RBRACK);
				}
				break;
			}
			setState(2286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2279); primaryNoNewArray_lf_arrayAccess();
				setState(2280); match(LBRACK);
				setState(2281); expression();
				setState(2282); match(RBRACK);
				}
				}
				setState(2288);
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

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_lf_primary(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2289); primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2290); match(LBRACK);
			setState(2291); expression();
			setState(2292); match(RBRACK);
			}
			setState(2301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2294); primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2295); match(LBRACK);
					setState(2296); expression();
					setState(2297); match(RBRACK);
					}
					} 
				}
				setState(2303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
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

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_lfno_primary(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2314);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(2304); expressionName();
				setState(2305); match(LBRACK);
				setState(2306); expression();
				setState(2307); match(RBRACK);
				}
				break;

			case 2:
				{
				setState(2309); primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2310); match(LBRACK);
				setState(2311); expression();
				setState(2312); match(RBRACK);
				}
				break;
			}
			setState(2323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2316); primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2317); match(LBRACK);
					setState(2318); expression();
					setState(2319); match(RBRACK);
					}
					} 
				}
				setState(2325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
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

	public static class MethodInvocationContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_methodInvocation);
		int _la;
		try {
			setState(2394);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2326); methodName();
				setState(2327); match(LPAREN);
				setState(2329);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2328); argumentList();
					}
				}

				setState(2331); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2333); typeName();
				setState(2334); match(DOT);
				setState(2336);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2335); typeArguments();
					}
				}

				setState(2338); match(Identifier);
				setState(2339); match(LPAREN);
				setState(2341);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2340); argumentList();
					}
				}

				setState(2343); match(RPAREN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2345); expressionName();
				setState(2346); match(DOT);
				setState(2348);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2347); typeArguments();
					}
				}

				setState(2350); match(Identifier);
				setState(2351); match(LPAREN);
				setState(2353);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2352); argumentList();
					}
				}

				setState(2355); match(RPAREN);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2357); primary();
				setState(2358); match(DOT);
				setState(2360);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2359); typeArguments();
					}
				}

				setState(2362); match(Identifier);
				setState(2363); match(LPAREN);
				setState(2365);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2364); argumentList();
					}
				}

				setState(2367); match(RPAREN);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2369); match(SUPER);
				setState(2370); match(DOT);
				setState(2372);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2371); typeArguments();
					}
				}

				setState(2374); match(Identifier);
				setState(2375); match(LPAREN);
				setState(2377);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2376); argumentList();
					}
				}

				setState(2379); match(RPAREN);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2380); typeName();
				setState(2381); match(DOT);
				setState(2382); match(SUPER);
				setState(2383); match(DOT);
				setState(2385);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2384); typeArguments();
					}
				}

				setState(2387); match(Identifier);
				setState(2388); match(LPAREN);
				setState(2390);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2389); argumentList();
					}
				}

				setState(2392); match(RPAREN);
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

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation_lf_primary(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2396); match(DOT);
			setState(2398);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2397); typeArguments();
				}
			}

			setState(2400); match(Identifier);
			setState(2401); match(LPAREN);
			setState(2403);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				setState(2402); argumentList();
				}
			}

			setState(2405); match(RPAREN);
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

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation_lfno_primary(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2463);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2407); methodName();
				setState(2408); match(LPAREN);
				setState(2410);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2409); argumentList();
					}
				}

				setState(2412); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2414); typeName();
				setState(2415); match(DOT);
				setState(2417);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2416); typeArguments();
					}
				}

				setState(2419); match(Identifier);
				setState(2420); match(LPAREN);
				setState(2422);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2421); argumentList();
					}
				}

				setState(2424); match(RPAREN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2426); expressionName();
				setState(2427); match(DOT);
				setState(2429);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2428); typeArguments();
					}
				}

				setState(2431); match(Identifier);
				setState(2432); match(LPAREN);
				setState(2434);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2433); argumentList();
					}
				}

				setState(2436); match(RPAREN);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2438); match(SUPER);
				setState(2439); match(DOT);
				setState(2441);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2440); typeArguments();
					}
				}

				setState(2443); match(Identifier);
				setState(2444); match(LPAREN);
				setState(2446);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2445); argumentList();
					}
				}

				setState(2448); match(RPAREN);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2449); typeName();
				setState(2450); match(DOT);
				setState(2451); match(SUPER);
				setState(2452); match(DOT);
				setState(2454);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2453); typeArguments();
					}
				}

				setState(2456); match(Identifier);
				setState(2457); match(LPAREN);
				setState(2459);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2458); argumentList();
					}
				}

				setState(2461); match(RPAREN);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2465); expression();
			setState(2470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2466); match(COMMA);
				setState(2467); expression();
				}
				}
				setState(2472);
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

	public static class MethodReferenceContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_methodReference);
		int _la;
		try {
			setState(2520);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2473); expressionName();
				setState(2474); match(COLONCOLON);
				setState(2476);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2475); typeArguments();
					}
				}

				setState(2478); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2480); referenceType();
				setState(2481); match(COLONCOLON);
				setState(2483);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2482); typeArguments();
					}
				}

				setState(2485); match(Identifier);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2487); primary();
				setState(2488); match(COLONCOLON);
				setState(2490);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2489); typeArguments();
					}
				}

				setState(2492); match(Identifier);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2494); match(SUPER);
				setState(2495); match(COLONCOLON);
				setState(2497);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2496); typeArguments();
					}
				}

				setState(2499); match(Identifier);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2500); typeName();
				setState(2501); match(DOT);
				setState(2502); match(SUPER);
				setState(2503); match(COLONCOLON);
				setState(2505);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2504); typeArguments();
					}
				}

				setState(2507); match(Identifier);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2509); classType();
				setState(2510); match(COLONCOLON);
				setState(2512);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2511); typeArguments();
					}
				}

				setState(2514); match(NEW);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2516); arrayType();
				setState(2517); match(COLONCOLON);
				setState(2518); match(NEW);
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

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference_lf_primary(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2522); match(COLONCOLON);
			setState(2524);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2523); typeArguments();
				}
			}

			setState(2526); match(Identifier);
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

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference_lfno_primary(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2568);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2528); expressionName();
				setState(2529); match(COLONCOLON);
				setState(2531);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2530); typeArguments();
					}
				}

				setState(2533); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2535); referenceType();
				setState(2536); match(COLONCOLON);
				setState(2538);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2537); typeArguments();
					}
				}

				setState(2540); match(Identifier);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2542); match(SUPER);
				setState(2543); match(COLONCOLON);
				setState(2545);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2544); typeArguments();
					}
				}

				setState(2547); match(Identifier);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2548); typeName();
				setState(2549); match(DOT);
				setState(2550); match(SUPER);
				setState(2551); match(COLONCOLON);
				setState(2553);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2552); typeArguments();
					}
				}

				setState(2555); match(Identifier);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2557); classType();
				setState(2558); match(COLONCOLON);
				setState(2560);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2559); typeArguments();
					}
				}

				setState(2562); match(NEW);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2564); arrayType();
				setState(2565); match(COLONCOLON);
				setState(2566); match(NEW);
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

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayCreationExpression(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_arrayCreationExpression);
		try {
			setState(2592);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2570); match(NEW);
				setState(2571); primitiveType();
				setState(2572); dimExprs();
				setState(2574);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2573); dims();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2576); match(NEW);
				setState(2577); classOrInterfaceType();
				setState(2578); dimExprs();
				setState(2580);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2579); dims();
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2582); match(NEW);
				setState(2583); primitiveType();
				setState(2584); dims();
				setState(2585); arrayInitializer();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2587); match(NEW);
				setState(2588); classOrInterfaceType();
				setState(2589); dims();
				setState(2590); arrayInitializer();
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

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDimExprs(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2594); dimExpr();
			setState(2598);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2595); dimExpr();
					}
					} 
				}
				setState(2600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
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

	public static class DimExprContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDimExpr(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2601); annotation();
				}
				}
				setState(2606);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2607); match(LBRACK);
			setState(2608); expression();
			setState(2609); match(RBRACK);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2611); expression();
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
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_expression);
		try {
			setState(2615);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2613); lambdaExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2614); assignmentExpression();
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

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2617); lambdaParameters();
			setState(2618); match(ARROW);
			setState(2619); lambdaBody();
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

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_lambdaParameters);
		int _la;
		try {
			setState(2631);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2621); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2622); match(LPAREN);
				setState(2624);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(2623); formalParameterList();
					}
				}

				setState(2626); match(RPAREN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2627); match(LPAREN);
				setState(2628); inferredFormalParameterList();
				setState(2629); match(RPAREN);
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

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInferredFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInferredFormalParameterList(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2633); match(Identifier);
			setState(2638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2634); match(COMMA);
				setState(2635); match(Identifier);
				}
				}
				setState(2640);
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

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_lambdaBody);
		try {
			setState(2643);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2641); expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2642); block();
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_assignmentExpression);
		try {
			setState(2647);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2645); conditionalExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2646); assignment();
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

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2649); leftHandSide();
			setState(2650); assignmentOperator();
			setState(2651); expression();
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

	public static class LeftHandSideContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLeftHandSide(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_leftHandSide);
		try {
			setState(2656);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2653); expressionName();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2654); fieldAccess();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2655); arrayAccess();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2658);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (ASSIGN - 69)) | (1L << (ADD_ASSIGN - 69)) | (1L << (SUB_ASSIGN - 69)) | (1L << (MUL_ASSIGN - 69)) | (1L << (DIV_ASSIGN - 69)) | (1L << (AND_ASSIGN - 69)) | (1L << (OR_ASSIGN - 69)) | (1L << (XOR_ASSIGN - 69)) | (1L << (MOD_ASSIGN - 69)) | (1L << (LSHIFT_ASSIGN - 69)) | (1L << (RSHIFT_ASSIGN - 69)) | (1L << (URSHIFT_ASSIGN - 69)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_conditionalExpression);
		try {
			setState(2667);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2660); conditionalOrExpression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2661); conditionalOrExpression(0);
				setState(2662); match(QUESTION);
				setState(2663); expression();
				setState(2664); match(COLON);
				setState(2665); conditionalExpression();
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

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 434;
		enterRecursionRule(_localctx, 434, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2670); conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2672);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2673); match(OR);
					setState(2674); conditionalAndExpression(0);
					}
					} 
				}
				setState(2679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 436;
		enterRecursionRule(_localctx, 436, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2681); inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2683);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2684); match(AND);
					setState(2685); inclusiveOrExpression(0);
					}
					} 
				}
				setState(2690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 438;
		enterRecursionRule(_localctx, 438, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2692); exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2699);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2694);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2695); match(BITOR);
					setState(2696); exclusiveOrExpression(0);
					}
					} 
				}
				setState(2701);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 440;
		enterRecursionRule(_localctx, 440, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2703); andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2705);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2706); match(CARET);
					setState(2707); andExpression(0);
					}
					} 
				}
				setState(2712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 442;
		enterRecursionRule(_localctx, 442, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2714); equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2716);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2717); match(BITAND);
					setState(2718); equalityExpression(0);
					}
					} 
				}
				setState(2723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 444;
		enterRecursionRule(_localctx, 444, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2725); relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2735);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2733);
					switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2727);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2728); match(EQUAL);
						setState(2729); relationalExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2730);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2731); match(NOTEQUAL);
						setState(2732); relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2737);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2739); shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2756);
					switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2741);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2742); match(LT);
						setState(2743); shiftExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2744);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2745); match(GT);
						setState(2746); shiftExpression(0);
						}
						break;

					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2747);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2748); match(LE);
						setState(2749); shiftExpression(0);
						}
						break;

					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2750);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2751); match(GE);
						setState(2752); shiftExpression(0);
						}
						break;

					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2753);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2754); match(INSTANCEOF);
						setState(2755); referenceType();
						}
						break;
					}
					} 
				}
				setState(2760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
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

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 448;
		enterRecursionRule(_localctx, 448, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2762); additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2779);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2777);
					switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2764);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2765); match(LT);
						setState(2766); match(LT);
						setState(2767); additiveExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2768);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2769); match(GT);
						setState(2770); match(GT);
						setState(2771); additiveExpression(0);
						}
						break;

					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2772);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2773); match(GT);
						setState(2774); match(GT);
						setState(2775); match(GT);
						setState(2776); additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 450;
		enterRecursionRule(_localctx, 450, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2783); multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2793);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2791);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2785);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2786); match(ADD);
						setState(2787); multiplicativeExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2788);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2789); match(SUB);
						setState(2790); multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2795);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 452;
		enterRecursionRule(_localctx, 452, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2797); unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2810);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2808);
					switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2799);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2800); match(MUL);
						setState(2801); unaryExpression();
						}
						break;

					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2802);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2803); match(DIV);
						setState(2804); unaryExpression();
						}
						break;

					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2805);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2806); match(MOD);
						setState(2807); unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2812);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_unaryExpression);
		try {
			setState(2820);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2813); preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2814); preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2815); match(ADD);
				setState(2816); unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2817); match(SUB);
				setState(2818); unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2819); unaryExpressionNotPlusMinus();
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

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPreIncrementExpression(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2822); match(INC);
			setState(2823); unaryExpression();
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

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPreDecrementExpression(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2825); match(DEC);
			setState(2826); unaryExpression();
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

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2834);
			switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2828); postfixExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2829); match(TILDE);
				setState(2830); unaryExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2831); match(BANG);
				setState(2832); unaryExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2833); castExpression();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2838);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				{
				setState(2836); primary();
				}
				break;

			case 2:
				{
				setState(2837); expressionName();
				}
				break;
			}
			setState(2844);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2842);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(2840); postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(2841); postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2846);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
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

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostIncrementExpression(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2847); postfixExpression();
			setState(2848); match(INC);
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

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2850); match(INC);
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

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostDecrementExpression(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2852); postfixExpression();
			setState(2853); match(DEC);
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

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2855); match(DEC);
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

	public static class CastExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_castExpression);
		int _la;
		try {
			setState(2884);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2857); match(LPAREN);
				setState(2858); primitiveType();
				setState(2859); match(RPAREN);
				setState(2860); unaryExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2862); match(LPAREN);
				setState(2863); referenceType();
				setState(2867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2864); additionalBound();
					}
					}
					setState(2869);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2870); match(RPAREN);
				setState(2871); unaryExpressionNotPlusMinus();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2873); match(LPAREN);
				setState(2874); referenceType();
				setState(2878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2875); additionalBound();
					}
					}
					setState(2880);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2881); match(RPAREN);
				setState(2882); lambdaExpression();
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

	public static class JsxElementContext extends ParserRuleContext {
		public JsxOpeningElementContext jsxOpeningElement() {
			return getRuleContext(JsxOpeningElementContext.class,0);
		}
		public List<JsxChildrenContext> jsxChildren() {
			return getRuleContexts(JsxChildrenContext.class);
		}
		public JsxClosingElementContext jsxClosingElement() {
			return getRuleContext(JsxClosingElementContext.class,0);
		}
		public JsxSelfClosingElementContext jsxSelfClosingElement() {
			return getRuleContext(JsxSelfClosingElementContext.class,0);
		}
		public JsxChildrenContext jsxChildren(int i) {
			return getRuleContext(JsxChildrenContext.class,i);
		}
		public JsxElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterJsxElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitJsxElement(this);
		}
	}

	public final JsxElementContext jsxElement() throws RecognitionException {
		JsxElementContext _localctx = new JsxElementContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_jsxElement);
		int _la;
		try {
			setState(2896);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2886); jsxOpeningElement();
				setState(2890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACE || _la==LT) {
					{
					{
					setState(2887); jsxChildren();
					}
					}
					setState(2892);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2893); jsxClosingElement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2895); jsxSelfClosingElement();
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

	public static class JsxSelfClosingElementContext extends ParserRuleContext {
		public JsxAttributeContext jsxAttribute(int i) {
			return getRuleContext(JsxAttributeContext.class,i);
		}
		public JsxElementNameContext jsxElementName() {
			return getRuleContext(JsxElementNameContext.class,0);
		}
		public List<JsxAttributeContext> jsxAttribute() {
			return getRuleContexts(JsxAttributeContext.class);
		}
		public JsxSelfClosingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxSelfClosingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterJsxSelfClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitJsxSelfClosingElement(this);
		}
	}

	public final JsxSelfClosingElementContext jsxSelfClosingElement() throws RecognitionException {
		JsxSelfClosingElementContext _localctx = new JsxSelfClosingElementContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_jsxSelfClosingElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2898); match(LT);
			setState(2899); jsxElementName();
			setState(2903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(2900); jsxAttribute();
				}
				}
				setState(2905);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2906); match(T__0);
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

	public static class JsxOpeningElementContext extends ParserRuleContext {
		public JsxAttributeContext jsxAttribute(int i) {
			return getRuleContext(JsxAttributeContext.class,i);
		}
		public JsxElementNameContext jsxElementName() {
			return getRuleContext(JsxElementNameContext.class,0);
		}
		public List<JsxAttributeContext> jsxAttribute() {
			return getRuleContexts(JsxAttributeContext.class);
		}
		public JsxOpeningElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxOpeningElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterJsxOpeningElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitJsxOpeningElement(this);
		}
	}

	public final JsxOpeningElementContext jsxOpeningElement() throws RecognitionException {
		JsxOpeningElementContext _localctx = new JsxOpeningElementContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_jsxOpeningElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2908); match(LT);
			setState(2909); jsxElementName();
			setState(2913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(2910); jsxAttribute();
				}
				}
				setState(2915);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2916); match(GT);
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

	public static class JsxChildrenContext extends ParserRuleContext {
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public JsxBlockContext jsxBlock() {
			return getRuleContext(JsxBlockContext.class,0);
		}
		public JsxChildrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxChildren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterJsxChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitJsxChildren(this);
		}
	}

	public final JsxChildrenContext jsxChildren() throws RecognitionException {
		JsxChildrenContext _localctx = new JsxChildrenContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_jsxChildren);
		try {
			setState(2920);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2918); jsxElement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2919); jsxBlock();
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

	public static class JsxClosingElementContext extends ParserRuleContext {
		public JsxElementNameContext jsxElementName() {
			return getRuleContext(JsxElementNameContext.class,0);
		}
		public JsxClosingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxClosingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterJsxClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitJsxClosingElement(this);
		}
	}

	public final JsxClosingElementContext jsxClosingElement() throws RecognitionException {
		JsxClosingElementContext _localctx = new JsxClosingElementContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_jsxClosingElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2922); match(T__1);
			setState(2923); jsxElementName();
			setState(2924); match(GT);
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

	public static class JsxElementNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public JsxElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterJsxElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitJsxElementName(this);
		}
	}

	public final JsxElementNameContext jsxElementName() throws RecognitionException {
		JsxElementNameContext _localctx = new JsxElementNameContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_jsxElementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2926); match(Identifier);
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

	public static class JsxAttributeContext extends ParserRuleContext {
		public JsxAttributeNameContext jsxAttributeName() {
			return getRuleContext(JsxAttributeNameContext.class,0);
		}
		public JsxAttributeValueContext jsxAttributeValue() {
			return getRuleContext(JsxAttributeValueContext.class,0);
		}
		public JsxAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterJsxAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitJsxAttribute(this);
		}
	}

	public final JsxAttributeContext jsxAttribute() throws RecognitionException {
		JsxAttributeContext _localctx = new JsxAttributeContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_jsxAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2928); jsxAttributeName();
			setState(2929); match(ASSIGN);
			setState(2930); jsxAttributeValue();
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

	public static class JsxAttributeValueContext extends ParserRuleContext {
		public JsxSingleStringAttributeValueContext jsxSingleStringAttributeValue() {
			return getRuleContext(JsxSingleStringAttributeValueContext.class,0);
		}
		public JsxBlockAttributeValueContext jsxBlockAttributeValue() {
			return getRuleContext(JsxBlockAttributeValueContext.class,0);
		}
		public JsxDoubleStringAttributeValueContext jsxDoubleStringAttributeValue() {
			return getRuleContext(JsxDoubleStringAttributeValueContext.class,0);
		}
		public JsxAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterJsxAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitJsxAttributeValue(this);
		}
	}

	public final JsxAttributeValueContext jsxAttributeValue() throws RecognitionException {
		JsxAttributeValueContext _localctx = new JsxAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_jsxAttributeValue);
		try {
			setState(2935);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2932); jsxDoubleStringAttributeValue();
				}
				break;
			case T__2:
			case CharacterLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2933); jsxSingleStringAttributeValue();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2934); jsxBlockAttributeValue();
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

	public static class JsxDoubleStringAttributeValueContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }
		public JsxDoubleStringAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxDoubleStringAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterJsxDoubleStringAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitJsxDoubleStringAttributeValue(this);
		}
	}

	public final JsxDoubleStringAttributeValueContext jsxDoubleStringAttributeValue() throws RecognitionException {
		JsxDoubleStringAttributeValueContext _localctx = new JsxDoubleStringAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_jsxDoubleStringAttributeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2937); match(StringLiteral);
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

	public static class JsxSingleStringAttributeValueContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Java8Parser.CharacterLiteral, 0); }
		public JsxSingleStringAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxSingleStringAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterJsxSingleStringAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitJsxSingleStringAttributeValue(this);
		}
	}

	public final JsxSingleStringAttributeValueContext jsxSingleStringAttributeValue() throws RecognitionException {
		JsxSingleStringAttributeValueContext _localctx = new JsxSingleStringAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_jsxSingleStringAttributeValue);
		try {
			setState(2943);
			switch (_input.LA(1)) {
			case CharacterLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2939); match(CharacterLiteral);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2940); match(T__2);
				setState(2941); match(Identifier);
				setState(2942); match(T__2);
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

	public static class JsxBlockAttributeValueContext extends ParserRuleContext {
		public JsxBlockContext jsxBlock() {
			return getRuleContext(JsxBlockContext.class,0);
		}
		public JsxBlockAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxBlockAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterJsxBlockAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitJsxBlockAttributeValue(this);
		}
	}

	public final JsxBlockAttributeValueContext jsxBlockAttributeValue() throws RecognitionException {
		JsxBlockAttributeValueContext _localctx = new JsxBlockAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_jsxBlockAttributeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2945); jsxBlock();
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

	public static class JsxBlockContext extends ParserRuleContext {
		public AssigmentExpressionContext assigmentExpression() {
			return getRuleContext(AssigmentExpressionContext.class,0);
		}
		public JsxBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterJsxBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitJsxBlock(this);
		}
	}

	public final JsxBlockContext jsxBlock() throws RecognitionException {
		JsxBlockContext _localctx = new JsxBlockContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_jsxBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2947); match(LBRACE);
			setState(2948); assigmentExpression();
			setState(2949); match(RBRACE);
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

	public static class AssigmentExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public AssigmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssigmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssigmentExpression(this);
		}
	}

	public final AssigmentExpressionContext assigmentExpression() throws RecognitionException {
		AssigmentExpressionContext _localctx = new AssigmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_assigmentExpression);
		int _la;
		try {
			setState(2955);
			switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2952);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2951); blockStatements();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2954); shiftExpression(0);
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

	public static class JsxAttributeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public JsxAttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterJsxAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitJsxAttributeName(this);
		}
	}

	public final JsxAttributeNameContext jsxAttributeName() throws RecognitionException {
		JsxAttributeNameContext _localctx = new JsxAttributeNameContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_jsxAttributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2957); match(Identifier);
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
		case 26: return packageName_sempred((PackageNameContext)_localctx, predIndex);

		case 28: return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);

		case 31: return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);

		case 217: return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);

		case 218: return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);

		case 219: return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);

		case 220: return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);

		case 221: return andExpression_sempred((AndExpressionContext)_localctx, predIndex);

		case 222: return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);

		case 223: return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);

		case 224: return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);

		case 225: return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);

		case 226: return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16: return precpred(_ctx, 2);

		case 17: return precpred(_ctx, 1);

		case 15: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18: return precpred(_ctx, 2);

		case 19: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return precpred(_ctx, 5);

		case 11: return precpred(_ctx, 4);

		case 12: return precpred(_ctx, 3);

		case 13: return precpred(_ctx, 2);

		case 14: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20: return precpred(_ctx, 3);

		case 21: return precpred(_ctx, 2);

		case 22: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return precpred(_ctx, 2);

		case 9: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3p\u0b92\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\3\2\3\2\3\3\3\3\5\3\u01fd\n\3"+
		"\3\4\7\4\u0200\n\4\f\4\16\4\u0203\13\4\3\4\3\4\7\4\u0207\n\4\f\4\16\4"+
		"\u020a\13\4\3\4\5\4\u020d\n\4\3\5\3\5\5\5\u0211\n\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\5\b\u021a\n\b\3\t\3\t\5\t\u021e\n\t\3\t\3\t\7\t\u0222\n\t\f"+
		"\t\16\t\u0225\13\t\3\n\7\n\u0228\n\n\f\n\16\n\u022b\13\n\3\n\3\n\5\n\u022f"+
		"\n\n\3\n\3\n\3\n\7\n\u0234\n\n\f\n\16\n\u0237\13\n\3\n\3\n\5\n\u023b\n"+
		"\n\5\n\u023d\n\n\3\13\3\13\7\13\u0241\n\13\f\13\16\13\u0244\13\13\3\13"+
		"\3\13\5\13\u0248\n\13\3\f\7\f\u024b\n\f\f\f\16\f\u024e\13\f\3\f\3\f\5"+
		"\f\u0252\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\7\20\u025b\n\20\f\20\16"+
		"\20\u025e\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u026b\n\21\3\22\7\22\u026e\n\22\f\22\16\22\u0271\13\22\3\22\3\22"+
		"\3\22\7\22\u0276\n\22\f\22\16\22\u0279\13\22\3\22\3\22\7\22\u027d\n\22"+
		"\f\22\16\22\u0280\13\22\3\23\7\23\u0283\n\23\f\23\16\23\u0286\13\23\3"+
		"\23\3\23\5\23\u028a\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u0293"+
		"\n\25\f\25\16\25\u0296\13\25\5\25\u0298\n\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\7\30\u02a4\n\30\f\30\16\30\u02a7\13\30\3\31"+
		"\3\31\5\31\u02ab\n\31\3\32\7\32\u02ae\n\32\f\32\16\32\u02b1\13\32\3\32"+
		"\3\32\5\32\u02b5\n\32\3\33\3\33\3\33\3\33\5\33\u02bb\n\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\7\34\u02c3\n\34\f\34\16\34\u02c6\13\34\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u02cd\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u02d5"+
		"\n\36\f\36\16\36\u02d8\13\36\3\37\3\37\3\37\3\37\3\37\5\37\u02df\n\37"+
		"\3 \3 \3!\3!\3!\3!\3!\3!\7!\u02e9\n!\f!\16!\u02ec\13!\3\"\5\"\u02ef\n"+
		"\"\3\"\7\"\u02f2\n\"\f\"\16\"\u02f5\13\"\3\"\7\"\u02f8\n\"\f\"\16\"\u02fb"+
		"\13\"\3\"\3\"\3#\7#\u0300\n#\f#\16#\u0303\13#\3#\3#\3#\3#\7#\u0309\n#"+
		"\f#\16#\u030c\13#\3#\3#\3$\3$\3%\3%\3%\3%\5%\u0316\n%\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3"+
		"*\5*\u0333\n*\3+\3+\5+\u0337\n+\3,\7,\u033a\n,\f,\16,\u033d\13,\3,\3,"+
		"\3,\5,\u0342\n,\3,\5,\u0345\n,\3,\5,\u0348\n,\3,\3,\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\5-\u0354\n-\3.\3.\3.\3.\3/\3/\3/\7/\u035d\n/\f/\16/\u0360\13/\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\7\62\u036b\n\62\f\62\16\62"+
		"\u036e\13\62\3\63\3\63\7\63\u0372\n\63\f\63\16\63\u0375\13\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\5\64\u037d\n\64\3\65\3\65\3\65\3\65\3\65\5\65\u0384"+
		"\n\65\3\66\7\66\u0387\n\66\f\66\16\66\u038a\13\66\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0398\n\67\38\38\38\78\u039d"+
		"\n8\f8\168\u03a0\138\39\39\39\59\u03a5\n9\3:\3:\5:\u03a9\n:\3;\3;\5;\u03ad"+
		"\n;\3<\3<\5<\u03b1\n<\3=\3=\5=\u03b5\n=\3>\3>\3>\5>\u03ba\n>\3?\3?\5?"+
		"\u03be\n?\3?\3?\7?\u03c2\n?\f?\16?\u03c5\13?\3@\3@\5@\u03c9\n@\3@\3@\3"+
		"@\7@\u03ce\n@\f@\16@\u03d1\13@\3@\3@\5@\u03d5\n@\5@\u03d7\n@\3A\3A\7A"+
		"\u03db\nA\fA\16A\u03de\13A\3A\3A\5A\u03e2\nA\3B\3B\5B\u03e6\nB\3C\3C\3"+
		"D\3D\3E\3E\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u03f9\nG\3H\7H\u03fc\n"+
		"H\fH\16H\u03ff\13H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u040e\nI"+
		"\3J\3J\3J\5J\u0413\nJ\3J\3J\7J\u0417\nJ\fJ\16J\u041a\13J\3J\3J\3J\5J\u041f"+
		"\nJ\5J\u0421\nJ\3K\3K\5K\u0425\nK\3L\3L\3L\5L\u042a\nL\3L\3L\5L\u042e"+
		"\nL\3M\3M\3M\3M\3M\5M\u0435\nM\3N\3N\3N\7N\u043a\nN\fN\16N\u043d\13N\3"+
		"N\3N\3N\7N\u0442\nN\fN\16N\u0445\13N\5N\u0447\nN\3O\7O\u044a\nO\fO\16"+
		"O\u044d\13O\3O\3O\3O\3P\3P\5P\u0454\nP\3Q\7Q\u0457\nQ\fQ\16Q\u045a\13"+
		"Q\3Q\3Q\7Q\u045e\nQ\fQ\16Q\u0461\13Q\3Q\3Q\3Q\3Q\5Q\u0467\nQ\3R\7R\u046a"+
		"\nR\fR\16R\u046d\13R\3R\3R\3R\5R\u0472\nR\3R\3R\3S\3S\3S\3T\3T\3T\7T\u047c"+
		"\nT\fT\16T\u047f\13T\3U\3U\5U\u0483\nU\3V\3V\5V\u0487\nV\3W\3W\3X\3X\3"+
		"X\3Y\7Y\u048f\nY\fY\16Y\u0492\13Y\3Y\3Y\5Y\u0496\nY\3Y\3Y\3Z\3Z\3Z\3Z"+
		"\5Z\u049e\nZ\3[\5[\u04a1\n[\3[\3[\3[\5[\u04a6\n[\3[\3[\3\\\3\\\3]\3]\5"+
		"]\u04ae\n]\3]\5]\u04b1\n]\3]\3]\3^\5^\u04b6\n^\3^\3^\3^\5^\u04bb\n^\3"+
		"^\3^\3^\5^\u04c0\n^\3^\3^\3^\5^\u04c5\n^\3^\3^\3^\3^\3^\5^\u04cc\n^\3"+
		"^\3^\3^\5^\u04d1\n^\3^\3^\3^\3^\3^\3^\5^\u04d9\n^\3^\3^\3^\5^\u04de\n"+
		"^\3^\3^\3^\5^\u04e3\n^\3_\7_\u04e6\n_\f_\16_\u04e9\13_\3_\3_\3_\5_\u04ee"+
		"\n_\3_\3_\3`\3`\5`\u04f4\n`\3`\5`\u04f7\n`\3`\5`\u04fa\n`\3`\3`\3a\3a"+
		"\3a\7a\u0501\na\fa\16a\u0504\13a\3b\7b\u0507\nb\fb\16b\u050a\13b\3b\3"+
		"b\3b\5b\u050f\nb\3b\5b\u0512\nb\3b\5b\u0515\nb\3c\3c\3d\3d\7d\u051b\n"+
		"d\fd\16d\u051e\13d\3e\3e\5e\u0522\ne\3f\7f\u0525\nf\ff\16f\u0528\13f\3"+
		"f\3f\3f\5f\u052d\nf\3f\5f\u0530\nf\3f\3f\3g\3g\3g\3g\3g\3g\3g\5g\u053b"+
		"\ng\3h\3h\3h\3i\3i\7i\u0542\ni\fi\16i\u0545\13i\3i\3i\3j\3j\3j\3j\3j\5"+
		"j\u054e\nj\3k\7k\u0551\nk\fk\16k\u0554\13k\3k\3k\3k\3k\3l\3l\3l\3l\5l"+
		"\u055e\nl\3m\7m\u0561\nm\fm\16m\u0564\13m\3m\3m\3m\3n\3n\3n\3n\3n\3n\5"+
		"n\u056f\nn\3o\7o\u0572\no\fo\16o\u0575\13o\3o\3o\3o\3o\3o\3p\3p\7p\u057e"+
		"\np\fp\16p\u0581\13p\3p\3p\3q\3q\3q\3q\3q\5q\u058a\nq\3r\7r\u058d\nr\f"+
		"r\16r\u0590\13r\3r\3r\3r\3r\3r\5r\u0597\nr\3r\5r\u059a\nr\3r\3r\3s\3s"+
		"\3s\5s\u05a1\ns\3t\3t\3t\3u\3u\3u\5u\u05a9\nu\3v\3v\3v\3v\5v\u05af\nv"+
		"\3v\3v\3w\3w\3w\7w\u05b6\nw\fw\16w\u05b9\13w\3x\3x\3x\3x\3y\3y\3y\5y\u05c2"+
		"\ny\3z\3z\5z\u05c6\nz\3z\5z\u05c9\nz\3z\3z\3{\3{\3{\7{\u05d0\n{\f{\16"+
		"{\u05d3\13{\3|\3|\3|\3}\3}\3}\3}\3}\3}\3~\3~\5~\u05e0\n~\3~\5~\u05e3\n"+
		"~\3~\3~\3\177\3\177\3\177\7\177\u05ea\n\177\f\177\16\177\u05ed\13\177"+
		"\3\u0080\3\u0080\5\u0080\u05f1\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\7\u0081\u05f7\n\u0081\f\u0081\16\u0081\u05fa\13\u0081\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\5\u0082\u0600\n\u0082\3\u0083\3\u0083\3\u0083\3\u0084"+
		"\7\u0084\u0606\n\u0084\f\u0084\16\u0084\u0609\13\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0614"+
		"\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u061b\n\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\5\u0087\u0629\n\u0087\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b"+
		"\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c"+
		"\u063f\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0661"+
		"\n\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092"+
		"\7\u0092\u066b\n\u0092\f\u0092\16\u0092\u066e\13\u0092\3\u0092\7\u0092"+
		"\u0671\n\u0092\f\u0092\16\u0092\u0674\13\u0092\3\u0092\3\u0092\3\u0093"+
		"\3\u0093\3\u0093\3\u0094\3\u0094\7\u0094\u067d\n\u0094\f\u0094\16\u0094"+
		"\u0680\13\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\5\u0095\u068c\n\u0095\3\u0096\3\u0096\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u009a\3\u009a\5\u009a\u06a6\n\u009a\3\u009b\3\u009b\5\u009b"+
		"\u06aa\n\u009b\3\u009c\3\u009c\3\u009c\5\u009c\u06af\n\u009c\3\u009c\3"+
		"\u009c\5\u009c\u06b3\n\u009c\3\u009c\3\u009c\5\u009c\u06b7\n\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\5\u009d\u06bf\n\u009d\3\u009d"+
		"\3\u009d\5\u009d\u06c3\n\u009d\3\u009d\3\u009d\5\u009d\u06c7\n\u009d\3"+
		"\u009d\3\u009d\3\u009d\3\u009e\3\u009e\5\u009e\u06ce\n\u009e\3\u009f\3"+
		"\u009f\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u06d5\n\u00a0\f\u00a0\16\u00a0"+
		"\u06d8\13\u00a0\3\u00a1\3\u00a1\3\u00a1\7\u00a1\u06dd\n\u00a1\f\u00a1"+
		"\16\u00a1\u06e0\13\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a2\3\u00a2\3\u00a2\7\u00a2\u06ec\n\u00a2\f\u00a2\16\u00a2"+
		"\u06ef\13\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a3\3\u00a3\5\u00a3\u06fa\n\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4"+
		"\5\u00a4\u0700\n\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\5\u00a5\u0706\n"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\5\u00a8\u071b\n\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8"+
		"\u0720\n\u00a8\3\u00a9\3\u00a9\7\u00a9\u0724\n\u00a9\f\u00a9\16\u00a9"+
		"\u0727\13\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab"+
		"\7\u00ab\u0730\n\u00ab\f\u00ab\16\u00ab\u0733\13\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ac\3\u00ac\3\u00ac\7\u00ac\u073b\n\u00ac\f\u00ac\16\u00ac"+
		"\u073e\13\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\5\u00ae\u0747\n\u00ae\3\u00ae\5\u00ae\u074a\n\u00ae\3\u00af\3\u00af\3"+
		"\u00af\5\u00af\u074f\n\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\7"+
		"\u00b0\u0756\n\u00b0\f\u00b0\16\u00b0\u0759\13\u00b0\3\u00b1\7\u00b1\u075c"+
		"\n\u00b1\f\u00b1\16\u00b1\u075f\13\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b2\3\u00b2\5\u00b2\u0768\n\u00b2\3\u00b2\7\u00b2\u076b\n"+
		"\u00b2\f\u00b2\16\u00b2\u076e\13\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\7\u00b3\u0774\n\u00b3\f\u00b3\16\u00b3\u0777\13\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\5\u00b3\u078d\n\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\7\u00b5\u0795\n\u00b5\f\u00b5\16\u00b5\u0798\13\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5"+
		"\u07ad\n\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u07b4\n"+
		"\u00b6\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u07bc\n"+
		"\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\7\u00b9\u07c2\n\u00b9\f\u00b9\16"+
		"\u00b9\u07c5\13\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\7\u00b9\u07cd\n\u00b9\f\u00b9\16\u00b9\u07d0\13\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\5\u00b9\u07e6\n\u00b9\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\7\u00bb\u07ee\n\u00bb\f\u00bb\16\u00bb\u07f1\13\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\7\u00bb\u07f9\n\u00bb\f\u00bb\16\u00bb"+
		"\u07fc\13\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0811\n\u00bb\3\u00bc\3\u00bc\5\u00bc"+
		"\u0815\n\u00bc\3\u00bc\7\u00bc\u0818\n\u00bc\f\u00bc\16\u00bc\u081b\13"+
		"\u00bc\3\u00bc\3\u00bc\3\u00bc\7\u00bc\u0820\n\u00bc\f\u00bc\16\u00bc"+
		"\u0823\13\u00bc\3\u00bc\7\u00bc\u0826\n\u00bc\f\u00bc\16\u00bc\u0829\13"+
		"\u00bc\3\u00bc\5\u00bc\u082c\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u0830\n\u00bc"+
		"\3\u00bc\3\u00bc\5\u00bc\u0834\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\5\u00bc\u083a\n\u00bc\3\u00bc\7\u00bc\u083d\n\u00bc\f\u00bc\16\u00bc"+
		"\u0840\13\u00bc\3\u00bc\3\u00bc\5\u00bc\u0844\n\u00bc\3\u00bc\3\u00bc"+
		"\5\u00bc\u0848\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u084c\n\u00bc\3\u00bc\3"+
		"\u00bc\3\u00bc\3\u00bc\5\u00bc\u0852\n\u00bc\3\u00bc\7\u00bc\u0855\n\u00bc"+
		"\f\u00bc\16\u00bc\u0858\13\u00bc\3\u00bc\3\u00bc\5\u00bc\u085c\n\u00bc"+
		"\3\u00bc\3\u00bc\5\u00bc\u0860\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u0864\n"+
		"\u00bc\5\u00bc\u0866\n\u00bc\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u086b\n\u00bd"+
		"\3\u00bd\7\u00bd\u086e\n\u00bd\f\u00bd\16\u00bd\u0871\13\u00bd\3\u00bd"+
		"\3\u00bd\5\u00bd\u0875\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0879\n\u00bd\3"+
		"\u00bd\3\u00bd\5\u00bd\u087d\n\u00bd\3\u00be\3\u00be\5\u00be\u0881\n\u00be"+
		"\3\u00be\7\u00be\u0884\n\u00be\f\u00be\16\u00be\u0887\13\u00be\3\u00be"+
		"\3\u00be\3\u00be\7\u00be\u088c\n\u00be\f\u00be\16\u00be\u088f\13\u00be"+
		"\3\u00be\7\u00be\u0892\n\u00be\f\u00be\16\u00be\u0895\13\u00be\3\u00be"+
		"\5\u00be\u0898\n\u00be\3\u00be\3\u00be\5\u00be\u089c\n\u00be\3\u00be\3"+
		"\u00be\5\u00be\u08a0\n\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u08a6"+
		"\n\u00be\3\u00be\7\u00be\u08a9\n\u00be\f\u00be\16\u00be\u08ac\13\u00be"+
		"\3\u00be\3\u00be\5\u00be\u08b0\n\u00be\3\u00be\3\u00be\5\u00be\u08b4\n"+
		"\u00be\3\u00be\3\u00be\5\u00be\u08b8\n\u00be\5\u00be\u08ba\n\u00be\3\u00bf"+
		"\3\u00bf\3\u00bf\5\u00bf\u08bf\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\5\u00c0\u08ce\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u08dc\n\u00c2"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\5\u00c3\u08e8\n\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\7\u00c3\u08ef\n\u00c3\f\u00c3\16\u00c3\u08f2\13\u00c3\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\7\u00c4"+
		"\u08fe\n\u00c4\f\u00c4\16\u00c4\u0901\13\u00c4\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u090d"+
		"\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\7\u00c5\u0914\n\u00c5"+
		"\f\u00c5\16\u00c5\u0917\13\u00c5\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u091c"+
		"\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0923\n\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0928\n\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\5\u00c6\u092f\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6"+
		"\u0934\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u093b\n"+
		"\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0940\n\u00c6\3\u00c6\3\u00c6\3"+
		"\u00c6\3\u00c6\3\u00c6\5\u00c6\u0947\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5"+
		"\u00c6\u094c\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5"+
		"\u00c6\u0954\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0959\n\u00c6\3\u00c6"+
		"\3\u00c6\5\u00c6\u095d\n\u00c6\3\u00c7\3\u00c7\5\u00c7\u0961\n\u00c7\3"+
		"\u00c7\3\u00c7\3\u00c7\5\u00c7\u0966\n\u00c7\3\u00c7\3\u00c7\3\u00c8\3"+
		"\u00c8\3\u00c8\5\u00c8\u096d\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3"+
		"\u00c8\5\u00c8\u0974\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0979\n\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0980\n\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\5\u00c8\u0985\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\5\u00c8\u098c\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0991\n"+
		"\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0999\n"+
		"\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u099e\n\u00c8\3\u00c8\3\u00c8\5"+
		"\u00c8\u09a2\n\u00c8\3\u00c9\3\u00c9\3\u00c9\7\u00c9\u09a7\n\u00c9\f\u00c9"+
		"\16\u00c9\u09aa\13\u00c9\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09af\n\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09b6\n\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09bd\n\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09c4\n\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09cc\n\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\5\u00ca\u09d3\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\5\u00ca\u09db\n\u00ca\3\u00cb\3\u00cb\5\u00cb\u09df\n"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09e6\n\u00cc\3"+
		"\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09ed\n\u00cc\3\u00cc\3"+
		"\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09f4\n\u00cc\3\u00cc\3\u00cc\3"+
		"\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09fc\n\u00cc\3\u00cc\3\u00cc\3"+
		"\u00cc\3\u00cc\3\u00cc\5\u00cc\u0a03\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3"+
		"\u00cc\3\u00cc\3\u00cc\5\u00cc\u0a0b\n\u00cc\3\u00cd\3\u00cd\3\u00cd\3"+
		"\u00cd\5\u00cd\u0a11\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0a17"+
		"\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\5\u00cd\u0a23\n\u00cd\3\u00ce\3\u00ce\7\u00ce\u0a27\n"+
		"\u00ce\f\u00ce\16\u00ce\u0a2a\13\u00ce\3\u00cf\7\u00cf\u0a2d\n\u00cf\f"+
		"\u00cf\16\u00cf\u0a30\13\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00d0"+
		"\3\u00d0\3\u00d1\3\u00d1\5\u00d1\u0a3a\n\u00d1\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a43\n\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a4a\n\u00d3\3\u00d4\3\u00d4\3\u00d4"+
		"\7\u00d4\u0a4f\n\u00d4\f\u00d4\16\u00d4\u0a52\13\u00d4\3\u00d5\3\u00d5"+
		"\5\u00d5\u0a56\n\u00d5\3\u00d6\3\u00d6\5\u00d6\u0a5a\n\u00d6\3\u00d7\3"+
		"\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0a63\n\u00d8\3"+
		"\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\5\u00da\u0a6e\n\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\7\u00db\u0a76\n\u00db\f\u00db\16\u00db\u0a79\13\u00db\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\3\u00dc\7\u00dc\u0a81\n\u00dc\f\u00dc\16\u00dc"+
		"\u0a84\13\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd"+
		"\u0a8c\n\u00dd\f\u00dd\16\u00dd\u0a8f\13\u00dd\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\7\u00de\u0a97\n\u00de\f\u00de\16\u00de\u0a9a"+
		"\13\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\7\u00df\u0aa2"+
		"\n\u00df\f\u00df\16\u00df\u0aa5\13\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\7\u00e0\u0ab0\n\u00e0\f\u00e0"+
		"\16\u00e0\u0ab3\13\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\7\u00e1\u0ac7\n\u00e1\f\u00e1\16\u00e1\u0aca"+
		"\13\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\7\u00e2"+
		"\u0adc\n\u00e2\f\u00e2\16\u00e2\u0adf\13\u00e2\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\7\u00e3\u0aea\n\u00e3"+
		"\f\u00e3\16\u00e3\u0aed\13\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\7\u00e4\u0afb"+
		"\n\u00e4\f\u00e4\16\u00e4\u0afe\13\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0b07\n\u00e5\3\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\5\u00e8\u0b15\n\u00e8\3\u00e9\3\u00e9\5\u00e9\u0b19\n\u00e9\3\u00e9\3"+
		"\u00e9\7\u00e9\u0b1d\n\u00e9\f\u00e9\16\u00e9\u0b20\13\u00e9\3\u00ea\3"+
		"\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ed\3\u00ed"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\7\u00ee"+
		"\u0b34\n\u00ee\f\u00ee\16\u00ee\u0b37\13\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\7\u00ee\u0b3f\n\u00ee\f\u00ee\16\u00ee\u0b42"+
		"\13\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0b47\n\u00ee\3\u00ef\3\u00ef"+
		"\7\u00ef\u0b4b\n\u00ef\f\u00ef\16\u00ef\u0b4e\13\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\5\u00ef\u0b53\n\u00ef\3\u00f0\3\u00f0\3\u00f0\7\u00f0\u0b58\n"+
		"\u00f0\f\u00f0\16\u00f0\u0b5b\13\u00f0\3\u00f0\3\u00f0\3\u00f1\3\u00f1"+
		"\3\u00f1\7\u00f1\u0b62\n\u00f1\f\u00f1\16\u00f1\u0b65\13\u00f1\3\u00f1"+
		"\3\u00f1\3\u00f2\3\u00f2\5\u00f2\u0b6b\n\u00f2\3\u00f3\3\u00f3\3\u00f3"+
		"\3\u00f3\3\u00f4\3\u00f4\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f6\3\u00f6"+
		"\3\u00f6\5\u00f6\u0b7a\n\u00f6\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f8"+
		"\3\u00f8\5\u00f8\u0b82\n\u00f8\3\u00f9\3\u00f9\3\u00fa\3\u00fa\3\u00fa"+
		"\3\u00fa\3\u00fb\5\u00fb\u0b8b\n\u00fb\3\u00fb\5\u00fb\u0b8e\n\u00fb\3"+
		"\u00fc\3\u00fc\3\u00fc\2\17\66:@\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0"+
		"\u01c2\u01c4\u01c6\u00fd\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"+
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4"+
		"\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc"+
		"\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4"+
		"\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec"+
		"\u01ee\u01f0\u01f2\u01f4\u01f6\2\6\3\28=\7\2\n\n\r\r  \"\"**\4\2\23\23"+
		"\31\31\4\2GG`j\u0c80\2\u01f8\3\2\2\2\4\u01fc\3\2\2\2\6\u020c\3\2\2\2\b"+
		"\u0210\3\2\2\2\n\u0212\3\2\2\2\f\u0214\3\2\2\2\16\u0219\3\2\2\2\20\u021d"+
		"\3\2\2\2\22\u023c\3\2\2\2\24\u023e\3\2\2\2\26\u024c\3\2\2\2\30\u0253\3"+
		"\2\2\2\32\u0255\3\2\2\2\34\u0257\3\2\2\2\36\u025c\3\2\2\2 \u026a\3\2\2"+
		"\2\"\u026f\3\2\2\2$\u0284\3\2\2\2&\u028b\3\2\2\2(\u0297\3\2\2\2*\u0299"+
		"\3\2\2\2,\u029c\3\2\2\2.\u02a0\3\2\2\2\60\u02aa\3\2\2\2\62\u02af\3\2\2"+
		"\2\64\u02ba\3\2\2\2\66\u02bc\3\2\2\28\u02cc\3\2\2\2:\u02ce\3\2\2\2<\u02de"+
		"\3\2\2\2>\u02e0\3\2\2\2@\u02e2\3\2\2\2B\u02ee\3\2\2\2D\u0301\3\2\2\2F"+
		"\u030f\3\2\2\2H\u0315\3\2\2\2J\u0317\3\2\2\2L\u031b\3\2\2\2N\u0321\3\2"+
		"\2\2P\u0328\3\2\2\2R\u0332\3\2\2\2T\u0336\3\2\2\2V\u033b\3\2\2\2X\u0353"+
		"\3\2\2\2Z\u0355\3\2\2\2\\\u0359\3\2\2\2^\u0361\3\2\2\2`\u0364\3\2\2\2"+
		"b\u0367\3\2\2\2d\u036f\3\2\2\2f\u037c\3\2\2\2h\u0383\3\2\2\2j\u0388\3"+
		"\2\2\2l\u0397\3\2\2\2n\u0399\3\2\2\2p\u03a1\3\2\2\2r\u03a6\3\2\2\2t\u03ac"+
		"\3\2\2\2v\u03b0\3\2\2\2x\u03b4\3\2\2\2z\u03b9\3\2\2\2|\u03bd\3\2\2\2~"+
		"\u03d6\3\2\2\2\u0080\u03d8\3\2\2\2\u0082\u03e3\3\2\2\2\u0084\u03e7\3\2"+
		"\2\2\u0086\u03e9\3\2\2\2\u0088\u03eb\3\2\2\2\u008a\u03ed\3\2\2\2\u008c"+
		"\u03f8\3\2\2\2\u008e\u03fd\3\2\2\2\u0090\u040d\3\2\2\2\u0092\u0420\3\2"+
		"\2\2\u0094\u0424\3\2\2\2\u0096\u0426\3\2\2\2\u0098\u0434\3\2\2\2\u009a"+
		"\u0446\3\2\2\2\u009c\u044b\3\2\2\2\u009e\u0453\3\2\2\2\u00a0\u0466\3\2"+
		"\2\2\u00a2\u046b\3\2\2\2\u00a4\u0475\3\2\2\2\u00a6\u0478\3\2\2\2\u00a8"+
		"\u0482\3\2\2\2\u00aa\u0486\3\2\2\2\u00ac\u0488\3\2\2\2\u00ae\u048a\3\2"+
		"\2\2\u00b0\u0490\3\2\2\2\u00b2\u049d\3\2\2\2\u00b4\u04a0\3\2\2\2\u00b6"+
		"\u04a9\3\2\2\2\u00b8\u04ab\3\2\2\2\u00ba\u04e2\3\2\2\2\u00bc\u04e7\3\2"+
		"\2\2\u00be\u04f1\3\2\2\2\u00c0\u04fd\3\2\2\2\u00c2\u0508\3\2\2\2\u00c4"+
		"\u0516\3\2\2\2\u00c6\u0518\3\2\2\2\u00c8\u0521\3\2\2\2\u00ca\u0526\3\2"+
		"\2\2\u00cc\u053a\3\2\2\2\u00ce\u053c\3\2\2\2\u00d0\u053f\3\2\2\2\u00d2"+
		"\u054d\3\2\2\2\u00d4\u0552\3\2\2\2\u00d6\u055d\3\2\2\2\u00d8\u0562\3\2"+
		"\2\2\u00da\u056e\3\2\2\2\u00dc\u0573\3\2\2\2\u00de\u057b\3\2\2\2\u00e0"+
		"\u0589\3\2\2\2\u00e2\u058e\3\2\2\2\u00e4\u05a0\3\2\2\2\u00e6\u05a2\3\2"+
		"\2\2\u00e8\u05a8\3\2\2\2\u00ea\u05aa\3\2\2\2\u00ec\u05b2\3\2\2\2\u00ee"+
		"\u05ba\3\2\2\2\u00f0\u05c1\3\2\2\2\u00f2\u05c3\3\2\2\2\u00f4\u05cc\3\2"+
		"\2\2\u00f6\u05d4\3\2\2\2\u00f8\u05d7\3\2\2\2\u00fa\u05dd\3\2\2\2\u00fc"+
		"\u05e6\3\2\2\2\u00fe\u05ee\3\2\2\2\u0100\u05f4\3\2\2\2\u0102\u05ff\3\2"+
		"\2\2\u0104\u0601\3\2\2\2\u0106\u0607\3\2\2\2\u0108\u0613\3\2\2\2\u010a"+
		"\u061a\3\2\2\2\u010c\u0628\3\2\2\2\u010e\u062a\3\2\2\2\u0110\u062c\3\2"+
		"\2\2\u0112\u0630\3\2\2\2\u0114\u0634\3\2\2\2\u0116\u063e\3\2\2\2\u0118"+
		"\u0640\3\2\2\2\u011a\u0646\3\2\2\2\u011c\u064e\3\2\2\2\u011e\u0660\3\2"+
		"\2\2\u0120\u0662\3\2\2\2\u0122\u0668\3\2\2\2\u0124\u0677\3\2\2\2\u0126"+
		"\u067a\3\2\2\2\u0128\u068b\3\2\2\2\u012a\u068d\3\2\2\2\u012c\u068f\3\2"+
		"\2\2\u012e\u0695\3\2\2\2\u0130\u069b\3\2\2\2\u0132\u06a5\3\2\2\2\u0134"+
		"\u06a9\3\2\2\2\u0136\u06ab\3\2\2\2\u0138\u06bb\3\2\2\2\u013a\u06cd\3\2"+
		"\2\2\u013c\u06cf\3\2\2\2\u013e\u06d1\3\2\2\2\u0140\u06d9\3\2\2\2\u0142"+
		"\u06e8\3\2\2\2\u0144\u06f7\3\2\2\2\u0146\u06fd\3\2\2\2\u0148\u0703\3\2"+
		"\2\2\u014a\u0709\3\2\2\2\u014c\u070d\3\2\2\2\u014e\u071f\3\2\2\2\u0150"+
		"\u0721\3\2\2\2\u0152\u0728\3\2\2\2\u0154\u0731\3\2\2\2\u0156\u0737\3\2"+
		"\2\2\u0158\u073f\3\2\2\2\u015a\u0742\3\2\2\2\u015c\u074b\3\2\2\2\u015e"+
		"\u0752\3\2\2\2\u0160\u075d\3\2\2\2\u0162\u0767\3\2\2\2\u0164\u078c\3\2"+
		"\2\2\u0166\u078e\3\2\2\2\u0168\u07ac\3\2\2\2\u016a\u07b3\3\2\2\2\u016c"+
		"\u07b5\3\2\2\2\u016e\u07bb\3\2\2\2\u0170\u07e5\3\2\2\2\u0172\u07e7\3\2"+
		"\2\2\u0174\u0810\3\2\2\2\u0176\u0865\3\2\2\2\u0178\u0867\3\2\2\2\u017a"+
		"\u08b9\3\2\2\2\u017c\u08be\3\2\2\2\u017e\u08cd\3\2\2\2\u0180\u08cf\3\2"+
		"\2\2\u0182\u08db\3\2\2\2\u0184\u08e7\3\2\2\2\u0186\u08f3\3\2\2\2\u0188"+
		"\u090c\3\2\2\2\u018a\u095c\3\2\2\2\u018c\u095e\3\2\2\2\u018e\u09a1\3\2"+
		"\2\2\u0190\u09a3\3\2\2\2\u0192\u09da\3\2\2\2\u0194\u09dc\3\2\2\2\u0196"+
		"\u0a0a\3\2\2\2\u0198\u0a22\3\2\2\2\u019a\u0a24\3\2\2\2\u019c\u0a2e\3\2"+
		"\2\2\u019e\u0a35\3\2\2\2\u01a0\u0a39\3\2\2\2\u01a2\u0a3b\3\2\2\2\u01a4"+
		"\u0a49\3\2\2\2\u01a6\u0a4b\3\2\2\2\u01a8\u0a55\3\2\2\2\u01aa\u0a59\3\2"+
		"\2\2\u01ac\u0a5b\3\2\2\2\u01ae\u0a62\3\2\2\2\u01b0\u0a64\3\2\2\2\u01b2"+
		"\u0a6d\3\2\2\2\u01b4\u0a6f\3\2\2\2\u01b6\u0a7a\3\2\2\2\u01b8\u0a85\3\2"+
		"\2\2\u01ba\u0a90\3\2\2\2\u01bc\u0a9b\3\2\2\2\u01be\u0aa6\3\2\2\2\u01c0"+
		"\u0ab4\3\2\2\2\u01c2\u0acb\3\2\2\2\u01c4\u0ae0\3\2\2\2\u01c6\u0aee\3\2"+
		"\2\2\u01c8\u0b06\3\2\2\2\u01ca\u0b08\3\2\2\2\u01cc\u0b0b\3\2\2\2\u01ce"+
		"\u0b14\3\2\2\2\u01d0\u0b18\3\2\2\2\u01d2\u0b21\3\2\2\2\u01d4\u0b24\3\2"+
		"\2\2\u01d6\u0b26\3\2\2\2\u01d8\u0b29\3\2\2\2\u01da\u0b46\3\2\2\2\u01dc"+
		"\u0b52\3\2\2\2\u01de\u0b54\3\2\2\2\u01e0\u0b5e\3\2\2\2\u01e2\u0b6a\3\2"+
		"\2\2\u01e4\u0b6c\3\2\2\2\u01e6\u0b70\3\2\2\2\u01e8\u0b72\3\2\2\2\u01ea"+
		"\u0b79\3\2\2\2\u01ec\u0b7b\3\2\2\2\u01ee\u0b81\3\2\2\2\u01f0\u0b83\3\2"+
		"\2\2\u01f2\u0b85\3\2\2\2\u01f4\u0b8d\3\2\2\2\u01f6\u0b8f\3\2\2\2\u01f8"+
		"\u01f9\t\2\2\2\u01f9\3\3\2\2\2\u01fa\u01fd\5\6\4\2\u01fb\u01fd\5\16\b"+
		"\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd\5\3\2\2\2\u01fe\u0200"+
		"\5\u00e8u\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2"+
		"\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u020d"+
		"\5\b\5\2\u0205\u0207\5\u00e8u\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2"+
		"\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u0208"+
		"\3\2\2\2\u020b\u020d\7\b\2\2\u020c\u0201\3\2\2\2\u020c\u0208\3\2\2\2\u020d"+
		"\7\3\2\2\2\u020e\u0211\5\n\6\2\u020f\u0211\5\f\7\2\u0210\u020e\3\2\2\2"+
		"\u0210\u020f\3\2\2\2\u0211\t\3\2\2\2\u0212\u0213\t\3\2\2\u0213\13\3\2"+
		"\2\2\u0214\u0215\t\4\2\2\u0215\r\3\2\2\2\u0216\u021a\5\20\t\2\u0217\u021a"+
		"\5\36\20\2\u0218\u021a\5 \21\2\u0219\u0216\3\2\2\2\u0219\u0217\3\2\2\2"+
		"\u0219\u0218\3\2\2\2\u021a\17\3\2\2\2\u021b\u021e\5\26\f\2\u021c\u021e"+
		"\5\34\17\2\u021d\u021b\3\2\2\2\u021d\u021c\3\2\2\2\u021e\u0223\3\2\2\2"+
		"\u021f\u0222\5\24\13\2\u0220\u0222\5\32\16\2\u0221\u021f\3\2\2\2\u0221"+
		"\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224\21\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0228\5\u00e8u\2\u0227"+
		"\u0226\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2"+
		"\2\2\u022a\u022c\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022e\7k\2\2\u022d"+
		"\u022f\5,\27\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u023d\3\2"+
		"\2\2\u0230\u0231\5\20\t\2\u0231\u0235\7F\2\2\u0232\u0234\5\u00e8u\2\u0233"+
		"\u0232\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2"+
		"\2\2\u0236\u0238\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u023a\7k\2\2\u0239"+
		"\u023b\5,\27\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d\3\2"+
		"\2\2\u023c\u0229\3\2\2\2\u023c\u0230\3\2\2\2\u023d\23\3\2\2\2\u023e\u0242"+
		"\7F\2\2\u023f\u0241\5\u00e8u\2\u0240\u023f\3\2\2\2\u0241\u0244\3\2\2\2"+
		"\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0242"+
		"\3\2\2\2\u0245\u0247\7k\2\2\u0246\u0248\5,\27\2\u0247\u0246\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\25\3\2\2\2\u0249\u024b\5\u00e8u\2\u024a\u0249\3\2"+
		"\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u024f\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0251\7k\2\2\u0250\u0252\5,\27"+
		"\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\27\3\2\2\2\u0253\u0254"+
		"\5\22\n\2\u0254\31\3\2\2\2\u0255\u0256\5\24\13\2\u0256\33\3\2\2\2\u0257"+
		"\u0258\5\26\f\2\u0258\35\3\2\2\2\u0259\u025b\5\u00e8u\2\u025a\u0259\3"+
		"\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u025f\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0260\7k\2\2\u0260\37\3\2\2\2"+
		"\u0261\u0262\5\6\4\2\u0262\u0263\5\"\22\2\u0263\u026b\3\2\2\2\u0264\u0265"+
		"\5\20\t\2\u0265\u0266\5\"\22\2\u0266\u026b\3\2\2\2\u0267\u0268\5\36\20"+
		"\2\u0268\u0269\5\"\22\2\u0269\u026b\3\2\2\2\u026a\u0261\3\2\2\2\u026a"+
		"\u0264\3\2\2\2\u026a\u0267\3\2\2\2\u026b!\3\2\2\2\u026c\u026e\5\u00e8"+
		"u\2\u026d\u026c\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u0272\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0273\7B"+
		"\2\2\u0273\u027e\7C\2\2\u0274\u0276\5\u00e8u\2\u0275\u0274\3\2\2\2\u0276"+
		"\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2"+
		"\2\2\u0279\u0277\3\2\2\2\u027a\u027b\7B\2\2\u027b\u027d\7C\2\2\u027c\u0277"+
		"\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"#\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0283\5&\24\2\u0282\u0281\3\2\2\2"+
		"\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287"+
		"\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u0289\7k\2\2\u0288\u028a\5(\25\2\u0289"+
		"\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a%\3\2\2\2\u028b\u028c\5\u00e8"+
		"u\2\u028c\'\3\2\2\2\u028d\u028e\7\26\2\2\u028e\u0298\5\36\20\2\u028f\u0290"+
		"\7\26\2\2\u0290\u0294\5\20\t\2\u0291\u0293\5*\26\2\u0292\u0291\3\2\2\2"+
		"\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0298"+
		"\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u028d\3\2\2\2\u0297\u028f\3\2\2\2\u0298"+
		")\3\2\2\2\u0299\u029a\7Z\2\2\u029a\u029b\5\30\r\2\u029b+\3\2\2\2\u029c"+
		"\u029d\7I\2\2\u029d\u029e\5.\30\2\u029e\u029f\7H\2\2\u029f-\3\2\2\2\u02a0"+
		"\u02a5\5\60\31\2\u02a1\u02a2\7E\2\2\u02a2\u02a4\5\60\31\2\u02a3\u02a1"+
		"\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"/\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02ab\5\16\b\2\u02a9\u02ab\5\62\32"+
		"\2\u02aa\u02a8\3\2\2\2\u02aa\u02a9\3\2\2\2\u02ab\61\3\2\2\2\u02ac\u02ae"+
		"\5\u00e8u\2\u02ad\u02ac\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2"+
		"\2\u02af\u02b0\3\2\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b4"+
		"\7L\2\2\u02b3\u02b5\5\64\33\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2"+
		"\u02b5\63\3\2\2\2\u02b6\u02b7\7\26\2\2\u02b7\u02bb\5\16\b\2\u02b8\u02b9"+
		"\7-\2\2\u02b9\u02bb\5\16\b\2\u02ba\u02b6\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb"+
		"\65\3\2\2\2\u02bc\u02bd\b\34\1\2\u02bd\u02be\7k\2\2\u02be\u02c4\3\2\2"+
		"\2\u02bf\u02c0\f\3\2\2\u02c0\u02c1\7F\2\2\u02c1\u02c3\7k\2\2\u02c2\u02bf"+
		"\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5"+
		"\67\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02cd\7k\2\2\u02c8\u02c9\5:\36\2"+
		"\u02c9\u02ca\7F\2\2\u02ca\u02cb\7k\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02c7"+
		"\3\2\2\2\u02cc\u02c8\3\2\2\2\u02cd9\3\2\2\2\u02ce\u02cf\b\36\1\2\u02cf"+
		"\u02d0\7k\2\2\u02d0\u02d6\3\2\2\2\u02d1\u02d2\f\3\2\2\u02d2\u02d3\7F\2"+
		"\2\u02d3\u02d5\7k\2\2\u02d4\u02d1\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d4"+
		"\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7;\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9"+
		"\u02df\7k\2\2\u02da\u02db\5@!\2\u02db\u02dc\7F\2\2\u02dc\u02dd\7k\2\2"+
		"\u02dd\u02df\3\2\2\2\u02de\u02d9\3\2\2\2\u02de\u02da\3\2\2\2\u02df=\3"+
		"\2\2\2\u02e0\u02e1\7k\2\2\u02e1?\3\2\2\2\u02e2\u02e3\b!\1\2\u02e3\u02e4"+
		"\7k\2\2\u02e4\u02ea\3\2\2\2\u02e5\u02e6\f\3\2\2\u02e6\u02e7\7F\2\2\u02e7"+
		"\u02e9\7k\2\2\u02e8\u02e5\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02e8\3\2"+
		"\2\2\u02ea\u02eb\3\2\2\2\u02ebA\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02ef"+
		"\5D#\2\u02ee\u02ed\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f3\3\2\2\2\u02f0"+
		"\u02f2\5H%\2\u02f1\u02f0\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2"+
		"\2\u02f3\u02f4\3\2\2\2\u02f4\u02f9\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02f8"+
		"\5R*\2\u02f7\u02f6\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9"+
		"\u02fa\3\2\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc\u02fd\7\2"+
		"\2\3\u02fdC\3\2\2\2\u02fe\u0300\5F$\2\u02ff\u02fe\3\2\2\2\u0300\u0303"+
		"\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0304\3\2\2\2\u0303"+
		"\u0301\3\2\2\2\u0304\u0305\7%\2\2\u0305\u030a\7k\2\2\u0306\u0307\7F\2"+
		"\2\u0307\u0309\7k\2\2\u0308\u0306\3\2\2\2\u0309\u030c\3\2\2\2\u030a\u0308"+
		"\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030d\3\2\2\2\u030c\u030a\3\2\2\2\u030d"+
		"\u030e\7D\2\2\u030eE\3\2\2\2\u030f\u0310\5\u00e8u\2\u0310G\3\2\2\2\u0311"+
		"\u0316\5J&\2\u0312\u0316\5L\'\2\u0313\u0316\5N(\2\u0314\u0316\5P)\2\u0315"+
		"\u0311\3\2\2\2\u0315\u0312\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0314\3\2"+
		"\2\2\u0316I\3\2\2\2\u0317\u0318\7\36\2\2\u0318\u0319\58\35\2\u0319\u031a"+
		"\7D\2\2\u031aK\3\2\2\2\u031b\u031c\7\36\2\2\u031c\u031d\5:\36\2\u031d"+
		"\u031e\7F\2\2\u031e\u031f\7X\2\2\u031f\u0320\7D\2\2\u0320M\3\2\2\2\u0321"+
		"\u0322\7\36\2\2\u0322\u0323\7+\2\2\u0323\u0324\58\35\2\u0324\u0325\7F"+
		"\2\2\u0325\u0326\7k\2\2\u0326\u0327\7D\2\2\u0327O\3\2\2\2\u0328\u0329"+
		"\7\36\2\2\u0329\u032a\7+\2\2\u032a\u032b\58\35\2\u032b\u032c\7F\2\2\u032c"+
		"\u032d\7X\2\2\u032d\u032e\7D\2\2\u032eQ\3\2\2\2\u032f\u0333\5T+\2\u0330"+
		"\u0333\5\u00c8e\2\u0331\u0333\7D\2\2\u0332\u032f\3\2\2\2\u0332\u0330\3"+
		"\2\2\2\u0332\u0331\3\2\2\2\u0333S\3\2\2\2\u0334\u0337\5V,\2\u0335\u0337"+
		"\5\u00bc_\2\u0336\u0334\3\2\2\2\u0336\u0335\3\2\2\2\u0337U\3\2\2\2\u0338"+
		"\u033a\5X-\2\u0339\u0338\3\2\2\2\u033a\u033d\3\2\2\2\u033b\u0339\3\2\2"+
		"\2\u033b\u033c\3\2\2\2\u033c\u033e\3\2\2\2\u033d\u033b\3\2\2\2\u033e\u033f"+
		"\7\16\2\2\u033f\u0341\7k\2\2\u0340\u0342\5Z.\2\u0341\u0340\3\2\2\2\u0341"+
		"\u0342\3\2\2\2\u0342\u0344\3\2\2\2\u0343\u0345\5^\60\2\u0344\u0343\3\2"+
		"\2\2\u0344\u0345\3\2\2\2\u0345\u0347\3\2\2\2\u0346\u0348\5`\61\2\u0347"+
		"\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\5d"+
		"\63\2\u034aW\3\2\2\2\u034b\u0354\5\u00e8u\2\u034c\u0354\7(\2\2\u034d\u0354"+
		"\7\'\2\2\u034e\u0354\7&\2\2\u034f\u0354\7\6\2\2\u0350\u0354\7+\2\2\u0351"+
		"\u0354\7\27\2\2\u0352\u0354\7,\2\2\u0353\u034b\3\2\2\2\u0353\u034c\3\2"+
		"\2\2\u0353\u034d\3\2\2\2\u0353\u034e\3\2\2\2\u0353\u034f\3\2\2\2\u0353"+
		"\u0350\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0352\3\2\2\2\u0354Y\3\2\2\2"+
		"\u0355\u0356\7I\2\2\u0356\u0357\5\\/\2\u0357\u0358\7H\2\2\u0358[\3\2\2"+
		"\2\u0359\u035e\5$\23\2\u035a\u035b\7E\2\2\u035b\u035d\5$\23\2\u035c\u035a"+
		"\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u035c\3\2\2\2\u035e\u035f\3\2\2\2\u035f"+
		"]\3\2\2\2\u0360\u035e\3\2\2\2\u0361\u0362\7\26\2\2\u0362\u0363\5\22\n"+
		"\2\u0363_\3\2\2\2\u0364\u0365\7\35\2\2\u0365\u0366\5b\62\2\u0366a\3\2"+
		"\2\2\u0367\u036c\5\30\r\2\u0368\u0369\7E\2\2\u0369\u036b\5\30\r\2\u036a"+
		"\u0368\3\2\2\2\u036b\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2"+
		"\2\2\u036dc\3\2\2\2\u036e\u036c\3\2\2\2\u036f\u0373\7@\2\2\u0370\u0372"+
		"\5f\64\2\u0371\u0370\3\2\2\2\u0372\u0375\3\2\2\2\u0373\u0371\3\2\2\2\u0373"+
		"\u0374\3\2\2\2\u0374\u0376\3\2\2\2\u0375\u0373\3\2\2\2\u0376\u0377\7A"+
		"\2\2\u0377e\3\2\2\2\u0378\u037d\5h\65\2\u0379\u037d\5\u00acW\2\u037a\u037d"+
		"\5\u00aeX\2\u037b\u037d\5\u00b0Y\2\u037c\u0378\3\2\2\2\u037c\u0379\3\2"+
		"\2\2\u037c\u037a\3\2\2\2\u037c\u037b\3\2\2\2\u037dg\3\2\2\2\u037e\u0384"+
		"\5j\66\2\u037f\u0384\5\u008eH\2\u0380\u0384\5T+\2\u0381\u0384\5\u00c8"+
		"e\2\u0382\u0384\7D\2\2\u0383\u037e\3\2\2\2\u0383\u037f\3\2\2\2\u0383\u0380"+
		"\3\2\2\2\u0383\u0381\3\2\2\2\u0383\u0382\3\2\2\2\u0384i\3\2\2\2\u0385"+
		"\u0387\5l\67\2\u0386\u0385\3\2\2\2\u0387\u038a\3\2\2\2\u0388\u0386\3\2"+
		"\2\2\u0388\u0389\3\2\2\2\u0389\u038b\3\2\2\2\u038a\u0388\3\2\2\2\u038b"+
		"\u038c\5v<\2\u038c\u038d\5n8\2\u038d\u038e\7D\2\2\u038ek\3\2\2\2\u038f"+
		"\u0398\5\u00e8u\2\u0390\u0398\7(\2\2\u0391\u0398\7\'\2\2\u0392\u0398\7"+
		"&\2\2\u0393\u0398\7+\2\2\u0394\u0398\7\27\2\2\u0395\u0398\7\63\2\2\u0396"+
		"\u0398\7\66\2\2\u0397\u038f\3\2\2\2\u0397\u0390\3\2\2\2\u0397\u0391\3"+
		"\2\2\2\u0397\u0392\3\2\2\2\u0397\u0393\3\2\2\2\u0397\u0394\3\2\2\2\u0397"+
		"\u0395\3\2\2\2\u0397\u0396\3\2\2\2\u0398m\3\2\2\2\u0399\u039e\5p9\2\u039a"+
		"\u039b\7E\2\2\u039b\u039d\5p9\2\u039c\u039a\3\2\2\2\u039d\u03a0\3\2\2"+
		"\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039fo\3\2\2\2\u03a0\u039e"+
		"\3\2\2\2\u03a1\u03a4\5r:\2\u03a2\u03a3\7G\2\2\u03a3\u03a5\5t;\2\u03a4"+
		"\u03a2\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5q\3\2\2\2\u03a6\u03a8\7k\2\2\u03a7"+
		"\u03a9\5\"\22\2\u03a8\u03a7\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9s\3\2\2\2"+
		"\u03aa\u03ad\5\u01a0\u00d1\2\u03ab\u03ad\5\u00fa~\2\u03ac\u03aa\3\2\2"+
		"\2\u03ac\u03ab\3\2\2\2\u03adu\3\2\2\2\u03ae\u03b1\5x=\2\u03af\u03b1\5"+
		"z>\2\u03b0\u03ae\3\2\2\2\u03b0\u03af\3\2\2\2\u03b1w\3\2\2\2\u03b2\u03b5"+
		"\5\b\5\2\u03b3\u03b5\7\b\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b3\3\2\2\2\u03b5"+
		"y\3\2\2\2\u03b6\u03ba\5|?\2\u03b7\u03ba\5\u008aF\2\u03b8\u03ba\5\u008c"+
		"G\2\u03b9\u03b6\3\2\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03b8\3\2\2\2\u03ba"+
		"{\3\2\2\2\u03bb\u03be\5\u0082B\2\u03bc\u03be\5\u0088E\2\u03bd\u03bb\3"+
		"\2\2\2\u03bd\u03bc\3\2\2\2\u03be\u03c3\3\2\2\2\u03bf\u03c2\5\u0080A\2"+
		"\u03c0\u03c2\5\u0086D\2\u03c1\u03bf\3\2\2\2\u03c1\u03c0\3\2\2\2\u03c2"+
		"\u03c5\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4}\3\2\2\2"+
		"\u03c5\u03c3\3\2\2\2\u03c6\u03c8\7k\2\2\u03c7\u03c9\5,\27\2\u03c8\u03c7"+
		"\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03d7\3\2\2\2\u03ca\u03cb\5|?\2\u03cb"+
		"\u03cf\7F\2\2\u03cc\u03ce\5\u00e8u\2\u03cd\u03cc\3\2\2\2\u03ce\u03d1\3"+
		"\2\2\2\u03cf\u03cd\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d2\3\2\2\2\u03d1"+
		"\u03cf\3\2\2\2\u03d2\u03d4\7k\2\2\u03d3\u03d5\5,\27\2\u03d4\u03d3\3\2"+
		"\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d7\3\2\2\2\u03d6\u03c6\3\2\2\2\u03d6"+
		"\u03ca\3\2\2\2\u03d7\177\3\2\2\2\u03d8\u03dc\7F\2\2\u03d9\u03db\5\u00e8"+
		"u\2\u03da\u03d9\3\2\2\2\u03db\u03de\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc"+
		"\u03dd\3\2\2\2\u03dd\u03df\3\2\2\2\u03de\u03dc\3\2\2\2\u03df\u03e1\7k"+
		"\2\2\u03e0\u03e2\5,\27\2\u03e1\u03e0\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2"+
		"\u0081\3\2\2\2\u03e3\u03e5\7k\2\2\u03e4\u03e6\5,\27\2\u03e5\u03e4\3\2"+
		"\2\2\u03e5\u03e6\3\2\2\2\u03e6\u0083\3\2\2\2\u03e7\u03e8\5~@\2\u03e8\u0085"+
		"\3\2\2\2\u03e9\u03ea\5\u0080A\2\u03ea\u0087\3\2\2\2\u03eb\u03ec\5\u0082"+
		"B\2\u03ec\u0089\3\2\2\2\u03ed\u03ee\7k\2\2\u03ee\u008b\3\2\2\2\u03ef\u03f0"+
		"\5x=\2\u03f0\u03f1\5\"\22\2\u03f1\u03f9\3\2\2\2\u03f2\u03f3\5|?\2\u03f3"+
		"\u03f4\5\"\22\2\u03f4\u03f9\3\2\2\2\u03f5\u03f6\5\u008aF\2\u03f6\u03f7"+
		"\5\"\22\2\u03f7\u03f9\3\2\2\2\u03f8\u03ef\3\2\2\2\u03f8\u03f2\3\2\2\2"+
		"\u03f8\u03f5\3\2\2\2\u03f9\u008d\3\2\2\2\u03fa\u03fc\5\u0090I\2\u03fb"+
		"\u03fa\3\2\2\2\u03fc\u03ff\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fd\u03fe\3\2"+
		"\2\2\u03fe\u0400\3\2\2\2\u03ff\u03fd\3\2\2\2\u0400\u0401\5\u0092J\2\u0401"+
		"\u0402\5\u00aaV\2\u0402\u008f\3\2\2\2\u0403\u040e\5\u00e8u\2\u0404\u040e"+
		"\7(\2\2\u0405\u040e\7\'\2\2\u0406\u040e\7&\2\2\u0407\u040e\7\6\2\2\u0408"+
		"\u040e\7+\2\2\u0409\u040e\7\27\2\2\u040a\u040e\7/\2\2\u040b\u040e\7#\2"+
		"\2\u040c\u040e\7,\2\2\u040d\u0403\3\2\2\2\u040d\u0404\3\2\2\2\u040d\u0405"+
		"\3\2\2\2\u040d\u0406\3\2\2\2\u040d\u0407\3\2\2\2\u040d\u0408\3\2\2\2\u040d"+
		"\u0409\3\2\2\2\u040d\u040a\3\2\2\2\u040d\u040b\3\2\2\2\u040d\u040c\3\2"+
		"\2\2\u040e\u0091\3\2\2\2\u040f\u0410\5\u0094K\2\u0410\u0412\5\u0096L\2"+
		"\u0411\u0413\5\u00a4S\2\u0412\u0411\3\2\2\2\u0412\u0413\3\2\2\2\u0413"+
		"\u0421\3\2\2\2\u0414\u0418\5Z.\2\u0415\u0417\5\u00e8u\2\u0416\u0415\3"+
		"\2\2\2\u0417\u041a\3\2\2\2\u0418\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419"+
		"\u041b\3\2\2\2\u041a\u0418\3\2\2\2\u041b\u041c\5\u0094K\2\u041c\u041e"+
		"\5\u0096L\2\u041d\u041f\5\u00a4S\2\u041e\u041d\3\2\2\2\u041e\u041f\3\2"+
		"\2\2\u041f\u0421\3\2\2\2\u0420\u040f\3\2\2\2\u0420\u0414\3\2\2\2\u0421"+
		"\u0093\3\2\2\2\u0422\u0425\5v<\2\u0423\u0425\7\65\2\2\u0424\u0422\3\2"+
		"\2\2\u0424\u0423\3\2\2\2\u0425\u0095\3\2\2\2\u0426\u0427\7k\2\2\u0427"+
		"\u0429\7>\2\2\u0428\u042a\5\u0098M\2\u0429\u0428\3\2\2\2\u0429\u042a\3"+
		"\2\2\2\u042a\u042b\3\2\2\2\u042b\u042d\7?\2\2\u042c\u042e\5\"\22\2\u042d"+
		"\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u0097\3\2\2\2\u042f\u0430\5\u009a"+
		"N\2\u0430\u0431\7E\2\2\u0431\u0432\5\u00a0Q\2\u0432\u0435\3\2\2\2\u0433"+
		"\u0435\5\u00a0Q\2\u0434\u042f\3\2\2\2\u0434\u0433\3\2\2\2\u0435\u0099"+
		"\3\2\2\2\u0436\u043b\5\u009cO\2\u0437\u0438\7E\2\2\u0438\u043a\5\u009c"+
		"O\2\u0439\u0437\3\2\2\2\u043a\u043d\3\2\2\2\u043b\u0439\3\2\2\2\u043b"+
		"\u043c\3\2\2\2\u043c\u0447\3\2\2\2\u043d\u043b\3\2\2\2\u043e\u0443\5\u00a2"+
		"R\2\u043f\u0440\7E\2\2\u0440\u0442\5\u009cO\2\u0441\u043f\3\2\2\2\u0442"+
		"\u0445\3\2\2\2\u0443\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0447\3\2"+
		"\2\2\u0445\u0443\3\2\2\2\u0446\u0436\3\2\2\2\u0446\u043e\3\2\2\2\u0447"+
		"\u009b\3\2\2\2\u0448\u044a\5\u009eP\2\u0449\u0448\3\2\2\2\u044a\u044d"+
		"\3\2\2\2\u044b\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044e\3\2\2\2\u044d"+
		"\u044b\3\2\2\2\u044e\u044f\5v<\2\u044f\u0450\5r:\2\u0450\u009d\3\2\2\2"+
		"\u0451\u0454\5\u00e8u\2\u0452\u0454\7\27\2\2\u0453\u0451\3\2\2\2\u0453"+
		"\u0452\3\2\2\2\u0454\u009f\3\2\2\2\u0455\u0457\5\u009eP\2\u0456\u0455"+
		"\3\2\2\2\u0457\u045a\3\2\2\2\u0458\u0456\3\2\2\2\u0458\u0459\3\2\2\2\u0459"+
		"\u045b\3\2\2\2\u045a\u0458\3\2\2\2\u045b\u045f\5v<\2\u045c\u045e\5\u00e8"+
		"u\2\u045d\u045c\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u045f"+
		"\u0460\3\2\2\2\u0460\u0462\3\2\2\2\u0461\u045f\3\2\2\2\u0462\u0463\7m"+
		"\2\2\u0463\u0464\5r:\2\u0464\u0467\3\2\2\2\u0465\u0467\5\u009cO\2\u0466"+
		"\u0458\3\2\2\2\u0466\u0465\3\2\2\2\u0467\u00a1\3\2\2\2\u0468\u046a\5\u00e8"+
		"u\2\u0469\u0468\3\2\2\2\u046a\u046d\3\2\2\2\u046b\u0469\3\2\2\2\u046b"+
		"\u046c\3\2\2\2\u046c\u046e\3\2\2\2\u046d\u046b\3\2\2\2\u046e\u0471\5v"+
		"<\2\u046f\u0470\7k\2\2\u0470\u0472\7F\2\2\u0471\u046f\3\2\2\2\u0471\u0472"+
		"\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0474\7\60\2\2\u0474\u00a3\3\2\2\2"+
		"\u0475\u0476\7\62\2\2\u0476\u0477\5\u00a6T\2\u0477\u00a5\3\2\2\2\u0478"+
		"\u047d\5\u00a8U\2\u0479\u047a\7E\2\2\u047a\u047c\5\u00a8U\2\u047b\u0479"+
		"\3\2\2\2\u047c\u047f\3\2\2\2\u047d\u047b\3\2\2\2\u047d\u047e\3\2\2\2\u047e"+
		"\u00a7\3\2\2\2\u047f\u047d\3\2\2\2\u0480\u0483\5\22\n\2\u0481\u0483\5"+
		"\36\20\2\u0482\u0480\3\2\2\2\u0482\u0481\3\2\2\2\u0483\u00a9\3\2\2\2\u0484"+
		"\u0487\5\u00fe\u0080\2\u0485\u0487\7D\2\2\u0486\u0484\3\2\2\2\u0486\u0485"+
		"\3\2\2\2\u0487\u00ab\3\2\2\2\u0488\u0489\5\u00fe\u0080\2\u0489\u00ad\3"+
		"\2\2\2\u048a\u048b\7+\2\2\u048b\u048c\5\u00fe\u0080\2\u048c\u00af\3\2"+
		"\2\2\u048d\u048f\5\u00b2Z\2\u048e\u048d\3\2\2\2\u048f\u0492\3\2\2\2\u0490"+
		"\u048e\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0493\3\2\2\2\u0492\u0490\3\2"+
		"\2\2\u0493\u0495\5\u00b4[\2\u0494\u0496\5\u00a4S\2\u0495\u0494\3\2\2\2"+
		"\u0495\u0496\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\5\u00b8]\2\u0498"+
		"\u00b1\3\2\2\2\u0499\u049e\5\u00e8u\2\u049a\u049e\7(\2\2\u049b\u049e\7"+
		"\'\2\2\u049c\u049e\7&\2\2\u049d\u0499\3\2\2\2\u049d\u049a\3\2\2\2\u049d"+
		"\u049b\3\2\2\2\u049d\u049c\3\2\2\2\u049e\u00b3\3\2\2\2\u049f\u04a1\5Z"+
		".\2\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2"+
		"\u04a3\5\u00b6\\\2\u04a3\u04a5\7>\2\2\u04a4\u04a6\5\u0098M\2\u04a5\u04a4"+
		"\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a8\7?\2\2\u04a8"+
		"\u00b5\3\2\2\2\u04a9\u04aa\7k\2\2\u04aa\u00b7\3\2\2\2\u04ab\u04ad\7@\2"+
		"\2\u04ac\u04ae\5\u00ba^\2\u04ad\u04ac\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae"+
		"\u04b0\3\2\2\2\u04af\u04b1\5\u0100\u0081\2\u04b0\u04af\3\2\2\2\u04b0\u04b1"+
		"\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\7A\2\2\u04b3\u00b9\3\2\2\2\u04b4"+
		"\u04b6\5,\27\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2"+
		"\2\2\u04b7\u04b8\7\60\2\2\u04b8\u04ba\7>\2\2\u04b9\u04bb\5\u0190\u00c9"+
		"\2\u04ba\u04b9\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd"+
		"\7?\2\2\u04bd\u04e3\7D\2\2\u04be\u04c0\5,\27\2\u04bf\u04be\3\2\2\2\u04bf"+
		"\u04c0\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\7-\2\2\u04c2\u04c4\7>\2"+
		"\2\u04c3\u04c5\5\u0190\u00c9\2\u04c4\u04c3\3\2\2\2\u04c4\u04c5\3\2\2\2"+
		"\u04c5\u04c6\3\2\2\2\u04c6\u04c7\7?\2\2\u04c7\u04e3\7D\2\2\u04c8\u04c9"+
		"\5<\37\2\u04c9\u04cb\7F\2\2\u04ca\u04cc\5,\27\2\u04cb\u04ca\3\2\2\2\u04cb"+
		"\u04cc\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04ce\7-\2\2\u04ce\u04d0\7>\2"+
		"\2\u04cf\u04d1\5\u0190\u00c9\2\u04d0\u04cf\3\2\2\2\u04d0\u04d1\3\2\2\2"+
		"\u04d1\u04d2\3\2\2\2\u04d2\u04d3\7?\2\2\u04d3\u04d4\7D\2\2\u04d4\u04e3"+
		"\3\2\2\2\u04d5\u04d6\5\u0162\u00b2\2\u04d6\u04d8\7F\2\2\u04d7\u04d9\5"+
		",\27\2\u04d8\u04d7\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04da\3\2\2\2\u04da"+
		"\u04db\7-\2\2\u04db\u04dd\7>\2\2\u04dc\u04de\5\u0190\u00c9\2\u04dd\u04dc"+
		"\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e0\7?\2\2\u04e0"+
		"\u04e1\7D\2\2\u04e1\u04e3\3\2\2\2\u04e2\u04b5\3\2\2\2\u04e2\u04bf\3\2"+
		"\2\2\u04e2\u04c8\3\2\2\2\u04e2\u04d5\3\2\2\2\u04e3\u00bb\3\2\2\2\u04e4"+
		"\u04e6\5X-\2\u04e5\u04e4\3\2\2\2\u04e6\u04e9\3\2\2\2\u04e7\u04e5\3\2\2"+
		"\2\u04e7\u04e8\3\2\2\2\u04e8\u04ea\3\2\2\2\u04e9\u04e7\3\2\2\2\u04ea\u04eb"+
		"\7\25\2\2\u04eb\u04ed\7k\2\2\u04ec\u04ee\5`\61\2\u04ed\u04ec\3\2\2\2\u04ed"+
		"\u04ee\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\5\u00be`\2\u04f0\u00bd"+
		"\3\2\2\2\u04f1\u04f3\7@\2\2\u04f2\u04f4\5\u00c0a\2\u04f3\u04f2\3\2\2\2"+
		"\u04f3\u04f4\3\2\2\2\u04f4\u04f6\3\2\2\2\u04f5\u04f7\7E\2\2\u04f6\u04f5"+
		"\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f9\3\2\2\2\u04f8\u04fa\5\u00c6d"+
		"\2\u04f9\u04f8\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc"+
		"\7A\2\2\u04fc\u00bf\3\2\2\2\u04fd\u0502\5\u00c2b\2\u04fe\u04ff\7E\2\2"+
		"\u04ff\u0501\5\u00c2b\2\u0500\u04fe\3\2\2\2\u0501\u0504\3\2\2\2\u0502"+
		"\u0500\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u00c1\3\2\2\2\u0504\u0502\3\2"+
		"\2\2\u0505\u0507\5\u00c4c\2\u0506\u0505\3\2\2\2\u0507\u050a\3\2\2\2\u0508"+
		"\u0506\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050b\3\2\2\2\u050a\u0508\3\2"+
		"\2\2\u050b\u0511\7k\2\2\u050c\u050e\7>\2\2\u050d\u050f\5\u0190\u00c9\2"+
		"\u050e\u050d\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0512"+
		"\7?\2\2\u0511\u050c\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0514\3\2\2\2\u0513"+
		"\u0515\5d\63\2\u0514\u0513\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u00c3\3\2"+
		"\2\2\u0516\u0517\5\u00e8u\2\u0517\u00c5\3\2\2\2\u0518\u051c\7D\2\2\u0519"+
		"\u051b\5f\64\2\u051a\u0519\3\2\2\2\u051b\u051e\3\2\2\2\u051c\u051a\3\2"+
		"\2\2\u051c\u051d\3\2\2\2\u051d\u00c7\3\2\2\2\u051e\u051c\3\2\2\2\u051f"+
		"\u0522\5\u00caf\2\u0520\u0522\5\u00dco\2\u0521\u051f\3\2\2\2\u0521\u0520"+
		"\3\2\2\2\u0522\u00c9\3\2\2\2\u0523\u0525\5\u00ccg\2\u0524\u0523\3\2\2"+
		"\2\u0525\u0528\3\2\2\2\u0526\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0529"+
		"\3\2\2\2\u0528\u0526\3\2\2\2\u0529\u052a\7!\2\2\u052a\u052c\7k\2\2\u052b"+
		"\u052d\5Z.\2\u052c\u052b\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052f\3\2\2"+
		"\2\u052e\u0530\5\u00ceh\2\u052f\u052e\3\2\2\2\u052f\u0530\3\2\2\2\u0530"+
		"\u0531\3\2\2\2\u0531\u0532\5\u00d0i\2\u0532\u00cb\3\2\2\2\u0533\u053b"+
		"\5\u00e8u\2\u0534\u053b\7(\2\2\u0535\u053b\7\'\2\2\u0536\u053b\7&\2\2"+
		"\u0537\u053b\7\6\2\2\u0538\u053b\7+\2\2\u0539\u053b\7,\2\2\u053a\u0533"+
		"\3\2\2\2\u053a\u0534\3\2\2\2\u053a\u0535\3\2\2\2\u053a\u0536\3\2\2\2\u053a"+
		"\u0537\3\2\2\2\u053a\u0538\3\2\2\2\u053a\u0539\3\2\2\2\u053b\u00cd\3\2"+
		"\2\2\u053c\u053d\7\26\2\2\u053d\u053e\5b\62\2\u053e\u00cf\3\2\2\2\u053f"+
		"\u0543\7@\2\2\u0540\u0542\5\u00d2j\2\u0541\u0540\3\2\2\2\u0542\u0545\3"+
		"\2\2\2\u0543\u0541\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0546\3\2\2\2\u0545"+
		"\u0543\3\2\2\2\u0546\u0547\7A\2\2\u0547\u00d1\3\2\2\2\u0548\u054e\5\u00d4"+
		"k\2\u0549\u054e\5\u00d8m\2\u054a\u054e\5T+\2\u054b\u054e\5\u00c8e\2\u054c"+
		"\u054e\7D\2\2\u054d\u0548\3\2\2\2\u054d\u0549\3\2\2\2\u054d\u054a\3\2"+
		"\2\2\u054d\u054b\3\2\2\2\u054d\u054c\3\2\2\2\u054e\u00d3\3\2\2\2\u054f"+
		"\u0551\5\u00d6l\2\u0550\u054f\3\2\2\2\u0551\u0554\3\2\2\2\u0552\u0550"+
		"\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0555\3\2\2\2\u0554\u0552\3\2\2\2\u0555"+
		"\u0556\5v<\2\u0556\u0557\5n8\2\u0557\u0558\7D\2\2\u0558\u00d5\3\2\2\2"+
		"\u0559\u055e\5\u00e8u\2\u055a\u055e\7(\2\2\u055b\u055e\7+\2\2\u055c\u055e"+
		"\7\27\2\2\u055d\u0559\3\2\2\2\u055d\u055a\3\2\2\2\u055d\u055b\3\2\2\2"+
		"\u055d\u055c\3\2\2\2\u055e\u00d7\3\2\2\2\u055f\u0561\5\u00dan\2\u0560"+
		"\u055f\3\2\2\2\u0561\u0564\3\2\2\2\u0562\u0560\3\2\2\2\u0562\u0563\3\2"+
		"\2\2\u0563\u0565\3\2\2\2\u0564\u0562\3\2\2\2\u0565\u0566\5\u0092J\2\u0566"+
		"\u0567\5\u00aaV\2\u0567\u00d9\3\2\2\2\u0568\u056f\5\u00e8u\2\u0569\u056f"+
		"\7(\2\2\u056a\u056f\7\6\2\2\u056b\u056f\7\21\2\2\u056c\u056f\7+\2\2\u056d"+
		"\u056f\7,\2\2\u056e\u0568\3\2\2\2\u056e\u0569\3\2\2\2\u056e\u056a\3\2"+
		"\2\2\u056e\u056b\3\2\2\2\u056e\u056c\3\2\2\2\u056e\u056d\3\2\2\2\u056f"+
		"\u00db\3\2\2\2\u0570\u0572\5\u00ccg\2\u0571\u0570\3\2\2\2\u0572\u0575"+
		"\3\2\2\2\u0573\u0571\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0576\3\2\2\2\u0575"+
		"\u0573\3\2\2\2\u0576\u0577\7l\2\2\u0577\u0578\7!\2\2\u0578\u0579\7k\2"+
		"\2\u0579\u057a\5\u00dep\2\u057a\u00dd\3\2\2\2\u057b\u057f\7@\2\2\u057c"+
		"\u057e\5\u00e0q\2\u057d\u057c\3\2\2\2\u057e\u0581\3\2\2\2\u057f\u057d"+
		"\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0582\3\2\2\2\u0581\u057f\3\2\2\2\u0582"+
		"\u0583\7A\2\2\u0583\u00df\3\2\2\2\u0584\u058a\5\u00e2r\2\u0585\u058a\5"+
		"\u00d4k\2\u0586\u058a\5T+\2\u0587\u058a\5\u00c8e\2\u0588\u058a\7D\2\2"+
		"\u0589\u0584\3\2\2\2\u0589\u0585\3\2\2\2\u0589\u0586\3\2\2\2\u0589\u0587"+
		"\3\2\2\2\u0589\u0588\3\2\2\2\u058a\u00e1\3\2\2\2\u058b\u058d\5\u00e4s"+
		"\2\u058c\u058b\3\2\2\2\u058d\u0590\3\2\2\2\u058e\u058c\3\2\2\2\u058e\u058f"+
		"\3\2\2\2\u058f\u0591\3\2\2\2\u0590\u058e\3\2\2\2\u0591\u0592\5v<\2\u0592"+
		"\u0593\7k\2\2\u0593\u0594\7>\2\2\u0594\u0596\7?\2\2\u0595\u0597\5\"\22"+
		"\2\u0596\u0595\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0599\3\2\2\2\u0598\u059a"+
		"\5\u00e6t\2\u0599\u0598\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059b\3\2\2"+
		"\2\u059b\u059c\7D\2\2\u059c\u00e3\3\2\2\2\u059d\u05a1\5\u00e8u\2\u059e"+
		"\u05a1\7(\2\2\u059f\u05a1\7\6\2\2\u05a0\u059d\3\2\2\2\u05a0\u059e\3\2"+
		"\2\2\u05a0\u059f\3\2\2\2\u05a1\u00e5\3\2\2\2\u05a2\u05a3\7\21\2\2\u05a3"+
		"\u05a4\5\u00f0y\2\u05a4\u00e7\3\2\2\2\u05a5\u05a9\5\u00eav\2\u05a6\u05a9"+
		"\5\u00f6|\2\u05a7\u05a9\5\u00f8}\2\u05a8\u05a5\3\2\2\2\u05a8\u05a6\3\2"+
		"\2\2\u05a8\u05a7\3\2\2\2\u05a9\u00e9\3\2\2\2\u05aa\u05ab\7l\2\2\u05ab"+
		"\u05ac\58\35\2\u05ac\u05ae\7>\2\2\u05ad\u05af\5\u00ecw\2\u05ae\u05ad\3"+
		"\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b1\7?\2\2\u05b1"+
		"\u00eb\3\2\2\2\u05b2\u05b7\5\u00eex\2\u05b3\u05b4\7E\2\2\u05b4\u05b6\5"+
		"\u00eex\2\u05b5\u05b3\3\2\2\2\u05b6\u05b9\3\2\2\2\u05b7\u05b5\3\2\2\2"+
		"\u05b7\u05b8\3\2\2\2\u05b8\u00ed\3\2\2\2\u05b9\u05b7\3\2\2\2\u05ba\u05bb"+
		"\7k\2\2\u05bb\u05bc\7G\2\2\u05bc\u05bd\5\u00f0y\2\u05bd\u00ef\3\2\2\2"+
		"\u05be\u05c2\5\u01b2\u00da\2\u05bf\u05c2\5\u00f2z\2\u05c0\u05c2\5\u00e8"+
		"u\2\u05c1\u05be\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c1\u05c0\3\2\2\2\u05c2"+
		"\u00f1\3\2\2\2\u05c3\u05c5\7@\2\2\u05c4\u05c6\5\u00f4{\2\u05c5\u05c4\3"+
		"\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c8\3\2\2\2\u05c7\u05c9\7E\2\2\u05c8"+
		"\u05c7\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cb\7A"+
		"\2\2\u05cb\u00f3\3\2\2\2\u05cc\u05d1\5\u00f0y\2\u05cd\u05ce\7E\2\2\u05ce"+
		"\u05d0\5\u00f0y\2\u05cf\u05cd\3\2\2\2\u05d0\u05d3\3\2\2\2\u05d1\u05cf"+
		"\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u00f5\3\2\2\2\u05d3\u05d1\3\2\2\2\u05d4"+
		"\u05d5\7l\2\2\u05d5\u05d6\58\35\2\u05d6\u00f7\3\2\2\2\u05d7\u05d8\7l\2"+
		"\2\u05d8\u05d9\58\35\2\u05d9\u05da\7>\2\2\u05da\u05db\5\u00f0y\2\u05db"+
		"\u05dc\7?\2\2\u05dc\u00f9\3\2\2\2\u05dd\u05df\7@\2\2\u05de\u05e0\5\u00fc"+
		"\177\2\u05df\u05de\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e2\3\2\2\2\u05e1"+
		"\u05e3\7E\2\2\u05e2\u05e1\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\3\2"+
		"\2\2\u05e4\u05e5\7A\2\2\u05e5\u00fb\3\2\2\2\u05e6\u05eb\5t;\2\u05e7\u05e8"+
		"\7E\2\2\u05e8\u05ea\5t;\2\u05e9\u05e7\3\2\2\2\u05ea\u05ed\3\2\2\2\u05eb"+
		"\u05e9\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u00fd\3\2\2\2\u05ed\u05eb\3\2"+
		"\2\2\u05ee\u05f0\7@\2\2\u05ef\u05f1\5\u0100\u0081\2\u05f0\u05ef\3\2\2"+
		"\2\u05f0\u05f1\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f3\7A\2\2\u05f3\u00ff"+
		"\3\2\2\2\u05f4\u05f8\5\u0102\u0082\2\u05f5\u05f7\5\u0102\u0082\2\u05f6"+
		"\u05f5\3\2\2\2\u05f7\u05fa\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f8\u05f9\3\2"+
		"\2\2\u05f9\u0101\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fb\u0600\5\u0104\u0083"+
		"\2\u05fc\u0600\5T+\2\u05fd\u0600\5\u0108\u0085\2\u05fe\u0600\5\u01dc\u00ef"+
		"\2\u05ff\u05fb\3\2\2\2\u05ff\u05fc\3\2\2\2\u05ff\u05fd\3\2\2\2\u05ff\u05fe"+
		"\3\2\2\2\u0600\u0103\3\2\2\2\u0601\u0602\5\u0106\u0084\2\u0602\u0603\7"+
		"D\2\2\u0603\u0105\3\2\2\2\u0604\u0606\5\u009eP\2\u0605\u0604\3\2\2\2\u0606"+
		"\u0609\3\2\2\2\u0607\u0605\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u060a\3\2"+
		"\2\2\u0609\u0607\3\2\2\2\u060a\u060b\5v<\2\u060b\u060c\5n8\2\u060c\u0107"+
		"\3\2\2\2\u060d\u0614\5\u010c\u0087\2\u060e\u0614\5\u0110\u0089\2\u060f"+
		"\u0614\5\u0118\u008d\2\u0610\u0614\5\u011a\u008e\2\u0611\u0614\5\u012c"+
		"\u0097\2\u0612\u0614\5\u0132\u009a\2\u0613\u060d\3\2\2\2\u0613\u060e\3"+
		"\2\2\2\u0613\u060f\3\2\2\2\u0613\u0610\3\2\2\2\u0613\u0611\3\2\2\2\u0613"+
		"\u0612\3\2\2\2\u0614\u0109\3\2\2\2\u0615\u061b\5\u010c\u0087\2\u0616\u061b"+
		"\5\u0112\u008a\2\u0617\u061b\5\u011c\u008f\2\u0618\u061b\5\u012e\u0098"+
		"\2\u0619\u061b\5\u0134\u009b\2\u061a\u0615\3\2\2\2\u061a\u0616\3\2\2\2"+
		"\u061a\u0617\3\2\2\2\u061a\u0618\3\2\2\2\u061a\u0619\3\2\2\2\u061b\u010b"+
		"\3\2\2\2\u061c\u0629\5\u00fe\u0080\2\u061d\u0629\5\u010e\u0088\2\u061e"+
		"\u0629\5\u0114\u008b\2\u061f\u0629\5\u011e\u0090\2\u0620\u0629\5\u0120"+
		"\u0091\2\u0621\u0629\5\u0130\u0099\2\u0622\u0629\5\u0144\u00a3\2\u0623"+
		"\u0629\5\u0146\u00a4\2\u0624\u0629\5\u0148\u00a5\2\u0625\u0629\5\u014c"+
		"\u00a7\2\u0626\u0629\5\u014a\u00a6\2\u0627\u0629\5\u014e\u00a8\2\u0628"+
		"\u061c\3\2\2\2\u0628\u061d\3\2\2\2\u0628\u061e\3\2\2\2\u0628\u061f\3\2"+
		"\2\2\u0628\u0620\3\2\2\2\u0628\u0621\3\2\2\2\u0628\u0622\3\2\2\2\u0628"+
		"\u0623\3\2\2\2\u0628\u0624\3\2\2\2\u0628\u0625\3\2\2\2\u0628\u0626\3\2"+
		"\2\2\u0628\u0627\3\2\2\2\u0629\u010d\3\2\2\2\u062a\u062b\7D\2\2\u062b"+
		"\u010f\3\2\2\2\u062c\u062d\7k\2\2\u062d\u062e\7M\2\2\u062e\u062f\5\u0108"+
		"\u0085\2\u062f\u0111\3\2\2\2\u0630\u0631\7k\2\2\u0631\u0632\7M\2\2\u0632"+
		"\u0633\5\u010a\u0086\2\u0633\u0113\3\2\2\2\u0634\u0635\5\u0116\u008c\2"+
		"\u0635\u0636\7D\2\2\u0636\u0115\3\2\2\2\u0637\u063f\5\u01ac\u00d7\2\u0638"+
		"\u063f\5\u01ca\u00e6\2\u0639\u063f\5\u01cc\u00e7\2\u063a\u063f\5\u01d2"+
		"\u00ea\2\u063b\u063f\5\u01d6\u00ec\2\u063c\u063f\5\u018a\u00c6\2\u063d"+
		"\u063f\5\u0176\u00bc\2\u063e\u0637\3\2\2\2\u063e\u0638\3\2\2\2\u063e\u0639"+
		"\3\2\2\2\u063e\u063a\3\2\2\2\u063e\u063b\3\2\2\2\u063e\u063c\3\2\2\2\u063e"+
		"\u063d\3\2\2\2\u063f\u0117\3\2\2\2\u0640\u0641\7\33\2\2\u0641\u0642\7"+
		">\2\2\u0642\u0643\5\u01a0\u00d1\2\u0643\u0644\7?\2\2\u0644\u0645\5\u0108"+
		"\u0085\2\u0645\u0119\3\2\2\2\u0646\u0647\7\33\2\2\u0647\u0648\7>\2\2\u0648"+
		"\u0649\5\u01a0\u00d1\2\u0649\u064a\7?\2\2\u064a\u064b\5\u010a\u0086\2"+
		"\u064b\u064c\7\24\2\2\u064c\u064d\5\u0108\u0085\2\u064d\u011b\3\2\2\2"+
		"\u064e\u064f\7\33\2\2\u064f\u0650\7>\2\2\u0650\u0651\5\u01a0\u00d1\2\u0651"+
		"\u0652\7?\2\2\u0652\u0653\5\u010a\u0086\2\u0653\u0654\7\24\2\2\u0654\u0655"+
		"\5\u010a\u0086\2\u0655\u011d\3\2\2\2\u0656\u0657\7\7\2\2\u0657\u0658\5"+
		"\u01a0\u00d1\2\u0658\u0659\7D\2\2\u0659\u0661\3\2\2\2\u065a\u065b\7\7"+
		"\2\2\u065b\u065c\5\u01a0\u00d1\2\u065c\u065d\7M\2\2\u065d\u065e\5\u01a0"+
		"\u00d1\2\u065e\u065f\7D\2\2\u065f\u0661\3\2\2\2\u0660\u0656\3\2\2\2\u0660"+
		"\u065a\3\2\2\2\u0661\u011f\3\2\2\2\u0662\u0663\7.\2\2\u0663\u0664\7>\2"+
		"\2\u0664\u0665\5\u01a0\u00d1\2\u0665\u0666\7?\2\2\u0666\u0667\5\u0122"+
		"\u0092\2\u0667\u0121\3\2\2\2\u0668\u066c\7@\2\2\u0669\u066b\5\u0124\u0093"+
		"\2\u066a\u0669\3\2\2\2\u066b\u066e\3\2\2\2\u066c\u066a\3\2\2\2\u066c\u066d"+
		"\3\2\2\2\u066d\u0672\3\2\2\2\u066e\u066c\3\2\2\2\u066f\u0671\5\u0128\u0095"+
		"\2\u0670\u066f\3\2\2\2\u0671\u0674\3\2\2\2\u0672\u0670\3\2\2\2\u0672\u0673"+
		"\3\2\2\2\u0673\u0675\3\2\2\2\u0674\u0672\3\2\2\2\u0675\u0676\7A\2\2\u0676"+
		"\u0123\3\2\2\2\u0677\u0678\5\u0126\u0094\2\u0678\u0679\5\u0100\u0081\2"+
		"\u0679\u0125\3\2\2\2\u067a\u067e\5\u0128\u0095\2\u067b\u067d\5\u0128\u0095"+
		"\2\u067c\u067b\3\2\2\2\u067d\u0680\3\2\2\2\u067e\u067c\3\2\2\2\u067e\u067f"+
		"\3\2\2\2\u067f\u0127\3\2\2\2\u0680\u067e\3\2\2\2\u0681\u0682\7\13\2\2"+
		"\u0682\u0683\5\u019e\u00d0\2\u0683\u0684\7M\2\2\u0684\u068c\3\2\2\2\u0685"+
		"\u0686\7\13\2\2\u0686\u0687\5\u012a\u0096\2\u0687\u0688\7M\2\2\u0688\u068c"+
		"\3\2\2\2\u0689\u068a\7\21\2\2\u068a\u068c\7M\2\2\u068b\u0681\3\2\2\2\u068b"+
		"\u0685\3\2\2\2\u068b\u0689\3\2\2\2\u068c\u0129\3\2\2\2\u068d\u068e\7k"+
		"\2\2\u068e\u012b\3\2\2\2\u068f\u0690\7\67\2\2\u0690\u0691\7>\2\2\u0691"+
		"\u0692\5\u01a0\u00d1\2\u0692\u0693\7?\2\2\u0693\u0694\5\u0108\u0085\2"+
		"\u0694\u012d\3\2\2\2\u0695\u0696\7\67\2\2\u0696\u0697\7>\2\2\u0697\u0698"+
		"\5\u01a0\u00d1\2\u0698\u0699\7?\2\2\u0699\u069a\5\u010a\u0086\2\u069a"+
		"\u012f\3\2\2\2\u069b\u069c\7\22\2\2\u069c\u069d\5\u0108\u0085\2\u069d"+
		"\u069e\7\67\2\2\u069e\u069f\7>\2\2\u069f\u06a0\5\u01a0\u00d1\2\u06a0\u06a1"+
		"\7?\2\2\u06a1\u06a2\7D\2\2\u06a2\u0131\3\2\2\2\u06a3\u06a6\5\u0136\u009c"+
		"\2\u06a4\u06a6\5\u0140\u00a1\2\u06a5\u06a3\3\2\2\2\u06a5\u06a4\3\2\2\2"+
		"\u06a6\u0133\3\2\2\2\u06a7\u06aa\5\u0138\u009d\2\u06a8\u06aa\5\u0142\u00a2"+
		"\2\u06a9\u06a7\3\2\2\2\u06a9\u06a8\3\2\2\2\u06aa\u0135\3\2\2\2\u06ab\u06ac"+
		"\7\32\2\2\u06ac\u06ae\7>\2\2\u06ad\u06af\5\u013a\u009e\2\u06ae\u06ad\3"+
		"\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b2\7D\2\2\u06b1"+
		"\u06b3\5\u01a0\u00d1\2\u06b2\u06b1\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b4"+
		"\3\2\2\2\u06b4\u06b6\7D\2\2\u06b5\u06b7\5\u013c\u009f\2\u06b6\u06b5\3"+
		"\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b9\7?\2\2\u06b9"+
		"\u06ba\5\u0108\u0085\2\u06ba\u0137\3\2\2\2\u06bb\u06bc\7\32\2\2\u06bc"+
		"\u06be\7>\2\2\u06bd\u06bf\5\u013a\u009e\2\u06be\u06bd\3\2\2\2\u06be\u06bf"+
		"\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c2\7D\2\2\u06c1\u06c3\5\u01a0\u00d1"+
		"\2\u06c2\u06c1\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c6"+
		"\7D\2\2\u06c5\u06c7\5\u013c\u009f\2\u06c6\u06c5\3\2\2\2\u06c6\u06c7\3"+
		"\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u06c9\7?\2\2\u06c9\u06ca\5\u010a\u0086"+
		"\2\u06ca\u0139\3\2\2\2\u06cb\u06ce\5\u013e\u00a0\2\u06cc\u06ce\5\u0106"+
		"\u0084\2\u06cd\u06cb\3\2\2\2\u06cd\u06cc\3\2\2\2\u06ce\u013b\3\2\2\2\u06cf"+
		"\u06d0\5\u013e\u00a0\2\u06d0\u013d\3\2\2\2\u06d1\u06d6\5\u0116\u008c\2"+
		"\u06d2\u06d3\7E\2\2\u06d3\u06d5\5\u0116\u008c\2\u06d4\u06d2\3\2\2\2\u06d5"+
		"\u06d8\3\2\2\2\u06d6\u06d4\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u013f\3\2"+
		"\2\2\u06d8\u06d6\3\2\2\2\u06d9\u06da\7\32\2\2\u06da\u06de\7>\2\2\u06db"+
		"\u06dd\5\u009eP\2\u06dc\u06db\3\2\2\2\u06dd\u06e0\3\2\2\2\u06de\u06dc"+
		"\3\2\2\2\u06de\u06df\3\2\2\2\u06df\u06e1\3\2\2\2\u06e0\u06de\3\2\2\2\u06e1"+
		"\u06e2\5v<\2\u06e2\u06e3\5r:\2\u06e3\u06e4\7M\2\2\u06e4\u06e5\5\u01a0"+
		"\u00d1\2\u06e5\u06e6\7?\2\2\u06e6\u06e7\5\u0108\u0085\2\u06e7\u0141\3"+
		"\2\2\2\u06e8\u06e9\7\32\2\2\u06e9\u06ed\7>\2\2\u06ea\u06ec\5\u009eP\2"+
		"\u06eb\u06ea\3\2\2\2\u06ec\u06ef\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ed\u06ee"+
		"\3\2\2\2\u06ee\u06f0\3\2\2\2\u06ef\u06ed\3\2\2\2\u06f0\u06f1\5v<\2\u06f1"+
		"\u06f2\5r:\2\u06f2\u06f3\7M\2\2\u06f3\u06f4\5\u01a0\u00d1\2\u06f4\u06f5"+
		"\7?\2\2\u06f5\u06f6\5\u010a\u0086\2\u06f6\u0143\3\2\2\2\u06f7\u06f9\7"+
		"\t\2\2\u06f8\u06fa\7k\2\2\u06f9\u06f8\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa"+
		"\u06fb\3\2\2\2\u06fb\u06fc\7D\2\2\u06fc\u0145\3\2\2\2\u06fd\u06ff\7\20"+
		"\2\2\u06fe\u0700\7k\2\2\u06ff\u06fe\3\2\2\2\u06ff\u0700\3\2\2\2\u0700"+
		"\u0701\3\2\2\2\u0701\u0702\7D\2\2\u0702\u0147\3\2\2\2\u0703\u0705\7)\2"+
		"\2\u0704\u0706\5\u01a0\u00d1\2\u0705\u0704\3\2\2\2\u0705\u0706\3\2\2\2"+
		"\u0706\u0707\3\2\2\2\u0707\u0708\7D\2\2\u0708\u0149\3\2\2\2\u0709\u070a"+
		"\7\61\2\2\u070a\u070b\5\u01a0\u00d1\2\u070b\u070c\7D\2\2\u070c\u014b\3"+
		"\2\2\2\u070d\u070e\7/\2\2\u070e\u070f\7>\2\2\u070f\u0710\5\u01a0\u00d1"+
		"\2\u0710\u0711\7?\2\2\u0711\u0712\5\u00fe\u0080\2\u0712\u014d\3\2\2\2"+
		"\u0713\u0714\7\64\2\2\u0714\u0715\5\u00fe\u0080\2\u0715\u0716\5\u0150"+
		"\u00a9\2\u0716\u0720\3\2\2\2\u0717\u0718\7\64\2\2\u0718\u071a\5\u00fe"+
		"\u0080\2\u0719\u071b\5\u0150\u00a9\2\u071a\u0719\3\2\2\2\u071a\u071b\3"+
		"\2\2\2\u071b\u071c\3\2\2\2\u071c\u071d\5\u0158\u00ad\2\u071d\u0720\3\2"+
		"\2\2\u071e\u0720\5\u015a\u00ae\2\u071f\u0713\3\2\2\2\u071f\u0717\3\2\2"+
		"\2\u071f\u071e\3\2\2\2\u0720\u014f\3\2\2\2\u0721\u0725\5\u0152\u00aa\2"+
		"\u0722\u0724\5\u0152\u00aa\2\u0723\u0722\3\2\2\2\u0724\u0727\3\2\2\2\u0725"+
		"\u0723\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u0151\3\2\2\2\u0727\u0725\3\2"+
		"\2\2\u0728\u0729\7\f\2\2\u0729\u072a\7>\2\2\u072a\u072b\5\u0154\u00ab"+
		"\2\u072b\u072c\7?\2\2\u072c\u072d\5\u00fe\u0080\2\u072d\u0153\3\2\2\2"+
		"\u072e\u0730\5\u009eP\2\u072f\u072e\3\2\2\2\u0730\u0733\3\2\2\2\u0731"+
		"\u072f\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0734\3\2\2\2\u0733\u0731\3\2"+
		"\2\2\u0734\u0735\5\u0156\u00ac\2\u0735\u0736\5r:\2\u0736\u0155\3\2\2\2"+
		"\u0737\u073c\5~@\2\u0738\u0739\7[\2\2\u0739\u073b\5\22\n\2\u073a\u0738"+
		"\3\2\2\2\u073b\u073e\3\2\2\2\u073c\u073a\3\2\2\2\u073c\u073d\3\2\2\2\u073d"+
		"\u0157\3\2\2\2\u073e\u073c\3\2\2\2\u073f\u0740\7\30\2\2\u0740\u0741\5"+
		"\u00fe\u0080\2\u0741\u0159\3\2\2\2\u0742\u0743\7\64\2\2\u0743\u0744\5"+
		"\u015c\u00af\2\u0744\u0746\5\u00fe\u0080\2\u0745\u0747\5\u0150\u00a9\2"+
		"\u0746\u0745\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0749\3\2\2\2\u0748\u074a"+
		"\5\u0158\u00ad\2\u0749\u0748\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u015b\3"+
		"\2\2\2\u074b\u074c\7>\2\2\u074c\u074e\5\u015e\u00b0\2\u074d\u074f\7D\2"+
		"\2\u074e\u074d\3\2\2\2\u074e\u074f\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0751"+
		"\7?\2\2\u0751\u015d\3\2\2\2\u0752\u0757\5\u0160\u00b1\2\u0753\u0754\7"+
		"D\2\2\u0754\u0756\5\u0160\u00b1\2\u0755\u0753\3\2\2\2\u0756\u0759\3\2"+
		"\2\2\u0757\u0755\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u015f\3\2\2\2\u0759"+
		"\u0757\3\2\2\2\u075a\u075c\5\u009eP\2\u075b\u075a\3\2\2\2\u075c\u075f"+
		"\3\2\2\2\u075d\u075b\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u0760\3\2\2\2\u075f"+
		"\u075d\3\2\2\2\u0760\u0761\5v<\2\u0761\u0762\5r:\2\u0762\u0763\7G\2\2"+
		"\u0763\u0764\5\u01a0\u00d1\2\u0764\u0161\3\2\2\2\u0765\u0768\5\u0170\u00b9"+
		"\2\u0766\u0768\5\u0198\u00cd\2\u0767\u0765\3\2\2\2\u0767\u0766\3\2\2\2"+
		"\u0768\u076c\3\2\2\2\u0769\u076b\5\u016a\u00b6\2\u076a\u0769\3\2\2\2\u076b"+
		"\u076e\3\2\2\2\u076c\u076a\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u0163\3\2"+
		"\2\2\u076e\u076c\3\2\2\2\u076f\u078d\5\2\2\2\u0770\u0775\58\35\2\u0771"+
		"\u0772\7B\2\2\u0772\u0774\7C\2\2\u0773\u0771\3\2\2\2\u0774\u0777\3\2\2"+
		"\2\u0775\u0773\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0778\3\2\2\2\u0777\u0775"+
		"\3\2\2\2\u0778\u0779\7F\2\2\u0779\u077a\7\16\2\2\u077a\u078d\3\2\2\2\u077b"+
		"\u077c\7\65\2\2\u077c\u077d\7F\2\2\u077d\u078d\7\16\2\2\u077e\u078d\7"+
		"\60\2\2\u077f\u0780\58\35\2\u0780\u0781\7F\2\2\u0781\u0782\7\60\2\2\u0782"+
		"\u078d\3\2\2\2\u0783\u0784\7>\2\2\u0784\u0785\5\u01a0\u00d1\2\u0785\u0786"+
		"\7?\2\2\u0786\u078d\3\2\2\2\u0787\u078d\5\u0176\u00bc\2\u0788\u078d\5"+
		"\u017e\u00c0\2\u0789\u078d\5\u0184\u00c3\2\u078a\u078d\5\u018a\u00c6\2"+
		"\u078b\u078d\5\u0192\u00ca\2\u078c\u076f\3\2\2\2\u078c\u0770\3\2\2\2\u078c"+
		"\u077b\3\2\2\2\u078c\u077e\3\2\2\2\u078c\u077f\3\2\2\2\u078c\u0783\3\2"+
		"\2\2\u078c\u0787\3\2\2\2\u078c\u0788\3\2\2\2\u078c\u0789\3\2\2\2\u078c"+
		"\u078a\3\2\2\2\u078c\u078b\3\2\2\2\u078d\u0165\3\2\2\2\u078e\u078f\3\2"+
		"\2\2\u078f\u0167\3\2\2\2\u0790\u07ad\5\2\2\2\u0791\u0796\58\35\2\u0792"+
		"\u0793\7B\2\2\u0793\u0795\7C\2\2\u0794\u0792\3\2\2\2\u0795\u0798\3\2\2"+
		"\2\u0796\u0794\3\2\2\2\u0796\u0797\3\2\2\2\u0797\u0799\3\2\2\2\u0798\u0796"+
		"\3\2\2\2\u0799\u079a\7F\2\2\u079a\u079b\7\16\2\2\u079b\u07ad\3\2\2\2\u079c"+
		"\u079d\7\65\2\2\u079d\u079e\7F\2\2\u079e\u07ad\7\16\2\2\u079f\u07ad\7"+
		"\60\2\2\u07a0\u07a1\58\35\2\u07a1\u07a2\7F\2\2\u07a2\u07a3\7\60\2\2\u07a3"+
		"\u07ad\3\2\2\2\u07a4\u07a5\7>\2\2\u07a5\u07a6\5\u01a0\u00d1\2\u07a6\u07a7"+
		"\7?\2\2\u07a7\u07ad\3\2\2\2\u07a8\u07ad\5\u0176\u00bc\2\u07a9\u07ad\5"+
		"\u017e\u00c0\2\u07aa\u07ad\5\u018a\u00c6\2\u07ab\u07ad\5\u0192\u00ca\2"+
		"\u07ac\u0790\3\2\2\2\u07ac\u0791\3\2\2\2\u07ac\u079c\3\2\2\2\u07ac\u079f"+
		"\3\2\2\2\u07ac\u07a0\3\2\2\2\u07ac\u07a4\3\2\2\2\u07ac\u07a8\3\2\2\2\u07ac"+
		"\u07a9\3\2\2\2\u07ac\u07aa\3\2\2\2\u07ac\u07ab\3\2\2\2\u07ad\u0169\3\2"+
		"\2\2\u07ae\u07b4\5\u0178\u00bd\2\u07af\u07b4\5\u0180\u00c1\2\u07b0\u07b4"+
		"\5\u0186\u00c4\2\u07b1\u07b4\5\u018c\u00c7\2\u07b2\u07b4\5\u0194\u00cb"+
		"\2\u07b3\u07ae\3\2\2\2\u07b3\u07af\3\2\2\2\u07b3\u07b0\3\2\2\2\u07b3\u07b1"+
		"\3\2\2\2\u07b3\u07b2\3\2\2\2\u07b4\u016b\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6"+
		"\u016d\3\2\2\2\u07b7\u07bc\5\u0178\u00bd\2\u07b8\u07bc\5\u0180\u00c1\2"+
		"\u07b9\u07bc\5\u018c\u00c7\2\u07ba\u07bc\5\u0194\u00cb\2\u07bb\u07b7\3"+
		"\2\2\2\u07bb\u07b8\3\2\2\2\u07bb\u07b9\3\2\2\2\u07bb\u07ba\3\2\2\2\u07bc"+
		"\u016f\3\2\2\2\u07bd\u07e6\5\2\2\2\u07be\u07c3\58\35\2\u07bf\u07c0\7B"+
		"\2\2\u07c0\u07c2\7C\2\2\u07c1\u07bf\3\2\2\2\u07c2\u07c5\3\2\2\2\u07c3"+
		"\u07c1\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07c6\3\2\2\2\u07c5\u07c3\3\2"+
		"\2\2\u07c6\u07c7\7F\2\2\u07c7\u07c8\7\16\2\2\u07c8\u07e6\3\2\2\2\u07c9"+
		"\u07ce\5x=\2\u07ca\u07cb\7B\2\2\u07cb\u07cd\7C\2\2\u07cc\u07ca\3\2\2\2"+
		"\u07cd\u07d0\3\2\2\2\u07ce\u07cc\3\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u07d1"+
		"\3\2\2\2\u07d0\u07ce\3\2\2\2\u07d1\u07d2\7F\2\2\u07d2\u07d3\7\16\2\2\u07d3"+
		"\u07e6\3\2\2\2\u07d4\u07d5\7\65\2\2\u07d5\u07d6\7F\2\2\u07d6\u07e6\7\16"+
		"\2\2\u07d7\u07e6\7\60\2\2\u07d8\u07d9\58\35\2\u07d9\u07da\7F\2\2\u07da"+
		"\u07db\7\60\2\2\u07db\u07e6\3\2\2\2\u07dc\u07dd\7>\2\2\u07dd\u07de\5\u01a0"+
		"\u00d1\2\u07de\u07df\7?\2\2\u07df\u07e6\3\2\2\2\u07e0\u07e6\5\u017a\u00be"+
		"\2\u07e1\u07e6\5\u0182\u00c2\2\u07e2\u07e6\5\u0188\u00c5\2\u07e3\u07e6"+
		"\5\u018e\u00c8\2\u07e4\u07e6\5\u0196\u00cc\2\u07e5\u07bd\3\2\2\2\u07e5"+
		"\u07be\3\2\2\2\u07e5\u07c9\3\2\2\2\u07e5\u07d4\3\2\2\2\u07e5\u07d7\3\2"+
		"\2\2\u07e5\u07d8\3\2\2\2\u07e5\u07dc\3\2\2\2\u07e5\u07e0\3\2\2\2\u07e5"+
		"\u07e1\3\2\2\2\u07e5\u07e2\3\2\2\2\u07e5\u07e3\3\2\2\2\u07e5\u07e4\3\2"+
		"\2\2\u07e6\u0171\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u0173\3\2\2\2\u07e9"+
		"\u0811\5\2\2\2\u07ea\u07ef\58\35\2\u07eb\u07ec\7B\2\2\u07ec\u07ee\7C\2"+
		"\2\u07ed\u07eb\3\2\2\2\u07ee\u07f1\3\2\2\2\u07ef\u07ed\3\2\2\2\u07ef\u07f0"+
		"\3\2\2\2\u07f0\u07f2\3\2\2\2\u07f1\u07ef\3\2\2\2\u07f2\u07f3\7F\2\2\u07f3"+
		"\u07f4\7\16\2\2\u07f4\u0811\3\2\2\2\u07f5\u07fa\5x=\2\u07f6\u07f7\7B\2"+
		"\2\u07f7\u07f9\7C\2\2\u07f8\u07f6\3\2\2\2\u07f9\u07fc\3\2\2\2\u07fa\u07f8"+
		"\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u07fd\3\2\2\2\u07fc\u07fa\3\2\2\2\u07fd"+
		"\u07fe\7F\2\2\u07fe\u07ff\7\16\2\2\u07ff\u0811\3\2\2\2\u0800\u0801\7\65"+
		"\2\2\u0801\u0802\7F\2\2\u0802\u0811\7\16\2\2\u0803\u0811\7\60\2\2\u0804"+
		"\u0805\58\35\2\u0805\u0806\7F\2\2\u0806\u0807\7\60\2\2\u0807\u0811\3\2"+
		"\2\2\u0808\u0809\7>\2\2\u0809\u080a\5\u01a0\u00d1\2\u080a\u080b\7?\2\2"+
		"\u080b\u0811\3\2\2\2\u080c\u0811\5\u017a\u00be\2\u080d\u0811\5\u0182\u00c2"+
		"\2\u080e\u0811\5\u018e\u00c8\2\u080f\u0811\5\u0196\u00cc\2\u0810\u07e9"+
		"\3\2\2\2\u0810\u07ea\3\2\2\2\u0810\u07f5\3\2\2\2\u0810\u0800\3\2\2\2\u0810"+
		"\u0803\3\2\2\2\u0810\u0804\3\2\2\2\u0810\u0808\3\2\2\2\u0810\u080c\3\2"+
		"\2\2\u0810\u080d\3\2\2\2\u0810\u080e\3\2\2\2\u0810\u080f\3\2\2\2\u0811"+
		"\u0175\3\2\2\2\u0812\u0814\7$\2\2\u0813\u0815\5,\27\2\u0814\u0813\3\2"+
		"\2\2\u0814\u0815\3\2\2\2\u0815\u0819\3\2\2\2\u0816\u0818\5\u00e8u\2\u0817"+
		"\u0816\3\2\2\2\u0818\u081b\3\2\2\2\u0819\u0817\3\2\2\2\u0819\u081a\3\2"+
		"\2\2\u081a\u081c\3\2\2\2\u081b\u0819\3\2\2\2\u081c\u0827\7k\2\2\u081d"+
		"\u0821\7F\2\2\u081e\u0820\5\u00e8u\2\u081f\u081e\3\2\2\2\u0820\u0823\3"+
		"\2\2\2\u0821\u081f\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u0824\3\2\2\2\u0823"+
		"\u0821\3\2\2\2\u0824\u0826\7k\2\2\u0825\u081d\3\2\2\2\u0826\u0829\3\2"+
		"\2\2\u0827\u0825\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u082b\3\2\2\2\u0829"+
		"\u0827\3\2\2\2\u082a\u082c\5\u017c\u00bf\2\u082b\u082a\3\2\2\2\u082b\u082c"+
		"\3\2\2\2\u082c\u082d\3\2\2\2\u082d\u082f\7>\2\2\u082e\u0830\5\u0190\u00c9"+
		"\2\u082f\u082e\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u0833"+
		"\7?\2\2\u0832\u0834\5d\63\2\u0833\u0832\3\2\2\2\u0833\u0834\3\2\2\2\u0834"+
		"\u0866\3\2\2\2\u0835\u0836\5<\37\2\u0836\u0837\7F\2\2\u0837\u0839\7$\2"+
		"\2\u0838\u083a\5,\27\2\u0839\u0838\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083e"+
		"\3\2\2\2\u083b\u083d\5\u00e8u\2\u083c\u083b\3\2\2\2\u083d\u0840\3\2\2"+
		"\2\u083e\u083c\3\2\2\2\u083e\u083f\3\2\2\2\u083f\u0841\3\2\2\2\u0840\u083e"+
		"\3\2\2\2\u0841\u0843\7k\2\2\u0842\u0844\5\u017c\u00bf\2\u0843\u0842\3"+
		"\2\2\2\u0843\u0844\3\2\2\2\u0844\u0845\3\2\2\2\u0845\u0847\7>\2\2\u0846"+
		"\u0848\5\u0190\u00c9\2\u0847\u0846\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u0849"+
		"\3\2\2\2\u0849\u084b\7?\2\2\u084a\u084c\5d\63\2\u084b\u084a\3\2\2\2\u084b"+
		"\u084c\3\2\2\2\u084c\u0866\3\2\2\2\u084d\u084e\5\u0162\u00b2\2\u084e\u084f"+
		"\7F\2\2\u084f\u0851\7$\2\2\u0850\u0852\5,\27\2\u0851\u0850\3\2\2\2\u0851"+
		"\u0852\3\2\2\2\u0852\u0856\3\2\2\2\u0853\u0855\5\u00e8u\2\u0854\u0853"+
		"\3\2\2\2\u0855\u0858\3\2\2\2\u0856\u0854\3\2\2\2\u0856\u0857\3\2\2\2\u0857"+
		"\u0859\3\2\2\2\u0858\u0856\3\2\2\2\u0859\u085b\7k\2\2\u085a\u085c\5\u017c"+
		"\u00bf\2\u085b\u085a\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u085d\3\2\2\2\u085d"+
		"\u085f\7>\2\2\u085e\u0860\5\u0190\u00c9\2\u085f\u085e\3\2\2\2\u085f\u0860"+
		"\3\2\2\2\u0860\u0861\3\2\2\2\u0861\u0863\7?\2\2\u0862\u0864\5d\63\2\u0863"+
		"\u0862\3\2\2\2\u0863\u0864\3\2\2\2\u0864\u0866\3\2\2\2\u0865\u0812\3\2"+
		"\2\2\u0865\u0835\3\2\2\2\u0865\u084d\3\2\2\2\u0866\u0177\3\2\2\2\u0867"+
		"\u0868\7F\2\2\u0868\u086a\7$\2\2\u0869\u086b\5,\27\2\u086a\u0869\3\2\2"+
		"\2\u086a\u086b\3\2\2\2\u086b\u086f\3\2\2\2\u086c\u086e\5\u00e8u\2\u086d"+
		"\u086c\3\2\2\2\u086e\u0871\3\2\2\2\u086f\u086d\3\2\2\2\u086f\u0870\3\2"+
		"\2\2\u0870\u0872\3\2\2\2\u0871\u086f\3\2\2\2\u0872\u0874\7k\2\2\u0873"+
		"\u0875\5\u017c\u00bf\2\u0874\u0873\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0876"+
		"\3\2\2\2\u0876\u0878\7>\2\2\u0877\u0879\5\u0190\u00c9\2\u0878\u0877\3"+
		"\2\2\2\u0878\u0879\3\2\2\2\u0879\u087a\3\2\2\2\u087a\u087c\7?\2\2\u087b"+
		"\u087d\5d\63\2\u087c\u087b\3\2\2\2\u087c\u087d\3\2\2\2\u087d\u0179\3\2"+
		"\2\2\u087e\u0880\7$\2\2\u087f\u0881\5,\27\2\u0880\u087f\3\2\2\2\u0880"+
		"\u0881\3\2\2\2\u0881\u0885\3\2\2\2\u0882\u0884\5\u00e8u\2\u0883\u0882"+
		"\3\2\2\2\u0884\u0887\3\2\2\2\u0885\u0883\3\2\2\2\u0885\u0886\3\2\2\2\u0886"+
		"\u0888\3\2\2\2\u0887\u0885\3\2\2\2\u0888\u0893\7k\2\2\u0889\u088d\7F\2"+
		"\2\u088a\u088c\5\u00e8u\2\u088b\u088a\3\2\2\2\u088c\u088f\3\2\2\2\u088d"+
		"\u088b\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u0890\3\2\2\2\u088f\u088d\3\2"+
		"\2\2\u0890\u0892\7k\2\2\u0891\u0889\3\2\2\2\u0892\u0895\3\2\2\2\u0893"+
		"\u0891\3\2\2\2\u0893\u0894\3\2\2\2\u0894\u0897\3\2\2\2\u0895\u0893\3\2"+
		"\2\2\u0896\u0898\5\u017c\u00bf\2\u0897\u0896\3\2\2\2\u0897\u0898\3\2\2"+
		"\2\u0898\u0899\3\2\2\2\u0899\u089b\7>\2\2\u089a\u089c\5\u0190\u00c9\2"+
		"\u089b\u089a\3\2\2\2\u089b\u089c\3\2\2\2\u089c\u089d\3\2\2\2\u089d\u089f"+
		"\7?\2\2\u089e\u08a0\5d\63\2\u089f\u089e\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0"+
		"\u08ba\3\2\2\2\u08a1\u08a2\5<\37\2\u08a2\u08a3\7F\2\2\u08a3\u08a5\7$\2"+
		"\2\u08a4\u08a6\5,\27\2\u08a5\u08a4\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08aa"+
		"\3\2\2\2\u08a7\u08a9\5\u00e8u\2\u08a8\u08a7\3\2\2\2\u08a9\u08ac\3\2\2"+
		"\2\u08aa\u08a8\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08ad\3\2\2\2\u08ac\u08aa"+
		"\3\2\2\2\u08ad\u08af\7k\2\2\u08ae\u08b0\5\u017c\u00bf\2\u08af\u08ae\3"+
		"\2\2\2\u08af\u08b0\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1\u08b3\7>\2\2\u08b2"+
		"\u08b4\5\u0190\u00c9\2\u08b3\u08b2\3\2\2\2\u08b3\u08b4\3\2\2\2\u08b4\u08b5"+
		"\3\2\2\2\u08b5\u08b7\7?\2\2\u08b6\u08b8\5d\63\2\u08b7\u08b6\3\2\2\2\u08b7"+
		"\u08b8\3\2\2\2\u08b8\u08ba\3\2\2\2\u08b9\u087e\3\2\2\2\u08b9\u08a1\3\2"+
		"\2\2\u08ba\u017b\3\2\2\2\u08bb\u08bf\5,\27\2\u08bc\u08bd\7I\2\2\u08bd"+
		"\u08bf\7H\2\2\u08be\u08bb\3\2\2\2\u08be\u08bc\3\2\2\2\u08bf\u017d\3\2"+
		"\2\2\u08c0\u08c1\5\u0162\u00b2\2\u08c1\u08c2\7F\2\2\u08c2\u08c3\7k\2\2"+
		"\u08c3\u08ce\3\2\2\2\u08c4\u08c5\7-\2\2\u08c5\u08c6\7F\2\2\u08c6\u08ce"+
		"\7k\2\2\u08c7\u08c8\58\35\2\u08c8\u08c9\7F\2\2\u08c9\u08ca\7-\2\2\u08ca"+
		"\u08cb\7F\2\2\u08cb\u08cc\7k\2\2\u08cc\u08ce\3\2\2\2\u08cd\u08c0\3\2\2"+
		"\2\u08cd\u08c4\3\2\2\2\u08cd\u08c7\3\2\2\2\u08ce\u017f\3\2\2\2\u08cf\u08d0"+
		"\7F\2\2\u08d0\u08d1\7k\2\2\u08d1\u0181\3\2\2\2\u08d2\u08d3\7-\2\2\u08d3"+
		"\u08d4\7F\2\2\u08d4\u08dc\7k\2\2\u08d5\u08d6\58\35\2\u08d6\u08d7\7F\2"+
		"\2\u08d7\u08d8\7-\2\2\u08d8\u08d9\7F\2\2\u08d9\u08da\7k\2\2\u08da\u08dc"+
		"\3\2\2\2\u08db\u08d2\3\2\2\2\u08db\u08d5\3\2\2\2\u08dc\u0183\3\2\2\2\u08dd"+
		"\u08de\5<\37\2\u08de\u08df\7B\2\2\u08df\u08e0\5\u01a0\u00d1\2\u08e0\u08e1"+
		"\7C\2\2\u08e1\u08e8\3\2\2\2\u08e2\u08e3\5\u0168\u00b5\2\u08e3\u08e4\7"+
		"B\2\2\u08e4\u08e5\5\u01a0\u00d1\2\u08e5\u08e6\7C\2\2\u08e6\u08e8\3\2\2"+
		"\2\u08e7\u08dd\3\2\2\2\u08e7\u08e2\3\2\2\2\u08e8\u08f0\3\2\2\2\u08e9\u08ea"+
		"\5\u0166\u00b4\2\u08ea\u08eb\7B\2\2\u08eb\u08ec\5\u01a0\u00d1\2\u08ec"+
		"\u08ed\7C\2\2\u08ed\u08ef\3\2\2\2\u08ee\u08e9\3\2\2\2\u08ef\u08f2\3\2"+
		"\2\2\u08f0\u08ee\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u0185\3\2\2\2\u08f2"+
		"\u08f0\3\2\2\2\u08f3\u08f4\5\u016e\u00b8\2\u08f4\u08f5\7B\2\2\u08f5\u08f6"+
		"\5\u01a0\u00d1\2\u08f6\u08f7\7C\2\2\u08f7\u08ff\3\2\2\2\u08f8\u08f9\5"+
		"\u016c\u00b7\2\u08f9\u08fa\7B\2\2\u08fa\u08fb\5\u01a0\u00d1\2\u08fb\u08fc"+
		"\7C\2\2\u08fc\u08fe\3\2\2\2\u08fd\u08f8\3\2\2\2\u08fe\u0901\3\2\2\2\u08ff"+
		"\u08fd\3\2\2\2\u08ff\u0900\3\2\2\2\u0900\u0187\3\2\2\2\u0901\u08ff\3\2"+
		"\2\2\u0902\u0903\5<\37\2\u0903\u0904\7B\2\2\u0904\u0905\5\u01a0\u00d1"+
		"\2\u0905\u0906\7C\2\2\u0906\u090d\3\2\2\2\u0907\u0908\5\u0174\u00bb\2"+
		"\u0908\u0909\7B\2\2\u0909\u090a\5\u01a0\u00d1\2\u090a\u090b\7C\2\2\u090b"+
		"\u090d\3\2\2\2\u090c\u0902\3\2\2\2\u090c\u0907\3\2\2\2\u090d\u0915\3\2"+
		"\2\2\u090e\u090f\5\u0172\u00ba\2\u090f\u0910\7B\2\2\u0910\u0911\5\u01a0"+
		"\u00d1\2\u0911\u0912\7C\2\2\u0912\u0914\3\2\2\2\u0913\u090e\3\2\2\2\u0914"+
		"\u0917\3\2\2\2\u0915\u0913\3\2\2\2\u0915\u0916\3\2\2\2\u0916\u0189\3\2"+
		"\2\2\u0917\u0915\3\2\2\2\u0918\u0919\5> \2\u0919\u091b\7>\2\2\u091a\u091c"+
		"\5\u0190\u00c9\2\u091b\u091a\3\2\2\2\u091b\u091c\3\2\2\2\u091c\u091d\3"+
		"\2\2\2\u091d\u091e\7?\2\2\u091e\u095d\3\2\2\2\u091f\u0920\58\35\2\u0920"+
		"\u0922\7F\2\2\u0921\u0923\5,\27\2\u0922\u0921\3\2\2\2\u0922\u0923\3\2"+
		"\2\2\u0923\u0924\3\2\2\2\u0924\u0925\7k\2\2\u0925\u0927\7>\2\2\u0926\u0928"+
		"\5\u0190\u00c9\2\u0927\u0926\3\2\2\2\u0927\u0928\3\2\2\2\u0928\u0929\3"+
		"\2\2\2\u0929\u092a\7?\2\2\u092a\u095d\3\2\2\2\u092b\u092c\5<\37\2\u092c"+
		"\u092e\7F\2\2\u092d\u092f\5,\27\2\u092e\u092d\3\2\2\2\u092e\u092f\3\2"+
		"\2\2\u092f\u0930\3\2\2\2\u0930\u0931\7k\2\2\u0931\u0933\7>\2\2\u0932\u0934"+
		"\5\u0190\u00c9\2\u0933\u0932\3\2\2\2\u0933\u0934\3\2\2\2\u0934\u0935\3"+
		"\2\2\2\u0935\u0936\7?\2\2\u0936\u095d\3\2\2\2\u0937\u0938\5\u0162\u00b2"+
		"\2\u0938\u093a\7F\2\2\u0939\u093b\5,\27\2\u093a\u0939\3\2\2\2\u093a\u093b"+
		"\3\2\2\2\u093b\u093c\3\2\2\2\u093c\u093d\7k\2\2\u093d\u093f\7>\2\2\u093e"+
		"\u0940\5\u0190\u00c9\2\u093f\u093e\3\2\2\2\u093f\u0940\3\2\2\2\u0940\u0941"+
		"\3\2\2\2\u0941\u0942\7?\2\2\u0942\u095d\3\2\2\2\u0943\u0944\7-\2\2\u0944"+
		"\u0946\7F\2\2\u0945\u0947\5,\27\2\u0946\u0945\3\2\2\2\u0946\u0947\3\2"+
		"\2\2\u0947\u0948\3\2\2\2\u0948\u0949\7k\2\2\u0949\u094b\7>\2\2\u094a\u094c"+
		"\5\u0190\u00c9\2\u094b\u094a\3\2\2\2\u094b\u094c\3\2\2\2\u094c\u094d\3"+
		"\2\2\2\u094d\u095d\7?\2\2\u094e\u094f\58\35\2\u094f\u0950\7F\2\2\u0950"+
		"\u0951\7-\2\2\u0951\u0953\7F\2\2\u0952\u0954\5,\27\2\u0953\u0952\3\2\2"+
		"\2\u0953\u0954\3\2\2\2\u0954\u0955\3\2\2\2\u0955\u0956\7k\2\2\u0956\u0958"+
		"\7>\2\2\u0957\u0959\5\u0190\u00c9\2\u0958\u0957\3\2\2\2\u0958\u0959\3"+
		"\2\2\2\u0959\u095a\3\2\2\2\u095a\u095b\7?\2\2\u095b\u095d\3\2\2\2\u095c"+
		"\u0918\3\2\2\2\u095c\u091f\3\2\2\2\u095c\u092b";
	private static final String _serializedATNSegment1 =
		"\3\2\2\2\u095c\u0937\3\2\2\2\u095c\u0943\3\2\2\2\u095c\u094e\3\2\2\2\u095d"+
		"\u018b\3\2\2\2\u095e\u0960\7F\2\2\u095f\u0961\5,\27\2\u0960\u095f\3\2"+
		"\2\2\u0960\u0961\3\2\2\2\u0961\u0962\3\2\2\2\u0962\u0963\7k\2\2\u0963"+
		"\u0965\7>\2\2\u0964\u0966\5\u0190\u00c9\2\u0965\u0964\3\2\2\2\u0965\u0966"+
		"\3\2\2\2\u0966\u0967\3\2\2\2\u0967\u0968\7?\2\2\u0968\u018d\3\2\2\2\u0969"+
		"\u096a\5> \2\u096a\u096c\7>\2\2\u096b\u096d\5\u0190\u00c9\2\u096c\u096b"+
		"\3\2\2\2\u096c\u096d\3\2\2\2\u096d\u096e\3\2\2\2\u096e\u096f\7?\2\2\u096f"+
		"\u09a2\3\2\2\2\u0970\u0971\58\35\2\u0971\u0973\7F\2\2\u0972\u0974\5,\27"+
		"\2\u0973\u0972\3\2\2\2\u0973\u0974\3\2\2\2\u0974\u0975\3\2\2\2\u0975\u0976"+
		"\7k\2\2\u0976\u0978\7>\2\2\u0977\u0979\5\u0190\u00c9\2\u0978\u0977\3\2"+
		"\2\2\u0978\u0979\3\2\2\2\u0979\u097a\3\2\2\2\u097a\u097b\7?\2\2\u097b"+
		"\u09a2\3\2\2\2\u097c\u097d\5<\37\2\u097d\u097f\7F\2\2\u097e\u0980\5,\27"+
		"\2\u097f\u097e\3\2\2\2\u097f\u0980\3\2\2\2\u0980\u0981\3\2\2\2\u0981\u0982"+
		"\7k\2\2\u0982\u0984\7>\2\2\u0983\u0985\5\u0190\u00c9\2\u0984\u0983\3\2"+
		"\2\2\u0984\u0985\3\2\2\2\u0985\u0986\3\2\2\2\u0986\u0987\7?\2\2\u0987"+
		"\u09a2\3\2\2\2\u0988\u0989\7-\2\2\u0989\u098b\7F\2\2\u098a\u098c\5,\27"+
		"\2\u098b\u098a\3\2\2\2\u098b\u098c\3\2\2\2\u098c\u098d\3\2\2\2\u098d\u098e"+
		"\7k\2\2\u098e\u0990\7>\2\2\u098f\u0991\5\u0190\u00c9\2\u0990\u098f\3\2"+
		"\2\2\u0990\u0991\3\2\2\2\u0991\u0992\3\2\2\2\u0992\u09a2\7?\2\2\u0993"+
		"\u0994\58\35\2\u0994\u0995\7F\2\2\u0995\u0996\7-\2\2\u0996\u0998\7F\2"+
		"\2\u0997\u0999\5,\27\2\u0998\u0997\3\2\2\2\u0998\u0999\3\2\2\2\u0999\u099a"+
		"\3\2\2\2\u099a\u099b\7k\2\2\u099b\u099d\7>\2\2\u099c\u099e\5\u0190\u00c9"+
		"\2\u099d\u099c\3\2\2\2\u099d\u099e\3\2\2\2\u099e\u099f\3\2\2\2\u099f\u09a0"+
		"\7?\2\2\u09a0\u09a2\3\2\2\2\u09a1\u0969\3\2\2\2\u09a1\u0970\3\2\2\2\u09a1"+
		"\u097c\3\2\2\2\u09a1\u0988\3\2\2\2\u09a1\u0993\3\2\2\2\u09a2\u018f\3\2"+
		"\2\2\u09a3\u09a8\5\u01a0\u00d1\2\u09a4\u09a5\7E\2\2\u09a5\u09a7\5\u01a0"+
		"\u00d1\2\u09a6\u09a4\3\2\2\2\u09a7\u09aa\3\2\2\2\u09a8\u09a6\3\2\2\2\u09a8"+
		"\u09a9\3\2\2\2\u09a9\u0191\3\2\2\2\u09aa\u09a8\3\2\2\2\u09ab\u09ac\5<"+
		"\37\2\u09ac\u09ae\7_\2\2\u09ad\u09af\5,\27\2\u09ae\u09ad\3\2\2\2\u09ae"+
		"\u09af\3\2\2\2\u09af\u09b0\3\2\2\2\u09b0\u09b1\7k\2\2\u09b1\u09db\3\2"+
		"\2\2\u09b2\u09b3\5\16\b\2\u09b3\u09b5\7_\2\2\u09b4\u09b6\5,\27\2\u09b5"+
		"\u09b4\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7\u09b8\7k"+
		"\2\2\u09b8\u09db\3\2\2\2\u09b9\u09ba\5\u0162\u00b2\2\u09ba\u09bc\7_\2"+
		"\2\u09bb\u09bd\5,\27\2\u09bc\u09bb\3\2\2\2\u09bc\u09bd\3\2\2\2\u09bd\u09be"+
		"\3\2\2\2\u09be\u09bf\7k\2\2\u09bf\u09db\3\2\2\2\u09c0\u09c1\7-\2\2\u09c1"+
		"\u09c3\7_\2\2\u09c2\u09c4\5,\27\2\u09c3\u09c2\3\2\2\2\u09c3\u09c4\3\2"+
		"\2\2\u09c4\u09c5\3\2\2\2\u09c5\u09db\7k\2\2\u09c6\u09c7\58\35\2\u09c7"+
		"\u09c8\7F\2\2\u09c8\u09c9\7-\2\2\u09c9\u09cb\7_\2\2\u09ca\u09cc\5,\27"+
		"\2\u09cb\u09ca\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09cd\3\2\2\2\u09cd\u09ce"+
		"\7k\2\2\u09ce\u09db\3\2\2\2\u09cf\u09d0\5\22\n\2\u09d0\u09d2\7_\2\2\u09d1"+
		"\u09d3\5,\27\2\u09d2\u09d1\3\2\2\2\u09d2\u09d3\3\2\2\2\u09d3\u09d4\3\2"+
		"\2\2\u09d4\u09d5\7$\2\2\u09d5\u09db\3\2\2\2\u09d6\u09d7\5 \21\2\u09d7"+
		"\u09d8\7_\2\2\u09d8\u09d9\7$\2\2\u09d9\u09db\3\2\2\2\u09da\u09ab\3\2\2"+
		"\2\u09da\u09b2\3\2\2\2\u09da\u09b9\3\2\2\2\u09da\u09c0\3\2\2\2\u09da\u09c6"+
		"\3\2\2\2\u09da\u09cf\3\2\2\2\u09da\u09d6\3\2\2\2\u09db\u0193\3\2\2\2\u09dc"+
		"\u09de\7_\2\2\u09dd\u09df\5,\27\2\u09de\u09dd\3\2\2\2\u09de\u09df\3\2"+
		"\2\2\u09df\u09e0\3\2\2\2\u09e0\u09e1\7k\2\2\u09e1\u0195\3\2\2\2\u09e2"+
		"\u09e3\5<\37\2\u09e3\u09e5\7_\2\2\u09e4\u09e6\5,\27\2\u09e5\u09e4\3\2"+
		"\2\2\u09e5\u09e6\3\2\2\2\u09e6\u09e7\3\2\2\2\u09e7\u09e8\7k\2\2\u09e8"+
		"\u0a0b\3\2\2\2\u09e9\u09ea\5\16\b\2\u09ea\u09ec\7_\2\2\u09eb\u09ed\5,"+
		"\27\2\u09ec\u09eb\3\2\2\2\u09ec\u09ed\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee"+
		"\u09ef\7k\2\2\u09ef\u0a0b\3\2\2\2\u09f0\u09f1\7-\2\2\u09f1\u09f3\7_\2"+
		"\2\u09f2\u09f4\5,\27\2\u09f3\u09f2\3\2\2\2\u09f3\u09f4\3\2\2\2\u09f4\u09f5"+
		"\3\2\2\2\u09f5\u0a0b\7k\2\2\u09f6\u09f7\58\35\2\u09f7\u09f8\7F\2\2\u09f8"+
		"\u09f9\7-\2\2\u09f9\u09fb\7_\2\2\u09fa\u09fc\5,\27\2\u09fb\u09fa\3\2\2"+
		"\2\u09fb\u09fc\3\2\2\2\u09fc\u09fd\3\2\2\2\u09fd\u09fe\7k\2\2\u09fe\u0a0b"+
		"\3\2\2\2\u09ff\u0a00\5\22\n\2\u0a00\u0a02\7_\2\2\u0a01\u0a03\5,\27\2\u0a02"+
		"\u0a01\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u0a04\3\2\2\2\u0a04\u0a05\7$"+
		"\2\2\u0a05\u0a0b\3\2\2\2\u0a06\u0a07\5 \21\2\u0a07\u0a08\7_\2\2\u0a08"+
		"\u0a09\7$\2\2\u0a09\u0a0b\3\2\2\2\u0a0a\u09e2\3\2\2\2\u0a0a\u09e9\3\2"+
		"\2\2\u0a0a\u09f0\3\2\2\2\u0a0a\u09f6\3\2\2\2\u0a0a\u09ff\3\2\2\2\u0a0a"+
		"\u0a06\3\2\2\2\u0a0b\u0197\3\2\2\2\u0a0c\u0a0d\7$\2\2\u0a0d\u0a0e\5\6"+
		"\4\2\u0a0e\u0a10\5\u019a\u00ce\2\u0a0f\u0a11\5\"\22\2\u0a10\u0a0f\3\2"+
		"\2\2\u0a10\u0a11\3\2\2\2\u0a11\u0a23\3\2\2\2\u0a12\u0a13\7$\2\2\u0a13"+
		"\u0a14\5\20\t\2\u0a14\u0a16\5\u019a\u00ce\2\u0a15\u0a17\5\"\22\2\u0a16"+
		"\u0a15\3\2\2\2\u0a16\u0a17\3\2\2\2\u0a17\u0a23\3\2\2\2\u0a18\u0a19\7$"+
		"\2\2\u0a19\u0a1a\5\6\4\2\u0a1a\u0a1b\5\"\22\2\u0a1b\u0a1c\5\u00fa~\2\u0a1c"+
		"\u0a23\3\2\2\2\u0a1d\u0a1e\7$\2\2\u0a1e\u0a1f\5\20\t\2\u0a1f\u0a20\5\""+
		"\22\2\u0a20\u0a21\5\u00fa~\2\u0a21\u0a23\3\2\2\2\u0a22\u0a0c\3\2\2\2\u0a22"+
		"\u0a12\3\2\2\2\u0a22\u0a18\3\2\2\2\u0a22\u0a1d\3\2\2\2\u0a23\u0199\3\2"+
		"\2\2\u0a24\u0a28\5\u019c\u00cf\2\u0a25\u0a27\5\u019c\u00cf\2\u0a26\u0a25"+
		"\3\2\2\2\u0a27\u0a2a\3\2\2\2\u0a28\u0a26\3\2\2\2\u0a28\u0a29\3\2\2\2\u0a29"+
		"\u019b\3\2\2\2\u0a2a\u0a28\3\2\2\2\u0a2b\u0a2d\5\u00e8u\2\u0a2c\u0a2b"+
		"\3\2\2\2\u0a2d\u0a30\3\2\2\2\u0a2e\u0a2c\3\2\2\2\u0a2e\u0a2f\3\2\2\2\u0a2f"+
		"\u0a31\3\2\2\2\u0a30\u0a2e\3\2\2\2\u0a31\u0a32\7B\2\2\u0a32\u0a33\5\u01a0"+
		"\u00d1\2\u0a33\u0a34\7C\2\2\u0a34\u019d\3\2\2\2\u0a35\u0a36\5\u01a0\u00d1"+
		"\2\u0a36\u019f\3\2\2\2\u0a37\u0a3a\5\u01a2\u00d2\2\u0a38\u0a3a\5\u01aa"+
		"\u00d6\2\u0a39\u0a37\3\2\2\2\u0a39\u0a38\3\2\2\2\u0a3a\u01a1\3\2\2\2\u0a3b"+
		"\u0a3c\5\u01a4\u00d3\2\u0a3c\u0a3d\7^\2\2\u0a3d\u0a3e\5\u01a8\u00d5\2"+
		"\u0a3e\u01a3\3\2\2\2\u0a3f\u0a4a\7k\2\2\u0a40\u0a42\7>\2\2\u0a41\u0a43"+
		"\5\u0098M\2\u0a42\u0a41\3\2\2\2\u0a42\u0a43\3\2\2\2\u0a43\u0a44\3\2\2"+
		"\2\u0a44\u0a4a\7?\2\2\u0a45\u0a46\7>\2\2\u0a46\u0a47\5\u01a6\u00d4\2\u0a47"+
		"\u0a48\7?\2\2\u0a48\u0a4a\3\2\2\2\u0a49\u0a3f\3\2\2\2\u0a49\u0a40\3\2"+
		"\2\2\u0a49\u0a45\3\2\2\2\u0a4a\u01a5\3\2\2\2\u0a4b\u0a50\7k\2\2\u0a4c"+
		"\u0a4d\7E\2\2\u0a4d\u0a4f\7k\2\2\u0a4e\u0a4c\3\2\2\2\u0a4f\u0a52\3\2\2"+
		"\2\u0a50\u0a4e\3\2\2\2\u0a50\u0a51\3\2\2\2\u0a51\u01a7\3\2\2\2\u0a52\u0a50"+
		"\3\2\2\2\u0a53\u0a56\5\u01a0\u00d1\2\u0a54\u0a56\5\u00fe\u0080\2\u0a55"+
		"\u0a53\3\2\2\2\u0a55\u0a54\3\2\2\2\u0a56\u01a9\3\2\2\2\u0a57\u0a5a\5\u01b2"+
		"\u00da\2\u0a58\u0a5a\5\u01ac\u00d7\2\u0a59\u0a57\3\2\2\2\u0a59\u0a58\3"+
		"\2\2\2\u0a5a\u01ab\3\2\2\2\u0a5b\u0a5c\5\u01ae\u00d8\2\u0a5c\u0a5d\5\u01b0"+
		"\u00d9\2\u0a5d\u0a5e\5\u01a0\u00d1\2\u0a5e\u01ad\3\2\2\2\u0a5f\u0a63\5"+
		"<\37\2\u0a60\u0a63\5\u017e\u00c0\2\u0a61\u0a63\5\u0184\u00c3\2\u0a62\u0a5f"+
		"\3\2\2\2\u0a62\u0a60\3\2\2\2\u0a62\u0a61\3\2\2\2\u0a63\u01af\3\2\2\2\u0a64"+
		"\u0a65\t\5\2\2\u0a65\u01b1\3\2\2\2\u0a66\u0a6e\5\u01b4\u00db\2\u0a67\u0a68"+
		"\5\u01b4\u00db\2\u0a68\u0a69\7L\2\2\u0a69\u0a6a\5\u01a0\u00d1\2\u0a6a"+
		"\u0a6b\7M\2\2\u0a6b\u0a6c\5\u01b2\u00da\2\u0a6c\u0a6e\3\2\2\2\u0a6d\u0a66"+
		"\3\2\2\2\u0a6d\u0a67\3\2\2\2\u0a6e\u01b3\3\2\2\2\u0a6f\u0a70\b\u00db\1"+
		"\2\u0a70\u0a71\5\u01b6\u00dc\2\u0a71\u0a77\3\2\2\2\u0a72\u0a73\f\3\2\2"+
		"\u0a73\u0a74\7S\2\2\u0a74\u0a76\5\u01b6\u00dc\2\u0a75\u0a72\3\2\2\2\u0a76"+
		"\u0a79\3\2\2\2\u0a77\u0a75\3\2\2\2\u0a77\u0a78\3\2\2\2\u0a78\u01b5\3\2"+
		"\2\2\u0a79\u0a77\3\2\2\2\u0a7a\u0a7b\b\u00dc\1\2\u0a7b\u0a7c\5\u01b8\u00dd"+
		"\2\u0a7c\u0a82\3\2\2\2\u0a7d\u0a7e\f\3\2\2\u0a7e\u0a7f\7R\2\2\u0a7f\u0a81"+
		"\5\u01b8\u00dd\2\u0a80\u0a7d\3\2\2\2\u0a81\u0a84\3\2\2\2\u0a82\u0a80\3"+
		"\2\2\2\u0a82\u0a83\3\2\2\2\u0a83\u01b7\3\2\2\2\u0a84\u0a82\3\2\2\2\u0a85"+
		"\u0a86\b\u00dd\1\2\u0a86\u0a87\5\u01ba\u00de\2\u0a87\u0a8d\3\2\2\2\u0a88"+
		"\u0a89\f\3\2\2\u0a89\u0a8a\7[\2\2\u0a8a\u0a8c\5\u01ba\u00de\2\u0a8b\u0a88"+
		"\3\2\2\2\u0a8c\u0a8f\3\2\2\2\u0a8d\u0a8b\3\2\2\2\u0a8d\u0a8e\3\2\2\2\u0a8e"+
		"\u01b9\3\2\2\2\u0a8f\u0a8d\3\2\2\2\u0a90\u0a91\b\u00de\1\2\u0a91\u0a92"+
		"\5\u01bc\u00df\2\u0a92\u0a98\3\2\2\2\u0a93\u0a94\f\3\2\2\u0a94\u0a95\7"+
		"\\\2\2\u0a95\u0a97\5\u01bc\u00df\2\u0a96\u0a93\3\2\2\2\u0a97\u0a9a\3\2"+
		"\2\2\u0a98\u0a96\3\2\2\2\u0a98\u0a99\3\2\2\2\u0a99\u01bb\3\2\2\2\u0a9a"+
		"\u0a98\3\2\2\2\u0a9b\u0a9c\b\u00df\1\2\u0a9c\u0a9d\5\u01be\u00e0\2\u0a9d"+
		"\u0aa3\3\2\2\2\u0a9e\u0a9f\f\3\2\2\u0a9f\u0aa0\7Z\2\2\u0aa0\u0aa2\5\u01be"+
		"\u00e0\2\u0aa1\u0a9e\3\2\2\2\u0aa2\u0aa5\3\2\2\2\u0aa3\u0aa1\3\2\2\2\u0aa3"+
		"\u0aa4\3\2\2\2\u0aa4\u01bd\3\2\2\2\u0aa5\u0aa3\3\2\2\2\u0aa6\u0aa7\b\u00e0"+
		"\1\2\u0aa7\u0aa8\5\u01c0\u00e1\2\u0aa8\u0ab1\3\2\2\2\u0aa9\u0aaa\f\4\2"+
		"\2\u0aaa\u0aab\7N\2\2\u0aab\u0ab0\5\u01c0\u00e1\2\u0aac\u0aad\f\3\2\2"+
		"\u0aad\u0aae\7Q\2\2\u0aae\u0ab0\5\u01c0\u00e1\2\u0aaf\u0aa9\3\2\2\2\u0aaf"+
		"\u0aac\3\2\2\2\u0ab0\u0ab3\3\2\2\2\u0ab1\u0aaf\3\2\2\2\u0ab1\u0ab2\3\2"+
		"\2\2\u0ab2\u01bf\3\2\2\2\u0ab3\u0ab1\3\2\2\2\u0ab4\u0ab5\b\u00e1\1\2\u0ab5"+
		"\u0ab6\5\u01c2\u00e2\2\u0ab6\u0ac8\3\2\2\2\u0ab7\u0ab8\f\7\2\2\u0ab8\u0ab9"+
		"\7I\2\2\u0ab9\u0ac7\5\u01c2\u00e2\2\u0aba\u0abb\f\6\2\2\u0abb\u0abc\7"+
		"H\2\2\u0abc\u0ac7\5\u01c2\u00e2\2\u0abd\u0abe\f\5\2\2\u0abe\u0abf\7O\2"+
		"\2\u0abf\u0ac7\5\u01c2\u00e2\2\u0ac0\u0ac1\f\4\2\2\u0ac1\u0ac2\7P\2\2"+
		"\u0ac2\u0ac7\5\u01c2\u00e2\2\u0ac3\u0ac4\f\3\2\2\u0ac4\u0ac5\7\37\2\2"+
		"\u0ac5\u0ac7\5\16\b\2\u0ac6\u0ab7\3\2\2\2\u0ac6\u0aba\3\2\2\2\u0ac6\u0abd"+
		"\3\2\2\2\u0ac6\u0ac0\3\2\2\2\u0ac6\u0ac3\3\2\2\2\u0ac7\u0aca\3\2\2\2\u0ac8"+
		"\u0ac6\3\2\2\2\u0ac8\u0ac9\3\2\2\2\u0ac9\u01c1\3\2\2\2\u0aca\u0ac8\3\2"+
		"\2\2\u0acb\u0acc\b\u00e2\1\2\u0acc\u0acd\5\u01c4\u00e3\2\u0acd\u0add\3"+
		"\2\2\2\u0ace\u0acf\f\5\2\2\u0acf\u0ad0\7I\2\2\u0ad0\u0ad1\7I\2\2\u0ad1"+
		"\u0adc\5\u01c4\u00e3\2\u0ad2\u0ad3\f\4\2\2\u0ad3\u0ad4\7H\2\2\u0ad4\u0ad5"+
		"\7H\2\2\u0ad5\u0adc\5\u01c4\u00e3\2\u0ad6\u0ad7\f\3\2\2\u0ad7\u0ad8\7"+
		"H\2\2\u0ad8\u0ad9\7H\2\2\u0ad9\u0ada\7H\2\2\u0ada\u0adc\5\u01c4\u00e3"+
		"\2\u0adb\u0ace\3\2\2\2\u0adb\u0ad2\3\2\2\2\u0adb\u0ad6\3\2\2\2\u0adc\u0adf"+
		"\3\2\2\2\u0add\u0adb\3\2\2\2\u0add\u0ade\3\2\2\2\u0ade\u01c3\3\2\2\2\u0adf"+
		"\u0add\3\2\2\2\u0ae0\u0ae1\b\u00e3\1\2\u0ae1\u0ae2\5\u01c6\u00e4\2\u0ae2"+
		"\u0aeb\3\2\2\2\u0ae3\u0ae4\f\4\2\2\u0ae4\u0ae5\7V\2\2\u0ae5\u0aea\5\u01c6"+
		"\u00e4\2\u0ae6\u0ae7\f\3\2\2\u0ae7\u0ae8\7W\2\2\u0ae8\u0aea\5\u01c6\u00e4"+
		"\2\u0ae9\u0ae3\3\2\2\2\u0ae9\u0ae6\3\2\2\2\u0aea\u0aed\3\2\2\2\u0aeb\u0ae9"+
		"\3\2\2\2\u0aeb\u0aec\3\2\2\2\u0aec\u01c5\3\2\2\2\u0aed\u0aeb\3\2\2\2\u0aee"+
		"\u0aef\b\u00e4\1\2\u0aef\u0af0\5\u01c8\u00e5\2\u0af0\u0afc\3\2\2\2\u0af1"+
		"\u0af2\f\5\2\2\u0af2\u0af3\7X\2\2\u0af3\u0afb\5\u01c8\u00e5\2\u0af4\u0af5"+
		"\f\4\2\2\u0af5\u0af6\7Y\2\2\u0af6\u0afb\5\u01c8\u00e5\2\u0af7\u0af8\f"+
		"\3\2\2\u0af8\u0af9\7]\2\2\u0af9\u0afb\5\u01c8\u00e5\2\u0afa\u0af1\3\2"+
		"\2\2\u0afa\u0af4\3\2\2\2\u0afa\u0af7\3\2\2\2\u0afb\u0afe\3\2\2\2\u0afc"+
		"\u0afa\3\2\2\2\u0afc\u0afd\3\2\2\2\u0afd\u01c7\3\2\2\2\u0afe\u0afc\3\2"+
		"\2\2\u0aff\u0b07\5\u01ca\u00e6\2\u0b00\u0b07\5\u01cc\u00e7\2\u0b01\u0b02"+
		"\7V\2\2\u0b02\u0b07\5\u01c8\u00e5\2\u0b03\u0b04\7W\2\2\u0b04\u0b07\5\u01c8"+
		"\u00e5\2\u0b05\u0b07\5\u01ce\u00e8\2\u0b06\u0aff\3\2\2\2\u0b06\u0b00\3"+
		"\2\2\2\u0b06\u0b01\3\2\2\2\u0b06\u0b03\3\2\2\2\u0b06\u0b05\3\2\2\2\u0b07"+
		"\u01c9\3\2\2\2\u0b08\u0b09\7T\2\2\u0b09\u0b0a\5\u01c8\u00e5\2\u0b0a\u01cb"+
		"\3\2\2\2\u0b0b\u0b0c\7U\2\2\u0b0c\u0b0d\5\u01c8\u00e5\2\u0b0d\u01cd\3"+
		"\2\2\2\u0b0e\u0b15\5\u01d0\u00e9\2\u0b0f\u0b10\7K\2\2\u0b10\u0b15\5\u01c8"+
		"\u00e5\2\u0b11\u0b12\7J\2\2\u0b12\u0b15\5\u01c8\u00e5\2\u0b13\u0b15\5"+
		"\u01da\u00ee\2\u0b14\u0b0e\3\2\2\2\u0b14\u0b0f\3\2\2\2\u0b14\u0b11\3\2"+
		"\2\2\u0b14\u0b13\3\2\2\2\u0b15\u01cf\3\2\2\2\u0b16\u0b19\5\u0162\u00b2"+
		"\2\u0b17\u0b19\5<\37\2\u0b18\u0b16\3\2\2\2\u0b18\u0b17\3\2\2\2\u0b19\u0b1e"+
		"\3\2\2\2\u0b1a\u0b1d\5\u01d4\u00eb\2\u0b1b\u0b1d\5\u01d8\u00ed\2\u0b1c"+
		"\u0b1a\3\2\2\2\u0b1c\u0b1b\3\2\2\2\u0b1d\u0b20\3\2\2\2\u0b1e\u0b1c\3\2"+
		"\2\2\u0b1e\u0b1f\3\2\2\2\u0b1f\u01d1\3\2\2\2\u0b20\u0b1e\3\2\2\2\u0b21"+
		"\u0b22\5\u01d0\u00e9\2\u0b22\u0b23\7T\2\2\u0b23\u01d3\3\2\2\2\u0b24\u0b25"+
		"\7T\2\2\u0b25\u01d5\3\2\2\2\u0b26\u0b27\5\u01d0\u00e9\2\u0b27\u0b28\7"+
		"U\2\2\u0b28\u01d7\3\2\2\2\u0b29\u0b2a\7U\2\2\u0b2a\u01d9\3\2\2\2\u0b2b"+
		"\u0b2c\7>\2\2\u0b2c\u0b2d\5\6\4\2\u0b2d\u0b2e\7?\2\2\u0b2e\u0b2f\5\u01c8"+
		"\u00e5\2\u0b2f\u0b47\3\2\2\2\u0b30\u0b31\7>\2\2\u0b31\u0b35\5\16\b\2\u0b32"+
		"\u0b34\5*\26\2\u0b33\u0b32\3\2\2\2\u0b34\u0b37\3\2\2\2\u0b35\u0b33\3\2"+
		"\2\2\u0b35\u0b36\3\2\2\2\u0b36\u0b38\3\2\2\2\u0b37\u0b35\3\2\2\2\u0b38"+
		"\u0b39\7?\2\2\u0b39\u0b3a\5\u01ce\u00e8\2\u0b3a\u0b47\3\2\2\2\u0b3b\u0b3c"+
		"\7>\2\2\u0b3c\u0b40\5\16\b\2\u0b3d\u0b3f\5*\26\2\u0b3e\u0b3d\3\2\2\2\u0b3f"+
		"\u0b42\3\2\2\2\u0b40\u0b3e\3\2\2\2\u0b40\u0b41\3\2\2\2\u0b41\u0b43\3\2"+
		"\2\2\u0b42\u0b40\3\2\2\2\u0b43\u0b44\7?\2\2\u0b44\u0b45\5\u01a2\u00d2"+
		"\2\u0b45\u0b47\3\2\2\2\u0b46\u0b2b\3\2\2\2\u0b46\u0b30\3\2\2\2\u0b46\u0b3b"+
		"\3\2\2\2\u0b47\u01db\3\2\2\2\u0b48\u0b4c\5\u01e0\u00f1\2\u0b49\u0b4b\5"+
		"\u01e2\u00f2\2\u0b4a\u0b49\3\2\2\2\u0b4b\u0b4e\3\2\2\2\u0b4c\u0b4a\3\2"+
		"\2\2\u0b4c\u0b4d\3\2\2\2\u0b4d\u0b4f\3\2\2\2\u0b4e\u0b4c\3\2\2\2\u0b4f"+
		"\u0b50\5\u01e4\u00f3\2\u0b50\u0b53\3\2\2\2\u0b51\u0b53\5\u01de\u00f0\2"+
		"\u0b52\u0b48\3\2\2\2\u0b52\u0b51\3\2\2\2\u0b53\u01dd\3\2\2\2\u0b54\u0b55"+
		"\7I\2\2\u0b55\u0b59\5\u01e6\u00f4\2\u0b56\u0b58\5\u01e8\u00f5\2\u0b57"+
		"\u0b56\3\2\2\2\u0b58\u0b5b\3\2\2\2\u0b59\u0b57\3\2\2\2\u0b59\u0b5a\3\2"+
		"\2\2\u0b5a\u0b5c\3\2\2\2\u0b5b\u0b59\3\2\2\2\u0b5c\u0b5d\7\5\2\2\u0b5d"+
		"\u01df\3\2\2\2\u0b5e\u0b5f\7I\2\2\u0b5f\u0b63\5\u01e6\u00f4\2\u0b60\u0b62"+
		"\5\u01e8\u00f5\2\u0b61\u0b60\3\2\2\2\u0b62\u0b65\3\2\2\2\u0b63\u0b61\3"+
		"\2\2\2\u0b63\u0b64\3\2\2\2\u0b64\u0b66\3\2\2\2\u0b65\u0b63\3\2\2\2\u0b66"+
		"\u0b67\7H\2\2\u0b67\u01e1\3\2\2\2\u0b68\u0b6b\5\u01dc\u00ef\2\u0b69\u0b6b"+
		"\5\u01f2\u00fa\2\u0b6a\u0b68\3\2\2\2\u0b6a\u0b69\3\2\2\2\u0b6b\u01e3\3"+
		"\2\2\2\u0b6c\u0b6d\7\4\2\2\u0b6d\u0b6e\5\u01e6\u00f4\2\u0b6e\u0b6f\7H"+
		"\2\2\u0b6f\u01e5\3\2\2\2\u0b70\u0b71\7k\2\2\u0b71\u01e7\3\2\2\2\u0b72"+
		"\u0b73\5\u01f6\u00fc\2\u0b73\u0b74\7G\2\2\u0b74\u0b75\5\u01ea\u00f6\2"+
		"\u0b75\u01e9\3\2\2\2\u0b76\u0b7a\5\u01ec\u00f7\2\u0b77\u0b7a\5\u01ee\u00f8"+
		"\2\u0b78\u0b7a\5\u01f0\u00f9\2\u0b79\u0b76\3\2\2\2\u0b79\u0b77\3\2\2\2"+
		"\u0b79\u0b78\3\2\2\2\u0b7a\u01eb\3\2\2\2\u0b7b\u0b7c\7<\2\2\u0b7c\u01ed"+
		"\3\2\2\2\u0b7d\u0b82\7;\2\2\u0b7e\u0b7f\7\3\2\2\u0b7f\u0b80\7k\2\2\u0b80"+
		"\u0b82\7\3\2\2\u0b81\u0b7d\3\2\2\2\u0b81\u0b7e\3\2\2\2\u0b82\u01ef\3\2"+
		"\2\2\u0b83\u0b84\5\u01f2\u00fa\2\u0b84\u01f1\3\2\2\2\u0b85\u0b86\7@\2"+
		"\2\u0b86\u0b87\5\u01f4\u00fb\2\u0b87\u0b88\7A\2\2\u0b88\u01f3\3\2\2\2"+
		"\u0b89\u0b8b\5\u0100\u0081\2\u0b8a\u0b89\3\2\2\2\u0b8a\u0b8b\3\2\2\2\u0b8b"+
		"\u0b8e\3\2\2\2\u0b8c\u0b8e\5\u01c2\u00e2\2\u0b8d\u0b8a\3\2\2\2\u0b8d\u0b8c"+
		"\3\2\2\2\u0b8e\u01f5\3\2\2\2\u0b8f\u0b90\7k\2\2\u0b90\u01f7\3\2\2\2\u014f"+
		"\u01fc\u0201\u0208\u020c\u0210\u0219\u021d\u0221\u0223\u0229\u022e\u0235"+
		"\u023a\u023c\u0242\u0247\u024c\u0251\u025c\u026a\u026f\u0277\u027e\u0284"+
		"\u0289\u0294\u0297\u02a5\u02aa\u02af\u02b4\u02ba\u02c4\u02cc\u02d6\u02de"+
		"\u02ea\u02ee\u02f3\u02f9\u0301\u030a\u0315\u0332\u0336\u033b\u0341\u0344"+
		"\u0347\u0353\u035e\u036c\u0373\u037c\u0383\u0388\u0397\u039e\u03a4\u03a8"+
		"\u03ac\u03b0\u03b4\u03b9\u03bd\u03c1\u03c3\u03c8\u03cf\u03d4\u03d6\u03dc"+
		"\u03e1\u03e5\u03f8\u03fd\u040d\u0412\u0418\u041e\u0420\u0424\u0429\u042d"+
		"\u0434\u043b\u0443\u0446\u044b\u0453\u0458\u045f\u0466\u046b\u0471\u047d"+
		"\u0482\u0486\u0490\u0495\u049d\u04a0\u04a5\u04ad\u04b0\u04b5\u04ba\u04bf"+
		"\u04c4\u04cb\u04d0\u04d8\u04dd\u04e2\u04e7\u04ed\u04f3\u04f6\u04f9\u0502"+
		"\u0508\u050e\u0511\u0514\u051c\u0521\u0526\u052c\u052f\u053a\u0543\u054d"+
		"\u0552\u055d\u0562\u056e\u0573\u057f\u0589\u058e\u0596\u0599\u05a0\u05a8"+
		"\u05ae\u05b7\u05c1\u05c5\u05c8\u05d1\u05df\u05e2\u05eb\u05f0\u05f8\u05ff"+
		"\u0607\u0613\u061a\u0628\u063e\u0660\u066c\u0672\u067e\u068b\u06a5\u06a9"+
		"\u06ae\u06b2\u06b6\u06be\u06c2\u06c6\u06cd\u06d6\u06de\u06ed\u06f9\u06ff"+
		"\u0705\u071a\u071f\u0725\u0731\u073c\u0746\u0749\u074e\u0757\u075d\u0767"+
		"\u076c\u0775\u078c\u0796\u07ac\u07b3\u07bb\u07c3\u07ce\u07e5\u07ef\u07fa"+
		"\u0810\u0814\u0819\u0821\u0827\u082b\u082f\u0833\u0839\u083e\u0843\u0847"+
		"\u084b\u0851\u0856\u085b\u085f\u0863\u0865\u086a\u086f\u0874\u0878\u087c"+
		"\u0880\u0885\u088d\u0893\u0897\u089b\u089f\u08a5\u08aa\u08af\u08b3\u08b7"+
		"\u08b9\u08be\u08cd\u08db\u08e7\u08f0\u08ff\u090c\u0915\u091b\u0922\u0927"+
		"\u092e\u0933\u093a\u093f\u0946\u094b\u0953\u0958\u095c\u0960\u0965\u096c"+
		"\u0973\u0978\u097f\u0984\u098b\u0990\u0998\u099d\u09a1\u09a8\u09ae\u09b5"+
		"\u09bc\u09c3\u09cb\u09d2\u09da\u09de\u09e5\u09ec\u09f3\u09fb\u0a02\u0a0a"+
		"\u0a10\u0a16\u0a22\u0a28\u0a2e\u0a39\u0a42\u0a49\u0a50\u0a55\u0a59\u0a62"+
		"\u0a6d\u0a77\u0a82\u0a8d\u0a98\u0aa3\u0aaf\u0ab1\u0ac6\u0ac8\u0adb\u0add"+
		"\u0ae9\u0aeb\u0afa\u0afc\u0b06\u0b14\u0b18\u0b1c\u0b1e\u0b35\u0b40\u0b46"+
		"\u0b4c\u0b52\u0b59\u0b63\u0b6a\u0b79\u0b81\u0b8a\u0b8d";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}