package mvc.good;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import mvc.Student;

public class Model {

	Connection conn = null;
    String url = "jdbc:sqlite:I:/sqlite/db/students.db";
    Set<ModelListener> listeners = new HashSet<>();
    
    
	public Model() {
		
		try {
			conn = DriverManager.getConnection(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void addListener(ModelListener l){
		listeners.add(l);
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


	interface ModelListener{
		public void updateStudents(List<Student> students);
	}


	public void updateViews() {
		List<Student> students = this.getAllStudents();
		for(ModelListener l: listeners)
			l.updateStudents(students);
	}
	

}
