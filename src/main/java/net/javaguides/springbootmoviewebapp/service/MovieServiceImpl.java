package net.javaguides.springbootmoviewebapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springbootmoviewebapp.model.Movie;
import net.javaguides.springbootmoviewebapp.repository.MovieRepository;

@Service 
public class MovieServiceImpl implements MovieService {

	
	@Autowired
	MovieRepository movieRepository;
	@Override
	public Movie getMovieById(long id) {
		// TODO Auto-generated method stub
		
		// find by id basically return optional object 
				Optional<Movie> optional = movieRepository.findById(id);
				Movie movie = null;
				if(optional.isPresent())
				{
					movie = optional.get();
				}
				else
				{
					throw new RuntimeException("Sorry No matches found for search criteria" );
				}
			
		
		
		return movie;
	}

	/*
	 * @Override public Movie getMovieByName(String name) { // TODO Auto-generated
	 * method stub
	 * 
	 * movieRepository.fi return null; }
	 * 
	 * @Override public Movie getMovieByCollection(long id) { // TODO Auto-generated
	 * method stub return null; }
	 */

}
