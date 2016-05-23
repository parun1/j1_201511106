package com.sd.w12.iterator;

public class MeunItem {
  String name;
  String description;
  boolean vegetarian;
  double price;
  public  MeunItem(String n,String d,boolean v,double p) {
    this.name=n;
    this.description=d;
    this.vegetarian=v;
    this.price=p;
  }
  public String getName() {
    return name;
  }
  public String getDescription() {
    return dsecription;
  }
  public boolean getVegetarian() {
    return vegetarian;
  }
  public double getPrice() {
    return price;
  }
}