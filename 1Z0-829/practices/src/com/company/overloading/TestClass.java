package com.company.overloading;

public class TestClass {
  void probe(int... x) { System.out.println("In ..."); }  //1
  void probe(Integer x) { System.out.println("In Integer"); } //2
  void probe(long x) { System.out.println("In long"); } //3
  void probe(Long x) { System.out.println("In LONG"); } //4

  public static void main(String[] args){
    // probe(Integer) will be bound to probe(Integer) (exact match).
    // If that is not available, it will be bound to probe(long), and then with probe(int...) in that order of preference.
    // probe(long) is preferred over probe(int...) because unboxing an Integer gives an int and
    //   in pre 1.5 code probe(long) is compatible with an int (Rule 2).

    // It is never bound to probe(Long ) because Integer and Long are different object types and there is no IS-A relation between them.
    // (This holds true for any two wrapper classes).
    // It could, however, be bound to probe(Object ) (if it existed), because Integer IS-A Object.
    Integer a = 4; new TestClass().probe(a); //5

    // probe(int) is bound to probe(long) (because of Rule 2) , then to probe(Integer )
    //   because boxing an int qives you an Integer, which matches exactly to probe(Integer), and then to probe(int...).

    // It is never bound to probe(Long ) because int is not compatible with Long.
    int b = 4; new TestClass().probe(b); //6
  }
}
