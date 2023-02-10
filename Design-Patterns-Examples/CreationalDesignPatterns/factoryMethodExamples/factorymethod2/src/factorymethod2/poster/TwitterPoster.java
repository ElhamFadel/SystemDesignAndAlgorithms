package factorymethod2.poster;

import factorymethod2.connector.FacebookConnector;
import factorymethod2.connector.SocialNetworkConnector;
import factorymethod2.connector.TwitterConnector;

public class TwitterPoster extends SocialNetworkPoster{

	@Override
	public SocialNetworkConnector createConnector() {
		return new TwitterConnector();
	}


}
