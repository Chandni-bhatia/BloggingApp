package com.BloggingApp.Talkies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TalkiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TalkiesApplication.class, args);
	}

}
