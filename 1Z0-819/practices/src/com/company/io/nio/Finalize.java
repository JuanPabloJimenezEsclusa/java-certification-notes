package com.company.io.nio;

import java.nio.file.Path;

public class Finalize {
  public Path makeAbsolute(Path p) {
    if (p != null && !p.isAbsolute())
      return p.toAbsolutePath();
    return p;
  }
}
