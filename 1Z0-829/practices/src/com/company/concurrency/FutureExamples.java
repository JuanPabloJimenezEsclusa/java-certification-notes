package com.company.concurrency;

import java.util.concurrent.*;

class MyCallable implements Callable<String> {
  public String call() throws Exception {
    Thread.sleep(50000);
    return "DONE";
  }
}

public class FutureExamples {
  static int a;
  int b;

  public FutureExamples() {
    int c;
    c = a;
    a++;
    b += c;
    System.out.println("a: (" + a + ") b: (" + b + ") c: (" + c + ")");
  }

  public static void main(String[] args) throws ExecutionException, TimeoutException, InterruptedException {
    new FutureExamples();

    var es = Executors.newSingleThreadExecutor();
    var future = es.submit(new MyCallable());
    try {
      System.out.println(future.get(5000, TimeUnit.MILLISECONDS)); //1
    } finally {
      es.shutdownNow(); //2
    }
  }
}
