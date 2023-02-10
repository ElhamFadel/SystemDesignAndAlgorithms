package factorymethod2.connector;

public class FacebookConnector implements SocialNetworkConnector{

	@Override
	public void login(String username, String password) {
			System.out.println("Login to facebook");
	}

	@Override
	public void createPost(String postText) {
		System.out.println("Creating post on Facebook");
		
	}

	@Override
	public void logout() {
		System.out.println("Logout from facebook");
		
	}

}
