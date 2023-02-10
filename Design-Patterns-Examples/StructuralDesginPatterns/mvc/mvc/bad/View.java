package mvc.bad;


import java.awt.BorderLayout;
import java.awt.Component;
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


public class View extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField searchField;
	private JButton searchBtn;
	private JList<Student> searchResults;
	private JScrollPane scrollPane;
	private DefaultListModel<Student> listModel;
	
	Connection conn = null;
    String url = "jdbc:sqlite:I:/sqlite/db/students.db";
	
	public View(){
		this.setTitle("Student Search");
		this.setSize(400, 300);
		this.getContentPane().setLayout(new BorderLayout());
		searchField = new JTextField(25);
		searchBtn = new JButton("Search");
		searchBtn.addActionListener(this);
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
	
		try {
			conn = DriverManager.getConnection(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<Student> allStudents = this.getAllStudents();
		this.updateSearchList(allStudents);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
			List<Student> students = this.getStudentsByFirstName(searchField.getText().trim());
			this.updateSearchList(students);
		
	}

	public void updateSearchList(List<Student> students){
		listModel.removeAllElements();
		for(Student student: students)
			listModel.addElement(student);
		this.searchResults.updateUI();
	}

	public List<Student> getAllStudents(){
		String query = "select * from students";
		return executeQuery(query);
	}
	
	public List<Student> getStudentsByFirstName(String firstName){
		String query = "select * from students where firstname = '"+firstName+"'";
		return executeQuery(query);
	}

	private List<Student> executeQuery(String query) {

		try{
			List<Student> students = new ArrayList<Student>();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()){
				long id = rs.getLong("id");
				String firstName = rs.getString("firstname");
				String lastName = rs.getString("lastname");
				students.add(new Student(id,firstName, lastName));
			}
			return students;
		}
		catch (SQLException ex){
			ex.getMessage();
		}
		return null;
	}
	
	public void addStudent(Student student){
		try{
			if(!containsStudent(student.getId())){	
				String query = "insert into students(id, firstname, lastname) values("+student.getId()+",'"+student.getFirstName()+"','"+student.getLastName()+"')";
				Statement st = conn.createStatement();
				st.executeUpdate(query);
			}
		}
		catch (SQLException ex){
			ex.printStackTrace();
		}
	}
	
	private boolean containsStudent(long id) {
		boolean isFound = false;
		try{
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from students where id = "+id);
			isFound = rs.next();
		}
		catch (SQLException ex){
			ex.printStackTrace();
		}
		return isFound;
	}

	
	public static void main(String args[]){
		new View();
	}
}
