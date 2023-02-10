package factorymethod2.poster;

import factorymethod2.connector.FacebookConnector;
import factorymethod2.connector.LinkedInConnector;
import factorymethod2.connector.SocialNetworkConnector;

public class LinkedInPoster extends SocialNetworkPoster{

	@Override
	public SocialNetworkConnector createConnector() {
		return new LinkedInConnector();
	}


}
