package com.example.project.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
public class User {
	
	@Id
	private int id;
	private String username;
	private String dob;
	private String email;
	private String password;
	private String gender;
	private int profileid;
	
	
	//default constructor
	public User() {}

	//Parameterized Constructor
	public User(int id, String username, String dob, String email, String password, String gender, int  profileid) {
		super();
		this.id = id;
		this.username = username;
		this.dob = dob;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.profileid = profileid;	
	}

	//Getter And setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getProfileid() {
		return profileid;
	}
	public void setProfile_id(int profileid) {
		this.profileid = profileid;
	}

}
