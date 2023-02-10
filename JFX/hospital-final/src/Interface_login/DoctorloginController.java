/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Interface_login;

import Database.myDB;
import Entity.*;
import hashing.HashFunction;
import java.io.IOException;
import java.net.URL;
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

/**
 * FXML Controller class
 *
 * @author E N G Y
 */
public class DoctorloginController implements Initializable {
   @FXML
    private TextField doc_name_txtField;

    @FXML
    private Button back;

    @FXML
    private PasswordField doc_pass_txtField;

    @FXML
    private Button login_btn;

    @FXML
    private Button signup;

  
    @FXML
    private void back_1(ActionEvent event) {

        try {
            Parent pop = FXMLLoader.load(getClass().getResource("/Interface/main.fxml"));
            Scene se = new Scene(pop);
            Stage stageS = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageS.setTitle("IUG Hospital");
            stageS.setScene(se);
        } catch (IOException ex) {
        }

    }
  @FXML
    private void login(ActionEvent event) throws Exception {
        System.out.println("Login Button Pressed");
        String name = doc_name_txtField.getText().trim();
        String password = doc_pass_txtField.getText().trim();
        String hashedPassword = HashFunction.getHash(password.getBytes());
        Doctors doc = new Doctors();
        doc.setName(name);
        doc.setPassword(hashedPassword);
        System.out.println(hashedPassword);
        if (!name.equals("") || !password.equals("")) {
            ResultSet docRow = myDB.getDoc(doc);
//            Prog3_final_project.docLoginID = docRow.getInt("id");
            boolean isExist = false;
            try {
                while (docRow.next()) {
                    isExist = true;
                }
                if (isExist) {
                    System.out.println("Login doctor Successfully");
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("/Interface_doctor/doctor_main_active.fxml"));
                    try {
                        loader.load();

                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                    Parent root = loader.getRoot();
                    //Stage stage = new Stage();
                    primaryStage.setTitle("doctor page");
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

}
