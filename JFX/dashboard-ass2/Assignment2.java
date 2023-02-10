package assignment2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Elham Elshami
 */
public class Assignment2 extends Application {

    static Stage homeScreen = new Stage();
    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(parent);
        homeScreen.setScene(scene);
        homeScreen.setTitle("Admin Panel");
        homeScreen.show();
    }
    /**
     * @param args the command line arguments
     */
    static ObservableList<String> NameCitiesList = FXCollections.observableArrayList();
    static ObservableList<User> NameUsersList = FXCollections.observableArrayList();

    public static void main(String[] args) {

        userList.addAll(new User("1", "shams", "Gaza", "Female", 88.9),
                new User("2", "Ahmed", "Gaza", "male", 99.8),
                new User("3", "Ali", "rafah", "male", 89.0),
                new User("4", "nour", "Gaza", "Female", 82.1),
                new User("5", "rama", "bethlehem", "Female", 81.0)
        );

        citiesList.add("Gaza");
        citiesList.add("rafah");
        citiesList.add("bethlehem");
        citiesList.add("Hebron");
        citiesList.add("Khanyouns");
        launch(args);
    }

}
