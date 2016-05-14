package com.sd.sh;

public class Book {
  String description;
  public Book(String description){
    this.description=description;
  }
  public void open(){
    System.out.println(description+" open");
  }
  public void close(){
    System.out.println(description+" close");
  }
  public String toString() {
    return description;
  }
}