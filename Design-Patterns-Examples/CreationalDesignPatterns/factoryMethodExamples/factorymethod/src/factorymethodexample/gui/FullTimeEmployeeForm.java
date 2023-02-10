package factorymethodexample.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import factorymethodexample.entities.Employee;
import factorymethodexample.entities.FulltimeEmployee;


public class FullTimeEmployeeForm extends EmployeeForm{

	JTextField salaryText = new JTextField();
	
	public FullTimeEmployeeForm() {
		super();
		

		
	}

	@Override
	public JPanel createSubAttributesGUI() {
		JLabel salaryLabel = new JLabel("salary:");
		JPanel salaryPanel = new JPanel();
		salaryPanel.setLayout(new BorderLayout());
		salaryPanel.add(salaryLabel, BorderLayout.WEST);
		salaryPanel.add(salaryText, BorderLayout.CENTER);
		return salaryPanel;
	}

	@Override
	public Employee createEmployee() {
		FulltimeEmployee emp = new FulltimeEmployee();
		emp.setBasicSalary(Float.parseFloat(salaryText.getText()));
		return emp;
	}

}
