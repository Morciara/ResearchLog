package com.genealogy.researchlog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@TestConfiguration

public class DatabaseTestConfiguration {

    Logger logger = LoggerFactory.getLogger(DatabaseTestConfiguration.class);
    @Bean
    GenericCascadeListener genericCascadeListener(MongoTemplate mongoTemplate){
        logger.info("in genericCascadeListener");
        return new GenericCascadeListener(mongoTemplate);
    }

      @Bean
     public SimpleMongoClientDatabaseFactory mongoDatabaseFactory() throws Exception {
          logger.info("in mongoDatabaseFactory");
        return new SimpleMongoClientDatabaseFactory("mongodb://localhost:27017/TestGenealogyResearch");
   }

    @Bean
    public MongoTemplate mongoTemplate(SimpleMongoClientDatabaseFactory factory) throws Exception {
        logger.info("in mongoTemplate");
        return new MongoTemplate(factory);
    }
}
