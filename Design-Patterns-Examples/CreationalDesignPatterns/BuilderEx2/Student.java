public class Student {
    //make attributes private so that they can only be accessed by methods (seter & geter) in this class
  private String id;
  private String firstName;
  private String middleName;
  private String lastName;
  private String email;
  private String phone;
  private String faculty;
  private float gpa;
  private boolean isGraduated;
  private boolean hasLoans;
    // 1- make constructor private to prevant make instance 
    private  Student(String id, String firstName, String middleName, String lastName, String email, String phone, String faculty, float gpa, boolean isGraduated, boolean hasLoans) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.faculty = faculty;
        this.gpa = gpa;
        this.isGraduated = isGraduated;
        this.hasLoans = hasLoans;
    }
    // 2- make inner class static to be able access it from outer class name
    public static class Builder{
     private String id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String phone;
    private String faculty;
    private float gpa;
    private boolean isGraduated;
    private boolean hasLoans;

    // create method build 
    public Student build(){
        if(id == null || firstName == null || lastName == null || email == null || phone == null || faculty == null || gpa == 0 || isGraduated == false || hasLoans == false){
            throw new IllegalStateException("Missing required fields");
        }
        return new Student(id, firstName, middleName, lastName, email, phone, faculty, gpa, isGraduated, hasLoans);
    }
    
    //methods
    public String getId(){
        return id;
    }
     public String getFirstName(){
        return firstName;
    }
     public String getMiddleName(){
        return middleName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }
    public String getFaculty(){
        return faculty;
    }
    public float getGpa(){
        return gpa;
    }
    public boolean getIsGraduated(){
        return isGraduated;
    }
    public boolean getHasLoans(){
        return hasLoans;
    }
    // setter
    public String setId(String id){
        this.id = id;
        return id;
    }
    public String setFirstName(String firstName){
        this.firstName = firstName;
        return firstName;
    }
    public String setMiddleName(String middleName){
        this.middleName = middleName;
        return middleName;
    }
    public String setLastName(String lastName){
        this.lastName = lastName;
        return lastName;
    }
    public String setEmail(String email){
        this.email = email;
        return email;
    }
    public String setPhone(String phone){
        this.phone = phone;
        return phone;
    }
    public String setFaculty(String faculty){
        this.faculty = faculty;
        return faculty;
    }
    public float setGpa(float gpa){
        this.gpa = gpa;
        return gpa;
    } 
    public boolean setIsGraduated(boolean isGraduated){
        this.isGraduated = isGraduated;
        return isGraduated;
    }
    public boolean setHasLoans(boolean hasLoans){
        this.hasLoans = hasLoans;
        return hasLoans;
    }



     

    }

    
}