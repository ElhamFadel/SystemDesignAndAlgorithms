package factorymethod2.poster;


import factorymethod2.connector.SocialNetworkConnector;

public abstract class SocialNetworkPoster {

	public void post(String text) {
		SocialNetworkConnector connector = createConnector();
		connector.login("", "");
		connector.createPost(text);
		connector.logout();
		// store in local database for offline uses
		// send notification
	}
	
	public abstract SocialNetworkConnector createConnector();

}
