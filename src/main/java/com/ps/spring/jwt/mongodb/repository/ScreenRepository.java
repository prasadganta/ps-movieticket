package com.ps.spring.jwt.mongodb.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ps.spring.jwt.mongodb.models.admin.Screen;
import com.ps.spring.jwt.mongodb.models.admin.Theatre;

public interface  ScreenRepository extends MongoRepository<Screen, String> {
	
	
	public Optional<Screen> findByTheatre(Theatre theatre);

}
