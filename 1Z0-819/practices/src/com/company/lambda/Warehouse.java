package com.company.lambda;

import java.util.function.BooleanSupplier;

public class Warehouse {
  private int quantity = 40;
  private final BooleanSupplier stock;
  {
    stock = () -> quantity > 0;
  }
  public void checkInventory() {
    //if(stock.get())
    if(stock.getAsBoolean())
      System.out.print("Plenty!");
    else {
      System.out.print("On Backorder!");
    }
  }
  public static void main(String... widget) {
    final Warehouse w13 = new Warehouse();
    w13.checkInventory();
  }
}
