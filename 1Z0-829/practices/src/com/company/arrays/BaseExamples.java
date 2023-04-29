package com.company.arrays;

@SuppressWarnings("all")
public class BaseExamples {
  public static void main(String[] args) {
    int ids[], types;
    ids = new int[]{1};
    types = 1;


    String[] strings = { "stringValue" };
    Object[] objects = strings;
    String[] againStrings = (String[]) objects;
    //againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
    objects[0] = new StringBuilder();      // Careful!
  }
}
