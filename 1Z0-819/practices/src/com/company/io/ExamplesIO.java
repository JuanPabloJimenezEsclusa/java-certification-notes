package com.company.io;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;

public class ExamplesIO {
  public static void main(String[] args) {
    // OutputStream (abstract)
    //    PrintStream
    //    FileOutputStream
    //    FileWriter

    var dir = "/tmp/ocpj.txt";
    try (PrintStream output = new PrintStream(dir)) {
      output.println("JPJE");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    try (var output = new PrintStream(new FileOutputStream(dir))) {
      output.println("LIJM");
    } catch (IOException e) {
      e.printStackTrace();
    }

    try (var fos = new FileOutputStream(dir, true);
         var output = new PrintStream(fos)) {
      output.println("CILM");
    } catch (IOException e) {
      e.printStackTrace();
    }

    try(var fileWriter = new FileWriter(dir, true)) {
      fileWriter.write("MAMM\n");
    } catch (IOException e) {
      e.printStackTrace();
    }

    try(var buffer = new BufferedWriter(new FileWriter(dir, true))) {
      buffer.append("LJES").append("\n").write("HIJ");
      buffer.newLine();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // InputStream (abstract)
    //    FileInputStream
    //    FileReader
    //    BufferedReader
    // ---------------------
    // Scanner (java.util)

    try (var buffer = new BufferedReader(new InputStreamReader(System.in))) {
      System.out.printf("%s", "Input::: ");
      String line = buffer.readLine();
      System.out.println(line);
    } catch (IOException e) {
      e.printStackTrace();
    }

    Scanner scanner = new Scanner(System.in);
    System.out.println("Next line::: ");
    while (scanner.hasNext()) {
      String nextLine = scanner.nextLine();
      System.out.println(nextLine);
    }

    try (var buffer = new BufferedReader(new FileReader(dir))) {
      String line;
      System.out.printf("%s::: %s\n", "File", dir);
      while ((line = buffer.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    File file = new File(dir);
    // Files.isSameFile(null,null);  -> throws IOException!
    // Files.exists(null, null);
    // Files.isDirectory(null, null);
    // Files.isSymbolicLink(null);

    try (var fis = new FileInputStream(file)) {
      byte[] response = new byte[Integer.parseInt(file.length() + "")];
      fis.read(response);
      System.out.println("Response: " + response);
      for (byte letter : response) { System.out.print((char)letter); }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
