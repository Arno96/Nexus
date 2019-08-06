package com.frame;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	public Customer(String email, String name, String cNo, Address addr) {
		this.email = email;
		this.name = name;
		CNo = cNo;
		this.addr = addr;
	}

	Customer(){}
	
	@Id
	private String email;
	
	
	private String name;
	
	
	private String CNo;

private Address addr;

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

public Address getAddr() {
	return addr;
}

public void setAddr(Address addr) {
	this.addr = addr;
}

@Override
public String toString() {
	return "Customer [email=" + email + ", name=" + name + ", CNo=" + CNo + ", addr=" + addr + "]";
}
}
