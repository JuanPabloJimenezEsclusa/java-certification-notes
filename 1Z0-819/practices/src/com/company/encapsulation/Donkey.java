package com.company.encapsulation;

public class Donkey implements Movable {
  int location = 200;

  public void move(int by) {
    location = location + by;
  }

  public void moveBack(int by) {
    location = location - by;
  }
}
