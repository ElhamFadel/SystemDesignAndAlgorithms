package dec.pizza;

public class CheesePizza implements IPizza{
	
	public CheesePizza() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcPrice() {
		return 2;
	}

	@Override
	public String getDescription() {
		return "Pizza with cheese topping";
	}

	
}
