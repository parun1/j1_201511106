package com.sd.address;

public class Person2 {
  String description;
  public Person2(String description){
    this.description=description;
  }
  public void name(){
    System.out.println(description+"¹Ú¼ºÈÆ");
  }
  public void number(){
    System.out.println(description+" 010-4601-9075");
  }
  public String toString() {
    return description;
  }
}