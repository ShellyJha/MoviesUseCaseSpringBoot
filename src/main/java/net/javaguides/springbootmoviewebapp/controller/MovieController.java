package net.javaguides.springbootmoviewebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import net.javaguides.springbootmoviewebapp.model.Movie;
import net.javaguides.springbootmoviewebapp.service.MovieService;

public class MovieController {
	@Autowired
	MovieService movieService;

	@GetMapping("/")
	public String viewHomePage() {
		return "index";

	}

	@GetMapping("/movieIdForm")
	public String showMovieByIdView() {

		return "movieIdForm";

	}

	@GetMapping("/showMovieById/{id}")
	public String showMovieById(@PathVariable(value = "id") long id, Model model) {
		Movie movie = movieService.getMovieById(id);
		model.addAttribute("movie", movie);
		return ("movie_by_id");

	}

}
