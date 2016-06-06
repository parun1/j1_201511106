package com.sd.address;

import java.util.List;

public interface AddressP {
  public List<Person> getAllPersons();
  public Person getPerson(int number);
  public void deletePerson(Person person);
}