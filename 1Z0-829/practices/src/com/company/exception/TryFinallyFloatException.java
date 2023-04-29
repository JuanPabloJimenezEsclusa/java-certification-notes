package com.company.exception;

public class TryFinallyFloatException {
  public float parseFloat(String s) {
    float f = 0.0f;
    try {
      f = Float.valueOf(s).floatValue();

      //throw new RuntimeException();
      return f;
    } catch (NumberFormatException nfe) {
      f = Float.NaN;
      //throw new RuntimeException();
      return f;
    } finally {
      f = 10.0f;
      return f;
    }
  }

  public static void main(String[] args) {
    System.out.println(new TryFinallyFloatException().parseFloat("0.0"));
  }
}
