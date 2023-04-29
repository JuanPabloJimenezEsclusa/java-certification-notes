package com.company.operator;

import java.util.List;

public class IntegerReuseMemoryExample {
  public static void main(String[] args) {

    // to save on memory, Java 'reuses' all the wrapper objects whose values fall in the following ranges:
    // 1. All Boolean values (true and false)
    // 2. All Byte values
    // 3. All Character values from \u0000 to \u007f (i.e. 0 to 127 in decimal)
    // 4. All Short and Integer values from -128 to 127
    // So == will always return true when their primitive values are the same and belong to the above list of values.

    List.of("0", "-1", "127", "-256", "256", "1_00").forEach(string -> {
      Integer i = Integer.parseInt(string);
      Integer j = i;
      i--;
      i++;
      System.out.println((i==j));
    });
  }
}
