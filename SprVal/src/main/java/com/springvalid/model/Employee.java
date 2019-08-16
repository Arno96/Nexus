package com.springvalid.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {
	@NotNull
	@Min(1)
	private Integer employeeId;
	
	@NotEmpty(message="name required")
	@Size(min=3,max=12)
	private String employeeName;
	
	@Email(message="proper format required")
	@NotEmpty(message="email required")
	private String email;
	
	@NotEmpty(message="Contact filed is mandatory.")
	@Pattern(regexp="[6789]{1}[0-9]{9}")
	private String contactNum;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
}
