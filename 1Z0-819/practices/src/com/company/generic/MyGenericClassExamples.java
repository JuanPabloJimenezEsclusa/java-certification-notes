package com.company.generic;

class MyGenericClass<T> {
  public <H> String transform(H t) {
    return t.toString() + "-" + t.hashCode();
  }
  public <AJ> String transform2(AJ t) {
    return t.toString() + "-" + t.hashCode();
  }
  public <ABCDEFGHIJKLMNOPQRST> String transform3(ABCDEFGHIJKLMNOPQRST t) {
    return t.toString() + "-" + t.hashCode();
  }
  public <$as> String transform4($as t) {
    return t.toString() + "-" + t.hashCode();
  }
}

public class MyGenericClassExamples {
  public static void main(String[] args) {
    MyGenericClass gc = new MyGenericClass();
    System.out.println(gc.transform(1)); //1
    System.out.println(gc.transform("hello")); //2
    MyGenericClass<String> gcStr = new MyGenericClass<String>();
    System.out.println(gcStr.transform(1.1)); //3

    System.out.println(gc.transform2(1)); //1
    System.out.println(gc.transform2("hello")); //2
    System.out.println(gcStr.transform2(1.1)); //3

    MyGenericClass gc2 = new MyGenericClass();
    System.out.println(gc2.transform3(1)); //1
    System.out.println(gc2.transform3("hello")); //2
    MyGenericClass<String> gcStr2 = new MyGenericClass<String>();
    System.out.println(gcStr2.transform3(1.1)); //3
  }
}
