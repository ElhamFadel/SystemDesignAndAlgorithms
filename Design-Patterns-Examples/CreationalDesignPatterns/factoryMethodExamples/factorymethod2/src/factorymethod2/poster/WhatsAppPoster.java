package factorymethod2.poster;

import factorymethod2.connector.SocialNetworkConnector;
import factorymethod2.connector.WhatsAppConnector;

public class WhatsAppPoster extends SocialNetworkPoster{

	@Override
	public SocialNetworkConnector createConnector() {
		return new WhatsAppConnector();
	}

}
