package ProjectDingen.GameClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class RecieveBasic{

    public static String recieve (Socket socket) {
    try{
        BufferedReader incoming = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String response = "";

        while ((response = incoming.readLine()) != null) {

            Thread.sleep(8);

            if (!(incoming.ready())) {
                break;
            }
        }
        return response;
    }
    catch (IOException | InterruptedException ex) {
        return ex.getMessage();
    }}
}
