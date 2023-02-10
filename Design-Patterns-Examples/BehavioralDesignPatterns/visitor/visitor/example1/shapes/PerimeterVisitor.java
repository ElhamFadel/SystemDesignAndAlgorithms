package visitor.example1.shapes;

public class PerimeterVisitor implements IVisitor{

	@Override
	public void processShape(Circle circle) {
		System.out.println("perimeter of circle = "+(2* Math.PI * circle.getRadius()));
	}

	@Override
	public void processShape(Rectangle rectangle) {
		System.out.println("perimeter of rectangle = "+(2* (rectangle.getHeight()+rectangle.getWidth())));
		
	}

	@Override
	public void processShape(Triangle triangle) {
		// TODO Auto-generated method stub
		
	}

	

}
