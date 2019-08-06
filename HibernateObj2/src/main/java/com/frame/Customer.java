package com.frame;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer2")
public class Customer {
	

	public Customer(String email, String name, String cNo, Address currAddr, Address permAddr) {
		this.email = email;
		this.name = name;
		CNo = cNo;
		this.permAddr = permAddr;
		this.currAddr = currAddr;
	}
	Customer(){}
	
	@Id
	private String email;
	
	
	private String name;
	
	
	private String CNo;
@Embedded
@AttributeOverrides({
	@AttributeOverride(name="hNo",column=@Column(name="houseNo")),
	@AttributeOverride(name="locality",column=@Column(name="locality")),
	@AttributeOverride(name="city",column=@Column(name="city"))
})
private Address permAddr;
 

@Embedded
@AttributeOverrides({
	@AttributeOverride(name="hNo",column=@Column(name="C_houseNo")),
	@AttributeOverride(name="locality",column=@Column(name="C_locality")),
	@AttributeOverride(name="city",column=@Column(name="C_city"))
})
private Address currAddr;
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
public Address getPermAddr() {
	return permAddr;
}
public void setPermAddr(Address permAddr) {
	this.permAddr = permAddr;
}
public Address getCurrAddr() {
	return currAddr;
}
public void setCurrAddr(Address currAddr) {
	this.currAddr = currAddr;
}
@Override
public String toString() {
	return "Customer [email=" + email + ", name=" + name + ", CNo=" + CNo + ", permAddr=" + permAddr + ", currAddr="
			+ currAddr + "]";
}


}
