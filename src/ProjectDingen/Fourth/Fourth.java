package ProjectDingen.Fourth;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Fourth {
    public static void main(String[]args) {
        try {
            Scanner in;
            PrintWriter out;

            Socket socket = new Socket("localhost", 7789);
            in = new Scanner(socket.getInputStream());
            out = new PrintWriter(socket.getOutputStream(), true);

            System.out.println("Enter Command");
            in.nextLine();

            while (in.hasNextLine()) {
                String line = in.nextLine();

                String res = out.toString();
                System.out.println(res);
            }
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }
}
