
package assignment2;

import static assignment2.Assignment2.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.JOptionPane;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


/**
 * FXML Controller class
 *
 * @author Elham Elshami
 */
public class AddController implements Initializable {
    @FXML
    private Button AddBtn;
    @FXML
    private Button BackBtn;
    @FXML
    private ChoiceBox<String> CityBox;
    @FXML
    private TableColumn<User, String> CityColumn, NameColumn, GenColumn, IDColumn;
    @FXML
    private TableColumn<User, Double> GPAColumn;
    @FXML
    private RadioButton FemaleBtn;
    @FXML
    private RadioButton maleBtn;
    @FXML
    private TextField GPAField;
    @FXML
    private TextField IDField;
    @FXML
    private TextField NameField;
    @FXML
    private ToggleGroup genderGroup; 

    @FXML
    void AddButtonAction(ActionEvent event) {
        String id = IDField.getText();
        String name = NameField.getText();
        String city = CityBox.getValue();
        String gender = "";
        if (FemaleBtn.isSelected()) {
            gender = "Female";
        } else {gender = "Male";}
        double gpa = Double.parseDouble(GPAField.getText() + "0");
        if (checkUser()) {
            User userObject = new User(id, name, gender, city, gpa);
            users.add(userObject);
            load();
        } else {
            JOptionPane.showMessageDialog(null, "Feilds requirmnt", "there's input empty", JOptionPane.ERROR_MESSAGE);
        }

    }

    @FXML
    void BackButtonAction(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLDocument.fxml"));
        try {
            loader.load();
        } catch (IOException ex) {
            System.err.println(ex);
        }
        Parent parent = loader.getRoot();
        Assignment2.homePage.setScene(new Scene(parent));
        Assignment2.homePage.setTitle("admin panel");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        CityBox.getItems().addAll(citiesList);
        load();
    }

    public void load() {
        CityColumn.setCellValueFactory(new PropertyValueFactory<>("city"));
        NameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        GenColumn.setCellValueFactory(new PropertyValueFactory<>("gnd"));
        IDColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        GPAColumn.setCellValueFactory(new PropertyValueFactory<>("gpa"));
        table.setItems(users);

    }
    public boolean checkUser() {
        if ((!NameField.getText().isEmpty()) && (!IDField.getText().isEmpty()) && (!GPAField.getText().isEmpty())
                && (!CityBox.getValue().isEmpty()) && ((FemaleBtn.isSelected()) || (maleBtn.isSelected()))) {
            return true;
        }else{
            return false;
        }
    }

}
