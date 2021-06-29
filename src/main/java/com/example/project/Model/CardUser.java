package com.example.project.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cardtable")
public class CardUser {
	
	@Id
	private int cardnumber;
	private String cardname;
	private String expdate;
	private int cvv;
	public CardUser() {
		super();
	}
	public CardUser(int cardnumber, String cardname, String expdate, int cvv) {
		super();
		this.cardnumber = cardnumber;
		this.cardname = cardname;
		this.expdate = expdate;
		this.cvv = cvv;
	}
	public int getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getCardname() {
		return cardname;
	}
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	

}
