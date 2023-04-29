package com.company.collection;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableExample {
  public static void main(String[] args) {
    NavigableMap<String, String> mymap = new TreeMap<String, String>();
    mymap.put("a", "apple");
    mymap.put("b", "boy");
    mymap.put("c", "cat");
    mymap.put("aa", "apple1");
    mymap.put("bb", "boy1");
    mymap.put("cc", "cat1");

    mymap.pollLastEntry(); //LINE 1
    mymap.pollFirstEntry(); //LINE 2

    NavigableMap<String, String> tailmap = mymap.tailMap("bb", false); //LINE 3
    System.out.println(tailmap.pollFirstEntry()); //LINE 4
    System.out.println(mymap.size()); //LINE 5
  }
}
