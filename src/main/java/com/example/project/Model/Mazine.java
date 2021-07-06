package com.example.project.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mazinetable")
public class Mazine {
	
	@Id
	private int mag_id;
	private String magname;
	private long mag_price;
	private String mag_type;
	
	public Mazine() {
		super();
	}

	public Mazine(int mag_id, String mag_name, long mag_price, String mag_type) {
		super();
		this.mag_id = mag_id;
		this.magname = mag_name;
		this.mag_price = mag_price;
		this.mag_type = mag_type;
	}

	public int getMag_id() {
		return mag_id;
	}

	public void setMag_id(int mag_id) {
		this.mag_id = mag_id;
	}

	public String getMag_name() {
		return magname;
	}

	public void setMag_name(String mag_name) {
		this.magname = mag_name;
	}

	public long getMag_price() {
		return mag_price;
	}

	public void setMag_price(long mag_price) {
		this.mag_price = mag_price;
	}

	public String getMag_type() {
		return mag_type;
	}

	public void setMag_type(String mag_type) {
		this.mag_type = mag_type;
	}
	
	

}
