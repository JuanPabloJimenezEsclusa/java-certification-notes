package com.company.generic;

class MultipleBound<T extends A & B> {
  private final T objRef;
  public MultipleBound(T obj) { this.objRef = obj;  }
  public void run() { this.objRef.execute();  }
}

interface B {
  void execute();
}

@SuppressWarnings("all")
class A implements B {
  public void execute() { System.out.println("Inside class A"); }
}

public class BoundedClass {
  public static void main(String[] args) {
    MultipleBound<A> obj = new MultipleBound<>(new A());
    obj.run();
  }
}
