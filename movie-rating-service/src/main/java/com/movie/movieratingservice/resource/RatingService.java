package com.movie.movieratingservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.movieratingservice.models.Rating;
import com.movie.movieratingservice.models.UserRating;

@RestController
@RequestMapping("/service")
public class RatingService {

		@RequestMapping("/{movieid}")
		public Rating getrating(@PathVariable("movieid") String movieid)
		{
			return new Rating(movieid,4);
		}
		
		//IMPROVISED THE CODE BY MAING IT RETURN AN OBJECT INSTEAD OF ALIST BECAUSE IF WE WANT 
		//TO DD EXTRA FUNCTIONALITY IT WILL BE ROBUST.
		
		
		@RequestMapping("/users/{userid}")
		public UserRating getUserRating(@PathVariable("userid") String userid)
		{
			List<Rating> rating= Arrays.asList(
					new Rating("1234",4),
					new Rating("2345",2)
					);
			 
			UserRating userrating =new UserRating();
			userrating.setRating(rating);
			
			return userrating;
			
		}
}

