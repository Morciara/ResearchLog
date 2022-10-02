package com.genealogy.researchlog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("Source")
public class Source {
    @Id
    private String sourceId;
    @Field("Archive_ID")
    private String archiveId;
    @Field("Source")
    @Indexed
    private String sourceName;
    @Field("Author")
    @Indexed
    private String author;
    @Field("Call_Nbr")
    @Indexed
    private String callNbr;
    @Field("Notes")
    @Indexed
    private String sourceNotes;

    public Source() {
    }

    public Source(String sourceName, String archiveId) {
        this.sourceName = sourceName;
        this.archiveId = archiveId;
    }

    public Source(String sourceId, String sourceName, String archiveId, String author,
                  String callNbr, String sourceNotes) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.archiveId = archiveId;
        this.author = author;
        this.callNbr = callNbr;
        this.sourceNotes = sourceNotes;

    }

    public Source(String sourceId, String sourceName, String archiveId) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.archiveId = archiveId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getArchiveId() {
        return archiveId;
    }

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCallNbr() {
        return callNbr;
    }

    public void setCallNbr(String callNbr) {
        this.callNbr = callNbr;
    }

    public String getSourceNotes() {
        return sourceNotes;
    }

    public void setSourceNotes(String sourceNotes) {
        this.sourceNotes = sourceNotes;
    }

    @Override
    public String toString() {
        return "Source{" +
                "id=" + sourceId +
                ", name='" + sourceName + '\'' +
                ", author=" + author +
                ", notes=" + sourceNotes +
                '}';
    }
}
