package com.example.project.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;


@DynamicInsert
@Entity
@Table(name="blog")
public class Blogs {
	
	@Id
	private int id;
	private String title;
	private String type;
    private String body;
    private LocalDate creation;
    private String description;
    private String blogtype;
    
    public Blogs() {}

    public Blogs(int id, String title, String type, String body, String description, LocalDate creation, String blogtype) {
	     super();
	     this.id = id;
	     this.title = title;
	     this.type = type;
	     this.body = body;
	     this.description = description;
	     this.creation = creation;
	     this.blogtype = blogtype;
    }

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

	public LocalDate getCreation() {
		return creation;
	}

	public void setCreation(LocalDate creation) {
		this.creation = creation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBlogtype() {
		return blogtype;
	}

	public void setBlogtype(String blogtype) {
		this.blogtype = blogtype;
	}
    
    

}
