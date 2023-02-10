/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog3_final_project;

import Database.myDB;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Shams
 */
public class Prog3_final_project extends Application {
    public static Stage primaryStage = new Stage();
    public static int docLoginID = 0;
    public static int pharmLoginID = 0;
     @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/Interface/main.fxml"));
        
        Scene scene = new Scene(root);
        primaryStage.setTitle("IUG Hospital");
        primaryStage.setScene(scene);
  //      scene.getStylesheets;
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
