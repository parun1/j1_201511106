package com.sd.w7;

public class PizzaTestDrive {
  public static void main(String[] args) {
    Pizza pizza=null;
    PizzaStore chicagoPizzaStore=new ChicagoPizzaStore();
    pizza=ChicagoStore.orderPizza("cheese");
    pizza.prepare();
  }
}