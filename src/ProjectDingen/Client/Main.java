package ProjectDingen.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main (String [] args) {
        try(Socket socket = new Socket("localhost", 7789)) {
            BufferedReader incoming = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter outgoing = new PrintWriter(socket.getOutputStream(),true);

            Scanner scanner = new Scanner(System.in);
            String send;
            String response;

            do {
                System.out.println("Enter Command: ");
                send = scanner.nextLine();
                outgoing.println(send);
                if(!send.equals("logout")) {
                    response = incoming.readLine();
//                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(response);
                }

            } while (!send.equals("logout"));

        } catch (IOException e) {
            System.out.println("Client Error: "+ e.getMessage());
        }
    }

}



