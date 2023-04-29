package com.company.stream;

import java.util.stream.IntStream;

public class OptionalExamples {
  public static void main(String[] args) {
    Object v1 = IntStream.rangeClosed(10, 15).boxed().filter(x -> x > 12).parallel().findAny();
    Object v2 = IntStream.rangeClosed(10, 15).boxed().filter(x -> x > 12).sequential().findAny();
    System.out.println(v1 + ":" + v2);
  }
}
