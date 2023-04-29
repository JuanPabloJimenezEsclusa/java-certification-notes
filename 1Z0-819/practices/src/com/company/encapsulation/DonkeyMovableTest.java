package com.company.encapsulation;

import java.util.Arrays;
import java.util.Collections;

public class DonkeyMovableTest {
  public static void main(String[] args) {
    Movable m = new Donkey();
    m.move(10);
    m.moveBack(20);
    System.out.println(((Donkey) m).location);
    System.out.println(m.location);
    System.out.println(Movable.location);

    Object[] sa = {100, 100.0, "100"};
    Collections.sort(Arrays.asList(sa), null);
    System.out.println(sa[0] + " " + sa[1] + " " + sa[2]);
  }
}
