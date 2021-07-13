package com.example.project.Model;





import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.print.attribute.standard.DateTimeAtCreation;

import org.hibernate.annotations.DynamicInsert;

import com.fasterxml.jackson.annotation.JsonFormat;

@DynamicInsert
@Entity
@Table(name="usertable")
public class User {
	
	@Id
	private int id;
	private String empid;
	private String username;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	private String email;
	private String password;
	private String gender;
	private int profileid;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date datetime;

	
	
	//default constructor
	public User() {}

	//Parameterized Constructor
	public User(int id, String empid ,String username, Date dob, String email, String password, String gender, int profileid,Date datetime) {
		super();
		this.id = id;
		this.empid = empid;
		this.username = username;
		this.dob = dob;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.profileid = profileid;
		this.datetime = datetime;
		
		
		
		
		
	}

	//Getter And setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
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
	public void setProfileid(int profileid) {
		this.profileid = profileid;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	
		

}
