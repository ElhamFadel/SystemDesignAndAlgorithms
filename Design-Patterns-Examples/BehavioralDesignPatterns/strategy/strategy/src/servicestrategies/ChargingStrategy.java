package servicestrategies;

import strategy.IStrategy;

public class ChargingStrategy implements IStrategy{

	@Override
	public void execute() {
		System.out.println("Charing: Get updates every 1 minute from the server, and send notification to the client");			
	}

}
