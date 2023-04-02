package com.ps.spring.jwt.mongodb.models.admin;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "screen")
@Getter
@Setter
public class Screen {
	
	@Id
	private String id;
	private String name;
	@DBRef(lazy = true)
	private Theatre theatre;
	private List<Seat> seats;
	
}
