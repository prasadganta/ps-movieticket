
package com.ps.spring.jwt.mongodb.models.admin;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "seatRow", "seatColumn", "seatType" })
public class CinemaHallSeat {

	@JsonProperty("seatRow")
	private Integer seatRow;
	@JsonProperty("seatColumn")
	private Integer seatColumn;
	@JsonProperty("seatType")
	private SeatType seatType;

	@JsonProperty("seatRow")
	public Integer getSeatRow() {
		return seatRow;
	}

	@JsonProperty("seatRow")
	public void setSeatRow(Integer seatRow) {
		this.seatRow = seatRow;
	}

	@JsonProperty("seatColumn")
	public Integer getSeatColumn() {
		return seatColumn;
	}

	@JsonProperty("seatColumn")
	public void setSeatColumn(Integer seatColumn) {
		this.seatColumn = seatColumn;
	}

	@JsonProperty("seatType")
	public SeatType getSeatType() {
		return seatType;
	}

	@JsonProperty("seatType")
	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

}
