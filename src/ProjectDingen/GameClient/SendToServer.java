package ProjectDingen.GameClient;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SendToServer {
    public static void sendThis (String command, String argument, Socket socket) {
        try{
            PrintWriter outgoing = new PrintWriter(socket.getOutputStream(), true);

            String send = command + " " + argument;

            outgoing.println(send);
        }
        catch (IOException ex ) {System.err.println(ex.getMessage());}
    }
}
