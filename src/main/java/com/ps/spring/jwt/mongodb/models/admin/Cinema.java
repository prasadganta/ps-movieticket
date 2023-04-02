
package com.ps.spring.jwt.mongodb.models.admin;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "totalCinemaHalls", "location" })
public class Cinema {

	@JsonProperty("name")
	private String name;
	@JsonProperty("totalCinemaHalls")
	private Integer totalCinemaHalls;
	@JsonProperty("location")
	private Location location;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("totalCinemaHalls")
	public Integer getTotalCinemaHalls() {
		return totalCinemaHalls;
	}

	@JsonProperty("totalCinemaHalls")
	public void setTotalCinemaHalls(Integer totalCinemaHalls) {
		this.totalCinemaHalls = totalCinemaHalls;
	}

	@JsonProperty("location")
	public Location getLocation() {
		return location;
	}

	@JsonProperty("location")
	public void setLocation(Location location) {
		this.location = location;
	}

}
