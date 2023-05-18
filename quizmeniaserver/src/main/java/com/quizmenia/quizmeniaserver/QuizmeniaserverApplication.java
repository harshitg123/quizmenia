package com.quizmenia.quizmeniaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.quizmenia.quizmeniaserver.model")
public class QuizmeniaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizmeniaserverApplication.class, args);
	}

}
