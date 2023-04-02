package com.ps.spring.jwt.mongodb.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.spring.jwt.mongodb.models.admin.Theatre;
import com.ps.spring.jwt.mongodb.repository.ScreenRepository;
import com.ps.spring.jwt.mongodb.repository.TheatreRepository;

@Service
public class TheatreService {

	@Autowired
	TheatreRepository theatreRepo;
	
	@Autowired
	ScreenRepository screenRepository;

	public String addTheatre(Theatre theatre) {
		theatreRepo.save(theatre).getId();
		return theatre.getName()+" Created with Id : "+theatreRepo.save(theatre).getId();

	}

	public List<Theatre> getTheatreDetails(String thId) {
		
       // if()
		
		return null;
	}

}
