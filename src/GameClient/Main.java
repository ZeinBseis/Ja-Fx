package GameClient;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main (String[]args) {
        RunCommand com = new RunCommand();
        Connector connector = new Connector("localhost", 7789);
        String x = com.runThis("get","gamelist",connector.getSocket());
        System.out.println(x);
        CommandHandler commandHandler = new CommandHandler();
        System.out.println(commandHandler.handle(x));
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}
