package com.sd.w9_1;

public class LightOnCommand implements Command {
  private Light light;
  int level;
  public LightOnCommand(Light light) {
     this.light=light;
  }
  public void execute() {
    light.on();
 }
  public void undo() {
    light.dim(level);
  }
}