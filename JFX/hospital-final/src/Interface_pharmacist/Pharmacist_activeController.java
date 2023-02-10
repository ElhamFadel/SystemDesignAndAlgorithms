/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Interface_pharmacist;

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


public class Pharmacist_activeController implements Initializable {

    @FXML
    private Button view_drug_btn;

    @FXML
    private Button delete_drug_btn;

    @FXML
    private Button logout_btn;

    @FXML
    private Button add_drug_btn;

    @FXML
    void logout() {
         logout_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               Prog3_final_project.primaryStage.close();
            }
        }); 
    }

    @FXML
    private void addDrug(ActionEvent event) {

        try {
            Parent pop = FXMLLoader.load(getClass().getResource("/Interface_pharmacist/pharmacist_active_add.fxml"));
            Scene se = new Scene(pop);
            Stage stageS = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageS.setTitle("Add Drug");
            stageS.setScene(se);
        } catch (IOException ex) {
        } 
    }

    @FXML
    private void viewDrug(ActionEvent event) {

        try {
            Parent pop = FXMLLoader.load(getClass().getResource("/Interface_pharmacist/pharmacist_active_view.fxml"));
            Scene se = new Scene(pop);
            Stage stageS = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageS.setTitle("View Drug");
            stageS.setScene(se);
        } catch (IOException ex) {
        }
    }

    @FXML
    private void deleteDrug(ActionEvent event) {

        try {
            Parent pop = FXMLLoader.load(getClass().getResource("/Interface_pharmacist/pharmacist_active_delete.fxml"));
            Scene se = new Scene(pop);
            Stage stageS = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageS.setTitle("Delete Drug");
            stageS.setScene(se);
        } catch (IOException ex) {
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       logout();
    }
}
