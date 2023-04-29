package com.company.operator;

@SuppressWarnings("all")
public class BitwiseExamples {
  public static void main(String[] args) {
    orExample();
    andExample();
    xorExample();
    complementExample();
  }

  private static void orExample() {
    // or (|)
    byte a = 5; // 0101 (In Binary)
    byte b = 7; // 0111 (In Binary)
    System.out.println("(" + a + ":" + Integer.toBinaryString(a) + ")(" + b + ":" + Integer.toBinaryString(b) + ")");

    a |= b;
    //   0101
    // | 0111
    //   ----
    //   0111 = 7
    System.out.println("(" + a + ":" + Integer.toBinaryString(a) + ")");
  }

  private static void andExample() {
    // and (&)
    byte a = 5; // 1101 (In Binary)
    byte b = 7; // 0111 (In Binary)
    System.out.println("(" + a + ":" + Integer.toBinaryString(a) + ")(" + b + ":" + Integer.toBinaryString(b) + ")");

    a &= b;
    //   0101
    // & 0111
    //   ----
    //   0101 = 5
    System.out.println("(" + a + ":" + Integer.toBinaryString(a) + ")");
  }

  private static void xorExample() {
    // xor (^)
    byte a = 5; // 1101 (In Binary)
    byte b = 7; // 0111 (In Binary)
    System.out.println("(" + a + ":" + Integer.toBinaryString(a) + ")(" + b + ":" + Integer.toBinaryString(b) + ")");

    a ^= b;
    //   0101
    // ^ 0111
    //   ----
    //   0010 = 2
    System.out.println("(" + a + ":" + Integer.toBinaryString(a) + ")");
  }

  private static void complementExample() {
    // complemnt (~)
    byte a = 5; // 1101 (In Binary)
    System.out.println("(" + a + ":" + Integer.toBinaryString(a) + ")");

    var b = ~a;
    // ~00000000 00000000 00000000 00000101 = 11111111 11111111 11111111 11111010
    System.out.println("(" + b + ":" + Integer.toBinaryString(b) + ")");
  }
}
