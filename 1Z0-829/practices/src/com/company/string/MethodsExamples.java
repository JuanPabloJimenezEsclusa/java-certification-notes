package com.company.string;

@SuppressWarnings("all")
public class MethodsExamples {
  public static void main(String[] args) {
    char ch = '\u2000';
    String testMEssage = "CLIM\u2000LIJM";
    System.out.println(testMEssage.trim());
    System.out.println(testMEssage.strip());

    System.out.println("abc".strip());
    System.out.println("\t   a b c\n".strip());

    var block = """
                a
                 b
                c""";
    var concat = " a\n"
      + "  b\n"
      + " c";

    System.out.println("============");
    System.out.println(block.length());                 // 6
    System.out.println(concat.length());                // 9
    System.out.println(block.indent(1).length());       // 10
    System.out.println(concat.indent(-1).length());     // 7
    System.out.println(concat.indent(-4).length());     // 6
    System.out.println(concat.stripIndent().length());  // 6

    System.out.println(" ".isEmpty()); // false
    System.out.println("".isEmpty());  // true
    System.out.println(" ".isBlank()); // true
    System.out.println("".isBlank());  // true

    var name = "James";
    var score = 90.25;
    var total = 100;
    System.out.println("%n%s:%n Score: %.2f out of %d".formatted(name, score, total));

    var pi = 3.14159265359;
    System.out.format("[%f]\n",pi);     // [3.141593]
    System.out.format("[%12.8f]\n",pi); // [  3.14159265]
    System.out.format("[%012f]\n",pi);  // [00003.141593]
    System.out.format("[%12.2f]\n",pi); // [        3.14]
    System.out.format("[%.3f]\n",pi);   // [3.142]

  }
}
