package com.company.generic.bounded;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcard {
  //public static void printList(List<Object> list) {  // --> KO
  public static void printList(List<?> list) {
    for ( /* Object */ var elem: list) System.out.print(elem + " ");
    System.out.println();
  }

  public static void main(String[] args) {
    List<Integer> li = Arrays.asList(1, 2, 3);
    List<String>  ls = Arrays.asList("one", "two", "three");
    List<Object>  lo = Arrays.asList(null, null, new Object());
    printList(li);
    printList(ls);
    printList(lo);
  }
}
