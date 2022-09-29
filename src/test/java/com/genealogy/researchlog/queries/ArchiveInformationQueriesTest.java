package com.genealogy.researchlog.queries;

import com.genealogy.researchlog.ApplicationRunner;
import com.genealogy.researchlog.DatabaseTestConfiguration;
import com.genealogy.researchlog.model.ArchiveInformation;
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

import static org.easymock.EasyMock.mock;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataMongoTest
@ExtendWith(SpringExtension.class)
@Import(DatabaseTestConfiguration.class)

class ArchiveInformationQueriesTest {
 Logger logger = LoggerFactory.getLogger(ArchiveInformationQueriesTest.class);

   @Autowired
   MongoTemplate mongoTemplate;
   @Autowired
   ArchiveQueries underTestArchiveQueries;

    ArchiveInformationQueriesTest() {
    }

    @BeforeEach public void beforeEach() {
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
        this.mongoTemplate.insertAll(archive);
        logger.info("Inserting into Archive  ");
    }

    @AfterEach public void afterEach() {

        this.mongoTemplate.dropCollection(ArchiveInformation.class);
    }

    @Test
      void findByArchive() {
        List<ArchiveInformation> queryResult = this.underTestArchiveQueries.findAll("name", 0, 5);
        assertEquals(3,queryResult.size());
   }

    /*@Test
    void findByArchiveId(@Autowired MongoTemplate mongoTemplate) {

     logger.info("Query: First Archive in collection ");
     List<ArchiveInformation> allArchives = this.underTestArchiveQueries.findAll("archive", 0, 3);
     String firstArchive = allArchives.get(0).getName();
     logger.info("First Archive {} ", firstArchive);

     ArchiveInformation archiveInformation = this.underTestArchiveQueries.findOneByArchiveName(firstArchive);
     logger.info("Archive website {} ", archiveInformation.getWebSite());
    }*/

    //    @Test
//    void findByArchiveNameFound() {
//        Archive queryResult = underTestArchiveQueries.findByArchiveName("FamilySearch");
//        assertEquals("FamilySearch", queryResult.getName());
//
//    }
//
//    @Test
//    void findByArchiveNameNotFound() {
//        Archive queryResult = underTestArchiveQueries.findByArchiveName("HappyFunBall");
//
//
//    }
}