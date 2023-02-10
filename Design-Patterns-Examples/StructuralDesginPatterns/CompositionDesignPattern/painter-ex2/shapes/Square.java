package composite.painter.shapes;

import java.awt.Graphics;


public class Square implements Shape{

	int x,y;
	int width;
	
	public Square() {
		super();
	}
	public Square(int x, int y, int width) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
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
	@Override
	public void draw(Graphics g) {
		g.drawRect(x, y, width, width);
	}
	
}
