package composite.painter;

import composite.painter.shapes.Circle;
import composite.painter.shapes.CustomShape;
import composite.painter.shapes.Rectangle;


public class Test {
	public Test(){
		
		ReflectionShapeFactory.registerShape(Circle.class);
		ReflectionShapeFactory.registerShape(Rectangle.class);
		ReflectionShapeFactory.registerShape(CustomShape.class);

		
		new UI();

	}
	
	public static void main(String args[]){
		new Test();
	}
}
