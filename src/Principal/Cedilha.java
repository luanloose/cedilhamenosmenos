/* Generated By:JavaCC: Do not edit this line. Cedilha.java */
package Principal;
import java.io.*;
import java.util.*;

public class Cedilha implements CedilhaConstants {
        static public boolean erro = false;
        static HashMap<Simbolo> tab = new HashMap<Simbolo>();

        public static void main(String args[])  throws ParseException  {
                try {
                        Cedilha x = new Cedilha(new FileInputStream("main.\u00e7--"));
                        x.inicio();
                        System.out.println(tab);
                        //x.S(); 
                }
                catch(FileNotFoundException e) {
                        System.out.println("Arquivo n\u00e3o encontrado");
                }
        }

//JAVACODE void S()
//{
//	Token t;
//	do {
//		t = getNextToken();
//		System.out.println(tokenImage[t.kind]+"\t"+t.image);
//	}
//	while(t.kind != EOF);
//}
  static final public void inicio(List<Comando> lista) throws ParseException {
    jj_consume_token(INICIOPROG);
    corpo(lista);
    jj_consume_token(FIMPROG);
    jj_consume_token(0);
  }

  static final public void corpo(List<Comando> lista) throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUMEROS:
      case PALAVRAS:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      declaraVar();
    }
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case WHILE:
      case MOSTRA:
      case ENTRADA:
      case VARIAVEIS:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_2;
      }
      comandos(lista);
    }
      System.out.println(lista);
  }

  static final public void declaraVar() throws ParseException {
                      char tp;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMEROS:
      jj_consume_token(NUMEROS);
                     tp='n';
      break;
    case PALAVRAS:
      jj_consume_token(PALAVRAS);
                                            tp='s';
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    listaVar(tp);
    jj_consume_token(FIMLINHA);
  }

  static final public void listaVar(char tp) throws ParseException {
    itemListaVar(tp);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VIRGULA:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_3;
      }
      jj_consume_token(VIRGULA);
      itemListaVar(tp);
    }
  }

  static final public void itemListaVar(char tp) throws ParseException {
                              Simbolo simb; Token t; Expressao expressao; boolean tipoCerto;
    t = jj_consume_token(VARIAVEIS);
         //acao semantica para verificar se variavel ta sendo declarada pela segunda vez
                if(tabela.isExiste(t.image))
                        System.err.println("ERRO!\u005cn Erro Sem\u00e2ntico: A v\u00e1riavel \u005c"" + t.image + "\u005c" foi declarada mais de uma vez\u005cn");
                else{//a��o semantica para insercao na tabela de variaveis (insere variavel na tabela se ainda n�o foi declarada)
                        simb = new Simbolo(t.image, tp);
                        tabela.inclui(simb);
                }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ATRIB:
      jj_consume_token(ATRIB);
      expressao = exp();
                 //A��o sem�ntica para verificar se a v�riavel est� recebendo uma express�o compat�vel com seu tipo	
                        if(tp == 'n')
                                tipoCerto = expressao.isExpressaoNumerica(tabela);
                        else
                                tipoCerto = expressao.isExpressaoTexto();

                        if(!tipoCerto)
                                System.err.println("ERRO!\u005cn Erro Sem\u00e2ntico: O tipo da variavel \u005c"" + t.image + "\u005c" n\u00e3o \u00e9 compat\u00edvel com a express\u00e3o atribuida"+"\u005cn");
                 // A��o sem�ntica para incluir na tabela que variavel foi inicializada
                        tabela.inicializaIdent(t.image);
      break;
    default:
      jj_la1[4] = jj_gen;
      ;
    }
  }

  static final public void comandos(List<Comando> lista) throws ParseException {
                                      Comando comando = new Comando('A');Token t; Expressao expressao; boolean tipoCerto; boolean foiDeclarada=true;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VARIAVEIS:
      atribuicao(lista);
      break;
    case IF:
      SeNaoForIsso(lista);
      break;
    case WHILE:
      RodeAteQue(lista);
      break;
    case ENTRADA:
      Entrada(lista);
      break;
    case MOSTRA:
      Mostra(lista);
      break;
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void atribuicao(List<Comando> lista) throws ParseException {
                                        Comando comando = new Comando('A');Token t; Expressao expressao; boolean tipoCerto; boolean foiDeclarada=true;
    t = jj_consume_token(VARIAVEIS);
         comando.setRef1(t.image);
         // A��o sem�ntica para verificar se variavel foi declarada 
                if(!tabela.isExiste(t.image)){
                        System.err.println("ERRO!\u005cn Erro Semantico: A v\u00e1riavel \u005c"" + t.image + "\u005c" n\u00e3o foi declarada\u005cn");
                        foiDeclarada = false;
                }
    jj_consume_token(ATRIB);
    expressao = exp();
                comando.setRef2(expressao);
    jj_consume_token(FIMLINHA);
         //A��o sem�ntica para verificar se a v�riavel est� recebendo uma express�o compat�vel com seu tipo	
                if(foiDeclarada){
                        if(tabela.getSimbolo(t.image).getTipo() == 'n')
                                tipoCerto = expressao.isExpressaoNumerica(tabela);
                        else
                                tipoCerto = expressao.isExpressaoTexto();

                        if(!tipoCerto)
                        System.err.println("ERRO!\u005cn Erro Sem\u00e2ntico: O tipo da variavel \u005c"" + t.image + "\u005c" n\u00e3o \u00e9 compat\u00edvel com a express\u00e3o atribuida"+"\u005cn");
                }
         // A��o sem�ntica para incluir na tabela que variavel foi inicializada
                tabela.inicializaIdent(t.image);
                lista.add(comando);
  }

//O mesmo exp � usado para todos os comandos - A incompatibilidade de tipos ser� verificada depois
  static final public Expressao exp() throws ParseException {
                   Expressao listaExp = new Expressao();
    expAuxiliar(listaExp);
         {if (true) return listaExp;}
    throw new Error("Missing return statement in function");
  }

  static final public void expAuxiliar(Expressao listaExp) throws ParseException {
    termo(listaExp);
  }

  static final public void termo(Expressao listaExp) throws ParseException {
                                  Token t; Item item;
    termo1(listaExp);
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OU:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_4;
      }
      t = jj_consume_token(OU);
      termo1(listaExp);
                  //Depois que os dois termos da opera��o foram armazenados na lista, ent�o o operador � armazenado   
                        item = new Item('o', t.image);
                        listaExp.inclui(item);
    }
  }

  static final public void termo1(Expressao listaExp) throws ParseException {
                                   Token t; Item item;
    termo2(listaExp);
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case E:
        ;
        break;
      default:
        jj_la1[7] = jj_gen;
        break label_5;
      }
      t = jj_consume_token(E);
      termo2(listaExp);
                        item = new Item('o', t.image);
                        listaExp.inclui(item);
    }
  }

  static final public void termo2(Expressao listaExp) throws ParseException {
                                   Token t; Item item;
    termo3(listaExp);
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MAIOR:
      case MENOR:
      case MAIORIGUAL:
      case MENORIGUAL:
      case IGUAL:
      case DIFERENTE:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_6;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MAIOR:
        t = jj_consume_token(MAIOR);
        break;
      case MENOR:
        t = jj_consume_token(MENOR);
        break;
      case MAIORIGUAL:
        t = jj_consume_token(MAIORIGUAL);
        break;
      case MENORIGUAL:
        t = jj_consume_token(MENORIGUAL);
        break;
      case DIFERENTE:
        t = jj_consume_token(DIFERENTE);
        break;
      case IGUAL:
        t = jj_consume_token(IGUAL);
        break;
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      termo3(listaExp);
                        item = new Item('o', t.image);
                        listaExp.inclui(item);
    }
  }

  static final public void termo3(Expressao listaExp) throws ParseException {
                                    Token t; Item item;
    termo4(listaExp);
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MAIS:
      case MENOS:
        ;
        break;
      default:
        jj_la1[10] = jj_gen;
        break label_7;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MAIS:
        t = jj_consume_token(MAIS);
        termo4(listaExp);
                 //Se��o 9.5 - Otimiza a expressao (otimizaExp � para calculos envolvendo constantes (5+4+a==9+a), 
                 //tambem � verificado a existencia de elementos neutro e tem o adicional de otimizacao de string("ab"+"c"="abc"))
                 //O operador s� ser� inserido se n�o for possivel nenhuma das otimiza��es 
                        if(!listaExp.otimizaExpressao('+') && !listaExp.otimizaString()){
                                item = new Item('o', t.image);
                                listaExp.inclui(item);
                        }
        break;
      case MENOS:
        t = jj_consume_token(MENOS);
        termo4(listaExp);
                        if(!listaExp.otimizaExpressao('-')){
                                item = new Item('o', t.image);
                                listaExp.inclui(item);
                        }
        break;
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void termo4(Expressao listaExp) throws ParseException {
                                    Token t; Item item;
    termo5(listaExp);
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MULTIPLICACAO:
      case DIVISAO:
        ;
        break;
      default:
        jj_la1[12] = jj_gen;
        break label_8;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MULTIPLICACAO:
        t = jj_consume_token(MULTIPLICACAO);
        termo5(listaExp);
                        if(!listaExp.otimizaExpressao('*')){
                                item = new Item('o', t.image);
                                listaExp.inclui(item);
                        }
        break;
      case DIVISAO:
        t = jj_consume_token(DIVISAO);
        termo5(listaExp);
                        if(!listaExp.otimizaExpressao('/')){
                                item = new Item('o', t.image);
                                listaExp.inclui(item);
                        }
        break;
      default:
        jj_la1[13] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void termo5(Expressao listaExp) throws ParseException {
                                    Token t; Item item;
    termo6(listaExp);
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case POTENCIA:
        ;
        break;
      default:
        jj_la1[14] = jj_gen;
        break label_9;
      }
      t = jj_consume_token(POTENCIA);
      termo5(listaExp);
                        if(!listaExp.otimizaExpressao('^')){
                                item = new Item('o', t.image);
                                listaExp.inclui(item);
                        }
    }
  }

  static final public void termo6(Expressao listaExp) throws ParseException {
                                    Token t=null; Item item; int cont_OP_NOT=0;
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NAO:
        ;
        break;
      default:
        jj_la1[15] = jj_gen;
        break label_10;
      }
      t = jj_consume_token(NAO);
                   cont_OP_NOT++;
    }
    termo7(listaExp);
         // Se n�o tiver nenhum operador not n�o tem nehum operador a armazenar
                if(t != null && (cont_OP_NOT % 2 != 0)){
                        item = new Item('o', t.image);
                        listaExp.inclui(item);
                }
  }

  static final public void termo7(Expressao listaExp) throws ParseException {
                                   Token t, t_aux=null; Item item; String num;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMEROS:
    case MAIS:
    case MENOS:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MAIS:
      case MENOS:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case MENOS:
          t_aux = jj_consume_token(MENOS);
          break;
        case MAIS:
          t_aux = jj_consume_token(MAIS);
          break;
        default:
          jj_la1[16] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
      default:
        jj_la1[17] = jj_gen;
        ;
      }
      t = jj_consume_token(NUMEROS);
           // t_aux pode n�o ter pois � opicional o sinal a frente do numero
                if(t_aux != null)
                        num = t_aux.image + t.image;
                else
                        num = t.image;
            item = new Item('n', num);
        listaExp.inclui(item);
      break;
    case VARIAVEIS:
      t = jj_consume_token(VARIAVEIS);
           // Verifica se foi declarado
                if(!tabela.isExiste(t.image))
                        System.err.println("ERRO!\u005cn Erro Semantico: A v\u00e1riavel \u005c"" + t.image + "\u005c" n\u00e3o foi declarada\u005cn");
           //Verifica se foi inicializado
                if(!tabela.foiInicializado(t.image))
                        System.err.println("ERRO!\u005cn Erro Semantico: A v\u00e1riavel \u005c"" + t.image + "\u005c" n\u00e3o foi inicializada\u005cn");
           // Armazena na lista		
                item = new Item('v', t.image);
        listaExp.inclui(item);
      break;
    case PALAVRAS:
      t = jj_consume_token(PALAVRAS);
                item = new Item('s', t.image);
        listaExp.inclui(item);
      break;
    case PARENTESQ:
      jj_consume_token(PARENTESQ);
      expAuxiliar(listaExp);
      jj_consume_token(PARENTDIR);
      break;
    default:
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void SeNaoForIsso(List<Comando> lista) throws ParseException {
                                          LinkedList<Comando> listaSe = new LinkedList<Comando>();Comando se = new Comando('S');Expressao expressao;
    jj_consume_token(IF);
    jj_consume_token(PARENTESQ);
    expressao = exp();
         se.setRef1(expressao);

        //Verifica se a expressao utilizada na condicao � compativel
        if(!expressao.isExpressaoCondicional(tabela))
                System.err.println("ERRO!\u005cn Erro Sem\u00e2ntico: A condi\u00e7\u00e3o utilizada na estrutura se(){} n\u00e3o \u00e9 compat\u00edvel\u005cn");
    jj_consume_token(PARENTDIR);
    label_11:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case WHILE:
      case MOSTRA:
      case ENTRADA:
      case VARIAVEIS:
        ;
        break;
      default:
        jj_la1[19] = jj_gen;
        break label_11;
      }
      comandos(listaSe);
    }
                se.setRef2(listaSe);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ELSE:
      EhIsso(lista,se);
      break;
    default:
      jj_la1[20] = jj_gen;
      ;
    }
                lista.add(se);
  }

  static final public void EhIsso(List<Comando> lista,Comando se) throws ParseException {
                                               LinkedList<Comando> listaSenao = new LinkedList<Comando>();
    jj_consume_token(ELSE);
    label_12:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case WHILE:
      case MOSTRA:
      case ENTRADA:
      case VARIAVEIS:
        ;
        break;
      default:
        jj_la1[21] = jj_gen;
        break label_12;
      }
      comandos(listaSenao);
    }
                se.setRef3(listaSenao);
    jj_consume_token(FIMIF);
  }

  static final public void RodeAteQue(List<Comando> lista) throws ParseException {
                                        LinkedList<Comando> listaEnquanto = new LinkedList<Comando>();Comando enquanto = new Comando('E');Expressao expressao;
    jj_consume_token(WHILE);
    jj_consume_token(PARENTESQ);
    expressao = exp();
                enquanto.setRef1(expressao);

                //Verifica se a expressao utilizada na condicao � compativel
                if(!expressao.isExpressaoCondicional(tabela))
                        System.err.println("ERRO!\u005cn Erro Sem\u00e2ntico: A condi\u00e7\u00e3o utilizada na estrutura enquanto(){} n\u00e3o \u00e9 compat\u00edvel\u005cn");
    jj_consume_token(PARENTDIR);
    label_13:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case WHILE:
      case MOSTRA:
      case ENTRADA:
      case VARIAVEIS:
        ;
        break;
      default:
        jj_la1[22] = jj_gen;
        break label_13;
      }
      comandos(listaEnquanto);
    }
                enquanto.setRef2(listaEnquanto);
                lista.add(enquanto);
    jj_consume_token(FIMWHILE);
  }

  static final public void Entrada(List<Comando> lista) throws ParseException {
    jj_consume_token(ENTRADA);
    jj_consume_token(PARENTESQ);
    corpoEntrada(lista);
    jj_consume_token(PARENTDIR);
    jj_consume_token(FIMLINHA);
  }

  static final public void corpoEntrada(List<Comando> lista) throws ParseException {
                                          Comando comandoImprime = new Comando('I');Comando comandoLeia = new Comando('L');Token t;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PALAVRAS:
      t = jj_consume_token(PALAVRAS);
      jj_consume_token(VIRGULA);
                 comandoImprime.setRef1(t.image);
                 lista.add(comandoImprime);
      break;
    default:
      jj_la1[23] = jj_gen;
      ;
    }
    t = jj_consume_token(VARIAVEIS);
                comandoLeia.setRef1(t.image);
                lista.add(comandoLeia);
                if(!tabela.isExiste(t.image))
                        System.err.println("ERRO!\u005cn Erro Semantico: A v\u00e1riavel \u005c"" + t.image + "\u005c" n\u00e3o foi declarada\u005cn");
      // A��o sem�ntica para incluir na tabela que variavel foi inicializada
                tabela.inicializaIdent(t.image);
    label_14:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VIRGULA:
        ;
        break;
      default:
        jj_la1[24] = jj_gen;
        break label_14;
      }
      jj_consume_token(VIRGULA);
      t = jj_consume_token(VARIAVEIS);
                    comandoLeia.setRef1(t.image);
                    lista.add(comandoLeia);
                if(!tabela.isExiste(t.image))
                                System.err.println("ERRO!\u005cn Erro Semantico: A v\u00e1riavel \u005c"" + t.image + "\u005c" n\u00e3o foi declarada\u005cn");
         // A��o sem�ntica para incluir na tabela que variavel foi inicializada
                        tabela.inicializaIdent(t.image);
    }
  }

  static final public void Mostra(List<Comando> lista) throws ParseException {
                                    Expressao expressao;
    jj_consume_token(MOSTRA);
    jj_consume_token(PARENTESQ);
    corpoMostra(lista);
    jj_consume_token(PARENTDIR);
    jj_consume_token(FIMLINHA);
  }

  static final public void corpoMostra(List<Comando> lista) throws ParseException {
                                         Expressao expressao;Comando comandoExibe = new Comando('I');Token t;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PALAVRAS:
      t = jj_consume_token(PALAVRAS);
      jj_consume_token(VIRGULA);
           comandoExibe.setRef1(t.image);
               lista.add(comandoExibe);
      break;
    default:
      jj_la1[25] = jj_gen;
      ;
    }
    expressao = exp();
                if(!expressao.isExpressaoTexto())
                        System.err.println("ERRO!\u005cn Erro Sem\u00e2ntico: A express\u00e3o utilizada na estrutura exibe() n\u00e3o \u00e9 compat\u00edvel\u005cn");

                comandoExibe.setRef1(expressao);
                lista.add(comandoExibe);
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public CedilhaTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[26];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x60000000,0x10609000,0x60000000,0x8000000,0x0,0x10609000,0x0,0x0,0x0,0x0,0x80000000,0x80000000,0x0,0x0,0x0,0x0,0x80000000,0x80000000,0xf2000000,0x10609000,0x2000,0x10609000,0x10609000,0x40000000,0x8000000,0x40000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x10,0x0,0x1000,0x800,0x7e0,0x7e0,0x1,0x1,0x6,0x6,0x8,0x2000,0x1,0x1,0x1,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }

  /** Constructor with InputStream. */
  public Cedilha(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Cedilha(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new CedilhaTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 26; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 26; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Cedilha(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new CedilhaTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 26; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 26; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Cedilha(CedilhaTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 26; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(CedilhaTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 26; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[46];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 26; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 46; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
