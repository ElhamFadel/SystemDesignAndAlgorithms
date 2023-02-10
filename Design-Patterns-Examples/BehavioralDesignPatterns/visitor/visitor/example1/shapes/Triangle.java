package visitor.example1.shapes;

public class Triangle implements Shape{

	public Triangle() {
		// TODO Auto-generated constructor stub
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
