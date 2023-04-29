package com.company.primitive;

@SuppressWarnings("all")
public class LiteralExamples {
  public static void main(String[] args) {
    int octal = 077;
    int hexagon = 0xFF;
    int bina = 0b11;

    System.out.println(Integer.toOctalString(octal));
    System.out.println(Integer.toHexString(hexagon + 0X1));
    System.out.println(Integer.toBinaryString(bina + 0B1));

    long octalLong = 077L;
    long hexagonLong = 0xFFL;
    long binaLong = 0b11L;

    System.out.println(Long.toOctalString(octalLong));
    System.out.println(Long.toHexString(hexagonLong + 0X1));
    System.out.println(Long.toBinaryString(binaLong + 0B1));

    float octalFloat = 077F;
    float hexagonFloat = 0xFFF;
    float binaFloat = 0b1________________________________________1;

    System.out.println(octalFloat);
    System.out.println(Float.toHexString(hexagonFloat + 0X1));
    System.out.println(binaFloat + 0B1);

  }
}
