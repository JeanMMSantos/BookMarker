package com.company.bookmarker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.Entity;

@SpringBootApplication
@Entity
public class BookMarkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMarkerApplication.class, args);
	}

}
