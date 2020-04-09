package GameClient2;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import GameClient.SendToServer;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultiPlayerGUI extends Application {

    Connection connection = new Connection("localhost",7789);
    Sender sender = new Sender(connection.getSocket());
    Receiver receiver = new Receiver(connection.getSocket());
    static Stage window;
    static Scene mainWindow, challenger, lobby, login;

    VBox mainLayout = new VBox(15);
    VBox loginLayout = new VBox(15);
    VBox challengerLayout = new VBox(15);
    VBox lobbyLayout = new VBox(15);

    public MultiPlayerGUI() throws IOException {
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        stage.setTitle("Multiplayer");

        receiver.start();


        mainLayout.setAlignment(Pos.CENTER);
        loginLayout.setAlignment(Pos.CENTER);
        challengerLayout.setAlignment(Pos.CENTER);
        lobbyLayout.setAlignment(Pos.CENTER);



        mainWindow = new Scene(mainLayout,400,600);
        login = new Scene(loginLayout,150,150);
        challenger = new Scene(challengerLayout,200,300);
        lobby = new Scene(lobbyLayout,200,300);




        Label mainWindowLabel = new Label("Select an option");
        Button loginButton = new Button("Login");
        Button showLobby = new Button("Show lobby");

        mainLayout.getChildren().addAll(mainWindowLabel, loginButton, showLobby);

        TextField textField = new TextField();
        Button click_to_login = new Button("Click to login");
        loginLayout.getChildren().addAll(textField, click_to_login);


        loginButton.setOnAction(e -> {
            stage.setScene(login);

            click_to_login.setOnAction(action -> {
                sender.login(textField.getText());
                stage.setScene(mainWindow);
            });

        });

        showLobby.setOnAction(e->{
            sender.getPlayerlist();
            try {
                Thread.sleep(16);
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
            System.out.println("This here");
//            if(Handler.playerlist != null) {
//                ArrayList<Button> buttons = new ArrayList<>();
//                for (int i=0; i<Handler.playerlist.length; i++) {
//                    Button button = new Button("Challenge "+Handler.playerlist[i]);
//                    //button.setOnAction(sender.challenge(Handler.playerlist[i],"Reversi"))
//                    buttons.add(button);
//                    lobbyLayout.getChildren().add(button);
//                }
//                window.setScene(lobby);
//            }

        });

        window.setScene(mainWindow);
        window.show();
    }

    public static void showChallenge(Map<String, String> challenger) {

    }

    public static void showLobby (String[] playersList) {
        window.setScene(lobby);
//        Button button = new Button ("Send challenge");




    }
}
