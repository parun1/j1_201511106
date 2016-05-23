package com.sd.w9_1;

public class RemoteLoader {
  public static void main(String[] args) {
    Light light=new Light();
    LightOnCommand LightOn=new LightOnCommand(light);
    LightOnCommand LightOff=new LightOnCommand(light);
    RemoteControlWithUndo rcwu=new RemoteControlWithUndo();
    
    rcwu.setCommand(0,LightOn,LightOff);
    rcwu.onButtonWasPushed(0);
    rcwu.undoButtonWasPushed();
  }
}