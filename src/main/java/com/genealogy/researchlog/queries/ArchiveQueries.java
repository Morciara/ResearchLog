package com.genealogy.researchlog.queries; 

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.core.query.TextQuery;
import org.springframework.stereotype.Service;

import com.genealogy.researchlog.model.Archive;

@Service
public class ArchiveQueries{
    private MongoTemplate mongoTemplate;
	
	public ArchiveQueries(MongoTemplate mongoTemplate){
	    this.mongoTemplate = mongoTemplate;
		}
	
 	public Archive findByArchiveName(String name){
	   Query byArchiveName = new Query()
		.addCriteria(Criteria.where("name").is(name));
		
		return this.mongoTemplate.find(byArchiveName, Archive.class);
		}	
	
}
