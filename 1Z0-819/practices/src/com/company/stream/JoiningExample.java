package com.company.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
  public static void main(String[] args) {
    Stream<String> ss = Stream.of("a", "b", "c");
    String str = ss.collect(Collectors.joining(",", "-", "+"));
    System.out.println(str);
  }
}
