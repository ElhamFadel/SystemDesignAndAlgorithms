package assignment2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;


/**
 *
 * @author Elham Elshami
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnLogo;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnViwe;
    //add new user screen
    @FXML
    void addUserScreenAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("addUserScreen.fxml"));
        try {
            loader.load();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
        Parent parent = loader.getRoot();
        Assignment2.homePage.setScene(new Scene(parent));
        Assignment2.homePage.setTitle("Add User");
    }
    //view user screen
    @FXML
    void viewUserScreenAction(ActionEvent event) {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("viewUserScreen.fxml"));
        try {
            loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Parent parent = loader.getRoot();
        Assignment2.homePage.setScene(new Scene(parent));
        Assignment2.homePage.setTitle("View User");
    }
    //update user screen
    @FXML
    void updateUserScreenAction(ActionEvent event) {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("updateUserPage.fxml"));
        try {
          loader.load();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
        Parent parent = loader.getRoot();
        Assignment2.homePage.setScene(new Scene(parent));
        Assignment2.homePage.setTitle("Update User");
    }
    //delete user screen
    @FXML
    void deleteUserScreenAction(ActionEvent event) {
          FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("viewUserScreen.fxml"));
        try {
            loader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Parent parent = loader.getRoot();
        Assignment2.homePage.setScene(new Scene(parent));
        Assignment2.homePage.setTitle("Delete User");
    }
    
    @FXML
    void logoutControll() {
        btnLogo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Assignment2.homePage.close();
            }
        });
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        logoutControll();
    }
}
