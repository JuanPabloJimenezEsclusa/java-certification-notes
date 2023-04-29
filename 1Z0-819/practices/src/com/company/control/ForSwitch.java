package com.company.control;

public class ForSwitch {
  public static void main(String args[]){
    char i;
    LOOP: for (i=0;i<5;i++){
      System.out.println("init:" + ((int)i));
      switch(i++){
        case '0': System.out.println("A" + ((int)i));
        case 1: System.out.println("B" + ((int)i)); break LOOP;
        case 2: System.out.println("C" + ((int)i)); break;
        case 3: System.out.println("D" + ((int)i)); break;
        case 4: System.out.println("E" + ((int)i));
        case 'E' : System.out.println("F" + ((int)i));
        //default: System.out.println("default:" + ((int)i));
      }
    }
  }
}
