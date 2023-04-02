package com.ps.spring.jwt.mongodb.payload.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ps.spring.jwt.mongodb.models.admin.Movie;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "movie" })
public class MovieRequest {

	@JsonProperty("movie")
	private Movie movie;

	@JsonProperty("movie")
	public Movie getMovie() {
		return movie;
	}

	@JsonProperty("movie")
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

}
