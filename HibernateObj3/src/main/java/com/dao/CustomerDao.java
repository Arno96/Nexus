package com.dao;

import java.util.List;

import com.frame.Customer;

public interface CustomerDao {
	
	public boolean addCustomer(Customer p);
	
	
	public Customer getCustomer(String email);
	public List<Customer> getAllCustomers();

}
