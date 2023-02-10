/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopaplication.FinalProjectLab1and2.finalproject1;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Manager extends Employee{
  private ArrayList<Employee>employee=new ArrayList<>();
  
   
    public ArrayList<Employee> getEmployee() {
        return employee;
    }
  

    public Manager( String id, String name, String password, String email, String phone,int state) 
    {
        super(id, name, password, email, phone,state);
    }
    public void ManagerInterface(){
   boolean check=true;
   while(check){
      
     System.out.println(">>>>> Manager <<<<< \n" + "1- Add Employee. \n" + "2- Update Employee. \n" + "3- Delete Employee. \n"
                + "4- Search about Employee. \n" + "5- Report about Employee. \n" + "6- Report about All Employee. \n" 
                + "7- Deactivate & Activate Manager. \n" +"8- Promote an employee to Manager. \n"+"9- Attendance. \n"+"10- Holiday. \n"+ "11- Exit. ");
    
     int input=s.nextInt();
     s.nextLine();
        switch (input) {
            case 1:
                addEmployee();
                break;
                case 2:
                UpdateEmployee();
                break;
           case 3:
                DeleteEmployee();
                break;
           case 4:
              searchAboutEmployee();  
                break;
           case 5:
                reportAboutEmployee();
                break;
           case 6:
                reportAboutAllEmployee();
                break;
           case 7:
                DeactivateActivateEmployee();
                break;
           case 8:
                PromoteEmployeeToManager(); 
                break;
          case 9:
                Attendance();
               break;
           case 10:
               Holiday();
                break;
           case 11:
                check=false;
                break;
           
           }
        }
    
    
    }
    
     public void addEmployee() {
 boolean isFound=false;
        do{
        System.out.println(">>>>> Add Employee <<<<< ");
        System.out.println("Enter ID : ");
        String id = s.nextLine();
        if(searchId(id)==-1){
        System.out.println("Enter Name : ");
        String Name = s.nextLine();
        System.out.println("Enter password : ");
        String p = s.nextLine();
        System.out.println("Enter Email : ");
        String email = s.nextLine();
        System.out.println("Enter PhoneNumber : ");
        String phone = s.nextLine();
        System.out.println("Types of employee (1) <Full-time> or (2) <Part-time>");
        int in = s.nextInt();
        System.out.println("Enter status :");
        int inp = s.nextInt();
        this.setTypeEm(in);
        this.changetypeOfEmployee(in);
        getEmployee().add( new Employee(id, Name, p, email, phone, inp));
        System.out.println("The Employee has been successfully added. :)");
        
        }else{
            System.out.println("Employee's id already exists,try again");
            isFound=true;
        }}while(isFound);
      
    }
 
 public int searchId(String id){
        for(Employee e:getEmployee()){
            if(e.getId().equals(id)){
                return 1;
            }
        }
        return -1;
        
       
    }
    
    public void UpdateEmployee() {
         s.nextLine();
            boolean tf = false;
        System.out.println(">>>>> Update Employee <<<<<");
        System.out.println("Enter id:");
        String id = s.nextLine();
      
        
         for (Employee a:getEmployee()) {
            if (id.equals(a.getId())) {
                System.out.println("Enter New passWord:");
                String pass = s.nextLine();
                a.setPassword(pass);
                tf = true;
                break;
            }
        }
        if (tf) {
            System.out.println("The employee's data was successfully updated. :)");
        } else {
            System.out.println("The employee's data wasn't successfully updated. :( ");
        }

    }
     public void DeleteEmployee(){
       s.nextLine();
        System.out.println(">>>>> Delete Employee <<<<<");
       System.out.println("Enter id:");
        String id = s.nextLine();
        boolean tf = false;
        for (Employee m : getEmployee()) {
            if (id.equals(m.getId())) {
                getEmployee().remove(m);
                tf=true;
                break;
            }
        }
        if (tf) {
            System.out.println("The employee has been successfully deleted. :)");
        } else {
            System.out.println("The employee has been successfully deleted. :(");
        }

    }
    public void searchAboutEmployee(){
        s.nextLine();
    System.out.println(">>>>> Search about Employee <<<<<");
     System.out.println("Enter id:");
        String id = s.nextLine();
        
        boolean tf = false;
        for (Employee m : getEmployee()) {
            if (id.equals(m.getId())) {
                System.out.println("Name :"+m.getName()+"|| Status :"+ m.getState());
                tf=true;
                break;
            }
        }
        if (!tf) {
            System.out.println("The employee is not exists :(");
        }
    
}
    public void reportAboutEmployee(){
                s.nextLine();
    System.out.println(">>>>> Report about employee <<<<<");
     System.out.println("Enter id or name:");
        String in = s.nextLine();
        boolean tf = false;
        for (Employee m : getEmployee()) {
            if (in.equals(m.getId())||in.equals(m.getName())) {
                tf=true;
                System.out.println( m.toString());
                break;
            }
        }
        if (!tf) {
            System.out.println("The employee is not exists :(");
        }
    
}
    public void reportAboutAllEmployee(){
for (Employee m : getEmployee()) {
                 System.out.println(m.toString());
            }
        }
  @Override
    public String toString() {
        return "Id: "+this.getId()+" || Name: "+this.getName()+" || Email: "+this.getEmail()+" || Phone : "+this.getPhoneNumber()+" || Status: "+this.getState()+" || check in: "+this.getCheckIn()+" || check out :"+ this.getCheckOut();
    }
    public void DeactivateActivateEmployee(){
   boolean tf2 =true; 
while(tf2){
    System.out.println(">>>>> Deactivate & Activate Employee <<<<<\n1- Active. \n2- Deactivate. \n3- Exit.");
    int put=s.nextInt();
    s.nextLine();
    switch (put) {
        case 1:
            active();
            
            break;
        case 2:
            deactivate();
            break;
        case 3:
            tf2=false;
            break;
            
            
            
            
    }}}
    public void active(){
        System.out.println(">>>>> Activate Employee <<<<<\nEnter id:");
           String id= s.nextLine();
           boolean tf=false;
           for (Employee m : getEmployee()) {
            if (id.equals(m.getId())) {
               m.setState(1);
               tf= true ;
                break;
            }}
            if (tf) {
            System.out.println("The account has been activated. :)");
        } else {
            System.out.println(" The account hasn't been activated:( ");
        }
    }
    public void deactivate(){
         System.out.println(">>>>> Deactivate Employee <<<<<\nEnter id:");
           String id1= s.nextLine();
           boolean tf1=false;
           for (Employee m : getEmployee()) {
            if (id1.equals(m.getId())) {
               m.setState(0);
               tf1= true ;
                break;
            }}
            if (tf1) {
            System.out.println("The account has been disabled. :)");
        } else {
            System.out.println(" The account hasn't been disabled :( ");}
            
    }
    public void PromoteEmployeeToManager(){
        System.out.println(">>>>> Promote an employee to Manager <<<<<\nEnter id: ");
        String id=s.nextLine();
        boolean isExists=false;
        for(Employee m:getEmployee()){
            if(id.equals(m.getId())){
               
                admain[0].getManager().add(new Manager(id, m.getName(), m.getPassword(), m.getEmail(), m.getPhoneNumber(), m.getState()));
                getEmployee().remove(m);
                isExists=true;
                System.out.println("The current employee ("+id+") has the authority of a manager.");
                break;
           
            }
        }if(!isExists){
             System.out.println("Employee's current is not exist.");
        }
        
    }
    
    

    
   

    
}
