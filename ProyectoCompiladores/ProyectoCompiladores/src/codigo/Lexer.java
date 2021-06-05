/* The following code was generated by JFlex 1.6.1 */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/ENRIQUE/Desktop/Tarea Compi/TERCER PARCIAL/ProyectoCompiladores/ProyectoCompiladores/src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\4\1\13\1\14\1\14\1\13\22\0\1\36\1\0\1\47"+
    "\3\0\1\2\1\0\1\50\1\51\1\46\1\45\1\41\1\5\1\6"+
    "\1\12\12\3\1\43\1\42\1\0\1\44\2\0\1\7\1\26\1\27"+
    "\1\25\1\31\1\24\1\23\1\40\1\17\1\15\2\10\1\22\1\21"+
    "\1\16\1\32\1\35\1\10\1\34\1\37\1\20\1\33\4\10\1\30"+
    "\4\0\1\1\1\0\26\10\1\11\3\10\1\0\1\4\10\0\1\14"+
    "\u1fa2\0\1\14\1\14\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\1\1\2"+
    "\1\6\11\2\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\2\5\0\1\2\1\4\15\2"+
    "\1\0\1\20\1\21\2\22\5\2\1\23\13\2\1\0"+
    "\10\2\1\24\7\2\1\25\14\2\1\26\3\2\1\0"+
    "\11\2\1\27\2\2\1\30\1\2\1\0\3\2\1\31"+
    "\10\2\2\0\1\32\2\2\1\33\2\2\1\34\1\2"+
    "\1\35\1\36\3\2\2\0\1\37\1\2\1\0\1\40"+
    "\1\41\3\2\2\0\1\42\1\0\1\2\1\43\1\44"+
    "\1\45\1\2\1\0\1\2\1\0\2\2\1\0\2\2"+
    "\1\46\1\47\1\50";

  private static int [] zzUnpackAction() {
    int [] result = new int[177];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\52\0\124\0\176\0\250\0\322\0\322\0\374"+
    "\0\u0126\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8\0\u0222\0\u024c"+
    "\0\u0276\0\u02a0\0\52\0\52\0\52\0\52\0\52\0\52"+
    "\0\52\0\52\0\52\0\u02ca\0\322\0\u02f4\0\u031e\0\u0348"+
    "\0\u0372\0\u039c\0\u03c6\0\u03f0\0\u041a\0\u0444\0\u046e\0\u0498"+
    "\0\u04c2\0\u04ec\0\u0516\0\u0540\0\u056a\0\u0594\0\u05be\0\u05e8"+
    "\0\u0612\0\52\0\u0348\0\u0372\0\u063c\0\u0666\0\u0690\0\u06ba"+
    "\0\u06e4\0\u070e\0\u05e8\0\u0738\0\u0762\0\u078c\0\u07b6\0\u07e0"+
    "\0\u080a\0\u0834\0\u085e\0\u0888\0\u08b2\0\u08dc\0\u0906\0\u0930"+
    "\0\u095a\0\u0984\0\u09ae\0\u09d8\0\u0a02\0\u0a2c\0\u0a56\0\u0a80"+
    "\0\u0aaa\0\u0ad4\0\u0afe\0\u0b28\0\u0b52\0\u0b7c\0\u0ba6\0\u0906"+
    "\0\u0bd0\0\u0bfa\0\u0c24\0\u0c4e\0\u0c78\0\u0ca2\0\u0ccc\0\u0cf6"+
    "\0\u0d20\0\u0d4a\0\u0d74\0\u0d9e\0\u0ba6\0\u0dc8\0\u0df2\0\u0e1c"+
    "\0\u0e46\0\u0e70\0\u0e9a\0\u0ec4\0\u0eee\0\u0f18\0\u0f42\0\u0f6c"+
    "\0\u0f96\0\u0fc0\0\u0e1c\0\u0fea\0\u1014\0\u0e1c\0\u103e\0\u1068"+
    "\0\u1092\0\u10bc\0\u10e6\0\u0e1c\0\u1110\0\u113a\0\u1164\0\u118e"+
    "\0\u11b8\0\u11e2\0\u120c\0\u1236\0\u1260\0\u128a\0\u0e1c\0\u12b4"+
    "\0\u12de\0\u0e1c\0\u1308\0\u1332\0\u0e1c\0\u135c\0\u0e1c\0\u0e1c"+
    "\0\u1386\0\u13b0\0\u13da\0\u1404\0\u142e\0\u0e1c\0\u1458\0\u1482"+
    "\0\u0e1c\0\u0e1c\0\u14ac\0\u14d6\0\u1500\0\u152a\0\u1554\0\u0e1c"+
    "\0\u157e\0\u15a8\0\u0e1c\0\u0e1c\0\52\0\52\0\u15d2\0\u15fc"+
    "\0\u1626\0\u1650\0\u167a\0\u16a4\0\u16ce\0\u16f8\0\52\0\u0e1c"+
    "\0\u0e1c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[177];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\2\1\4\1\5\1\6\1\7\1\2"+
    "\1\3\1\10\1\11\1\5\1\0\1\12\1\13\1\3"+
    "\1\14\1\3\1\15\1\16\1\17\1\20\1\21\6\3"+
    "\1\22\1\5\2\3\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\53\0\1\34\1\0\1\35"+
    "\1\0\2\35\1\36\2\34\3\0\21\34\1\37\2\34"+
    "\12\0\1\35\1\0\1\4\1\0\1\35\1\40\1\36"+
    "\2\35\3\0\21\35\1\0\2\35\15\0\1\5\6\0"+
    "\1\5\22\0\1\5\14\0\1\35\1\0\1\35\1\0"+
    "\2\35\1\36\2\35\3\0\21\35\1\0\2\35\12\0"+
    "\1\34\1\0\1\35\1\0\1\35\1\41\1\36\1\34"+
    "\1\42\3\0\21\34\1\37\2\34\23\0\1\43\40\0"+
    "\1\34\1\0\1\35\1\0\2\35\1\36\2\34\3\0"+
    "\1\34\1\44\2\34\1\45\14\34\1\37\2\34\12\0"+
    "\1\34\1\0\1\35\1\0\2\35\1\36\2\34\3\0"+
    "\7\34\1\46\11\34\1\37\2\34\12\0\1\34\1\0"+
    "\1\35\1\0\2\35\1\36\2\34\3\0\1\47\10\34"+
    "\1\50\7\34\1\37\2\34\12\0\1\34\1\0\1\35"+
    "\1\0\2\35\1\36\2\34\3\0\1\51\20\34\1\37"+
    "\2\34\12\0\1\34\1\0\1\35\1\0\2\35\1\36"+
    "\2\34\3\0\1\52\20\34\1\37\2\34\12\0\1\34"+
    "\1\0\1\35\1\0\2\35\1\36\2\34\3\0\1\34"+
    "\1\53\17\34\1\37\2\34\12\0\1\34\1\0\1\35"+
    "\1\0\2\35\1\36\2\34\3\0\16\34\1\54\2\34"+
    "\1\37\2\34\12\0\1\34\1\0\1\35\1\0\2\35"+
    "\1\36\2\34\3\0\1\34\1\55\3\34\1\56\13\34"+
    "\1\37\2\34\12\0\1\34\1\0\1\35\1\0\2\35"+
    "\1\36\2\34\3\0\11\34\1\57\7\34\1\37\2\34"+
    "\12\0\1\60\1\0\1\35\1\0\2\35\1\36\2\60"+
    "\3\0\21\60\1\0\2\60\12\0\1\61\1\0\1\61"+
    "\1\0\2\61\1\0\2\61\3\0\21\61\1\0\2\61"+
    "\12\0\1\62\6\0\2\62\3\0\21\62\1\0\2\62"+
    "\12\0\1\35\1\0\1\63\1\0\2\35\1\36\2\35"+
    "\3\0\21\35\1\0\2\35\12\0\1\64\1\65\1\35"+
    "\1\0\1\35\1\64\1\36\2\64\1\65\2\0\21\64"+
    "\1\0\2\64\12\0\1\60\1\0\1\35\1\0\1\35"+
    "\1\41\1\36\1\60\1\66\3\0\21\60\1\0\2\60"+
    "\11\0\13\43\2\0\35\43\1\0\1\60\1\0\1\35"+
    "\1\0\2\35\1\36\2\60\3\0\1\67\20\60\1\0"+
    "\2\60\12\0\1\60\1\0\1\35\1\0\2\35\1\36"+
    "\2\60\3\0\11\60\1\70\6\60\1\71\1\0\2\60"+
    "\12\0\1\60\1\0\1\35\1\0\2\35\1\36\2\60"+
    "\3\0\21\60\1\0\1\60\1\72\12\0\1\60\1\0"+
    "\1\35\1\0\2\35\1\36\2\60\3\0\3\60\1\73"+
    "\15\60\1\0\2\60\12\0\1\60\1\0\1\35\1\0"+
    "\2\35\1\36\2\60\3\0\12\60\1\74\6\60\1\0"+
    "\2\60\12\0\1\60\1\0\1\35\1\0\2\35\1\36"+
    "\2\60\3\0\21\60\1\0\1\75\1\60\12\0\1\60"+
    "\1\0\1\35\1\0\2\35\1\36\2\60\3\0\1\60"+
    "\1\76\3\60\1\77\13\60\1\0\2\60\12\0\1\60"+
    "\1\0\1\35\1\0\2\35\1\36\2\60\3\0\5\60"+
    "\1\100\2\60\1\101\10\60\1\0\2\60\12\0\1\60"+
    "\1\0\1\35\1\0\2\35\1\36\2\60\3\0\7\60"+
    "\1\102\11\60\1\0\2\60\12\0\1\60\1\0\1\35"+
    "\1\0\2\35\1\36\2\60\3\0\10\60\1\103\10\60"+
    "\1\0\2\60\12\0\1\60\1\0\1\35\1\0\2\35"+
    "\1\36\2\60\3\0\3\60\1\104\15\60\1\0\2\60"+
    "\12\0\1\60\1\0\1\35\1\0\2\35\1\36\2\60"+
    "\3\0\21\60\1\0\1\60\1\105\12\0\1\106\1\0"+
    "\1\35\1\0\2\35\1\36\2\106\3\0\21\106\1\0"+
    "\2\106\12\0\1\61\1\0\1\61\1\0\1\61\1\107"+
    "\1\0\2\61\3\0\21\61\1\0\2\61\12\0\2\65"+
    "\3\0\1\65\1\0\3\65\2\0\21\65\1\0\2\65"+
    "\12\0\1\106\1\0\1\35\1\0\1\35\1\41\1\36"+
    "\1\106\1\110\3\0\21\106\1\0\2\106\12\0\1\111"+
    "\1\0\1\35\1\0\2\35\1\36\2\106\3\0\21\106"+
    "\1\0\2\106\12\0\1\106\1\0\1\35\1\0\2\35"+
    "\1\36\2\106\3\0\21\106\1\0\1\106\1\112\12\0"+
    "\1\106\1\0\1\35\1\0\2\35\1\36\2\106\3\0"+
    "\17\106\1\113\1\106\1\0\2\106\12\0\1\106\1\0"+
    "\1\35\1\0\2\35\1\36\2\106\3\0\17\106\1\114"+
    "\1\106\1\0\2\106\12\0\1\106\1\0\1\35\1\0"+
    "\2\35\1\36\2\106\3\0\5\106\1\115\13\106\1\0"+
    "\2\106\12\0\1\106\1\0\1\35\1\0\2\35\1\36"+
    "\2\106\3\0\3\106\1\116\15\106\1\0\2\106\12\0"+
    "\1\117\1\0\1\35\1\0\2\35\1\36\2\106\3\0"+
    "\21\106\1\0\2\106\12\0\1\106\1\0\1\35\1\0"+
    "\2\35\1\36\2\106\3\0\11\106\1\120\7\106\1\0"+
    "\2\106\12\0\1\106\1\0\1\35\1\0\2\35\1\36"+
    "\2\106\3\0\11\106\1\121\7\106\1\0\2\106\12\0"+
    "\1\106\1\0\1\35\1\0\2\35\1\36\2\106\3\0"+
    "\11\106\1\122\7\106\1\0\2\106\12\0\1\106\1\0"+
    "\1\35\1\0\2\35\1\36\2\106\3\0\17\106\1\123"+
    "\1\106\1\0\2\106\12\0\1\106\1\0\1\35\1\0"+
    "\2\35\1\36\2\106\3\0\2\106\1\124\16\106\1\0"+
    "\2\106\12\0\1\106\1\0\1\35\1\0\2\35\1\36"+
    "\2\106\3\0\16\106\1\125\2\106\1\0\2\106\12\0"+
    "\1\106\1\0\1\35\1\0\2\35\1\36\2\106\3\0"+
    "\1\126\20\106\1\0\2\106\12\0\1\127\1\0\1\35"+
    "\1\0\2\35\1\36\2\127\3\0\21\127\1\0\2\127"+
    "\12\0\1\61\1\0\1\61\1\0\1\61\1\107\1\0"+
    "\2\130\3\0\21\130\1\0\2\130\12\0\1\127\1\0"+
    "\1\35\1\0\1\35\1\41\1\36\1\127\1\131\3\0"+
    "\21\127\1\0\2\127\12\0\1\127\1\0\1\35\1\0"+
    "\2\35\1\36\2\127\3\0\2\127\1\132\16\127\1\0"+
    "\2\127\12\0\1\127\1\0\1\35\1\0\2\35\1\36"+
    "\2\127\3\0\7\127\1\133\11\127\1\0\2\127\12\0"+
    "\1\127\1\0\1\35\1\0\2\35\1\36\2\127\3\0"+
    "\1\134\20\127\1\0\2\127\12\0\1\127\1\0\1\35"+
    "\1\0\2\35\1\36\2\127\3\0\1\135\20\127\1\0"+
    "\2\127\12\0\1\127\1\0\1\35\1\0\2\35\1\36"+
    "\2\127\3\0\11\127\1\136\7\127\1\0\2\127\12\0"+
    "\1\127\1\0\1\35\1\0\2\35\1\36\2\127\3\0"+
    "\11\127\1\137\7\127\1\0\2\127\12\0\1\127\1\0"+
    "\1\35\1\0\2\35\1\36\2\127\3\0\2\127\1\140"+
    "\16\127\1\0\2\127\12\0\1\141\1\0\1\35\1\0"+
    "\2\35\1\36\2\127\3\0\21\127\1\0\2\127\12\0"+
    "\1\127\1\0\1\35\1\0\2\35\1\36\2\127\3\0"+
    "\10\127\1\142\10\127\1\0\2\127\12\0\1\127\1\0"+
    "\1\35\1\0\2\35\1\36\2\127\3\0\12\127\1\143"+
    "\6\127\1\0\2\127\12\0\1\127\1\0\1\35\1\0"+
    "\2\35\1\36\2\127\3\0\20\127\1\144\1\0\2\127"+
    "\12\0\1\127\1\0\1\35\1\0\2\35\1\36\2\127"+
    "\3\0\15\127\1\145\3\127\1\0\2\127\12\0\1\127"+
    "\1\0\1\35\1\0\2\35\1\36\2\127\3\0\17\127"+
    "\1\146\1\127\1\0\2\127\12\0\1\127\1\0\1\35"+
    "\1\0\2\35\1\36\2\127\3\0\1\127\1\147\17\127"+
    "\1\0\2\127\12\0\1\150\1\0\1\35\1\0\2\35"+
    "\1\36\2\150\3\0\21\150\1\151\2\150\12\0\1\150"+
    "\1\0\1\35\1\0\1\35\1\41\1\36\1\150\1\152"+
    "\3\0\21\150\1\151\2\150\12\0\1\150\1\0\1\35"+
    "\1\0\2\35\1\36\2\150\3\0\3\150\1\153\15\150"+
    "\1\151\2\150\12\0\1\150\1\0\1\35\1\0\2\35"+
    "\1\36\2\150\3\0\1\150\1\154\17\150\1\151\2\150"+
    "\12\0\1\150\1\0\1\35\1\0\2\35\1\36\2\150"+
    "\3\0\4\150\1\155\14\150\1\151\2\150\12\0\1\150"+
    "\1\0\1\35\1\0\2\35\1\36\2\150\3\0\3\150"+
    "\1\156\15\150\1\151\2\150\12\0\1\157\1\0\1\35"+
    "\1\0\2\35\1\36\2\150\3\0\21\150\1\151\2\150"+
    "\12\0\1\160\1\0\1\35\1\0\2\35\1\36\2\150"+
    "\3\0\21\150\1\151\2\150\12\0\1\150\1\0\1\35"+
    "\1\0\2\35\1\36\2\150\3\0\3\150\1\161\15\150"+
    "\1\151\2\150\12\0\1\150\1\0\1\35\1\0\2\35"+
    "\1\36\2\150\3\0\6\150\1\162\12\150\1\151\2\150"+
    "\12\0\1\150\1\0\1\35\1\0\2\35\1\36\2\150"+
    "\3\0\7\150\1\163\11\150\1\151\2\150\12\0\1\150"+
    "\1\0\1\35\1\0\2\35\1\36\2\150\3\0\7\150"+
    "\1\164\11\150\1\151\2\150\12\0\1\150\1\0\1\35"+
    "\1\0\2\35\1\36\2\150\3\0\15\150\1\165\3\150"+
    "\1\151\2\150\12\0\1\150\1\0\1\35\1\0\2\35"+
    "\1\36\2\150\3\0\11\150\1\166\7\150\1\151\2\150"+
    "\12\0\1\150\1\0\1\35\1\0\2\35\1\36\2\150"+
    "\3\0\11\150\1\167\7\150\1\151\2\150\12\0\1\150"+
    "\1\0\1\35\1\0\2\35\1\36\2\150\3\0\21\150"+
    "\1\0\2\150\12\0\1\170\6\0\2\170\3\0\21\170"+
    "\1\0\2\170\12\0\1\150\1\0\1\35\1\0\1\35"+
    "\1\41\1\36\1\150\1\152\3\0\21\150\1\0\2\150"+
    "\12\0\1\150\1\0\1\35\1\0\2\35\1\36\2\150"+
    "\3\0\4\150\1\171\14\150\1\0\2\150\12\0\1\172"+
    "\1\0\1\35\1\0\2\35\1\36\2\150\3\0\21\150"+
    "\1\0\2\150\12\0\1\150\1\0\1\35\1\0\2\35"+
    "\1\36\2\150\3\0\1\173\20\150\1\0\2\150\12\0"+
    "\1\150\1\0\1\35\1\0\2\35\1\36\2\150\3\0"+
    "\11\150\1\174\7\150\1\0\2\150\12\0\1\150\1\0"+
    "\1\35\1\0\2\35\1\36\2\150\3\0\1\175\5\150"+
    "\1\176\12\150\1\0\2\150\12\0\1\150\1\0\1\35"+
    "\1\0\2\35\1\36\2\150\3\0\1\177\5\150\1\200"+
    "\12\150\1\0\2\150\12\0\1\150\1\0\1\35\1\0"+
    "\2\35\1\36\2\150\3\0\4\150\1\201\14\150\1\0"+
    "\2\150\12\0\1\150\1\0\1\35\1\0\2\35\1\36"+
    "\2\150\3\0\1\202\20\150\1\0\2\150\12\0\1\150"+
    "\1\0\1\35\1\0\2\35\1\36\2\150\3\0\13\150"+
    "\1\203\5\150\1\0\2\150\12\0\1\204\1\0\1\35"+
    "\1\0\2\35\1\36\2\150\3\0\21\150\1\0\2\150"+
    "\12\0\1\150\1\0\1\35\1\0\2\35\1\36\2\150"+
    "\3\0\21\150\1\205\2\150\12\0\1\206\6\0\2\206"+
    "\3\0\21\206\1\0\2\206\12\0\1\150\1\0\1\35"+
    "\1\0\2\35\1\36\2\150\3\0\5\150\1\207\13\150"+
    "\1\0\2\150\12\0\1\150\1\0\1\35\1\0\2\35"+
    "\1\36\2\150\3\0\1\210\5\150\1\211\12\150\1\0"+
    "\2\150\12\0\1\150\1\0\1\35\1\0\2\35\1\36"+
    "\2\150\3\0\17\150\1\212\1\150\1\0\2\150\12\0"+
    "\1\150\1\0\1\35\1\0\2\35\1\36\2\150\3\0"+
    "\1\150\1\213\17\150\1\0\2\150\12\0\1\150\1\0"+
    "\1\35\1\0\2\35\1\36\2\150\3\0\1\214\20\150"+
    "\1\0\2\150\12\0\1\150\1\0\1\35\1\0\2\35"+
    "\1\36\2\150\3\0\1\150\1\215\17\150\1\0\2\150"+
    "\12\0\1\150\1\0\1\35\1\0\2\35\1\36\2\150"+
    "\3\0\1\216\20\150\1\0\2\150\12\0\1\150\1\0"+
    "\1\35\1\0\2\35\1\36\2\150\3\0\5\150\1\217"+
    "\13\150\1\0\2\150\12\0\1\150\1\0\1\35\1\0"+
    "\2\35\1\36\2\150\3\0\1\150\1\220\17\150\1\0"+
    "\2\150\12\0\1\150\1\0\1\35\1\0\2\35\1\36"+
    "\2\150\3\0\11\150\1\221\7\150\1\0\2\150\12\0"+
    "\1\150\1\0\1\35\1\0\2\35\1\36\2\150\3\0"+
    "\1\222\5\150\1\223\12\150\1\0\2\150\44\0\1\224"+
    "\17\0\1\225\6\0\2\225\3\0\21\225\1\0\2\225"+
    "\12\0\1\150\1\0\1\35\1\0\2\35\1\36\2\150"+
    "\3\0\1\150\1\226\17\150\1\0\2\150\12\0\1\150"+
    "\1\0\1\35\1\0\2\35\1\36\2\150\3\0\1\227"+
    "\20\150\1\0\2\150\12\0\1\150\1\0\1\35\1\0"+
    "\2\35\1\36\2\150\3\0\21\150\1\230\2\150\12\0"+
    "\1\150\1\0\1\35\1\0\2\35\1\36\2\150\3\0"+
    "\1\150\1\231\17\150\1\0\2\150\12\0\1\150\1\0"+
    "\1\35\1\0\2\35\1\36\2\150\3\0\1\150\1\232"+
    "\17\150\1\0\2\150\12\0\1\150\1\0\1\35\1\0"+
    "\2\35\1\36\2\150\3\0\14\150\1\233\4\150\1\0"+
    "\2\150\12\0\1\150\1\0\1\35\1\0\2\35\1\36"+
    "\2\150\3\0\1\150\1\234\17\150\1\0\2\150\12\0"+
    "\1\150\1\0\1\35\1\0\2\35\1\36\2\150\3\0"+
    "\1\235\20\150\1\0\2\150\32\0\1\236\31\0\1\237"+
    "\6\0\2\237\3\0\21\237\1\0\2\237\12\0\1\150"+
    "\1\0\1\35\1\0\2\35\1\36\2\150\3\0\1\150"+
    "\1\240\17\150\1\0\2\150\40\0\1\241\23\0\1\150"+
    "\1\0\1\35\1\0\2\35\1\36\2\150\3\0\15\150"+
    "\1\242\3\150\1\0\2\150\12\0\1\150\1\0\1\35"+
    "\1\0\2\35\1\36\2\150\3\0\1\243\20\150\1\0"+
    "\2\150\12\0\1\150\1\0\1\35\1\0\2\35\1\36"+
    "\2\150\3\0\1\150\1\244\17\150\1\0\2\150\51\0"+
    "\1\245\12\0\1\246\6\0\2\246\3\0\21\246\1\0"+
    "\2\246\43\0\1\247\20\0\1\250\1\0\1\35\1\0"+
    "\2\35\1\36\2\150\3\0\21\150\1\0\2\150\45\0"+
    "\1\251\16\0\1\150\1\0\1\35\1\0\2\35\1\36"+
    "\2\150\3\0\1\252\5\150\1\253\12\150\1\0\2\150"+
    "\42\0\1\254\21\0\1\150\1\0\1\35\1\0\2\35"+
    "\1\36\2\150\3\0\1\150\1\255\17\150\1\0\2\150"+
    "\12\0\1\150\1\0\1\35\1\0\2\35\1\36\2\150"+
    "\3\0\1\256\20\150\1\0\2\150\35\0\1\257\26\0"+
    "\1\150\1\0\1\35\1\0\2\35\1\36\2\150\3\0"+
    "\1\260\20\150\1\0\2\150\12\0\1\150\1\0\1\35"+
    "\1\0\2\35\1\36\2\150\3\0\1\150\1\261\17\150"+
    "\1\0\2\150\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5922];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\20\1\11\11\1\1\5\0\17\1\1\0"+
    "\1\11\24\1\1\0\41\1\1\0\16\1\1\0\14\1"+
    "\2\0\15\1\2\0\2\1\1\0\5\1\2\0\1\1"+
    "\1\0\3\1\2\11\1\0\1\1\1\0\2\1\1\0"+
    "\2\1\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[177];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
   public String lexeme;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 160) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return ERROR;
            }
          case 41: break;
          case 2: 
            { lexeme=yytext(); return identificador;
            }
          case 42: break;
          case 3: 
            { lexeme=yytext(); return numero;
            }
          case 43: break;
          case 4: 
            { /*Ignore*/
            }
          case 44: break;
          case 5: 
            { lexeme=yytext(); return resta;
            }
          case 45: break;
          case 6: 
            { lexeme=yytext(); return division;
            }
          case 46: break;
          case 7: 
            { lexeme=yytext(); return coma;
            }
          case 47: break;
          case 8: 
            { lexeme=yytext(); return punto_coma;
            }
          case 48: break;
          case 9: 
            { lexeme=yytext(); return dos_puntos;
            }
          case 49: break;
          case 10: 
            { lexeme=yytext(); return igual;
            }
          case 50: break;
          case 11: 
            { lexeme=yytext(); return suma;
            }
          case 51: break;
          case 12: 
            { lexeme=yytext(); return multiplicacion;
            }
          case 52: break;
          case 13: 
            { lexeme=yytext(); return comillas;
            }
          case 53: break;
          case 14: 
            { lexeme=yytext(); return parentesis_a;
            }
          case 54: break;
          case 15: 
            { lexeme=yytext(); return parentesis_c;
            }
          case 55: break;
          case 16: 
            { lexeme=yytext(); return nombre;
            }
          case 56: break;
          case 17: 
            { lexeme=yytext(); return numero_real;
            }
          case 57: break;
          case 18: 
            { lexeme=yytext(); return web;
            }
          case 58: break;
          case 19: 
            { lexeme=yytext(); return titulo;
            }
          case 59: break;
          case 20: 
            { lexeme=yytext(); return filainicio;
            }
          case 60: break;
          case 21: 
            { lexeme=yytext(); return correo;
            }
          case 61: break;
          case 22: 
            { lexeme=yytext(); return ancho;
            }
          case 62: break;
          case 23: 
            { lexeme=yytext(); return enlace;
            }
          case 63: break;
          case 24: 
            { lexeme=yytext(); return altura;
            }
          case 64: break;
          case 25: 
            { lexeme=yytext(); return negrita;
            }
          case 65: break;
          case 26: 
            { lexeme=yytext(); return htmlinicio;
            }
          case 66: break;
          case 27: 
            { lexeme=yytext(); return imprimir;
            }
          case 67: break;
          case 28: 
            { lexeme=yytext(); return listainicio;
            }
          case 68: break;
          case 29: 
            { lexeme=yytext(); return htmlfin;
            }
          case 69: break;
          case 30: 
            { lexeme=yytext(); return filafin;
            }
          case 70: break;
          case 31: 
            { lexeme=yytext(); return imageninicio;
            }
          case 71: break;
          case 32: 
            { lexeme=yytext(); return tablafin;
            }
          case 72: break;
          case 33: 
            { lexeme=yytext(); return listafin;
            }
          case 73: break;
          case 34: 
            { lexeme=yytext(); return imagenfin;
            }
          case 74: break;
          case 35: 
            { lexeme=yytext(); return cuerpoinicio;
            }
          case 75: break;
          case 36: 
            { lexeme=yytext(); return cuerpofin ;
            }
          case 76: break;
          case 37: 
            { lexeme=yytext(); return pagina;
            }
          case 77: break;
          case 38: 
            { lexeme=yytext(); return tablainicio;
            }
          case 78: break;
          case 39: 
            { lexeme=yytext(); return encabezadoinicio;
            }
          case 79: break;
          case 40: 
            { lexeme=yytext(); return encabezadofin;
            }
          case 80: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
