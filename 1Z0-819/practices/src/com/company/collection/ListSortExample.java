package com.company.collection;

import java.util.Arrays;
import java.util.List;

public class ListSortExample {
  public static void main(String[] args) {
    List<Double> dList = Arrays.asList(10.0, 12.0);
    dList.stream().forEach(x->{ x = x+10; });
    dList.stream().forEach(d->System.out.println(d));

    List<Double> dList2 = Arrays.asList(Double.valueOf(10.0), Double.valueOf(12.0));
    dList2.forEach(x->{ x = x+10; });
    dList2.forEach(d->System.out.println(d));
  }
}
