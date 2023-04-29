package com.company.initialization;

@SuppressWarnings("all")
public class Chick {
  private Chick() {
    System.out.println("0:name:" + name);
    name = "Que ha pssado?";
    System.out.println("1:name:" + name);
  }

  public static String realName = "Camila";
  private String name = "Lucas";

  static { System.out.println("2:realName:" + realName); }
  { System.out.println("3:name:" + name); }
  static { System.out.println("4:realName:" + realName); }

  public static final void main (final String [] args) {
    System.out.println("5:" + "main realName 1:" + realName);
    Chick chick = new Chick();
    chick.name = "MAMM";
    System.out.println("6:" + "main name 2:(" + chick.name + ")(" + Chick.realName + ")");
    Chick chick2 = new Chick();
    chick2.name = "LJES";
    System.out.println("7:" + "main name 3:(" + chick2.name + ")(" + Chick.realName + ")");
  }

  { name = "HIJ"; System.out.println("8:name:" + name); }
  static { realName = "JMJE"; System.out.println("9:realName:" + realName); }

  // if the variables are after initializacion blocks, not compile
  //public static String realName = "Camila";
  //private String name = "Lucas";
}
