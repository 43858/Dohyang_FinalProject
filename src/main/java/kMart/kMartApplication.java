package kMart;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import photoAlbum.photoAlbumApplication;

import java.io.IOException;

public class kMartApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(kMartApplication.class.getResource("kMart-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        primaryStage.setTitle("kMart");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
