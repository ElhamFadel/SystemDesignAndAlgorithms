package dec.pizza;

public class TunaTopping extends Decorator{

	public TunaTopping(IPizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcPrice() {
		return pizza.calcPrice()+ 3;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription()+ " + tuna topping";
	}

	
}
