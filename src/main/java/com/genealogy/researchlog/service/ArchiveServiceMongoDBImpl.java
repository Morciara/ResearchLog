package com.genealogy.researchlog.service;

import com.genealogy.researchlog.model.Archive;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ArchiveServiceMongoDBImpl implements ArchiveService {
    
    private static final Logger logger = LogManager.getLogger(ArchiveServiceMongoDBImpl.class);
    
   
    @Override
    public Optional<Archive> findById(String id);
    
    @Override
    public List<Archive> findAll();

    @Override
    public boolean update(Archive archive);
    
    @Override
    public Archive save(Archive archive);

    @Override    
    public boolean delete(String id) {
        logger.info("Delete Archive with id: {}", id);
        return false;
        //return archiveRepository.delete(id);
    }
}

