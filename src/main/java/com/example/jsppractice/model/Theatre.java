package com.example.jsppractice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Theatre {
	
	@Id
	@GeneratedValue
	private Integer theatreid;
	@Column(name = "theatrename")
	private String theatrename;
	@Column(name = "metrolocation")
	private String metrolocation;
	@Column(name = "district")
	private String district;
	@Column(name = "numberofshows")
	private Integer numberofshows;
	@Column(name = "seatingcapacity")
	private Integer seatingcapacity;
	@Column(name = "reservationcapacityregular")
	private Integer reservationcapacityregular;
	
	public Theatre() {
	}

	public Integer getTheatreid() {
		return theatreid;
	}

	public void setTheatreid(Integer theatreid) {
		this.theatreid = theatreid;
	}

	public String getTheatrename() {
		return theatrename;
	}

	public void setTheatrename(String theatrename) {
		this.theatrename = theatrename;
	}

	public String getMetrolocation() {
		return metrolocation;
	}

	public void setMetrolocation(String metrolocation) {
		this.metrolocation = metrolocation;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Integer getNumberofshows() {
		return numberofshows;
	}

	public void setNumberofshows(Integer numberofshows) {
		this.numberofshows = numberofshows;
	}

	public Integer getSeatingcapacity() {
		return seatingcapacity;
	}

	public void setSeatingcapacity(Integer seatingcapacity) {
		this.seatingcapacity = seatingcapacity;
	}

	public Integer getReservationcapacityregular() {
		return reservationcapacityregular;
	}

	public void setReservationcapacityregular(Integer reservationcapacityregular) {
		this.reservationcapacityregular = reservationcapacityregular;
	}
	
	
	
	
	


}
