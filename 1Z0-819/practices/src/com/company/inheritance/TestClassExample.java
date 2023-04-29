package com.company.inheritance;

public class TestClassExample {
  public class A { }
  public static class B { }

  public void useClasses() { //1
    new TestClassExample().new A();
    new TestClassExample.A();
    new A();

    new TestClassExample.B();
    new B();
  }
}
