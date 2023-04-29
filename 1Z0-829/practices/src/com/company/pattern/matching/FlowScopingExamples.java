package com.company.pattern.matching;

@SuppressWarnings("all")
public class FlowScopingExamples {

  // NOT COMPILE by ||
  //void printIntegersOrNumbersGreaterThan5(Number number) {
  //  if(number instanceof Integer data || data.compareTo(5)>0)
  //    System.out.print(data);
  //}

  void printIntegerTwice(Number number) {
    if (number instanceof Integer data)
      System.out.print(data.intValue());
    //System.out.print(data.intValue()); // DOES NOT COMPILE
  }

  void printOnlyIntegers(Number number) {
    if (!(number instanceof Integer data)) return;
    System.out.print(data.intValue()); // IT COMPILES!
    data.floatValue();                 // IT COMPILES!
  }

  void printOnlyIntegers2(Number number) {
    if (!(number instanceof Integer data)) {
      return;
    } else {
      System.out.print(data.intValue());
    }
  }

  void printOnlyIntegers3(Number number) {
    if (number instanceof Integer data) System.out.print(data.intValue());
    else return;
  }
}
