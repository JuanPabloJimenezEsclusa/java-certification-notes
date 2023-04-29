package com.company.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

@SuppressWarnings("all")
public class ZooExample {
  public static void main(String[] args) {
    var start = LocalDate.of(2022, Month.JANUARY, 1);
    var end = LocalDate.of(2022, Month.MARCH, 30);
    performAnimalEnrichment(start, end);

    var period = Period.ofMonths(1);  // create a period
    System.out.println(period);  // P1Y2M3D
    performAnimalEnrichment(start, end, period);
  }
  private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
    var upTo = start;
    while (upTo.isBefore(end)) { // check if still before end
      System.out.println("give new toy: " + upTo);
      upTo = upTo.plusMonths(1); // add a month
    }
  }

  private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) { // uses the generic period
    while (start.isBefore(end)) {
      System.out.println("give new toy: " + start);
      start = start.plus(period); // adds the period
    }
  }

}
