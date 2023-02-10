package composite.painter.shapes;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class CustomShape implements Shape{

	List<Shape> shapes;

	public CustomShape(){

		 shapes = new ArrayList<Shape>();
		 Circle c = new Circle();
		 Square r = new Square(c.getX(),c.getY(), c.getRadius());
		 shapes.add(c);
		 shapes.add(r);
	}
	
	@Override
	public void draw(Graphics g) {
		for(Shape shape: shapes){
			shape.draw(g);
		}
	}
	
	public void add(Shape shape){
		shapes.add(shape);
	}

}
