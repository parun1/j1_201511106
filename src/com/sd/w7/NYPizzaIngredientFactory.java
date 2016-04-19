package com.sd.w7;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
  public Dough createDough() {
    return new ThinCrustDough();
  }
  
  public Cheese createCheese()  {
    return new ReggianoCheese();
  }
}