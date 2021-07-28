package com.example.project.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

@DynamicInsert
@Entity
@Table(name="feedbacks")
public class Feedback {
	
	@Id
	private int id;
	private String magname;
	private String email;
    private String comments;
    private int rating;

    public Feedback() {}

    public Feedback(int id, String magname, String email, String comments, int rating) {
	     super();
	     this.id = id;
	     this.magname = magname;
	     this.email = email;
	     this.comments = comments;
	     this.rating = rating;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMagname() {
		return magname;
	}

	public void setMagname(String magname) {
		this.magname = magname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
    
}
