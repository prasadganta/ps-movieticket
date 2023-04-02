package com.ps.spring.jwt.mongodb.models.admin;

import java.util.List;

import com.ps.spring.jwt.mongodb.exceptions.InvalidStateException;

public class Booking {

	private String id;
	private Show show;
	private List<Seat> seatsBooked;
	private String user;
	private BookingStatus bookingStatus;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public List<Seat> getSeatsBooked() {
		return seatsBooked;
	}

	public void setSeatsBooked(List<Seat> seatsBooked) {
		this.seatsBooked = seatsBooked;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	
	
	  public BookingStatus getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public boolean isConfirmed() {
	        return this.bookingStatus == BookingStatus.Confirmed;
	    }

	    public void confirmBooking() {
	        if (this.bookingStatus != BookingStatus.Created) {
	            throw new InvalidStateException();
	        }
	        this.bookingStatus = BookingStatus.Confirmed;
	    }

	    public void expireBooking() {
	        if (this.bookingStatus != BookingStatus.Created) {
	            throw new InvalidStateException();
	        }
	        this.bookingStatus = BookingStatus.Expired;
	    }

}
