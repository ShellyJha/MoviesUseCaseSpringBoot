package net.javaguides.springbootmoviewebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springbootmoviewebapp.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}
