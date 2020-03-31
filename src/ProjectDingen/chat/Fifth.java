package ProjectDingen.chat;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;


public class Fifth extends Application {

    // IO streams
    DataOutputStream toServer = null;
    DataInputStream fromServer = null;
    //Buttons
    Button login, logout, getRandomChallengerReversi, getRandomChallengerTicTac, forfit, showPlayers;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Multiplayer");
        primaryStage.show();

        login = new Button("Login");
        logout = new Button("Logout");
        getRandomChallengerReversi = new Button("Random Challenger Reversi");
        getRandomChallengerTicTac = new Button("Random Challenger TicTacToe");
        forfit = new Button("forfit match");
        showPlayers = new Button("Show players");
        login.setId("login Zein");
        logout.setId("login");
        getRandomChallengerTicTac.setId("subscribe TicTactoe");
        getRandomChallengerReversi.setId("subscribe Reversi");
        forfit.setId("forfit");
        showPlayers.setId("get playerlist");



        VBox layout = new VBox();
        layout.getChildren().addAll(login,logout,getRandomChallengerReversi,getRandomChallengerTicTac,showPlayers);
        primaryStage.setScene(new Scene(layout, 500, 450));
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(10);

        try (Socket socket = new Socket("localhost", 7789)) {
//            BufferedReader toServer = new BufferedReader(
//                    new InputStreamReader(socket.getInputStream()));
//            PrintWriter stringToCommand = new PrintWriter(socket.getOutputStream(), true);

            fromServer = new DataInputStream(socket.getInputStream());
            toServer = new DataOutputStream(socket.getOutputStream());
        } catch (IOException ex) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Alert");
            alert.setHeaderText("Error");
            alert.setContentText(ex.getMessage());
            alert.showAndWait().ifPresent(rs -> {
                if (rs == ButtonType.OK) {
                    System.out.println("Pressed OK.");
                }
            });







        }
    }
}