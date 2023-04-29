package com.company.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

class Data {
  public volatile int d1 = 0;
  public AtomicInteger d2 = new AtomicInteger(0);
}

@SuppressWarnings("all")
public class SafeCodeExample {
  public static void main(String[] args) {
    Data data = new Data();
    Runnable r1 = () -> {
      Thread t1 = Thread.currentThread();
      for (; data.d1 < 2; ) {
        System.out.print(t1.getName() + " : " + data.d1 + " ");
        data.d1++;
      }
    };
    Runnable r2 = () -> {
      Thread t1 = Thread.currentThread();
      for (; data.d2.get() < 2; ) {
        System.out.print(t1.getName() + " : " + data.d2.get() + " ");
        data.d2.getAndIncrement();
      }
    };
    Thread t1 = new Thread(r1, "T1");
    Thread t2 = new Thread(r2, "T2");
    t1.start();
    t2.start();
  }
}
