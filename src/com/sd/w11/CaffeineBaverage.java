package com.sd.w11;

public abstract class CaffeineBaverage{
  public final void prepareRecipe() {
    brew();
    addCondiments();
    boilWater();
    pourinCup();
  }
  abstract void brew();
  
  abstract void addCondiments();
 
  void boilWater() {
    System.out.println("boilWater");
  }
   void pourinCup() {
    System.out.println("pourinCup");
  }
}