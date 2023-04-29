package com.company.multithread.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

// class ItemProcessor implements Runnable {  //LINE 1
class ItemProcessor extends Thread {  //LINE 1
  private CyclicBarrier cb;
  public ItemProcessor(CyclicBarrier cb) { this.cb = cb; }
  public void run() {
    System.out.println("processed");
    try { cb.await(); } catch (Exception ex) { ex.printStackTrace(); }
  }
}

class Merger implements Runnable { //LINE 2
  public void run(){ System.out.println("Value Merged"); }
}

public class CyclicTester {
  public static void main(String[] args) throws Exception {
    var m = new Merger();
    //CyclicBarrier cb = new CyclicBarrier(1, m); //LINE 3
    CyclicBarrier cb = new CyclicBarrier(2, m); //LINE 3

    var ip = new ItemProcessor(cb);
    ip.start(); //LINE 4
    cb.await();
  }
}
