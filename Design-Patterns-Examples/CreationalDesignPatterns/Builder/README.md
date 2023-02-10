# Builder Design Pattern
- a creational design pattern.
- pattern was introduced to solve some of problems with factory when object contains a lot of attribute.
          
### Problem
- we need to create object with a lot of  attributes, and that's very bothersome.
Example :
```dart
class Student {
  String id;
  String firstName;
  String middleName;
  String lastName;
  String email;
  String phone;
  String faculty;
  double gpa;
  bool isGraduated;
  bool hasLoans;
   
   //constructor
   // so when create object, we need to pass all attributes at once.
    Student(this.id, this.firstName, this.middleName, this.lastName, this.email, this.phone, this.faculty, this.gpa, this.isGraduated, this.hasLoans);
}
```

### Solution
- we can use builder pattern to create object.
