package servicestrategies;

import strategy.IStrategy;

public class LowBatteryStrategy implements IStrategy{

	@Override
	public void execute() {
		System.out.println("On low battery: Get updates every 30 minutes from the server, and send notification to the client");		
	}

}
