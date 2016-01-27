package opencode.designpatterns.builder;


/**
 *
 * @author zakaria
 */
/* Class for representing a user of the application */ 


public class User {
    
    private String userName;
    private String password;
    private Profile profile;
    private int accessLevel;
    
    
    public User(String userName, String password, Profile profile, int authorizationLevel){
    this.userName = userName;
    this.password = password;
    this.accessLevel = authorizationLevel;
    this.profile = profile;
    }

    
    public void setProfile(Profile profile){
       this.profile = profile;
       
    }


    public Profile getProfile() {
        return profile;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccessLevel() {
        return accessLevel;
    }
    public void setAccessLevel(int authorizationLevel) {
        this.accessLevel = authorizationLevel;
    }


}
