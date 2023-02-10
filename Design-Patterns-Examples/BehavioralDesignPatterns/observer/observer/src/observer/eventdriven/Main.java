package observer.eventdriven;

import observer.eventdriven.handler.NetworkMessageHandler;
import observer.eventdriven.handler.NetworkMessageHandler.NetworkMessageListener;
import observer.eventdriven.logger.DBComponent;
import observer.eventdriven.logger.Logger;
import observer.eventdriven.ui.MessengerUI;

public class Main {
	
	public Main(){
		MessengerUI ui = new MessengerUI();
		Logger logger = new Logger();
		DBComponent dbComponent = new DBComponent();
		
		NetworkMessageHandler h = new NetworkMessageHandler();
		
		h.addListener(ui);
		h.addListener(logger);
		h.addListener(dbComponent);
		h.addListener(new NetworkMessageListener() {

			@Override
			public void update(Message msg) {
				System.out.println("mmmmm");
			}
			
		});
		
		
		new Thread(h).start();
	}
	
	public static void main(String args[]){
		new Main();
	}
}
