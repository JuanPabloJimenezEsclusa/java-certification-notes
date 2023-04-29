package com.company.collection;

import java.util.*;

public class CollectionExamples {
  public static void main(String[] args) {
    var list = new ArrayList<String>();
    list.add("Austin");
    list.add("Boston");
    list.add("San Francisco");
    list.removeIf(a -> a.length()> 10);
    System.out.println(list.size());

    // reversed comparator
    Comparator<Integer> c = (x, y) -> y - x;
    var ints = Arrays.asList(3, 1, 4);
    Collections.sort(ints, c);
    System.out.println(ints);
    System.out.println(Collections.binarySearch(ints, 1));

    var q = new ArrayDeque<String>();
    q.offerFirst("snowball");
    q.offer("sugar");
    q.offerLast("minnie");
    System.out.println(q);
    System.out.println(q.poll());
    System.out.println(q);
    System.out.println(q.removeFirst());
    System.out.println(q);
    System.out.println(q.size());

    Set<Magazine> set = new TreeSet<>();
    set.add(new Magazine("highlights"));
    set.add(new Magazine("Newsweek"));
    set.add(new Magazine("highlights"));
    System.out.println(set.iterator().next());
  }
}

class Magazine //implements Comparable<Magazine>
{
  private String name;
  public Magazine(String name) {
    this.name = name;
  }
  public int compareTo(Magazine m) {
    return name.compareTo(m.name);
  }
  public String toString() {
    return name;
  }
}
