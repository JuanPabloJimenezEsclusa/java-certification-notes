package com.company.math;

@SuppressWarnings("all")
public class OperationExamples {
  public static void main(String[] args) {
    int first = Math.max(3, 7);   // 7
    int second = Math.min(7, -9); // -9
    var third = Math.min(1, 4.0F);

    long low = Math.round(123.45);       // 123
    long high = Math.round(123.50);      // 124
    int fromFloat = Math.round(123.45f); // 123

  }
}
