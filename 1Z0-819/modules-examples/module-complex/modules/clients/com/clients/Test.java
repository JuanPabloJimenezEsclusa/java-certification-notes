package com.clients;

public class Test {
  public static void main (String [] args) {
    var oper = new com.operations.Oper();
    System.out.println(oper.plus(17,9));
    System.out.println(oper.minus(17,9));
    System.out.println(oper.times(17,9));
    System.out.println(oper.divideTo(17,9));
  }
}
