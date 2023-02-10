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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import prog3_final_project.Prog3_final_project;

/**
 * FXML Controller class
 *
 * @author Shams
 */
public class Doctor_deletePatientController implements Initializable {
   @FXML
    private TableColumn<?, ?> ageCol;

    @FXML
    private TableView<?> patient_tableview;

    @FXML
    private TableColumn<?, ?> docidCol;

    @FXML
    private TableColumn<?, ?> idCol;

    @FXML
    private TableColumn<?, ?> genCol;

    @FXML
    private TableColumn<?, ?> imageCol;

    @FXML
    private TableColumn<?, ?> nameCol;

    @FXML
    private Button backbtn;

    @FXML
    private TableColumn<?, ?> entraceCol;

    @FXML
    private TableColumn<?, ?> problemCol;

    @FXML
    private Button add_patient_btn;

    @FXML
    void deletePatient(ActionEvent event) {

    }

    @FXML
    void back(ActionEvent event) {
             FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("doctor_main_active.fxml"));
        try {
            loader.load();

        } catch (IOException ex) {
            System.out.println(ex);
        }
        Parent root = loader.getRoot();
        Prog3_final_project.primaryStage.setScene(new Scene(root));
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
