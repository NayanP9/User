package com.example.project.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="campaigns")
public class Campaign {
	@Id
	private int festivalid;
	private String festivalname;
	private Date startdate;
	private Date enddate;
	private String offer;
	private String status;
	
	
	public Campaign() {
		super();
	}

	public Campaign(int festivalid,String festivalname, Date startdate,Date enddate, String offer, String status ) {
		super();
		this.festivalid = festivalid;
		this.festivalname = festivalname;
		this.startdate = startdate;
		this.enddate = enddate;
		this.offer = offer;
		this.status = status;
	}

	public int getFestivalid() {
		return festivalid;
	}

	public void setFestivalid(int festivalid) {
		this.festivalid = festivalid;
	}

	public String getFestivalname() {
		return festivalname;
	}

	public void setFestivalname(String festivalname) {
		this.festivalname = festivalname;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

	
	


}
