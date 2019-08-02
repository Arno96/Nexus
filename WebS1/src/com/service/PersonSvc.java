package com.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)

public interface PersonSvc {
	@WebMethod
	public boolean addPerson(PersonS p);
	
	@WebMethod
	public boolean deletePerson(int id);
	
	@WebMethod
	public PersonS getPerson(int id);
	
	@WebMethod
	public PersonS[] getAllPersons();


}
