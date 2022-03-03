package com.RegistrationService.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer custId;
@Column(name = "CustomerName")	
private String custName;
@Column(name = "CustomerEmail",unique = true)	
private String custEmail;
@Column(name = "CustomerPhoneNumber")	
private long custPhoneNumber;
@Column(name = "Password")	
private String password;
@Column(name = "ConfirmPassword")	
private String confirmPassword;
@Column(name="CustomerType")
private char custType;
	
public Integer getCustId() {
	return custId;
}
public void setCustId(Integer custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getCustEmail() {
	return custEmail;
}
public void setCustEmail(String custEmail) {
	this.custEmail = custEmail;
}

public long getCustPhoneNumber() {
	return custPhoneNumber;
}
public void setCustPhoneNumber(long custPhoneNumber) {
	this.custPhoneNumber = custPhoneNumber;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmPassword() {
	return confirmPassword;
}
public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}
@Override
public String toString() {
	return "Customer [custId=" + custId + ", custName=" + custName + ", custEmail=" + custEmail + ", custPhoneNumber="
			+ custPhoneNumber + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
}
public char getCustType() {
	return custType;
}
public void setCustType(char custType) {
	this.custType = custType;
}


}
