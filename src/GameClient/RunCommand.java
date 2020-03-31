package GameClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import java.util.concurrent.TimeUnit;

public class RunCommand {


    public String runThis(String command, String argument, Socket socket) {

        int begin = 0;

        try{
            BufferedReader incoming = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter outgoing = new PrintWriter(socket.getOutputStream(), true);

            String send = command + " " + argument;
            String response = "";
            String fullResponse = "";

            if (begin == 0) {
                response = incoming.readLine();
                System.out.println(response);
                response = incoming.readLine();
                System.out.println(response);
            }
            outgoing.println(send);

            while ((response = incoming.readLine()) != null) {
//                System.out.println(response);
                fullResponse = fullResponse.concat(response + "\n");

                if (!(incoming.ready())) {
                    break;
                }

            }

            return fullResponse;

        } catch (IOException ex) {
            String result = ex.getMessage();
            return result;
        }
    }
}
