package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Boxes extends Application {

    Stage window;
    Scene scene1;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;

        Label label1 = new Label("The first scene");
        Button but = new Button("go to scene two");
//        but.setOnAction();

        // Layouts
        VBox lay1 = new VBox(15);
        lay1.getChildren().addAll(label1, but);
        scene1 = new Scene(lay1, 300,300);


        window.setScene(scene1);
        window.setTitle("Welcome to Multiscene");
        window.show();



    }

    public static void main(String[] args) {
        launch(args);
    }
}

class AlertBox {
    public static void display(String title, String message) {

        Stage window = new Stage();

    }
        }