package com.company.inheritance.b;

import com.company.inheritance.a.AccessTest;

public class AccessTester extends AccessTest {
  public static void main(String[] args) {
    AccessTest ref = new AccessTest();
    //ref.c();

    AccessTester accessTester = new AccessTester();
    accessTester.c();
    accessTester.e();
  }

  public void e() {
    c();
  }
}
