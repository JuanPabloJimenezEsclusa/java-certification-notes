package com.company.operator;

public class DividedByExample {
  public static void main(String a[]) {
    Float f1 = 10.0f;
    float f2 = 0f;
    Float f3 = null;
    double f = 0.0;
    try {
      f = f1 / f2;
      System.out.println(f);
      f3 = f1 / f2;
    } catch (Exception e) {
      System.out.println("Exception");
    }
    System.out.println(f3.isInfinite());
  }
}
