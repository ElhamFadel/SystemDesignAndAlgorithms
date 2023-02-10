package painter.shapes;

import java.awt.Graphics;
import java.util.Random;

import painter.Shape;


public class Circle implements Shape{

	int x,y;
	int radius;
	static Random r = new Random();
	
	public Circle(){
		this(r.nextInt(200), r.nextInt(200), 50);
	}
	
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
		g.drawOval(this.getX(), this.getY(), this.getRadius(), this.getRadius());
		
	}
	
}
