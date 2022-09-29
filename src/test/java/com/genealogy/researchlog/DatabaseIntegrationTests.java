package com.genealogy.researchlog;

import com.genealogy.researchlog.model.ArchiveInformation;
import com.genealogy.researchlog.repository.ArchiveInformationRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataMongoTest
@ExtendWith(SpringExtension.class)
@Import(DatabaseTestConfiguration.class)
public class DatabaseIntegrationTests {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseIntegrationTests.class);
    @Autowired private MongoTemplate mongoTemplate;

    @Autowired
    ArchiveInformationRepository archiveQueries;

    @BeforeEach
    public void beforeEach() {
        System.out.println("in before each");
        ArchiveInformation family = new ArchiveInformation(
                "1d1aab22-670b-48cb-a027-721e2055731f",
                "FamilySearch",
                "123 Main Street",
                "Salt Lake City",
                "Utah",
                "www.familysearch.org",
                "familysearch@gmail.com"
        );

        ArchiveInformation ancestry = new ArchiveInformation(
                "1d1aab22-670b-48cb-a028-721e2055731f",
                "Ancestry",
                "987 1st Avenue",
                "Salt Lake City",
                "Utah",
                "www.ancestry.com",
                "ancestry@gmail.com");

        ArchiveInformation allen = new ArchiveInformation(
                "1d1aab22-670b-48cb-a029-721e2055731f",
                "Allen County Library",
                "456 Elm Street",
                "Fort Wayne",
                "Indiana",
                "www.allenco.org",
                "allencounty@gmail.com");

        List<ArchiveInformation> archive = Arrays.asList(family, ancestry, allen);
        this.archiveQueries.saveAll(archive);
        logger.info("Inserting into Archive  ");
    }

    @AfterEach
    public void afterEach() {

        this.mongoTemplate.dropCollection(ArchiveInformation.class);
    }

    @Test
    void findAllArchiveInformation() {
        logger.info("in tests");
       // List<ArchiveInformation> queryResult = this.archiveQueries.findAll();
       // assertEquals(3,queryResult.size());
    }


}
