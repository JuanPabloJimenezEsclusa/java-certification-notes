package com.company.io.nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

@SuppressWarnings("all")
public class ExamplesNIO {
  public static void main(String ... args) {
    try {
      Stream<Path> s = Files.find(
        Paths.get("/opt/git/canigo"),
        Integer.MAX_VALUE,
        (p, a) -> p.endsWith(".editorconfig") && a.isRegularFile()
      );
      s.forEach(System.out::println);
    } catch(IOException ioe) { ioe.printStackTrace(); }

    // Path
    // Paths
    // Files
    var dir = "/tmp/ocpj.txt";
    Path path1 = Path.of("/tmp/./dir/../ocpj.txt");
    Path path2 = Paths.get("/tmp/sub1/sub2/sub3/./ocpj2.txt");

    System.out.println(path1.getFileName());
    System.out.println(path2.getFileName());
    System.out.println(path1.toAbsolutePath());
    System.out.println(path2.toAbsolutePath());

    System.out.println(path1.normalize());
    System.out.println(path2.normalize());

    System.out.println(path1.relativize(path2));
    System.out.println(path2.relativize(path1));

    var path3 = Paths.get("/home/user/./../texto.txt");
    var path4 = Path.of("/home/user/../datos.txt");
    System.out.print(path3.normalize().toAbsolutePath() + " - ");
    System.out.println(path3.relativize(path4));                          // normalize internally

    var path5 = Paths.get("/tmp/dir/./../");
    var path6 = Path.of("./home/user/../datos.txt");
    System.out.println(path5.normalize().resolve(path6).normalize());     // normalize externally
    System.out.println(path5.getNameCount() + " - " + path6.getNameCount());
    System.out.println(path5.getName(3) + " - " + path6.getName(4));

    try (Stream<String> lines = Files.lines(Paths.get(dir)); var s = System.out) {
      lines.sorted(Comparator.reverseOrder()).forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      System.out.println("--");
      List<String> lines = Files.readAllLines(Paths.get(dir));
      lines.forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      Files.writeString(Paths.get(dir), "JPJE\n", StandardCharsets.UTF_8, StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      Files.write(Paths.get(dir), Set.of("MGJE", "JMJE", "HAJE"), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      // if source is a directory, in target will be created a empty directory
      // if target is a directory, throws FileAlreadyException
      Files.copy(Path.of("/tmp/ocpj.txt"), Path.of("/tmp/ocpj.txt"),
        StandardCopyOption.REPLACE_EXISTING,
        StandardCopyOption.COPY_ATTRIBUTES);
      //Files.copy(Path.of("/tmp/dir"), Path.of("/tmp/dir"));
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
