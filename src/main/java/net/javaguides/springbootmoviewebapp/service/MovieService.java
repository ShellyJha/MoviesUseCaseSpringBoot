package net.javaguides.springbootmoviewebapp.service;

import net.javaguides.springbootmoviewebapp.model.Movie;

public interface MovieService {
	Movie getMovieById(long id);

	/*
	 * Movie getMovieByName(String name);
	 * 
	 * Movie getMovieByCollection(long id);
	 */
}
