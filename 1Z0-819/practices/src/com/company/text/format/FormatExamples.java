package com.company.text.format;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class FormatExamples {
  public static void main(String[] args) {

    double salary = 1256.678;
    // java.text | abstract
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.ITALY);
    System.out.println(numberFormat.format(salary));
    NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(new Locale("es", "VE"));
    System.out.println(numberFormat2.format(salary));

    // java.text | abstract
    DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, new Locale("es", "VE"));
    System.out.println(dateFormat.format(new Date()));

    // java.time.format
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.KOREAN);
    System.out.println(dateTimeFormatter.format(LocalDate.now()));
  }
}
