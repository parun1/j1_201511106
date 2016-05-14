package com.sd.address;

public class Person3 {
  String description;
  public Person3(String description){
    this.description=description;
  }
  public void name(){
    System.out.println(description+"¹Ú¹üÁø");
  }
  public void number(){
    System.out.println(description+" 010-9647-6138");
  }
  public String toString() {
    return description;
  }
}