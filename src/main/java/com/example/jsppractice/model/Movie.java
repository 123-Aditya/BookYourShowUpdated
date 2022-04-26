package com.example.jsppractice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue
	@Column(name="movieID")
	private Integer movieID;
	@Column(name="movieName")
	private String movieName;
	@Column(name="language")
	private String language;
	@Column(name="duration")
	private Integer duration;
//	public Movie() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	public Movie() {
		
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	

}
	
	