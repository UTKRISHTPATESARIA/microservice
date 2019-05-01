package com.movie.movieratingservice.models;

import java.util.List;

public class UserRating {
	
	private List<Rating> rating;
	//consisting of movie id and rating.

	
	public List<Rating> getRating() {
		return rating;
	}

	public void setRating(List<Rating> rating) {
		this.rating = rating;
	}
	
	

}
