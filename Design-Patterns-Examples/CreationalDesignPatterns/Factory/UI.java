package painter;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.net.SocketFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import painter.shapes.Circle;
import painter.shapes.Rectangle;




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
		
		
		for(int key: ShapeFactory.m.keySet()){
			String className = ShapeFactory.m.get(key).getSimpleName();
			JButton btn = new JButton(className);
			btn.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					Shape p = ShapeFactory.createShape(key);
					g.draw(p, drawArea.getGraphics());
				}
				
			});
			panel.add(btn);
		}
		
		
		drawArea = new JPanel();
		this.getContentPane().add(drawArea,BorderLayout.CENTER);
		this.getContentPane().add(panel, BorderLayout.SOUTH);
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	public static void main(String args[]){
			new UI();
	}
}
