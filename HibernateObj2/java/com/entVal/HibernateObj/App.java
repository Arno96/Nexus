package com.entVal.HibernateObj;

import java.util.List;

import com.dao.CustomerDao;
import com.dao.CustomerDaoImpl;
import com.frame.Address;
import com.frame.Customer;



public class App 
{
    public static void main( String[] args )
    {
        CustomerDao daoObj=new CustomerDaoImpl();
      //  Address a=new Address(20,"Ghaziabad","Noida");
      //  Customer p=new Customer("Keanu@iris.com","Keanu","46598762",a);
      //  boolean r=daoObj.addCustomer(p);
      //  if(r) {
      //  	System.out.println(p);
      //  }
      //  else {
      //  	System.out.println("not added");
      //  }
    	//List<Customer> cust=daoObj.getAllCustomers();
    	//cust.forEach(System.out::println);
    	
    	Customer c=daoObj.getCustomer("Keanu@iris.com");
    	System.out.println(c);
    }
}
