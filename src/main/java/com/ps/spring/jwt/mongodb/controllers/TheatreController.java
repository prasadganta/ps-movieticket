package com.ps.spring.jwt.mongodb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ps.spring.jwt.mongodb.models.admin.Theatre;
import com.ps.spring.jwt.mongodb.repository.TheatreRepository;
import com.ps.spring.jwt.mongodb.security.services.TheatreService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class TheatreController {
	
	@Autowired
	TheatreService service;
	
	@Autowired
	TheatreRepository theatreRepo;

	@PostMapping("/theatre")
	@PreAuthorize("hasRole('ADMIN')")
	public String createTheatre(@RequestBody Theatre req) {
		return service.addTheatre(req);
	}
	
	
	@GetMapping("/theatre")
	@PreAuthorize("hasRole('ADMIN')")
	public List<Theatre> getTheatre(String thId) {
		return service.getTheatreDetails(thId);
	}
}
