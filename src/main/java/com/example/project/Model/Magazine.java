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
	@Lob
	private byte[] coverimage;
	
	
	public Magazine() {
		super();
	}

	public Magazine(int magid, String magname, long magprice, String magtype, byte[] coverimage) {
		super();
		this.magid = magid;
		this.magname = magname;
		this.magprice = magprice;
		this.magtype = magtype;
		this.coverimage=coverimage;
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

	public byte[] getCoverimage() {
		return coverimage;
	}

	public void setCoverimage(byte[] coverimage) {
		this.coverimage = coverimage;
	}
	
	

}