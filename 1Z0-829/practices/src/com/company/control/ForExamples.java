package com.company.control;

@SuppressWarnings("all")
public class ForExamples {
  public static void main(String[] args) {
    int i3;
    int j3;
    for (i3 = 0, j3 = 0 ; j3 < 1 ; ++j3 , i3++){
      System.out.println( i3 + " " + j3 );
    }
    System.out.println( i3 + " " + j3 );

    long flag2 = 0;
    for (int counter = 4, flag = 0; counter >= 0 || flag <= 10; counter--, flag++, flag2++, ++flag2) {
      System.out.print(counter + " ");
    }
    System.out.println(flag2);

    for(long flag; true; ++flag2, flag2++, ++flag2, flag2++) {
      System.out.println("Hello World");
      break;
    }
    System.out.println(flag2);

    int x = 0;
    for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
      System.out.print(y + " "); }
    System.out.println(x + " ");

    for(x = 0; x < 5; x++)
      System.out.print(x + " ");

    for(int j=0; j<10; j++) System.out.print(j++); System.out.println("");

    int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
    OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
      INNER_LOOP: for(int i = 0; i < mySimpleArray.length; i++) {
        System.out.print(mySimpleArray[i] + "\t");
      }
      System.out.println();
    }
  }
}
