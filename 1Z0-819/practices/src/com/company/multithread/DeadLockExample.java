package com.company.multithread;

import java.util.concurrent.Executors;

class Account{
  private String id;
  private double balance;
  public Account(String id, double balance) { this.id = id;  this.balance = balance; }
  public double getBalance() { return balance; }
  public void setBalance(double balance) { this.balance = balance; }
}

class Transfer implements Runnable{
  final Account from, to;
  final double amount;
  public Transfer(Account from, Account to, double amount) { this.from = from; this.to = to; this.amount = amount; }
  public void run(){
    synchronized(from){
      from.setBalance(from.getBalance() - amount);
      synchronized(to){
        to.setBalance(to.getBalance() + amount);
      }
    }
  }
}

public class DeadLockExample {
  public static void main(String $_1 [            ]) {
    var es = Executors.newCachedThreadPool();
    var a1 = new Account("A1", 1000);
    var a2 = new Account("A2", 5000);
    es.submit(new Transfer(a1, a2, 200));
    es.submit(new Transfer(a2, a1, 300));
  }
}
