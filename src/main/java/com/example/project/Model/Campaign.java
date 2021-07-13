package com.example.project.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offertable")
public class Campaign {
	@Id
	private int festid;
	private String festname;
	private Date startdate;
	private Date enddate;
	private String offer;
	private String status;
	
	public Campaign() {
		super();
	}

	public Campaign(int festid,String festname, Date startdate,Date enddate, String offer, String status) {
		super();
		this.festid = festid;
		this.festname = festname;
		this.startdate = startdate;
		this.enddate = enddate;
		this.offer = offer;
		this.status = status;
	}
	
	

	
	public int getFestid() {
		return festid;
	}

	public void setFestid(int festid) {
		this.festid = festid;
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

	public String getFestname() {
		return festname;
	}

	public void setFestname(String festname) {
		this.festname = festname;
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
