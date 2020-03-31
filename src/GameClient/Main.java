package GameClient;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main (String[]args) {
        RunCommand com = new RunCommand();
        Connector connector = new Connector("localhost", 7789);
        //String x = com.runThis("login","Zein",connector.getSocket());
        //TimeUnit.SECONDS.sleep(5);
        //System.out.println(x);
        String y = com.runThis("get playerlist","",connector.getSocket());
        System.out.println(y);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String x = com.runThis("login","Zein",connector.getSocket());
        System.out.println(x);
        y = com.runThis("get playerlist","",connector.getSocket());
        System.out.println(y);
//        String[] x = com.runThis("help","",connector.getSocket());

//        System.out.println(x[1]);

    }
}
