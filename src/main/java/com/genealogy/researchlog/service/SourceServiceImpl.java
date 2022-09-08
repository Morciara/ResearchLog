package com.genealogy.researchlog.service;

import com.genealogy.researchlog.model.Source;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SourceServiceImpl implements SourceService {

    private static final Logger logger = LogManager.getLogger(SourceServiceImpl.class);

    private final SourceRepository sourceRepository;

    public SourceServiceImpl(SourceRepository sourceRepository) {
        this.sourceRepository = sourceRepository;
    }

    @Override
    public Optional<Source> findById(Integer id) {
        logger.info("Find source with id: {}", id);
        return sourceRepository.findById(id);
    }

    @Override
    public List<Source> findAll() {
        logger.info("Find all source");
        return sourceRepository.findAll();
    }

    @Override
    public boolean update(Source product) {
        logger.info("Update source: {}", source);
        return sourceRepository.update(source);
    }

    @Override
    public Source save(Source source) {
        // Set the source version to 1 as we're adding a new source to the database
        source.setVersion(1);

        logger.info("Save source to the database: {}", source);
        return sourceRepository.save(source);
    }

    @Override
    public boolean delete(Integer id) {
        logger.info("Delete source with id: {}", id);
        return sourceRepository.delete(id);
    }
}
