package opencode.designpatterns.builder;

import java.util.List;


public class Profile {

	    private String salutation;
	    private String occupation;
	    private String name;
	    private String location;
	    private String description;
	    private String eMail;
	    private String pictureUrl;
	    private List<String> hobbies;
	    private String birthday;
	    
	    public Profile(ProfileBuilder builder){
	        this.name = builder.name;
	        this.occupation = builder.occupation;
	        this.location = builder.location;
	        this.description = builder.description;
	        this.eMail = builder.eMail;
	        this.salutation = builder.salutation;
	        this.pictureUrl = builder.pictureUrl;
	        this.hobbies = builder.hobbies;
	        this.birthday = builder.birthday;
	    }
	    
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getPosition() {
	        return occupation;
	    }

	    public void setPosition(String position) {
	        this.occupation = position;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }

	    public String getDescription() {
	        return description;
	    }
	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public String geteMail() {
	        return eMail;
	    }

	    public void seteMail(String eMail) {
	        this.eMail = eMail;
	    }

	    public String getSalutation() {
	        return salutation;
	    }

	    public void setSalutation(String salutation) {
	        this.salutation = salutation;
	    }
		public String getPictureUrl() {
			return pictureUrl;
		}
		public void setPictureUrl(String pictureUrl) {
			this.pictureUrl = pictureUrl;
		}
		public List<String> getHobbies() {
			return hobbies;
		}
		public void setHobbies(List<String> hobbies) {
			this.hobbies = hobbies;
		}
		public String getBirthday() {
			return birthday;
		}
		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}
         
	  
	    
	}



