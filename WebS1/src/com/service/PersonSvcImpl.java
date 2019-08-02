package com.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;


@WebService(endpointInterface = "com.service.PersonSvc")  

public class PersonSvcImpl implements PersonSvc {
	private static Map<Integer,PersonS> persons = new HashMap<Integer,PersonS>();
	@Override
	public boolean addPerson(PersonS p) {
		if(persons.get(p.getId()) != null) return false;
		persons.put(p.getId(), p);
		return true;
		
	}

	@Override
	public boolean deletePerson(int id) {
		if(persons.get(id) == null) return false;
		persons.remove(id);
		return true;
		
	}

	@Override
	public PersonS getPerson(int id) {
		
		return persons.get(id);
	}

	@Override
	public PersonS[] getAllPersons() {
		Collection<PersonS> vs=persons.values();
		PersonS[] p=new PersonS[vs.size()];		
		p=vs.toArray(p);
		return p;
		}
	}
	


