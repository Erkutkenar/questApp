package com.project.questapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"src/main/java/controllers"})
public class QuestappApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestappApplication.class, args);
	}

}
