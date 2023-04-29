package com.company.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExamples {
  public static void main(String[] args) {
    List<String> sites = new ArrayList<>(1);
    sites.add("Eiffel Tower");
    sites.add("Statue of Liberty");
    sites.add("Louvre");
    sites.remove(2);
    System.out.println(sites);


    char[][] letters = new char[][] {
      new char[] { 'a', 'e', 'i', 'o', 'u'},
      new char[] { 'a', 'e', 'o', 'u'} };

    // Which of the following sequences can fill in the blanks so the code prints ‐1 0 2?
    //  var x = Arrays.____________(letters[0], letters[0]);
    //  var y = Arrays.____________(letters[0], letters[0]);
    //  var z = Arrays.____________(letters[0], letters[1]);

    var x = Arrays.mismatch(letters[0], letters[0]);
    var y = Arrays.compare(letters[0], letters[0]);
    var z = Arrays.mismatch(letters[0], letters[1]);

    System.out.print(x + " " + y + " " + z);
  }
}
