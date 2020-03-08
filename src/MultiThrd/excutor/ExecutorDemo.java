package MultiThrd.excutor;

import java.util.concurrent.*;

public class ExecutorDemo {

    public static void main(String[] args) {
        // Create a fixed thread pool with maximum three threads
        ExecutorService executor = Executors.newFixedThreadPool(3);
        ExecutorService ex = Executors.newCachedThreadPool();
        // Submit runnable tasks to the executor
        executor.execute(new PrintChar('a', 100));
        executor.execute(new PrintChar('b', 100));
        executor.execute(new PrintNum(100));
        //Things i'm trying myself:
        ex.execute(new PrintChar('j',100));
        ex.execute(new PrintChar('o',100));
        ex.execute(new PrintChar('z',100));
        // Shut down the executor
        executor.shutdown();

//
//        if (ex.isTerminated()) {
//            System.out.println("ex is terminated");
//        } else if (ex.isShutdown()) {
//            System.out.println("ex is Shutdown");
//        }


        ex.shutdown();


//        if (ex.isTerminated()) {
//            System.out.println("ex is terminated");
//        } else if (ex.isShutdown()) {
//            System.out.println("ex is Shutdown");
//        }
    }
}

class PrintChar implements Runnable {

    private char toPrint;
    private int times;

    public PrintChar(char c, int t) {
        toPrint = c;
        times = t;
    }

    @Override
    public void run () {
        for (int i = 0; i < times; i++) {
            System.out.print(toPrint);
            // !! I added this my self !!
            if (i == times/2) {
                System.out.println(" ");
            }

        }

    }


}

// This task class for printing numbers from 1 to n
class PrintNum implements Runnable {

    private int lastNum;

    public PrintNum(int n) {
        lastNum = n;

    }

    public void run () {
        for (int i = 0; i < lastNum; i++) {
            System.out.print(" "+ i);

        }
    }

}