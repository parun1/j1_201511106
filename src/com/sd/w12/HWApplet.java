package com.sd.w12;

import java.applet.Applet;
import java.awt.Graphics;

public class HWApplet extends Applet {
  String msg;
  
  public void init(){
    msg="Hello World";
    repaint();
  }
  
  public void stop() {
    msg="stop";
     repaint();
  }
  public void destroy() {
    msg="destroy";
       repaint();
  }
 public void paint(Graphics graphics) {
        graphics.drawString(msg, 5, 15);
    }
}