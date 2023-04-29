package com.company.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book {
  private int id;
  private String title, genre, author;
  private double price;

  public Book(int id, String title, String genre, String author, double price) {
    this.id = id;
    this.title = title;
    this.genre = genre;
    this.author = author;
    this.price = price;
  }
  public int getId() { return id; }
  public String getTitle() { return title; }
  public String getGenre() { return genre; }
  public String getAuthor() { return author; }
  public double getPrice() { return price; }

  @Override
  public String toString() {
    return "Book{" +
      "id=" + id +
      ", title='" + title + '\'' +
      ", genre='" + genre + '\'' +
      ", author='" + author + '\'' +
      ", price=" + price +
      '}';
  }
}

  abstract class GroupingByExamples {
    static public void main(String[] values) {
      var books = List.of(
        new Book(0, "uno", "f", "Camila", 12.0),
        new Book(0, "uno", "f", "Camila", 32.8),
        new Book(0, "uno", "m", "Lucas", 10.0001),
        new Book(1, "uno", "f", "Camila", 8.0),
        new Book(1, "uno", "f", "Camila", 8.05)
      );

      Map<String, Map<String, Map<String, List<Book>>>> classified = null;
      classified = books.stream().collect(
        Collectors.groupingBy(
          Book::getGenre,
          Collectors.groupingBy(
            Book::getAuthor,
            Collectors.groupingBy(Book::getTitle))
        ));
      //System.out.println(classified);

      List<Book> pricesClassifier = books.stream().collect(
        Collectors.groupingBy(book -> book.getPrice() > 10))
        .get(true)
        .stream().collect(Collectors.toList());
      //System.out.println(pricesClassifier);

      Map<String, Map<String, List<String>>> priceAndGroupClassifier = books
        .stream()
        .collect(Collectors.groupingBy(book -> book.getPrice() > 10)).get(true)
        .stream()
        .collect(
          Collectors.groupingBy(
            Book::getGenre,
            Collectors.groupingBy(
              Book::getAuthor,
              Collectors.mapping(Book::getTitle, Collectors.toList()))
          ));
      System.out.println(priceAndGroupClassifier);
    }
  }
