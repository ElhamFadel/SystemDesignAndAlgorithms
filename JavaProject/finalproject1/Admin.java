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
public class Admin extends user {

    private ArrayList<Manager> manager = new ArrayList<>();

    public Admin(String id, String name, String password) {
        super(id, name, password);
    }

    public Admin() {
    }

    public void printAdmin() {
        boolean is = true;
        while (is) {

            System.out.println(">>>>> Admin <<<<< \n" + "1- Add Manager. \n" + "2- Update Manager. \n" + "3- Delete Manager. \n"
                    + "4- Search about Manager. \n" + "5- Report about Manager. \n" + "6- Report about all Managers. \n" + "7- Holiday requests. \n"
                    + "8- Deactivate & Activate Manager. \n" + "9- Exit. ");

            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    addManager();
                    break;
                case 2:
                    UpdateManager();
                    break;
                case 3:
                    DeleteManager();
                    break;
                case 4:
                    searchAboutManeger();
                    break;
                case 5:
                    reportAboutManager();
                    break;
                case 6:
                    reportAboutAllManagers();
                    break;
                case 7:
                    holidayRequests();
                    break;
                case 8:
                    DeactivateActivateManager();
                    break;
                case 9:
                    is = false;
                    break;

            }

        }
    }

    public void addManager() {
        boolean isFound = false;
        s.nextLine();
        do {
            System.out.println(">>>>> Add Manager <<<<< ");
            System.out.println("Enter ID :");
            String id = s.nextLine();
            if (searchId(id) == -1) {

                System.out.println("Enter Name");
                String Name = s.nextLine();
                System.out.println("Enter password");
                String p = s.nextLine();
                System.out.println("Enter Email@");
                String email = s.nextLine();
                System.out.println("Enter PhoneNumber");
                String phone = s.nextLine();
                System.out.println("Enter status");
                int in = s.nextInt();
                getManager().add(new Manager(id, Name, p, email, phone, in));

                System.out.println("The maneger has been successfully added . :)");
                isFound = false;
            } else {
                System.out.println("Manager's id already exists,try again");
                // isFound=true;
            }
        } while (isFound);
    }

    public int searchId(String id) {
        for (int i = 0; i < manager.size(); i++) {
            if (manager.get(i).getId().equals(id)) {
                return 1;
            }
        }
        return -1;

    }

    /**
     * ************************
     */
    public void UpdateManager() {
        s.nextLine();
        boolean tf = false;
        System.out.println(">>>>> Update Manager <<<<<");
        System.out.println("Enter id:");
        String id = s.nextLine();

        for (Manager a : manager) {
            if (id.equals(a.getId())) {
                System.out.println("Enter New passWord:");
                String pass = s.nextLine();
                a.setPassword(pass);
                tf = true;
                break;
            }
        }
        if (tf) {
            System.out.println("The manager's data was successfully updated. :)");
        } else {
            System.out.println("The manager's data wasn't successfully updated. :( ");
        }

    }

    public void DeleteManager() {
        s.nextLine();
        System.out.println(">>>>> Delete Manager <<<<<");
        System.out.println("Enter id:");
        String id = s.nextLine();

        boolean tf = false;
        for (Manager m : getManager()) {
            if (id.equals(m.getId())) {
                getManager().remove(m);
                tf = true;
                break;
            }
        }
        if (tf) {
            System.out.println("The manager has been successfully deleted. :)");
        } else {
            System.out.println("The manager hasn't been successfully deleted. :(");
        }

    }

    public void searchAboutManeger() {
        s.nextLine();
        System.out.println(">>>>> Search about maneger <<<<<");
        System.out.println("Enter id:");
        String id = s.nextLine();

        boolean tf = false;
        for (Manager m : getManager()) {
            if (id.equals(m.getId())) {
                System.out.println("Name :" + m.getName() + "|| Status :" + m.getState());
                tf = true;
                break;
            }
        }
        if (!tf) {
            System.out.println("The manager is not exists :(");
        }

    }

    public void reportAboutManager() {
        s.nextLine();
        System.out.println(">>>>> Report about manager <<<<<");
        System.out.println("Enter id or name:");
        String in = s.nextLine();

        boolean tf = false;
        for (Manager m : getManager()) {
            if (in.equals(m.getId()) || in.equals(m.getName())) {
                tf = true;
                System.out.println(m.toString());
                break;
            }
        }
        if (!tf) {
            System.out.println("The manager is not exists :(");
        }

    }

    public void reportAboutAllManagers() {
        for (Manager m : getManager()) {
            System.out.println(m.toString());
        }
    }

    public void DeactivateActivateManager() {
        boolean tf2 = true;
        while (tf2) {
            System.out.println(">>>>> Deactivate & Activate Manager <<<<<\n1- Active. \n2- Deactivate. \n3- Exit.");
            int put = s.nextInt();
            s.nextLine();
            switch (put) {
                case 1:
                    active();
                    break;
                case 2:
                    deactivate();
                    break;
                case 3:
                    tf2 = false;
                    break;

            }
        }
    }

    public void active() {
        System.out.println(">>>>> Activate Manager <<<<<\nEnter id:");
        String id = s.nextLine();

        boolean tf = false;
        for (Manager m : getManager()) {
            if (id.equals(m.getId())) {
                m.setState(1);
                tf = true;
                break;
            }
        }
        if (tf) {
            System.out.println("The account has been activated. :)");
        } else {
            System.out.println(" The account hasn't been activated:( ");
        }
    }

    public void deactivate() {
        System.out.println(">>>>> Deactivate Manager <<<<<\nEnter id:");
        String id1 = s.nextLine();
        boolean tf1 = false;
        for (Manager m : getManager()) {
            if (id1.equals(m.getId())) {
                m.setState(0);
                tf1 = true;
                break;
            }
        }
        if (tf1) {
            System.out.println("The account has been disabled. :)");
        } else {
            System.out.println(" The account hasn't been disabled :( ");
        }

    }

    public ArrayList<Manager> getManager() {
        return manager;
    }

    public void holidayRequests() {
        boolean t = true;

        while (t) {
            System.out.println(">>>>> Holiday requests <<<<<\n" + "1-View Holiday request.\n2-Accept the holiday.\n3-Rejected the holiday.\n4-Exist");
            int input = s.nextInt();
            s.nextLine();
            switch (input) {
                case 1:
                    ViewHolidayRequests();
                    break;
                case 2:
                    AcceptTheHoliday();
                    break;
                case 3:
                    RejectedTheHoliday();
                    break;
                case 4:
                    t = false;
                    break;

            }
        }
    }

    public void ViewHolidayRequests() {
        System.out.println(">>>>> View Holiday requests <<<<<");
        boolean tOf = false;
        for (Holiday h : holidays) {
            if (h.getCheck() == 0) {
                tOf = true;
                System.out.println("Id : " + h.getId() + " || Name : " + h.getName() + " || Reason : " + h.getReason() + "  || Details : " + h.getDetails() + "  || Data : " + h.getData());

            }
        }
        if (!tOf) {

            System.out.println("The menu is empty :)");
        }
    }

    public void AcceptTheHoliday() {

        System.out.println(">>>>> Accept The Holiday <<<<<\nEnter id :");
        String id = s.nextLine();
        boolean tOf = false;
        for (Holiday h : holidays) {
            if (id.equals(h.getId()) && h.getCheck() == 0) {
                h.setCheck(1);
                System.out.println("Approved successfully.:)");
                tOf = true;
                break;

            }
        }
        if (!tOf) {
            System.out.println("Approved successfully.:(");
        }

    }

    public void RejectedTheHoliday() {
        boolean tOf = false;
        System.out.println(">>>>> Rejected The Holiday <<<<<\nEnter id :");
        String id = s.nextLine();
        for (Holiday h : holidays) {
            if (id.equals(h.getId()) && h.getCheck() == 0) {
                h.setCheck(2);
                System.out.println("The request was rejected.:)");
                tOf = true;
                break;
            }
        }
        if (!tOf) {

            System.out.println("The request was rejected.:(");
        }

    }
       

  



}
