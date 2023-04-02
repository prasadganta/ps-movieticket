package com.ps.spring.jwt.mongodb.helper;

import java.time.Instant;
import java.util.Date;

import com.ps.spring.jwt.mongodb.models.admin.Seat;
import com.ps.spring.jwt.mongodb.models.admin.Show;

public class SeatLock {

	private Seat seat;
	private Show show;
	private Integer timeoutInSeconds;
	private Date loclTime;
	private String lockedBy;

	public boolean isLockedExpired() {
		final Instant loclInstant = loclTime.toInstant().plusSeconds(timeoutInSeconds);
		final Instant currentInstant = new Date().toInstant();
		return loclInstant.isBefore(currentInstant);
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public Integer getTimeoutInSeconds() {
		return timeoutInSeconds;
	}

	public void setTimeoutInSeconds(Integer timeoutInSeconds) {
		this.timeoutInSeconds = timeoutInSeconds;
	}

	public Date getLoclTime() {
		return loclTime;
	}

	public void setLoclTime(Date loclTime) {
		this.loclTime = loclTime;
	}

	public String getLockedBy() {
		return lockedBy;
	}

	public void setLockedBy(String lockedBy) {
		this.lockedBy = lockedBy;
	}

}
