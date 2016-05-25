package com.sd.w12.iterator;

<<<<<<< HEAD
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
 
        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
        addItem("Steamed Veggies and Brown Rice",
                "Steamed vegetables over brown rice", true, 3.99);
        addItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89);
 }
    public void addItem(String n, String d, boolean v, double p) {
        MenuItem menuItem = new MenuItem(n, d, v, p);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
=======

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
  
>>>>>>> ebe3e411906d3dafee2e6e9de35430d89c00b3ae
}