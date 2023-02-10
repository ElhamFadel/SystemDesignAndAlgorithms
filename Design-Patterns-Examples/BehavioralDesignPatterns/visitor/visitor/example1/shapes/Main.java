package visitor.example1.shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(15);
		Rectangle r1 = new Rectangle(10,20);
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(c1);
		shapes.add(c2);
		shapes.add(r1);
		
		AreaVisitor v = new AreaVisitor();
		PerimeterVisitor v2 = new PerimeterVisitor();
		
		for(Shape s: shapes){
			s.accept(v);
			s.accept(v2);
			System.out.println("-----------");
		}
		

	}

}
