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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import prog3_final_project.Prog3_final_project;

/**
 * FXML Controller class
 *
 * @author Shams
 */
public class Doctor_viewInformationController implements Initializable {

  @FXML
    private Button view_Infobtn;

    @FXML
    private Button make_prebtn;

    @FXML
    private Button pre_historybtn;

    @FXML
    private Button backbtn;

    @FXML
    private ImageView patient_image;

    @FXML
    private ComboBox<?> selectP_combobox;

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
    void viewInfo(ActionEvent event) {

    }

    @FXML
    void preHistory(ActionEvent event) {
           try {
            Parent pop = FXMLLoader.load(getClass().getResource("/Interface_doctor/show_preciptions.fxml"));
            Scene se = new Scene(pop);
            Stage stageS = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageS.setTitle("add patient ");
            stageS.setScene(se);
        } catch (IOException ex) {
        } 

    }

    @FXML
    void makePreciption(ActionEvent event) {
   try {
            Parent pop = FXMLLoader.load(getClass().getResource("/Interface_doctor/make_preciption.fxml"));
            Scene se = new Scene(pop);
            Stage stageS = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageS.setTitle("add patient ");
            stageS.setScene(se);
        } catch (IOException ex) {
        } 

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   
    
}
