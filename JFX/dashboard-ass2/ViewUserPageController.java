/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import static assignment2.Assignment2.*;
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
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Elham Elshami
 */
public class ViewUserPageController implements Initializable {

    @FXML
    private Button deleteBtn;
    @FXML
    private Button backBtn;
    @FXML
    private TableView<User> usersTableView;
    @FXML
    private TableColumn<User, String> idcol;
    @FXML
    private TableColumn<User, String> nameCol;
    @FXML
    private TableColumn<User, String> cityCol;
    @FXML
    private TableColumn<User, Double> gpaCol;
    @FXML
    private TableColumn<User, String> gndCol;

    @FXML
    void Back(ActionEvent event) {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLDocument.fxml"));
        try {
            loader.load();

        } catch (IOException ex) {
            System.err.println(ex);
        }
        Parent root = loader.getRoot();

        Assignment2.homePage.setScene(new Scene(root));
        Assignment2.homePage.setTitle("admin panel");
    }
    
    @FXML
    void Delete(ActionEvent event) {
        usersTableView.getItems().removeAll(usersTableView.getSelectionModel().getSelectedItems());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        usersTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);//just ^_^
         load();
       
    }    
     public void load() {
        idcol.setCellValueFactory(new PropertyValueFactory<User, String>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<User, String>("name"));
        cityCol.setCellValueFactory(new PropertyValueFactory<User, String>("city"));
        gndCol.setCellValueFactory(new PropertyValueFactory<User, String>("gender"));
        gpaCol.setCellValueFactory(new PropertyValueFactory<User, Double>("gpa"));
        usersTableView.setItems(userList);
// هون فيه مشكلة في تحميل البيانات 
    }
}
