package com.genealogy.researchlog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document("Archive")
public class Archive {
   @Id
   private String id;
   @Field("name")
   @Indexed
   private String name;
    @Field("address")
    private String streetAddress;
    @Field("city")
    private String city;
    @Field("state")
    private String state;
    @Field("web_site")
    private String webSite;
    @Field("email_address")
    private String emailAddress;

   
    public Archive() {
    }

    public Archive(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Archive(String id, String name, String streetAddress, String city,
                   String state, String webSite, String emailAddress) {
        this.id = id;
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
	    	this.state = state;
    		this.webSite = webSite;
    		this.emailAddress = emailAddress;
    }

    public Archive(String id, String name, String webSite) {

        this.id = id;
        this.name = name;
        this.webSite = webSite;
    }
	
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

   public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
   
    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
	
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", website=" + webSite +
                '}';
    }
}
