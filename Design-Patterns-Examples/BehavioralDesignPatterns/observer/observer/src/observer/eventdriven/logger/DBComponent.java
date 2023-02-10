package observer.eventdriven.logger;

import observer.eventdriven.Message;
import observer.eventdriven.handler.NetworkMessageHandler.NetworkMessageListener;

public class DBComponent implements NetworkMessageListener{

	@Override
	public void update(Message msg) {
			System.out.println("Storing message in DB");
	}

	
}
