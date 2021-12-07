package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("loginWindow.fxml"));
        primaryStage.setTitle("Priyalal Store");
        primaryStage.setScene(new Scene(root, 900, 550));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void addToArray(Category category) {

    }
}