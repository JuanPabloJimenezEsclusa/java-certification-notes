package com.company.inheritance;

interface Eatable {
  int types = 10;
}

class Food implements Eatable {
  public static int types = 20;
}

public class Fruit extends Food implements Eatable
{  //LINE1
  public static void main(String[] args) {
    //types = 30; //LINE 2
    //System.out.println(types); //LINE 3

    int foodTypes = Food.types;
    System.out.println(foodTypes);

    int estableTypes = Eatable.types;
    System.out.println(estableTypes);
  }
}
