package com.genealogy.researchlog;
import com.genealogy.researchlog.model.Repository;
import org.hibernate.annotations.Comment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {

    private MongoTemplate mongoTemplate;
    public ApplicationRunner(MongoTemplate mongoTemplate){
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        Repository emptyRepo = new Repository();
        this.mongoTemplate.save(emptyRepo);
        System.out.println("Application has started");
    }
}
