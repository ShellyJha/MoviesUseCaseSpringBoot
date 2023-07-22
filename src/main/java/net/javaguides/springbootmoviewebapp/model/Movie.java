package net.javaguides.springbootmoviewebapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;

	@Column(name = "movie_name")
	public String name;
	@Column(name = "movie_collection")
	public String collection;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getname() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setname(String name) {
		this.name = name;
	}
	/**
	 * @return the collection
	 */
	public String getcollection() {
		return collection;
	}
	/**
	 * @param collection the collection to set
	 */
	public void setcollection(String collection) {
		this.collection = collection;
	}
	

}
