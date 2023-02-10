package dec.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class CircleWithBorder extends Circle{

	public CircleWithBorder(int x, int y, int radius) {
		super(x, y, radius);
	}


	int borderWidth;
	Color borderColor;
	
	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public Color getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}

	
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		
		Graphics2D g2d = (Graphics2D) g;
		BasicStroke bs = new BasicStroke(borderWidth);
		g2d.setColor(borderColor);
		g2d.setStroke(bs);
		
		super.draw(g2d);
		

	}

}
