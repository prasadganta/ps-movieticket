
package com.ps.spring.jwt.mongodb.models.admin;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "createdOn", "startTime", "endTime", "playsAt" })
@Document(collection = "show")
public class Show__1 {

	@Id
	private String id;
	@JsonProperty("createdOn")
	private Date createdOn;
	@JsonProperty("startTime")
	private String startTime;
	@JsonProperty("endTime")
	private String endTime;
	@JsonProperty("playsAt")
	private PlaysAt playsAt;

	@JsonProperty("createdOn")
	public Date getCreatedOn() {
		return createdOn;
	}

	@JsonProperty("createdOn")
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@JsonProperty("startTime")
	public String getStartTime() {
		return startTime;
	}

	@JsonProperty("startTime")
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	@JsonProperty("endTime")
	public String getEndTime() {
		return endTime;
	}

	@JsonProperty("endTime")
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@JsonProperty("playsAt")
	public PlaysAt getPlaysAt() {
		return playsAt;
	}

	@JsonProperty("playsAt")
	public void setPlaysAt(PlaysAt playsAt) {
		this.playsAt = playsAt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
