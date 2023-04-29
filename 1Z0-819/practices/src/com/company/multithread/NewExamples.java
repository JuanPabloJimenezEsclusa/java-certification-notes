package com.company.multithread;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class NewExamples {

  public static void main(String [] args) throws ExecutionException, InterruptedException {
    // ExecutorService.newCachedThreadPools
    // ExecutorService.newFixedThreadPools
    // ExecutorService.newSingleThreadExecutor
    // ExecutorService.newScheduledThreadPools
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    Future<?> future1 = executorService.submit(() -> System.out.println("Hi LIJM"));
    System.out.println(future1.get());
    executorService.shutdown();
    System.out.println(executorService.isShutdown() + " - "  + executorService.isTerminated());

    ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
    Future<String> future2 = cachedThreadPool.submit(() -> "Hello CILM");
    while (!future2.isDone()) {
      System.out.println("Waiting!");
    }
    System.out.println(future2.get());
    cachedThreadPool.shutdown();
    System.out.println(cachedThreadPool.isShutdown() + " - "  + cachedThreadPool.isTerminated());

    CyclicBarrier cyclicBarrier = new CyclicBarrier(3, () -> System.out.println("barrier!"));

    ExecutorService cachedThreadPool2 = Executors.newScheduledThreadPool(6);
    cachedThreadPool2.submit(() -> new NewTask1(1, cyclicBarrier).printSomething());
    cachedThreadPool2.submit(() -> new NewTask1(2, cyclicBarrier).printSomething());
    cachedThreadPool2.submit(() -> new NewTask1(3, cyclicBarrier).printSomething());
    cachedThreadPool2.submit(() -> new NewTask1(4, cyclicBarrier).printSomething());
    cachedThreadPool2.submit(() -> new NewTask1(5, cyclicBarrier).printSomething());
    cachedThreadPool2.submit(() -> new NewTask1(6, cyclicBarrier).printSomething());
    cachedThreadPool2.shutdown();
    System.out.println(cachedThreadPool2.isShutdown() + " - "  + cachedThreadPool2.isTerminated());
  }
}

class NewTask1 {
  private static Integer counter = 0;

  //private final ReadWriteLock lock = new ReentrantReadWriteLock();
  //private final StampedLock lock = new StampedLock();
  private final Lock lock = new ReentrantLock();
  private int flag;
  private CyclicBarrier cyclicBarrier;

  NewTask1(int flag) {
    this.flag = flag;
  }

  NewTask1(int flag, CyclicBarrier cyclicBarrier) {
    this.flag = flag;
    this.cyclicBarrier = cyclicBarrier;
  }

  public void printSomething() {
    var random = new Random();
    var value = random.nextInt(10000);

    try {
      lock.lock();
      System.out.println("Task " + flag + "!: " + value + " - " + ++counter);
      cyclicBarrier.await();
    } catch (BrokenBarrierException| InterruptedException e) {
      e.printStackTrace();
    } finally {
      System.out.println("Task " + flag + "!: unlock");
      lock.unlock();
    }
  }
}
