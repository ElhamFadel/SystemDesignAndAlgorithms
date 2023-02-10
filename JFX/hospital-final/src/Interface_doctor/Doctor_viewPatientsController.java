/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_doctor;

import Database.myDB;
import Entity.*;
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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import prog3_final_project.Prog3_final_project;

/**
 * FXML Controller class
 *
 * @author Shams
 */
public class Doctor_viewPatientsController implements Initializable {

    @FXML
    private TableColumn<Patient, Integer> ageCol;

    @FXML
    private TableColumn<Patient, Integer> idCol;

    @FXML
    private Button viewPbtn;

    @FXML
    private TableColumn<Patient,String> genCol;

    @FXML
    private TableColumn<Patient,String> imageCol;

    @FXML
    private TableColumn<Patient,String> nameCol;
    @FXML
    private TableView<Patient> patients_tableview;
    @FXML
    private Button backbtn;

    @FXML
    private TextField searchTextField;

    @FXML
    private TableColumn<Patient,String> problemCol;

    @FXML
    private TableColumn<Patient,String> entranceCol;

    @FXML
    void viewPatients(ActionEvent event) {
        load();
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
     //       load data from db 
    public void load() {
        idCol.setCellValueFactory(new PropertyValueFactory<Patient, Integer>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<Patient, String>("name"));
        ageCol.setCellValueFactory(new PropertyValueFactory<Patient, Integer>("age"));
        genCol.setCellValueFactory(new PropertyValueFactory<Patient, String>("gender"));
        problemCol.setCellValueFactory(new PropertyValueFactory<Patient,String>("problem"));
        imageCol.setCellValueFactory(new PropertyValueFactory<Patient,String>("image"));
        entranceCol.setCellValueFactory(new PropertyValueFactory<Patient,String>("entranceDate"));

       patients_tableview .setItems(myDB.getAllPatients());

    }
}
