package dec.pizza;

public abstract class Decorator implements IPizza{

	IPizza pizza;
	
	public Decorator(IPizza pizza) {
		this.pizza = pizza;
	}

	
}
