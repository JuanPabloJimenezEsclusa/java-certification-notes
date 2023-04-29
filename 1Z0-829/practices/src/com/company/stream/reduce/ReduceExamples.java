package com.company.stream.reduce;

// source: https://www.coderanch.com/t/763217/certification/OCP-JAVA-SE-DEVELOPER-PRACTICE
@SuppressWarnings("all")
public class ReduceExamples {
  public static void main(String args[]) {
    parallelReduce();
    sequentialReduce();
    parallelIterateReduce();
  }

  private static void parallelIterateReduce() {
    // Prints 180 instead of 350
    System.out.println(
      java.util.stream.IntStream.iterate(1, i -> i + 1)
        .limit(70)
        .boxed()
        .parallel()
        .reduce(0,
          (a, b) -> 5,
          (a, b) -> a + b)
    );
    // Prints 200 instead of 425
    System.out.println(
      java.util.stream.IntStream.iterate(1, i -> i + 1)
        .limit(85)
        .boxed()
        .parallel()
        .reduce(0,
          (a, b) -> 5,
          (a, b) -> a + b)
    );
    // Prints 240 instead of 500
    System.out.println(
      java.util.stream.IntStream.iterate(1, i -> i + 1)
        .limit(100)
        .boxed()
        .parallel()
        .reduce(0,
          (a, b) -> 5,
          (a, b) -> a + b)
    );
  }

  private static void sequentialReduce() {
    // Prints 5
    System.out.println(
      java.util.List.of(1, 2, 3, 4, 5)
        .stream()
        .reduce(0,
          (a, b) -> 5,
          (a, b) -> a + b)
    );
    // Prints 5
    System.out.println(
      java.util.List.of(1, 2, 3, 4, 5, 6, 7)
        .stream()
        .reduce(0,
          (a, b) -> 5,
          (a, b) -> a + b)
    );
    // Prints 5
    System.out.println(
      java.util.List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .stream()
        .reduce(0,
          (a, b) -> 5,
          (a, b) -> a + b)
    );
  }

  private static void parallelReduce() {
    // Prints 25
    System.out.println(
      java.util.List.of(0, 0, 0, 0, 0)
        .parallelStream()
        .reduce(0,
          (a, b) -> 5,
          (a, b) -> a + b)
    );
    // Prints 35
    System.out.println(
      java.util.List.of(1, 2, 3, 4, 5, 6, 7)
        .parallelStream()
        .reduce(0,
          (a, b) -> 5,
          (a, b) -> a + b)
    );
    // Prints 50
    System.out.println(
      java.util.List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .parallelStream()
        .reduce(0,
          (a, b) -> 5,
          (a, b) -> a + b)
    );
  }
}
