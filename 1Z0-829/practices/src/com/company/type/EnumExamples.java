package com.company.type;

interface Hourly { String getHours(); }

@SuppressWarnings("all")
enum Season implements Hourly {
  WINTER("Low") {
    public String getHours() { return "10am-3pm"; }
  },
  SPRING("Medium") {
    public String getHours() { return "9am-5pm"; }
  },
  SUMMER("High") {
    public String getHours() { return "9am-7pm"; }
  },
  FALL("Medium"){
    public String getHours() { return "9am-5pm"; }
  };

  private final String expectedVisitors;

  private Season(String expectedVisitors) {
    this.expectedVisitors = expectedVisitors;
  }

  public void printExpectedVisitors() {
    System.out.println(expectedVisitors);
  }
}

public class EnumExamples {
  public static void main(String[] args) {
    Season summer = Season.SUMMER;
    var message = switch(summer) {
      case SPRING -> "Time to relaxing";
      //case "FALL" -> "Sad time"; // DOES NOT COMPILE
      //case Season.WINTER -> "Get out the sled!"; // DOES NOT COMPILE
      //case 0 -> "Time for the pool!"; // DOES NOT COMPILE
      default -> "Is it summer yet?";
    };
    System.out.print(message);
  }
}
