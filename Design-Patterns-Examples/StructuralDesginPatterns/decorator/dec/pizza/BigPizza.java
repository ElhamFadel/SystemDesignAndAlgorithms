package dec.pizza;

public class BigPizza extends Decorator{

	public BigPizza(IPizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcPrice() {
		return pizza.calcPrice() + (0.5f* pizza.calcPrice());
	}

	@Override
	public String getDescription() {
		return pizza.getDescription()+ " (big)";
	}



}
