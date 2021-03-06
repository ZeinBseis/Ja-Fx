package ProjectDingen.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ToServer {
    PrintWriter toServer;
    BufferedReader userInput;

    public ToServer(Socket socket) throws IOException {
        toServer = new PrintWriter(socket.getOutputStream(), true);
        userInput = new BufferedReader(new InputStreamReader(System.in));
    }

    public void setLogin(String username) {
        toServer.println("login " + username);
    }

    public void setLogout() {
        toServer.println("logout");
    }

    public void setGameMode(String mode) {
        toServer.println("subscribe " + mode);
    }

    public void setMove(int move) {
        toServer.println("move " + move);
    }

    public void subscribeGame(String game) {
        toServer.println("subscribe " + game);
    }

    public void setForfeit() {
        toServer.println("forfeit");
    }

    public void setChallenge(String username, String gameType) {
        toServer.println("challenge " + "\"" + username + "\"" + " " + "\"" + gameType + "\"");
    }

    public void setChallengeAccept(int challengeNumber) {
        toServer.println("challenge accept " + challengeNumber);
    }

    public void getHelp() {
        toServer.println("help");
    }

    public void getGameList() {
        toServer.println("get gamelist");
    }

    public void getPlayerList() {
        toServer.println("get playerlist");
    }
}