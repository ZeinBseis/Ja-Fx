package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BasicWindow extends Application {
    Button button;
    Button lamdaBut;
    Clicker clicker = new Clicker();

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        primaryStage.show();
        button = new Button();
        button.setText("Click me");
        button.setOnAction(clicker);
        lamdaBut = new Button();
        lamdaBut.setText("lamda Button");
        lamdaBut.setOnAction(e -> System.out.println("this is a lambda button"));
//        StackPane layout = new StackPane();
//        layout.getChildren().add(button);
//        layout.getChildren().add(lamdaBut);
        VBox layout = new VBox();
        layout.getChildren().addAll(button,lamdaBut);
        primaryStage.setScene(new Scene(layout, 300, 275));
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(10);



    }

       public static void main(String[] args) {
        launch(args);
    }
}

class Clicker implements EventHandler<ActionEvent> {


    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("button was clicked");


    }
}
