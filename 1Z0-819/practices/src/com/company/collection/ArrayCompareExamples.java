package com.company.collection;

import java.util.Arrays;

public class ArrayCompareExamples {
  public static void main(String[] args) {
    int[] a = {'h', 'e', 'l'};
    int[] b = {'h', 'e', 'l', 'l', 'o'};
    int x = Arrays.compare(a, b); // a < b = - ; a == b = 0 ; a > b = +
    int y = Arrays.mismatch(a, b);
    System.out.println(x + " " + y);
  }
}
