package com.movie.moviecatalogservice.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.movie.moviecatalogservice.models.CatalogItem;
import com.movie.moviecatalogservice.models.Movie;
import com.movie.moviecatalogservice.models.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	/*
	 * Now to implement as a micro-service follow these steps:
	 * 1. get the movie id and rating from rating service as per the user id given here as input.
	 * 2. now using the list of movie id call the movie info service and get their details.
	 * 3. Merge all the details and display them.
	 * 
	 */
	
	/*@Autowired 
	WebClient.Builder webclient;*/	/*Creating singleton instance for the rest template
							by auto-wiring to the bean created in the springboot application.*/
	
	@Autowired
	private RestTemplate resttemplate;
	
	@RequestMapping("/{userid}")
	public List<CatalogItem> getCatalog(@PathVariable("userid") String userid){
	
		//Storing in an object to make it more generic.
	UserRating rating= resttemplate.getForObject("http://movie-rating-service/service/users/"+userid, UserRating.class );
		 
		 return rating.getRating()   //unwrapping the object to reveal its data meber which is a list.
				 .stream()	
				 //streaming through the list.
				 .map(rating1 ->
		 {
			Movie movie = resttemplate.getForObject("http://movie-info-service/movieinfo/"+rating1.getMovieid(), Movie.class);
			 
			/*Movie movie= webclient.build() //Building a webclient
			 			.get()	// get resonse.
			 			.uri("http://localhost:8089/movieinfo/"+rating1.getMovieid())  //url for the webclient
			 			.retrieve()  //Response
			 			.bodyToMono(Movie.class) //Mono<Movie>
			 			.block();	//converting the async to sync
			 			*/
			 
			 return new CatalogItem(movie.getMovieid(),"desc"+movie.getMovieid(),rating1.getRating());
			 
		 }).collect(Collectors.toList());
	}

}