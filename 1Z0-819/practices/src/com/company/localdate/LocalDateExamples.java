package com.company.localdate;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class LocalDateExamples {
  static public final void main (String... args) {
    System.out.println("Hi!");

    LocalDate ld1 = LocalDate.of(2021, Month.NOVEMBER, 4);
    LocalTime lt1 = LocalTime.of(20,10,11);
    LocalDateTime ldt1 = LocalDateTime.of(ld1,lt1);
    ZoneId zone = ZoneId.of("Europe/Madrid");
    ZonedDateTime zdt1 = ZonedDateTime.of(ldt1, zone);

    System.out.println(ld1);  // 2021-11-04
    System.out.println(lt1);  // 20:10:11
    System.out.println(ldt1); // 2021-11-04T20:10:11
    System.out.println(zdt1); // 2021-11-04T20:10:11+01:00[Europe/Madrid]

    LocalDate f1 = LocalDate.of(2020, Month.DECEMBER, 1);
    LocalDateTime ldt2 = LocalDateTime.of(2022, 9, 30, 20, 11, 15);
    LocalDate fn = f1.minusDays(1l);
    LocalDateTime ldtn = ldt2.plusSeconds(50l);

    System.out.println(f1);   // 2020-12-01
    System.out.println(fn);   // 2020-11-30
    System.out.println(ldtn); // 2022-09-30T20:12:05

    var i1 = Instant.now();
    var i2 = Instant.ofEpochSecond(2_000_000); // 2023-01-22T13:27:06.096316Z - 1970-01-24T03:33:20Z
    System.out.println(i1 + " - " + i2);

    var f01 =  LocalDate.of(2020, Month.NOVEMBER, 11);
    var f02 = LocalDate.of(2020, Month.NOVEMBER, 30);
    var fldt1 = LocalDateTime.of(2020, 11, 20, 22, 30, 15);
    var fldt2 = LocalDateTime.of(2020, 11, 21, 01, 30, 15);

    // Period.between compares only date: yyyy/MM/dd, not time ------------------------- EYE!
    System.out.println(Period.between(f01, f02)); // P19D
    System.out.println(Period.between(fldt1.toLocalDate(), fldt2.toLocalDate())); // P1D
    Duration d1 = Duration.ofDays(2);
    Duration d2 = Duration.ofSeconds(150);
    Duration d3 = Duration.ofHours(4);
    Duration d4 = d3.plus(d2);
    System.out.println(d1 + " - " + d2 + " - " + d3 + " - " + d4);

    Instant in1 = Instant.now();
    Instant in2 = in1.plus(2, ChronoUnit.HOURS);
    ZonedDateTime zdt01 = in1.atZone(ZoneId.of("America/New_York"));
    ZonedDateTime zdt02 = in2.atZone(ZoneId.of("Europe/Madrid"));
    System.out.println(zdt01 + " - " + zdt02);

    // Duration.between compares date and time ------------------------- EYE!
    System.out.println(Duration.between(zdt01, zdt02));  // PT2H

    LocalDateTime ld11 = LocalDateTime.of(2022, 10,30,2,30,30);
    ZonedDateTime zdt11 = ZonedDateTime.of(ld11, ZoneId.of("Europe/Madrid"));
    ZonedDateTime zdt12 = zdt11.plusHours(1);
    System.out.println(zdt11);                            // 2022-10-30T02:30:30+02:00[Europe/Madrid]
    System.out.println(zdt12);                            // 2022-10-30T02:30:30+01:00[Europe/Madrid]
    System.out.println(Duration.between(zdt11, zdt12));   // PT1H
    System.out.println(zdt11.getOffset());                // +02:00
    System.out.println(zdt12.getOffset());                // +01:00

    // New York change Spring zone time (2022/03/13 02:00)  ++1 hour
    LocalDateTime ld21 = LocalDateTime.of(2022, 3,13,1,30,30);
    ZonedDateTime zdt21 = ZonedDateTime.of(ld21, ZoneId.of("America/New_York"));
    ZonedDateTime zdt22 = zdt21.plusDays(1);
    System.out.println(zdt21.toLocalDateTime() + " " + zdt21);
    System.out.println(zdt22.toLocalDateTime() + " " + zdt22);

    // New York change Spring zone time (2022/03/13 02:00)  ++1 hour
    LocalDateTime ld22 = LocalDateTime.of(2022, 3,13,1,30,30);
    ZonedDateTime zdt23 = ZonedDateTime.of(ld22, ZoneId.of("America/New_York"));
    ZonedDateTime zdt24 = zdt23.plusHours(1);
    ZonedDateTime zdt25 = zdt23.minusHours(1);
    System.out.println(zdt24.toLocalDateTime() + " " + zdt24);
    System.out.println(zdt25.toLocalDateTime() + " " + zdt25);
    System.out.println(Duration.between(zdt25, zdt24));

    int age = 22;
    final String name = "Josephine";
    assert age != age : ( 1 < age ? "error" : 10);
  }
}
