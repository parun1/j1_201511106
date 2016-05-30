package com.sd.w12.iterator;
import java.util.*;

public class MenuTestDrvie {
  public static void main(String[] args){
    PancakeHouseMenu p=new PancakeHouseMenu();
    DinerMenu d=new DinerMenu();
    
     Waitress waitress = new Waitress(p,d);

        waitress.printMenu();
    
  }
}