package com.sd.address;

import java.util.ArrayList;
import java.util.List;

public class Address1 implements AddressP {
  List<Person> persons;
  
  public Address1(){
    persons =new ArrayList<Person>();
    Person person1 =new Person("¹Î¾Æ",96476138);
    Person person2 =new Person("½Â¼ö",45215738);
    Person person3 =new Person("¿©¿ï",62584559);
    persons.add(person1);
    persons.add(person2);
    persons.add(person3);
  }
  public void deletePerson(Person person){
    persons.remove(person.getNumber());
    System.out.println(person.getNumber());
  }
  public List<Person> getAllPersons() {
    return persons;
  }
  public Person getPerson(int number){
    return persons.get(number);
  }
}