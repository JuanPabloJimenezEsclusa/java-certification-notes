package com.company.operator;

@SuppressWarnings("all")
public class OperatorExamples {
  public static void main(String[] args) {
    double zooTemperature = 1.21;
    System.out.println(zooTemperature); // 1.21

    zooTemperature = -zooTemperature;
    System.out.println(zooTemperature); // -1.21

    zooTemperature = -(-zooTemperature);
    System.out.println(zooTemperature); // -1.21

    int parkAttendance = 0;
    System.out.println(parkAttendance);     // 0
    System.out.println(++parkAttendance);   // 1
    System.out.println(parkAttendance);     // 1
    System.out.println(parkAttendance--);   // 1
    System.out.println(parkAttendance);     // 0

  }
}
