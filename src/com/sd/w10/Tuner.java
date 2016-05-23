package com.sd.w10;

public class Tuner {
  String description;
  Amplifier amp;
  Double frequency;
  
  public Tuner(String description, Amplifier amp){
    this.description=description;
  }
  public void on(){
    System.out.println(description+"on");
  }
  public void off(){
    System.out.println(description+"off");
  }
  public void setFrequency(double frequency){
    System.out.println(description+frequency);
    this.frequency=frequency;
  }
  public String toString() {
    return description;
  }
}