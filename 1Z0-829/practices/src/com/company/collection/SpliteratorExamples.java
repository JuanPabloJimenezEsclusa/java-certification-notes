package com.company.collection;

import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorExamples {
  public static void main(String[] args) {
    Stream<String> ss = Stream.of("a", "b", "c", "d", "e");

    Spliterator<String> sit1 = ss.spliterator();
    long s0 = sit1.estimateSize();

    Spliterator<String> sit2 = sit1.trySplit();
    Spliterator<String> sit3 = sit2.trySplit();
    long s1 = sit1.estimateSize();
    long s2 = sit2.estimateSize();
    long s3 = sit3.estimateSize();

    System.out.println("Characteristics: " + sit1.characteristics());
    System.out.println("Characteristics: " + sit2.characteristics());
    System.out.println("Characteristics: " + sit3.characteristics());
    System.out.println(s0 - (s1 + s2 + s3));
  }
}
