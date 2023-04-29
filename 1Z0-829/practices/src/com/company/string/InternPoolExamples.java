package com.company.string;

@SuppressWarnings("all")
public class InternPoolExamples {
  public static void main(String[] args) {
    var x = "Hello World";
    var y = "Hello World";
    System.out.println(x == y);  // true

    var x1 = "Hello World";
    var z1 = " Hello World".trim();
    System.out.println(x1 == z1); // false

    var singleString = "hello world";
    var concat = "hello ";
    concat += "world";
    System.out.println(singleString == concat); // false

    var x2 = "Hello World";
    var y2 = new String("Hello World");  // new String not use String pool / internal pool !!
    System.out.println(x2 == y2); // false

    var name = "Hello World";
    var name2 = new String("Hello World").intern();
    System.out.println(name == name2); // true

    var first =  "rat" + 1;
    var second = "r" + "a" + "t" + "1";
    var third =  "r" + "a" + "t" + new String("1");
    System.out.println(first == second);           // true
    System.out.println(first == second.intern());  // true
    System.out.println(first == third);            // false
    System.out.println(first == third.intern());   // true

  }
}
