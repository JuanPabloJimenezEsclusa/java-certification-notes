package com.company.arrays;

public class Test {
  public static void main(String[] args) {
    var a = new int[]{1, 2, 3, 4};
    int[] b = {2, 3, 1, 0};
    System.out.println(a[(a = b)[3]]);

    System.out.println('a'+1);
  }
}
