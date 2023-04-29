package com.company.io.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Surgeon {
  public Path dissectAndRebuild(Path p) {
    Path v = null;
    for (int i=0; i<p.getNameCount(); i++)
      // if(v==null) v = p.getRoot().resolve(p.getName(i));
      if(v==null) v = p.getName(i);
      else v = v.resolve(p.getName(i));
    return v;
  }
  public static void main(String... tools) {
    final Surgeon al = new Surgeon();
    Path original = Paths.get("/tissue/heart/chambers.txt");
    Path repaired = al.dissectAndRebuild(original);
    System.out.print(original.equals(repaired));
  }
}
