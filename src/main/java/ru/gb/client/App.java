package ru.gb.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static Stage primaryStage;
    public static Stage stage1, stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/scene.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root, 800, 600));
        stage.setTitle("April_Chat");
        stage1 = stage;
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
