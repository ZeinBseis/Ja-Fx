package ProjectDingen.Three;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main (String[]args) {
        DataOutputStream toServer = null;
        DataInputStream fromServer = null;
        Scanner scanner = new Scanner(System.in);

        while (!scanner.equals("logout")) {
            try {
                Socket socket = new Socket("localhost", 7789);
                fromServer = new DataInputStream(socket.getInputStream());
                toServer = new DataOutputStream(socket.getOutputStream());
            } catch (IOException init) {
                System.err.println(init);
            }

            try {
                System.out.println("Enter Command");
                String command = scanner.next().trim();
                toServer.writeUTF(command);
                toServer.flush();
                String response = fromServer.readUTF();
                System.out.println(response);
            } catch (IOException send) {
                System.err.println(send);
            }


        }
    }

}
