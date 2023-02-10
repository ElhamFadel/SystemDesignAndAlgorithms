/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopaplication.FinalProjectLab1and2.finalproject1;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public abstract class user {

    static ArrayList<Holiday> holidays = new ArrayList<>();
    static Admin[] admain = new Admin[1];
    Scanner s = new Scanner(System.in);
    private String id;
    private String name;
    private String password;

    public user(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public user() {
    }

    public void login1() {

        System.out.println("Enter userName ");
        String nam = s.nextLine();
        System.out.println("Enter password ");
        String pass = s.nextLine();
        System.out.println("Enter id ");
        String iD = s.nextLine();
        Admin a = new Admin(iD, nam, pass);
        admain[0] = a;

    }

    public void geList() throws IOException {

        login1();
        while (true) {
            System.out.println(">>>>> Login Screen >>>>> \n" + "1- Login as Admin \n" + "2- Login as Manager \n"
                    + "3- Login as Employee \n" + "4- Exit");
            int operation = s.nextInt();
            s.nextLine();
            switch (operation) {

                case 1:
                  logAdmin();
                    break;

                case 2:
                    logManager();
                    
                    break;

                case 3:

                   logEmployee();
                    break;
                case 4:
            stor();
            System.exit(0);
            break;
            }
        }
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

   public void logAdmin(){
         boolean isCo = true;
                    do {
                        System.out.println("Enter ID: ");
                        String id1 = s.nextLine();

                        System.out.println("Enter password : ");
                        String passwOrd = s.nextLine();
                        if (id1.equals(admain[0].getId())) {
                            if (passwOrd.equals(admain[0].getPassword())) {
                                isCo = false;
                            } else {
                                System.out.println("Sorry , try again the passwor is error .");
                            }
                        } else {
                            System.out.println("you don't have account.");
                        }
                    } while (isCo);

                    admain[0].printAdmin();
   }
    public void logEmployee(){
         System.out.println("Enter id ");
                    String ide = s.nextLine();

                    System.out.println("Enter password ");
                    String passwOr = s.nextLine();
                    boolean hasAccountE = false;
                    for (int i = 0; i < admain[0].getManager().size(); i++) {
                        Manager m = admain[0].getManager().get(i);
                        
                        for (int j = 0; j < m.getEmployee().size(); j++) {
                            Employee e=m.getEmployee().get(j);
                            if (ide.equals(e.getId())) {
                                if(passwOr.equals(e.getPassword())){
                                
                                if (e.getState() == 0) {
                                    System.out.println("your acouunt disabled so you con't login in ");
                                    hasAccountE = true;
                                    break;
                                }else{
                                     e.employeeInterface();
                                    hasAccountE = true;
                                }
                                
                                } else {
                                System.out.println("Sorry , try again the passwor is error .");
                                hasAccountE=true;
                                    
                                }
                                break;
                            }
                        }
                    }
                    if (hasAccountE == false) {
                        System.out.println("you don't have account.");

                    }
        
        
    }
    public void logManager(){
        System.out.println("Enter id ");
                    String id1 = s.nextLine();
                    System.out.println("Enter password ");
                    String passwOrd = s.nextLine();
                    boolean hasAccount = false;
                    for (Manager a : admain[0].getManager()) {
                        if (id1.equals(a.getId())) {
                            if(passwOrd.equals(a.getPassword())){
                            if (a.getState() == 0) {
                                System.out.println("your acouunt disabled so you con't login in ");
                                hasAccount = true;
                                break;
                            }else{
                                a.ManagerInterface();
                                hasAccount = true; 
                            }
                            } else {
                                System.out.println("Sorry , try again the passwor is error .");
                                hasAccount=true;
                                
                            }
                            break;
                        }
                    }
                    if (hasAccount == false) {
                        System.out.println("you don't have account.");

                    }

    }
    public void stor() throws IOException{
         File myProject = new File("myProject");
                    PrintWriter p = null;
                    
                        myProject.mkdir();
                        if (myProject.exists()) {
                            File n = new File(myProject.getPath() + "\\projec.txt");

                            n.createNewFile();
                            p = new PrintWriter(n);
                            p.println(admain[0].toString());
                            for (Manager a : admain[0].getManager()) {

                                p.println(a.toString());
                            }
                            for (int i = 0; i < admain[0].getManager().size(); i++) {
                                Manager a = admain[0].getManager().get(i);
                                for (int j = 0; j < a.getEmployee().size(); j++) {
                                    p.print(a.getEmployee().get(j).toString());
                                }
                            }
                                }else{
                             System.out.println("The file is not exist");     
                                }
                        p.close();

    }
      public int choice() {
        System.out.println("Enter the choice (1-4)");
      int ch=s.nextInt();
    return ch;
    
    }
}
