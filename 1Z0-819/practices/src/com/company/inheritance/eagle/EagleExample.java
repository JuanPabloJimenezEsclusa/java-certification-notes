package com.company.inheritance.eagle;

class Bird {
  //private Bird(){     }
  public Bird(){     }
}
class Eagle extends Bird {
  public String name;
  public Eagle(String name){ this.name = name; }

  public static void main(String[] args) {
    System.out.println(new Eagle("Bald Eagle").name);
  }
}
