package com.company.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceExamples {

  public List<? extends Number> getList() {
    //return new ArrayList<Integer>();
    //return new ArrayList<Number>();
    return new ArrayList();
    //return new ArrayList<Object>();
  }

  public static void main(String[] args) {
    List<String> vals2 = Arrays.asList("a", "b", "a", "b", "c");
    String join2 = vals2.parallelStream().reduce("_", (a, b) -> a.concat(b));
    System.out.println(join2);

    /* List<String> vals = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "a", "b", "c",
      "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g");

    String join = vals.parallelStream() //peek shows how the elements are retrieved from the stream
      .peek(System.out::println)
      .reduce("_", (a, b) -> {
        System.out.println("reducing " + a + " and " + b + " Thread: " + Thread.currentThread().getName());
        return a.concat(b);
      }, (a, b) -> {
        System.out.println("combining " + a + " and " + b + " Thread: " + Thread.currentThread().getName());
        return a.concat(b);
      });
    System.out.println(join);*/
  }
}
