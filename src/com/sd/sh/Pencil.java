package com.sd.sh;

public class Pencil{
  String decription;
  public Pencil(String decription){
    this.decription=decription;
  }
  public void pick(){
    System.out.println(decription+" pick");
  }
  public void put(){
    System.out.println(decription+" put");
  }
}