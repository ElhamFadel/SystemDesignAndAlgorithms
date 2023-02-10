package factorymethodexample.gui;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import factorymethodexample.entities.ContractBasedEmployee;
import factorymethodexample.entities.Employee;

public class ContractBasedEmployeeForm extends EmployeeForm{

	@Override
	public JPanel createSubAttributesGUI() {

		JLabel durationLabel = new JLabel("Contract Duration:");
		JTextField durationText = new JTextField();
		JPanel dPanel = new JPanel();
		dPanel.setLayout(new BorderLayout());
		dPanel.add(durationLabel, BorderLayout.WEST);
		dPanel.add(durationText, BorderLayout.CENTER);
		return dPanel;	
		
	}

	@Override
	public Employee createEmployee() {
		ContractBasedEmployee emp = new ContractBasedEmployee();
		//
		return emp;
	}

}
