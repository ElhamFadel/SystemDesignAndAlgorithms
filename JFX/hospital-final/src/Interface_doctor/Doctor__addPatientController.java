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
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import prog3_final_project.Prog3_final_project;

/**
 * FXML Controller class
 *
 * @author Shams
 */
public class Doctor__addPatientController implements Initializable {

    @FXML
    private TextField name_textFeild;

    @FXML
    private Button add_image_btn;

    @FXML
    private RadioButton female_radio_btn;

    @FXML
    private ToggleGroup gender_toggle_group;

    @FXML
    private DatePicker entrance_date_datepick;

    @FXML
    private RadioButton male_radio_btn;

    @FXML
    private Button backbtn;

    @FXML
    private TextField problem_textFeild;

    @FXML
    private Button add_patientbtn;

    @FXML
    private TextField age_textfeild;

    @FXML
    void addPatient(ActionEvent event) {

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

    @FXML
    void addImage(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
