package com.company.variable.arity;

// Java Program to illustrate Overloading in Variable
// arity

@SuppressWarnings({
  "all", "auxiliaryclass"
  ,  "cast",  "classfile",  "deprecation",  "dep-ann", "divzero"
  , "empty", "exports", "fallthrough", "finally"
  ,  "module", "opens", "options", "overloads", "overrides"
  , "path", "processing", "rawtypes"  , "removal"
  , "requires-automatic", "requires-transitive-automatic"
  , "serial", "static", "try", "unchecked", "varargs", "preview"
})
class GFG {
  public static void main(String[] args) {
    vaTest(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
    vaTest(true, true, false, true, false, false);
    vaTest("Message", 10, 20);
  }

  // Method 1
  // varargs method which expects zero or more int type parameters
  public static void vaTest(int... x) {
    // Print statement on console
    System.out.println("varargs method with int type arguments");

    for (int y : x) {
      System.out.print(" " + y);
    }
    System.out.println();
  }

  // Method 3
  // varargs method which expects zero or
  // more boolean type parameters
  public static void vaTest(boolean... x) {
    // Print statement on console
    System.out.println("varargs method with boolean type arguments");

    for (boolean y : x) {
      System.out.print(" " + y);
    }
    System.out.println();
  }

  // Method 3
  // varargs() method which expects first parameter to be of String type and then zero or more int type parameters.
  public static void vaTest(String msg, int... x) {
    // Print statement on console
    System.out.print(msg);

    for (int y : x) {
      System.out.print(" " + y);
    }
    System.out.println();
  }
}
