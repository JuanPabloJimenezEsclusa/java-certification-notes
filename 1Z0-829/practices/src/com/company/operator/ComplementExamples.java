package com.company.operator;

@SuppressWarnings("all")
public class ComplementExamples {
  public static void main(String[] args) {
    int value = 6; // Stored as 00110
    int complement = ~value; // Stored as 11001
    System.out.println(value); // 6
    System.out.println(complement); // -7

    System.out.println(- 1 * value - 1); // -7
    System.out.println(- 1 * complement - 1); // 6
  }
}
