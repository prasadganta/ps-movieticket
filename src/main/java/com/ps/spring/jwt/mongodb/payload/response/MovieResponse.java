package com.ps.spring.jwt.mongodb.payload.response;

import java.util.Date;
import java.util.List;

import com.ps.spring.jwt.mongodb.models.admin.Show__1;

public class MovieResponse {
	private String id;
	private String title;
	private String duration;
	private String language;
	private Date releaseDate;
	private String country;
	private String genre;
	private List<Show__1> show;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public List<Show__1> getShow() {
		return show;
	}

	public void setShow(List<Show__1> show) {
		this.show = show;
	}

	
}
