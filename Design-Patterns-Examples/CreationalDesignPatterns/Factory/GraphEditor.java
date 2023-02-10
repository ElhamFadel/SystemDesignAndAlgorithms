package painter;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;



public class GraphEditor {
	
	private List<Shape> shapes = new ArrayList<Shape>();
	
	public void draw(Shape shape, Graphics g){
		shape.draw(g);
		shapes.add(shape);
	}
	public void clear(Graphics g){
		g.clearRect(0, 0, 400, 400);
	}
	
	public void undo(Graphics g){
		for(Shape shape :shapes)
			shape.draw(g);
		shapes.clear();
	}
}
