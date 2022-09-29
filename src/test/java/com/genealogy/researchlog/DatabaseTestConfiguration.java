package com.genealogy.researchlog;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@TestConfiguration

public class DatabaseTestConfiguration {
    @Bean
    GenericCascadeListener genericCascadeListener(MongoTemplate mongoTemplate){
        return new GenericCascadeListener(mongoTemplate);
    }

      @Bean
     public MongoDatabaseFactory mongoDatabaseFactory() throws Exception {
        return new SimpleMongoClientDatabaseFactory("mongodb://localhost:27017/TestGenealogyResearch");
   }

    @Bean
    public MongoTemplate mongoTemplate(MongoDatabaseFactory factory) throws Exception {
        return new MongoTemplate(factory);
    }
}
