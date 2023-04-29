package com.company.collection;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

public class InfiniteExamples {
  public static void main(String[] args) {
    List<Integer> original = new ArrayList<>(Arrays.asList(1,2,3));

    List<Integer> copy1 = new ArrayList<>(original);
    //for(Integer q : copy1) copy1.add(1);

    List<Integer> copy2 = new CopyOnWriteArrayList<>(original);
    //for(Integer q : copy2) copy2.add(2); // generate a copy

    Deque<Integer> copy3 = new ConcurrentLinkedDeque<>(original);
    //for(Integer q : copy3) copy3.offer(3); // --> this makes an infinite loop
    //for(Integer q : copy3) copy3.push(3);

    List<Integer> copy4 = Collections.synchronizedList(original);
    //for(Integer q : copy4) copy4.add(4);

    // these make infinite loop
    Stream<Character> chars = Stream.generate(() -> 'a');
    //chars.filter(c -> c < 'b').sorted().findFirst();
    //chars.filter(c -> c < 'b').sorted().findFirst().ifPresent(System.out::print);
  }
}
