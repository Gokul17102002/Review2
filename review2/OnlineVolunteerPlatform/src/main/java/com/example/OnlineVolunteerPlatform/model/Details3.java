package com.example.OnlineVolunteerPlatform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Contact Details")
public class Details3 {
@Id
private int ContactNo;
private String Email;
private String Address;
private String Pincode;
public int getContactNo() {
	return ContactNo;
}
public void setContactNo(int ContactNo) {
	this.ContactNo = ContactNo;
}
public String getEmail() {
	return Email;
}
public void setTime(String Email) {
	this.Email = Email;
}
public String getAddress() {
	return Address;
}
public void setAddress(String Address) {
	this.Address = Address;
}
public String getPincode() {
	return Pincode;
}
public void setEndat(String Pincode) {
	this.Pincode = Pincode;
}
public Details3(int ContactNo, String Email, String Address, String Pincode) {
	super();
	this.ContactNo = ContactNo;
	this.Email = Email;
	this.Address = Address;
	this.Pincode = Pincode;
}
public Details3() {
	super();
	// TODO Auto-generated constructor stub
}


}
