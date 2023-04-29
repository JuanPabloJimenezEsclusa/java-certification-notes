package com.company.operator;

@SuppressWarnings("all")
public class PracticeExamples {
  public static void main(String[] args) {
    int myFavoriteNumber = 8;       // 0000000 0000000 0000000 0001000
    int bird = ~myFavoriteNumber;   // 1111111 1111111 1111111 1110111  -->  -1 * 8 - 1 = -9
    int plane = -myFavoriteNumber;  // -8
    var superman = bird == plane ? 5 : 10;
    System.out.println(bird + "," + plane + "," + --superman);

    int start = 7;
    int end = 4;
    end += ++start;                        // 12
    start = (byte)(Byte.MAX_VALUE + 1);    // -128
    System.out.println("(" + start + ")(" + end + ")");

    int ticketsTaken = 1;
    int ticketsSold = 3;
    ticketsSold += 1 + ticketsTaken++; // 5
    ticketsTaken *= 2;                 // 4
    ticketsSold += (long)1;            // 6
    System.out.println("(" + ticketsTaken + ")(" + ticketsSold + ")");

    int note = 1 * 2; // + (long)3;
    short melody = (byte)(double)(note *= 2);
    double song = melody;
    float symphony = (float)((song == 1_000f) ? song * 2L : song);

  }
}
