package com.company.operator;

public class RealBrainerExample {
  public static void main(String[] args) {
    int x = 2;     int y = ~x;  //LINE 2
    int z = x ^ y;  //LINE 3
    boolean flag = x < y & x > z++;   //LINE 4
    if(flag) {
      flag = x > y && x > --z;  //LINE 6
    }
    if(z>-1) {  //LINE 8
      --z;
    } else z++;
    System.out.println(flag+" "+z);   //LINE 11
  }
}
