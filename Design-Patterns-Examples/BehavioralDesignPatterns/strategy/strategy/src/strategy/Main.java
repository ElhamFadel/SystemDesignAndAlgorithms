package strategy;

import servicestrategies.AeroplaneStrategy;
import servicestrategies.ChargingStrategy;
import servicestrategies.LowBatteryStrategy;
import servicestrategies.NormalStrategy;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		MyService myService = new MyService();
		ChargingStrategy s1 = new ChargingStrategy();
		NormalStrategy s2 = new NormalStrategy();
		LowBatteryStrategy s3 = new LowBatteryStrategy();
		AeroplaneStrategy s4 = new AeroplaneStrategy();

		
		myService.setStrategy(s1);
		myService.process();
		
		Thread.sleep(3000);
		
		myService.setStrategy(s2);
		myService.process();
		
		Thread.sleep(5000);
		
		myService.setStrategy(s3);
		myService.process();		
		myService.process();
		
	}

}
