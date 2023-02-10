package dec.shapes;

import java.awt.Graphics;

public class Rectangle implements IShape{

	int x,y,width, hieght;
	public Rectangle(int x, int y, int width, int hieght) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.hieght = hieght;
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
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHieght() {
		return hieght;
	}
	public void setHieght(int hieght) {
		this.hieght = hieght;
	}
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void draw(Graphics g) {
		g.drawRect(x, y, width, hieght);
	}
	@Override
	public String describe() {
		return "This is a rectangle";

	}

}
