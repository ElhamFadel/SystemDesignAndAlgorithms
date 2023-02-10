package dec.pizza;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		IPizza pizza = new BigPizza(new ChickenTopping(new CheesePizza()));
		System.out.println(pizza.getDescription());
		System.out.println(pizza.calcPrice());

	}

}
