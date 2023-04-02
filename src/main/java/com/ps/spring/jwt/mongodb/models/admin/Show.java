
package com.ps.spring.jwt.mongodb.models.admin;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "show"
})
public class Show {

      private String id;
      private Movie movie;
      private Screen screen;
      private Date startTime;
      private final Integer durationInSeconds = null;
      
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Integer getDurationInSeconds() {
		return durationInSeconds;
	}
      
      
      
}
