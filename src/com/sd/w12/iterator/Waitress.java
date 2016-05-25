package com.sd.w12.iterator;

public class Waitress {
  PancakeHouseMenu pch;
  DinerMenu dm;
  public Waitress(PancakeHouseMenu p,DinerMenu d) {
    this.pch=p;
    this.dm=d;
  }
  public void printMenu() {
    Iterator pi=pch.createIterator();
    Iterator di=dm.createIterator();
    while(pi.hasNext()) {
      MenuItem menuitem=(MenuItem)pi.next();
      System.out.println(menuitem.getName());
    }
  }
}