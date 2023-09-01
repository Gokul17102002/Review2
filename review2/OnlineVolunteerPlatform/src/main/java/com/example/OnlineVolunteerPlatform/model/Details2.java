package com.example.OnlineVolunteerPlatform.model;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Event Details")
public class Details2 {
private String EventName;
@Id
private long StartingTime;
private int Date;
private String Month;
private String Location;
private String Occupation;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="link_id")
private List<Details3> many;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="join_id")
private Details1 one;

public String getEventName() {
	return EventName;
}

public void setEventName(String EventName) {
	this.EventName = EventName;
}

public long getStartingTime() {
	return StartingTime;
}

public void setStartingTime(long StartingTime) {
	this.StartingTime = StartingTime;
}

public int getDate() {
	return Date;
}

public void setDate(int Date) {
	this.Date = Date;
}

public String getMonth() {
	return Month;
}

public void setSource(String Month) {
	this.Month = Month;
}

public String getLocation() {
	return Location;
}

public void setDestination(String Location) {
	this.Location = Location;
}

public String getOccupation() {
	return Occupation;
}

public void setDate(String Occupation) {
	this.Occupation = Occupation;
}

public List<Details3> getMany() {
	return many;
}

public void setMany(List<Details3> many) {
	this.many = many;
}

public Details1 getOne() {
	return one;
}

public void setOne(Details1 one) {
	this.one = one;
}

public Details2(String EventName, long StartingTime, int Date, String Month, String Location, String Occupation,
		List<Details3> many, Details1 one) {
	super();
	this.EventName = EventName;
	this.StartingTime = StartingTime;
	this.Date = Date;
	this.Month = Month;
	this.Location = Location;
	this.Occupation = Occupation;
	this.many = many;
	this.one = one;
}

public Details2() {
	super();
	// TODO Auto-generated constructor stub
}
}