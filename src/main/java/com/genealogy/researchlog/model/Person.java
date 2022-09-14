package com.genealogy.researchlog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document("Person")
public class Person {
   @Id
   private String personId;
   @Field("legacy_id")
   @Indexed
   private String legacyId;
   @Field("surname")
   @Indexed
   private String surname;
   @Field("given_name")
   private String givenName;
   @Field("middle_name")
   private String middleName;
   @Field("dob")
   private String dob;
   @Field("dod")
   private String dod;
   @Field("familysearch_id")
   @Indexed
   private String familySearchId;
   @Field("find_a_grave_id")
   @Indexed  
   private String findAGraveId;
   

   
    public Person() {
    }

    public Person(String personId, String legacyId, String surname) {
        this.surname = surname;
        this.personId = personId;
        this.legacyId = legacyId;
    }

    public Person(String personId, String legacyId, String surname, String givenName, String middleName,
                   String dob, String dod, String familySearchId, String findAGraveId) {
        this.personId = personId;
	    this.legacyId = legacyId;
        this.surname = surname;
        this.givenName = givenName;
        this.middleName = middleName;
	    this.dob = dob;
   		this.dod = dod;
    	this.familySearchId = familySearchId;
		this.findAGraveId = findAGraveId;
    }

    public Person(String personId, String legacyId,String surname, String dod) {

        this.personId = personId;
		this.legacyId = legacyId;
        this.surname = surname;
        this.dod = dod;
    }
	
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }
	
	public String getLegacyId() {
        return legacyId;
    }

    public void setLegacyId(String legacyId) {
        this.legacyId = legacyId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

   public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
   
    public String getDod() {
        return dod;
    }

    public void setDod(String dod) {
        this.dod = dod;
    }
	
    public String getfamilySearchId() {
        return familySearchId;
    }
	
    public void setfamilySearchId(String familySearchId) {
        this.familySearchId = familySearchId;
    }

	public String getfindAGraveId() {
        return findAGraveId;
    }
	
    public void setfamilySearchId(String findAGraveId) {
        this.findAGraveId = findAGraveId;
    }
	
    @Override
    public String toString() {
        return "Person{" +
                "id=" + personId +
                ", surname='" + surname + '\'' +
                ", Death Date=" + dod +
                '}';
    }
}
