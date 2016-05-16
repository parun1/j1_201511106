package com.sd.w11;

public abstract class CaffeineBaverageWithHook{
  public final void prepareRecipe() {
    brew();
    boilWater();
    pourinCup();
    if(customerWantsCondiments()) {
      addCondiments();
    }
  }
  abstract void brew();
  
  abstract void addCondiments();
 
  void boilWater() {
    System.out.println("boilWater...");
  }
   void pourinCup() {
    System.out.println("pourinCup...");
  }
   boolean customerWantsCondiments() {
   return true;
   }
}