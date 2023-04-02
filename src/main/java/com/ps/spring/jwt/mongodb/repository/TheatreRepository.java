package com.ps.spring.jwt.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ps.spring.jwt.mongodb.models.admin.Theatre;

public interface  TheatreRepository extends MongoRepository<Theatre, String> {

}
