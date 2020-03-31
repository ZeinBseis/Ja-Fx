package ProjectDingen.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RunCommand {
    public static void main (String [] args) {
        try(Socket socket = new Socket("localhost", 7789)) {
            BufferedReader incoming = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter outgoing = new PrintWriter(socket.getOutputStream(),true);
            StringBuilder sb = new StringBuilder();

            Scanner scanner = new Scanner(System.in);
            String send = "";
            String response = "";
            response = incoming.readLine();
            System.out.println(response);
            response = incoming.readLine();
            System.out.println(response);
            while (!send.equals("logout")){
                System.out.println("Enter Command: ");
                send = scanner.nextLine();
                outgoing.println(send);

                while ((response = incoming.readLine()) != null) {
                    System.out.println(response);
                    sb.append(response);
                    sb.append('\n');
                    if (!(incoming.ready())) {break;}

                }
            }
        } catch (IOException e) {
            System.out.println("Client Error: "+ e.getMessage());
        }
    }
}