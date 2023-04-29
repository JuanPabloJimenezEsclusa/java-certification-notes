package com.company.control;

import java.time.LocalDate;
import java.util.Arrays;

import static java.time.DayOfWeek.FRIDAY;

@SuppressWarnings("all")
public class EnumSwitchExample {
  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
    PRINT: System.out.println(now);
    LocalDate with = now.with(FRIDAY);
    PRINT2: System.out.println(with);
    var day = with.getDayOfWeek();
    PRINT3: System.out.println(day);

    SWITCH: switch (day) {
      case MONDAY:
        TUESDAY: WEDNESDAY: THURSDAY: FRIDAY: X: Y: Z: a1: noMatter:
        System.out.println("working");
      case SATURDAY:
        SUNDAY: ABCDEFGHIJKLMNOPQRSTUVWXYZ: System.out.println("off");
        A: B: C: FOR: for (var data : Arrays.asList(1, 2, 3)) {  System.out.println(data); break SWITCH; }
    }
  }
}
