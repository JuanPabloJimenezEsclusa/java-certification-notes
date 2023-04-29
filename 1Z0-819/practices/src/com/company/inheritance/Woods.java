package com.company.inheritance;

public class Woods {
  private static class Tree {}

  public static void main(String[] leaves) {
    int water = 10+5;
    final class Oak extends Tree {  // p1
      public int getWater() {
        return water;  // p2
      }
    }
    System.out.println(new Oak().getWater());
    System.out.println(new Tree().getClass());
    System.out.print(new Woods.Tree().getClass());
  }
}
