package eventbus;

import java.util.ArrayList;
import java.util.List;

public class EventBus {

	private static EventBus instance = null;
	protected List<Subscriber> subscribers = new ArrayList<>();
	
	private EventBus() {}
	public static synchronized EventBus getInstance() {
		if(instance == null)
			instance = new EventBus();
		return instance;
	}
	
	
	public void subscribe(Subscriber s) {
		if(!subscribers.contains(s))
			subscribers.add(s);
	}

	public void unsubscribe(Subscriber s) {
			subscribers.remove(s);
	}
	
	public void publish(BusMessage msg) {
		for(Subscriber s: subscribers) {
			if(!s.equals(msg.getSender()))
				s.messageReceived(msg);
		}
	}
	
	public interface Subscriber{
		public void messageReceived(BusMessage busMessage);
	}
	
	
	public static abstract class BusMessage{
		protected Subscriber sender;

		public Subscriber getSender() {
			return sender;
		}

		public void setSender(Subscriber sender) {
			this.sender = sender;
		}
		
	}
}
