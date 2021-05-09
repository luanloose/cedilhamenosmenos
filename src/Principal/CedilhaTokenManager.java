/* Generated By:JavaCC: Do not edit this line. CedilhaTokenManager.java */
package Principal;
import java.io.*;

/** Token Manager. */
public class CedilhaTokenManager implements CedilhaConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 45;
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 38:
         return jjStopAtPos(0, 43);
      case 40:
         return jjStopAtPos(0, 25);
      case 41:
         return jjStopAtPos(0, 26);
      case 42:
         return jjStopAtPos(0, 33);
      case 43:
         return jjStopAtPos(0, 31);
      case 44:
         return jjStopAtPos(0, 27);
      case 45:
         return jjStopAtPos(0, 32);
      case 46:
         return jjStopAtPos(0, 23);
      case 47:
         jjmatchedKind = 34;
         return jjMoveStringLiteralDfa1_0(0xc0L);
      case 59:
         return jjStopAtPos(0, 24);
      case 60:
         jjmatchedKind = 38;
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 61:
         jjmatchedKind = 36;
         return jjMoveStringLiteralDfa1_0(0x28000000000L);
      case 62:
         return jjStopAtPos(0, 37);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x402000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0xa0000L);
      case 77:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 86:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 94:
         return jjStopAtPos(0, 35);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 47:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      case 61:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         else if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(1, 42);
         break;
      case 62:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(1, 39);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x41000L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x4a0000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x218000L);
      case 124:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(1, 44);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 78:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x110000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x480000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 68:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x101000L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x88000L);
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x210000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 97:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(4, 16);
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0xe4000L);
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 118:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 70:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000L);
      case 97:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(5, 17);
         else if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(5, 21);
         break;
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000L);
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000L);
      case 111:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(5, 13);
         break;
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x180000L);
      case 115:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(6, 18);
         else if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(6, 20);
         else if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(6, 22);
         break;
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000L);
      case 111:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(6, 19);
         return jjMoveStringLiteralDfa7_0(active0, 0x1000L);
      case 115:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 81:
         return jjMoveStringLiteralDfa8_0(active0, 0x8000L);
      case 111:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(7, 14);
         break;
      case 114:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa9_0(active0, 0x1000L);
      case 117:
         return jjMoveStringLiteralDfa9_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(9, 15);
         break;
      case 115:
         return jjMoveStringLiteralDfa10_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 115:
         return jjMoveStringLiteralDfa11_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 111:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(11, 12);
         break;
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 7;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 29)
                        kind = 29;
                     jjCheckNAdd(2);
                  }
                  else if (curChar == 34)
                     jjCheckNAddStates(0, 2);
                  else if (curChar == 36)
                     jjCheckNAdd(1);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAdd(1);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAdd(2);
                  break;
               case 3:
                  if (curChar == 34)
                     jjCheckNAddStates(0, 2);
                  break;
               case 4:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 6:
                  if (curChar == 34 && kind > 30)
                     kind = 30;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x7fffffe00000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 4:
                  jjAddStates(0, 2);
                  break;
               case 5:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 4:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 7 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 10);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x100L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(1, 8);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   4, 5, 6, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, 
"\123\145\116\141\157\106\157\162\111\163\163\157", "\105\150\111\163\163\157", "\106\151\155\104\151\163\163\157", 
"\122\157\144\145\101\164\145\121\165\145", "\126\157\154\164\141", "\111\156\151\143\151\141", 
"\124\145\162\155\151\156\141", "\111\156\164\145\151\162\157", "\120\141\154\141\166\162\141", 
"\115\157\163\164\162\141", "\105\156\164\162\141\144\141", "\56", "\73", "\50", "\51", "\54", null, null, 
null, "\53", "\55", "\52", "\57", "\136", "\75", "\76", "\74", "\75\76", "\74\75", 
"\75\75", "\41\75", "\46", "\174\174", "\41", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "BLOCO_COMENTARIO",
   "LINHA_COMENTARIO",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, 1, 2, 0, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x3ffffffff001L, 
};
static final long[] jjtoSkip = {
   0xffeL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[7];
static private final int[] jjstateSet = new int[14];
static protected char curChar;
/** Constructor. */
public CedilhaTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public CedilhaTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 7; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 3 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while ((curChar < 64 && (0x100002600L & (1L << curChar)) != 0L) || 
                 (curChar >> 6) == 1 && (0x80000000L & (1L << (curChar & 077))) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 9)
       {
          jjmatchedKind = 9;
       }
       break;
     case 2:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_2();
       if (jjmatchedPos == 0 && jjmatchedKind > 11)
       {
          jjmatchedKind = 11;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}