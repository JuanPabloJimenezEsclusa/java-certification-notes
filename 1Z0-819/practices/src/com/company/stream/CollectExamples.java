package com.company.stream;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class CollectExamples {
  public static void main(String[] args) {
    List<Book> books = Arrays.asList(
      new Book("Atlas Shrugged", 10.0),
      new Book("Freedom at Midnight", 5.0),
      new Book("Gone with the wind", 5.0));
    Map<String, Double> bookMap = books.stream().collect(Collectors.toMap((b -> b.getTitle()), b -> b.getPrice()));
    BiConsumer<String, Double> func = (a, b) -> { if(a.startsWith("A")) { System.out.println(b); }};
    bookMap.forEach(func);
  }

  private static class Book {
    private final String tittle;
    private final Double price;
    Book(String tittle, Double price) { this.tittle = tittle; this.price = price; }
    String getTitle() { return this.tittle; }
    Double getPrice() { return this.price; }
  }
}
