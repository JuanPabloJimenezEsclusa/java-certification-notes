package com.company.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BookExample  {
  static class Book //implements Comparable<Book>
  {
    String isbn; String title;
    public Book(String isbn, String title) { this.isbn = isbn; this.title = title; }
    public int compareTo(Book b) { return this.isbn.compareTo(b.isbn); }
    public String getTitle() { return title; }
    public String toString() { return "Book{isbn='" + isbn + "', title='" + title + "'}";
    }
  }

  public static void main(String[] args) {
    float f = 43e2f;

    List<Book> books = getBooksByAuthor("Ludlum");

    System.out.println(books.stream().sorted().collect(Collectors.toList()));
    //Collections.sort(books, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle())); //1
    //Collections.sort(books); //2
    System.out.println(books);
  }

  private static List<Book> getBooksByAuthor(String author) {
    return Arrays.asList(new Book("3", "postcast")
      , new Book("1", "jdango")
      , new Book("2", "christen"));
  }
}
