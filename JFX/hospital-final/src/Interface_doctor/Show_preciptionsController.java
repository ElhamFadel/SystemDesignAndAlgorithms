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
public class Show_preciptionsController implements Initializable {

    @FXML
    private TableView<?> prescriptionTableView;
    @FXML
    private TableColumn<?, ?> pat_idCol;
    @FXML
    private TableColumn<?, ?> medicine_idCol;
    @FXML
    private TableColumn<?, ?> Doc_idCol;
    @FXML
    private TableColumn<?, ?> pubDateCol;
    @FXML
    private Button back_viewInfobtn;
    @FXML
    private Button showHistorybtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backToInfo(ActionEvent event) {
           FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("doctor_viewInformation.fxml"));
        try {
            loader.load();

        } catch (IOException ex) {
            System.out.println(ex);
        }
        Parent root = loader.getRoot();
        Prog3_final_project.primaryStage.setScene(new Scene(root));
    }

    @FXML
    private void showHistory(ActionEvent event) {
    }
    
}
