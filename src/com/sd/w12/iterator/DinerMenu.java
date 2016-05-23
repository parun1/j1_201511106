package com.sd.w12.iterator;


import java.util.ArrayList;

public class DinerMenu {
  //static final int MAX_ITEMS = 3;
  //int numberOfItems = 0;
  //MenuItem[] menuItems;
  ArrayList menuItems;
  
  public DinerMenu() {
    //menuItems = new MenuItem[MAX_ITEMS];
    menuItems = new ArrayList();
    addItem("BLT", "...1", true, 2.9);
   addItem("BLT", "...1", true, 2.9);
   addItem("BLT", "...1", true, 2.9);
  }
  
  public void addItem(String name, String description, boolean v, double p) {
    MenuItem menuItem = new MenuItem(name, description, v, p);
    //if (numberOfItems >= MAX_ITEMS) {
    //  System.err.println("Error");
    //} else {
    //  menuItems[0] = menuItem;
    //  numberOfItems = numberOfItems+1;
    //}
    
    menuItems.add(menuItem);
  }
  
}