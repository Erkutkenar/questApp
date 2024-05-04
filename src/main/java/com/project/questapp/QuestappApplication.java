package com.project.questapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan("com/project/questapp")
public class QuestappApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestappApplication.class, args);
	}
//	@GetMapping
//	public String apiRoot() {
//		return "Hello World";
//	}

}
