package com.company.date;

import java.time.*;
import java.time.temporal.ChronoUnit;

@SuppressWarnings("all")
public class DayLightExamples {
  public static void main(String[] args) {
    var date = LocalDate.of(2022, Month.MARCH, 13);
    var time = LocalTime.of(1, 30);
    var zone = ZoneId.of("US/Eastern");
    var dateTime = ZonedDateTime.of(date, time, zone);
    System.out.println(dateTime);                // 2022–03-13T01:30-05:00[US/Eastern]
    System.out.println(dateTime.getHour());      // 1
    System.out.println(dateTime.getOffset());    // -05:00

    dateTime = dateTime.plusHours(1);
    System.out.println(dateTime);                // 2022–03-13T03:30-04:00[US/Eastern]
    System.out.println(dateTime.getHour());      // 3
    System.out.println(dateTime.getOffset());    // -04:00

    LocalDateTime ld1 = LocalDateTime.of(2022, Month.NOVEMBER, 6, 2, 0);
    ZonedDateTime zd1 = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
    LocalDateTime ld2 = LocalDateTime.of(2022, Month.NOVEMBER, 6, 1, 0);
    ZonedDateTime zd2 = ZonedDateTime.of(ld2, ZoneId.of("US/Eastern"));
    long x = ChronoUnit.HOURS.between(zd1, zd2);
    System.out.println(x); // -2
  }
}
