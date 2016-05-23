package com.sd.w9_1;

public class LightOffCommand implements Command {
  private Light light;
  int level;
  public LightOffCommand(Light light) {
     this.light=light;
  }
  public void execute() {
    light.off();
 }
  public void undo() {
    light.dim(level);
  }
}