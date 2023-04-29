package com.company.lambda;

import java.util.*;
import java.util.stream.Stream;

public class FlatMapExamples {
  public static void main(String[] args) {
    List<String> list = new LinkedList<>();
    Deque<String> queue = new ArrayDeque<>();
    queue.push("all queued up");
    queue.push("last");

    System.out.println("list");
    FlatMapExamples.withFlatMap(list);
    FlatMapExamples.withoutFlatMap(list);
    System.out.println("queue");
    FlatMapExamples.withFlatMap(queue);
    FlatMapExamples.withoutFlatMap(queue);
  }

  private static void withFlatMap(Collection<?> coll) {
    Stream.of(coll)
      .flatMap(x -> x.stream())
      .forEach(System.out::print);
    System.out.println();
  }

  private static void withoutFlatMap(Collection<?> coll) {
    Stream.of(coll)
      .filter(x -> !x.isEmpty())
      .map(x -> x)
      .forEach(System.out::print);
    System.out.println();
  }
}
