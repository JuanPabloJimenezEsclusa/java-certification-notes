package com.company.control;

@SuppressWarnings("all")
public class NestedInteractionExamples {
  public static void main(String[] args) {
    int hungryHippopotamus = 8;
    while(hungryHippopotamus > 0) {
      do {
        hungryHippopotamus -= 2;
      } while (hungryHippopotamus > 5);
      hungryHippopotamus--;
      System.out.print(hungryHippopotamus + ", ");
    }

    int frog = 15;
    BAD_IDEA: if(frog>10)
      EVEN_WORSE_IDEA: { frog++; }
  }
}
