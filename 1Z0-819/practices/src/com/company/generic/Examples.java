package com.company.generic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Base{
  public <T extends Number, Z extends Number> Map<T, Z> getMap(T t, Z z) {
    return new HashMap<T, Z>();
  }
}

@SuppressWarnings("all")
class Derived extends Base{
  public <T, Z> TreeMap<T, Z> getMap(T t, Z z) { return new TreeMap<T, Z>(); } //1
  //public Map<Number, Number> getMap(Number t, Number z) { return new TreeMap<Number, Number>(); } //2
  public Map<Integer, Integer> getMap(Number t, Number z) { return new HashMap<Integer, Integer>(); }   //3
}

@SuppressWarnings("all")
public class Examples {
  public static void main(String[] args) {
    Derived derived = new Derived();
    derived.getClass();
  }
}
