package strategy;

public class MyService {
	private IStrategy strategy;
	
	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	
	public void process() {
		if(strategy != null)
			strategy.execute();
	}
}
