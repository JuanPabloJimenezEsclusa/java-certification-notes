package com.company.nested;

import java.util.stream.IntStream;

public class Home {
  private String greeting = "Hi";

  protected class Room { // Inner class declaration
    public int repeat = 3;

    public void enter() {
      for (int i = 0; i < repeat; i++) greet(greeting);
      IntStream.rangeClosed(1,3).forEach(index -> greet(greeting + " " + index));
    }

    private static void greet(String message) {
      System.out.println(message);
    }
  }

  public void enterRoom() { // Instance method in outer class
    var room = new Room(); // Create the inner class instance
    room.enter();
    Room.greet(greeting + " - Room");
  }

  public static void main(String[] args) {
    var home = new Home();
    home.enterRoom();
    Home.Room.greet("Use static method in outer class - Home");

    Room room = home.new Room(); // Create the inner class instance
    room.enter();
  }
}
