package factorymethodexample.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import factorymethodexample.entities.Employee;
import factorymethodexample.entities.FulltimeEmployee;

public abstract class EmployeeForm extends JFrame{
	
	public EmployeeForm() {
		
		this.setLayout(new GridLayout(5,1));
		// name record
		JLabel nameLabel = new JLabel("Name:");
		JTextField nameText = new JTextField();
		JPanel namePanel = new JPanel();
		namePanel.setLayout(new BorderLayout());
		namePanel.add(nameLabel, BorderLayout.WEST);
		namePanel.add(nameText, BorderLayout.CENTER);
		this.add(namePanel);
		
		// id record
		JLabel idLabel = new JLabel("ID:");
		JTextField idText = new JTextField();
		JPanel idPanel = new JPanel();
		idPanel.setLayout(new BorderLayout());
		idPanel.add(idLabel, BorderLayout.WEST);
		idPanel.add(idText, BorderLayout.CENTER);
		this.add(idPanel);

		// job title record
		JLabel jobLabel = new JLabel("Job Title:");
		JTextField jobText = new JTextField();
		JPanel jobPanel = new JPanel();
		jobPanel.setLayout(new BorderLayout());
		jobPanel.add(jobLabel, BorderLayout.WEST);
		jobPanel.add(jobText, BorderLayout.CENTER);
		this.add(jobPanel);

		
		JPanel panel = createSubAttributesGUI();
		this.add(panel);
		
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				Employee emp = createEmployee();
				emp.setId(idText.getText());
				emp.setName(nameText.getText());
				emp.setJobTitle(jobText.getText());
				
			}


			
		});
		this.add(saveButton);
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}
	
	public abstract JPanel createSubAttributesGUI();
	public abstract Employee createEmployee();
	
}
