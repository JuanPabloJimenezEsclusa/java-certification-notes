package com.company.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

class Data {
  int value;

  public Data(int x) {
    this.value = x;
  }

  public String toString() {
    return "" + value;
  }
}

class MyFilter implements Predicate<Data> {
  public boolean test(Data d) {
    return d.value == 0;
  }
}

public class ChangeIterator {
  // public static void filterData(ArrayList<Data> dataList, Predicate<Data> f) {
  public static void filterData(ArrayList<Data> dataList, MyFilter f) {
    Iterator<Data> i = dataList.iterator();
    while (i.hasNext()) {
      if (f.test(i.next())) {
        i.remove();
      }
    }
  }

  public static void main(String[] args) {
    ArrayList<Data> al = new ArrayList<Data>();
    Data d = new Data(1); al.add(d);
    d = new Data(2);      al.add(d);
    d = new Data(0);      al.add(d);
    //filterData(al, x -> x.value == 0);
    //filterData(al, new MyFilter());  //1
    System.out.println(al);

    Float f1 = 10.0f;
    Float f2 = 0.0f;
    Float f3 = Float.POSITIVE_INFINITY;
    double f = Double.POSITIVE_INFINITY;

    try{
      f = f1/f2;
      System.out.println(f);
      f3 = f1/f2;
    } catch(Exception e) {
      System.out.println("Exception");
    }
    System.out.println(f3.isInfinite());
  }
}
