package observer.eventdriven.ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import observer.eventdriven.Message;
import observer.eventdriven.handler.NetworkMessageHandler.NetworkMessageListener;

public class MessengerUI extends JFrame implements NetworkMessageListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JTextArea chatArea;
	StatusBar statusBar;
	
	public MessengerUI(){
		this.setTitle("Chat UI");
		this.getContentPane().setLayout(new BorderLayout());
		
		chatArea = new JTextArea();
		chatArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(chatArea);
		statusBar = new StatusBar();
		
		this.getContentPane().add(scrollPane, BorderLayout.CENTER);
		this.getContentPane().add(statusBar, BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}


	public void update(Message msg) {
		chatArea.append(msg.getSender() + " : "+msg.getMessage() + "\n");
		statusBar.setStatus(msg.getSender() + " send a message");
		
	}
}

