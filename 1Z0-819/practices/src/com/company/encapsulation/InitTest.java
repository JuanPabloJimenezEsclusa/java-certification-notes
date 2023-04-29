package com.company.encapsulation;

public class InitTest {
  static int si = 10;
  int  i;
  final boolean bool;

  // 1
  // InitTest() { si += 10; }
  // { si = 5; i = bool ? 1000 : 2000;}
  // { i = 1000; }
  { bool = (si > 5); i = 1000; }

  public static void main(String[] args) {
    InitTest initTest = new InitTest();
    System.out.println(initTest.i);
    System.out.println(initTest.bool);
    System.out.println(si);
    System.out.println(InitTest.si);
  }
}
