package com.entVal2.HibernateObj3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.dao.CustomerDao;
import com.dao.CustomerDaoImpl;
import com.frame.Address;
import com.frame.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CustomerDao daoObj=new CustomerDaoImpl();
         Address a1=new Address(10,"Wazidpur","Noida");
          Address a2=new Address(15,"Tollygunge","Kolkata");
          Set<Address> addr=new HashSet<>();
          addr.add(a1);
          addr.add(a2);
         Customer p=new Customer("John@iris.com","John","3547683",addr);
          boolean r=daoObj.addCustomer(p);
         if(r) {
          	System.out.println(p);
         }
         else {
          	System.out.println("not added");
          }
      	List<Customer> cust=daoObj.getAllCustomers();
      	cust.forEach(System.out::println);
      	
      	//Customer c=daoObj.getCustomer("Keanu@iris.com");
      	//System.out.println(c);
    }
}
