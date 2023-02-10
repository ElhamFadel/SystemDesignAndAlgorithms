/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import static assignment2.Assignment2.*;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Elham Elshami
 */
public class UpdateUserPageController implements Initializable {

    int index = -1;
    @FXML
    private TextField idTextField;

    @FXML
    private Button updatebtn;

    @FXML
    private TableColumn<User, String> cityCol;

    @FXML
    private TextField gpaTextField;

    @FXML
    private TextField nameTextField;

    @FXML
    private ToggleGroup genderToggle;

    @FXML
    private RadioButton maleRadioBtn;

    @FXML
    private TableColumn<User, Double> gpaCol;

    @FXML
    private TableColumn<User, String> idCol;

    @FXML
    private TableColumn<User, String> genCol;

    @FXML
    private TableColumn<User, String> nameCol;

    @FXML
    private Button backBtn;

    @FXML
    private TableView<User> usersTableView;

    @FXML
    private ChoiceBox<String> cityChoiceBox;

    @FXML
    private RadioButton femaleRadioBtn;

    @FXML
    void update(ActionEvent event) {
    
     if (index != -1 ) {
            String id = idTextField.getText();
            String name = nameTextField.getText();
            double gpa = Double.parseDouble(gpaTextField.getText());
            String gender = "";
        if (maleRadioBtn.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
            String city = cityChoiceBox.getSelectionModel().getSelectedItem() ; 
            userList.get(index).setCity(city);
            userList.get(index).setId(id);
            userList.get(index).setName(name);
            userList.get(index).setGpa(gpa);
            userList.get(index).setGender(gender);
            usersTableView.refresh();
     }
        
    
    }

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
    void getSelectRow(MouseEvent event) {
        index = usersTableView.getSelectionModel().getSelectedIndex();
        if (index != -1) {
            User s = userList.get(index);
            idTextField.setText(s.getId() + "");
            nameTextField.setText(s.getName());
            gpaTextField.setText(s.getGpa() + "");
            cityChoiceBox.getSelectionModel().select(s.getCity());
            String gender = genCol.getCellData(index);
            if (gender.equals("male")) {
                maleRadioBtn.setSelected(true);
            } else {
                femaleRadioBtn.setSelected(true);
            }

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        load();
        citiesList.add("Gaza");
        citiesList.add("rafah");
        citiesList.add("bethlehem");
        citiesList.add("Hebron");
        citiesList.add("Khanyouns");
        cityChoiceBox.getItems().addAll(citiesList);
    }

    public void load() {
        idCol.setCellValueFactory(new PropertyValueFactory<User, String>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<User, String>("name"));
        cityCol.setCellValueFactory(new PropertyValueFactory<User, String>("city"));
        genCol.setCellValueFactory(new PropertyValueFactory<User, String>("gender"));
        gpaCol.setCellValueFactory(new PropertyValueFactory<User, Double>("gpa"));
        usersTableView.setItems(userList);

    }

}
