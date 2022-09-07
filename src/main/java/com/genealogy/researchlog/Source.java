public class Source {
    private Integer sourceId;
    private Integer repositoryId;
    private String sourceName;
    private String author;
    private String callNbr;
    private String webSite;
    private String sourceNotes;
   
    public Source() {
    }

    public Source(String sourceName, int repositoryId) {
        this.sourceName = sourceName;
        this.repositoryId = repositoryId;
    }

    public Source(Integer sourceId, String sourceName, Integer repositoryId, String author, 
	              String callNbr, String webSite, String sourceNotes) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.repositoryId = repositoryId;
        this.author = author;
	this.callNbr = callNbr;
	this.webSite = webSite;
	this.sourceNotes = sourceNotes;
		
    }

    public Source(Integer sourceId, String sourceName, Integer repositoryId) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.repositoryId = repositoryId;
    }
	
    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
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
   
    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
	
    public String getSourceNotes() {
        return sourceNotes;
    }

    public void setSourceNotes(String sourceNotes) {
        this.sourceNotes = sourceNotes;
    }

    @Override
    public String toString() {
        return "Souce{" +
                "id=" + sourceId +
                ", name='" + sourceName + '\'' +
                ", author=" + author +
                ", notes=" + sourceNotes +
                '}';
    }
}
