package mvc.good;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;

import mvc.Student;
import mvc.good.Model.ModelListener;


public class View extends JFrame implements ModelListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField searchField;
	private JButton searchBtn;
	private JList<Student> searchResults;
	private JScrollPane scrollPane;
	private DefaultListModel<Student> listModel;
	Controller controller;
	
	public View(){
		this.setTitle("Student Search");
		this.setSize(400, 300);
		this.getContentPane().setLayout(new BorderLayout());
		searchField = new JTextField(25);
		searchBtn = new JButton("Search");
		listModel = new DefaultListModel<Student>();
		searchResults = new JList<Student>(listModel);
		searchResults.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane = new JScrollPane(searchResults);
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		topPanel.add(searchField);
		topPanel.add(searchBtn);
		this.getContentPane().add(topPanel, BorderLayout.NORTH);
		this.getContentPane().add(scrollPane, BorderLayout.CENTER);
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
	public void setController(Controller controller){
		this.controller = controller;
		searchBtn.addActionListener(controller);
	}
	
	public void getAll(){
		List<Student> students = controller.getAllStudents();
		this.updateSearchList(students);
	}

	public void updateSearchList(List<Student> students){
		listModel.removeAllElements();
		for(Student student: students)
			listModel.addElement(student);
		this.searchResults.updateUI();
	}
	
	public static void main(String args[]){
		new View();
	}

	@Override
	public void updateStudents(List<Student> students) {
		this.updateSearchList(students);
	}
}
