/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_doctor;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import prog3_final_project.Prog3_final_project;

/**
 * FXML Controller class
 *
 * @author Shams
 */
public class Doctor_main_activeController implements Initializable {

    
    @FXML
    private Button upPbtn;

    @FXML
    private Button viewPbtn;

    @FXML
    private Button addPbtn;

    @FXML
    private Button delpPbtn;

    @FXML
    private Button viewInfobtn;



    @FXML
    void addPatient(ActionEvent event) {
   try {
            Parent pop = FXMLLoader.load(getClass().getResource("/Interface_doctor/doctor__addPatient.fxml"));
            Scene se = new Scene(pop);
            Stage stageS = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageS.setTitle("add patient ");
            stageS.setScene(se);
        } catch (IOException ex) {
        } 

    }

    @FXML
    void deletePatient(ActionEvent event) {
   try {
            Parent pop = FXMLLoader.load(getClass().getResource("/Interface_doctor/doctor_deletePatient.fxml"));
            Scene se = new Scene(pop);
            Stage stageS = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageS.setTitle("delete patient information");
            stageS.setScene(se);
        } catch (IOException ex) {
        } 

    }

    @FXML
    void updatePatient(ActionEvent event) {
           try {
            Parent pop = FXMLLoader.load(getClass().getResource("/Interface_doctor/doctor_updatePatient.fxml"));
            Scene se = new Scene(pop);
            Stage stageS = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageS.setTitle("update patient information");
            stageS.setScene(se);
        } catch (IOException ex) {
        } 

    }

    @FXML
    void viewPatients(ActionEvent event) {
            try {
            Parent pop = FXMLLoader.load(getClass().getResource("/Interface_doctor/doctor_viewPatients.fxml"));
            Scene se = new Scene(pop);
            Stage stageS = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageS.setTitle("view All patients ");
            stageS.setScene(se);
        } catch (IOException ex) {
        } 

    }

    @FXML
    void viewInfo(ActionEvent event) {
         try {
            Parent pop = FXMLLoader.load(getClass().getResource("/Interface_doctor/doctor_viewInformation.fxml"));
            Scene se = new Scene(pop);
            Stage stageS = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageS.setTitle("view patient information");
            stageS.setScene(se);
        } catch (IOException ex) {
        } 

    }
    @FXML
    private Button logoutbtn;
 
  @FXML
    void logout() {
         logoutbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               Prog3_final_project.primaryStage.close();
            }
        }); 
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
               logout();

    }    
    
}
