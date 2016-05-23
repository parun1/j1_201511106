package com.sd.w9;

public class RemoteControlTest {
  public static void main(String[] args){
    Light light=new Light();
    GarageDoor garageDoor=new GarageDoor();
    LightOnCommand lightOn=new LightOnCommand(light);
    SimpleRemoteControl remote=new  SimpleRemoteControl();
    GarageDoorOpenCommand garage=new GarageDoorOpenCommand(garageDoor);
    
    remote.setCommand(lightOn);
    remote.buttonWasPressed();
    remote.setCommand(garage);
    remote.buttonWasPressed();
  }
}