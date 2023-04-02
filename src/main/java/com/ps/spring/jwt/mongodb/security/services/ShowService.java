package com.ps.spring.jwt.mongodb.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.spring.jwt.mongodb.models.admin.Show__1;
import com.ps.spring.jwt.mongodb.repository.ShowRepository;

@Service
public class ShowService {

	@Autowired
	ShowRepository showRepo;

	public String addShow(Show__1 req) {
		showRepo.save(req);
		return "Show Added";

	}
	
	public List<Show__1> showDetails(String movieName) {
		return showRepo.findByCinemaName(movieName);
		
	}

}
