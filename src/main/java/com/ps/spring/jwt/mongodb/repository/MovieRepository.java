package com.ps.spring.jwt.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ps.spring.jwt.mongodb.models.admin.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> {

}
