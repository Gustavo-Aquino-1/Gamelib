package com.gustma.gamelib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class GamelibApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamelibApplication.class, args);
	}

}
