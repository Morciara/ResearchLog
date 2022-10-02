package com.genealogy.researchlog.repository;

import com.genealogy.researchlog.model.ArchiveInformation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArchiveInformationRepository extends
        MongoRepository<ArchiveInformation, String> {

}
