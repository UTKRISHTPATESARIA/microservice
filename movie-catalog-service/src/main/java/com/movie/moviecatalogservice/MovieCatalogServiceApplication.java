package com.movie.moviecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class MovieCatalogServiceApplication {
	
	/*@Bean
	public WebClient.Builder getinstance()
	{
		return new WebClient.builder();
	}*/
	
	@Bean
	@LoadBalanced   //discovery service in a load balanced way. 
					//it tells spring that the url given is not the actual url but is a hint to get it.
	public RestTemplate getinstanceest() {
		return new RestTemplate();
		
	}



	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}

}
