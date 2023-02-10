package builder;

public abstract class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		Student.Builder builder = new Student.Builder();
		builder.setFirstName("Omar");
		builder.setAge(20);
		builder.setCollege("IT");
		builder.setId("12345");
		builder.setDepartment("CS");
		builder.setAddress("Gaza");
		builder.setLastName("Ahmed");
		Student s = builder.build();
		
	}
}
