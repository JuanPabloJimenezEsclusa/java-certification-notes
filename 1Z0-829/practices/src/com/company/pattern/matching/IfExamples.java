package com.company.pattern.matching;

import java.util.List;

@SuppressWarnings("all")
public class IfExamples {
  public static void main(String[] args) {
    IfExamples ifExamples = new IfExamples();
    ifExamples.compareIntegers(5);
    ifExamples.comparePatternIntegers(5);
    ifExamples.printIntegersGreaterThan5(10);

    Integer value = 123;
    if (value instanceof Integer) {}
    //if(value instanceof Integer data) {} // DOES NOT COMPILE

    Number value2 = 123;
    if (value2 instanceof List) {}       // It compiles but never happens
    if (value2 instanceof List data) {}  // It compiles but never happens
  }

  void compareIntegers(Number number) {
    if (number instanceof Integer) {
      Integer data = (Integer) number;
      System.out.println(data.compareTo(5));
    }
  }

  void comparePatternIntegers(Number number) {
    if (number instanceof Integer data) {
      System.out.println(data.compareTo(5));
    }
    if (number instanceof final Integer data) {
      // data = 10; // DOES NOT COMPILE
      System.out.println(data.compareTo(5));
    }
    if (number instanceof Integer data) {
      data = 15;
      System.out.println(data.compareTo(5));
    }
  }

  void printIntegersGreaterThan5(Number number) {
    if (number instanceof Integer data && data.compareTo(5) > 0) System.out.println(data);
  }
}
