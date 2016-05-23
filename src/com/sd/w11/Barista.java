package com.sd.w11;

public class Barista {
  public static void main(String args[]) {
    Tea tea=new Tea();
    tea.prepareRecipe();
    Coffee coffee=new Coffee();
    coffee.prepareRecipe();
    
    CoffeeWithHook coffeehook=new CoffeeWithHook();
    TeaWithHook teahook=new TeaWithHook();
    
    coffeehook.prepareRecipe();
    teahook.prepareRecipe();
  }
}