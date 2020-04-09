package MultiThrd.Basic;

import java.util.Scanner;

public class BasicStuff {
    public static void main (String [] args) {
        System.out.println("running Outer class package");

        OtherThread other = new OtherThread();
        other.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("here");
        String x = scanner.nextLine();
        //using anonymous Thread class
        new Thread() {
            @Override
            public void run() {
                System.out.println("\u001b[31m" + "this is a test Anonymous class");
            }
        }.start();

        repeatMessage(x,100);


    }

    public static void repeatMessage(String string, int count) {
        Runnable r = () -> {
            for(int i=0; i<count; i++){
                System.out.println(string);
            }
        };
        new Thread(r).start();
    }
}
