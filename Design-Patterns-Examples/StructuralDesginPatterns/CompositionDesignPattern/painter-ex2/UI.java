package composite.painter;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import composite.painter.shapes.Shape;




public class UI extends JFrame{

	
	private JButton btnClear;
	private JButton btnUndo;
	private JPanel drawArea;
	private JPanel panel = new JPanel();
	private GraphEditor g = new GraphEditor();
	Random r = new Random();
	public UI(){
		this.setTitle("Painter");
		this.getContentPane().setLayout(new BorderLayout());
		panel.setAlignmentX(CENTER_ALIGNMENT);

		this.createButtons();
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				g.clear(drawArea.getGraphics());
			}
			
		});
		panel.add(btnClear);
		btnUndo = new JButton("Undo");
		btnUndo.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				g.undo(drawArea.getGraphics());
			}
			
		});
		btnUndo.setActionCommand("Undo");
		panel.add(btnUndo);
		
		drawArea = new JPanel();
		this.getContentPane().add(drawArea,BorderLayout.CENTER);
		this.getContentPane().add(panel, BorderLayout.SOUTH);
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void createButtons(){
		for(final Class shapeClass: ReflectionShapeFactory.getRegisteredShapes()){
			JButton btn = new JButton(shapeClass.getSimpleName());
			btn.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					Shape p = ReflectionShapeFactory.createShape(shapeClass.getName());
					g.draw(p, drawArea.getGraphics());
				}
				
			});
			panel.add(btn);

		}
	
	}
	
	public static void main(String args[]){
		new UI();
	}
}
