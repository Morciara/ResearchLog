package com.genealogy.researchlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class ResearchLogApplication {
	private final Environment environment;
	private final MongoTemplate mongoTemplate;

	public ResearchLogApplication (Environment environment, MongoTemplate mongoTemplate){
		this.environment = environment;
		this.mongoTemplate = mongoTemplate;
	}


	public static void main(String[] args) {
		SpringApplication.run(ResearchLogApplication.class, args);
	}

}
