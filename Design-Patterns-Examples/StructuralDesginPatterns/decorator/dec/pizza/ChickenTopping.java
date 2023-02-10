package dec.pizza;

public class ChickenTopping extends Decorator{

	

	public ChickenTopping(IPizza pizza) {
		super(pizza);
	}

	@Override
	public float calcPrice() {
		return pizza.calcPrice()+ 4;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription()+ " + chicken topping";
	}

}
