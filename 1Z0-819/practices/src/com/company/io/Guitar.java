package com.company.io;

import java.io.*;

public class Guitar {
  public void readMusic(File f) throws IOException {
    try (BufferedReader r = new BufferedReader(new FileReader(f))) {
      String music = null;
      try {
        while((music = r.readLine()) != null)
          System.out.println(music);
      } catch (IOException e) {}
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } finally {}
  }
}
