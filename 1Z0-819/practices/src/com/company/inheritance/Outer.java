package com.company.inheritance;

public class Outer {
  private int oi = 20;

  Inner getInner() {
    return new Inner();
  }

  class Inner {
    int getOi() {
      return oi;
    }
  }
}

class OuterTestClass {
  public static void main(String args[]) {
    var out = new Outer();
    System.out.println(out.getInner().getOi());
  }
}
