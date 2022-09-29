package com.genealogy.researchlog;

import com.genealogy.researchlog.model.ArchiveInformation;
import com.genealogy.researchlog.queries.ArchiveQueries;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.EventRecodingLogger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApplicationRunner implements CommandLineRunner {
    private ArchiveQueries archiveQueries;
    public ApplicationRunner(ArchiveQueries archiveQueries){
        this.archiveQueries = archiveQueries;
    }

    @Override
    public void run(String ... args) throws Exception{

        Logger logger = LoggerFactory.getLogger(ApplicationRunner.class);


        logger.info ("Application started");

        logger.info("Query: First Archive in collection ");
        List<ArchiveInformation> allArchives = this.archiveQueries.findAll("archive", 0, 3);
        String firstArchive = allArchives.get(0).getName();
        logger.info("First Archive {} ", firstArchive);

        ArchiveInformation archiveInformation = this.archiveQueries.findOneByArchiveName(firstArchive);
        logger.info("Archive website {} ", archiveInformation.getWebSite());


    }
}
