package com.company.collection;

import java.util.Arrays;

public class ArraySort {
  static String[] sa = { "charlie", "bob", "andy", "dave" };

  public static void main(String[] args) {
    // System.out.println(Arrays.search(sa, "andy"));        --> wrong - not exists
    // System.out.println(Arrays.linearSearch(sa, "andy"));  --> wrong - mot exists

    System.out.println(Arrays.asList(sa));
    System.out.println(Arrays.binarySearch(sa, "charlie"));
    Arrays.sort(sa);
    System.out.println(Arrays.asList(sa));
    System.out.println(Arrays.binarySearch(sa, "charlie"));
  }
}
