package com.company.lambda;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Examples { //                                                                                                                                   43
  public static void main(String [] args) { //                                                                                                               --
    // Predicate<T>     -> boolean test(T)  | BiPredicate     DoublePredicate       IntPredicate      LongPredicate                                           5
    // Function<T,R>    -> R apply(T)       | BiFunction      DoubleFunction        IntFunction       LongFunction                                           17
    // Consumer<T>      -> void accept(T)   | BiConsumer      DoubleConsumer        IntConsumer       LongConsumer                                            8
    // Supplier<T>      -> T get()          |         DoubleSupplier(getAsDouble) IntSupplier(getAsInt) LongSupplier(getAsLong) BooleanSupplier(getAsBoolean) 5
    // UnaryOperator<T> -> T apply(T)       |                 DoubleUnaryOperator   IntUnaryOperator  LongUnaryOperator                                       8
    //                                      | BinaryOperator  DoubleBinaryOperator  IntBinaryOperator LongBinaryOperator
    // ---------------------------------------------------------------------------------------------------------------------
    // Function<T,R>  | DoubleToIntFunction DoubleToLongFunction IntToDoubleFunction IntToLongFunction LongToDoubleFunction LongToIntFunction
    // Function<T,R>  | ToDoubleFunction ToDoubleBiFunction ToIntFunction ToIntBiFunction ToLongFunction ToLongBiFunction
    // Consumer<T>    | ObjDoubleConsumer ObjIntConsumer ObjLongConsumer

    Supplier<Integer> supplier =  () -> null;
    IntSupplier intSupplier = () -> 4;
    LongSupplier longSupplier = () -> '1';
    DoubleSupplier doubleSupplier = () -> 2.0f;
    BooleanSupplier booleanSupplier = () -> 1 == 2;

    System.out.println(supplier.get() + " " + intSupplier.getAsInt() + " "
      + longSupplier.getAsLong() + " " + doubleSupplier.getAsDouble() + " " + booleanSupplier.getAsBoolean());

    Consumer<Integer> consumer = (Integer a) -> { System.out.println("Hello: " + a); };
    IntConsumer intConsumer = (int a) -> { System.out.println("Hello: " + a); };
    consumer.accept(8);
    intConsumer.accept(10);

    Function<Integer, Integer> function = x -> x * x;
    function.apply(15);

    IntFunction intFunction = (int y) -> y * y ^ y;
    System.out.println(intFunction.apply(9));

    IntUnaryOperator intUnaryOperator = (int z) -> z ^ z * z;
    System.out.println(intUnaryOperator.applyAsInt(9));

    BiConsumer<Integer, Float> integerFloatBiConsumer = (n1, n2) -> {
      n1 += 20;
      System.out.println(n1 + n2);
    };
    integerFloatBiConsumer.accept(10, 5f);

    Predicate<Integer> predicate = (@SuppressWarnings("unchecked") var c) -> c instanceof Integer;
    System.out.println(predicate.test(16));

    List<String> textos = Arrays.asList("mi texto", "hello", "el mas largo");
    textos.sort((a,b) -> a.length() - b.length());
    textos.forEach(s -> System.out.println(s));

    List<Person> persons = new ArrayList<>(List.of(
      new Person("camila", 14),
      new Person("lucas", 2),
      new Person("mariela", 43)));
    persons.sort((a, b) -> a.age - b.age);
    persons.forEach(System.out::println);

    List<Integer> nums = List.of(10,4,21,3,17,8,20,11);
    var numArrays = nums.stream()
      .filter(num -> num % 2 == 0)
      .sorted(Comparator.reverseOrder())
      .collect(Collectors.toCollection(ArrayList::new));
    numArrays.forEach(System.out::println);

    List<Integer> nums2 = List.of(100,40,211,33,177,80,200,111,211);
    var numArrays2 = nums2.stream()
      .filter(num -> num % 2 != 0)
      .distinct()
      //.collect(Collectors.toCollection(HashSet::new)).stream()
      .sorted(Comparator.reverseOrder())
      .collect(Collectors.toUnmodifiableList());
    numArrays2.forEach(System.out::println);

  }
}

class Person {
  public String name;
  public int age;

  public Person (String name, int age){
    this.name = name;
    this.age = age;
  }
  public String toString() {
    return this.name + "-" + this.age;
  }
}
