package com.ps.spring.jwt.mongodb.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ps.spring.jwt.mongodb.models.admin.Screen;
import com.ps.spring.jwt.mongodb.repository.TheatreRepository;
import com.ps.spring.jwt.mongodb.security.services.ScreenService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class ScreenController {
	
	@Autowired
	ScreenService service;
	
	@Autowired
	TheatreRepository theatreRepo;

	@PostMapping("/screen")
	@PreAuthorize("hasRole('ADMIN')")
	public String addScreen(@RequestBody Screen req) {
		return service.addScreen(req);
	}
	
	
	@GetMapping("/screen")
	@PreAuthorize("hasRole('ADMIN')")
	public Optional<Screen> getScreens(@RequestParam("theatreId") String theatreId) {
		return service.getScreens(theatreId);
	}
}
