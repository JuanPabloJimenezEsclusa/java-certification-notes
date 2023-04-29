package com.company.commands;

class TestClass {
  public static void main(String args[]) {
    int time = 100;
    java.sql.Timestamp ts = new java.sql.Timestamp(time);
    java.util.Date d = new java.util.Date();
    ts = new java.sql.Timestamp(d.getTime());
    System.out.println(ts);
  }
}

// javac com/company/commands/TestClass.java
// jdeps -summary com/company/commands/TestClass.class

