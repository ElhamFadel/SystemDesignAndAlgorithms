package visitor.example1.shapes;

public interface IVisitor {

	public void processShape(Circle circle);
	public void processShape(Rectangle rectangle);
	public void processShape(Triangle triangle);
	
}
