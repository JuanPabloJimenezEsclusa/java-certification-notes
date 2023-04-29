package com.company.io;

import java.io.IOException;
import java.io.RandomAccessFile;

class ABCD{
  int x = 10;
  static int y = 20;
}
class MNOP extends ABCD{
  int x = 30;
  static int y = 40;
}

public class RandomAccessExample {
  public static void main(String[] args) throws IOException {
    System.out.println(new MNOP().x+", "+new MNOP().y);

    var raf = new RandomAccessFile("/tmp/test.txt", "rwd");
    raf.writeChars("CILM");
    //raf.writeChars("hello3");
    //raf.writeChars("hello2");
    //raf.writeChars("hello1");
    raf.close();
  }
}
