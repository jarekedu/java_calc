package com.example.lab11_javafx_kalkulator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class KalkulatorApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(KalkulatorApplication.class.getResource("kalkulator-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 550);
        stage.setTitle("Kalkulator v0.1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Start");
        launch();
    }
}