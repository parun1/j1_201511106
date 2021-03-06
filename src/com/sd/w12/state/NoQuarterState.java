package com.sd.w12.state;

public class NoQuarterState implements State{
  GumballMachine1 gumballMachine;
  public void insertQuarter(){
    System.out.println("You cannot insert another quarter");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }
  public void ejectQuarter(){
      System.out.println("You haven't inserted a quarter");    
  }
  public void turnCrank(){
    System.out.println("You turned, but there's no quarter");
  }
  public void dispense(){
    System.out.println("You need to pay first");
  }
}