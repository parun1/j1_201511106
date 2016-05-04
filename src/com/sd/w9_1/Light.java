package com.sd.w9_1;

public class Light{
  int level;
  public void on() {
  System.out.println("Light is on");
  }
  public void off() {
  System.out.println("off");
  }
  public void dim(int level) {
    this.level=level;
    if(level ==0) {
      off();
    }
    else {
      System.out.println("Light is dimmed ot" +level);
    }
  }
  public int getLevel() {
    return level;
  }
}