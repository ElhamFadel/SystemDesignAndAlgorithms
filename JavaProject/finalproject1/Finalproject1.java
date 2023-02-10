/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopaplication.FinalProjectLab1and2.finalproject1;

import java.io.IOException;

/**
 *
 * @author pc
 */
public class Finalproject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            Admin n = new Admin();

            n.geList();
        } catch (IOException e) {
            System.out.println(e + "  error try again ");
        } catch (Exception ex) {
            System.out.println(ex + "error try again");
        }

    }
}
