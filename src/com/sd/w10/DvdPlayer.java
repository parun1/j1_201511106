package com.sd.w10;

public class DvdPlayer{
  String description;
  Amplifier amp;
  String movie;
  public  DvdPlayer(String description,Amplifier amp){
    this.description=description;
    this.amp=amp;
  }
  public void on(){
    System.out.println(description+"on");
  }
  public void off(){
    System.out.println(description+"off");
  }
  public void eject(){
   String movie=null;
  System.out.println(description+"ejcet");
  }
  public void play(String moive){
    this.movie=movie;
    System.out.println(description+"Play "+movie);
  }
  public void Stop(){
     System.out.println(description+"Stop "+movie);
  }
  public String toString() {
    return description;
  }
}
    