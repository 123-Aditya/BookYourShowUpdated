package com.example.jsppractice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Theatre {

	@Id
	@GeneratedValue
	@Column(name = "theatreId")
	private Integer theatreId;

	@Column(name = "theatreName")
	private String theatreName;
	
	@Column(name = "metroLocation")
	private String metroLocation;
	
	@Column(name = "district")
	private String district;
	
	@Column(name = "numberOfShows")
	private Integer numberOfShows;
	
	@Column(name = "seatingCapacity")
	private Integer seatingCapacity;
	
	@Column(name = "reservationCapacityRegular")
	private Integer reservationCapacityRegular;
	
	public Theatre() {
		
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public String getMetroLocation() {
		return metroLocation;
	}

	public void setMetroLocation(String metroLocation) {
		this.metroLocation = metroLocation;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Integer getNumberOfShows() {
		return numberOfShows;
	}

	public void setNumberOfShows(Integer numberOfShows) {
		this.numberOfShows = numberOfShows;
	}

	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public Integer getReservationCapacityRegular() {
		return reservationCapacityRegular;
	}

	public void setReservationCapacityRegular(Integer reservationCapacityRegular) {
		this.reservationCapacityRegular = reservationCapacityRegular;
	}

	

	
}
