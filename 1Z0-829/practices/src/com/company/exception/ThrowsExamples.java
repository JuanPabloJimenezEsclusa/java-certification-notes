package com.company.exception;

class SomeException extends Exception{}

class A {
  protected void m() throws SomeException {
    System.out.println("A - m()");
  }
}
class B extends A {
  public void m() {
    System.out.println("B - m()");
  }
}

public class ThrowsExamples {
  public static void main(String[] args) {
    A a = new B();

    //a.m();  //does not compile!
    ((B) a).m();
  }
}
