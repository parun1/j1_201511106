package com.sd.w10;

public class Projector{
  String decription;
  DvdPlayer dvd;
  public Projector(String decription,DvdPlayer dvd){
    this.decription=decription;
  }
  public void on(){
    System.out.println(decription+"on");
  }
  public void off(){
    System.out.println(decription+"off");
  }
  public void wideScreenMode(){
     System.out.println(decription+"ScreenMode");
  }
}