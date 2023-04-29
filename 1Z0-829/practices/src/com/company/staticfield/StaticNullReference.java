package com.company.staticfield;

public class StaticNullReference {
  static String url = "jdbc://derby://localhost:1527//mydb";

  static StaticNullReference getDatabase() {
    System.out.println("Getting DB");
    return null;
  }

  public static void main(String[] args) {
    var database = getDatabase();
    System.out.println(database);
    System.out.println(database.url);
  }
}
