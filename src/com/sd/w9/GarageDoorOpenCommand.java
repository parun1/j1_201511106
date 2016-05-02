package com.sd.w9;

public class GarageDoorOpenCommand implements Command {
  private GarageDoor garagedoor;
  public GarageDoorOpenCommand(GarageDoor garagedoor) {
     this.garagedoor=garagedoor;
  }
  public void execute() {
    garagedoor.up();
 }
}
