class Student {
  late String id;
  late String firstName;
  late String middleName;
  late String lastName;
  late String email;
  late String phone;
  late String faculty;
  late double gpa;
  late bool isGraduated;
  late bool hasLoans;

  //1- the first step we want to prevent make instance of the class, make it private
  Student._(StudentBuilder builder);

//2- we want to make static class builder(inner class but we can't make it in dart )
  
}

class StudentBuilder {
    StudentBuilder();

}
