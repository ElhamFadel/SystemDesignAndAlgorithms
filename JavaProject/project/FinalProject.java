/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopaplication.FinalProjectLab1and2.project;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String username = "admin", password = "123456";
        boolean cont = true;
        String[] name = new String[100];
        String[] phonNum = new String[100];
        double[] amount = new double[100];
        System.out.println("Pleas, Enter the  username :");
        Scanner s = new Scanner(System.in);
        String usern = s.next().toLowerCase();
        System.out.println("Pleas, Enter the  password :");
        String pasw = s.next();

        if (username.equals(usern) && password.equals(pasw)) {
            int n = 0;
            while (cont) {
                System.out.println("1- Creat a new accunt");
                System.out.println("2- Deposit an amount in the account");
                System.out.println("3- withdraw an amount from the account");
                System.out.println("4– Delete a bank account");
                System.out.println("5- Search for a bank account");
                System.out.println("6- View all bank accounts");
                System.out.println("Pleas, Enter the type of operation");
                int operation = s.nextInt();
                s.nextLine();

                switch (operation) {
                    case 1:
                        System.out.println("*$* Creat a new accunt *$* ");
                        System.out.println("Enter the custamers name ");
                        name[n] = s.nextLine();
                        System.out.println("Enter the custamers phon Number ");
                        phonNum[n] = s.nextLine();
                        System.out.println("Enter the custamers amount ");
                        amount[n] = s.nextDouble();
                        n++;
                        break;
                    case 2:
                        System.out.println("*$* Deposit an amount in the account *$*");
                        System.out.println("Enter the custamer number you want to deposit money in his account");
                        int index = s.nextInt();
                        System.out.println("Enter the amount you want to deposit :");
                        double amount1 = s.nextDouble();
                        if (amount1 <= 0) {
                            System.out.println("$$$ Deposit amount is Invalid $$$ ");
                        } else {
                            System.out.println("Balance before deposit:" + amount[index]);
                            amount[index] += amount1;
                            System.out.println("Balance after deposit: " + amount[index]);
                        }
                        break;
                    case 3:
                        System.out.println("*$* withdraw an amount from the account *$*");
                        System.out.println("Enter the custamer number you want to withdraw money in his account");
                        int indextW = s.nextInt(); 
                        System.out.println("Enter the amount you want to withdraw");
                        double amount2 = s.nextDouble();

                        if (amount2 <= 0) {
                            System.out.println("$$$ Withdraw amount is Invalid $$$");
                        } else {
                            if (amount[indextW] >= amount2) {
                                System.out.println("Balance before withdraw : " + amount[indextW]);
                                amount[indextW] -= amount2;
                                System.out.println("Balance after withdraw :  " + amount[indextW]);
                            } else {
                                System.out.println("you can not withdraw amount :( ");
                            }
                        }

                        break;
                    case 4:
                        System.out.println("*$* Delete a bank account *$*");
                        System.out.println("Enter the custamer number you want to delete money in his account");
                        int indextDe = s.nextInt();
                        name[indextDe] = null;
                        phonNum[indextDe] = null;
                        amount[indextDe] = 0;
                          break;
                    case 5:
                        System.out.println("*$* Search for a bank account *$*");
                        System.out.println("Enter the custamer name you want to search of ");
                        String search = s.nextLine();
                        boolean isexist = false;
                        for (int i = 0; i < name.length; i++) {
                            if (search.equals(name[i])) {
                                isexist = true;
                                break;
                            } else {
                                isexist = false;
                            }
                        }
                        if (isexist) {
                            System.out.println("bank account exist :-");
                        } else {
                            System.out.println("bank account not exist :-");
                        }
                        break;
                    case 6:
                        System.out.println("*$* View all bank accounts *$*");
                        for (int i = 0; i < name.length; i++) {
                            if (name[i] != null && phonNum[i] != null && amount[i] != 0) {
                                System.out.println("  name =  " + name[i] + "   phon number =  " + phonNum[i] + "   amount =  " + amount[i] );
                            }
                            
                            
                        }

                        break;
                    default:
                        System.out.println("Invailed operator :(");

                }

                System.out.println("if you want to continue Enter,(ok).or Enter(done)to exit . ");
                String again = s.next();

                if (again.equalsIgnoreCase("ok")) {
                    cont = true;
                } else {
                    break;
                }
                 System.out.println(" *$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*  ");
             }

        } else {
            System.out.println("  Error in username or password ,try again");
        }

    }
}
