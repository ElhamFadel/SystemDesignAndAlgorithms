package visitor.example1.shapes;

public interface Shape {

	public void draw();
	public void accept(IVisitor visitor);
}
