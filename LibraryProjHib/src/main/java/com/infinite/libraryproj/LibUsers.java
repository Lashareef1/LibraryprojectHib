package com.infinite.libraryproj;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LibUsers")
public class LibUsers {
	
@Id
@Column(name="userName")
private String userName;

@Column(name="password")
private String password;

public LibUsers() {
	
}

public LibUsers(String userName, String password) {
	this.userName = userName;
	this.password = password;
}

@Override
public String toString() {
	return "LibUsers [userName=" + userName + ", password=" + password + "]";
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

}