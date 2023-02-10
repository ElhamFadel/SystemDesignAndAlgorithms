/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Interface_login;

import Database.myDB;
import hashing.HashFunction;
import Entity.Pharmacist;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import prog3_final_project.Prog3_final_project;
import static prog3_final_project.Prog3_final_project.primaryStage;

public class PharmacistloginController implements Initializable {

    @FXML
    private Button signup_btn;

    @FXML
    private TextField pha_name_txtField;

    @FXML
    private PasswordField pha_pass_txtField;

    @FXML
    private Button back_btn;

    @FXML
    private Button login_btn;

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    @FXML
    private void login(ActionEvent event) throws Exception {
        System.out.println("Login Button Pressed");
        String name = pha_name_txtField.getText().trim();
        String password = pha_pass_txtField.getText().trim();
        String hashedPassword = HashFunction.getHash(password.getBytes());
        Pharmacist pharm = new Pharmacist();
        pharm.setName(name);
        pharm.setPassword(hashedPassword);
        System.out.println(hashedPassword);
        if (!name.equals("") || !password.equals("")) {
            ResultSet pharmRow = myDB.getPharm(pharm);
            boolean isExist = false;
            try {
                while (pharmRow.next()) {
                    isExist = true;
                    Prog3_final_project.pharmLoginID = pharmRow.getInt("id");
                }
                if (isExist) {
                    System.out.println("Login Pharmacy Successfully");
                    //System.out.println("User Login ID: " + userLoginID);
                    //showItemScreen();
                    //Interface_pharmacist
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("/Interface_pharmacist/pharmacist_active.fxml"));
                    try {
                        loader.load();

                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                    Parent root = loader.getRoot();
                    //Stage stage = new Stage();
                    primaryStage.setTitle("pha");
                    primaryStage.setScene(new Scene(root));
                    primaryStage.showAndWait();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid name or Password", "Wrong Credentials", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Invalid Name or Password");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.out.println("Incorrect UserName or Password");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void back_1(ActionEvent event) {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Interface/main.fxml"));
        try {
            loader.load();

        } catch (IOException ex) {
            System.out.println(ex);
        }
        Parent root = loader.getRoot();
        Prog3_final_project.primaryStage.setScene(new Scene(root));

    }

}
