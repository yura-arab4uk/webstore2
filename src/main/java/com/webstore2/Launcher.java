package com.webstore2;

import com.webstore2.database.DbDataGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Launcher {

	@Autowired
	private DbDataGenerator dbDataGenerator;

	@Bean
	CommandLineRunner commandLineRunner() {
		return (args) -> dbDataGenerator.generateData();
	}

	public static void main(String[] args) {
		SpringApplication.run(Launcher.class, args);
	}
}
