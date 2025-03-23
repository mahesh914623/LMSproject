package com.project.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO) 
private int id;
private String name;
private String emailId;
private String mobilenumber;
private String password;
public User() {
}
public User(int id, String name, String emailId, String mobilenumber ,String password) {
	super();
	this.id = id;
	this.name = name;
	this.emailId = emailId;
	this.mobilenumber = mobilenumber;
	this.password=password;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(String mobilenumber) {
	this.mobilenumber = mobilenumber;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", emailId=" + emailId + ", mobilenumber=" + mobilenumber
			+ ", password=" + password + "]";
}




}
