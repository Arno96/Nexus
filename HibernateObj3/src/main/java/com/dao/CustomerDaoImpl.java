package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.frame.Customer;


import com.providers.SessionFactoryProvider;

public class CustomerDaoImpl implements CustomerDao {

	public boolean addCustomer(Customer p) {
		Session session=SessionFactoryProvider.getSF().openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(p);
		tx.commit();
		session.close();
		
		return true;
	}

	

	

	public Customer getCustomer(String em) {
		Session session=SessionFactoryProvider.getSF().openSession();
		Customer p=session.get(Customer.class,em);
		session.close();
		
		return p;
	}

	public List<Customer> getAllCustomers() {
		List<Customer> elist=new ArrayList<>();
		Session session=SessionFactoryProvider.getSF().openSession();
		 elist = (List<Customer>)session.createQuery("FROM Customer",Customer.class).list();
		 if(elist.size()>0) {
			 return elist;
		 }
		 session.close();
		return null;
	}

}
