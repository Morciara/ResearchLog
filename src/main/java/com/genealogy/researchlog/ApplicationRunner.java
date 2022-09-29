package com.genealogy.researchlog;

import com.genealogy.researchlog.model.ArchiveInformation;
import com.genealogy.researchlog.repository.ArchiveInformationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationRunner implements CommandLineRunner {
    private ArchiveInformationRepository archiveInformationRepository;

    public ApplicationRunner(ArchiveInformationRepository archiveInformationRepository) {
        this.archiveInformationRepository = archiveInformationRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Logger logger = LoggerFactory.getLogger(ApplicationRunner.class);
        logger.info("Application started");
        List<ArchiveInformation> archives = this.archiveInformationRepository.findAll();

        ArchivePrinter.print(archives);


    }


}

/*private ArchiveQueries archiveQueries;

   public ApplicationRunner(ArchiveQueries archiveQueries){
        this.archiveQueries = archiveQueries;

         logger.info("Query: First Archive in collection ");
        List<ArchiveInformation> allArchives = this.archiveQueries.findAll("archive", 0, 3);
        String firstArchive = allArchives.get(0).getName();
        logger.info("First Archive {} ", firstArchive);

        ArchiveInformation archiveInformation = this.archiveQueries.findOneByArchiveName(firstArchive);
        logger.info("Archive website {} ", archiveInformation.getWebSite());


    }

    }
*/
