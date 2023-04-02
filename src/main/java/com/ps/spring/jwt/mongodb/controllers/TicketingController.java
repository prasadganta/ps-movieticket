//package com.ps.spring.jwt.mongodb.controllers;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.ps.spring.jwt.mongodb.models.admin.Show;
//import com.ps.spring.jwt.mongodb.models.admin.Show__1;
//import com.ps.spring.jwt.mongodb.payload.request.MovieRequest;
//import com.ps.spring.jwt.mongodb.security.services.MovieService;
//import com.ps.spring.jwt.mongodb.security.services.ShowService;
//
//@CrossOrigin(origins = "*", maxAge = 3600)
//@RestController
//@RequestMapping("/api/ticketmine")
//public class TicketingController {
//
//	@Autowired
//	private ShowService showService;
//
//	@Autowired
//	private MovieService movieService;
//
//	@PostMapping("/show")
//	@PreAuthorize("hasRole('ADMIN')")
//	public String addShow(@RequestBody Show showRequest) {
//		System.out.println("created on --->" + showRequest.getShow().getCreatedOn());
//
//		return showService.addShow(showRequest.getShow());
//	}
//
//	@PostMapping("/movie")
//	@PreAuthorize("hasRole('ADMIN')")
//	public String addShow(@RequestBody MovieRequest movieRequest) {
//
//		return movieService.addMovie(movieRequest.getMovie());
//	}
//
//	@GetMapping("/show/{movieName}")
//	@PreAuthorize("hasRole('ADMIN') OR hasRole('USER')")
//	public List<Show__1> showDetails(@PathVariable("movieName") String movieName) {
//
//		return showService.showDetails(movieName);
//	}
//	
//	
//}
