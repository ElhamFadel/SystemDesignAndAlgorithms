package servicestrategies;

import strategy.IStrategy;

public class AeroplaneStrategy implements IStrategy{

	@Override
	public void execute() {
		System.out.println("Work in aeroplane mode");
	}

}
