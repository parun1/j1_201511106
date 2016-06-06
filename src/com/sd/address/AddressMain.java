package com.sd.address;

public class AddressMain {
  public static void main(String[] args){
    AddressP addressP= new Address1();
    
    
    for(Person person: addressP.getAllPersons()) {
      System.out.println("Phone:010"+person.getNumber() +" Name" +person.getName());
      
    }
  }
}