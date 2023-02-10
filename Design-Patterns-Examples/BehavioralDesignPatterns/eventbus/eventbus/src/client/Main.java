package client;

import eventbus.EventBus;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		EventBus.getInstance().subscribe(a);
		EventBus.getInstance().subscribe(b);
		EventBus.getInstance().subscribe(c);
		
		
		StudentMessage msg1 = new StudentMessage();
		msg1.setSender(c);
		msg1.setStudentID("120202244");
		msg1.setStudentName("Ahmed Ali");
		
		//a.sendToOthers(msg1);
		
		
		
		//b.sendToOthers(msg1);
		c.sendToOthers(msg1);
	}

}
