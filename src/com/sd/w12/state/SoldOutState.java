package com.sd.w12.state;

public class SoldOutState implements State{
  GumballMachine1 gumballMachine;
  public void insertQuarter(){
    System.out.println("You can't insert a quarter, the machine is sold out");
  }
  public void ejectQuarter(){
      System.out.println("You can't eject, you haven't inserted a quarter yet");
  }
  public void turnCrank(){
    System.out.println("You Turn..");
  }
  public void dispense(){
    System.out.println("No gumball dispensed");
  }
}