package com.example.OnlineVolunteerPlatform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineVolunteerPlatform.model.Details1;
import com.example.OnlineVolunteerPlatform.model.repository.Repository1;

@Service
public class Service1 {
@Autowired
Repository1 sr;
public List<Details1> saveinfo(List<Details1> ss)
{
	return sr.saveAll(ss);
}
public List<Details1> showinfo()
{
	return sr.findAll();
}
public String deleteinfo(String mailid)
{
	if(sr.existsById(mailid))
	{
		sr.deleteById(mailid);
		return "Your account Successfully deleted";
	}
	else
	{
		return "Please enter the valid username";
	}
}
}
