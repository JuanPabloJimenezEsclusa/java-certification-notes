package com.company.collection;

import java.util.LinkedList;
import java.util.Queue;

class Person {
  private String name;
  public Person(String name) { this.name = name; }
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public String toString() { return "{ " + name + " }"; }
}

public class DequeHelperExample {
  public void helpPeople(Queue people, Queue helped) {
    System.out.println(people);
    System.out.println(helped);
    do {
      Person p = (Person) people.poll();
      System.out.println("Helped : " + p + " ");
      helped.offer(p.getName());
    } while (!people.isEmpty());
    System.out.println(people);
    System.out.println(helped);
  }

  public static void main(String[] args) {
    Queue<Person> q = new LinkedList<Person>();
    q.offer(new Person("Pope"));
    q.offer(new Person("John"));
    Queue<Person> helpedQ = new LinkedList<Person>();
    DequeHelperExample h = new DequeHelperExample();
    h.helpPeople(q, helpedQ);
  }

  public float parseFloat( String s ){
    float f = 0.0f; // 1
    try{
      f = Float.valueOf( s ).floatValue(); // 2
      return f ;      // 3
    }
    catch(NumberFormatException nfe){
      f = Float.NaN ; // 4
      return f; // 5
    }
    finally {
      return f; // 6
    }
    //return f ; // 7
  }
}
