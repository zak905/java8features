package opencode.designpatterns.builder;

import java.util.List;

public class ProfileBuilder {
	   String salutation;
	     String occupation;
	     String name;
	     String location;
	     String description;
	     String eMail;
	     String pictureUrl;
	     List<String> hobbies;
	     String birthday;
	    
	    public ProfileBuilder(){
	    	
	    	
	    }
	    
	    
	    public ProfileBuilder salutation(String salutation){
	    	this.salutation = salutation;
	    	
	    	return this;
	    }
	    
    public ProfileBuilder occupation(String occupation){
    	this.occupation = occupation;
	    	return this;
	    }
    
    public ProfileBuilder name(String name){
    	this.name = name;
    	return this;
    }
    
    public ProfileBuilder location(String location){
    	this.location = location;
    	return this;
    }
    
    public ProfileBuilder description(String description){
    	this.description = description;
    	return this;
    }
    
    public ProfileBuilder eMail(String eMail){
    	this.eMail = eMail;
    	return this;
    }
    
    public ProfileBuilder pictureUrl(String pictureUrl){
    	this.pictureUrl = pictureUrl;
    	return this;
    }
    
    public ProfileBuilder hobbies(List<String> hobbies){
    	this.hobbies = hobbies;
    	return this;
    }
    
    public ProfileBuilder birthday(String birthday){
    	this.birthday = birthday;
    	return this;
    }
    
    
    public Profile build(){
    	
    	return new Profile(this);
    }
    
    

}
