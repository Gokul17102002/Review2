package com.example.OnlineVolunteerPlatform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Personal Details")
public class Details1 {
@Id
private String name;
private String id;
private String age;
public String getname() {
	return name;
}
public void setname(String name) {
	this.name = name;
}
public String getid() {
	return id;
}
public void setid(String id) {
	this.id = id;
}
public String getage() {
	return age;
}
public void setage(String age) {
	this.age = age;
}
public Details1(String name, String id, String age) {
	super();
	this.name = name;
	this.id = id;
	this.age = age;
}
public Details1() {
	super();
	// TODO Auto-generated constructor stub
}


}
