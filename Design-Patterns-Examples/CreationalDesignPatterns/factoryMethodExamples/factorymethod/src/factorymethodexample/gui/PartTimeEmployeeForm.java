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
import factorymethodexample.entities.ParttimeEmployee;


public class PartTimeEmployeeForm extends EmployeeForm{
	JTextField hourRateText = new JTextField();
	JTextField noHoursText = new JTextField();

	
	public PartTimeEmployeeForm() {
		super();
		

	}

	@Override
	public JPanel createSubAttributesGUI() {
		JLabel noHoursLabel = new JLabel("No. of hours:");
		JPanel noHoursPanel = new JPanel();
		noHoursPanel.setLayout(new BorderLayout());
		noHoursPanel.add(noHoursLabel, BorderLayout.WEST);
		noHoursPanel.add(noHoursText, BorderLayout.CENTER);
		this.add(noHoursPanel);

		
		JLabel hourRateLabel = new JLabel("Hour rate:");
		JPanel hourRatePanel = new JPanel();
		hourRatePanel.setLayout(new BorderLayout());
		hourRatePanel.add(hourRateLabel, BorderLayout.WEST);
		hourRatePanel.add(hourRateText, BorderLayout.CENTER);

		JPanel p = new JPanel();
		this.add(noHoursPanel);
		this.add(hourRatePanel);
		return p;
	}

	@Override
	public Employee createEmployee() {
		ParttimeEmployee emp = new ParttimeEmployee();
		emp.setHourRate(Float.parseFloat(this.noHoursText.getText()));
		emp.setNoOfHours(Integer.parseInt(this.hourRateText.getText()));
		return emp;
	}
}
