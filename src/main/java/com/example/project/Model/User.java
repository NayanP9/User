package com.example.project.Model;





import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.DynamicInsert;

import com.fasterxml.jackson.annotation.JsonFormat;

@DynamicInsert
@Entity
@Table(name="usertable")
public class User {
	
	@Id
	private int id;
	private String username;
	@JsonFormat(pattern = "yyyy-MM-dd")
	//@Temporal(TemporalType.DATE)
	private Date dob;
	private String email;
	private String password;
	private String gender;
	private int profileid;
	@Transient
	private String profileName; 
	
	
	//default constructor
	public User() {}

	//Parameterized Constructor
	public User(int id, String username, Date dob, String email, String password, String gender, int profileid) {
		super();
		this.id = id;
		this.username = username;
		this.dob = dob;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.profileid = profileid;
		
		
		
		
		
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
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
	public Date getDob() {
	return dob;
	}
	public void setDob(Date dob) {
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
	public void setProfile_id(int profile_id) {
		this.profileid = profile_id;
	}
		

}
