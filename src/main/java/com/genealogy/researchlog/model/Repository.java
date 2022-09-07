public class Repository {
   private Integer repositoryId;
   private String name;
   private String streetAddress;
   private String city;
   private String state;
   private String webSite;
   private String emailAddress;

   
    public Repository() {
    }

    public Repository(String name, int repositoryId) {
        this.name = name;
        this.repositoryId = repositoryId;
    }

    public Repository(Integer repositoryId, String name, String streetAddress, String city, 
	              String state, String webSite, String emailAddress) {
        this.repositoryId = repositoryId;
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
	    	this.state = state;
    		this.webSite = webSite;
    		this.emailAddress = emailAddress;
    }

    public Repository(Integer repositoryId, String name, String webSite) {
        this.repositoryId = repositoryId;
        this.name = name;
        this.webSite = webSite;
    }
	
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	  public Integer getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(Integer streetAddress) {
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
                "id=" + repositoryId +
                ", name='" + name + '\'' +
                ", website=" + website +
                '}';
    }
}
