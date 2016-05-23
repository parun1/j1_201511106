package com.sd.address;

public class Person1 {
  String description;
  public Person1(String description){
    this.description=description;
  }
  public void name(){
    System.out.println(description+"±è°Ç");
  }
  public void number(){
    System.out.println(description+" 010-6725-XXXX");
  }
  public String toString() {
    return description;
  }
}