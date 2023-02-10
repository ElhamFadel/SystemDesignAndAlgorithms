package mvc;


public class Student {
	private String firstName;
	private String lastName;
	private long id;
	
	public Student(){
		
	}
	
	public Student(long id, String firstName, String lastName){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "id: "+id+" , First name: "+firstName+" , Last name: "+lastName;
	}
}
