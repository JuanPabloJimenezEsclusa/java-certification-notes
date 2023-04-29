package com.company.generic.bounded;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcard {
  public static List addNumbers(List<? super Integer> list) {
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }
    return list;
  }

  public static void main(String[] args) {
    List<Integer> li = new ArrayList<>(Arrays.asList(1, 2, 3));
    System.out.println(addNumbers(li));

    List<Number> ln = new ArrayList<>();
    System.out.println(addNumbers(ln));

    List<Object> lo = new ArrayList<>();
    System.out.println(addNumbers(lo));
  }
}
