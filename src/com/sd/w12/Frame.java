package com.sd.w12;

import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {
  
  public Frame(String name) {
    super(name);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(200,200);
    this.setVisible(true);
  }
  public void paint(Graphics graphics){
    super.paint(graphics);
    String msg="rule";
    graphics.drawString(msg,100 ,100);
  }
  public static void main(String[] args) {
  Frame Frame = new Frame("Frame");
 }
}