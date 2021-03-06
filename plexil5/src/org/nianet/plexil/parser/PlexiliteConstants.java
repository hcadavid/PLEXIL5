/* Generated By:JavaCC: Do not edit this line. PlexiliteConstants.java */
package org.nianet.plexil.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface PlexiliteConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int PIPE = 5;
  /** RegularExpression Id. */
  int LBRA = 6;
  /** RegularExpression Id. */
  int RBRA = 7;
  /** RegularExpression Id. */
  int LSQR = 8;
  /** RegularExpression Id. */
  int RSQU = 9;
  /** RegularExpression Id. */
  int CTDL = 10;
  /** RegularExpression Id. */
  int QUOT = 11;
  /** RegularExpression Id. */
  int ENTL = 12;
  /** RegularExpression Id. */
  int LPAR = 13;
  /** RegularExpression Id. */
  int RPAR = 14;
  /** RegularExpression Id. */
  int LT = 15;
  /** RegularExpression Id. */
  int GT = 16;
  /** RegularExpression Id. */
  int LE = 17;
  /** RegularExpression Id. */
  int GE = 18;
  /** RegularExpression Id. */
  int PLUS = 19;
  /** RegularExpression Id. */
  int MINUS = 20;
  /** RegularExpression Id. */
  int TIMES = 21;
  /** RegularExpression Id. */
  int DIV = 22;
  /** RegularExpression Id. */
  int QUOTE = 23;
  /** RegularExpression Id. */
  int COLON = 24;
  /** RegularExpression Id. */
  int CMND = 25;
  /** RegularExpression Id. */
  int CMNDINFO = 26;
  /** RegularExpression Id. */
  int NODE = 27;
  /** RegularExpression Id. */
  int NAME = 28;
  /** RegularExpression Id. */
  int LIST = 29;
  /** RegularExpression Id. */
  int RCMD = 30;
  /** RegularExpression Id. */
  int ASGN = 31;
  /** RegularExpression Id. */
  int EMTY = 32;
  /** RegularExpression Id. */
  int MEMO = 33;
  /** RegularExpression Id. */
  int MONI = 34;
  /** RegularExpression Id. */
  int MTCX = 35;
  /** RegularExpression Id. */
  int NPAR = 36;
  /** RegularExpression Id. */
  int NARG = 37;
  /** RegularExpression Id. */
  int NCXS = 38;
  /** RegularExpression Id. */
  int MTAC = 39;
  /** RegularExpression Id. */
  int NLTR = 40;
  /** RegularExpression Id. */
  int LVAR = 41;
  /** RegularExpression Id. */
  int EVAR = 42;
  /** RegularExpression Id. */
  int OR = 43;
  /** RegularExpression Id. */
  int AND = 44;
  /** RegularExpression Id. */
  int EQ = 45;
  /** RegularExpression Id. */
  int NEQ = 46;
  /** RegularExpression Id. */
  int NOT = 47;
  /** RegularExpression Id. */
  int VAR = 48;
  /** RegularExpression Id. */
  int VAL = 49;
  /** RegularExpression Id. */
  int LOOK = 50;
  /** RegularExpression Id. */
  int LOOKONC = 51;
  /** RegularExpression Id. */
  int UNKNOWN = 52;
  /** RegularExpression Id. */
  int STAT = 53;
  /** RegularExpression Id. */
  int OUTC = 54;
  /** RegularExpression Id. */
  int OUTCF = 55;
  /** RegularExpression Id. */
  int CHILD = 56;
  /** RegularExpression Id. */
  int CONST = 57;
  /** RegularExpression Id. */
  int TRUE = 58;
  /** RegularExpression Id. */
  int FALSE = 59;
  /** RegularExpression Id. */
  int FAIL = 60;
  /** RegularExpression Id. */
  int IDENTIFIER = 61;
  /** RegularExpression Id. */
  int INTEGER = 62;
  /** RegularExpression Id. */
  int FLOAT = 63;
  /** RegularExpression Id. */
  int MTSTRING = 64;
  /** RegularExpression Id. */
  int STRING = 65;
  /** RegularExpression Id. */
  int LETTER = 66;
  /** RegularExpression Id. */
  int LETTEREXT = 67;
  /** RegularExpression Id. */
  int DIGIT = 68;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"|\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\"#\"",
    "\"\\\"\"",
    "\"|-\"",
    "\"(\"",
    "\")\"",
    "\"<\"",
    "\">\"",
    "\"<=\"",
    "\">=\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"\\\'\"",
    "\":\"",
    "\"command\"",
    "\"commandInfo\"",
    "\"node\"",
    "\"name\"",
    "\"list\"",
    "\"retCommand\"",
    "\"assignment\"",
    "\"empty\"",
    "\"memory\"",
    "\"monitor\"",
    "\"mtcontext\"",
    "\"nilpar\"",
    "\"nilarg\"",
    "\"nilcontexts\"",
    "\"mtactions\"",
    "\"niltrace\"",
    "\"locVar\"",
    "\"extVar\"",
    "\"or\"",
    "\"and\"",
    "\"equ\"",
    "\"nequ\"",
    "\"not\"",
    "\"var\"",
    "\"v\"",
    "\"lookup\"",
    "\"lookupOnChange\"",
    "\"unknown\"",
    "\"isStatus?\"",
    "\"isOutcome?\"",
    "\"isOutcomeFailure?\"",
    "\"areChildren?\"",
    "\"const\"",
    "\"true\"",
    "\"false\"",
    "\"fail\"",
    "<IDENTIFIER>",
    "<INTEGER>",
    "<FLOAT>",
    "\"\\\"\\\"\"",
    "<STRING>",
    "<LETTER>",
    "<LETTEREXT>",
    "<DIGIT>",
    "\",\"",
    "\".\"",
    "\":=\"",
  };

}
