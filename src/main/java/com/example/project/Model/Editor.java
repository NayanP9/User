package com.example.project.Model;

//import java.sql.Date;
//import java.time.Instant;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicInsert;
//import org.springframework.data.jpa.repository.Temporal;

//import com.fasterxml.jackson.annotation.JsonFormat;
@DynamicInsert 
@Entity
@Table(name="editor")
public class Editor {
	
	@Id
	private int id;
	private String title;
	private String type;
	private String body;
	//@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss")
    //@JsonFormat(pattern="yyyy-mm-dd hh:mm:ss")
	private String createdon;
	
	
	
	//default constructor
	public Editor() {}

	//Parameterized Constructor
	public Editor(int id,String title, String type, String body, String createdon) {
		super();
		this.id = id;
		this.title = title;
		this.type =type;
		this.body = body;
		this.createdon= createdon;
		
		
		
		
		
	}
	//getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getCreatedon() {
		return createdon;
	}

	public void setCreatedon(String createdon) {
		this.createdon = createdon;
	}

	
	
	

}
