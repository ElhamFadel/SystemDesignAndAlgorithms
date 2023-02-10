package visitor.example1.shapes;

public class AreaVisitor implements IVisitor{

	@Override
	public void processShape(Circle circle) {
		System.out.println("Circle area = "+(Math.PI * circle.getRadius() * circle.getRadius()));
	}

	@Override
	public void processShape(Rectangle rectangle) {
		System.out.println("Rectangle area = "+(rectangle.getWidth()*rectangle.getHeight()));
	}

	@Override
	public void processShape(Triangle triangle) {
		// TODO Auto-generated method stub
		
	}

	

}
