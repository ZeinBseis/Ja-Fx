package ProjectDingen.GameClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class RecieveChallenge {
    public static String recieve (Socket socket) {
        try {
            BufferedReader incoming = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response = "";

            int timer = 0;

            while (!(response = incoming.readLine()).contains("SVR GAME MATCH")) {

                Thread.sleep(8);
                timer+=8;
                if (timer > 8000) {
                    return "Challenge not Accepted";
                }

                //TODO Send to board
            }

            response = incoming.readLine();
            return response;
        }
        catch (IOException | InterruptedException ex) {
            return ex.getMessage();
        }

    }

}
