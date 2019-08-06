package com.frame;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	public Address(int hNo, String locality, String city) {
		this.hNo = hNo;
		this.locality = locality;
		this.city = city;
	}
	Address(){};
	
private int hNo;
private String locality;
private String city;
public int gethNo() {
	return hNo;
}
public void sethNo(int hNo) {
	this.hNo = hNo;
}
public String getLocality() {
	return locality;
}
public void setLocality(String locality) {
	this.locality = locality;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Address [hNo=" + hNo + ", locality=" + locality + ", city=" + city + "]";
}

	
	
	
}
