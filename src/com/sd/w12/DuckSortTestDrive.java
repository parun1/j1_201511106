package com.sd.w12;

import java.util.ArrayList;
import java.util.Arrays;
public class DuckSortTestDrive {
  public static void main(String[] args) {
    Duck[] ducks={
      new Duck("Daffy",1),
      new Duck("Daewey",2),
      new Duck("Howard",3),
      new Duck("Louie",4)
    };
    
    System.out.println("Before Sorting");
    Arrays.sort(ducks);
    Duck[] myduck= {new Duck("Sang",8),new Duck("Myung",12),new Duck("Uni",4)};
    Arrays.sort(myduck, new Duckcomparator());
  }
}