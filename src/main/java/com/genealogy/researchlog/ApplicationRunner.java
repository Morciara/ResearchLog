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
    private final ArchiveInformationRepository archiveInformationRepository;

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

