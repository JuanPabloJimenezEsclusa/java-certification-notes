package com.company.date;

import java.time.*;
import java.time.temporal.ChronoUnit;

@SuppressWarnings("all")
public class BasicExamples {
  public static void main(String[] args) {
    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());
    System.out.println(LocalDateTime.now());
    System.out.println(ZonedDateTime.now());

    var date1 = LocalDate.of(2022, Month.JANUARY, 20);
    var date2 = LocalDate.of(2022, 1, 20);

    var time1 = LocalTime.of(6, 15);           // hour and minute
    var time2 = LocalTime.of(6, 15, 30);       // + seconds
    var time3 = LocalTime.of(6, 15, 30, 200);  // + nanoseconds

    var dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20, 6, 15, 30);
    var dateTime2 = LocalDateTime.of(date1, time1);

    var zone = ZoneId.of("US/Eastern");
    var zoned1 = ZonedDateTime.of(2022,1,20,6,15,30,200, zone);
    var zoned2 = ZonedDateTime.of(date1, time1, zone);
    var zoned3 = ZonedDateTime.of(dateTime1, zone);

    var daily = Duration.ofDays(1);               // Duration.of(1, ChronoUnit.DAYS);
    var hourly = Duration.ofHours(1);             // Duration.of(1, ChronoUnit.HOURS);
    var everyMinute = Duration.ofMinutes(1);      // Duration.of(1, ChronoUnit.MINUTES);
    var everyTenSeconds = Duration.ofSeconds(10); // Duration.of(10, ChronoUnit.SECONDS);
    var everyMilli = Duration.ofMillis(1);        // Duration.of(1, ChronoUnit.MILLIS);
    var everyNano = Duration.ofNanos(1);          // Duration.of(1, ChronoUnit.NANOS);

    System.out.println(daily);           // PT24H
    System.out.println(hourly);          // PT1H
    System.out.println(everyMinute);     // PT1M
    System.out.println(everyTenSeconds); // PT10S
    System.out.println(everyMilli);      // PT0.001S
    System.out.println(everyNano);       // PT0.000000001S

    var one = LocalTime.of(5, 15);
    var two = LocalTime.of(6, 30);
    var date = LocalDate.of(2016, 1, 20);
    System.out.println(ChronoUnit.HOURS.between(one, two));    // 1
    System.out.println(ChronoUnit.MINUTES.between(one, two));  // 75
    //System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException

    LocalTime time = LocalTime.of(3,12,45);
    System.out.println(time); // 03:12:45
    LocalTime truncated = time.truncatedTo(ChronoUnit.MINUTES);
    System.out.println(truncated); // 03:12
    LocalTime truncated2 = time.truncatedTo(ChronoUnit.HOURS);
    System.out.println(truncated2); // 03:00

    var date01 = LocalDate.of(2022, 5, 25);
    var time01 = LocalTime.of(11, 55, 00);
    var zone01 = ZoneId.of("US/Eastern");
    var zonedDateTime01 = ZonedDateTime.of(date01, time01, zone01);
    var instant01 = zonedDateTime01.toInstant();
    System.out.println(zonedDateTime01);                // 2022–05–25T11:55–04:00[US/Eastern]
    System.out.println(instant01);                      // 2022–05–25T15:55:00Z

  }
}
