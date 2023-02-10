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
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import prog3_final_project.Prog3_final_project;

/**
 * FXML Controller class
 *
 * @author E N G Y
 */
public class Pharmacist_active_deleteController implements Initializable {

    @FXML
    private Button back_bth;

    @FXML
    private TableColumn<Medicine, String> name_col;

    @FXML
    private TableColumn<Medicine, Integer> quantity_col;

    @FXML
    private TableColumn<Medicine, Integer> id_col;

    @FXML
    private Button del_drug_btn;

    @FXML
    private TableColumn<Medicine, Double> dose_col;

    @FXML
    private TableView<Medicine> drug_tableview;

    int index = -1;

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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        select one or multiple mediceine
        drug_tableview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        load();
    }
    int idDrug = 0;

    @FXML
    private void deleteDrug(ActionEvent event) {
        System.out.println("Delete Button Pressed and index = " + index);
        if (index != -1) {
            myDB.deleteDrugRow(idDrug);
            load();
        }

    }

    @FXML
    void getSelected(javafx.scene.input.MouseEvent event) {
        index = drug_tableview.getSelectionModel().getSelectedIndex();
        idDrug = id_col.getCellData(index);

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
