
package com.ps.spring.jwt.mongodb.models.admin;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "totalSeats", "cinemaHallSeat", "cinema" })
public class CinemaHall {

	@JsonProperty("name")
	private String name;
	@JsonProperty("totalSeats")
	private Integer totalSeats;
	@JsonProperty("cinemaHallSeat")
	private List<CinemaHallSeat> cinemaHallSeat = null;
	@JsonProperty("cinema")
	private Cinema cinema;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("totalSeats")
	public Integer getTotalSeats() {
		return totalSeats;
	}

	@JsonProperty("totalSeats")
	public void setTotalSeats(Integer totalSeats) {
		this.totalSeats = totalSeats;
	}

	@JsonProperty("cinemaHallSeat")
	public List<CinemaHallSeat> getCinemaHallSeat() {
		return cinemaHallSeat;
	}

	@JsonProperty("cinemaHallSeat")
	public void setCinemaHallSeat(List<CinemaHallSeat> cinemaHallSeat) {
		this.cinemaHallSeat = cinemaHallSeat;
	}

	@JsonProperty("cinema")
	public Cinema getCinema() {
		return cinema;
	}

	@JsonProperty("cinema")
	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

}
