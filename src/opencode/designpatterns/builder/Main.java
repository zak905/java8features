package opencode.designpatterns.builder;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  private String salutation;
	    private String occupation;
	    private String name;
	    private String location;
	    private String description;
	    private String eMail;
	    private String pictureUrl;
	    private List<String> hobbies;
	    private String birthday;*/
		
		ProfileBuilder builder = new ProfileBuilder()
		                       .salutation("Mr.")
		                       .occupation("Developper")
		                       .name("Dummy User")
		                       .location("France")
		                       .description("Cool Profile")
		                       .eMail("dummy@test.com")
		                       .pictureUrl("server/profile.png")
		                       .hobbies(Arrays.asList("technology","soccer", "blogging"))
		                       .birthday("26/05/1990");
		                       
		
		Profile profile = new Profile(builder);
		User user = new User("Dummy123", "Pass123", profile, 3);

	}

}
