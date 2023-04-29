package com.company.generic;

import java.util.List;

class Booby{ }
class Dooby extends Booby{ }
class Tooby extends Dooby{ }
class Jooby extends Tooby{ }
class Hooby extends Jooby{ }

public class SuperExtendsExample {
  Booby b = new Booby();
  Dooby d = new Dooby();
  Tooby t = new Tooby();
  Jooby j = new Jooby();
  Hooby h = new Hooby();

  // This means that dataList is a List whose elements are of a class that is either Dooby or a super class of Dooby
  // We don't know which super class of Dooby. Thus, if you try to add any object to dataList, it has to be a assignable to Dooby.
  // Thus, dataList.add(b); will be invalid because b is not assignable to Dooby.
  // -----------------------------------------------------------------------------------
  // can add ----> Dooby or Tooby or Jooby or Hooby  --- can get ----> Object
  public void do1(List<? super Dooby> dataList) {
    // b = dataList.get(0); // 1
    // t = dataList.get(0); // 2
    // dataList.add(b);     // 3
    dataList.add(t);     // 4
    dataList.add(j);     // 5
    dataList.add(h);     // 6
    dataList.add(d);     // 0

    // Further, if you try to take some object out of dataList, that object will be of a class that is either Dooby or a Superclass of Dooby.
    // Only way you can declare a variable that can be assigned the object retrieved from dataList is Object obj.
    // Thus, t = dataList.get(0); and b = dataList.get(0); are both invalid.
    Object object = dataList.get(0);
  }

  // This means that dataList is a List whose elements are of a class that is either Dooby or a subclass of Dooby.
  // Since we don't know which subclass of Dooby is the list composed of, there is no way you can add any object to this list.

  // If you try to take some object out of dataList, that object will be of a class that is either Dooby or a subclass of Dooby and
  // thus it can be assigned to a variable of class Dooby or its superclass.. Thus, t = dataList.get(0) ; is invalid.
  public void do2(List<? extends Dooby> dataList) {
    d = dataList.get(0); // 0
    b = dataList.get(0); // 1
    // t = dataList.get(0); // 2
    // dataList.add(b);     // 3
    // dataList.add(t);     // 4
  }
}
