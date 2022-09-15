package com.genealogy.researchlog.service;

import com.genealogy.researchlog.model.Archive;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArchiveServiceMongoDBImpl implements ArchiveService {
    
    private static final Logger logger = LogManager.getLogger(ArchiveServiceMongoDBImpl.class);
    
    private final ArchiveRepository archiveRepository;
    
    public ArchiveServiceMongoDBImpl (ArchiveRepository archiveRepository){
         this.archiveRepository = archiveRepository;
        }
    
   
    @Override
    public Optional<Archive> findById(String id){
         Archive archive = new Archive();
         logger.info("Find archive with id: {}", id);
         return archive.findById(id);
    }
    
    @Override
   // public List<Archive> findAll(){
      public Archive findAll(){
        Archive archive = new Archive();
        logger.info("Find all archives");
        return archive;
       // return archiveRepository.findAll();
    }

    @Override
    public boolean update(Archive archive){
        logger.info("Update archive: {}", archive);
        return false;
     //   return productRepository.update(product);
    }
    
    @Override
    public Archive save(Archive archive){
        // Set the product version to 1 as we're adding a new product to the database
        //product.setVersion(1);

        logger.info("Save archive to the database: {}", archive);
        return archive;
       // return productRepository.save(product);
    }

    @Override    
    public boolean delete(String id) {
        logger.info("Delete Archive with id: {}", id);
        return false;
        //return archiveRepository.delete(id);
    }
}

