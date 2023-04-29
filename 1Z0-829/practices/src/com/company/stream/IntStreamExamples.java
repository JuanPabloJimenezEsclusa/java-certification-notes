package com.company.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamExamples {
  public static void main(String[] args) {
    // double average1 = IntStream.range(1, 5).collect(Collectors.averagingInt(i->i));  // does not compile: object not convert to int
    double average2 = IntStream.range(1, 5).mapToObj(i->i).collect(Collectors.averagingInt(i->i));
    double average3 = IntStream.range(1, 5).average().getAsDouble();
    //double average4 = IntStream.range(1, 5).parallelStream().mapToInt(i->i).average();   // does not compile!
    double average5 = IntStream.range(1, 5).parallel().mapToDouble(i->i).average().getAsDouble();

    System.out.println("(" + average2 + ")(" + average3 + ")(" + average5 + ")");
  }
}
