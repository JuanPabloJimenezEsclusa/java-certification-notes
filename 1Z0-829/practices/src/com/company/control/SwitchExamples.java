package com.company.control;

@SuppressWarnings("all")
public class SwitchExamples {
  public static void main(String[] args) {
    var animal = 1;
    switch (animal) {
      case 1, 2:
        System.out.print("Lion");
      case 3:
        System.out.print("Tiger");
    }

    final var two = 2;
    final short three = 3;
    switch (animal) {
      case 1:
      case two:
        System.out.print("Lion");
      case three:
        System.out.print("Tiger");
    }

    switch (animal) {
      // Comments
    }

    var result = switch (animal) {
      default -> 1;
    };

  }

  public void printDayOfWeek(int day) {
    switch (day) {
      case 0:               System.out.print("Sunday"); break;
      case 1:               System.out.print("Monday"); break;
      case 2:               System.out.print("Tuesday"); break;
      case (short) 3:       System.out.print("Wednesday"); break;
      case 4:               System.out.print("Thursday"); break;
      case (int) (2.5 * 2): System.out.print("Friday"); break;
      case 2 * 3:           System.out.print("Saturday"); break;
      //default:              System.out.print("Invalid value"); break;
    }
  }

  public void printDayOfWeekExpresion(int day) {
    var result = switch (day) {
      case 0/10   -> "Sunday";
      case -1*-1  -> { yield "Monday"; }
      case 2*1    -> "Tuesday";
      case 3*1    -> "Wednesday";
      case 2*2    -> "Thursday";
      case 5      -> "Friday";
      case 2*3    -> "Saturday";
      default     -> "Invalid value"; // semicolons!
    }; // semicolon!
    System.out.print(result);
  }


  /**
   * 1. All of the branches of a switch expression that do not throw an exception must return a consistent data type (if the switch expression returns a value).
   * 2. If the switch expression returns a value, then every branch that isn’t an expression must yield a value.
   * 3. A default branch is required unless all cases are covered or no value is returned.
   */
  public void printSeason(int month) {
    switch(month) {
      case 1, 2, 3 -> { System.out.print("Winter"); }
      case 4, 5, 6 -> System.out.print("Spring");
      case 7, 8, 9 -> System.out.print("Summer");
      case 10, 11, 12 -> System.out.print("Fall");
    }
  }

  enum Season {WINTER, SPRING, SUMMER, FALL}
  String getWeather(Season value) {
    return switch(value) {
      case WINTER -> "Cold";
      case SPRING -> "Rainy";
      case SUMMER -> "Hot";
      case FALL -> "Warm";
    };
  }
}
