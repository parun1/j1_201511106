package com.sd.w12.state;

public class SoldState implements State{
  GumballMachine1 gumballMachine;
  public void insertQuarter(){
    System.out.println("plz wait");
  }
  public void ejectQuarter(){
      System.out.println("sorry");
 
  }
  public void turnCrank(){
    System.out.println("You Turn..");
  }
  public void dispense(){
    System.out.println("No gumball dispensed");
  }
}