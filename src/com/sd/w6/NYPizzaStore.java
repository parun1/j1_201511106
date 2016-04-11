package com.sd.w6;
public class NYPizzaStore extends PizzaStore {
   Pizza createPizza(String type) {
     if (type.equals("cheese")) {
       return  new NYStyleCheesePizza();
     } else if (type.equals("veggle")) {
       return new NYStyleVegglePizza();
     }else return null;
   }
}