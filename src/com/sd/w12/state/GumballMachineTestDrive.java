package com.sd.w12.state;

public class GumballMachineTestDrive{
  public static void main(String[] arg){
    GumballMachine gm=new GumballMachine(5);
    gm.insertQuarter();
    gm.insertQuarter();
    gm.turnCrank();
  }
}