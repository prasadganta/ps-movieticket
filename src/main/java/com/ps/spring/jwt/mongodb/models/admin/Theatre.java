package com.ps.spring.jwt.mongodb.models.admin;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "Theatre")
@Getter
@Setter
public class Theatre {
	
	@Id
	private String id;
	private String name;
	private String city;
	@DBRef
	private List<Screen> screens;

}
	