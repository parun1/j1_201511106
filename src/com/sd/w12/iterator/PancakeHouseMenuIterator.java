package com.sd.w12.iterator;

import java.util.ArrayList;


public class PancakeHouseMenuIterator implements Iterator {
  ArrayList items;
   int position = 0;
    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }
  public Object next() {
    //MenuItem menuItem=items[position];
    Object object = items.get(position);
    position =position +1;
    return object;
  }
  public boolean hasNext() {
    //if(position >=items.length || items[position] ==null){
    if(position >= items.size()){
    return false;
    }
    else{
      return true;
    }
  }
  }