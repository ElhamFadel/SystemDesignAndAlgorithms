/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopaplication.FinalProjectLab1and2.finalproject1;

/**
 *
 * @author pc
 */
public class Employee extends user {
private int state;
    private String email;
    private String phoneNumber;
    private String checkIn;
    private String checkOut;
    private String typeOfEmployee;
    private int typeEm;
    Holiday holiday;
    
    public Employee(String id, String name, String password,String email ,String phone,int state) {
        super(id, name, password);
        this.phoneNumber=phone;
        this.email=email;
        this.state = state;
    }
        
         public void changetypeOfEmployee(int in){
      switch (in) {
          case 1:
              this.setTypeOfEmployee("Full-time");
              break;
          case 2:
              this.setTypeOfEmployee("Part-time");
          default:
              this.setTypeOfEmployee("unknown");
      }
  }  
   public void employeeInterface() {
        boolean check = true;
        while (check) {
            System.out.println(">>>>> Employee <<<<<\n1- Change Password.\n2- Attendance.\n3- Holiday.\n4- Exit.");
            int input = s.nextInt();
            s.nextLine();
            switch (input) {
                case 1:
                    ChangePassword();
                    break;
                case 2:
                    Attendance();
                    break;
                case 3:
                    Holiday();
                    break;
                case 4:
                    check = false;
                    break;

            }
        }
    }

    public void ChangePassword() {
        System.out.println(">>>>> Change Password <<<<<\nEnter new Password :");
        String newPassword = s.nextLine();
        this.setPassword(newPassword);
    }


    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Id: "+this.getId()+" || Name: "+this.getName()+" || Email: "+this.email+" || Phone : "+this.phoneNumber+" || Status: "+this.state+" || check in: "+this.getCheckIn()+" || check out :"+ this.getCheckOut()+ " || Type Emp : ("+typeEm+")" +this.typeOfEmployee;
    }

    /**
     * @return the state
     */
    public int getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(int state) {
        this.state = state;
    }

    /**
     * @return the typeOfEmployee
     */
    public String getTypeOfEmployee() {
        return typeOfEmployee;
    }

    /**
     * @param typeOfEmployee the typeOfEmployee to set
     */
    public void setTypeOfEmployee(String typeOfEmployee) {
        this.typeOfEmployee = typeOfEmployee;
    }

    /**
     * @return the typeEm
     */
    public int getTypeEm() {
        return typeEm;
    }

    /**
     * @param typeEm the typeEm to set
     */
    public void setTypeEm(int typeEm) {
        this.typeEm = typeEm;
    }

    /**
     * @return the checkIn
     */
    public String getCheckIn() {
        return checkIn;
    }

    /**
     * @param checkIn the checkIn to set
     */
    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    /**
     * @return the checkOut
     */
    public String getCheckOut() {
        return checkOut;
    }

    /**
     * @param checkOut the checkOut to set
     */
    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }
 public void Attendance() {
        boolean tf = true;
        while (tf) {
            System.out.println(">>>>> Attendance <<<<<\n1- Time of attendance.\n2- Time to leave.\n3- Exit");
            int in = s.nextInt();
              s.nextLine();
            switch (in) {
                case 1:
                   this.timeOfAttendance();
                    break;
                case 2:
                    this.timeToLeave();
                    break;
                case 3:
                    tf = false;
                    break;

            }
        }
    }public void timeOfAttendance() {
        System.out.println(">>>>> Time of attendance <<<<<\n Enter the time.");
        String time = s.nextLine();
       this.checkIn=time;
    }

    public void timeToLeave() {
        System.out.println(">>>>> Time to leave <<<<<\n Enter the time.");
        String time = s.nextLine();
        this.checkOut=time;
    }
     public void Holiday() {
        boolean tf = true;
        while (tf) {
            System.out.println(">>>>> Holiday <<<<<\n1- My Holiday.\n2- Create Holiday.\n3- Exit.");

            int in = s.nextInt();
            switch (in) {
                case 1:
                    MyHoliday();
                    break;
                case 2:
                  createHoliday();
                    break;
                case 3:
                    tf = false;
                    break;

            }
        }
    } public void MyHoliday() {
        System.out.println(">>>>> My Holiday <<<<<");
        for(Holiday h:holidays){
            if(this.getId().equals(h.getId()))
        System.out.println("Id : " + this.getId() + " || Name : " + h.getName() + " || Reason : " +h.getReason() + "  || Details : " + h.getDetails() + "  || Data : " + h.getData()+" || state of Holiday: "+h.getCheck());
    }}
 public void createHoliday() {
        System.out.println(">>>>> Create Holiday <<<<<\nEnter Name :"); 
        String name = s.nextLine();
        name=s.nextLine();
        
        System.out.println("Enter Reason :");
        String reas = s.nextLine();
        System.out.println("Enter Details : ");
        String de = s.nextLine();
        System.out.println("Enter Data : ");
        String da = s.nextLine();
       holidays.add(new Holiday(reas, de, da, name,this.getId()));
    }
    
}
