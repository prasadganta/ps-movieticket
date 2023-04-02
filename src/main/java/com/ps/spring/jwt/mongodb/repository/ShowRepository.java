package com.ps.spring.jwt.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ps.spring.jwt.mongodb.models.admin.Show__1;

public interface ShowRepository extends MongoRepository<Show__1, String> {
	
	
	@Query(value = "{ 'playsAt.cinemaHall.cinema.name' : ?0 }")
	List<Show__1> findByCinemaName(String movieName);

}
