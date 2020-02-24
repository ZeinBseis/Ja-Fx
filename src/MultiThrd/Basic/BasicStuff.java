package MultiThrd.Basic;

public class BasicStuff {
    public static void main (String [] args) {
        System.out.println("running Outer class package");

        OtherThread other = new OtherThread();
        other.start();

        //using anonymous Thread class
        new Thread() {
            @Override
            public void run() {
                System.out.println("\u001b[31m" + "this is a test Anonymous class");
            }
        }.start();

    }
}
