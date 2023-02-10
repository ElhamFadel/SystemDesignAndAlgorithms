package observer.eventdriven.handler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import observer.eventdriven.Message;
/*
 * Note : The NetworkMessageHandler does not connect to a network or receive messages.
 * It generates messages statically just to give the illusion of handling network messages.
 */
public class NetworkMessageHandler implements Runnable{
	private long delay = 2000;
	private List<Message> messages = new ArrayList<Message>();
	
	
	private List<NetworkMessageListener> listeners = new ArrayList<>();
	
	public void addListener(NetworkMessageListener l) {
		if(!listeners.contains(l)) {
			listeners.add(l);
		}
	}
	
	public void removeListener(NetworkMessageListener l) {
		listeners.remove(l);
	}
	
	
	public NetworkMessageHandler(){
		init();
	}
	
	@Override
	public void run() {
		while(true){
			Message message = getMessage();
			//System.out.println(message.getMessage());
			for(NetworkMessageListener l: listeners)
				l.update(message);
			
		}
	}
	
	private Message getMessage(){
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Collections.shuffle(messages);
		return messages.get(0);
	}
	
	private void init(){
		messages.add(new Message("Ahmed","How r u?"));
		messages.add(new Message("Ali","I am fine. U?"));
		messages.add(new Message("John","where r u from?"));
		messages.add(new Message("Adam","How do u do?"));
		messages.add(new Message("Vin","Are u a student?"));
		messages.add(new Message("Ahmed","Nice weather today. Isn't it?"));
		messages.add(new Message("Adam","what did u do today?"));
		messages.add(new Message("Ahmed","Nothing"));
		messages.add(new Message("Adam","Good bye"));
		messages.add(new Message("Ali","bye"));

	}
	
	public interface NetworkMessageListener{
		public void update(Message msg);
	}
}
