package visitor.example1.shapes;

public class Circle implements Shape{

	int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.processShape(this);
	}

}
