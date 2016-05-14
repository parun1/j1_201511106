package com.sd.address;

public class AddressFacacde {
  private Person1 person1;
  private Person2 person2;
  private Person3 person3;
  public AddressFacacde(Person1 person1,Person2 person2,Person3 person3){
    this.person1=person1;
    this.person2=person2;
    this.person3= person3;
  }
  public void address(String study){
    System.out.println("Address is");
    person1.name();
    person1.number();
    person2.name();
    person2.number();
    person3.name();
    person3.number();
    
  }

}