# 1Z0-829 notes

## New features to practice

* text blocks
* path matching
* switch expressions
* java.time
* sealed/non-sealed class modifier
* records
* inner class static methods

## Known features to reinforce

```txt
1.1 Use primitives and wrapper classes, including, operators, parentheses, type promotion and casting
1.2 Handle text using String and StringBuilder classes
1.3 Use local variable type inference, including as lambda parameters
2.4 Understand variable scopes, apply encapsulation and make objects immutable
2.5 Create and use subclasses and superclasses, including abstract classes
2.6 Utilize polymorphism and casting to call methods, differentiate object type versus reference type
2.7 Create and use interfaces, identify functional interfaces, and utilize private, static, and default methods
4.1 Use generics, including wildcards
4.2 Use a Java array and List, Set, Map and Deque collections, including convenience methods
5.2 Use Java Streams to filter, transform and process data
6.2 Declare, use, and expose modules, including the use of services
7.1 Create worker threads using Runnable and Callable, and manage concurrency using an ExecutorService and java.util.concurrent API
8.2 Implement serialization and deserialization techniques on Java objects
8.3 Handle file system objects using java.nio.file API
```

## Recap concepts

```txt
Java is a “pass-by-value” language
```

```txt
To override a method, you must follow a number of rules.

The compiler performs the following checks when you override a method:
1. The method in the child class must have the same signature as the method in the parent class.
2. The method in the child class must be at least as accessible as the method in the parent class.
3. The method in the child class may not declare a checked exception that is new or broader than the class of any
    exception declared in the parent class method.
4. If the method returns a value, it must be the same or a subtype of the method in the parent class, known as covariant return types.
```

```txt
Although there are a variety of techniques for writing an immutable class,
  you should be familiar with a common strategy for making a class immutable:
1. Mark the class as final or make all of the constructors private .
2. Mark all the instance variables private and final .
3. Don’t define any setter methods.
4. Don’t allow referenced mutable objects to be modified.
5. Use a constructor to set all properties of the object, making a copy if needed.
```

## References

* books:
  * OCP Oracle Certified Professional Java SE 17 Developer Study Guide: Exam 1Z0-829
  * OCP Oracle Certified Professional Java SE 17 Developer Practice Tests: Exam 1Z0-829
* video chanel: [@LetsGetCertified](https://www.youtube.com/@LetsGetCertified)
* forum/simulator: [OCA OCP Java Programmer Certification Questions Discussion](https://enthuware.com/forum/viewforum.php?f=2)
