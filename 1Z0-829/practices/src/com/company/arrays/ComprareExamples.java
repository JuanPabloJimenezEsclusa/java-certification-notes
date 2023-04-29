package com.company.arrays;

import java.util.Arrays;

@SuppressWarnings("all")
public class ComprareExamples {
  public static void main(String[] args) {
    // A negative number means the first array is smaller than the second.
    // A zero means the arrays are equal.
    // A positive number means the first array is larger than the second.

    System.out.println(Arrays.compare(new int[] {1}, new int[] {2}));

    // If both arrays are the same length and have the same values in each spot in the same order, return zero.
    // If all the elements are the same but the second array has extra elements at the end, return a negative number.
    // If all the elements are the same, but the first array has extra elements at the end, return a positive number.
    // If the first element that differs is smaller in the first array, return a negative number.
    // If the first element that differs is larger in the first array, return a positive number.

    // null is smaller than any other value.
    // For numbers, normal numeric order applies.
    // For strings, one is smaller if it is a prefix of another.
    // For strings/characters, numbers are smaller than letters.
    // For strings/characters, uppercase is smaller than lowercase.

    System.out.println(Arrays.compare(new int[] {1,2}, new int[] {1}));            // 1
    System.out.println(Arrays.compare(new int[] {1,2}, new int[] {1,2}));          // 0
    System.out.println(Arrays.compare(new String[] {"a"}, new String[] {"aa"}));   // -1
    System.out.println(Arrays.compare(new String[] {"a"}, new String[] {"A"}));    // 32
    System.out.println(Arrays.compare(new String[] {"a"}, new String[] {null}));   // 1
    // System.out.println(Arrays.compare(new int[] {1}, new String[] {"a"}));

    System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1}));             // -1
    System.out.println(Arrays.mismatch(new String[] {"a"}, new String[] {"A"}));   // 0
    System.out.println(Arrays.mismatch(new int[] {1, 2}, new int[] {1}));          // 1
    System.out.println(Arrays.mismatch(new int[] {1}, new int[] {'1'}));           // 0

  }
}
