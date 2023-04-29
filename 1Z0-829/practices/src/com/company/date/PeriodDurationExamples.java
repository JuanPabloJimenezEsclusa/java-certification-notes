package com.company.date;

import java.time.Duration;
import java.time.Period;

public class PeriodDurationExamples {
  public static void main(String[] args) {
    Duration d = Duration.ofDays(1);
    System.out.println(d);
    d = Duration.ofHours(0); // Duration.ofMinutes(0); Duration.ofSeconds(0); Duration.ofNanos(0);
    System.out.println(d);
    Period p = Period.ofMonths(0); // Period.ofYears(0); Period.ofDays(0); Period.ofWeeks(0);
    System.out.println(p);
  }
}
