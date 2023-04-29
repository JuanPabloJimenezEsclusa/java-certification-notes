package com.company.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingExample {
  public static void main(String[] args) {
    List<Integer> names = Arrays.asList(1, 2, 3);

    A01: System.out.println(names.stream().mapToInt(x->x).sum());
    //A02: System.out.println(names.stream().forEach((sum, x)->sum = sum + x));
    A03: System.out.println(names.stream().reduce(0, (a, b)->a+b));
    A04: System.out.println(names.stream().collect(Collectors.mapping(x->x, Collectors.summarizingInt(x->x))).getSum());
    A05: System.out.println(names.stream().collect(Collectors.summarizingInt(x->x)).getSum());
  }
}
