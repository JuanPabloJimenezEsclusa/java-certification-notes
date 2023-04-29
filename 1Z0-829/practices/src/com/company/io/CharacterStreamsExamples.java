package com.company.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@SuppressWarnings("all")
public class CharacterStreamsExamples {
  public static void main(String[] args) throws IOException {
    char[] buf = new char[5];

    // echo "01234567" > /tmp/test1.txt
    //  cat /tmp/test1.txt
    //  cat /tmp/test2.txt
    try (FileReader fr = new FileReader("/tmp/test1.txt");
         FileWriter fw = new FileWriter("/tmp/test2.txt")) {
      while (fr.read(buf) != -1) {
        System.out.println("(" + String.valueOf(buf).strip() + ")");
        fw.write(buf);
      }
    }

    Path p1 = Paths.get("/../tmp/test.txt");
    System.out.println(p1.normalize().toUri());
  }
}
