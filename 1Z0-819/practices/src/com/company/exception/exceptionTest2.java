package com.company.exception;

public class exceptionTest2 {
  public static void main(String[] args) //throws Exception
  {
    try {
      amethod();
      System.out.println("try ");
    } catch (Exception e) {
      System.out.print("catch ");
    } finally {
      System.out.print("finally ");
    }
    System.out.print("out ");
  }

  public static void amethod() {
    throw new RuntimeException();
  }
}
