package com.company.arrays;

import java.util.Arrays;

@SuppressWarnings("all")
public class SearchExamples {
  public static void main(String[] args) {
    int[] numbers = {2,4,6,8,20,18,16,14,12,10};
    System.out.println(Arrays.binarySearch(numbers,2)); // 0
    System.out.println(Arrays.binarySearch(numbers,4)); // 1
    System.out.println(Arrays.binarySearch(numbers,1)); // -1
    System.out.println(Arrays.binarySearch(numbers,3)); // -2
    System.out.println(Arrays.binarySearch(numbers,9)); // -5
  }
}
