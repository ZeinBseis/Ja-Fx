package GameClient;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main (String[]args) throws InterruptedException {
//        RunCommand com = new RunCommand();
        Connector connector = new Connector("localhost", 7789);
        Connector connector1 = new Connector("localhost",7789);
//        RunCommand.runThis("login","King",connector.getSocket());
//        String x = com.runThis("get","playerlist",connector.getSocket());
//        System.out.println(x);
//        String y = CommandHandler.handle(x);
//        System.out.println(y);
//        System.out.println(Arrays.toString(CommandHandler.toArray(y)));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Who would you like to challenge?");
//        String challenge = scanner.nextLine();
//        System.out.println("in which game?");
//        String game = scanner.nextLine();
        SendToServer.sendThis("login", "me",connector.getSocket());

        Thread.sleep(5000);
        SendToServer.sendThis("get","playerlist",connector.getSocket());
        String re = RecieveBasic.recieve(connector1.getSocket());
        System.out.println(re);

//        System.out.println(CommandHandler.handle(re));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Who do you want to challenge?");
//        String challenger = scanner.nextLine();
//        SendToServer.sendThis("challenge","\""+challenger+"\" \"Reversi\"",connector.getSocket());
//        String cha = RecieveChallenge.recieve(connector.getSocket());
//        System.out.println(cha);

    }
}
