package com.company.operator;

public class OperatorExamples {
  public static void main(String[] args) {
    boolean carrot = true;
    Boolean potato = false;
    var broccoli = true;
    carrot = carrot & potato;
    broccoli = broccoli ? !carrot : potato;
    potato = !broccoli ^ carrot;   // if use ^ and 2 arguments are the same, then the result is false
    System.out.println(carrot + "," + potato + "," + broccoli); // false false true
  }
}
