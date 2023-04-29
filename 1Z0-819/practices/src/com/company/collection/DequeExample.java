package com.company.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
  public static void main(String[] args) {
    Deque<Integer> d = new ArrayDeque<>();
    d.add(1);
    d.add(2);
    d.addFirst(3);
    System.out.println(d.pollLast());
    System.out.println(d.pollLast());
    System.out.println(d.pollLast());

    Deque<Integer> d2 = new ArrayDeque<>();
    d2.offer(1);
    d2.offer(2);
    d2.offerFirst(3);
    System.out.println("\n" + d2.pollLast());
    System.out.println(d2.pollLast());
    System.out.println(d2.pollLast());

    Deque<Integer> d3 = new ArrayDeque<>();
    d3.push(1);
    d3.push(2);
    d3.push(3);
    System.out.println("\n" + d3.pollLast());
    System.out.println(d3.pollLast());
    System.out.println(d3.pollLast());

    Deque<Integer> d4 = new ArrayDeque<>();
    d4.push(1);
    d4.push(2);
    d4.push(3);
    System.out.println("\n" + d4.pop());
    System.out.println(d4.pop());
    System.out.println(d4.pop());
  }
}
