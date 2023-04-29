package com.company.lambda;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("all")
public class GroupingExample {
  public static void main(String[] args) {
    System.out.println(new GroupingExample().countWords(List.of("casa", "perro", "carro", "casa").stream()));
  }

  public Map<String, Long> countWords(Stream<String> wordStream) {
    //Map<String, Long> counts = wordStream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    Map<String, Long> counts = wordStream.collect(Collectors.groupingBy(String::toUpperCase, Collectors.counting()));
    return counts;
  }
}
