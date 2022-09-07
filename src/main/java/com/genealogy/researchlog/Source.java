public class Source {
    private Integer sourceId;
    private Integer libraryId;
    private String sourceName;
	private String author;
	private String callNbr;
	private String webSite;
	private String sourceNotes;
   
    public Source() {
    }

    public Source(String sourceName, int libraryId) {
        this.sourceName = sourceName;
        this.libraryId = libraryId;
    }

    public Source(Integer sourceId, String sourceName, Integer libraryId, String author, 
	              String callNbr, String webSite, String sourceNotes) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.libraryId = libraryId;
        this.author = author;
		this.callNbr = callNbr;
		this.webSite = webSite;
		this.sourceNotes = sourceNotes;
		
    }

    public Source(Integer sourceId, String sourceName, Integer libraryId) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.libraryId = libraryId;
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

    public Integer getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(Integer libraryId) {
        this.libraryId = libraryId;
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
