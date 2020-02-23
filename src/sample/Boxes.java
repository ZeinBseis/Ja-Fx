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
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Boxes extends Application {

    Stage window;
    Scene scene1;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;

        Label label1 = new Label("The first scene");
        Button but = new Button("go to scene two");
        but.setOnAction(e -> AlertBox.display("moving", "hi Dude"));
        Button but2 = new Button("nasty stuff");
        but2.setOnAction(e -> { boolean result = ConfirmBox.display("Title here", "are you sure you want to pee?");
        System.out.println(result);
        });
        // Layouts
        VBox lay1 = new VBox(15);
        lay1.getChildren().addAll(label1, but, but2);
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
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinHeight(300);
        window.setMinWidth(300);

        Label label = new Label(message);
        Button CloseButton = new Button("close this window");
        CloseButton.setOnAction(e -> window.close());

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(label,CloseButton);
        stackPane.setAlignment(label, Pos.TOP_CENTER);
        stackPane.setAlignment(CloseButton,Pos.BOTTOM_CENTER);

        Scene scene = new Scene(stackPane);
        window.setScene(scene);
        window.showAndWait();

    }
        }