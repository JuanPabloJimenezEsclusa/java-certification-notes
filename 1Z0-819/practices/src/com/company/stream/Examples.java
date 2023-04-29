package com.company.stream;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Examples {
  public static void main(String[] args) {
    // java.util.stream
    // basic: count, distinct, limit, skip
    // validation: anyMatch allMatch noneMatch
    // search: filter, findFirst, findAny
    // transformation: map mapToInt mapToLong mapToDouble | sum, average, max, min
    //                 flatMap
    // process: peek, sorted, reduce

    List<String> names2 = Arrays.asList("greg", "dave", "don", "ed", "fred");
    Map<Integer, Long> data = names2.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
    System.out.println(data);
    System.out.println(data.values());

    BinaryOperator<String> bo = (s1, s2) -> s1.concat(s2);
    List<String> names = new ArrayList<>();
    names.add("Bill"); names.add("George"); names.add("Obama");
    String finalvalue = names.stream().reduce("Hello : ", bo);
    System.out.println(finalvalue);

    Stream<Integer> values = IntStream.rangeClosed(10, 15).boxed(); //1
    Object obj = values.collect(Collectors.partitioningBy(x -> x % 2 == 0)); //2
    System.out.println(obj);

    var result1 = Stream.of(2, 5, 3, 3, 6, 2, 4).distinct().count();
    System.out.println(result1);

    var result2 = Stream.of("Camila", "Lucas", "Mariela", "Lorena", "Juan").anyMatch(n -> n.endsWith("d"));
    System.out.println(result2);

    // Optional OptionalInt OptionalDouble
    Optional<Integer> integer1 = Optional.of(10);
    OptionalInt int1 = OptionalInt.of(Integer.valueOf(15));
    System.out.println(integer1.get() + " " + int1.getAsInt());

    Integer[][] data1 = {{8, 3, 5}, {2, 11, 7}, {4, 1, 9, 6}};
    var result3 = Arrays.stream(data1)
      .flatMapToInt(integers -> Arrays.stream(integers).mapToInt(value -> value))
      .max().getAsInt();
    System.out.println(result3);

    double sum1 = DoubleStream.of(0, 2, 4).filter(value -> value % 2 != 0).sum();
    System.out.println(sum1);

    var result4 = Arrays.asList("Java EE", "C#", "Python").stream().allMatch(s -> {
      System.out.println("Testing: " + s);
      return s.equals("Java");
    });
    System.out.println(result4);

    Stream.of(
        new Person("Alexandra", 43),
        new Person("Ignacio", 2),
        new Person("Isabela", 14),
        new Person("Manuel", 40))
      .sorted(Comparator.comparing(person -> person.age))
      .forEach(System.out::println);

    Integer integer2 = Stream.of(20, 5, 8, 3, 9)
      .reduce((a, b) -> a + b)
      .get();
    System.out.println(integer2);

    // get the sum of three lowers pairs numbers
    var result5 = Stream.of(11, 20, 5, 8, 3, 9, 4, 10, 2)
      .mapToInt(value -> value)
      .filter(value -> value % 2 == 0)
      .sorted()
      .limit(3)
      .sum();
    System.out.println(result5);

    var result6 = Stream.of(11, 20, 5, 8, 3, 9, 4, 10, 2)
      .filter(integer -> integer % 2 == 0)
      .sorted()
      .limit(3)
      .reduce(Integer::sum)
      .get();
    System.out.println(result6);

    // R Collect(Collector<? super T,A,R> collector)
    Map<String, Integer> map1 = Stream.of(
        new Person("Josefina", 67),
        new Person("Ignacio", 67),
        new Person("Coromoto", 73),
        new Person("Ramon", 72))
      .collect(Collectors.toMap(person -> person.name, person -> person.age));
    map1.forEach((s, integer) -> System.out.println(s + ":" + integer));

    Stream.of(
        new Person("Alexandra", 43),
        new Person("Ignacio", 2),
        new Person("Isabela", 14),
        new Person("Manuel", 40),
        new Person("Josefina", 67),
        new Person("Ignacio", 67),
        new Person("Coromoto", 73),
        new Person("Ramon", 72))
      .collect(Collectors.partitioningBy(person -> person.age >= 18))
      .forEach((aBoolean, people) -> System.out.println(aBoolean + ":" + people));

    var result7 = Stream.of(
        new City("Barcelona", 14.0f),
        new City("Bogotá", 10.9f),
        new City("Caracas", 28.7f),
        new City("Buenos Aires", 24f))
      .collect(Collectors.averagingDouble(value -> value.temperature));
    System.out.println(result7);

    var result8 = Stream.of(
        new City("Barcelona", 14.0f),
        new City("Bogotá", 10.9f),
        new City("Caracas", 28.7f),
        new City("Buenos Aires", 24f))
      .mapToDouble(value -> value.temperature)
      .average().getAsDouble();
    System.out.println(result8);

    // class/object::method
    Stream.of(
        new Person("Isabela", 14),
        new Person("Ignacio", 2),
        new Person("Alexandra", 43))
      .map(person -> person.name)
      .sorted((String::compareToIgnoreCase))
      .forEach(System.out::println);

    var result9 = new ArrayList<>(List.of(
      new Person("Tom", 44),
      new Person("Aman", 40),
      new Person("Peter", 40)));
    result9.sort(
      Comparator
        .comparing(Person::getAge)
        .thenComparing(Person::getName)
        .reversed());
    result9.forEach(System.out::println);

    IntStream s = IntStream.empty();
    System.out.print(s.average().getAsDouble());
  }
}

class Person {
  public String name;
  public int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public String toString() {
    return this.name + " " + this.age;
  }
}

class City {
  public String name;
  public float temperature;

  public City(String name, float temperature) {
    this.name = name;
    this.temperature = temperature;
  }

  public String toString() {
    return name + ":" + temperature;
  }
}
