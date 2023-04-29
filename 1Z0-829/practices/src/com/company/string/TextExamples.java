package com.company.string;

import java.util.Locale;

@SuppressWarnings("all")
public class TextExamples {
  static char charNotInizializate; // '\u0000' (NUL)
  static char charInizializate = '\u0000';

  static String str = """              
               0123\
               4567""";

  String $stange, ¥strange = "X", €strange, _$_¥_€_, __, $¥€ = "Y", £¥₣₹, var = "Z";

  static String text1 = """
    CILM
    LIJM \n
    MAMM
    "JPJE"          \t1-      """;

  protected class Inner {    }

  public static void main(String[] args) {
    Locale myloc = new Locale.Builder().setLanguage("en").setRegion("UK").build(); //L1

    // read this about local variables type inference (LVTI): https://openjdk.java.net/projects/amber/LVTIstyle.html

    // int a, var b = 3;                                      // DOES NOT COMPILE
    // var n = null;                                          // DOES NOT COMPILE
    // var a = "A", b = "B";                                  // DOES NOT COMPILE
    // public int addition(var a, var b) { return a + b; }    // DOES NOT COMPILE

    String s1 = "Hello World";
    String s2 = """             
      Hello World""";
    System.out.println((s1 == s2)+" "+s1.equals(s2));

    System.out.println("(" + str.substring(4,7) + ")");

    var var
      = '-';
    System.out.println(var + "(" + charNotInizializate + ")(" + charInizializate + ")");

    var text2 = """
      LJES
      HIJ
      HAJE
      JMJE
      MGJE
      JPJE
      """;
    System.out.println(text1 + text2);
  }
}
