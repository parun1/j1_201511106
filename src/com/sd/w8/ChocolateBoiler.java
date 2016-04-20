package com.sd.w8;

public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  private static int numCalled=0;
  private static ChocolateBoiler uniqueInstance;
  
  private ChocolateBoiler() {
    empty=true;
    boiled=false;
  }
  public static ChocolateBoiler getInstance() {
    if(uniqueInstance ==null) {
       uniqueInstance =new ChocolateBoiler();
    }
    numCalled++;
    System.out.println("numCalled: "+numCalled);
    return uniqueInstance;
  }
  public void fill() {
    if(empty) {
      empty =false;
      boiled= false;
    }
  }
}