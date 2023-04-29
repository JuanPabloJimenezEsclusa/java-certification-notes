package com.company.annotation;

import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AnnotationExamples {

  @SuppressWarnings("unused")
  @LogAnnotation(level = EnumValues.THREE)
  @LogAnnotation(level = EnumValues.ONE)
  public void testAnnotation(String message) {
    System.out.println(message);
  }

  @SuppressWarnings({"unchecked", "unused"})
  public void test() {
    List<Double> lst = new ArrayList<>();
    lst.add(3.5);
    List<Integer> lsti = (List<Integer>)(List) lst;
    System.out.println(lsti);
  }

  @SafeVarargs
  @SuppressWarnings("unused")
  public static void safeStatic(List<String>... strings) {
    System.out.println(strings.length);
  }

  @SuppressWarnings({"unused"})
  public final void safeFinal(List<String>... strings) {
    System.out.println(strings.length);
  }

  public static void main (String [] args) {
    new Interpreter().process(new AnnotationExamples());
  }
}

class Interpreter {
  public void process(AnnotationExamples annotationExamples) {
    try {
      Arrays.stream(annotationExamples.getClass().getMethods()).forEach(method -> {
        Optional<LogAnnotations> logAnnotations = Optional.ofNullable(method.getAnnotation(LogAnnotations.class));
        logAnnotations.ifPresent(logAnnotations1 -> Arrays.stream(logAnnotations1.value()).forEach(annotation -> {
          try {
            switch(annotation.level()) {
              case ONE:
                method.invoke(annotationExamples, "It's ONE!");
                break;
              case TWO:
                method.invoke(annotationExamples, "It's' TWO!");
                break;
              case THREE:
                method.invoke(annotationExamples, "It's' THREE!");
                break;
            }
          } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
          }
        }));
      });
    } catch (Exception e) {
      System.err.println(e);
    }
  }
}

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface LogAnnotations {
  // types: primitives, wrappers, String, Enum, Arrays of them
  // name value is required
  LogAnnotation[] value();

  // whatever variable must have a defualt value
  int id() default 0;
}

@Repeatable(LogAnnotations.class)
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface LogAnnotation {
  // types: primitives, wrappers, String, Enum, Arrays of them
  EnumValues level() default EnumValues.THREE;
}

enum EnumValues {
  ONE, TWO, THREE;
}
