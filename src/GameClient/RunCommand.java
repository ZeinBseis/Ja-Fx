package GameClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


import java.util.concurrent.TimeUnit;

public class RunCommand {


    public static String runThis(String command, String argument, Socket socket) {


        try{
            BufferedReader incoming = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter outgoing = new PrintWriter(socket.getOutputStream(), true);

            String send = command + " " + argument;
            String response = "";

            outgoing.println(send);

            while ((response = incoming.readLine()) != null) {

                Thread.sleep(16);

                if (!(incoming.ready())) {
                    break;
                }

            }

            return response;

        } catch (IOException | InterruptedException ex) {
            String result = ex.getMessage();
            return result;
        }


    }
}
