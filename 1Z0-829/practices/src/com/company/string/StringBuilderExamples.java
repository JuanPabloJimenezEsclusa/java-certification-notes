package com.company.string;

@SuppressWarnings("all")
public class StringBuilderExamples {
  public static void main(String[] args) {
    var sb1 = new StringBuilder().append(1).append('c');
    sb1.append("-").append(true);
    System.out.println(sb1); // 1c-true
    sb1.append("-CILM", 3, 5);
    System.out.println(sb1);

    var sb = new StringBuilder("animals");
    sb.insert(7, "-");   // sb = animals-
    sb.insert(0, "-");   // sb = -animals-
    sb.insert(4, "-");   // sb = -ani-mals-
    System.out.println(sb);

    var sb2 = new StringBuilder("abcdef");
    sb2.delete(1, 3);     // sb = adef
    sb2.deleteCharAt(2);  // sb = de

    var builder1 = new StringBuilder("pigeon dirty");
    builder1.replace(3, 6, "sty-jpje");
    System.out.println(builder1); // pigsty dirty

    var builder = new StringBuilder("pigeon dirty");
    builder.replace(3, 100, "");
    System.out.println(builder);  // pig

    var one = new StringBuilder();
    var two = new StringBuilder();
    var three = one.append("a");
    System.out.println(one == two);   // false
    System.out.println(one == three); // true

    var name3 = "a";
    var builder3 = new StringBuilder("a");
    //System.out.println(name3 == builder3); // DOES NOT COMPILE
  }
}
