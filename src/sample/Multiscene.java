package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Multiscene extends Application {

    Stage window;
    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;

        Label label1 = new Label("The first scene");
        Button but = new Button("go to scene two");
        but.setOnAction(e -> window.setScene(scene2));

        // Layouts
        VBox lay1 = new VBox(15);
        lay1.setAlignment(Pos.CENTER);
        lay1.getChildren().addAll(label1, but);
        scene1 = new Scene(lay1, 200,300);

        Label label2 = new Label("The second scene");
        Button but2 = new Button("Go to scene one");
        but2.setOnAction(e -> window.setScene(scene1));

        // another layout
        VBox lay2 = new VBox(30);
        lay2.getChildren().addAll(label2,but2);
        scene2 = new Scene(lay2, 300,200);


        window.setScene(scene2);
        window.setTitle("Welcome to Multiscene");
        window.show();



    }

    public static void main(String[] args) {
        launch(args);
    }
}

