package observer.eventdriven.ui;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatusBar extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel statusLabel;
	
	public StatusBar(){
		FlowLayout l = new FlowLayout();
		l.setAlignment(FlowLayout.LEFT);
		this.setLayout(l);
		statusLabel = new JLabel("Status : ");
		this.add(statusLabel);
	}
	
	protected void setStatus(String status){
		statusLabel.setText("Status : " + status);
	}
}
