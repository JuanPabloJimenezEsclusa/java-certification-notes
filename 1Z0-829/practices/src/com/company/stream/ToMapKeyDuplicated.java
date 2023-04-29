package com.company.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SuppressWarnings("all")
public class ToMapKeyDuplicated {
  public static void main(String[] args) {
    var tickers = List.of("A", "D", "E", "C", "A");
    var ratio = List.of(1.0, 1.2, 1.5, 1.8, 2.0);

    var map1 = IntStream.range(0, tickers.size())
      .boxed()
      .collect(Collectors.toMap(
        i -> tickers.get(i),
        i -> 1.0 / ratio.get(i),
        (x, y) -> (x + y)/2));  //<<----- LINE 1
    map1.forEach((var k, var v)->System.out.printf("%s = %.2f\n",k, v));

    var map2 = map1.entrySet().stream()
      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
      .collect(Collectors.toMap(Map.Entry::getKey,
        Map.Entry::getValue,
        (x, y) -> x-y,
        LinkedHashMap::new));  //<<----- LINE 2

    map2.forEach((var k, var v)->System.out.printf("%s = %.2f\n",k, v));

    withoutResolveDuplicated();
  }

  private static void withoutResolveDuplicated() {
    List<Book> books = Arrays.asList(
      new Book("Gone with the wind", 5.0),
      new Book("Gone with the wind", 10.0),
      new Book("Atlas Shrugged", 15.0));
    books.stream()
      .collect(Collectors.toMap((b -> b.title()), b -> b.price()))
      .forEach((a, b) -> System.out.println(a + " " + b));
  }

  private static record Book(String title, double price) {
  }
}
