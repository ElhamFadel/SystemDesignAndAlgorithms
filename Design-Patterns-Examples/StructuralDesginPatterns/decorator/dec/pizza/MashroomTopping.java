package dec.pizza;

public class MashroomTopping extends Decorator{

	public MashroomTopping(IPizza pizza) {
		super(pizza);
	}

	@Override
	public float calcPrice() {
		return pizza.calcPrice()+ 1;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " + Mashroom topping";
	}

	

}
