package com.company.wrapper;

public class IntegerEqualsExample {
  public static void main(String[] args) {
    Double d1 = 1000.0;
    double d2 = 1000.0;
    int i1 = 1000;
    Integer i2 = Integer.valueOf(1000); //returns an new Integer object containing 1000
    Integer i3 = Integer.valueOf(1000); //returns an new Integer object containing 1000

    System.out.println(d1 == d2); //prints true, d1 is unboxed //and both the values are the same
    System.out.println(d1 == i1); //prints true, d1 is unboxed //and both the values are the same
    System.out.println(i1 == i2); //prints true, i2 is unboxed //and both the values are the same
    System.out.println(i2 == i3); //prints false, i2 and i3 point to //two different Integer objects

    i2 = Integer.valueOf(100); //returns a cached Integer object because //the integer value is between -128 and 127
    i3 = Integer.valueOf(100); //returns the same cached Integer object //because the integer value is between -128 and 127
    System.out.println(i2 == i3); //prints true, because i2 and i3 //point to the same Integer object

    //System.out.println(d1 == i2); //will not compile. No unboxing here //because neither of the operands are primitive.

    Long l2 = Long.valueOf(1000); //returns an new Long object containing 1000
    Long l3 = Long.valueOf(1000); //returns an new Long object containing 1000
    System.out.println(l2 == l3); //prints false, i2 and i3 point to //two different Long objects

    l2 = Long.valueOf(-128); //returns a cached Long object because //the long value is between -128 and 127
    l3 = Long.valueOf(-128); //returns the same cached Long object //because the long value is between -128 and 127
    System.out.println(l2 == l3); //prints true, because l2 and l3 //point to the same Long object
  }
}
