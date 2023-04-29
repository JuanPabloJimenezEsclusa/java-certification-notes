package com.company.exception;

import java.util.Arrays;
import java.util.List;

class NewException extends Exception {
}

class AnotherException extends Exception {
}

public class ExceptionTest1 {

  public static final List<String> validCountryCodes = Arrays.asList( "IN", "US", "EU" );
  public static final List<String> validCountryCodes2 = List.of( "IN", "US", "EU" );

  public static void main(String[] args) throws Exception {
    try {
      m2();
    } finally {
      m3();
    }
  }

  public static void m2() throws NewException {
    System.out.println("m2");
    throw new NewException();
  }

  public static void m3() throws AnotherException {
    System.out.println("m3");
    throw new AnotherException();
  }
}
