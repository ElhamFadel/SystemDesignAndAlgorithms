public class main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Student.Builder builder = new Student.Builder();
        builder.setFirstName("John");
        builder.setMiddleName("Doe");
        builder.setLastName("Smith");
        builder.setEmail("elham2000fadel@gmail.com");
        builder.setPhone("+966555555555");
        builder.setFaculty("Computer Science");
        builder.setGpa(92);
        //a bove attribute is related to builder class until now 
        //now we need to create a student object
        Student student = builder.build();

    }
}
