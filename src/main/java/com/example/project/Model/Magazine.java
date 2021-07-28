package com.example.project.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="magazine")
public class Magazine {
	
	@Id
	private int magid;
	private String magname;
	private long magprice;
	private String magtype;
	private String coverimage;
	private int discountprice;
	
	
	public Magazine() {
		super();
	}

	public Magazine(int magid, String magname, long magprice, String magtype, String coverimage, int discountprice) {
		super();
		this.magid = magid;
		this.magname = magname;
		this.magprice = magprice;
		this.magtype = magtype;
		this.coverimage=coverimage;
		this.discountprice=discountprice;
	}

	public int getMagid() {
		return magid;
	}

	public void setMagid(int magid) {
		this.magid = magid;
	}

	public String getMagname() {
		return magname;
	}

	public void setMagname(String magname) {
		this.magname = magname;
	}

	public long getMagprice() {
		return magprice;
	}

	public void setMagprice(long magprice) {
		this.magprice = magprice;
	}

	public String getMagtype() {
		return magtype;
	}

	public void setMagtype(String magtype) {
		this.magtype = magtype;
	}

	public String getCoverimage() {
		return coverimage;
	}

	public void setCoverimage(String coverimage) {
		this.coverimage = coverimage;
	}

	public int getDiscountprice() {
		return discountprice;
	}

	public void setDiscountprice(int discountprice) {
		this.discountprice = discountprice;
	}
	
	

}