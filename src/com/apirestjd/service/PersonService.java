package com.apirestjd.service;

import com.apirestjd.model.Person;
import com.apirestjd.model.Response;

public interface PersonService {
	
	public Response addPerson(Person p);

	public Response deletePerson(int id);

	public Person getPerson(int id);

	public Person[] getAllPersons();

}
