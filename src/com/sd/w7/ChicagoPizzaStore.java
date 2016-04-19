package com.sd.w7;

public class ChicagoPizzaStore extends PizzaStore {
  protected Pizza createPizza(String item) {
    Pizza pizza =null;
    PizzaIngredientFactory ingredientFactory =new ChicagoPizzaIngredientFactory();
    if(item.equals("cheese")){
      pizza=new CheesePizza(ingredientFactory);
      pizza.setName("Chicago Style cheese Pizza");
    }
    return pizza;
       }
}