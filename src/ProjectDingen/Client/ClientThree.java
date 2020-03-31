package ProjectDingen.Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientThree {
    public static void main(String[]args) {
        DataOutputStream toServer = null;
        DataInputStream fromServer = null;
        Scanner scanner = new Scanner(System.in);

        try {
            // Create a socket to connect to the server
            Socket socket = new Socket("localhost", 7789);
            // Socket socket = new Socket("130.254.204.36", 8000);
            // Socket socket = new Socket("drake.Armstrong.edu", 8000);

            // Create an input stream to receive data from the server
            fromServer = new DataInputStream(socket.getInputStream());

            // Create an output stream to send data to the server
            toServer = new DataOutputStream(socket.getOutputStream());
            String command = "";
            System.out.println("Enter command");
            command = scanner.nextLine();
            while (!command.equals("logout"))
            {
            toServer.writeBytes(command);
            toServer.flush();
            String response = fromServer.readLine();

            while (!(response.equals(null))) {
                response = fromServer.readUTF();
                System.out.println(response);
            }
            }
        } catch (IOException ex) {
           System.out.println(ex.getMessage());
        }
    }
}
