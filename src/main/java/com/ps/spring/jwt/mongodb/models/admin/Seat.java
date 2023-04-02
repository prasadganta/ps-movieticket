package com.ps.spring.jwt.mongodb.models.admin;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "seat")
public class Seat {
	
	@Id
	private String id;
	private int rowno;
	private int seatNo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getRowno() {
		return rowno;
	}

	public void setRowno(int rowno) {
		this.rowno = rowno;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

}
