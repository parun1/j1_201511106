package com.sd.sh;

public class Door{
  String description;
  public  Door(String description){
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
    