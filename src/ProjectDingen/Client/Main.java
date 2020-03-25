package ProjectDingen.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        try(Socket socket = new Socket("localhost", 7789)) {
            BufferedReader command = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter stringToCommand = new PrintWriter(socket.getOutputStream(),true);

            Scanner scanner = new Scanner(System.in);
            String commandString;
            String response;

            do {
                System.out.println("Enter Command: ");
                commandString = scanner.nextLine();
                stringToCommand.println(commandString);
                if(!commandString.equals("logout")) {
                    response = command.readLine();
                    System.out.println(response);
                }

            } while (!commandString.equals("logout"));

        } catch (IOException e) {
            System.out.println("Client Error: "+ e.getMessage());
        }
    }

}