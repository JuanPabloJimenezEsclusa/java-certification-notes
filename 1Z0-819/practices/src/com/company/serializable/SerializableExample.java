package com.company.serializable;

import java.io.*;

class Booby {
  int i; public Booby() { i = 10; System.out.print("Booby "); }
}

class Dooby extends Booby implements Serializable {
  int j; public Dooby() { j = 20; System.out.print("Dooby "); }
}

class Tooby extends Dooby {
  int k; public Tooby() { k = 30; System.out.print("Tooby ");  }
}

public class SerializableExample {
  public static void main(String[] args) throws Exception {
    var t = new Tooby();
    t.i = 100;
    t.j = 200;
    t.k = 300;
    var oos = new ObjectOutputStream(new FileOutputStream("/tmp/test.ser"));
    oos.writeObject(t);
    oos.close();
    var ois = new ObjectInputStream(new FileInputStream("/tmp/test.ser"));
    t = (Tooby) ois.readObject();
    ois.close();
    System.out.println(t.i + " " + t.j + " " + t.k);
  }
}
