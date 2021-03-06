package com.sd.w12.state;

public class HasQuarterState implements State{
  GumballMachine1 gumballMachine;
  public void insertQuarter(){
    System.out.println("You cannot insert another quarter");
  }
  public void ejectQuarter(){
      System.out.println("Quarter return");
      gumballMachine.setState(gumballMachine.getNoQuarterState());
  }
  public void turnCrank(){
    System.out.println("You Turn..");
    gumballMachine.setState(gumballMachine.getSoldState());
  }
  public void dispense(){
    System.out.println("No gumball dispensed");
  }
}