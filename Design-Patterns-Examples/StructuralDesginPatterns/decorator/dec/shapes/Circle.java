package dec.shapes;

import java.awt.Graphics;

public class Circle implements IShape{

	int x,y, radius;
	
	
	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public void draw(Graphics g) {
		g.drawOval(x, y, radius, radius);
		
	}

	@Override
	public String describe() {
		return "This is a circle";
	}

}
