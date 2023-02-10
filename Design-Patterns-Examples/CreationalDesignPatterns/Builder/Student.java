package builder;

public class Student {

	String firstName, lastName, address, id, college, department;
	int age;
	String mobileNo;
	
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	private Student(String firstName, String lastName, String address, String id, String college, String department){
		this.firstName = firstName;
		this.lastName = lastName;
		this.address=address;
		this.id = id;
		this.college = college;
		this.department = department;
	}
	
	static class Builder{
		String firstName, lastName, address, id, college, department;
		int age;
		String mobileNo;
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void setId(String id) {
			this.id = id;
		}
		public void setCollege(String college) {
			this.college = college;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		
		public Student build(){
			if(firstName == null)
				throw new NullPointerException("first name cannot be null");
			if(lastName == null)
				throw new NullPointerException("last name cannot be null");
			if(college == null)
				throw new NullPointerException("college cannot be null");
			if(department == null)
				throw new NullPointerException("department cannot be null");
			if(id == null)
				throw new NullPointerException("id cannot be null");
			if(address == null)
				throw new NullPointerException("address cannot be null");
			
			Student s = new Student(firstName, lastName, address, id, college, department);
			s.setMobileNo(mobileNo);
			s.setAge(age);
			return s;
		}
		
	}

}
