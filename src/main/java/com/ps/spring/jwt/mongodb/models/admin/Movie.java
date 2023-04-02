package com.ps.spring.jwt.mongodb.models.admin;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "movie")
public class Movie {

	@Id
	private String id;

	@NotBlank
	@Size(max = 100)
	private String title;
	
}
