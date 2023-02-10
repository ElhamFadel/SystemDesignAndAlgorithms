package dec.pizza;

public class SmallPizza extends Decorator{

	public SmallPizza(IPizza pizza) {
		super(pizza);
	}

	@Override
	public float calcPrice() {
		return pizza.calcPrice();
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() +" (small)";
	}



}
