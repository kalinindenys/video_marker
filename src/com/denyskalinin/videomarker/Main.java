package com.denyskalinin.videomarker;

import com.denyskalinin.videomarker.controller.MainWindowController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static Stage mainStage;

    @Override

    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("view/MainWindow.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setTitle("Video Marker");
        primaryStage.setScene(scene);
        primaryStage.show();
        MainWindowController controller = loader.getController();
        controller.sayHello();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
