package com.ps.spring.jwt.mongodb.security.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.spring.jwt.mongodb.models.admin.Screen;
import com.ps.spring.jwt.mongodb.models.admin.Theatre;
import com.ps.spring.jwt.mongodb.repository.ScreenRepository;
import com.ps.spring.jwt.mongodb.repository.TheatreRepository;

@Service
public class ScreenService {
	
	@Autowired
	ScreenRepository screenRepository;
	

	@Autowired
	TheatreRepository thRepo;

	public String addScreen(Screen req) {
		Optional<Theatre> th=thRepo.findById(req.getTheatre().getId());
		req.setTheatre(th.get());
		return "Screen "+req.getName()+" created with Id "+screenRepository.save(req).getId();
	}
	
	
	public Optional<Screen> getScreens(String  id) {
	
		Optional<Theatre> th=thRepo.findById(id);
		Optional<Screen> screens=screenRepository.findByTheatre(th.get());
		return screens;
	}

}
