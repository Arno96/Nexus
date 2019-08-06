package com.frame;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name="Customer3")
public class Customer {
	

	public Customer(String email, String name, String cNo, Set<Address> addrs) {
		this.email = email;
		this.name = name;
		CNo = cNo;
		Addrs = addrs;
	}
	Customer(){}
	
	@Id
	private String email;
	
	
	private String name;
	
	
	private String CNo;
@ElementCollection
@JoinTable(name="Cust_Addr",joinColumns=@JoinColumn(name="Email"))
private Set<Address> Addrs=new HashSet<>();
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCNo() {
	return CNo;
}
public void setCNo(String cNo) {
	CNo = cNo;
}
public Set<Address> getAddrs() {
	return Addrs;
}
public void setAddrs(Set<Address> addrs) {
	Addrs = addrs;
}
@Override
public String toString() {
	return "Customer [email=" + email + ", name=" + name + ", CNo=" + CNo + ", Addrs=" + Addrs + "]";
}



}
