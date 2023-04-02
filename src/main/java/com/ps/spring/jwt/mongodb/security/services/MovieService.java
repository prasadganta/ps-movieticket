package com.ps.spring.jwt.mongodb.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.spring.jwt.mongodb.models.admin.Movie;
import com.ps.spring.jwt.mongodb.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepo;

	public String addMovie(Movie req) {
		movieRepo.save(req);
		return "Movie Added";

	}

}
