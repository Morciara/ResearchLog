package com.genealogy.researchlog.repository;

import com.genealogy.researchlog.model.Archive;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public class ArchiveRepositoryMongoDBImpl implements ArchiveRepository {

    private static final Logger logger = LogManager.getLogger(ArchiveRepositoryMongoDBImpl.class);

    @Override
    public Optional<Archive> findById(String id) {
            return Optional.empty();
        }
    }
