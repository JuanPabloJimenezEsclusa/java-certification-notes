package com.company.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxExample {
  public static void main(String[] args) {
    List<Integer> ls = Arrays.asList(3,4,6,9,2,5,7);
    System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b)->a>b?a:b)); //1
    System.out.println(ls.stream().max(Integer::max).get()); //2
    System.out.println(ls.stream().max(Integer::compare).get()); //3
    System.out.println(ls.stream().max((a, b)->a>b?a:b)); //4


    List<Integer> ls2 = Arrays.asList(10, 47, 33, 23);
    //int max = ls2.stream().map(a->a).max();
    int max = ls2.stream().max(Comparator.comparing(a->a)).get();
    var max2 = ls2.stream().reduce((a, b)->a>b?a:b);
    System.out.println(max + " - " + max2); //1
  }
}
