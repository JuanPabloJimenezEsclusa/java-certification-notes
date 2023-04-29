package com.company.inheritance;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {

    List<Integer> lst1 = new ArrayList<>(List.of(3,9,4));
    List<Integer> lst2 = Collections.unmodifiableList(lst1);
    lst1.remove(0);

    System.out.println(lst1);
    System.out.println(lst2);

  }
}
