package factorymethod2.connector;

public interface SocialNetworkConnector {
	
	public void login(String username, String password);
	public void createPost(String postText);
	public void logout();

}
