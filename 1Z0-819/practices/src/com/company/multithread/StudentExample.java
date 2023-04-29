package com.company.multithread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class StudentExample {
  private Map<String, Integer> marksObtained = new HashMap<String, Integer>();
  private ReadWriteLock lock = new ReentrantReadWriteLock();

  public void setMarksInSubject(String subject, Integer marks) {
    lock.writeLock().lock(); //1
    try {
      marksObtained.put(subject, marks);
    } finally {
      lock.writeLock().unlock(); //2
    }
  }

  public double getAverageMarks() {
    lock.readLock().lock(); //3
    double sum = 0.0;
    try {
      for (Integer mark : marksObtained.values()) {
        sum = sum + mark;
      }
      return sum / marksObtained.size();
    } finally {
      lock.readLock().unlock();//4
    }
  }

  public static void main(String[] args) {

    final StudentExample student = new StudentExample();

    //create one thread that keeps adding marks
    new Thread() {
      public void run() {
        int x = 0;
        while (true) {
          int m = (int) (Math.random() * 100);
          student.setMarksInSubject("Sub " + x, m);
          x++;
        }
      }
    }.start();

    //create 5 threads that get average marks
    for (int i = 0; i < 5; i++) {
      final String name = "" + i;
      new Thread() {
        public void run() {
          while (true) {
            double av = student.getAverageMarks();
            System.out.println("(" + name + ")" + av);
          }
        }
      }.start();
    }
  }

}
