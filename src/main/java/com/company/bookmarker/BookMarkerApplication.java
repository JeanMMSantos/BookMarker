package com.company.bookmarker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import javax.persistence.Entity;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class BookMarkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMarkerApplication.class, args);
	}

}
