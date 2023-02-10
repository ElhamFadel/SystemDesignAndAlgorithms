package factorymethod2.connector;

public class TwitterConnector implements SocialNetworkConnector{

	@Override
	public void login(String username, String password) {
		System.out.println("Login to Twitter");
		
	}

	@Override
	public void createPost(String postText) {
		System.out.println("Creating post on Twitter");
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

}
