package painter.shapes;

import java.awt.Graphics;
import java.util.Random;

import painter.Shape;

public class Rectangle implements Shape {
	private static Random r = new Random();
	
	public Rectangle(){
		this(r.nextInt(200),r.nextInt(200), 100,50);
	}
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		System.out.println("Rctangle is created!");
	}

	int x1,y1,x2,y2;

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	@Override
	public void draw(Graphics g) {
		g.drawRect(x1, y1, x2, y2);
	}
}
