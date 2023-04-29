package com.company.multithread;

import java.util.Random;
import java.util.concurrent.Executor;

public class ClassicalExamples {
  static Integer counter = 0;

  public static void main(String [           ] args) {
    var task1 = new Task1();
    var task2 = new Task2();
    var task3 = new Thread(new Task3());

    task1.start();
    task2.start();
    task3.start();
  }
}

class Task1 extends Thread {
  public void run() {
    var random = new Random();
    var value = 1000; //random.nextInt(10000);
    System.out.println("Task 1! " + value + " - " + ClassicalExamples.counter);
    try {
      Thread.sleep(value);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Task 1! " + ++ClassicalExamples.counter);
  }
}

class Task2 extends Thread {
  public void run() {
    var random = new Random();
    var value = 1000; //random.nextInt(10000);
    System.out.println("Task 2! " + value + " - " + ClassicalExamples.counter);
    try {
      Thread.sleep(value);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Task 2! " + ++ClassicalExamples.counter);
  }
}

class Task3 implements Runnable {
  public void run() {
    var random = new Random();
    var value = 1000; //random.nextInt(10000);
    System.out.println("Task 3! " + value + " - " + ClassicalExamples.counter);
    try {
      Thread.sleep(value);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Task 3! " + ++ClassicalExamples.counter);
  }
}


