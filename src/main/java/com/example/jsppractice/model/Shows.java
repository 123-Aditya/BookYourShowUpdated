package com.example.jsppractice.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Shows {

    @Id
    @GeneratedValue
    @Column(name = "showId")
    private Integer showId;
    @Column(name = "movieId")
    private String movieId;
    @Column(name = "theaterId")
    private int theaterId;
    @Column(name = "timeSlot")
    private String timeSlot;
    @Column(name = "pricePerSeat")
    private int pricePerSeat;
    @Column(name = "regularSeats")
    private int regularSeats;

    public Shows() {
    }

	/**
	 * @return the showId
	 */
	public Integer getShowId() {
		return showId;
	}

	/**
	 * @param showId the showId to set
	 */
	public void setShowId(Integer showId) {
		this.showId = showId;
	}

	/**
	 * @return the movieId
	 */
	public String getMovieId() {
		return movieId;
	}

	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	/**
	 * @return the theaterId
	 */
	public int getTheaterId() {
		return theaterId;
	}

	/**
	 * @param theaterId the theaterId to set
	 */
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}

	/**
	 * @return the timeSlot
	 */
	public String getTimeSlot() {
		return timeSlot;
	}

	/**
	 * @param timeSlot the timeSlot to set
	 */
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	/**
	 * @return the pricePerSeat
	 */
	public int getPricePerSeat() {
		return pricePerSeat;
	}

	/**
	 * @param pricePerSeat the pricePerSeat to set
	 */
	public void setPricePerSeat(int pricePerSeat) {
		this.pricePerSeat = pricePerSeat;
	}

	/**
	 * @return the regularSeats
	 */
	public int getRegularSeats() {
		return regularSeats;
	}

	/**
	 * @param regularSeats the regularSeats to set
	 */
	public void setRegularSeats(int regularSeats) {
		this.regularSeats = regularSeats;
	}

    
}