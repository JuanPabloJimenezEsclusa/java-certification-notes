package com.company;

@SuppressWarnings("all")
public class ParameterExamples {
  public static void main(String[] args) {
    var name = new StringBuilder("Webby");
    talk(name);
    System.out.println(name); // Webby
    speak(name);
    System.out.println(name); // WebbyGeorgette
  }

  public static void speak(StringBuilder s) {
    s.append("Georgette");
  }

  public static void talk(StringBuilder s) {
    s = new StringBuilder("tests");
    s.append("Camila");
  }
}


// Java will cast or autobox the value automatically, but not both at the same time.
@SuppressWarnings("all")
class Gorilla {
  public void rest(Long x) {
    System.out.print("long");
  }
  public static void main(String[] args) {
    var g = new Gorilla();
    //g.rest(8); // DOES NOT COMPILE
    g.rest(8l);
  }
}

@SuppressWarnings("all")
class Kiwi {
  //public void fly(int numMiles) { System.out.println("i"); }
  public void fly(long numMiles) { System.out.println("l"); }
  //public void fly(Integer numMiles) { System.out.println("I"); }
  //public void fly(Long numMiles) { System.out.println("L"); }

  public static void main(String[] args) {
    new Kiwi().fly(3);
    new Kiwi().fly(3L);
    new Kiwi().fly(Integer.valueOf(3));
    new Kiwi().fly(Long.valueOf(3));
  }
}
