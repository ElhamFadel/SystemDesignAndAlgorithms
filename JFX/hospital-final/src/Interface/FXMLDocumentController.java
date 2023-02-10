/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package Interface;

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
import javafx.scene.control.Label;
import javafx.stage.Stage;
import static prog3_final_project.Prog3_final_project.primaryStage;

/**
 *
 * @author E N G Y
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button pha_id;

    @FXML
    private Button doc_id;

    @FXML
    void doctorlogin(ActionEvent event) {
        System.out.println("Doctor login button is pressed");
//         doc_id.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/Interface_login/doctorlogin.fxml"));
            try {
                loader.load();

            } catch (IOException ex) {
                System.out.println(ex);
            }
            Parent root = loader.getRoot();
            //Stage stage = new Stage();
            primaryStage.setTitle("doc");
            primaryStage.setScene(new Scene(root));


    }

    @FXML
    void pharmacistlogin(ActionEvent event) {
            System.out.println("pharmacy login button is pressed");
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/Interface_login/pharmacistlogin.fxml"));
            try {
                loader.load();
            } catch (IOException ex) {
                System.out.println(ex);
            }
            Parent root = loader.getRoot();
            Scene scene = new Scene(root);
            primaryStage.setTitle("pha");
            primaryStage.setScene(scene);
//            primaryStage.showAndWait();
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
