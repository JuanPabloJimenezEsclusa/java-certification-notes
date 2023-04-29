package com.company.inheritance;

final public class Bottle {
  final private int size = 14;
  final protected class Insert {
    private final int size = 25;
    public final int getSize() {
      //return this.size;
      return Bottle.this.size;
    }
  }
  final Insert insert = new Insert();
  final public static void main(String[] feed) {
    System.out.print(new Bottle().insert.getSize());
  }
}
