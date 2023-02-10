package servicestrategies;

import strategy.IStrategy;

public class NormalStrategy implements IStrategy{

	@Override
	public void execute() {
		System.out.println("On battery: Get updates every 5 minutes from the server, and send notification to the client");
			}

}
