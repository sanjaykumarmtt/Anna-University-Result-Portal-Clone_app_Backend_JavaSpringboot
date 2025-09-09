package com.student.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usepass")
public class loEntit {
	
	@Id
	String username;
	String password;
	public loEntit(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public loEntit() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
