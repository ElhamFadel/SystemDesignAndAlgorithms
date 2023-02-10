package mvc.good;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import mvc.Student;

public class Controller implements ActionListener{

	View view;
	Model model;
	
	public Controller(View view, Model model) {
		this.model = model;
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
			List<Student> students = model.getStudentsByFirstName(view.searchField.getText().trim());
			view.updateSearchList(students);
		
	}

	public List<Student> getAllStudents() {
		List<Student> students = model.getAllStudents();
		return students;
	}

}
