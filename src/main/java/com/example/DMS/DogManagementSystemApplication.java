package com.example.DMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EntityScan("com.example.DMS.Models") // path of the entity model
@EnableJpaRepositories("com.example.DMS.repository")
@SpringBootApplication
 
public class DogManagementSystemApplication {
	 @Autowired 
	public static void main(String[] args) {
		SpringApplication.run(DogManagementSystemApplication.class, args);
	}

}
