/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Interface_pharmacist;

import Database.myDB;
import Entity.Medicine;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import prog3_final_project.Prog3_final_project;


public class Pharmacist_active_viewController implements Initializable {

    @FXML
    private TableColumn<Medicine, Integer> quantity_col;

    @FXML
    private TableColumn<Medicine, Integer> id_col;

    @FXML
    private Button view_drug_btn;

    @FXML
    private Button backBtn;
   @FXML
    private TableView<Medicine> drug_tableview;
    @FXML
    private TableColumn<Medicine, Double> dose_col;

    @FXML
    private TableColumn<Medicine, String> name_col;
    @FXML
    void back(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("pharmacist_active.fxml"));
        try {
            loader.load();

        } catch (IOException ex) {
            System.out.println(ex);
        }
        Parent root = loader.getRoot();
        Prog3_final_project.primaryStage.setScene(new Scene(root));

    }

  

    @FXML
    private void viewDrug(ActionEvent event) {
         load();
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
         load();
    }
    //       load data from db 
    public void load() {
        id_col.setCellValueFactory(new PropertyValueFactory<Medicine, Integer>("id"));
        name_col.setCellValueFactory(new PropertyValueFactory<Medicine, String>("name"));
        quantity_col.setCellValueFactory(new PropertyValueFactory<Medicine, Integer>("quantity"));
        dose_col.setCellValueFactory(new PropertyValueFactory<Medicine, Double>("dose"));
        drug_tableview.setItems(myDB.getAllDrugs());

    }
}
