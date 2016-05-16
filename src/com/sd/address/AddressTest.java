package com.sd.address;

public class AddressTest {
  public static void main(String[] args){
    Person1 person1=new Person1("Person1");
     Person2 person2=new Person2("Person2");
     Person3 person3=new Person3("Person3");
      
      AddressFacacde ad=new AddressFacacde(person1,person2,person3);
      ad.address("address");
      
  }
}