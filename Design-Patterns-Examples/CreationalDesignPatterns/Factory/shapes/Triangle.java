package painter.shapes;

import java.awt.Graphics;
import java.util.Random;

import painter.Shape;

public class Triangle implements Shape{
	Random r = new Random();
	int x1,y1;
	
	public Triangle() {
		x1 = r.nextInt(300);
		y1 = r.nextInt(300);
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine(x1, y1, x1+50, y1+50);
		g.drawLine(x1, y1, x1-50, y1+50);
		g.drawLine(x1+50, y1+50, x1-50, y1+50);
		
	}

}
