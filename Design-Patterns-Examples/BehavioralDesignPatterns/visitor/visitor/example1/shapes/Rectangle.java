package visitor.example1.shapes;

public class Rectangle implements Shape{

	int width, height;

	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
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
