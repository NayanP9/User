package com.example.project.Model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;


@DynamicInsert
@Entity
@Table(name="editor")
public class Editor {
	
	@Id
	private int id;
	private String title;
	private String type;
    private String body;
    private Instant creation;
    private String author;

    public Editor() {}

    public Editor(int id, String title, String type, String body, Instant creation, String author) {
	     super();
	     this.id = id;
	     this.title = title;
	     this.type = type;
	     this.body = body;
	     this.creation = creation;
	     this.author = author;
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

   public String getAuthor() {
	return author;
   }

   public void setAuthor(String author) {
	this.author = author;
   }

public Instant getCreation() {
	return creation;
}

public void setCreation(Instant creation) {
	this.creation = creation;
}

}