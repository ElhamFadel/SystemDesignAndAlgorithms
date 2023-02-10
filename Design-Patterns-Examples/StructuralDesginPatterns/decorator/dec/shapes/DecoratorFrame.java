package dec.shapes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DecoratorFrame extends JFrame{

	Random r = new Random();
	public DecoratorFrame() {
		
		JButton addShapeBtn = new JButton("Add shape");
		addShapeBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JTextArea a = new JTextArea();
				JScrollPane sp = new JScrollPane(a);
				
				getContentPane().add(sp);
				
				Circle c = new Circle(r.nextInt(300),r.nextInt(300),100);
				Border border = new Border(c);
				border.setBorderColor(Color.green);
				border.setBorderWidth(3);
				
				Rectangle rect = new Rectangle(r.nextInt(300),r.nextInt(300), 100, 50);
				
				Border border2 = new Border(rect);
				border2.setBorderColor(Color.red);
				border2.setBorderWidth(2);
				
				//CircleWithBorder cb = new CircleWithBorder(r.nextInt(300),r.nextInt(300),100);

				border.draw(getGraphics());
				border2.draw(getGraphics());
				System.out.println(border.describe());
			}
		});
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400, 300);
		this.setLayout(new BorderLayout());
		this.add(addShapeBtn, BorderLayout.SOUTH);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public static void main(String[] args){
		new DecoratorFrame();
	}
}
