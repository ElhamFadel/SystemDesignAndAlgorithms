package client;

import eventbus.EventBus;
import eventbus.EventBus.BusMessage;
import eventbus.EventBus.Subscriber;

public class B implements Subscriber{

	public void sendToOthers(StudentMessage msg) {
		EventBus.getInstance().publish(msg);
	}
	
	@Override
	public void messageReceived(BusMessage busMessage) {
		if(busMessage instanceof StudentMessage) {
			StudentMessage sm = (StudentMessage) busMessage;
			System.out.println("B received message about student: "+sm.getStudentID() +" sent from "+sm.getSender().getClass().getName());
		}
	}

}
