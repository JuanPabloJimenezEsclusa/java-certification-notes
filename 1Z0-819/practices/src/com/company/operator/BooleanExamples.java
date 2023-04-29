package com.company.operator;

public class BooleanExamples {
  public static void main(String[] args) {
    boolean b1 = false;
    boolean b2 = false;
    // (b2 != b1 = !b2) wrong
    // (b2 = b1 != b2)  ok
    // (b2 = b1 = !b2)  ok

    if (b2 = b1 != !b2) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
    System.out.println(b1 + ":" + b2);
  }
}
