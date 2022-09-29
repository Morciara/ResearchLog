package com.genealogy.researchlog.queries;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.core.query.TextQuery;
import org.springframework.stereotype.Service;

import com.genealogy.researchlog.model.ArchiveInformation;

import java.util.List;

@Service
public class ArchiveQueries {
    private MongoTemplate mongoTemplate;

    public ArchiveQueries(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public ArchiveInformation findById(String id) {
       return this.mongoTemplate.findById(id, ArchiveInformation.class);
    }

    public ArchiveInformation findOneByArchiveName(String name) {
        Query byArchiveName = new Query()
                .addCriteria(Criteria.where("name").is(name));
        return this.mongoTemplate.findOne(byArchiveName, ArchiveInformation.class);
    }

    public List<ArchiveInformation> findAll(String field, int pageNb, int pageSize) {
        Query byPageAndOrder = new Query()
                .with(Sort.by(Sort.Direction.ASC, field))
                .with(PageRequest.of(pageNb, pageSize));
        return this.mongoTemplate.find(byPageAndOrder, ArchiveInformation.class);
    }

    public List<ArchiveInformation> findByArchiveNameFullTextSearch(String name) {
        TextCriteria textCriteria = TextCriteria
                .forDefaultLanguage()
                .matching(name);
        Query byFreeTextArchiveName = TextQuery.queryText(textCriteria)
                .sortByScore()
                .with(PageRequest.of(0, 3));
        return this.mongoTemplate.find(byFreeTextArchiveName, ArchiveInformation.class);
    }

    public List<ArchiveInformation> findAllByArchiveCity(String city) {
        Query byArchiveCity = new Query()
                .addCriteria(Criteria.where("city").is(city))
                .with(Sort.by(Sort.Direction.ASC, "archive"))
                .with(PageRequest.of(1, 20));
        return this.mongoTemplate.find(byArchiveCity, ArchiveInformation.class);
    }

    public ArchiveInformation findOneByArchiveId(String Id) {
        Query byArchiveId = new Query()
                .addCriteria(Criteria.where("Id").is(Id));
        return this.mongoTemplate.findOne(byArchiveId, ArchiveInformation.class);
    }

}
