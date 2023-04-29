package com.company.type.record;

public record Crane(int numberEggs, String name) {
  private static int type = 10;

  public Crane {
    if (numberEggs < 0) throw new IllegalArgumentException();
    name = name.toUpperCase();
  }

  public Crane(int numberEggs) {
    this(numberEggs, "tests");
  }

  /*public Crane(int numberEggs, String name) {
    if (numberEggs < 0) throw new IllegalArgumentException();
    this.numberEggs = numberEggs;
    this.name = name;
  }*/
}

record Student(int id, String... subjects){
  public Student {
    if (id < 0) throw new IllegalArgumentException();

    if (subjects == null || subjects.length == 0) {
      subjects = new String[]{"English"};
    }

  }

  public static void main(String[] args) {
    new Object();
    System.out.println(new Student(123, null));
  }
}